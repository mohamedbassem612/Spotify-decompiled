package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d721 {
    public final String a;
    public final String b;

    public d721(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d721)) {
            return false;
        }
        d721 d721Var = (d721) obj;
        return u890.j(this.a, d721Var.a) && u890.j(this.b, d721Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
