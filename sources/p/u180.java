package p;

import android.graphics.Path;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u180 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u180(int i, int i2, s180 s180Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = s180Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                s180 s180Var = (s180) obj2;
                h4e1 h4e1Var = (h4e1) obj;
                long jA = s180Var.a(e6p1.e(0, h4e1Var.c.length()));
                int iG = nbe1.g(jA);
                int iF = nbe1.f(jA);
                if (i2 < iG) {
                    i2 = iG;
                }
                if (i2 <= iF) {
                    iF = i2;
                }
                int iG2 = nbe1.g(jA);
                int iF2 = nbe1.f(jA);
                if (i < iG2) {
                    i = iG2;
                }
                if (i <= iF2) {
                    iF2 = i;
                }
                h4e1Var.p(s180Var.e(e6p1.e(iF, iF2)));
                break;
            case 1:
                s180 s180Var2 = (s180) obj2;
                h4e1 h4e1Var2 = (h4e1) obj;
                if (i2 < 0 || i < 0) {
                    tf80.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i + " respectively.");
                }
                long jA2 = s180Var2.a(h4e1Var2.g);
                int iF3 = nbe1.f(jA2);
                int iD = iF3 + i;
                if (((iF3 ^ iD) & (i ^ iD)) < 0) {
                    iD = s180Var2.d();
                }
                long jE = s180Var2.e(e6p1.e(nbe1.f(jA2), Math.min(iD, s180Var2.d())));
                l3p1.t(h4e1Var2, nbe1.g(jE), nbe1.f(jE));
                int iG3 = nbe1.g(jA2);
                int i3 = iG3 - i2;
                if (((iG3 ^ i3) & (i2 ^ iG3)) < 0) {
                    i3 = 0;
                }
                long jE2 = s180Var2.e(e6p1.e(Math.max(0, i3), nbe1.g(jA2)));
                l3p1.t(h4e1Var2, nbe1.g(jE2), nbe1.f(jE2));
                break;
            case 2:
                s180 s180Var3 = (s180) obj2;
                h4e1 h4e1Var3 = (h4e1) obj;
                nbe1 nbe1Var = h4e1Var3.h;
                yzr0 yzr0Var = h4e1Var3.c;
                if (nbe1Var != null) {
                    h4e1Var3.o(null);
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                long jE3 = s180Var3.e(e6p1.e(i2, i));
                int iP = yoi1.p(nbe1.g(jE3), 0, yzr0Var.length());
                int iP2 = yoi1.p(nbe1.f(jE3), 0, yzr0Var.length());
                if (iP != iP2) {
                    if (iP >= iP2) {
                        h4e1Var3.n(iP2, iP, null);
                    } else {
                        h4e1Var3.n(iP, iP2, null);
                    }
                }
                break;
            default:
                tw4 tw4Var = (tw4) obj2;
                sor0 sor0Var = (sor0) obj;
                nw4 nw4Var = sor0Var.a;
                int iD2 = sor0Var.d(i2);
                int iD3 = sor0Var.d(i);
                CharSequence charSequence = nw4Var.e;
                if (iD2 < 0 || iD2 > iD3 || iD3 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbQ = cy30.q(iD2, iD3, "start(", ") or end(", ") is out of range [0..");
                    sbQ.append(length);
                    sbQ.append("], or start > end!");
                    rf80.a(sbQ.toString());
                }
                Path path = new Path();
                w9e1 w9e1Var = nw4Var.d;
                w9e1Var.f.getSelectionPath(iD2, iD3, path);
                int i4 = w9e1Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                tw4 tw4Var2 = new tw4(path);
                tw4Var2.r((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sor0Var.f)) & 4294967295L));
                u8s0.a(tw4Var, tw4Var2);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ u180(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
