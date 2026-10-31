package p;

import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class arl {
    public final ConstraintLayout a;
    public final ArtworkView b;
    public final ArtworkShadow c;
    public final Space d;
    public final TextView e;

    public arl(ConstraintLayout constraintLayout, ViewStub viewStub, ArtworkView artworkView, ArtworkShadow artworkShadow, Space space, ViewStub viewStub2, TextView textView) {
        this.a = constraintLayout;
        this.b = artworkView;
        this.c = artworkShadow;
        this.d = space;
        this.e = textView;
    }
}
