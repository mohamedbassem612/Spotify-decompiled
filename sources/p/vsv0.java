package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vsv0 {
    public final String a;
    public final String b;
    public final z511 c;

    public vsv0(String str, String str2, z511 z511Var) {
        this.a = str;
        this.b = str2;
        this.c = z511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsv0)) {
            return false;
        }
        vsv0 vsv0Var = (vsv0) obj;
        return this.a.equals(vsv0Var.a) && this.b.equals(vsv0Var.b) && u890.j(this.c, vsv0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        z511 z511Var = this.c;
        return iD + (z511Var == null ? 0 : z511Var.hashCode());
    }
}
