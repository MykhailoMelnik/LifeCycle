const currentYear = new Date().getFullYear();
const select = document.getElementById("yearOfBirth");

for (let year = currentYear; year >= 1900; year--) {
    const option = document.createElement("option");
    option.value = year;
    option.text = year;
    select.add(option);
}
