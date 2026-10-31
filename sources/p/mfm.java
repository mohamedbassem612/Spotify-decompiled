package p;

import android.os.Looper;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mfm {
    public final lik1 a;
    public final dg30 b;
    public final h21 c;

    public mfm(lik1 lik1Var, dg30 dg30Var, h21 h21Var) {
        this.a = lik1Var;
        this.b = dg30Var;
        this.c = h21Var;
    }

    public static void b(mfm mfmVar, Observable observable, n6r0 n6r0Var, bjm bjmVar, tv80 tv80Var, int i) {
        if ((i & 4) != 0) {
            bjmVar = null;
        }
        mfmVar.getClass();
        mfmVar.a(yoi1.g(observable), n6r0Var, bjmVar, tv80Var);
    }

    public static void c(mfm mfmVar, kjm kjmVar, p6r0 p6r0Var, bjm bjmVar, tv80 tv80Var, int i) {
        if ((i & 2) != 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0Var = yon1.d1();
        }
        if ((i & 4) != 0) {
            bjmVar = null;
        }
        mfmVar.a(h4p1.m(kjmVar), p6r0Var, bjmVar, tv80Var);
    }

    public static /* synthetic */ void d(mfm mfmVar, mr20 mr20Var, p6r0 p6r0Var, bjm bjmVar, tv80 tv80Var, int i) {
        if ((i & 4) != 0) {
            bjmVar = null;
        }
        mfmVar.a(mr20Var, p6r0Var, bjmVar, tv80Var);
    }

    public final void a(mr20 mr20Var, n6r0 n6r0Var, bjm bjmVar, tv80 tv80Var) {
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            n57.e("This method must be called on the main thread.");
        }
        rfm rfmVar = (rfm) this.c.a();
        ofm ofmVar = new ofm(this.a, n6r0Var, bjmVar, tv80Var);
        rfmVar.k2.setValue(x4p1.h(mr20Var, new ew0(rfmVar, (lnm) null, (byte) 15)));
        rfmVar.l2.setValue(ofmVar);
        rfmVar.g1(this.b.e0(), "ContextMenuFragment");
    }
}
