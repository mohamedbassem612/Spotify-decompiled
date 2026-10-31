package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lty {
    public final String a;

    public lty(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lty) && u890.j(this.a, ((lty) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
