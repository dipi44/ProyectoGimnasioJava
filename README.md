# Proyecto: Gestión de Gimnasio

## 🏋️ Descripción general de las mejoras

Se han realizado las siguientes mejoras al proyecto original:
1. ✅ **Creación de la clase `Usuario`** para representar a cada persona registrada.
2. ✅ **Añadido método `listarUsuarios()`** en la clase `Gimnasio` para mostrar todos los usuarios registrados.

---

## 🔧 Justificación de los cambios

- La **clase `Usuario`** permite representar de forma más clara y extensible a cada usuario del gimnasio.
- El método **`listarUsuarios()`** mejora la funcionalidad del sistema al permitir al administrador consultar los inscritos actuales.
- Esto añade modularidad y prepara el sistema para futuras mejoras como historial, cuotas, etc.

---

## 📌 Instrucciones de uso

1. Compila ambos archivos:

```bash
javac Gimnasio.java Usuario.java
```

2. Ejecuta el programa:

```bash
java Gimnasio
```

3. Salida esperada:

```plaintext
Actividades disponibles en el gimnasio FitLife Gym:
- Yoga
- Boxeo
- Funcional
Usuario Juan Perez registrado en el gimnasio FitLife Gym.
Usuario Ana Gómez registrado en el gimnasio FitLife Gym.
Usuarios registrados en el gimnasio FitLife Gym:
- Juan Perez
- Ana Gómez
```

---

## 💾 Uso de GitHub

Este repositorio incluye:
- Al menos **un commit por mejora**:
  - `feat: Añadida clase Usuario para gestionar usuarios del gimnasio`
  - `feat: Añadido método listarUsuarios() en clase Gimnasio`
  - `docs: Añadido archivo README con descripción de mejoras e instrucciones`

---
