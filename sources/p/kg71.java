package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kg71 extends tg71 {
    public final int a;

    public kg71(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg71) && this.a == ((kg71) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
