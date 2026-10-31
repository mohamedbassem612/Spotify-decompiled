package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ozd implements tj0 {
    public final int a;

    public ozd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozd) && this.a == ((ozd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
