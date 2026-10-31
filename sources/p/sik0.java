package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sik0 implements gfh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hdn0 c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ hdn0 e;
    public final /* synthetic */ hdn0 f;
    public final /* synthetic */ es41 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ tob1 i;

    public sik0(int i, int i2, hdn0 hdn0Var, hdn0 hdn0Var2, hdn0 hdn0Var3, hdn0 hdn0Var4, es41 es41Var, boolean z, tob1 tob1Var) {
        this.a = i;
        this.b = i2;
        this.c = hdn0Var;
        this.d = hdn0Var2;
        this.e = hdn0Var3;
        this.f = hdn0Var4;
        this.g = es41Var;
        this.h = z;
        this.i = tob1Var;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m693measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        int i;
        int i2;
        int i3;
        long jB = hjl.b(j, 0, 0, 0, 0, 11);
        List<afh0> list2 = list;
        for (afh0 afh0Var : list2) {
            if (u890.j(t3k1.s(afh0Var), "trackA")) {
                q5t0 q5t0VarH = afh0Var.H(jB);
                for (afh0 afh0Var2 : list2) {
                    if (u890.j(t3k1.s(afh0Var2), "trackB")) {
                        q5t0 q5t0VarH2 = afh0Var2.H(jB);
                        for (afh0 afh0Var3 : list2) {
                            if (u890.j(t3k1.s(afh0Var3), "waveform")) {
                                q5t0 q5t0VarH3 = afh0Var3.H(jB);
                                for (afh0 afh0Var4 : list2) {
                                    if (u890.j(t3k1.s(afh0Var4), "presets")) {
                                        q5t0 q5t0VarH4 = afh0Var4.H(jB);
                                        int i4 = q5t0VarH.b;
                                        int i5 = q5t0VarH3.b;
                                        int i6 = q5t0VarH4.b;
                                        err0 err0Var = this.c;
                                        if (err0Var.s() == 0 && i4 > 0) {
                                            err0Var.t(i4);
                                        }
                                        err0 err0Var2 = this.d;
                                        if (err0Var2.s() != i5) {
                                            err0Var2.t(i5);
                                        }
                                        err0 err0Var3 = this.e;
                                        if (i6 > err0Var3.s()) {
                                            err0Var3.t(i6);
                                        }
                                        err0 err0Var4 = this.f;
                                        int iS = err0Var4.s();
                                        int i7 = (iS <= 0 || i4 <= 0 || (i3 = (((iS - (i4 * 2)) - i5) - this.a) / 2) < 0) ? 0 : i3;
                                        int i8 = i7 + i4;
                                        if (i5 <= 0 || (i2 = this.b) <= 0) {
                                            i = 0;
                                        } else {
                                            int i9 = (i2 - i5) / 2;
                                            if (i9 < 0) {
                                                i9 = 0;
                                            }
                                            i = i9;
                                        }
                                        int iS2 = (err0Var4.s() - i5) - i6;
                                        if (iS2 < 0) {
                                            iS2 = 0;
                                        }
                                        int i10 = i8 - iS2;
                                        int iS3 = ((err0Var4.s() - i6) - i5) / 2;
                                        int i11 = iS3 < 0 ? 0 : iS3;
                                        int iS4 = (i5 + i6) - err0Var4.s();
                                        if (iS4 < 0) {
                                            iS4 = 0;
                                        }
                                        return ifh0Var.S(hjl.i(j), err0Var4.s() > 0 ? Math.max(err0Var4.s() + iS4 + i8, (i4 * 2) + (i7 * 2) + i5 + i6) : 0, b7x.a, new rik0(this.g, i8, i, i11, this.h, q5t0VarH, i7, q5t0VarH2, i4, i5, q5t0VarH3, q5t0VarH4, i10, this.i));
                                    }
                                }
                                bhn0.t("Collection contains no element matching the predicate.");
                                return null;
                            }
                        }
                        bhn0.t("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }
}
