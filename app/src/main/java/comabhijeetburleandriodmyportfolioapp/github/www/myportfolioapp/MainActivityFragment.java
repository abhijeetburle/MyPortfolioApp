package comabhijeetburleandriodmyportfolioapp.github.www.myportfolioapp;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View objView = inflater.inflate(R.layout.fragment_main, container, false);
        /* Add Listener for SPOTIFY STREAMER  */
        objView.findViewById(R.id.btnSpotifyStreamer).setOnClickListener(this);
        /* Add Listener for SCORES APP  */
        objView.findViewById(R.id.btnScoresApp).setOnClickListener(this);
        /* Add Listener for LIBRARY APP  */
        objView.findViewById(R.id.btnLibraryApp).setOnClickListener(this);
        /* Add Listener for BUILD IT BIGGER  */
        objView.findViewById(R.id.btnBuildItBigger).setOnClickListener(this);
        /* Add Listener for XYZ READER  */
        objView.findViewById(R.id.btnXYZReader).setOnClickListener(this);
        /* Add Listener for CAPSTONE: MY OWN APP  */
        objView.findViewById(R.id.btnMyOwnApp).setOnClickListener(this);

        return objView;
    }

    public void displayMessage(String text) {
        Context context = getContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if( v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }

    @Override
    public void onClick(View objView) {
        String message = null;
        switch (objView.getId()) {
            case R.id.btnSpotifyStreamer:
                message=getString(R.string.spotify_streamer);
                break;
            case R.id.btnScoresApp:
                message=getString(R.string.scores_app);
                break;
            case R.id.btnLibraryApp:
                message=getString(R.string.library_app);
                break;
            case R.id.btnBuildItBigger:
                message=getString(R.string.build_it_bigger);
                break;
            case R.id.btnXYZReader:
                message=getString(R.string.xyz_reader);
                break;
            case R.id.btnMyOwnApp:
                message=getString(R.string.my_own_app);
                break;
        }
        if(message!=null) {
            displayMessage("This button will launch " + message);
        }
    }
}
