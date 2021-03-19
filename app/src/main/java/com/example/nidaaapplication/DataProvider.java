package com.example.nidaaapplication;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private List<UserModel> usersModelList;
    private UserModel currentUser;

    public static final String emergencyHotline = "9999";
    public static final String royalOmanPolice = "24521099";
    public static final String consumerProtectionAuthority = "80079009";
    public static final String socialInsurance = "80077600";

    private static DataProvider dataProviderProviderInstance = null;

    public static DataProvider getInstance(){
        if (dataProviderProviderInstance == null){
            dataProviderProviderInstance = new DataProvider();
        }
        return dataProviderProviderInstance;
    }



    public DataProvider() {
        usersModelList = new ArrayList<>();
        loadDataToArrayList();
    }

    private void loadDataToArrayList(){
        usersModelList.add(new UserModel("Lewis Adroit","0212312312","adroit@gmail.com","O+","abcd1234"));
        usersModelList.add(new UserModel("Wesley Alice","0312341234","alicewesley@gmail.com","A+","abcd1234"));
        usersModelList.add(new UserModel("beatrice@gmail.com","0842134213","beatrice@gmail.com","B+","abcd1234"));
        usersModelList.add(new UserModel("Bernice Mohamed","0123123123","bernicemoha@gmail.com","A-","derbbred"));
    }

    /**
     * Return 1 on sucess, 0 on fail
     * @param email
     * @param password
     * @return
     */
    public int fetchLoginData(String email, String password){
        int loginStatus = -1;
        for (UserModel usermodel:usersModelList) {
            if (usermodel.getEmail().equals(email) && usermodel.getPassword().equals(password)){
                //perform login
                loginStatus = 1;
                setCurrentUser(usermodel);
                break;
            }else{
                //login failed
                loginStatus = 0;
            }
        }
        return loginStatus;
    }

    /**
     * return 0 on fail
     * return 1 on success
     * @param userModel
     * @return
     */
    public int signUpUser(UserModel userModel){
        if(usersModelList.add(userModel)){
            setCurrentUser(userModel);
            return 1;
        }else {
            return 0;
        }
    }

    public UserModel getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(UserModel currentUser) {
        this.currentUser = currentUser;
    }
}
