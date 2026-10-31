package p;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.legacyglue.icons.SpotifyIconView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kni0 extends w611 {
    public final Context U0;
    public final FaceView V0;
    public final TextView W0;
    public final TextView X0;
    public final SpotifyIconView Y0;

    public kni0(View view) {
        super(view);
        this.U0 = view.getContext();
        this.V0 = (FaceView) view.findViewById(2131430371);
        this.W0 = (TextView) view.findViewById(2131430374);
        this.X0 = (TextView) view.findViewById(2131430370);
        this.Y0 = view.findViewById(2131430372);
    }
}
