package p;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rk80 extends jme implements Runnable, k1q0, View.OnAttachStateChangeListener {
    public final osl1 c;
    public boolean d;
    public boolean e;
    public hsl1 f;

    public rk80(osl1 osl1Var) {
        super(!osl1Var.u ? 1 : 0);
        this.c = osl1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // p.jme
    public final void r0(mrl1 mrl1Var) {
        this.d = false;
        this.e = false;
        hsl1 hsl1Var = this.f;
        if (mrl1Var.a.b() > 0 && hsl1Var != null) {
            esl1 esl1Var = hsl1Var.a;
            osl1 osl1Var = this.c;
            osl1Var.t.f(cev0.L(esl1Var.i(8)));
            osl1Var.s.f(cev0.L(esl1Var.i(8)));
            osl1.b(osl1Var, hsl1Var);
        }
        this.f = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            hsl1 hsl1Var = this.f;
            if (hsl1Var != null) {
                osl1 osl1Var = this.c;
                osl1Var.t.f(cev0.L(hsl1Var.a.i(8)));
                osl1.b(osl1Var, hsl1Var);
                this.f = null;
            }
        }
    }

    @Override // p.jme
    public final void s0(mrl1 mrl1Var) {
        this.d = true;
        this.e = true;
    }

    @Override // p.jme
    public final hsl1 t0(hsl1 hsl1Var, List list) {
        osl1 osl1Var = this.c;
        osl1.b(osl1Var, hsl1Var);
        return osl1Var.u ? hsl1.b : hsl1Var;
    }

    @Override // p.jme
    public final frl1 u0(mrl1 mrl1Var, frl1 frl1Var) {
        this.d = false;
        return frl1Var;
    }

    public final hsl1 x(View view, hsl1 hsl1Var) {
        this.f = hsl1Var;
        osl1 osl1Var = this.c;
        psi1 psi1Var = osl1Var.s;
        esl1 esl1Var = hsl1Var.a;
        psi1Var.f(cev0.L(esl1Var.i(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            osl1Var.t.f(cev0.L(esl1Var.i(8)));
            osl1.b(osl1Var, hsl1Var);
        }
        return osl1Var.u ? hsl1.b : hsl1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
