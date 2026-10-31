package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pfp1 extends too1 {
    @Override // p.too1
    public final void A(rfp1 rfp1Var, rfp1 rfp1Var2) {
        rfp1Var.b = rfp1Var2;
    }

    @Override // p.too1
    public final boolean B(tfp1 tfp1Var, rfp1 rfp1Var, rfp1 rfp1Var2) {
        synchronized (tfp1Var) {
            try {
                if (tfp1Var.c != rfp1Var) {
                    return false;
                }
                tfp1Var.c = rfp1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.too1
    public final boolean C(tfp1 tfp1Var, lfp1 lfp1Var, lfp1 lfp1Var2) {
        synchronized (tfp1Var) {
            try {
                if (tfp1Var.b != lfp1Var) {
                    return false;
                }
                tfp1Var.b = lfp1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.too1
    public final rfp1 D(tfp1 tfp1Var) {
        rfp1 rfp1Var;
        rfp1 rfp1Var2 = rfp1.c;
        synchronized (tfp1Var) {
            try {
                rfp1Var = tfp1Var.c;
                if (rfp1Var != rfp1Var2) {
                    tfp1Var.c = rfp1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rfp1Var;
    }

    @Override // p.too1
    public final lfp1 E(tfp1 tfp1Var) {
        lfp1 lfp1Var;
        lfp1 lfp1Var2 = lfp1.d;
        synchronized (tfp1Var) {
            try {
                lfp1Var = tfp1Var.b;
                if (lfp1Var != lfp1Var2) {
                    tfp1Var.b = lfp1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lfp1Var;
    }

    @Override // p.too1
    public final boolean F(tfp1 tfp1Var, Object obj, Object obj2) {
        synchronized (tfp1Var) {
            try {
                if (tfp1Var.a != obj) {
                    return false;
                }
                tfp1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.too1
    public final void z(rfp1 rfp1Var, Thread thread) {
        rfp1Var.a = thread;
    }
}
