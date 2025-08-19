function display_names_that_likes_this(array){
check_other_length = array.length - 2
if(array.length == 0){
	return 'No one likes this'
	}
if(array.length == 1){
	return array + ' likes this'}
if(array.length == 2){
	return array[0] + ' and ' + array[1] + ' likes this'
	}
if(array.length == 3){
	return array[0] + ',' + array[1] + ' and ' + array[2] + ' likes this'
	}
if(array.length > 3){
	return array[0] + ',' + array[1] + ' and ' + check_other_length + ' others likes this'
	}
}
words = ['Peter','Amaka','Jon','Frank','Nonso','Frida','Graham','Kinky']
console.log(display_names_that_likes_this(words))
