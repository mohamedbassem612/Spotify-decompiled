package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wtf implements xtf {
    public final Exception a;

    public wtf(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtf) && this.a.equals(((wtf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
