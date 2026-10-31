package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i98 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final vb8 d;

    public i98(String str, d8r0 d8r0Var, int i, vb8 vb8Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = vb8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i98)) {
            return false;
        }
        i98 i98Var = (i98) obj;
        return this.a.equals(i98Var.a) && this.b.equals(i98Var.b) && this.c == i98Var.c && this.d.equals(i98Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
