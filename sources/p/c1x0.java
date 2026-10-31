package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c1x0 implements tey0 {
    public final String a;
    public final boolean b;
    public final x4i1 c;

    public /* synthetic */ c1x0(String str, x4i1 x4i1Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 4) != 0 ? new x4i1(127, (Integer) null, (String) null, (String) null, (String) null, (String) null) : x4i1Var, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1x0)) {
            return false;
        }
        c1x0 c1x0Var = (c1x0) obj;
        return u890.j(this.a, c1x0Var.a) && this.b == c1x0Var.b && u890.j(this.c, c1x0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public c1x0(String str, x4i1 x4i1Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = x4i1Var;
    }
}
