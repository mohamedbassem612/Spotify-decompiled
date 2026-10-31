package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d450 implements g450 {
    public final Exception a;

    public d450(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d450) && this.a.equals(((d450) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
