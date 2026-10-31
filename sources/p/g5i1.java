package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class g5i1 {
    public static final f5i1 Companion = new f5i1();
    public final String a;
    public final gfd0 b;

    public /* synthetic */ g5i1(int i, String str, gfd0 gfd0Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, e5i1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gfd0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5i1)) {
            return false;
        }
        g5i1 g5i1Var = (g5i1) obj;
        return u890.j(this.a, g5i1Var.a) && u890.j(this.b, g5i1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gfd0 gfd0Var = this.b;
        return iHashCode + (gfd0Var == null ? 0 : gfd0Var.hashCode());
    }
}
