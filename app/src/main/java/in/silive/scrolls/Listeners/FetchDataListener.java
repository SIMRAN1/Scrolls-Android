package in.silive.scrolls.Listeners;

import org.json.JSONException;

/**
 * Created by AKG002 on 09-06-2016.
 */
public interface FetchDataListener {
    void preExecute();

    void postExecute(String result, int id) throws JSONException;
}