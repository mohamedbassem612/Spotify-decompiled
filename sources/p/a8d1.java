package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class a8d1 extends onm implements jv30 {
    private final int arity;

    public a8d1(int i, lnm lnmVar) {
        super(lnmVar);
        this.arity = i;
    }

    @Override // p.jv30
    public int getArity() {
        return this.arity;
    }

    @Override // p.faa
    public String toString() {
        return getCompletion() == null ? rc11.a.k(this) : super.toString();
    }
}
