package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m2x0 extends z2x0 {
    public final boolean a;

    public m2x0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2x0) && this.a == ((m2x0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
