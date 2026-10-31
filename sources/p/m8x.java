package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m8x {
    public final boolean a;

    public m8x(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8x) && this.a == ((m8x) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
