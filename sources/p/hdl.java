package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hdl {
    public final kdl a;
    public final iu30 b;
    public final iu30 c;
    public final vu30 d;

    public hdl(kdl kdlVar, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var) {
        this.a = kdlVar;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdl)) {
            return false;
        }
        hdl hdlVar = (hdl) obj;
        return u890.j(this.a, hdlVar.a) && u890.j(this.b, hdlVar.b) && u890.j(this.c, hdlVar.c) && u890.j(this.d, hdlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.g(this.c, ktd.g(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
