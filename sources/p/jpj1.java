package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jpj1 implements lpj1 {
    public final Exception a;

    public jpj1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpj1) && u890.j(this.a, ((jpj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
