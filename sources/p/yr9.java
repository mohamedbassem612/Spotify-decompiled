package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yr9 implements zr9 {
    public final boolean a;

    public yr9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr9) && this.a == ((yr9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
