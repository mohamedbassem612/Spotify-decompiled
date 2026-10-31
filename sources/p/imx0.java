package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class imx0 {
    public final cbv a;
    public final i8h1 b;
    public final h0p0 c;
    public ViewGroup d;
    public View e;
    public View f;
    public boolean g;
    public String h;
    public final LinearInterpolator i = new LinearInterpolator();
    public final hmx0 j = new hmx0(this, (byte) 1);
    public final hmx0 k = new hmx0(this, (byte) 0);

    public imx0(cbv cbvVar, i8h1 i8h1Var, h0p0 h0p0Var) {
        this.a = cbvVar;
        this.b = i8h1Var;
        this.c = h0p0Var;
    }

    public final glg1 a(View view, View view2) {
        glg1 glg1Var = new glg1();
        glg1Var.Y(0);
        db91 db91Var = new db91(80);
        ((jhg1) db91Var).c = 500L;
        LinearInterpolator linearInterpolator = this.i;
        ((jhg1) db91Var).d = linearInterpolator;
        db91Var.b(view2);
        glg1Var.U(db91Var);
        db91 db91Var2 = new db91(48);
        ((jhg1) db91Var2).c = 500L;
        ((jhg1) db91Var2).d = linearInterpolator;
        db91Var2.b(view);
        glg1Var.U(db91Var2);
        return glg1Var;
    }

    public final void b() {
        View view;
        View view2;
        ViewGroup viewGroup = this.d;
        if (viewGroup == null || (view = this.e) == null || (view2 = this.f) == null) {
            return;
        }
        viewGroup.removeCallbacks(this.k);
        if (this.g) {
            this.g = false;
            fjg1.a(viewGroup, a(view, view2));
            view2.setVisibility(4);
            view.setVisibility(0);
        }
    }

    public final void c() {
        ViewGroup viewGroup = this.d;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeCallbacks(this.j);
        viewGroup.removeCallbacks(this.k);
        if (viewGroup.isAttachedToWindow()) {
            fjg1.b(viewGroup);
        }
        if (this.g) {
            this.g = false;
            View view = this.f;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.e;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    public final void d(String str, ViewGroup viewGroup, View view, View view2) {
        if (this.g) {
            return;
        }
        this.d = viewGroup;
        this.e = view;
        this.f = view2;
        this.g = true;
        this.h = str;
        hmx0 hmx0Var = this.k;
        viewGroup.removeCallbacks(hmx0Var);
        viewGroup.postDelayed(this.j, 500L);
        viewGroup.postDelayed(hmx0Var, 5500L);
    }
}
