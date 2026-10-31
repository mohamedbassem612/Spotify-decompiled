package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y451 {
    public final ynb0 a;

    public y451(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final void a(String str) {
        g651 g651VarB;
        if (ihc1.y0(str) || (g651VarB = b()) == null) {
            return;
        }
        synchronized (g651VarB.a) {
            if (g651VarB.e) {
                return;
            }
            g651VarB.g = null;
            g651VarB.b(new yz41(str));
        }
    }

    public final g651 b() {
        g651 m231Var;
        try {
            m231Var = (g651) this.a.get();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }

    public final void c(String str, boolean z) {
        g651 g651VarB = b();
        if (g651VarB != null) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    str = null;
                    break;
                }
                char cCharAt = str.charAt(i);
                if (!eth.H(cCharAt) && cCharAt != 65532) {
                    break;
                } else {
                    i++;
                }
            }
            if (str == null) {
                str = "";
            }
            synchronized (g651VarB.a) {
                if (g651VarB.e) {
                    return;
                }
                if (str.length() == 0) {
                    if (!z && g651VarB.f) {
                        g651VarB.f = false;
                    }
                    return;
                }
                g651VarB.f = true;
                o051 o051Var = new o051(str, z);
                if (o051Var.equals(g651VarB.g)) {
                    return;
                }
                g651VarB.g = o051Var;
                g651VarB.b(o051Var);
            }
        }
    }

    public final void d(q151 q151Var) {
        if (q151Var instanceof k051) {
            c(((k051) q151Var).a, false);
            return;
        }
        if (q151Var instanceof j051) {
            c(((j051) q151Var).a, true);
            return;
        }
        if (q151Var instanceof dz41) {
            c(((dz41) q151Var).b, true);
            return;
        }
        if (q151Var instanceof r051) {
            c(((r051) q151Var).b, true);
            return;
        }
        if (q151Var instanceof q051) {
            c(((q051) q151Var).b, true);
            return;
        }
        if (q151Var instanceof e051) {
            c(((e051) q151Var).a, true);
            return;
        }
        if (q151Var instanceof v051) {
            a(((v051) q151Var).a.p());
            return;
        }
        if (q151Var instanceof a051) {
            a(((a051) q151Var).a);
            return;
        }
        if (q151Var instanceof lz41) {
            a(((lz41) q151Var).a);
            return;
        }
        if (q151Var.equals(gz41.a) || q151Var.equals(kz41.a) || q151Var.equals(pz41.a) || q151Var.equals(tz41.a) || q151Var.equals(b051.a) || q151Var.equals(d051.a) || q151Var.equals(p051.a) || q151Var.equals(x051.a) || q151Var.equals(z051.a) || q151Var.equals(b151.a) || q151Var.equals(n151.a) || (q151Var instanceof cz41) || (q151Var instanceof ez41) || (q151Var instanceof fz41) || (q151Var instanceof jz41) || (q151Var instanceof mz41) || (q151Var instanceof nz41) || (q151Var instanceof oz41) || (q151Var instanceof rz41) || (q151Var instanceof sz41) || (q151Var instanceof i151) || (q151Var instanceof xz41) || (q151Var instanceof c051) || (q151Var instanceof f051) || (q151Var instanceof i051) || (q151Var instanceof s051) || (q151Var instanceof t051) || (q151Var instanceof w051) || (q151Var instanceof y051) || (q151Var instanceof e151) || (q151Var instanceof g151) || (q151Var instanceof h151) || (q151Var instanceof j151) || (q151Var instanceof m151) || (q151Var instanceof uz41)) {
            return;
        }
        eg.o();
    }
}
