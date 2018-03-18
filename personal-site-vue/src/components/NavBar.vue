<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/#/">SP</a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="/#/blogs">Blog<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/#/aboutme">About Me</a>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
  export default {
    name: "navbar"
  }
</script>

<style scoped>
  nav {
    margin-bottom: 2em;
  }
</style>
