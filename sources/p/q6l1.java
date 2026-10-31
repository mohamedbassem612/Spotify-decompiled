package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q6l1 implements l9c {
    public final String a;
    public final k3h1 b;
    public final t6l1 c;

    public q6l1(String str, k3h1 k3h1Var, t6l1 t6l1Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = t6l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6l1)) {
            return false;
        }
        q6l1 q6l1Var = (q6l1) obj;
        return this.a.equals(q6l1Var.a) && this.b.equals(q6l1Var.b) && this.c.equals(q6l1Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
