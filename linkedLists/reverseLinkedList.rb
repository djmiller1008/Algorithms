def reverse_list(head)
    current = head
    prev = nil
    while (current != nil) do
        tmp = current.next
        current.next = prev
        prev = current
        current = tmp
    end
    prev
end