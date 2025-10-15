# Rex — Smart Email Assistant

**Rex** (Reply Expert) is an AI-powered email companion built to reduce inbox overwhelm. It helps with:

- Generating context-aware draft replies  
- Auto-categorizing incoming emails  
- Summarizing long message threads  
- Enabling you to reach “inbox zero” faster  

---

## 🚀 Features

| Feature | Description |
|---|---|
| **Smart Reply Generation** | Rex analyses the thread context and drafts reply suggestions you can edit and send. |
| **Email Categorization** | Automatically categorizes emails (e.g. Personal, Work, Promotions) using AI. |
| **Thread Summarization** | Condenses long back-and-forth email threads into concise summaries. |
| **Context Awareness** | Maintains context of prior messages to improve suggestions over time. |
| **Only for Chrome Platform** | Designed with modularity so it can be integrated into chrome since its a chrome extension. |

---

## 🧩 Architecture & Tech Stack

- **Backend / Core Logic**  
  The heart of Rex is the AI / NLP engine that processes email content and generates outputs. (e.g. via Gemini API, or any LLM you integrate)  
- **Frontend / UI (if applicable)**  
  A user interface for viewing suggestions, editing replies, and managing categorized emails. (React, or plain web UI)  
- **Integration Layer / Connectors**  
  Modules that connect to email providers (e.g. Gmail API, IMAP, or others) to fetch messages and send replies.  
- **Data / State Management**  
  Caching, storing histories, user preferences, etc.

---

## 🛠️ Setup & Installation

Below is a rough guide (adapt as needed for your implementation):

1. **Clone the repository**
   ```bash
   git clone https://github.com/kiran948/Rex---Smart-Email-Assistant.git
   cd Rex---Smart-Email-Assistant
