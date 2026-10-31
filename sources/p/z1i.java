package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class z1i implements qzh {
    public final idd1 a;
    public Object b;

    public z1i(u0i u0iVar) {
        this.a = new idd1(new vjh(u0iVar, (byte) 5));
    }

    public vu30 a() {
        return gsh.Z;
    }

    public iu30 b() {
        return v160.i;
    }

    public final void f(Object obj) {
        this.b = obj;
        ((qzh) this.a.getValue()).f(b().invoke(obj));
    }

    public final View getView() {
        return ((qzh) this.a.getValue()).getView();
    }

    public final void n(iu30 iu30Var) {
        ((qzh) this.a.getValue()).n(new puh(this, iu30Var, (byte) 3));
    }
}
