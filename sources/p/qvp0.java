package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qvp0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final wvp0 c;

    public qvp0(String str, d8r0 d8r0Var, wvp0 wvp0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = wvp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvp0)) {
            return false;
        }
        qvp0 qvp0Var = (qvp0) obj;
        return this.a.equals(qvp0Var.a) && this.b.equals(qvp0Var.b) && this.c.equals(qvp0Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
