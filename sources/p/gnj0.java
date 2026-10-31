package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gnj0 extends snj0 {
    public final String b;

    public gnj0(String str) {
        super(false);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnj0) && this.b.equals(((gnj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
