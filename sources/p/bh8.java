package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class bh8 {
    public static final ah8 Companion = new ah8();
    public final String a;
    public final uga0 b;

    public /* synthetic */ bh8(int i, String str, uga0 uga0Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, zg8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = uga0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh8)) {
            return false;
        }
        bh8 bh8Var = (bh8) obj;
        return u890.j(this.a, bh8Var.a) && u890.j(this.b, bh8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
