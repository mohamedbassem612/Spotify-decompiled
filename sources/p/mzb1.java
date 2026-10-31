package p;

import android.os.Looper;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mzb1 implements rjp0, war0 {
    public final kdn0 a;
    public final Class b;
    public war0 d;
    public dbr0 e;
    public boolean f;
    public final LinkedHashSet c = new LinkedHashSet();
    public final lzb1 g = new lzb1(this);
    public final qpj0 h = new qpj0(this, (byte) 13);

    public mzb1(kdn0 kdn0Var, Class cls) {
        this.a = kdn0Var;
        this.b = cls;
    }

    public final dbr0 a() {
        dbr0 dbr0VarA;
        war0 war0Var = this.d;
        if (war0Var != null && (dbr0VarA = war0Var.a()) != null) {
            return dbr0VarA;
        }
        if (this.f) {
            return this.e;
        }
        return null;
    }

    public final void b(Object obj) {
        bbr0 bbr0Var = (bbr0) obj;
        war0 war0Var = this.d;
        qpj0 qpj0Var = this.h;
        if (war0Var != null) {
            war0Var.c(qpj0Var);
        }
        if (bbr0Var == null) {
            this.d = null;
            this.f = true;
            this.g.j(this.e);
        } else {
            war0 war0VarB0 = bbr0Var.b0(this.b);
            this.d = war0VarB0;
            if (war0VarB0 != null) {
                war0VarB0.d(qpj0Var);
            }
            this.f = false;
        }
    }

    public final void c(rjp0 rjp0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            eg.m("Cannot invoke removeObserver on a background thread");
        } else if (this.c.remove(rjp0Var)) {
            this.g.k(rjp0Var);
            rjp0Var.b((Object) null);
        }
    }

    public final void d(rjp0 rjp0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            eg.m("Cannot invoke observe on a background thread");
            return;
        }
        LinkedHashSet linkedHashSet = this.c;
        if (linkedHashSet.contains(rjp0Var)) {
            eg.m("The observer already observes this property, duplicates are not allowed");
        } else {
            linkedHashSet.add(rjp0Var);
            this.g.g(rjp0Var);
        }
    }
}
