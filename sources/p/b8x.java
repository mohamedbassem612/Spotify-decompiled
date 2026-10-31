package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b8x {
    public final a8x a;
    public final boolean b;

    public b8x(a8x a8xVar, boolean z) {
        this.a = a8xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8x)) {
            return false;
        }
        b8x b8xVar = (b8x) obj;
        return this.a.equals(b8xVar.a) && this.b == b8xVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
