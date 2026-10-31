package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zmk1 implements cnk1 {
    public final boolean a;

    public zmk1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmk1) && this.a == ((zmk1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
