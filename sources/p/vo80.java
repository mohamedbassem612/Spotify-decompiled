package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vo80 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final so80 c;

    public vo80(String str, d8r0 d8r0Var, so80 so80Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = so80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo80)) {
            return false;
        }
        vo80 vo80Var = (vo80) obj;
        return this.a.equals(vo80Var.a) && this.b.equals(vo80Var.b) && this.c.equals(vo80Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
