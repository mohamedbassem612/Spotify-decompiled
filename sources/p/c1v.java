package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c1v {
    public final qxc0 a;
    public final String b;

    public c1v(qxc0 qxc0Var, String str) {
        this.a = qxc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1v)) {
            return false;
        }
        c1v c1vVar = (c1v) obj;
        return this.a.equals(c1vVar.a) && u890.j(this.b, c1vVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
