package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ud60 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final qd60 c;

    public ud60(String str, d8r0 d8r0Var, qd60 qd60Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = qd60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud60)) {
            return false;
        }
        ud60 ud60Var = (ud60) obj;
        return this.a.equals(ud60Var.a) && this.b.equals(ud60Var.b) && this.c.equals(ud60Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
