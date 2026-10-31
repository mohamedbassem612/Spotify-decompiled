package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uba1 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public uba1(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uba1)) {
            return false;
        }
        uba1 uba1Var = (uba1) obj;
        return this.a.equals(uba1Var.a) && this.b == uba1Var.b && u890.j(this.c, uba1Var.c) && u890.j(this.d, uba1Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }
}
