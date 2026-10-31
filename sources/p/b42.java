package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b42 extends e711 {
    public final gw70 U0;
    public final ViewGroup V0;
    public final u601 W0;
    public final ViewGroup X0;
    public final ImageView Y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public b42(gw70 gw70Var, ViewGroup viewGroup, u601 u601Var, g3 g3Var) {
        View viewF = e711.F(2131624028, viewGroup);
        super(viewF);
        this.U0 = gw70Var;
        this.V0 = viewGroup;
        this.W0 = u601Var;
        this.X0 = mgo1.p(viewGroup);
        View viewN = b8k1.n(viewF, 2131427540);
        ImageView imageView = (ImageView) viewN;
        imageView.getClass();
        z8p1.v(imageView, 500, new jm1(g3Var, (byte) 8));
        this.Y0 = (ImageView) viewN;
    }

    public final void E(int i, Object obj) {
        ViewGroup viewGroup = this.V0;
        aiq0.a(viewGroup, new uu1(viewGroup, this, (ContextTrack) obj, (byte) 1));
    }
}
