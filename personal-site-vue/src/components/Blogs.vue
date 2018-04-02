<template>
  <div>
    <navbar></navbar>
    <a href="/#/add-new-blog" class="btn btn-info" role="button">Add New Blog</a>
  </div>
</template>

<script>
  import Navbar from "./NavBar";

  export default {
    components: {Navbar},
    name: "blogs",

    data() {
      return {
        message: 'hello'
      }
    },
    computed: {}
  }

</script>

<style scoped>

</style>
