package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f1p1 {
    public Object a;
    public z9p1 b;
    public wdp1 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        z9p1 z9p1Var = this.b;
        if (z9p1Var != null) {
            w7p1 w7p1Var = z9p1Var.b;
            w7p1Var.getClass();
            if (obj == null) {
                obj = fzo1.g;
            }
            if (fzo1.f.D(w7p1Var, null, obj)) {
                fzo1.d(w7p1Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        wdp1 wdp1Var;
        z9p1 z9p1Var = this.b;
        if (z9p1Var != null && !z9p1Var.b.isDone()) {
            z9p1Var.a(new m9("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), (byte) 8));
        }
        if (this.d || (wdp1Var = this.c) == null) {
            return;
        }
        wdp1Var.i(null);
    }
}
