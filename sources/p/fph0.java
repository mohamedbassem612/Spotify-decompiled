package p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fph0 {
    public final yge0 a;

    public fph0(Activity activity, gw70 gw70Var) {
        ArtworkView artworkViewInflate = LayoutInflater.from(activity).inflate(2131625209, (ViewGroup) null, false);
        if (artworkViewInflate == null) {
            bhn0.i("rootView");
            throw null;
        }
        ArtworkView artworkView = artworkViewInflate;
        yge0 yge0Var = new yge0(artworkView, artworkView, (byte) 19);
        artworkView.setViewContext(new f47(gw70Var));
        this.a = yge0Var;
    }
}
