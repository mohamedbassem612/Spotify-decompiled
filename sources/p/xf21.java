package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xf21 {
    public final boolean a;

    public xf21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf21) && this.a == ((xf21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
