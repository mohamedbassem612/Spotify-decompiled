package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class skj0 {
    public final String a;
    public final String b;
    public final String c;

    public skj0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skj0)) {
            return false;
        }
        skj0 skj0Var = (skj0) obj;
        return u890.j(this.a, skj0Var.a) && u890.j(this.b, skj0Var.b) && u890.j(this.c, skj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
