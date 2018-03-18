import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import AboutMe from '@/components/AboutMe'
import Blogs from '@/components/Blogs'

Vue.use(Router)
Vue.component(AboutMe)
export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/aboutme',
      name: 'AboutMe',
      component: AboutMe
    },
    {
      path: '/blogs',
      name: 'Blogs',
      component: Blogs
    }
  ]
})
