package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lva0 extends uyn1 {
    public final String b;

    public lva0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lva0) && u890.j(this.b, ((lva0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
