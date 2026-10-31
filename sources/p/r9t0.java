package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r9t0 {
    public final String a;

    public r9t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9t0) && this.a.equals(((r9t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
