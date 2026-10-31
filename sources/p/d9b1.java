package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.player.model.ContextTrack;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d9b1 extends e711 {
    public final gw70 U0;
    public final d0r V0;
    public final dv4 W0;
    public final ImageView X0;
    public final llm Y0;
    public xab1 Z0;
    public final o3r a1;

    /* JADX WARN: Illegal instructions before constructor call */
    public d9b1(LayoutInflater layoutInflater, gw70 gw70Var, d0r d0rVar, dv4 dv4Var, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131625334, viewGroup, false);
        super(viewInflate);
        this.U0 = gw70Var;
        this.V0 = d0rVar;
        this.W0 = dv4Var;
        this.X0 = (ImageView) viewInflate.findViewById(2131429612);
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.Y0 = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        this.a1 = w3p1.o(new l4r(new wlu(rc11.a.b(xkk1.class)), 1, v3b1.X, new j4r(v3b1.i), v3b1.Y), v3b1.t);
    }

    public final void E(int i, Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        xab1 xab1Var = this.Z0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Z0 = null;
        boolean zB = this.W0.b();
        ImageView imageView = this.X0;
        if (!zB || l4o1.C(contextTrack)) {
            String strR = l4o1.r(contextTrack);
            if (strR == null) {
                imageView.setImageResource(2131233988);
                return;
            }
            ixg ixgVarF = this.U0.f(strR);
            ixgVarF.l(2131233988);
            ixgVarF.k(imageView, (ird1) null);
            return;
        }
        imageView.setImageResource(2131233988);
        xab1 xab1Var2 = this.Z0;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.Z0 = null;
        this.Z0 = fn31.T(this.Y0, (o8n) null, 0, new sb91(this, contextTrack, null, (byte) 18), 3);
    }

    public final void H() {
        xab1 xab1Var = this.Z0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Z0 = null;
    }

    public final void I() {
        xab1 xab1Var = this.Z0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Z0 = null;
    }
}
