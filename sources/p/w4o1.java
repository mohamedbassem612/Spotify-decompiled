package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class w4o1 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ u6o1 d;

    public w4o1(u6o1 u6o1Var, boolean z) {
        Objects.requireNonNull(u6o1Var);
        this.d = u6o1Var;
        this.a = q9w.b();
        this.b = q9w.c();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        u6o1 u6o1Var = this.d;
        if (u6o1Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            u6o1Var.b(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
