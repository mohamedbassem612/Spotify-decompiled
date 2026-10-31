package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e151 extends q151 {
    public final fw41 a;

    public e151(fw41 fw41Var) {
        this.a = fw41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e151) && this.a.equals(((e151) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
