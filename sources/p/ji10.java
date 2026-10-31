package p;

import android.os.Looper;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ji10 implements war0 {
    public final war0 a;
    public final war0 b;
    public final LinkedHashSet c = new LinkedHashSet();
    public final fai0 d = w6d1.h(new ii10(this));

    public ji10(war0 war0Var, war0 war0Var2) {
        this.a = war0Var;
        this.b = war0Var2;
    }

    @Override // p.war0
    public final dbr0 a() {
        dbr0 dbr0VarA = this.a.a();
        return dbr0VarA == null ? this.b.a() : dbr0VarA;
    }

    @Override // p.war0
    public final void c(rjp0 rjp0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            eg.m("Cannot invoke removeObserver on a background thread");
        } else if (this.c.remove(rjp0Var)) {
            this.d.k(rjp0Var);
            rjp0Var.b((Object) null);
        }
    }

    @Override // p.war0
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
            this.d.g(rjp0Var);
        }
    }
}
