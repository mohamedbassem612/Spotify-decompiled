package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class lrs0 {
    public static final krs0 Companion = new krs0();
    public final String a;
    public final String b;
    public final ib9 c;

    public /* synthetic */ lrs0(int i, String str, String str2, ib9 ib9Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, jrs0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ib9Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrs0)) {
            return false;
        }
        lrs0 lrs0Var = (lrs0) obj;
        return u890.j(this.a, lrs0Var.a) && u890.j(this.b, lrs0Var.b) && u890.j(this.c, lrs0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ib9 ib9Var = this.c;
        return iHashCode2 + (ib9Var != null ? ib9Var.hashCode() : 0);
    }
}
