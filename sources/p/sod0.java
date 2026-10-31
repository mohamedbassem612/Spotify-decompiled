package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sod0 extends xod0 {
    public final Exception a;

    public sod0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sod0) && this.a.equals(((sod0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
