package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f9n {
    public final Object a;
    public final long b;

    public f9n(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9n)) {
            return false;
        }
        f9n f9nVar = (f9n) obj;
        return u890.j(this.a, f9nVar.a) && this.b == f9nVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Long.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
