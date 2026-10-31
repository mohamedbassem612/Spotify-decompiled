package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yyy extends dem1 {
    public final String b;

    public yyy(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyy) && this.b.equals(((yyy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
