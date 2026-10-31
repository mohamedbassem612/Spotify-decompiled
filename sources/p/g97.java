package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g97 {
    public final yrd a;
    public final int b;
    public final i c;
    public final boolean d;

    public g97(yrd yrdVar, int i, i iVar, boolean z) {
        this.a = yrdVar;
        this.b = i;
        this.c = iVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g97)) {
            return false;
        }
        g97 g97Var = (g97) obj;
        return this.a.equals(g97Var.a) && this.b == g97Var.b && this.c.equals(g97Var.c) && this.d == g97Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
