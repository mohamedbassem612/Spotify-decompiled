package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rqs0 extends kqs0 {
    public final oqs0 e;
    public Object f;
    public boolean g;
    public int h;

    /* JADX WARN: Illegal instructions before constructor call */
    public rqs0(oqs0 oqs0Var) {
        Object obj = oqs0Var.b;
        ips0 ips0Var = oqs0Var.d;
        super(obj, ips0Var, (byte) 1);
        this.e = oqs0Var;
        this.h = ips0Var.e;
    }

    public final Object next() {
        if (this.e.d.e != this.h) {
            eg.d();
            return null;
        }
        Object next = super.next();
        this.f = next;
        this.g = true;
        return next;
    }

    public final void remove() {
        if (!this.g) {
            bhn0.w();
            return;
        }
        Object obj = this.f;
        oqs0 oqs0Var = this.e;
        w0h1.i(oqs0Var).remove(obj);
        this.f = null;
        this.g = false;
        this.h = oqs0Var.d.e;
        ((kqs0) this).d--;
    }
}
