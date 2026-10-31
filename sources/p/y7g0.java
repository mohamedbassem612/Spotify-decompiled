package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y7g0 extends hon1 {
    public final String e;

    public y7g0(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7g0) && this.e.equals(((y7g0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
