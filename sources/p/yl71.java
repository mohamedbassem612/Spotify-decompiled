package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yl71 {
    public final int a;

    public yl71(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl71) && this.a == ((yl71) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
