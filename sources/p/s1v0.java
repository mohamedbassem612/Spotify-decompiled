package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s1v0 {
    public final String a;
    public final Object b;

    public s1v0(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1v0)) {
            return false;
        }
        s1v0 s1v0Var = (s1v0) obj;
        return u890.j(this.a, s1v0Var.a) && u890.j(this.b, s1v0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
