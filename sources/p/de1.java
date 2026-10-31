package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class de1 {
    public static final ce1 Companion = new ce1();
    public final bww0 a;
    public final String b;
    public final hxr0 c;

    public /* synthetic */ de1(int i, bww0 bww0Var, String str, hxr0 hxr0Var) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, be1.a.getDescriptor());
            throw null;
        }
        this.a = bww0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = hxr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de1)) {
            return false;
        }
        de1 de1Var = (de1) obj;
        return u890.j(this.a, de1Var.a) && u890.j(this.b, de1Var.b) && u890.j(this.c, de1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public de1(bww0 bww0Var, String str, hxr0 hxr0Var) {
        this.a = bww0Var;
        this.b = str;
        this.c = hxr0Var;
    }
}
