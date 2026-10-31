package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class v7n1 implements Runnable {
    public final bsd1 a;

    public v7n1() {
        this.a = null;
    }

    public void a(Exception exc) {
        bsd1 bsd1Var = this.a;
        if (bsd1Var != null) {
            bsd1Var.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public v7n1(bsd1 bsd1Var) {
        this.a = bsd1Var;
    }
}
