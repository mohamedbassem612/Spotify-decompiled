package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h2f0 implements o5s {
    public final k1f0 a;
    public final wwf0 b;
    public final boolean c;
    public final uo5 d;
    public final ogr e;
    public final g1f0 f;
    public l7m0 g;

    public h2f0(k1f0 k1f0Var, x8c0 x8c0Var, wwf0 wwf0Var, boolean z, uo5 uo5Var, ogr ogrVar, g1f0 g1f0Var) {
        this.a = k1f0Var;
        this.b = wwf0Var;
        this.c = z;
        this.d = uo5Var;
        this.e = ogrVar;
        this.f = g1f0Var;
        x8c0Var.a(this);
    }

    public final void a(l7m0 l7m0Var) {
        this.g = l7m0Var;
    }

    public final void onStop(iac0 iac0Var) {
        CompositeDisposable compositeDisposable = this.b.e;
        int i = compositeDisposable.i();
        if (i > 0) {
            Logger.g(gvg.e(i, "MagicLinkRequestHandler onStop called with ", " active subscription(s), clearing"), new Object[0]);
        }
        compositeDisposable.g();
    }
}
