package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class qf11 {
    public static final pf11 Companion = new pf11();
    public final String a;
    public final String b;
    public final String c;
    public final mf11 d;

    public /* synthetic */ qf11(int i, String str, String str2, String str3, mf11 mf11Var) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, of11.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mf11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf11)) {
            return false;
        }
        qf11 qf11Var = (qf11) obj;
        return u890.j(this.a, qf11Var.a) && u890.j(this.b, qf11Var.b) && u890.j(this.c, qf11Var.c) && u890.j(this.d, qf11Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
