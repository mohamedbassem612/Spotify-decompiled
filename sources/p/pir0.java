package p;

import com.spotify.messages.UbiExpr1Heartbeat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pir0 implements wwn0 {
    public final x8h1 a;
    public final s8h1 b;
    public final vo5 c;

    public pir0(x8h1 x8h1Var, s8h1 s8h1Var, vo5 vo5Var) {
        this.a = x8h1Var;
        this.b = s8h1Var;
        this.c = vo5Var;
    }

    @Override // p.wwn0
    public final void a(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, Set set, String str) {
        LinkedHashMap linkedHashMapU = f0o1.u(set);
        vo5 vo5Var = this.c;
        w8h1 w8h1Var = new w8h1(rj41Var, hwn0Var, hwn0Var2, nsn0Var, list, list2, l, linkedHashMapU, str, new y5h1(vo5Var.a, vo5Var.c));
        x8h1 x8h1Var = this.a;
        int iC = l1d.C(x8h1Var.e);
        if (iC == 0) {
            x8h1Var.d.add(w8h1Var);
        } else if (iC == 1) {
            x8h1Var.b(w8h1Var);
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            x8h1Var.a(w8h1Var);
        }
        if (rj41Var == rj41.MAIN) {
            bsn0 bsn0Var = bsn0.a;
            s8h1 s8h1Var = this.b;
            if (bsn0Var == nsn0Var) {
                synchronized (s8h1Var.f) {
                    if (((r8h1) s8h1Var.d.get()).a && !s8h1Var.e.isDisposed()) {
                        s8h1Var.e.dispose();
                    }
                }
                return;
            }
            y6r0 y6r0Var = hwn0Var.a;
            synchronized (s8h1Var.f) {
                try {
                    if (((r8h1) s8h1Var.d.get()).a) {
                        if (!s8h1Var.e.isDisposed()) {
                            s8h1Var.e.dispose();
                        }
                        String str2 = y6r0Var != null ? y6r0Var.a : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        long jB = s8h1Var.c.b();
                        d7h1 d7h1VarN = UbiExpr1Heartbeat.n();
                        d7h1VarN.n(((r8h1) s8h1Var.d.get()).b);
                        d7h1VarN.r(str2);
                        d7h1VarN.q(jB);
                        s8h1Var.a((UbiExpr1Heartbeat) d7h1VarN.build());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
