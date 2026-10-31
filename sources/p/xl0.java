package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xl0 implements am0 {
    public final Exception a;

    public xl0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl0) && this.a.equals(((xl0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
