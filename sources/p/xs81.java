package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xs81 implements kt81 {
    public final boolean a;

    public xs81(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs81) && this.a == ((xs81) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
