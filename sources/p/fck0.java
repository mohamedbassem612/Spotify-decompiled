package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fck0 implements qck0 {
    public final boolean a;

    public fck0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fck0) && this.a == ((fck0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
