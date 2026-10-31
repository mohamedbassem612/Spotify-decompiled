package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cxb0 {
    public final ji0 a;
    public final int b;
    public final boolean c;
    public final String d;

    public cxb0(ji0 ji0Var, int i, boolean z, String str) {
        this.a = ji0Var;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxb0)) {
            return false;
        }
        cxb0 cxb0Var = (cxb0) obj;
        return this.a.equals(cxb0Var.a) && this.b == cxb0Var.b && this.c == cxb0Var.c && u890.j(this.d, cxb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
