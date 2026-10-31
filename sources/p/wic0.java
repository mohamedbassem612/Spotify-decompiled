package p;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class wic0 {
    public int a = -1;
    public RecyclerView b;
    public a c;
    public boolean d;
    public boolean e;
    public View f;
    public final q611 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public wic0(Context context) {
        q611 q611Var = new q611();
        q611Var.d = -1;
        q611Var.f = false;
        q611Var.a = 0;
        q611Var.b = 0;
        q611Var.c = os00.INVALID_ID;
        q611Var.e = null;
        this.g = q611Var;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            hhg1.n("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int c(int i) {
        float fAbs = Math.abs(i);
        if (!this.l) {
            this.m = b(this.k);
            this.l = true;
        }
        return (int) Math.ceil(fAbs * this.m);
    }

    public PointF d(int i) {
        r611 r611Var = this.c;
        if (r611Var instanceof r611) {
            return r611Var.a(i);
        }
        return null;
    }

    public final int e() {
        return this.a;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    public final void h(int i, int i2) {
        PointF pointFD;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            m();
        }
        if (this.d && this.f == null && this.c != null && (pointFD = d(this.a)) != null) {
            float f = pointFD.x;
            if (f != 0.0f || pointFD.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f), (int) Math.signum(pointFD.y), (int[]) null);
            }
        }
        this.d = false;
        View view = this.f;
        q611 q611Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                s611 s611Var = recyclerView.H1;
                j(view2, q611Var);
                q611Var.a(recyclerView);
                m();
            } else {
                this.f = null;
            }
        }
        if (this.e) {
            s611 s611Var2 = recyclerView.H1;
            if (this.b.Q0.I() == 0) {
                m();
            } else {
                int i3 = this.n;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.n = i4;
                int i5 = this.o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.o = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFD2 = d(this.a);
                    if (pointFD2 != null) {
                        float f2 = pointFD2.x;
                        if (f2 == 0.0f && pointFD2.y == 0.0f) {
                            q611Var.d = this.a;
                            m();
                        } else {
                            float f3 = pointFD2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFD2.x / fSqrt;
                            pointFD2.x = f4;
                            float f5 = pointFD2.y / fSqrt;
                            pointFD2.y = f5;
                            this.j = pointFD2;
                            this.n = (int) (f4 * 10000.0f);
                            this.o = (int) (f5 * 10000.0f);
                            int iC = c(10000);
                            int i7 = (int) (this.n * 1.2f);
                            int i8 = (int) (this.o * 1.2f);
                            q611Var.a = i7;
                            q611Var.b = i8;
                            q611Var.c = (int) (iC * 1.2f);
                            q611Var.e = this.h;
                            q611Var.f = true;
                        }
                    } else {
                        q611Var.d = this.a;
                        m();
                    }
                }
            }
            boolean z = q611Var.d >= 0;
            q611Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.E1.b();
            }
        }
    }

    public final void i(View view) {
        this.b.getClass();
        if (RecyclerView.S(view) == this.a) {
            this.f = view;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    public void j(View view, q611 q611Var) {
        int i;
        wic0 wic0Var;
        int iA;
        int i2;
        PointF pointF = this.j;
        int iA2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        a aVar = this.c;
        if (aVar == null || !aVar.q()) {
            wic0Var = this;
            iA = 0;
        } else {
            g611 layoutParams = view.getLayoutParams();
            wic0Var = this;
            iA = wic0Var.a(a.M(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, a.P(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.getPaddingLeft(), aVar.O0 - aVar.getPaddingRight(), i);
        }
        PointF pointF2 = wic0Var.j;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        } else {
            i2 = 0;
        }
        a aVar2 = wic0Var.c;
        if (aVar2 != null && aVar2.r()) {
            g611 layoutParams2 = view.getLayoutParams();
            iA2 = wic0Var.a(a.Q(view) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, a.L(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, aVar2.getPaddingTop(), aVar2.P0 - aVar2.getPaddingBottom(), i2);
        }
        int iCeil = (int) Math.ceil(((double) wic0Var.c((int) Math.sqrt((iA2 * iA2) + (iA * iA)))) / 0.3356d);
        if (iCeil > 0) {
            q611Var.a = -iA;
            q611Var.b = -iA2;
            q611Var.c = iCeil;
            q611Var.e = wic0Var.i;
            q611Var.f = true;
        }
    }

    public final void k(int i) {
        this.a = i;
    }

    public final void l(RecyclerView recyclerView, a aVar) {
        Runnable runnable = recyclerView.E1;
        ((v611) runnable).g.removeCallbacks(runnable);
        ((v611) runnable).c.abortAnimation();
        this.b = recyclerView;
        this.c = aVar;
        int i = this.a;
        if (i == -1) {
            hhg1.n("Invalid target position");
            return;
        }
        recyclerView.H1.a = i;
        this.e = true;
        this.d = true;
        this.f = recyclerView.Q0.D(i);
        this.b.E1.b();
    }

    public final void m() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.b.H1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            a aVar = this.c;
            if (aVar.e == this) {
                aVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
