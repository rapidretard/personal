<template>
  <div>
    <navbar></navbar>
    <div>
      <h2>New Blog Entry</h2>

      <form class="form-add" role="form">
        <div class="form-group">
          <label for="title"><strong>Title</strong></label>
          <input v-model="title" type="text" name="title" class="form-control" id="title"
                 placeholder="Enter Your Blog Title">
        </div>
        <div class="form-group">
          <label><strong>Content</strong></label>
          <vue-editor v-model="content" placeholder="Your awesome blog content goes here"></vue-editor>
        </div>
        <button v-on:click="submitNewBlog()" class="btn btn-primary " type="submit">Submit</button>
      </form>
    </div>
  </div>
</template>

<script>
  import Navbar from "./NavBar";
  import axios from 'axios';

  export default {
    components: {Navbar},
    name: "add-new-blog",
    data() {
      return {
        title: '',
        content: ''
      }
    },
    computed: {},
    methods: {
      submitNewBlog: function () {
        console.log('hello');
        axios.post('http://localhost:8080/api/blog/saveBlog', {
          title: this.title,
          body: this.content
        }).then((data) => {
          console.log("Blog save succesfully");
        }).catch((err) => {
          console.log(err);
        })
      }
    }
  }
</script>

<style scoped>
</style>
