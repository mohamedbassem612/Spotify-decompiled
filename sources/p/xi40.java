package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xi40 {
    public final String a;
    public final String b;

    public xi40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi40)) {
            return false;
        }
        xi40 xi40Var = (xi40) obj;
        return this.a.equals(xi40Var.a) && u890.j(this.b, xi40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
