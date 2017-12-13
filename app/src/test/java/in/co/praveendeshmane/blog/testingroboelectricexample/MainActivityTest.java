package in.co.praveendeshmane.blog.testingroboelectricexample;

/**
 * Created by Admin on 11-12-2017.
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(manifest=Config.NONE)
public class MainActivityTest
{
    private MainActivity activity;

    @Before
    public void setUp() throws Exception
    {
        activity = Robolectric.buildActivity(MainActivity.class )
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( activity );
    }

   /* @Test
    public void shouldHaveWelcomeFragment() throws Exception
    {
        assertNotNull( activity.getFragmentManager().findFragmentById( R.id.welcome_fragment ) );
    }*/
}
