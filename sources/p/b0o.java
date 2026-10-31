package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b0o {
    public final g0o a;
    public final boolean b;

    public b0o(g0o g0oVar, boolean z) {
        this.a = g0oVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0o)) {
            return false;
        }
        b0o b0oVar = (b0o) obj;
        return u890.j(this.a, b0oVar.a) && this.b == b0oVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
