package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c95 {
    public final d95 a;
    public int b;

    public c95(d95 d95Var, int i) {
        this.a = d95Var;
        this.b = i;
    }

    public final String a() {
        String str;
        d95 d95Var = this.a;
        String strB = d95Var.b();
        String strA = d95Var.a();
        int iC = l1d.C(this.b);
        if (iC == 0) {
            str = "w";
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            str = "r";
        }
        return strB + "_{" + strA + "," + str + "}";
    }
}
