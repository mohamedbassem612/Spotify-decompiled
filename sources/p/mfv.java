package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mfv {
    public final lfv a;
    public final iix0 b;

    public mfv(lfv lfvVar, iix0 iix0Var) {
        this.a = lfvVar;
        this.b = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfv)) {
            return false;
        }
        mfv mfvVar = (mfv) obj;
        return this.a.equals(mfvVar.a) && u890.j(this.b, mfvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
