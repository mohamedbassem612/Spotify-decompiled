package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class opa1 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final j2p1 d;
    public final d5r e;
    public final ew9 f;

    public opa1(String str, String str2, String str3, j2p1 j2p1Var, d5r d5rVar, ew9 ew9Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j2p1Var;
        this.e = d5rVar;
        this.f = ew9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opa1)) {
            return false;
        }
        opa1 opa1Var = (opa1) obj;
        return this.a.equals(opa1Var.a) && this.b.equals(opa1Var.b) && this.c.equals(opa1Var.c) && this.d.equals(opa1Var.d) && u890.j(this.e, opa1Var.e) && this.f.equals(opa1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        d5r d5rVar = this.e;
        int iHashCode2 = d5rVar == null ? 0 : d5rVar.hashCode();
        return Boolean.hashCode(false) + ((this.f.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }
}
