package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xsn0 implements atn0 {
    public final iu30 a;

    public xsn0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsn0) && u890.j(this.a, ((xsn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
