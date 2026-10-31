package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p0t0 implements t0t0 {
    public final String a;

    public p0t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0t0) && this.a.equals(((p0t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
