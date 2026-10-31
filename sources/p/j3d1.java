package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class j3d1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m3d1 b;

    public /* synthetic */ j3d1(m3d1 m3d1Var, byte b) {
        this.a = b;
        this.b = m3d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        m3d1 m3d1Var = this.b;
        switch (b) {
            case 0:
                m3d1Var.b();
                break;
            case 1:
                m3d1Var.a();
                break;
            default:
                d4d1 d4d1Var = m3d1Var.r;
                if (d4d1Var != null) {
                    d4d1Var.d();
                }
                if (m3d1Var.q == null) {
                    mzc mzcVar = m3d1Var.f90p;
                    mzcVar.d = true;
                    pzc pzcVar = mzcVar.b;
                    if (pzcVar != null && pzcVar.b.cancel(true)) {
                        mzcVar.a = null;
                        mzcVar.b = null;
                        mzcVar.c = null;
                        break;
                    }
                }
                break;
        }
    }
}
