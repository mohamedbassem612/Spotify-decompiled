package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s03 extends u03 {
    public final String a;
    public final tv80 b;

    public s03(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final String a() {
        return this.a;
    }

    public final tv80 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s03)) {
            return false;
        }
        s03 s03Var = (s03) obj;
        return u890.j(this.a, s03Var.a) && u890.j(this.b, s03Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
