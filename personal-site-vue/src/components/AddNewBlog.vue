<template>
  <div>
    <!--<navbar></navbar>-->
    <div>
      <div>
        <a class="hyperlink" href="/#/blogs">back to posts</a>
      </div>
      <h2>New Blog Entry</h2>

      <form class="form-add" role="form">
        <div class="form-group">
          <label for="title"><strong>Title</strong></label>
          <input v-model="title" type="text" name="title" class="form-control" id="title"
                 placeholder="Enter Your Blog Title">
        </div>
        <div class="form-group editor">
          <textarea v-model="content" name="content" id="editor" class="editor"></textarea>
        </div>
        <div>
        </div>
        <button v-on:click="submitNewBlog()" class="btn btn-primary " type="submit">Submit</button>
      </form>
    </div>
  </div>
</template>

<script>
  import Navbar from "./NavBar";
  import axios from 'axios';
  import ClassicEditor from '@ckeditor/ckeditor5-build-classic'

  export default {
    components: {Navbar, ClassicEditor},
    name: "add-new-blog",
    data() {
      return {
        title: '',
        content: 'Most programmers agree that we don\'t read enough code. The interviews in Peter Seibel\'s book, “Coders at work” highlight a comical contradiction: almost all the programmers interviewed by Seibel recommend that others read code for fun, but none of them routinely do so themselves. Seibel even asked Hal Abelson (of SICP fame) directly about this phenomenon:'
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
    },
    mounted() {
      ClassicEditor
        .create( document.querySelector( '#editor' ) )
        .catch( error => {
          console.error( error );
        } );
    }
  }
</script>

<style scoped>
  .editor {
    width: auto !important;
    vertical-align: middle;
    horiz-align: center;
  }

  .editor textarea {
    resize: vertical;
  }
</style>
