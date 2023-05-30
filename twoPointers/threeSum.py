
def threeSum(nums):
    answer = []
    for i in range(len(nums)):
        target = 0 - nums[i]
        hash = {}
        for j in range(i + 1, len(nums)):                
            if nums[j] in hash:
                ans = [hash[nums[j]], nums[j], nums[i]]
                ans.sort()
                if ans not in answer:
                    answer.append(ans)
            else:
                hash[target - nums[j]] = nums[j]

    return answer