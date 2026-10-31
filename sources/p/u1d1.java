package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class u1d1 {
    public static final t1d1 Companion = new t1d1();
    public final String a;
    public final String b;
    public final voa1 c;

    public /* synthetic */ u1d1(int i, String str, String str2, voa1 voa1Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, s1d1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = voa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1d1)) {
            return false;
        }
        u1d1 u1d1Var = (u1d1) obj;
        return u890.j(this.a, u1d1Var.a) && u890.j(this.b, u1d1Var.b) && u890.j(this.c, u1d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
