package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ale {
    public final z771 a;
    public final int b;
    public final s1f1 c;

    public ale(z771 z771Var, int i, s1f1 s1f1Var) {
        this.a = z771Var;
        this.b = i;
        this.c = s1f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ale)) {
            return false;
        }
        ale aleVar = (ale) obj;
        return u890.j(this.a, aleVar.a) && this.b == aleVar.b && this.c.equals(aleVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.a.hashCode() * 31, 31);
    }
}
