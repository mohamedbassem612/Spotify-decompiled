package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c7j1 implements l9c {
    public final String a;
    public final k3h1 b;
    public final y8j1 c;

    public c7j1(String str, k3h1 k3h1Var, y8j1 y8j1Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = y8j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7j1)) {
            return false;
        }
        c7j1 c7j1Var = (c7j1) obj;
        return this.a.equals(c7j1Var.a) && this.b.equals(c7j1Var.b) && this.c.equals(c7j1Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
