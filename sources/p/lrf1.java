package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lrf1 extends mrf1 {
    public final String a;
    public final int b;
    public final String c;
    public final zpf1 d;

    public lrf1(String str, int i, String str2, zpf1 zpf1Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = zpf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrf1)) {
            return false;
        }
        lrf1 lrf1Var = (lrf1) obj;
        return this.a.equals(lrf1Var.a) && this.b == lrf1Var.b && u890.j(this.c, lrf1Var.c) && this.d.equals(lrf1Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
