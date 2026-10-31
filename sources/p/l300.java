package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l300 implements m700 {
    public final r6w0 a;

    public l300(r6w0 r6w0Var) {
        this.a = r6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l300) && this.a.equals(((l300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
