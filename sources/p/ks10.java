package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ks10 {
    public static final is10 a;
    public static final is10 b;
    public static final is10 c;
    public static final is10 d;
    public static final is10 e;

    static {
        yw10 yw10Var = new yw10(n5o0.c, 2131961213);
        yw10 yw10Var2 = new yw10(n5o0.a, 2131961212);
        yw10 yw10Var3 = new yw10(n5o0.d, 2131961216);
        yw10 yw10Var4 = new yw10(n5o0.b, 2131961214);
        n5o0 n5o0Var = n5o0.e;
        a = new is10(2131961220, mqo1.s(new yw10[]{yw10Var, yw10Var2, yw10Var3, yw10Var4, new yw10(n5o0Var, 2131961215)}));
        b = new is10(2131961232, mqo1.s(new yw10[]{new yw10(n5o0.f, 2131961229), new yw10(n5o0.g, 2131961228), new yw10(n5o0.h, 2131961231), new yw10(n5o0.i, 2131961230), new yw10(n5o0.t, 2131961215)}));
        c = new is10(2131961220, mqo1.s(new yw10[]{new yw10(n5o0.P0, 2131961225), new yw10(n5o0.Q0, 2131961224), new yw10(n5o0.R0, 2131961223), new yw10(n5o0.S0, 2131961221), new yw10(n5o0.T0, 2131961222), new yw10(n5o0Var, 2131961215)}));
        d = new is10(2131961238, mqo1.s(new yw10[]{new yw10(n5o0.X, 2131961237), new yw10(n5o0.Y, 2131961235), new yw10(n5o0.Z, 2131961236), new yw10(n5o0.N0, 2131961234), new yw10(n5o0.O0, 2131961215)}));
        e = new is10(2131961233, fg91.b);
    }

    public static is10 a(Mode mode) {
        switch (js10.a[mode.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return a;
            case 5:
                return c;
            case 6:
                return b;
            case 7:
                return d;
            case 8:
                return e;
            default:
                eg.o();
                return null;
        }
    }
}
