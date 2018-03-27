<template>
  <div>
    <navbar></navbar>
    <span>{{}}</span>
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
