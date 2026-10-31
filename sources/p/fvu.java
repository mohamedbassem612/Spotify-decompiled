package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fvu implements tey0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ai90 d;
    public final fbp1 e;

    public /* synthetic */ fvu(String str, ai90 ai90Var, fbp1 fbp1Var, int i) {
        this(str, true, false, (i & 8) != 0 ? new zh90() : ai90Var, (i & 16) != 0 ? swp0.c : fbp1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvu)) {
            return false;
        }
        fvu fvuVar = (fvu) obj;
        return u890.j(this.a, fvuVar.a) && this.b == fvuVar.b && this.c == fvuVar.c && u890.j(this.d, fvuVar.d) && u890.j(this.e, fvuVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public fvu(String str, boolean z, boolean z2, ai90 ai90Var, fbp1 fbp1Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = ai90Var;
        this.e = fbp1Var;
    }
}
