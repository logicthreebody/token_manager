<template>
  <div id="">
    名称：{{name}}<br>
    供应量：{{totalSupply}}<br>
    <button @click="showTotalSupply">查看供应总量</button>
  </div>
</template>
<script>
export default {
  name:'Token',
  data(){
    return {
      name:'token001',
      symbol:'TOKEN001',
      totalSupply:10000,
      decimals:18
    }
  },
  methods:{
    showTotalSupply(){
      alert(this.totalSupply)
    }
  }
}
</script>
<style>


</style>