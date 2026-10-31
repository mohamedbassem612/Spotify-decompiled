package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qqs0 extends pqs0 {
    public final nqs0 e;
    public Object f;
    public boolean g;
    public int h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, p.hps0] */
    public qqs0(nqs0 nqs0Var) {
        Object obj = nqs0Var.b;
        ?? r1 = nqs0Var.d;
        super(obj, (Map) r1);
        this.e = nqs0Var;
        this.h = r1.e;
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
        nqs0 nqs0Var = this.e;
        nqs0Var.remove(obj);
        this.f = null;
        this.g = false;
        this.h = nqs0Var.d.e;
        ((pqs0) this).b--;
    }
}
