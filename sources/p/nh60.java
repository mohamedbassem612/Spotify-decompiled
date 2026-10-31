package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nh60 implements vh60 {
    public final Exception a;

    public nh60(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh60) && this.a.equals(((nh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
