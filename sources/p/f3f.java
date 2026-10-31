package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f3f implements q3f {
    public final apl a;
    public final long b;

    public f3f(apl aplVar, long j) {
        this.a = aplVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3f)) {
            return false;
        }
        f3f f3fVar = (f3f) obj;
        return u890.j(this.a, f3fVar.a) && this.b == f3fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
