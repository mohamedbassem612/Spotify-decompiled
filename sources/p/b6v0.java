package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b6v0 {
    public final String a;
    public final String b;

    public b6v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6v0)) {
            return false;
        }
        b6v0 b6v0Var = (b6v0) obj;
        return this.a.equals(b6v0Var.a) && this.b.equals(b6v0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
