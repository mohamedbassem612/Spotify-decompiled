package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j8u extends d9u {
    public final abu a;
    public final String b;
    public final boolean c;

    public j8u(abu abuVar, String str, boolean z) {
        this.a = abuVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8u)) {
            return false;
        }
        j8u j8uVar = (j8u) obj;
        return u890.j(this.a, j8uVar.a) && u890.j(this.b, j8uVar.b) && this.c == j8uVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
