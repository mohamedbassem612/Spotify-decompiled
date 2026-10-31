package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pmx0 implements l9c {
    public final String a;
    public final k3h1 b;
    public final tmx0 c;

    public pmx0(String str, k3h1 k3h1Var, tmx0 tmx0Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = tmx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmx0)) {
            return false;
        }
        pmx0 pmx0Var = (pmx0) obj;
        return this.a.equals(pmx0Var.a) && this.b.equals(pmx0Var.b) && this.c.equals(pmx0Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
