package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ukw0 implements l9c {
    public final String a;
    public final k3h1 b;
    public final oii0 c;

    public ukw0(String str, k3h1 k3h1Var, oii0 oii0Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = oii0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukw0)) {
            return false;
        }
        ukw0 ukw0Var = (ukw0) obj;
        return this.a.equals(ukw0Var.a) && this.b.equals(ukw0Var.b) && this.c.equals(ukw0Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
