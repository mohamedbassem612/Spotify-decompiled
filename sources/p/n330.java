package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n330 {
    public final boolean a;

    public n330(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n330) && this.a == ((n330) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
