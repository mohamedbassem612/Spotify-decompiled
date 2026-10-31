package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ght0 extends lht0 {
    public final String a;
    public final d1z b;
    public final tv80 c;

    public ght0(String str, d1z d1zVar, tv80 tv80Var) {
        this.a = str;
        this.b = d1zVar;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ght0)) {
            return false;
        }
        ght0 ght0Var = (ght0) obj;
        return this.a.equals(ght0Var.a) && this.b == ght0Var.b && this.c.equals(ght0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
