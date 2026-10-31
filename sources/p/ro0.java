package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ro0 implements zo0 {
    public final mo0 a;

    public ro0(mo0 mo0Var) {
        this.a = mo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro0) && this.a == ((ro0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
