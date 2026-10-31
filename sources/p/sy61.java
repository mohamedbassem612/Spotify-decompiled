package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sy61 {
    public final boolean a;

    public sy61(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy61) && this.a == ((sy61) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
