package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ue60 {
    public final String a;
    public final hvl1 b;
    public final c380 c;
    public final ie60 d;

    public ue60(String str, hvl1 hvl1Var, c380 c380Var, ie60 ie60Var) {
        this.a = str;
        this.b = hvl1Var;
        this.c = c380Var;
        this.d = ie60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue60)) {
            return false;
        }
        ue60 ue60Var = (ue60) obj;
        return this.a.equals(ue60Var.a) && this.b.equals(ue60Var.b) && u890.j(this.c, ue60Var.c) && this.d.equals(ue60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kk0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
