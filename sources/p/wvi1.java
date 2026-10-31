package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wvi1 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final svi1 c;

    public wvi1(String str, d8r0 d8r0Var, svi1 svi1Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = svi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvi1)) {
            return false;
        }
        wvi1 wvi1Var = (wvi1) obj;
        return this.a.equals(wvi1Var.a) && this.b.equals(wvi1Var.b) && this.c.equals(wvi1Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
