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
                href="/homepage">LIBRARY MANAGEMENT SYSTEM</a>
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

        <h2 style="color: aliceblue;">Hi, ${currentMember.firstName}</h2>
        <br><br><br>
        <section
            style="display: block; margin: auto; width: 50%; background-color: #212025; color: aliceblue; border-radius: 2%;">
            <form style="display: block; padding: 2%;" action="/searchResults" method="POST">
                <div class="form-group">
                    <label for="document_title">DOCUMENT TITLE</label>
                    <input type="String" class="form-control" name="document_title" id="document_title"
                        placeholder="DATABASE">
                </div>
                <div class="form-group">
                    <label for="author_name">AUTHOR NAME</label>
                    <input type="String" class="form-control" name="author_name" id="author_name"
                        placeholder="RISHIT">
                </div>
                <div class="form-group">
                    <!-- <label for="author_name">AUTHOR NAME</label>
                    <input type="String" class="form-control" name="author_name" id="author_name" placeholder="DATABASE"> -->
                    <label for="document_type">CHOOSE DOCUMENT TYPE:</label>
                    <select style="color:black" id="document_type" name="document_type">
                        <option value="all">ALL</option>
                        <option value="book">BOOK</option>
                        <option value="magazine">MAGAZINE</option>
                        <option value="journal">JOURNAL</option>
                    </select>
                </div>

                <button type="submit" id="submit" class="btn btn-primary">SEARCH</button>
            </form>
        </section>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>