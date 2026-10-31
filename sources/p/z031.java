package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class z031 extends n031 implements jv30 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public z031(int i, lnm lnmVar) {
        super(lnmVar);
        this.a = i;
    }

    @Override // p.jv30
    public final int getArity() {
        return this.a;
    }

    @Override // p.faa
    public final String toString() {
        return getCompletion() == null ? rc11.a.k(this) : super.toString();
    }
}
