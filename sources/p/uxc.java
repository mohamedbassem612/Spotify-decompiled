package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uxc implements z0i {
    public final String a;
    public final hux b;
    public final String c;
    public final w900 d;

    public uxc(String str, hux huxVar, String str2, w900 w900Var) {
        this.a = str;
        this.b = huxVar;
        this.c = str2;
        this.d = w900Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxc)) {
            return false;
        }
        uxc uxcVar = (uxc) obj;
        return this.a.equals(uxcVar.a) && u890.j(this.b, uxcVar.b) && this.c.equals(uxcVar.c) && this.d.equals(uxcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hux huxVar = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31, 31, this.c);
    }
}
