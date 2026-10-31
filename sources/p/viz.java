package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class viz implements iz70 {
    public final oq70 a;
    public final zy70 b;
    public final Throwable c;

    public viz(oq70 oq70Var, zy70 zy70Var, Throwable th) {
        this.a = oq70Var;
        this.b = zy70Var;
        this.c = th;
    }

    @Override // p.iz70
    public final oq70 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viz)) {
            return false;
        }
        viz vizVar = (viz) obj;
        return u890.j(this.a, vizVar.a) && u890.j(this.b, vizVar.b) && this.c.equals(vizVar.c);
    }

    @Override // p.iz70
    public final zy70 getRequest() {
        return this.b;
    }

    public final int hashCode() {
        oq70 oq70Var = this.a;
        int iHashCode = oq70Var == null ? 0 : oq70Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ')';
    }
}
