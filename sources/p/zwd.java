package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zwd implements vbd0 {
    public final Exception a;

    public zwd(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zwd) && this.a.equals(((zwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
