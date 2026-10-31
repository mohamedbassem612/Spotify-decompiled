package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class xf70 {
    public static final wf70 Companion = new wf70();
    public final String a;
    public final qf70 b;

    public /* synthetic */ xf70(int i, String str, qf70 qf70Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, vf70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = qf70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf70)) {
            return false;
        }
        xf70 xf70Var = (xf70) obj;
        return u890.j(this.a, xf70Var.a) && this.b == xf70Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
