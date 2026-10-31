package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xww0 {
    public final boolean a;

    public xww0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xww0) && this.a == ((xww0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
