package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.artist.creatorcommon.view.ArtistBiographyImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vva extends e711 {
    public final gw70 U0;
    public final ArtistBiographyImageView V0;

    /* JADX WARN: Illegal instructions before constructor call */
    public vva(ViewGroup viewGroup, Context context, gw70 gw70Var) {
        View viewInflate = LayoutInflater.from(context).inflate(2131624059, viewGroup, false);
        super(viewInflate);
        this.U0 = gw70Var;
        this.V0 = (ArtistBiographyImageView) viewInflate.findViewById(2131427596);
    }

    public final void E(int i, Object obj) {
        this.V0.a((hq70) obj, this.U0);
    }
}
