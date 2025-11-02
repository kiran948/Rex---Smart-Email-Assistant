# Rex — Smart Email Assistant (Chrome Extension)
![image alt](https://github.com/kiran948/Rex---Smart-Email-Assistant/blob/9cbdad698a2353cf301461e6a686a19f60b512d4/Screenshot%202025-11-02%20204906.png)


---

### Project Description 

Rex (Smart Email Assist) is an AI-powered Chrome extension designed to generate professional, context-aware email replies directly within Gmail. It uses Spring Boot as the backend and integrates the Gemini API to craft intelligent responses based on the email content and selected tone. I built this project to save time and improve productivity by automating the process of writing polished, personalized email replies with just one click.

---

### 🚀 Features


1. **AI-Powered Email Reply Generation** – Automatically creates professional and context-aware replies using the Gemini API.  
2. **Tone Customization** – Allows users to generate replies in different tones (e.g., professional, friendly, concise).  
3. **Seamless Gmail Integration** – Embeds directly into Gmail’s compose window as an “AI Reply” button for easy access.  
4. **One-Click Reply Creation** – Generates and inserts email responses instantly into the compose box with a single click.  
5. **Spring Boot Backend API** – Handles prompt processing, Gemini API communication, and response generation efficiently.  
6. **Real-Time Interaction** – Provides instant responses without the need to leave Gmail or refresh the page.  
7. **Cross-Origin Support** – Securely enables communication between the Chrome extension and backend server.  
8. **Lightweight and Easy to Use** – Simple installation and minimal UI for smooth user experience inside Gmail.

---

### ⚙️ Prerequisites

Before setting up **Rex (Smart Email Assist)**, make sure you have the following installed:

- **Java 21** or later  
- **Maven** (for building and running the Spring Boot backend)  
- **Git** (to clone the repository)  
- **Google Chrome** (to install and run the Chrome extension)  
- **Gemini API Key** (from Google AI Studio for connecting the backend to Gemini)


---

### 🛠️ Tech Stack

**Frontend (Chrome Extension)**
- JavaScript (Content Script Logic)
- HTML5 & CSS3 (Extension UI and Styling)

**Backend**
- Java (Core Language)
- Spring Boot (REST API Development)
- WebClient (for Gemini API integration)
- Lombok (for cleaner and concise code)

**AI Integration**
- Gemini API (for AI-powered email reply generation)

**Build & Dependency Management**
- Maven

**Database**
- No database used (stateless application)

---

### ❗❗❗ IMPORTANT

**Rex (Smart Email Assist)** is designed exclusively for **Google Chrome** as a browser extension.  
It uses **Google Gemini API** for generating AI-powered, context-aware email replies.

---

### 🚀 Gemini API Setup

1. Visit **[Google AI Studio](https://aistudio.google.com/app/apikey)**.  
2. Sign in with your Google account.  
3. Generate a **new Gemini API key**.

   **Option 1: Manual Setup**
   
      a. Copy the key and add it to your Spring Boot project:
         - Open your project’s `.env` or `application.properties` file.  
         - Add:
      ```
      GEMINI_KEY=your_api_key_here
      GEMINI_URL=https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent
      ```
      b. Restart your Spring Boot application to apply the changes.
   
   **Option 2: IntelliJ Run Configuration**
   
      a. Open your Spring Boot project in IntelliJ IDEA.  
      b. Go to **Run → Edit Configurations → Environment Variables**.  
      c. Add the following variables: (with a semicolon in between " ; ")
      ```
      GEMINI_KEY=your_api_key_here
      GEMINI_URL=https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent
      ```
      d. Save and run your application — IntelliJ will automatically inject these values into your Spring Boot environment.

 ![image alt](https://github.com/kiran948/Rex---Smart-Email-Assistant/blob/e6eeef7c78c670fcad3d1ef6f5880c3f471912f8/Screenshot%202025-11-02%20203748.png)

---

### 🧩 Chrome Extension Setup

1. Open **Google Chrome** → Go to `chrome://extensions/`.  
2. Turn on **Developer Mode** (toggle in the top-right corner).  
3. Click **Load unpacked** and select your project’s Chrome extension folder (the one with `manifest.json`).  
4. Open **Gmail** and start composing a message.  
5. You’ll see a new **“AI Reply”** button — click it to generate a professional AI-powered response!


---

### 🔗 Useful Links

- **Gemini API Documentation:** [https://ai.google.dev/](https://ai.google.dev/)  
- **Chrome Extension Developer Guide:** [https://developer.chrome.com/docs/extensions/](https://developer.chrome.com/docs/extensions/)


---

### 📁 Project Structure

![image alt](https://github.com/kiran948/Rex---Smart-Email-Assistant/blob/e6eeef7c78c670fcad3d1ef6f5880c3f471912f8/Screenshot%202025-11-02%20203343.png)
---

### ▶️ Setup & Installation

Below is a rough guide (adapt as needed for your implementation):

1. **Clone the repository**
   ```bash
   git clone https://github.com/kiran948/Rex---Smart-Email-Assistant.git
   cd Rex---Smart-Email-Assistant
