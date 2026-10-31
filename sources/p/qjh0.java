package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qjh0 {
    public final c380 a;
    public final w4i1 b;
    public final String c;
    public final iu30 d;

    public qjh0(c380 c380Var, w4i1 w4i1Var, String str, iu30 iu30Var) {
        this.a = c380Var;
        this.b = w4i1Var;
        this.c = str;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjh0)) {
            return false;
        }
        qjh0 qjh0Var = (qjh0) obj;
        return u890.j(this.a, qjh0Var.a) && u890.j(this.b, qjh0Var.b) && u890.j(this.c, qjh0Var.c) && u890.j(this.d, qjh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(ydh.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
