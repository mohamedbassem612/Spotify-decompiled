package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zt {
    public final boolean a;

    public zt(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt) && this.a == ((zt) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
