package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pu00 implements dbr0 {
    public final boolean a;

    public pu00(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu00) && this.a == ((pu00) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
