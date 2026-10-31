package p;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bjn implements jxd1 {
    public final yse0 a;
    public final idd1 b = new idd1(lmm.Y);

    public bjn(yse0 yse0Var) {
        this.a = yse0Var;
    }

    @Override // p.jxd1
    public final void a(List list) {
        lo9 lo9Var = new lo9();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ugn ugnVar = (ugn) it.next();
            lo9Var.t(eqr0.u(ugnVar), eqr0.v(ugnVar));
        }
        ((FirebaseCrashlytics) this.b.getValue()).setCustomKeys(lo9Var.c());
    }

    @Override // p.jxd1
    public final void b(String str) {
        ((FirebaseCrashlytics) this.b.getValue()).log(this.a.a(str));
    }

    @Override // p.jxd1
    public final void c(Throwable th) {
        ((FirebaseCrashlytics) this.b.getValue()).recordException(th);
    }

    @Override // p.jxd1
    public final void d(ugn ugnVar) {
        ((FirebaseCrashlytics) this.b.getValue()).setCustomKey(eqr0.u(ugnVar), eqr0.v(ugnVar));
    }
}
