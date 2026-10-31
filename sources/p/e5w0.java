package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class e5w0 {
    public static final d5w0 Companion = new d5w0();
    public final String a;
    public final boolean b;
    public final Double c;
    public final String d;

    public /* synthetic */ e5w0(int i, String str, boolean z, Double d, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, c5w0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5w0)) {
            return false;
        }
        e5w0 e5w0Var = (e5w0) obj;
        return u890.j(this.a, e5w0Var.a) && this.b == e5w0Var.b && u890.j(this.c, e5w0Var.c) && u890.j(this.d, e5w0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Double d = this.c;
        int iHashCode = (iG + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
