package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lsn0 extends nsn0 {
    public final ou80 a;
    public final String b;

    public lsn0(String str, ou80 ou80Var) {
        this.a = ou80Var;
        this.b = str;
    }

    @Override // p.nsn0
    public final boolean a() {
        return false;
    }

    @Override // p.nsn0
    public final String b() {
        return f4i1.f("user_interaction(", this.a.a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsn0)) {
            return false;
        }
        lsn0 lsn0Var = (lsn0) obj;
        return u890.j(this.a, lsn0Var.a) && u890.j(this.b, lsn0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // p.nsn0
    public final String toString() {
        return super.toString();
    }
}
