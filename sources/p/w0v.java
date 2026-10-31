package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w0v {
    public final p0v a;
    public final u0v b;

    public w0v(p0v p0vVar, u0v u0vVar) {
        this.a = p0vVar;
        this.b = u0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0v)) {
            return false;
        }
        w0v w0vVar = (w0v) obj;
        return u890.j(this.a, w0vVar.a) && u890.j(this.b, w0vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
