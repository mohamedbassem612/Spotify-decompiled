package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ar70 extends vq70 {
    public final Executor T0;
    public final Object U0 = new Object();
    public zx70 V0;
    public zq70 W0;

    public ar70(Executor executor) {
        this.T0 = executor;
    }

    @Override // p.vq70
    public final zx70 a(ry70 ry70Var) {
        return ry70Var.c();
    }

    @Override // p.vq70
    public final void c() {
        synchronized (this.U0) {
            try {
                zx70 zx70Var = this.V0;
                if (zx70Var != null) {
                    zx70Var.close();
                    this.V0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.vq70
    public final void f(zx70 zx70Var) {
        synchronized (this.U0) {
            try {
                if (!this.S0) {
                    zx70Var.close();
                    return;
                }
                if (this.W0 != null) {
                    if (zx70Var.Q0().getTimestamp() <= this.W0.b.Q0().getTimestamp()) {
                        zx70Var.close();
                    } else {
                        zx70 zx70Var2 = this.V0;
                        if (zx70Var2 != null) {
                            zx70Var2.close();
                        }
                        this.V0 = zx70Var;
                    }
                    return;
                }
                zq70 zq70Var = new zq70(zx70Var, this);
                this.W0 = zq70Var;
                n8d0 n8d0VarB = b(zq70Var);
                mev mevVar = new mev(zq70Var, (byte) 26);
                n8d0VarB.b(new nx30((Object) n8d0VarB, (Object) mevVar, (byte) 0), n5u.a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
