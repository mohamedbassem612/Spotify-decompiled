package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qud0 extends e711 {
    public final ViewGroup U0;
    public final gw70 V0;
    public final ViewGroup W0;
    public final ImageView X0;
    public final int Y0;
    public final int Z0;
    public final int a1;
    public final int b1;
    public final int c1;

    /* JADX WARN: Illegal instructions before constructor call */
    public qud0(ViewGroup viewGroup, gw70 gw70Var) {
        View viewF = e711.F(2131625155, viewGroup);
        super(viewF);
        this.U0 = viewGroup;
        this.V0 = gw70Var;
        this.W0 = J(viewGroup);
        this.X0 = (ImageView) viewF.findViewById(2131429612);
        this.Y0 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
        this.Z0 = viewGroup.getContext().getResources().getDisplayMetrics().heightPixels;
        this.a1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131167050);
        this.b1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131167051);
        this.c1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131167049);
    }

    public static ViewGroup J(View view) {
        return u890.j(view.getTag(), 2131430188) ? (ViewGroup) view : J((ViewGroup) view.getParent());
    }

    public final void E(int i, Object obj) {
        xap1.q(this.U0, new pud0(this, (ContextTrack) obj, (byte) 0));
    }
}
