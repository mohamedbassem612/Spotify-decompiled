package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wz51 implements yz51 {
    public final tv80 a;

    public wz51(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz51) && u890.j(this.a, ((wz51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
