<template>
<div class="transfer_div">
  from:{{from}}===>to:{{to}}transfer amount:{{amount}}
</div>
</template>

<script>
export default {
  name: "Transfer",
  data(){
    return {
      from:'0x',
      to:'0x123456',
      amount:666
    }
  }
}
</script>

<style scoped>
#transfer_div{
  background-color: beige;
}
</style>