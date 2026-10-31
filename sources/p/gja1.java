package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gja1 {
    public Object[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public fja1 f;
    public eja1 g;
    public int h;

    public final void a() {
        if (this.b != null) {
            eg.m("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
            return;
        }
        fja1 fja1Var = this.f;
        if (fja1Var instanceof eja1) {
            ((eja1) fja1Var).b.a();
        }
        fja1 fja1Var2 = this.f;
        eja1 eja1Var = this.g;
        if (fja1Var2 == eja1Var) {
            this.f = eja1Var.a;
        }
    }
}
