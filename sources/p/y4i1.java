package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class y4i1 {
    public static final n4i1 Companion = new n4i1();
    public final obi1 a;
    public final String b;
    public final String c;

    public /* synthetic */ y4i1(int i, obi1 obi1Var, String str, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, m4i1.a.getDescriptor());
            throw null;
        }
        this.a = obi1Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4i1)) {
            return false;
        }
        y4i1 y4i1Var = (y4i1) obj;
        return u890.j(this.a, y4i1Var.a) && u890.j(this.b, y4i1Var.b) && u890.j(this.c, y4i1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public y4i1(obi1 obi1Var, String str, String str2) {
        this.a = obi1Var;
        this.b = str;
        this.c = str2;
    }
}
