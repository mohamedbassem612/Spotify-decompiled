package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ab00 extends q8n {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public n36 e;

    public final q8n M(int i) {
        buo1.u(i);
        return this;
    }

    public final void N(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void R(xfu xfuVar) {
        n36 n36Var = this.e;
        if (n36Var == null) {
            n36Var = new n36();
            this.e = n36Var;
        }
        n36Var.addLast(xfuVar);
    }

    public long S() {
        n36 n36Var = this.e;
        return (n36Var == null || n36Var.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void T(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public final boolean V() {
        return this.c >= 4294967296L;
    }

    public final boolean X() {
        n36 n36Var = this.e;
        if (n36Var != null) {
            return n36Var.isEmpty();
        }
        return true;
    }

    public abstract long Y();

    public final boolean Z() {
        xfu xfuVar;
        n36 n36Var = this.e;
        if (n36Var == null || (xfuVar = (xfu) n36Var.p()) == null) {
            return false;
        }
        xfuVar.run();
        return true;
    }

    public abstract void shutdown();
}
