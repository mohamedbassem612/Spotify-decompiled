package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v180 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ v180(int i, String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = z;
    }

    public final Object invoke(Object obj) {
        h4e1 h4e1Var = (h4e1) obj;
        nbe1 nbe1Var = h4e1Var.h;
        String str = this.a;
        List list = this.b;
        if (nbe1Var != null) {
            long j = nbe1Var.a;
            int i = (int) (j >> 32);
            l3p1.u(h4e1Var, i, (int) (j & 4294967295L), str);
            if (str.length() > 0) {
                h4e1Var.n(i, str.length() + i, list);
            }
        } else {
            int iG = nbe1.g(h4e1Var.g);
            l3p1.u(h4e1Var, iG, nbe1.f(h4e1Var.g), str);
            if (str.length() > 0) {
                h4e1Var.n(iG, str.length() + iG, list);
            }
        }
        int iG2 = nbe1.g(h4e1Var.g);
        int i2 = this.c;
        int length = i2 > 0 ? (iG2 + i2) - 1 : (iG2 + i2) - str.length();
        h4e1Var.e = this.d;
        int iP = yoi1.p(length, 0, h4e1Var.c.length());
        h4e1Var.p(e6p1.e(iP, iP));
        return rih1.a;
    }
}
