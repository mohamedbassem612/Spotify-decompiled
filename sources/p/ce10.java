package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ce10 implements fe10 {
    public final yd10 a;

    public ce10(yd10 yd10Var) {
        this.a = yd10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce10) && this.a == ((ce10) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
