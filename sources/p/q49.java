package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q49 extends c59 {
    public final boolean a;

    public q49(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q49) && this.a == ((q49) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
