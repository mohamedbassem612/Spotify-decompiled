package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p38(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                em3 em3Var = (em3) this.c;
                long j = this.b;
                t38 t38Var = (t38) em3Var.c;
                String str = zoi1.a;
                t38Var.z(j);
                break;
            default:
                gnd0 gnd0Var = (gnd0) this.c;
                long j2 = this.b;
                if (!gnd0Var.d) {
                    if (j2 > 0) {
                        long j3 = gnd0Var.f;
                        long j4 = j2 + j3;
                        if (j4 < j3) {
                            j4 = Long.MAX_VALUE;
                        }
                        gnd0Var.f = j4;
                        if (!gnd0Var.e) {
                            gnd0Var.e = true;
                            gnd0Var.c.f(gnd0Var.b, gnd0Var);
                        } else {
                            Object obj = gnd0Var.g;
                            if (obj != null) {
                                gnd0Var.b(obj);
                                gnd0Var.g = null;
                            }
                        }
                    } else {
                        gnd0Var.d = true;
                        if (gnd0Var.e) {
                            gnd0Var.c.k(gnd0Var);
                            gnd0Var.e = false;
                        }
                        gnd0Var.g = null;
                        gnd0Var.a.onError(new IllegalArgumentException("Non-positive request"));
                    }
                    break;
                }
                break;
        }
    }
}
