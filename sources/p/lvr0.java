package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lvr0 extends pvr0 {
    public final tv80 a;

    public lvr0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvr0) && u890.j(this.a, ((lvr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
