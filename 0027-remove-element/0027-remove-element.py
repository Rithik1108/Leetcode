class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i=0
        end=len(nums)-1
        while i<=end:
            if nums[i]==val:
                nums.pop(i)
                end-=1
            else:
                i+=1
        return len(nums)