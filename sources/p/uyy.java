package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uyy extends dem1 {
    public final String b;

    public uyy(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyy) && this.b.equals(((uyy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
