const recipe = [
    {
      id: 1,
      title: "indian",
      category: "breakfast",
      recipe: "link",
      img: "lol not yet",
     
    },
    {
      id: 2,
      title: "thai",
      category: "lunch",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 3,
      title: "chinese",
      category: "dessert",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 4,
      title: "greek",
      category: "breakfast",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 5,
      title: "italian",
      category: "lunch",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 6,
      title: "japanese",
      category: "vergetarian",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 7,
      title: "korean",
      category: "breakfast",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 8,
      title: "mexican",
      category: "lunch",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 9,
      title: "french",
      category: "gluten-free",
      recipe: "link",
      img: "lol not yet",
      
    },
    {
      id: 10,
      title: "vietnamese",
      category: "dinner",
      recipe: "Link",
      img: "lol not yet",
      
    },
  ];
  const sectionCenter = document.querySelector(".section-center");
  const btnContainer = document.querySelector(".btn-container");
  // display all items when page loads
  window.addEventListener("DOMContentLoaded", function () {
    diplayMenuItems(recipe);
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
            </div>
          </article>`;
    });
    displayMenu = displayMenu.join("");
    // console.log(displayMenu);
  
    sectionCenter.innerHTML = displayMenu;
  }
                       ///////////////////////cancelled//////////////////////////////