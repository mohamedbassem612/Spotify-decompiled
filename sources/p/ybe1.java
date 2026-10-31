package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ybe1 implements cce1 {
    public final Exception a;

    public ybe1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybe1) && this.a.equals(((ybe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
