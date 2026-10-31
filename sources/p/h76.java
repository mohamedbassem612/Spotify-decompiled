package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h76 implements m86 {
    public final boolean a;
    public final boolean b;
    public final z740 c;

    public h76(boolean z, boolean z2, z740 z740Var) {
        this.a = z;
        this.b = z2;
        this.c = z740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h76)) {
            return false;
        }
        h76 h76Var = (h76) obj;
        return this.a == h76Var.a && this.b == h76Var.b && this.c.equals(h76Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
