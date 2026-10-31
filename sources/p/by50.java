package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class by50 implements cy50 {
    public final int a;

    public by50(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by50) && this.a == ((by50) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
