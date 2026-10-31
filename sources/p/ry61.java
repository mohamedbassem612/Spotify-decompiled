package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ry61 implements ty61 {
    public final String a;

    public ry61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry61) && this.a.equals(((ry61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
