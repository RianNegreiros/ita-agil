const submitButton = document.querySelector("#submit-button");
submitButton.addEventListener("click", function() {
  const books = document.querySelectorAll(".book");
  let booksRead = [];
  books.forEach(book => {
    const checkbox = book.querySelector("input");
    if (checkbox.checked) {
      const bookTitle = book.querySelector(".book-title").textContent;
      booksRead.push(bookTitle);
    }
  });
  console.log(`Books marked as read: ${booksRead.join(", ")}`);
});