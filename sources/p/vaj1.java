package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vaj1 {
    public final vu30 a = new s55(2, (lnm) null, (byte) 29);
    public final vu30 b;
    public final vu30 c;
    public final iu30 d;

    public vaj1(to1 to1Var, ozw ozwVar, i5w i5wVar) {
        this.b = to1Var;
        this.c = ozwVar;
        this.d = i5wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaj1)) {
            return false;
        }
        vaj1 vaj1Var = (vaj1) obj;
        return this.a.equals(vaj1Var.a) && this.b.equals(vaj1Var.b) && this.c.equals(vaj1Var.c) && this.d.equals(vaj1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + hrt.g(hrt.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
