package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jrf1 extends mrf1 {
    public final String a;
    public final int b;
    public final String c;

    public jrf1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrf1)) {
            return false;
        }
        jrf1 jrf1Var = (jrf1) obj;
        return this.a.equals(jrf1Var.a) && this.b == jrf1Var.b && u890.j(this.c, jrf1Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
