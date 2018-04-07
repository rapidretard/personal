<template>
    <div>
      <h2>{{title}}</h2>
      <medium-editor :text='body' :options='options' custom-tag='h2'></medium-editor>
    </div>
</template>

<script>
  import editor from 'vue2-medium-editor'
    export default {
    components: {
      'medium-editor': editor
    },
      name: "post",
      data () {
      return {
        title: 'hewllo',
        body: 'Most programmers agree that we don\'t read enough code. The interviews in Peter Seibel\'s book, “Coders at work” highlight a comical contradiction: almost all the programmers interviewed by Seibel recommend that others read code for fun, but none of them routinely do so themselves. Seibel even asked Hal Abelson (of SICP fame) directly about this phenomenon:'
      }
      }
    }
</script>

<style scoped>

</style>
