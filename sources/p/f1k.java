package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f1k implements k1k {
    public final String a;

    public f1k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1k) && this.a.equals(((f1k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
