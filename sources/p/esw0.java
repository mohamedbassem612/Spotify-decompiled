package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class esw0 extends za91 {
    public final mdn0 d;
    public volatile rge1 e;
    public volatile rge1 f;

    public esw0(g9x g9xVar, int i, String str) {
        super(g9xVar, nsh.a.incrementAndGet());
        int i2 = a5f0.a;
        this.d = new mdn0(6);
        new nen0();
    }

    public rge1 c(long j, long j2, String str) {
        rge1 rge1Var;
        synchronized (this.d) {
            try {
                mdn0 mdn0Var = this.d;
                Object objD = mdn0Var.d(j);
                if (objD == null) {
                    rge1 rge1Var2 = new rge1(j, j2, str, this);
                    mdn0Var.g(j, rge1Var2);
                    objD = rge1Var2;
                }
                rge1Var = (rge1) objD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rge1Var;
    }
}
