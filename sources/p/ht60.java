package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ht60 extends jto1 {
    public final String b;

    public ht60(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht60) && this.b.equals(((ht60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
