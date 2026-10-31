package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class m4f1 {
    public static final long a;
    public static final float b;
    public static final rus c;

    static {
        long jC = jhc1.c(16.0f, 8.0f);
        a = jC;
        b = 200.0f;
        c = new rus(jC);
    }

    public static n5f1 a(b0k b0kVar, int i) {
        zzq0 zzq0Var = v4f1.a;
        x340 x340Var = (x340) b0kVar;
        int iI0 = ((wat) x340Var.k(t4k.h)).i0(4.0f);
        boolean zE = x340Var.e(iI0);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !x340Var.e(1)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zE | z;
        Object objT = x340Var.T();
        if (z2 || objT == fkj0.X) {
            objT = new n5f1(iI0);
            x340Var.s0(objT);
        }
        return (n5f1) objT;
    }
}
