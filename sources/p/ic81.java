package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ic81 implements l9c {
    public final String a;
    public final k3h1 b;
    public final id81 c;

    public ic81(String str, k3h1 k3h1Var, id81 id81Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = id81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic81)) {
            return false;
        }
        ic81 ic81Var = (ic81) obj;
        return this.a.equals(ic81Var.a) && this.b.equals(ic81Var.b) && this.c.equals(ic81Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
