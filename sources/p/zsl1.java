package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zsl1 {
    public static final fdn0 a;
    public static final xsl1[] b;

    static {
        fdn0 fdn0Var = new fdn0(8);
        xsl1.a.getClass();
        ysl1 ysl1Var = wsl1.g;
        fdn0Var.i(1, ysl1Var);
        ysl1 ysl1Var2 = wsl1.f;
        fdn0Var.i(2, ysl1Var2);
        ysl1 ysl1Var3 = wsl1.b;
        fdn0Var.i(4, ysl1Var3);
        ysl1 ysl1Var4 = wsl1.d;
        fdn0Var.i(8, ysl1Var4);
        ysl1 ysl1Var5 = wsl1.h;
        fdn0Var.i(16, ysl1Var5);
        ysl1 ysl1Var6 = wsl1.e;
        fdn0Var.i(32, ysl1Var6);
        ysl1 ysl1Var7 = wsl1.i;
        fdn0Var.i(64, ysl1Var7);
        ysl1 ysl1Var8 = wsl1.c;
        fdn0Var.i(128, ysl1Var8);
        a = fdn0Var;
        b = new xsl1[]{ysl1Var, ysl1Var2, ysl1Var3, ysl1Var7, ysl1Var5, ysl1Var6, ysl1Var4, wsl1.j, ysl1Var8};
    }

    public static final void a(v5f0 v5f0Var, s511 s511Var, long j, int i, int i2) {
        if (zxo1.t(j, -1L)) {
            return;
        }
        v5f0Var.a(s511Var.b, (int) ((j >>> 48) & 65535));
        v5f0Var.a(s511Var.c, (int) ((j >>> 32) & 65535));
        v5f0Var.a(s511Var.d, i - ((int) ((j >>> 16) & 65535)));
        v5f0Var.a(s511Var.e, i2 - ((int) (j & 65535)));
    }
}
