package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kif1 {
    public final String a;
    public final String b;
    public final String c;

    public kif1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kif1)) {
            return false;
        }
        kif1 kif1Var = (kif1) obj;
        return this.a.equals(kif1Var.a) && this.b.equals(kif1Var.b) && u890.j(this.c, kif1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
