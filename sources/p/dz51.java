package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dz51 implements fz51 {
    public final gz51 a;

    public dz51(gz51 gz51Var) {
        this.a = gz51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz51) && u890.j(this.a, ((dz51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
