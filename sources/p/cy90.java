package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy90 implements gy90 {
    public final jeh0 a;

    public cy90(jeh0 jeh0Var) {
        this.a = jeh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cy90) && u890.j(this.a, ((cy90) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
