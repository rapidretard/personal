<template>
  <div>
    <div>
      <blogs></blogs>
    </div>
    <div>
      <a href="/#/post" class="hyperlink">go</a>
    </div>
  </div>
</template>

<script>
  import Navbar from "./NavBar";
  import Blogs from "./Blogs";

  export default {
    components: {
      Blogs,
      Navbar},
    name: 'HelloWorld'
  }

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
