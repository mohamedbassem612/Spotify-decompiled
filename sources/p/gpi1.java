package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gpi1 implements pd51 {
    public final String a;
    public final d8r0 b;

    public gpi1(String str, d8r0 d8r0Var) {
        this.a = str;
        this.b = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpi1)) {
            return false;
        }
        gpi1 gpi1Var = (gpi1) obj;
        return this.a.equals(gpi1Var.a) && this.b.equals(gpi1Var.b);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
