package fr.android.androidexercises;

import android.view.View;

import org.assertj.android.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

/**
 * Created by Alex GOURBILIERE on 21/02/2017.
 */
@RunWith(CustomRobolectricTestRunner.class)
public class LoginActivityTest2 {
    LoginActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(LoginActivity.class);
    }

    @Test
    public void should_set_logged_state() throws Exception {
        // Given

        // When
        activity.logged();

        //Then
        Assertions.assertThat(activity.loginLayout).hasVisibility(View.GONE);
        Assertions.assertThat(activity.loggedText).isVisible();
    }
}
