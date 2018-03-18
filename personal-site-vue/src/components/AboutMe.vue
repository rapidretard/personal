<template>
  <div>
    <navbar></navbar>
    <div id="imgdiv">
    </div>
    <div class="verticalLine" id="aboutme">
      <img id="myimg" src="https://secure.gravatar.com/avatar/8302a2efc8d4f2c2cddea95e5b7ecdce?s=100"/>
      <h1>shiveen pandita</h1>
      <p>Hi, I'm Shiveen. I'm a developer and generally consider myself as a lifelong learner. I created this website as
        my own little personal space on the web and usually spend time here writing about things that interest me.
      </p>
      <p>
        I started off working with old 8086 microcontrollers and trying to make them do stuff for me using assembly.
        Then got bored and moved on to working with Matlab and spent some time working on developing simulations for P2P
        dynamic networks between vehicles for collision avoidance. Moved on to building micro-services using
        predominantly Java and Angular for enterprise space. I currently spend my time in the last role and also pursue
        personal interests, programming and non-programming related outside of work.
      </p>
      <h5>experience</h5>
      <ul>
        <li>
          Experienced Java developer with over 4 years of experience in Spring and related technologies
        </li>
        <li>
          Almost 2 years of experience in Angular (starting from AngularJS)
        </li>
        <li>
          Proficient in Python, VueJS(what this site is built on) and a bit of bash glue scripting
        </li>
      </ul>
      <h5>education</h5>
      <ul>
        <li>
          M.EngSc in Telecommuncation Engineering, University of New South Wales, Australia, 2014
        </li>
        <li>
          B.Eng in Telecommuncation Engineering, DCRUST, India, 2012
        </li>
      </ul>
      <h5>interests</h5>
      <p>reading : bouldering : hiking</p>
    </div>
  </div>
</template>

<script>
  import Navbar from "./NavBar";

  export default {
    components: {Navbar},
    name: 'aboutme'
  }
</script>

<style scoped>
  #aboutme {
    margin: auto;
    width: 50%;
    padding: 10px;
  }

  #imgdiv {
    text-align: left;
  }

  #myimg {
    /*display: block;*/
    /*margin: 0 auto;*/
  }

  h5 {
    text-align: left;
    color: #a61eff;
  }

  .verticalLine {
    border-left: thin solid #aecff2;
  }

</style>
