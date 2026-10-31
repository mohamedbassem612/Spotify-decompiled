package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sn3 extends qxd0 {
    public final tv80 d;

    public sn3(tv80 tv80Var) {
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn3) && this.d.equals(((sn3) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
