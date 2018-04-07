<template>
  <div>
    <!--<navbar></navbar>-->
    <i v-show="loading" class="fa fa-spinner"></i>
    <ul class="posts">
      <li v-for="blog in blogs">
        {{blog.title}}
      </li>
    </ul>
    <a href="/#/add-new-blog" class="btn btn-info" role="button">Add New Blog</a>
  </div>
</template>

<script>
  import Navbar from "./NavBar";
  import axios from 'axios';

  export default {
    components: {Navbar},
    name: "blogs",
    data() {
      return {
        blogs: null,
        loading: false
      }
    },
    methods: {
      getAllBlogPosts: function () {
        this.loading = true;
        axios.get('http://localhost:8080/api/blog/getAllBlogs')
          .then((response) => {
            this.blogs = response.data;
            console.log(data);
            this.loading = false;
          }).catch((err) => {
            console.log(err.message);
          this.loading = false;
        })
      }
    },
    mounted () {
      this.getAllBlogPosts();
    }
  }

</script>

<style scoped>
  .posts {
    margin-bottom: 40px;
    padding-left: 0;
    list-style-type: none;
  }
</style>
