package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class rff0 {
    public static final qff0 Companion = new qff0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ rff0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, pff0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff0)) {
            return false;
        }
        rff0 rff0Var = (rff0) obj;
        return u890.j(this.a, rff0Var.a) && u890.j(this.b, rff0Var.b) && u890.j(this.c, rff0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public rff0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
