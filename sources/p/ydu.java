package p;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ydu extends yrd1 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydu(ig01 ig01Var) {
        super(l1d.n(ig01Var.m, " writer", new StringBuilder()), true);
        this.e = (byte) 2;
        this.f = ig01Var;
    }

    @Override // p.yrd1
    public final long a() {
        kf01 kf01Var;
        int i = 0;
        switch (this.e) {
            case 0:
                beu beuVar = (beu) this.f;
                synchronized (beuVar) {
                    if (beuVar.Z && !beuVar.N0) {
                        try {
                            beuVar.p();
                        } catch (IOException unused) {
                            beuVar.O0 = true;
                        }
                        try {
                            if (beuVar.g()) {
                                beuVar.m();
                                beuVar.t = 0;
                            }
                        } catch (IOException unused2) {
                            beuVar.P0 = true;
                            df01 df01Var = beuVar.h;
                            if (df01Var != null) {
                                w4n1.b(df01Var);
                            }
                            beuVar.h = sj1.f(sj1.e());
                        }
                    }
                    break;
                }
                return -1L;
            case 1:
                k7v k7vVar = (k7v) this.f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - k7vVar.b) + 1;
                kf01 kf01Var2 = null;
                kf01 kf01Var3 = null;
                long j2 = Long.MAX_VALUE;
                long j3 = j;
                int i2 = 0;
                for (kf01 kf01Var4 : (ConcurrentLinkedQueue) k7vVar.e) {
                    kf01Var4.getClass();
                    synchronized (kf01Var4) {
                        if (k7vVar.a(kf01Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j4 = kf01Var4.r;
                            if (j4 < j3) {
                                kf01Var2 = kf01Var4;
                                j3 = j4;
                            }
                            i++;
                            if (j4 < j2) {
                                kf01Var3 = kf01Var4;
                                j2 = j4;
                            }
                        }
                    }
                }
                if (kf01Var2 != null) {
                    kf01Var = kf01Var2;
                } else if (i > k7vVar.a) {
                    j3 = j2;
                    kf01Var = kf01Var3;
                } else {
                    j3 = -1;
                    kf01Var = null;
                }
                if (kf01Var == null) {
                    if (kf01Var3 != null) {
                        return (j2 + k7vVar.b) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return k7vVar.b;
                    }
                    return -1L;
                }
                synchronized (kf01Var) {
                    if (kf01Var.q.isEmpty() && kf01Var.r == j3) {
                        kf01Var.k = true;
                        ((ConcurrentLinkedQueue) k7vVar.e).remove(kf01Var);
                        z4n1.c(kf01Var.e);
                        if (((ConcurrentLinkedQueue) k7vVar.e).isEmpty()) {
                            ((hsd1) k7vVar.c).a();
                        }
                    }
                }
                return 0L;
            default:
                ig01 ig01Var = (ig01) this.f;
                try {
                    if (ig01Var.g()) {
                        return 0L;
                    }
                } catch (IOException e) {
                    ig01.c(ig01Var, e, null, 2);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydu(byte b, Object obj, String str) {
        super(str, true);
        this.e = b;
        this.f = obj;
    }
}
