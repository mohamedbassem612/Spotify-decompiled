package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xm9 {
    public final boolean a;

    public xm9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm9) && this.a == ((xm9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
