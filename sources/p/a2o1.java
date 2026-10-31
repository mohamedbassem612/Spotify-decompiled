package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class a2o1 implements Runnable {
    public final bsd1 a;

    public a2o1() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            bsd1 bsd1Var = this.a;
            if (bsd1Var != null) {
                bsd1Var.c(e);
            }
        }
    }

    public a2o1(bsd1 bsd1Var) {
        this.a = bsd1Var;
    }
}
