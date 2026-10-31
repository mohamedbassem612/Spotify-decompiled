package p;

import android.view.View;
import com.spotify.creativeworkplatform.encore.elements.ArtworkShadow;
import com.spotify.creativeworkplatform.encore.elements.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oun implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArtworkShadow b;
    public final /* synthetic */ ArtworkView c;
    public final /* synthetic */ float d;

    public oun(View view, ArtworkShadow artworkShadow, ArtworkView artworkView, float f) {
        this.a = view;
        this.b = artworkShadow;
        this.c = artworkView;
        this.d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArtworkShadow artworkShadow = this.b;
        ArtworkView artworkView = this.c;
        artworkShadow.e = artworkView;
        artworkShadow.f = this.d;
        artworkShadow.d = true;
        aiq0.a(artworkView, new uu1(artworkView, artworkShadow, artworkView, (byte) 2));
    }
}
