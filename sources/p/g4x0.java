package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g4x0 implements l4h1 {
    public final w6x0 a;
    public final akq b;
    public final cbr0 c;

    public g4x0(w6x0 w6x0Var, akq akqVar, cbr0 cbr0Var) {
        this.a = w6x0Var;
        this.b = akqVar;
        this.c = cbr0Var;
    }

    public final /* bridge */ /* synthetic */ f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        return b(layoutInflater, viewGroup, bundle, (Observable) obj);
    }

    public final f4h1 b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Observable observable) {
        z6x0 z6x0Var;
        z6x0 z6x0VarB = null;
        if (bundle != null && (z6x0Var = (z6x0) jhc1.t(bundle, "profile_model", z6x0.class)) != null) {
            z6x0VarB = z6x0Var.b();
        }
        z6x0 z6x0Var2 = z6x0VarB;
        qq qqVar = (qq) this.b.a.c;
        o3x0 o3x0Var = (o3x0) ((ywp) qqVar.i).get();
        y3x0 y3x0Var = (y3x0) qqVar.c;
        n3x0 n3x0Var = (n3x0) qqVar.b;
        hvp0 hvp0Var = new hvp0(y3x0Var, (byte) 21);
        oxi0 oxi0VarC = qqVar.c();
        xfx xfxVar = (xfx) n3x0Var.p.get();
        c8o.l(xfxVar);
        af10 af10Var = (af10) n3x0Var.Q.get();
        c8o.l(af10Var);
        nfx nfxVar = new nfx(xfxVar.d, af10Var, (byte) 4);
        xfx xfxVar2 = (xfx) n3x0Var.p.get();
        c8o.l(xfxVar2);
        t8x t8xVar = new t8x(xfxVar2.f, (byte) 3);
        kt91 kt91Var = (kt91) n3x0Var.k.get();
        c8o.l(kt91Var);
        e7x0 e7x0Var = new e7x0(layoutInflater, viewGroup, this.c, z6x0Var2, o3x0Var, hvp0Var, oxi0VarC, nfxVar, t8xVar, kt91Var, xqu.a((jly0) qqVar.l));
        MobiusLoop.Builder builderA = this.a.a(observable);
        if (z6x0Var2 == null) {
            z6x0Var2 = new z6x0();
        }
        return new z3x0(Mobius.c(builderA, z6x0Var2, MainThreadWorkRunner.a()), e7x0Var);
    }
}
