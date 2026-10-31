package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w280 extends w6 {
    public final b380 d;

    public w280(int i, b380 b380Var) {
        super(b380Var.size(), i);
        this.d = b380Var;
    }

    @Override // p.w6
    public final Object a(int i) {
        return this.d.get(i);
    }
}
