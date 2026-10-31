package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hns implements kly0 {
    public final kly0 a;
    public final kly0 b;
    public final pm41 c;
    public final kly0 d;
    public final kly0 e;

    public hns(kly0 kly0Var, kly0 kly0Var2, pm41 pm41Var, kly0 kly0Var3, kly0 kly0Var4) {
        this.a = kly0Var;
        this.b = kly0Var2;
        this.c = pm41Var;
        this.d = kly0Var3;
        this.e = kly0Var4;
    }

    public final Object get() {
        return new gns((Executor) this.a.get(), (ijj0) this.b.get(), (haa0) this.c.get(), (c441) this.d.get(), (c441) this.e.get());
    }
}
