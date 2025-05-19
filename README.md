# Volleyball Match Tracking System

This project is a **Java-based Volleyball Match Tracking and Management System**. It allows both users and admins to interact with match data, view statistics, and manage schedules through a role-based interface.

## 🎯 Features

### For Users:
- **Login / Register** with email and password
- **View League Info**: Sultanlar Ligi, Efeler Ligi, League 2
- **Match Schedule**: Upcoming matches and past results
- **Top Scorers**: View top-performing players in each league
- **Statistics**: Access green card counts and other match stats

### For Admins:
- **Secure Login**
- **Add / Edit / Delete Matches**
- **Manage Users**: View and verify user data
- **Update Statistics**: Including green card stats
- **Export User Data**: Save user info (like national IDs) to files

## 🗃️ Database Structure (MySQL)

- `kullanici`: Stores user info (email, password, username)
- `admin`: Stores admin credentials
- `sultanlarLigi`, `efelerLigi`, `lig2`: Match and score info by league
- `takvim`: Match schedule (date, location, teams)
- `puanTablosu`: Team rankings (wins, losses, draws)
- `istatistik`: Player stats (name, club, position)
- `yesilKartSayisi`: Green card counts by player

## 🛠️ Technologies Used
- Java (Swing / Console-based)
- MySQL
- File I/O (for data backup/export)
- OOP principles (Object-Oriented Programming)

## 📌 Project Goals
To provide a user-friendly, real-time platform for tracking volleyball matches, ensuring fans and admins can easily access and manage up-to-date match and player information.

---

Feel free to fork, use, or contribute to this project!
