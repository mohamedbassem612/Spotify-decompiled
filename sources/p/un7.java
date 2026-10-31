package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class un7 implements ao7 {
    public final Exception a;

    public un7(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un7) && this.a.equals(((un7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
