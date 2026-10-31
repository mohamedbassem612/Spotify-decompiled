package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evg1 implements gvg1 {
    public final Exception a;

    public evg1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evg1) && this.a.equals(((evg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
