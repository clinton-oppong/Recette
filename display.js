const recipe = [
    {
      id: 1,
      title: "Indian",
      category: "breakfast",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 2,
      title: "Thai",
      category: "lunch",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 3,
      title: "Chinese",
      category: "dessert",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 4,
      title: "Greek",
      category: "dinner",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 5,
      title: "Italian",
      category: "lunch",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 6,
      title: "Japanese",
      category: "vegetarian",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 7,
      title: "Korean",
      category: "breakfast",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 8,
      title: "Mexican",
      category: "lunch",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 9,
      title: "French",
      category: "gluten-free",
      recipe: "link",
      img: "lol not yet",
      desc: "",
    },
    {
      id: 10,
      title: "Vietnamese",
      category: "dinner",
      recipe: "Link",
      img: "lol not yet",
      desc: "",
    },
  ];
  // get parent element
  const sectionCenter = document.querySelector(".section-center");
  const btnContainer = document.querySelector(".btn-container");
  // display all items when page loads
  window.addEventListener("DOMContentLoaded", function () {
    diplayMenuItems(recipe);
    displayMenuButtons();
  });

  function diplayMenuItems(menuItems) {
    let displayMenu = menuItems.map(function (item) {
      // console.log(item);

      return `<article class="recipe-item">
            <img src=${item.img} alt=${item.title} class="photo" />
            <div class="item-info">
              <header>
                <h4>${item.title}</h4>
                <h4 class="recipe">${item.recipe}</h4>
              </header>
              <p class="item-text">
                ${item.desc}
              </p>
            </div>
          </article>`;
    });
    displayMenu = displayMenu.join("");
    // console.log(displayMenu);

    sectionCenter.innerHTML = displayMenu;
  }
  function displayMenuButtons() {
    const categories = recipe.reduce(
      function (values, item) {
        if (!values.includes(item.category)) {
          values.push(item.category);
        }
        return values;
      },
      ["all"]
    );
    const categoryBtns = categories
      .map(function (category) {
        return `<button type="button" class="filter-btn" data-id=${category}>
            ${category}
          </button>`;
      })
      .join("");

    btnContainer.innerHTML = categoryBtns;
    const filterBtns = btnContainer.querySelectorAll(".filter-btn");
    console.log(filterBtns);

    filterBtns.forEach(function (btn) {
      btn.addEventListener("click", function (e) {
        // console.log(e.currentTarget.dataset);
        const category = e.currentTarget.dataset.id;
        const menuCategory = recipe.filter(function (menuItem) {
          // console.log(menuItem.category);
          if (menuItem.category === category) {
            return menuItem;
          }
        });
        if (category === "all") {
          diplayMenuItems(recipe);
        } else {
          diplayMenuItems(menuCategory);
        }
      });
    });
  }
