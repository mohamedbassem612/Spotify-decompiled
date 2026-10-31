package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gmo implements cmo {
    public final mmo a;
    public final int b;
    public final int c;
    public final dg30 d;
    public final yun0 e;
    public View g;
    public final znb0 f = dm5.S(3, new emo(this, (byte) 0));
    public final y22 h = new y22(this, (byte) 5);
    public final kdn0 i = new kdn0();
    public final fmo j = new fmo(this, (byte) 0);

    public gmo(mmo mmoVar, int i, int i2, dg30 dg30Var, iac0 iac0Var, akr akrVar, yun0 yun0Var) {
        this.a = mmoVar;
        this.b = i;
        this.c = i2;
        this.d = dg30Var;
        this.e = yun0Var;
        akrVar.w.f(iac0Var, new z11(this, (byte) 11));
        iac0Var.getLifecycle().a(new dmo(this));
    }

    @Override // p.cmo
    public final ymd0 a() {
        return this.i;
    }

    public final View b(e6w0 e6w0Var) {
        boolean z = e6w0Var instanceof c6w0;
        znb0 znb0Var = this.f;
        if (z) {
            View viewC = c(this.c);
            return viewC == null ? (View) znb0Var.getValue() : viewC;
        }
        if (e6w0Var instanceof b6w0) {
            return (View) znb0Var.getValue();
        }
        View viewC2 = c(this.b);
        return viewC2 == null ? (View) znb0Var.getValue() : viewC2;
    }

    public final View c(int i) {
        View view = this.g;
        if (view != null && view.getId() == i) {
            return view;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.h;
        if (view != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.g = null;
        View viewFindViewById = this.d.findViewById(i);
        if (viewFindViewById != null && viewFindViewById.isAttachedToWindow()) {
            this.g = viewFindViewById;
            viewFindViewById.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        return viewFindViewById;
    }
}
