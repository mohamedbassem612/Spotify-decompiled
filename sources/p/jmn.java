package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jmn implements lmn {
    public final iu30 a;
    public final vu30 b;

    public jmn(iu30 iu30Var, vu30 vu30Var) {
        this.a = iu30Var;
        this.b = vu30Var;
    }

    public final vu30 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmn)) {
            return false;
        }
        jmn jmnVar = (jmn) obj;
        return this.a.equals(jmnVar.a) && this.b.equals(jmnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
