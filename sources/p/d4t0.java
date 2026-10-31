package p;

import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d4t0 extends udk1 {
    public int a = -1;
    public ka0 b;
    public final /* synthetic */ ViewPager2 c;
    public final /* synthetic */ f4t0 d;

    public d4t0(ViewPager2 viewPager2, f4t0 f4t0Var) {
        this.c = viewPager2;
        this.d = f4t0Var;
    }

    @Override // p.udk1
    public final void a(int i) {
        if (i == 0) {
            ka0 ka0Var = this.b;
            if (ka0Var != null) {
                ka0Var.invoke();
            }
            this.b = null;
        }
    }

    @Override // p.udk1
    public final void b(int i, int i2, float f) {
        f4t0 f4t0Var = this.d;
        phi0 phi0Var = f4t0Var.a;
        if (!f4t0Var.Q0 || i2 < ((ConstraintLayout) phi0Var.d).getContext().getResources().getDimensionPixelSize(2131166159)) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) phi0Var.b;
        linearLayout.animate().alpha(0.0f).setDuration(250L).setInterpolator(new LinearInterpolator()).withEndAction(new ai(linearLayout, (byte) 4)).start();
    }

    @Override // p.udk1
    public final void c(int i) {
        b4t0 b4t0Var = (b4t0) this.c.getAdapter();
        if (this.a != i) {
            f4t0 f4t0Var = this.d;
            f4t0Var.X.o.m((Object) null, Integer.valueOf(i));
            ka0 ka0Var = new ka0(f4t0Var, i, b4t0Var, this, (byte) 10);
            if (((ViewPager2) f4t0Var.a.c).getScrollState() != 0) {
                this.b = ka0Var;
            } else {
                ka0Var.invoke();
            }
        }
    }
}
