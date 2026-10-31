package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x0h1 {
    public static final x0h1 i = new x0h1(new x0h1(null, 2047), 2012);
    public final boolean a;
    public final boolean b;
    public final x0h1 c;
    public final boolean d;
    public final x0h1 e;
    public final x0h1 f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x0h1(x0h1 x0h1Var, int i2) {
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        x0h1 x0h1Var2 = (i2 & 32) != 0 ? null : x0h1Var;
        this(z, z2, x0h1Var2, true, x0h1Var2, x0h1Var2, (i2 & 512) == 0, (i2 & 1024) == 0);
    }

    public x0h1(boolean z, boolean z2, x0h1 x0h1Var, boolean z3, x0h1 x0h1Var2, x0h1 x0h1Var3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = x0h1Var;
        this.d = z3;
        this.e = x0h1Var2;
        this.f = x0h1Var3;
        this.g = z4;
        this.h = z5;
    }
}
