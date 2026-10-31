package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e8w extends bzn1 {
    public final String c;
    public final int d;
    public final tv80 e;

    public e8w(int i, String str, tv80 tv80Var) {
        this.c = str;
        this.d = i;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8w)) {
            return false;
        }
        e8w e8wVar = (e8w) obj;
        return u890.j(this.c, e8wVar.c) && this.d == e8wVar.d && u890.j(this.e, e8wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, this.c.hashCode() * 31, 31);
    }
}
