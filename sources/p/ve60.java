package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ve60 implements ye60 {
    public final String a;
    public final hvl1 b;
    public final c380 c;

    public ve60(String str, hvl1 hvl1Var, c380 c380Var) {
        this.a = str;
        this.b = hvl1Var;
        this.c = c380Var;
    }

    @Override // p.ye60
    public final String a() {
        return this.a;
    }

    @Override // p.ye60
    public final x360 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve60)) {
            return false;
        }
        ve60 ve60Var = (ve60) obj;
        return this.a.equals(ve60Var.a) && this.b.equals(ve60Var.b) && u890.j(this.c, ve60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
