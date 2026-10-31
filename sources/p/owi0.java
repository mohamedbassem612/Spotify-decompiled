package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class owi0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final qwi0 c;

    public owi0(String str, d8r0 d8r0Var, qwi0 qwi0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = qwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owi0)) {
            return false;
        }
        owi0 owi0Var = (owi0) obj;
        return this.a.equals(owi0Var.a) && this.b.equals(owi0Var.b) && this.c.equals(owi0Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
