package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jko {
    public final boolean a;

    public jko(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jko) && this.a == ((jko) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
