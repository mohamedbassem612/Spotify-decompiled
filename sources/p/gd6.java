package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gd6 {
    public final String a;
    public final String b;

    public gd6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd6)) {
            return false;
        }
        gd6 gd6Var = (gd6) obj;
        return u890.j(this.a, gd6Var.a) && u890.j(this.b, gd6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
