import pandas as pd

def find_employees(employee: pd.DataFrame) -> pd.DataFrame:
    result=pd.DataFrame({})
    data=employee.merge(employee,left_on='managerId',right_on='id')
    result=data[data['salary_x']>data['salary_y']]
    result_1=result.rename(columns={'name_x':'Employee'})
    return result_1[['Employee']]
