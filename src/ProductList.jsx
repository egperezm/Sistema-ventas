import React, { useEffect, useState } from "react";
import Swal from "sweetalert2";
import {
  getProducts,
  createProduct,
  updateProduct,
  deleteProduct,
} from "./ApiService";
import "./ProductList.css";

const ProductList = () => {
  const [products, setProducts] = useState([]);
  const [newProduct, setNewProduct] = useState({
    name: "",
    description: "",
    price: "",
  });
  const [editProduct, setEditProduct] = useState(null);
  const [isAdding, setIsAdding] = useState(false);

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    try {
      const data = await getProducts();
      setProducts(data);
    } catch (error) {
      console.error("Error fetching products:", error);
    }
  };

  const handleCreateProduct = async () => {
    if (!newProduct.name || !newProduct.description || !newProduct.price) {
      Swal.fire("Error", "Todos los campos son obligatorios", "error");
      return;
    }
    try {
      await createProduct(newProduct);
      setNewProduct({ name: "", description: "", price: "" });
      fetchProducts();
      Swal.fire("Éxito", "Producto creado exitosamente", "success");
      setIsAdding(false);
    } catch (error) {
      console.error("Error creating product:", error);
      Swal.fire("Error", "Error creando el producto", "error");
    }
  };

  const handleUpdateProduct = async (id) => {
    if (!editProduct.name || !editProduct.description || !editProduct.price) {
      Swal.fire("Error", "Todos los campos son obligatorios", "error");
      return;
    }
    try {
      await updateProduct(id, editProduct);
      setEditProduct(null);
      fetchProducts();
      Swal.fire("Éxito", "Producto actualizado exitosamente", "success");
    } catch (error) {
      console.error("Error updating product:", error);
      Swal.fire("Error", "Error actualizando el producto", "error");
    }
  };

  const handleDeleteProduct = async (id) => {
    const result = await Swal.fire({
      title: "¿Estás seguro?",
      text: "No podrás revertir esto",
      icon: "warning",
      showCancelButton: true,
      confirmButtonColor: "#d33",
      cancelButtonColor: "#3085d6",
      confirmButtonText: "Sí, eliminarlo",
    });

    if (result.isConfirmed) {
      try {
        await deleteProduct(id);
        fetchProducts();
        Swal.fire("Eliminado", "El producto ha sido eliminado", "success");
      } catch (error) {
        console.error("Error deleting product:", error);
        Swal.fire("Error", "Error eliminando el producto", "error");
      }
    }
  };

  return (
    <div className="flex items-center justify-center min-h-screen title-products">
      <div className="w-full max-w-6xl">
        <h1 className="text-center text-3xl mb-4">Productos</h1>
        <div className="overflow-auto lg:overflow-visible">
          <table className="table border-separate space-y-6 text-sm w-full">
            <thead>
              <tr>
                <th className="p-3">Nombre</th>
                <th className="p-3 text-left">Descripción</th>
                <th className="p-3 text-left">Precio</th>
                <th className="p-3 text-left">Acciones</th>
              </tr>
            </thead>
            <tbody>
              {products.map((product) => (
                <tr key={product.id}>
                  <td className="p-3">{product.name}</td>
                  <td className="p-3">{product.description}</td>
                  <td className="p-3 font-bold">${product.price}</td>
                  <td className="p-3">
                    <a className="mr-2" onClick={() => setEditProduct(product)}>
                      <i className="material-icons-outlined text-base">edit</i>
                    </a>
                    <a
                      className="ml-2"
                      onClick={() => handleDeleteProduct(product.id)}
                    >
                      <i className="material-icons-round text-base">
                        delete_outline
                      </i>
                    </a>
                  </td>
                </tr>
              ))}
              <tr>
                <td colSpan="4" className="p-3 text-center">
                  <a onClick={() => setIsAdding(true)}>
                    <i className="material-icons-outlined text-base">
                      add_circle_outline
                    </i>{" "}
                    Agregar Producto
                  </a>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
      {isAdding && (
        <div className="form-container">
          <h2 className="form-title">Agregar un nuevo Producto</h2>
          <div className="flex flex-col items-center">
            <input
              type="text"
              placeholder="Nombre"
              value={newProduct.name}
              onChange={(e) =>
                setNewProduct({ ...newProduct, name: e.target.value })
              }
              className="form-input"
            />
            <input
              type="text"
              placeholder="Descripción"
              value={newProduct.description}
              onChange={(e) =>
                setNewProduct({ ...newProduct, description: e.target.value })
              }
              className="form-input"
            />
            <input
              type="number"
              placeholder="Precio"
              value={newProduct.price}
              onChange={(e) =>
                setNewProduct({ ...newProduct, price: e.target.value })
              }
              className="form-input"
            />
            <div className="flex">
              <button
                className="form-button form-button-green"
                onClick={handleCreateProduct}
              >
                Agregar
              </button>
              <button
                className="form-button form-button-red"
                onClick={() => setIsAdding(false)}
              >
                Cancelar
              </button>
            </div>
          </div>
        </div>
      )}
      {editProduct && (
        <div className="form-container">
          <h2 className="form-title">Editar Producto</h2>
          <div className="flex flex-col items-center">
            <input
              type="text"
              placeholder="Nombre"
              value={editProduct.name}
              onChange={(e) =>
                setEditProduct({ ...editProduct, name: e.target.value })
              }
              className="form-input"
            />
            <input
              type="text"
              placeholder="Descripción"
              value={editProduct.description}
              onChange={(e) =>
                setEditProduct({ ...editProduct, description: e.target.value })
              }
              className="form-input"
            />
            <input
              type="number"
              placeholder="Precio"
              value={editProduct.price}
              onChange={(e) =>
                setEditProduct({ ...editProduct, price: e.target.value })
              }
              className="form-input"
            />
            <div className="flex">
              <button
                className="form-button form-button-blue"
                onClick={() => handleUpdateProduct(editProduct.id)}
              >
                Editar
              </button>
              <button
                className="form-button form-button-red"
                onClick={() => setEditProduct(null)}
              >
                Cancelar
              </button>
            </div>
          </div>
        </div>
      )}
    </div>
  );
};

export default ProductList;
