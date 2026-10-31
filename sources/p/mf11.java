package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class mf11 {
    public static final lf11 Companion = new lf11();
    public final String a;
    public final String b;

    public /* synthetic */ mf11(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, kf11.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf11)) {
            return false;
        }
        mf11 mf11Var = (mf11) obj;
        return u890.j(this.a, mf11Var.a) && u890.j(this.b, mf11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
