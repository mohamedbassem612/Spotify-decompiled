package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k820 {
    public final String a;
    public final String b;
    public final String c;

    public k820(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k820)) {
            return false;
        }
        k820 k820Var = (k820) obj;
        return this.a.equals(k820Var.a) && this.b.equals(k820Var.b) && u890.j(this.c, k820Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
