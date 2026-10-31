package p;

import android.os.Looper;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q5t implements rjp0, war0 {
    public final kdn0 a;
    public final Class b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final p5t d = new p5t(this, (byte) 0);

    public q5t(kdn0 kdn0Var, Class cls) {
        this.a = kdn0Var;
        this.b = cls;
    }

    @Override // p.war0
    public final dbr0 a() {
        war0 war0VarB0;
        bbr0 bbr0Var = (bbr0) this.a.e();
        if (bbr0Var == null || (war0VarB0 = bbr0Var.b0(this.b)) == null) {
            return null;
        }
        return war0VarB0.a();
    }

    public final void b(Object obj) {
        bbr0 bbr0Var = (bbr0) obj;
        p5t p5tVar = this.d;
        if (bbr0Var != null) {
            p5tVar.m(bbr0Var.b0(this.b));
        } else {
            p5tVar.m((Object) null);
        }
    }

    @Override // p.war0
    public final void c(rjp0 rjp0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            eg.m("Cannot invoke removeObserver on a background thread");
            return;
        }
        rjp0 rjp0Var2 = (rjp0) this.c.remove(rjp0Var);
        if (rjp0Var2 == null) {
            return;
        }
        rjp0Var2.b((Object) null);
        this.d.k(rjp0Var2);
    }

    @Override // p.war0
    public final void d(rjp0 rjp0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            eg.m("Cannot invoke observe on a background thread");
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(rjp0Var)) {
            eg.m("the observer already observes this property, duplicates are not allowed");
            return;
        }
        jp5 jp5Var = new jp5(new p811(), rjp0Var, (byte) 3);
        linkedHashMap.put(rjp0Var, jp5Var);
        this.d.g(jp5Var);
    }
}
