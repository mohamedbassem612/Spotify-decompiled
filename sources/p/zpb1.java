package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zpb1 implements ypb1 {
    public final uj7 a = new uj7(0);

    public final boolean j(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void r(int i) {
        uj7 uj7Var;
        int i2;
        do {
            uj7Var = this.a;
            i2 = uj7Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!uj7Var.compareAndSet(i2, i2 | i));
    }
}
