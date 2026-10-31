package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class im51 {
    public final yqg a;
    public volatile cm51 b;
    public volatile dm51 c;

    public im51(yqg yqgVar) {
        this.a = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    public final hm51 a(int i, long j) {
        gm51 fm51Var;
        em51 em51Var = em51.a;
        long jE = this.a.e();
        cm51 cm51Var = this.b;
        dm51 dm51Var = null;
        if (cm51Var == null || cm51Var.c() != i || jE - cm51Var.b() > 600) {
            cm51Var = null;
        }
        if (cm51Var == null) {
            this.b = new cm51(jE, j, 1, i);
            return em51Var;
        }
        if (cm51Var.e() < 2) {
            this.b = cm51.a(cm51Var, cm51Var.e() + 1);
            return em51Var;
        }
        this.b = null;
        dm51 dm51Var2 = this.c;
        if (dm51Var2 == null) {
            fm51Var = new fm51(cm51Var.d());
        } else {
            if (dm51Var2.b() != i && jE - dm51Var2.a() <= 30000) {
                dm51Var = dm51Var2;
            }
            if (dm51Var != null) {
                fm51Var = new gm51(dm51Var.c());
            } else {
                fm51Var = new fm51(cm51Var.d());
            }
        }
        this.c = new dm51(i, cm51Var.d(), jE);
        return fm51Var;
    }
}
