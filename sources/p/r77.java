package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r77 implements t77 {
    public final l77 a;
    public final int b;
    public final String c;

    public r77(l77 l77Var, int i, String str) {
        this.a = l77Var;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r77)) {
            return false;
        }
        r77 r77Var = (r77) obj;
        return this.a.equals(r77Var.a) && this.b == r77Var.b && this.c.equals(r77Var.c);
    }

    @Override // p.t77
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
