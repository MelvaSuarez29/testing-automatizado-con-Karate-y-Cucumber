# 🧪 Testing Automatizado con Karate y Cucumber

Proyecto académico desarrollado para la asignatura **📚 Gestión de Proyectos de Software** en la **🏛 Escuela Politécnica Nacional (ESFOT)**.

---

## 👨‍🎓 Información del Proyecto

**👤 Estudiante:** Melva Patricia Suárez Casco  
**🎯 Tema:** Testing automatizado con Karate y Cucumber

---

## 📖 Descripción

Este proyecto implementa pruebas automatizadas sobre la API pública de Swagger Petstore utilizando:   
** Karate Framework**, ** Cucumber** y **☕ JUnit 5**.

El objetivo es validar de forma completa el ciclo de vida de un recurso (🐶 mascota) mediante pruebas REST encadenadas en un único escenario.

🌐 API utilizada:

https://petstore.swagger.io/

---

## 🎯 Objetivo

Automatizar pruebas funcionales de servicios REST validando:

✅ Creación de una mascota
🔍 Consulta de la mascota por ID
✏️ Actualización de datos de la mascota
📋 Consulta de la mascota por estado

Todo esto reutilizando variables dinámicas entre pasos.

---

## 🛠 Tecnologías utilizadas

* ☕ Java 21
* ⚙️ Gradle
* Karate Framework
* Cucumber Reports
* 🧪 JUnit 5
* 💻 IntelliJ IDEA

---

## 📋 Requisitos previos

Antes de ejecutar el proyecto asegúrate de tener instalado:

JDK 21  
IntelliJ IDEA  
Gradle  
Plugin Karate para IntelliJ  
Variable de entorno JAVA_HOME configurada

Verificar instalación:

```bash id="j39f8a"
java -version
gradle -v
```

## 📂 Estructura del proyecto

```plaintext id="m6p2qa"
testing-automatizado-con-Karate-y-Cucumber/
│── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── PetRunnerTest.java
│   │   └── resources/
│   │       ├── pet.feature
│   │       └── karate-config.js
│── build.gradle
│── README.md
```

---

## ⚙️ Configuración del proyecto

### 1️⃣ Clonar repositorio

```bash id="z9gk3w"
git clone https://github.com/MelvaSuarez29/testing-automatizado-con-Karate-y-Cucumber.git
```

Ingresar al proyecto:

```bash id="b2v7ne"
cd testing-automatizado-con-Karate-y-Cucumber
```

---

### 2️⃣ Instalar dependencias

Sincronizar Gradle:

```bash id="t8m5pl"
gradle build
```

---

## 🧪 Casos de prueba implementados

### 🐾 1. Añadir una mascota

Se realiza una petición **POST** para registrar una nueva mascota.

✔ Validaciones:

* Código HTTP 200
* ID generado correctamente
* Nombre asignado

---

### 🔎 2. Consultar mascota por ID

Se reutiliza el ID generado anteriormente para verificar su existencia.

✔ Validaciones:

* Código HTTP 200
* Datos correctos

---

### 3. Actualizar mascota

Se cambia:

* Nombre
* Estado a "sold"

✔ Validaciones:

* Código HTTP 200
* Datos actualizados correctamente

---

### 📌 4. Consultar mascota por estado

Se busca la mascota filtrando por estado.

✔ Validaciones:

* La mascota aparece en la lista
* Estado = sold
---

## 🔗 Variables dinámicas usadas

Karate permite encadenar datos mediante `def`.

## ▶️ Ejecución del proyecto

Para ejecutar las pruebas:

```bash id="u5l2kf"
gradle clean test
```

o:

```bash id="x4j7rm"
gradle clean build
```

---

## 📊 Reportes

Al finalizar la ejecución se genera automáticamente un reporte en:

```plaintext id="w9e6tn"
build/karate-reports/karate-summary.html
```

Este reporte permite visualizar:

✅ Casos exitosos
❌ Casos fallidos
📨 Request y Response
⏱ Tiempo de ejecución

---

## 🎓 Aprendizajes obtenidos
Durante el desarrollo de este taller se reforzaron conocimientos en:

🧪 Automatización de pruebas API
🌐 Validación de respuestas HTTP
🔄 Manejo de variables dinámicas
⚙️ Integración con Gradle
📊 Generación de reportes automáticos
🚀 Testing end-to-end
