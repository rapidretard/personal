<template>
  <navbar></navbar>
  <h2>New Blog Entry</h2>

  <form class="form-add" role="form">
    <div class="form-group">
      <label for="title">Title</label>
      <input type="text" name="title" class="form-control" id="title" placeholder="Enter Your Blog Title">
    </div>
    <div class="form-group">
      <label>Content</label>
      <vue-editor></vue-editor>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
  </form>
</template>

<script>
  import Navbar from "./NavBar";

  export default {
    components: {Navbar},
    name: "add-new-blog"
  }
</script>

<style scoped>

</style>
