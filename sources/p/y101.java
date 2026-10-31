package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y101 implements z101 {
    public final String a;

    public y101(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y101) && this.a.equals(((y101) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
