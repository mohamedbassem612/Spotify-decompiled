package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t0k implements k1k {
    public final String a;

    public t0k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0k) && u890.j(this.a, ((t0k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
