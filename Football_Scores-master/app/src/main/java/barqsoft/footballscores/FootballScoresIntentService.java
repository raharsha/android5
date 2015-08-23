package barqsoft.footballscores;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by harsha on 8/14/15.
 */
public class FootballScoresIntentService extends IntentService{
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public FootballScoresIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
