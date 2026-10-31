package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class bh31 {
    public static final ah31 Companion = new ah31();
    public final String a;
    public final String b;
    public final eh31 c;

    public /* synthetic */ bh31(int i, String str, String str2, eh31 eh31Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, zg31.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = eh31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh31)) {
            return false;
        }
        bh31 bh31Var = (bh31) obj;
        return u890.j(this.a, bh31Var.a) && u890.j(this.b, bh31Var.b) && u890.j(this.c, bh31Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
