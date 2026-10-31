package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class r2s0 {
    public static final p2s0 Companion = new p2s0();
    public static final znb0[] d = {dm5.S(2, v0r0.Q0), null, null};
    public final q2s0 a;
    public final String b;
    public final String c;

    public /* synthetic */ r2s0(int i, q2s0 q2s0Var, String str, String str2) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, o2s0.a.getDescriptor());
            throw null;
        }
        this.a = q2s0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2s0)) {
            return false;
        }
        r2s0 r2s0Var = (r2s0) obj;
        return this.a == r2s0Var.a && u890.j(this.b, r2s0Var.b) && u890.j(this.c, r2s0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
