package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wm61 {
    public final iu30 a;
    public final iu30 b;
    public final iu30 c;

    public wm61(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = iu30Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm61)) {
            return false;
        }
        wm61 wm61Var = (wm61) obj;
        return u890.j(this.a, wm61Var.a) && u890.j(this.b, wm61Var.b) && u890.j(this.c, wm61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
