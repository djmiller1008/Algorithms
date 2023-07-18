def remove_nth_from_end(head, n)
    fast = head
    slow = head

    n.times do 
        fast = fast.next 
    end

    return head.next if !fast 

    while fast.next
        fast = fast.next
        slow = slow.next
    end
    slow.next = slow.next.next 
    head
end