package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ytm0 implements bum0 {
    public final Exception a;

    public ytm0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytm0) && this.a.equals(((ytm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
