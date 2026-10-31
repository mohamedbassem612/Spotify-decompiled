package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hnj0 extends snj0 {
    public final String b;

    public hnj0(String str) {
        super(false);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnj0) && this.b.equals(((hnj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
