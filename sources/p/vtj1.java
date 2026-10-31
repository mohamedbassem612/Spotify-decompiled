package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vtj1 implements cuj1 {
    public final Exception a;

    public vtj1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtj1) && this.a.equals(((vtj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
