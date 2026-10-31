package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n1l {
    public final String a;
    public final boolean b;

    public n1l(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1l)) {
            return false;
        }
        n1l n1lVar = (n1l) obj;
        return u890.j(this.a, n1lVar.a) && this.b == n1lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
