# Проект автоматизации тестов для сайта компании [Tinkoff](https://www.tinkoff.ru)
<p align="center"><a href="https://www.tinkoff.ru"><img src="images/logos/Tinkoff.png" align="center" width="600" height="300"  alt="Java"/></a></p>

## 💻 What i use
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

## <img src="images/logos/Jenkins.svg" width="50" height="50"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/tinkoff_autotests_kpoludnitsyn_new/)

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

## <img src="images/logos/Allure.svg" width="50" height="50"/> [Allure](https://jenkins.autotests.cloud/job/Petyukov-Tinkoff-UI-Autotests/1/allure/) отчет

### Главная страница отчета

<p align="center">
<img src="images/screenshots/Allure.jpg" alt="Allure report" width="1000" height="400">
</p>


