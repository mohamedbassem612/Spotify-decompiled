package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class htg0 {
    public final String a;
    public final String b;
    public final String c;

    public htg0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htg0)) {
            return false;
        }
        htg0 htg0Var = (htg0) obj;
        return this.a.equals(htg0Var.a) && this.b.equals(htg0Var.b) && u890.j(this.c, htg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
