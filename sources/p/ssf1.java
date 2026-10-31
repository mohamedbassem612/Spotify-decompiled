package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ssf1 {
    public final jsf1 a;
    public final i4q b;
    public final yhm c;
    public final bmf1 d;

    public ssf1(jsf1 jsf1Var, i4q i4qVar, yhm yhmVar, bmf1 bmf1Var) {
        this.a = jsf1Var;
        this.b = i4qVar;
        this.c = yhmVar;
        this.d = bmf1Var;
    }

    public final void a(dmf1 dmf1Var) {
        if (this.d.a.a()) {
            this.c.a(dmf1Var, (tv80) null);
        } else {
            c(dmf1Var, null);
        }
    }

    public final void b(dmf1 dmf1Var, tv80 tv80Var) {
        if (this.d.a.a()) {
            this.c.a(dmf1Var, tv80Var);
        } else {
            c(dmf1Var, tv80Var);
        }
    }

    public final void c(dmf1 dmf1Var, tv80 tv80Var) {
        mfm mfmVarA = this.b.a(dmf1Var.b);
        Observable observableD = this.a.d(dmf1Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableD, yon1.G1("CONTEXTMENU_TRACK", "contextmenu/track", 442, "contextmenu"), dmf1Var.f, tv80Var, 16);
    }
}
