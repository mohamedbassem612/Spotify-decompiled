package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ibf {
    public static final gbf Companion = new gbf();
    public final String a;
    public final bbe1 b;
    public final ybf c;
    public final y4i1 d;
    public final String e;

    public /* synthetic */ ibf(int i, String str, bbe1 bbe1Var, ybf ybfVar, y4i1 y4i1Var, String str2) {
        if (29 != (i & 29)) {
            o6p1.t(i, 29, ebf.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bbe1Var;
        }
        this.c = ybfVar;
        this.d = y4i1Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibf)) {
            return false;
        }
        ibf ibfVar = (ibf) obj;
        return u890.j(this.a, ibfVar.a) && u890.j(this.b, ibfVar.b) && u890.j(this.c, ibfVar.c) && u890.j(this.d, ibfVar.d) && u890.j(this.e, ibfVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bbe1 bbe1Var = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (bbe1Var == null ? 0 : bbe1Var.a.hashCode())) * 31)) * 31)) * 31);
    }

    public ibf(String str, bbe1 bbe1Var, ybf ybfVar, y4i1 y4i1Var, String str2) {
        this.a = str;
        this.b = bbe1Var;
        this.c = ybfVar;
        this.d = y4i1Var;
        this.e = str2;
    }
}
