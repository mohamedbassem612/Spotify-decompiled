package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b320 {
    public final String a;
    public final String b;

    public b320(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b320)) {
            return false;
        }
        b320 b320Var = (b320) obj;
        return u890.j(this.a, b320Var.a) && this.b.equals(b320Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
