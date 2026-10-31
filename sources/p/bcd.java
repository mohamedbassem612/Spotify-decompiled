package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bcd implements jcd {
    public final Exception a;

    public bcd(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcd) && this.a.equals(((bcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
