package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eoo {
    public final boolean a;

    public eoo(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eoo) && this.a == ((eoo) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
