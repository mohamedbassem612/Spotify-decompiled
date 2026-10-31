package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m2m implements r2m {
    public final Exception a;

    public m2m(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2m) && this.a.equals(((m2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
