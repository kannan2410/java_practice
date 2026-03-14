function duplicate(nums:Number[], val:Number):Number{
    let result = 0;
    for(let i=0; i<nums.length; i++){
        if(nums[i] !== nums[result]){
            nums[result] = nums[i];
            result+=1;
        }
    }
    return result;
}
console.log(duplicate([2,3,3,2],3))