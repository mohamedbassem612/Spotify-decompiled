package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class w180 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w180(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        h4e1 h4e1Var = (h4e1) obj;
        nbe1 nbe1Var = h4e1Var.h;
        String str = this.a;
        if (nbe1Var != null) {
            long j = nbe1Var.a;
            l3p1.u(h4e1Var, (int) (j >> 32), (int) (j & 4294967295L), str);
        } else {
            l3p1.u(h4e1Var, nbe1.g(h4e1Var.g), nbe1.f(h4e1Var.g), str);
        }
        int iG = nbe1.g(h4e1Var.g);
        int i = this.b;
        int length = i > 0 ? (iG + i) - 1 : (iG + i) - str.length();
        h4e1Var.e = this.c;
        int iP = yoi1.p(length, 0, h4e1Var.c.length());
        h4e1Var.p(e6p1.e(iP, iP));
        return rih1.a;
    }
}
