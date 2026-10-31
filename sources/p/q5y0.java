package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5y0 implements u5y0 {
    public final boolean a;

    public q5y0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5y0) && this.a == ((q5y0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
