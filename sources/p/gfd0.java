package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class gfd0 {
    public static final ffd0 Companion = new ffd0();
    public final String a;
    public final String b;
    public final boolean c;
    public final double d;

    public /* synthetic */ gfd0(int i, String str, String str2, boolean z, double d) {
        if (13 != (i & 13)) {
            o6p1.t(i, 13, efd0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = z;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfd0)) {
            return false;
        }
        gfd0 gfd0Var = (gfd0) obj;
        return u890.j(this.a, gfd0Var.a) && u890.j(this.b, gfd0Var.b) && this.c == gfd0Var.c && Double.compare(this.d, gfd0Var.d) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Double.hashCode(this.d) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
