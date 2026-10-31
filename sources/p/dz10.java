package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dz10 {
    public final int a;
    public final ie30 b;
    public final np51 c;

    public dz10(int i, ie30 ie30Var, np51 np51Var) {
        this.a = i;
        this.b = ie30Var;
        this.c = np51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz10)) {
            return false;
        }
        dz10 dz10Var = (dz10) obj;
        return this.a == dz10Var.a && this.b.equals(dz10Var.b) && this.c.equals(dz10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
