# Проект автоматизации тестов для сайта компании [Tinkoff](https://www.tinkoff.ru)
<p align="center"><a href="https://www.tinkoff.ru"><img src="images/logos/Tinkoff.png" align="center" width="600" height="300"  alt="Java"/></a></p>

## 💻 Что я использую
<p align="center">
<a href="https://www.java.com/"><img src="images/logos/Java.svg" width="50" height="50"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logos/Intelij_IDEA.svg" width="50" height="50"/></a>
<a href="https://www.github.com/"><img src="images/logos/Github.svg" width="50" height="50"/></a>
<a href="https://www.gradle.org/"><img src="images/logos/Gradle.svg" width="50" height="50"/></a>
<a href="https://www.junit.org/junit5/"><img src="images/logos/JUnit5.svg" width="50" height="50"/></a>
<a href="https://www.selenide.org/"><img src="images/logos/Selenide.svg" width="50" height="50"/></a>
<a href="https://www.aerokube.com/selenoid/"><img src="images/logos/Selenoid.svg" width="50" height="50"/></a>
<a href="https://www.jenkins.io/"><img src="images/logos/Jenkins.svg" width="50" height="50"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logos/Allure.svg" width="50" height="50"/></a>
<a href="https://www.qameta.io/"><img src="images/logos/AllureTestOps.svg" width="50" height="50"/></a>
<a href="https://www.atlassian.com/software/jira"><img src="images/logos/Jira.svg" width="50" height="50"/></a>
<a href="https://www.telegram.org/"><img src="images/logos/Telegram.svg" width="50" height="50"/></a>
</p>

---

## Содержание проекта

- <a href="#buildJenkins"> Cборка в Jenkins</a>
- <a href="#allureReport"> Пример Allure отчета</a>
- <a href="#integrationAllureTO"> Интеграция с Allure TestOps</a>
- <a href="#telegramReport"> Уведомления в телеграм с использованием бота</a>
- <a href="#video"> Видео запуска теста в Selenoid</a>


---

<a id="buildJenkins"></a>
## <img src="images/logos/Jenkins.svg" width="50" height="50"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Petyukov-Tinkoff-UI-Autotests/)

<p align="center">
<img src="images/screenshots/JenkinsBuild.jpg" alt="Jenkins Page" width="1000" height="350">
</p>


### Параметры сборки проекта

| Параметр        | Назначение                               |
|-----------------|------------------------------------------|
| REMOTE_URL      | Удаленный сервер для запуска тестов      |
| BROWSER         | Браузер для запуска                      |
| BROWSER_VERSION | Версия браузера                          |
| BROWSER_SIZE    | Разрешение экрана                        |
| BASE_URL        | Адрес сайта                              |
| TASK            | Опция выбора запуска определённых тестов |




##  Команды для запуска

### Локальный запуск

```
gradle clean test
```

### Удаленный запуск
```
clean
${TASK}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-DbaseUrl=${BASE_URL}
-DremoteUrl=${REMOTE_URL}
```

---

<a id="allureReport"></a>
## <img src="images/logos/Allure.svg" width="50" height="50"/> [Allure](https://jenkins.autotests.cloud/job/Petyukov-Tinkoff-UI-Autotests/1/allure/) отчет

### Главная страница отчета

<p align="center">
<img src="images/screenshots/Allure.jpg" alt="Allure report" width="1000" height="400">
</p>

### Тест-кейсы

<p align="center">
<img src="images/screenshots/AllureTestCase.jpg" alt="Test Case" width="1000" height="400">
</p>

### Графики

<p align="center">
<img src="images/screenshots/graphs1.jpg" alt="Allure-graph" width="1000" height="400">
</p>
<p align="center">
<img src="images/screenshots/Graphs2.jpg" alt="Allure-graph" width="1000" height="400">
</p>

---

<a id="integrationAllureTO"></a>
## <img src="images/logos/AllureTestOps.svg" width="50" height="50"/> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3798/dashboards)

### Dashboard

<p align="center">
<img src="images/screenshots/AllureTOdashboard.jpg" alt="TestOps dashboard" width="1000" height="400">
</p>


### Автоматизированные тест-кейсы

<p align="center">
<img src="images/screenshots/AllureTOtestCase.jpg" alt="TestOps test cases" width="1000" height="400">
</p>

### Запуск автоматизированных тестов в **TestOps**

<p align="center">
<img src="images/screenshots/AllureTOrunTests.jpg" alt="TestOps launch" width="1000" height="400">
</p>

### Запуск сборки из **Allure TestOps**

<p align="center">
<img src="images/screenshots/AllureTOLounches.jpg" alt="TestOps launches">
</p>

---

<a id="telegramReport"></a>
### Уведомление через чат бот

<p align="center">
<img src="images/screenshots/TelegramReport.jpg" alt="Telegram" width="500" height="750">
</p>

---

<a id="video"></a>
## <img src="images/logos/Selenoid.svg" width="50" height="50"/> Видео запуска теста в Selenoid

<p align="center">
<img src="images/gif/GifAutoTest.gif" alt="Selenoid video" width="800" height="400">
</p>
