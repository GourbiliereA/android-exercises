package fr.android.androidexercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Alex GOURBILIERE on 21/02/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    @Mock
    LoginActivity activity;

    @InjectMocks
    LoginPresenter loginPresenter;

    @Test
    public void password_should_be_valid() throws Exception {
        loginPresenter.checkCredentials("TestTest");

        Mockito.verify(activity).logged();
        Mockito.verify(activity).message(R.string.text_logged);
    }

}
