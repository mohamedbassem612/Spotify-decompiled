package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n2f implements q3f {
    public final String a;
    public final sl01 b;

    public n2f(String str, sl01 sl01Var) {
        this.a = str;
        this.b = sl01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2f)) {
            return false;
        }
        n2f n2fVar = (n2f) obj;
        return u890.j(this.a, n2fVar.a) && this.b == n2fVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
