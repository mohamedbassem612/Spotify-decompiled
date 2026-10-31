package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pyc extends syc {
    public final ily0 a;

    public pyc(ily0 ily0Var) {
        this.a = ily0Var;
    }

    @Override // p.syc
    public final ily0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyc) && this.a.equals(((pyc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
