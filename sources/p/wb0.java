package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class wb0 {
    public static final vb0 Companion = new vb0();
    public final String a;
    public final td61 b;
    public final String c;
    public final String d;
    public final j16 e;

    public /* synthetic */ wb0(int i, String str, td61 td61Var, String str2, String str3) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, ub0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = td61Var;
        }
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
            str3 = null;
        } else {
            this.d = str3;
        }
        fdg1.I(str2);
        this.e = n3o1.p(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        return u890.j(this.a, wb0Var.a) && u890.j(this.b, wb0Var.b) && u890.j(this.c, wb0Var.c) && u890.j(this.d, wb0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        td61 td61Var = this.b;
        int iD = cy30.d((iHashCode + (td61Var == null ? 0 : td61Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
