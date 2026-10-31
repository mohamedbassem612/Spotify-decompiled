package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class di6 implements gfh0 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public di6(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m137measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        afh0 afh0Var = (afh0) o7h.V0(list);
        int iI0 = ifh0Var.i0(this.a);
        int iI1 = ifh0Var.i0(this.b);
        if (!((iI1 >= 0) & (iI0 >= 0))) {
            sf80.a("width and height must be >= 0");
        }
        return ifh0Var.S(hjl.i(j), hjl.h(j), b7x.a, new ci6(afh0Var.H(jjl.h(iI0, iI0, iI1, iI1)), this.c, (byte) 0));
    }
}
