<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>LIBRARY MANAGEMENT SYSTEM APPLICATION</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <style>
            body {
                background-color: darkgray;
            }
        </style>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" style="display: block; background-color: #212025;">
            <a style="float: left; width: 26%; padding: 10px; font-size: large; color: aliceblue;"
                href="/librarianHomepage">LIBRARY MANAGEMENT SYSTEM</a>
            <div
                style="float: left; width: 55%; padding: 10px; font-size: large; color: #212025; background-color: #212025;">
                <form action="/search" method="POST"><input type="text" name="searchText" id="searchText"
                        style="display: inline-block; width: 70%;" placeholder="Search Here"><input type="submit"
                        id="submit" style="display: inline-block;">
                </form>
            </div>
            <button
                style="float: right; width: 15%; padding: 10px; font-size: large; color: aliceblue; background-color: #212025;"
                onclick="window.location.href='/'">
                Logout</button>
        </nav>

        <h2 style="color: aliceblue;">Hi, ${currentLibrarian.firstName}</h2>
        <br><br><br>
        <table class="table" style="display: block; margin: auto; width: 50%; text-align: center;">
            <tr>
                <td>
                    <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;">ADD
                        DOCUMENT</button>
                    <table class="table" style="background-color: lightgrey;">
                        <tr>
                            <td><a href="/addBook">ADD BOOK</a></td>
                        </tr>
                        <tr>
                            <td><a href="/addMagazine">ADD MAGAZINE</a></td>
                        </tr>
                        <tr>
                            <td><a href="/addJournal">ADD JOURNAL</a></td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;" ">Delete Document</button>
                    <table class=" table" style="background-color: lightgrey;">
            <tr>
                <td>
                    <form action="/deleteDocument" method="POST">
                        <label for="document_type">CHOOSE DOCUMENT TYPE:</label>
                        <select style="color:black; display: inline-block;" id="document_type" name="document_type">
                            <option value="book">BOOK</option>
                            <option value="magazine">MAGAZINE</option>
                            <option value="journal">JOURNAL</option>
                        </select>
                        <input type="number" name="inputId" id="inputId" placeholder="2005">
                        <input type="submit" name="submit" value="SUBMIT">
                    </form>
                </td>
            </tr>
        </table>
        </td>
        </tr>
        <tr>
            <td>
                <button style="font-size: large; width: 100%; color: aliceblue; background-color: #212025;"
                    onclick="window.location.href='/UI/search_jobs.html'">Modify Document</button>
            </td>
        </tr>
        </table>
        <div>
            <footer style="position: absolute;bottom: 0;width: 100%;height: 2.5rem; background-color: #212025;">
                <div style="color: aliceblue; text-align: center;">
                    2022 Copyright:
                    <a href="/" style="color: aliceblue;">Librarian Application</a>
                </div>
            </footer>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>