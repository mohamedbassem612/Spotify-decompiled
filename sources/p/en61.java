package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class en61 implements fn61 {
    public final boolean a;

    public en61(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en61) && this.a == ((en61) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
