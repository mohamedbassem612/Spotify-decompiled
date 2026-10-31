package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ohf0 implements phf0 {
    public final boolean a;

    public ohf0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ohf0) && this.a == ((ohf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
