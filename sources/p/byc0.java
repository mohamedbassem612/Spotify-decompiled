package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class byc0 {
    public final int a;
    public final String b;
    public final phc c;

    public byc0(int i, String str, phc phcVar) {
        this.a = i;
        this.b = str;
        this.c = phcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byc0)) {
            return false;
        }
        byc0 byc0Var = (byc0) obj;
        return this.a == byc0Var.a && this.b.equals(byc0Var.b) && u890.j(this.c, byc0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
        phc phcVar = this.c;
        return iD + (phcVar == null ? 0 : phcVar.hashCode());
    }
}
