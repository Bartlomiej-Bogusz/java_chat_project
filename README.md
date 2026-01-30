# Aplikacja chat – Spring Boot

## 1. Opis projektu
Projekt przedstawia aplikację typu chat, opartą o architekturę klient–serwer. Aplikacja umożliwia tworzenie użytkowników, wysyłanie oraz odczytywanie wiadomości w czasie rzeczywistym poprzez REST API.

Aplikacja została zrealizowana w technologii **Spring Boot (Java 21)** z wykorzystaniem **bazy danych MySQL** oraz prostego interfejsu webowego w HTML i JavaScript.

---

## 2. Wykorzystane technologie
- Java 21
- Spring Boot
- Maven
- Spring Web (REST API)
- Spring Data JPA (Hibernate)
- MySQL
- HTML + JavaScript (frontend)
- Zewnętrzne REST API (losowe cytaty)

---

## 3. Architektura aplikacji

Aplikacja działa w architekturze **trójwarstwowej**:

1. **Frontend (HTML + JavaScript)**
   - Odpowiada za interakcję z użytkownikiem
   - Wysyła żądania HTTP do backendu

2. **Backend (Spring Boot)**
   - Udostępnia REST API
   - Komunikuje się z bazą danych

3. **Baza danych (MySQL)**
   - Przechowuje użytkowników oraz wiadomości


---

## 4. Operacje sieciowe i protokoły

Projekt spełnia wymaganie aplikacji obsługującej podstawowe operacje sieciowe:

- **HTTP** – komunikacja pomiędzy frontendem a backendem (REST API)
- **TCP** – protokół transportowy wykorzystywany przez HTTP oraz połączenie z bazą danych MySQL

Komunikacja klient–serwer odbywa się poprzez żądania HTTP typu GET, POST, PUT oraz DELETE.

---

## 5. Funkcjonalności aplikacji

- Logowanie użytkownika na podstawie nazwy (bez hasła)
- Automatyczne tworzenie użytkownika, jeśli nie istnieje
- Wysyłanie wiadomości
- Odczyt historii czatu
- Wyświetlanie czasu wysłania wiadomości
- Integracja z zewnętrznym API (losowy cytat)

---

## 6. REST API – CRUD

### Użytkownicy

**Logowanie / tworzenie użytkownika**
```
POST /api/users/login
```
Body:
```json
{
  "username": "user123"
}
```

---

### Wiadomości (pełny CRUD)

**CREATE – dodanie wiadomości**
```
POST /api/messages
```
```json
{
  "content": "Hello!",
  "sender": { "id": 1 }
}
```

**READ – pobranie wszystkich wiadomości**
```
GET /api/messages
```

**READ – pobranie jednej wiadomości**
```
GET /api/messages/{id}
```

**UPDATE – edycja wiadomości**
```
PUT /api/messages/{id}
```
```json
{
  "content": "Zmieniona treść"
}
```

**DELETE – usunięcie wiadomości**
```
DELETE /api/messages/{id}
```

---

## 7. Integracja z zewnętrznym API

Aplikacja została zintegrowana z publicznym zewnętrznym API dostarczającym losowe cytaty.

- Backend pobiera dane z zewnętrznego serwisu
- Dane są udostępniane frontendowi przez REST API
- Cytat wyświetlany jest na dole strony czatu

Integracja realizowana jest poprzez żądanie HTTP GET.

---

## 8. Interfejs użytkownika

- `login.html` – strona logowania (podanie nazwy użytkownika)
- `chat.html` – strona czatu z listą wiadomości

---

## 9. Instrukcja uruchomienia

1. Utworzyć bazę danych MySQL:
```sql
CREATE DATABASE chatdb;
```

2. Skonfigurować plik `application.properties`

3. Uruchomić aplikację Spring Boot

4. Otworzyć w przeglądarce:
```
http://localhost:8080/login.html
```

