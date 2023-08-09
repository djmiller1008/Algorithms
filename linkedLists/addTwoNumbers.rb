def add_two_numbers(l1, l2)
    first = []
    second = []
    while true
        first << l1.val
        if l1.next == nil
            break
        else
            l1 = l1.next
        end
    end
    
    while true
        second << l2.val
        if l2.next == nil
            break
        else
            l2 = l2.next
        end
    end
    sum = first.reverse.join.to_i + second.reverse.join.to_i
    arr = sum.digits.reverse
    original_list = ListNode.new(arr.pop)
    current_list = original_list
    while arr.length > 0
        next_list = ListNode.new(arr.pop)
        current_list.next = next_list
        current_list = next_list            
    end
    return original_list
end

def reverse(string)
    string.reverse!
    
end

str = 'Madam, I’m Adam'
puts str
reverse(str)
puts str

# built