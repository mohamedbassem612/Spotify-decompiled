package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wi40 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final ej40 d;

    public wi40(String str, d8r0 d8r0Var, int i, ej40 ej40Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = ej40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi40)) {
            return false;
        }
        wi40 wi40Var = (wi40) obj;
        return this.a.equals(wi40Var.a) && this.b.equals(wi40Var.b) && this.c == wi40Var.c && this.d.equals(wi40Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
