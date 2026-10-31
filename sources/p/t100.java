package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t100 implements b600 {
    public final boolean a;

    public t100(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t100) && this.a == ((t100) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
