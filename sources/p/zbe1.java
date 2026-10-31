package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zbe1 implements cce1 {
    public final Exception a;

    public zbe1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbe1) && this.a.equals(((zbe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
