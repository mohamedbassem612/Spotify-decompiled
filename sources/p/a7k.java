package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a7k {
    public final String a;
    public final boolean b;

    public a7k(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7k)) {
            return false;
        }
        a7k a7kVar = (a7k) obj;
        return u890.j(this.a, a7kVar.a) && this.b == a7kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
