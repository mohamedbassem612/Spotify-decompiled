package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l5l1 implements l9c {
    public final String a;
    public final k3h1 b;
    public final xcl1 c;

    public l5l1(String str, k3h1 k3h1Var, xcl1 xcl1Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = xcl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5l1)) {
            return false;
        }
        l5l1 l5l1Var = (l5l1) obj;
        return this.a.equals(l5l1Var.a) && this.b.equals(l5l1Var.b) && this.c.equals(l5l1Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
