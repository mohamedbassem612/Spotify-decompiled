package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdi1 extends z0b {
    public final v4i1 a;

    public gdi1(v4i1 v4i1Var) {
        this.a = v4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdi1) && this.a.equals(((gdi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
