package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dq91 extends k611 implements j611, View.OnLayoutChangeListener, qfz0 {
    public String N0;
    public int O0;
    public pfz0 P0 = pfz0.a;
    public int X;
    public int Y;
    public Boolean Z;
    public final RecyclerView a;
    public final kl1 b;
    public final agz0 c;
    public final cgz0 d;
    public final bgz0 e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int t;

    public dq91(ViewGroup viewGroup, RecyclerView recyclerView, kl1 kl1Var, agz0 agz0Var, cgz0 cgz0Var, bgz0 bgz0Var) {
        this.a = recyclerView;
        this.b = kl1Var;
        this.c = agz0Var;
        this.d = cgz0Var;
        this.e = bgz0Var;
        viewGroup.removeAllViews();
        viewGroup.addView((View) agz0Var, -1, -2);
        recyclerView.T0.remove(this);
        if (recyclerView.U0 == this) {
            recyclerView.U0 = null;
        }
        recyclerView.p0(this);
        recyclerView.removeOnLayoutChangeListener(this);
        recyclerView.l(this);
        recyclerView.m(this);
        recyclerView.addOnLayoutChangeListener(this);
    }

    public final pfz0 a() {
        return this.P0;
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        Boolean boolValueOf = this.Z;
        agz0 agz0Var = this.c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(agz0Var.getContext().getResources().getConfiguration().getLayoutDirection() == 1);
        }
        this.Z = boolValueOf;
        if (motionEvent.getAction() != 0) {
            return this.f;
        }
        boolean z = agz0Var.getVisibility() == 0 && agz0Var.getAlpha() != 0.0f && j(motionEvent.getX(), motionEvent.getY());
        boolean z2 = this.f;
        if (!z2 && z) {
            this.h = (int) motionEvent.getY();
            this.f = true;
            return true;
        }
        if (!z2 || z) {
            return z2;
        }
        this.f = false;
        i();
        kl1 kl1Var = this.b;
        Handler handler = (Handler) kl1Var.e;
        xfz0 xfz0Var = (xfz0) kl1Var.f;
        handler.removeCallbacks(xfz0Var);
        handler.postDelayed(xfz0Var, 1600L);
        kl1Var.z(1600L);
        return false;
    }

    public final void c(RecyclerView recyclerView, int i) {
        this.g = i;
        if (i != 0 || this.f) {
            return;
        }
        this.b.z(1600L);
    }

    public final void e(int i) {
        if (this.O0 != i) {
            this.O0 = i;
            m(false);
        }
    }

    public final void f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        kl1 kl1Var = this.b;
        if (action == 0) {
            agz0 agz0Var = this.c;
            if (agz0Var.getVisibility() == 0 && agz0Var.getAlpha() != 0.0f && j(motionEvent.getX(), motionEvent.getY())) {
                this.f = true;
                this.h = (int) motionEvent.getY();
                kl1Var.t(i());
                return;
            }
            return;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 2 && this.f) {
                n(motionEvent.getY());
                return;
            }
            return;
        }
        if (this.f) {
            this.h = 0;
            this.f = false;
            i();
            Handler handler = (Handler) kl1Var.e;
            xfz0 xfz0Var = (xfz0) kl1Var.f;
            handler.removeCallbacks(xfz0Var);
            handler.postDelayed(xfz0Var, 1600L);
            kl1Var.z(1600L);
        }
    }

    public final void g(pfz0 pfz0Var) {
        this.P0 = pfz0Var;
        l();
    }

    public final void h(RecyclerView recyclerView, int i, int i2) {
        if (i2 != 0) {
            if (this.f || this.g != 0) {
                m(true);
            }
        }
    }

    public final int i() {
        LinearLayoutManager layoutManager = this.a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.f1();
        }
        return -1;
    }

    public final boolean j(float f, float f2) {
        boolean zJ = u890.j(this.Z, Boolean.TRUE);
        agz0 agz0Var = this.c;
        if (zJ) {
            if (f >= Math.max(agz0Var.getHandleHeight(), agz0Var.getHandleWidth())) {
                return false;
            }
        } else if (f <= this.X - Math.max(agz0Var.getHandleHeight(), agz0Var.getHandleWidth())) {
            return false;
        }
        return k(f2);
    }

    public final boolean k(float f) {
        int i = this.t;
        agz0 agz0Var = this.c;
        if (f >= i - (Math.max(agz0Var.getHandleHeight(), agz0Var.getHandleWidth()) / 2)) {
            return f <= ((float) ((Math.max(agz0Var.getHandleHeight(), agz0Var.getHandleWidth()) / 2) + this.t));
        }
        return false;
    }

    public final void l() {
        int iOrdinal = this.P0.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            i = 2;
        }
        this.c.y(new vfz0(i, this.N0));
    }

    public final void m(boolean z) {
        RecyclerView recyclerView = this.a;
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
        if (iComputeVerticalScrollRange == 0) {
            return;
        }
        float f = iComputeVerticalScrollOffset / iComputeVerticalScrollRange;
        int i = this.Y - this.O0;
        agz0 agz0Var = this.c;
        float handleHeight = f * (i - agz0Var.getHandleHeight());
        this.t = (agz0Var.getHandleHeight() / 2) + ((int) handleHeight);
        kl1 kl1Var = this.b;
        agz0 agz0Var2 = (agz0) kl1Var.b;
        if (agz0Var2 != null) {
            agz0Var2.setTranslationY(handleHeight);
        }
        i();
        boolean z2 = this.f;
        bgz0 bgz0Var = this.e;
        if (z2 || !bgz0Var.a()) {
            if (!this.f && z) {
                kl1Var.A();
            }
        } else if (!kl1Var.u()) {
            kl1Var.z(0L);
        }
        int i2 = i();
        if (this.f && !bgz0Var.a()) {
            this.N0 = this.d.e(i2);
            l();
        }
        int i3 = this.i;
        int i4 = this.h;
        if (i3 == i4 || !this.f || k(i4)) {
            return;
        }
        int i5 = this.h;
        this.i = i5;
        n(i5);
    }

    public final void n(float f) {
        int i;
        int i2;
        agz0 agz0Var = this.c;
        int handleHeight = agz0Var.getHandleHeight() / 2;
        tr80 tr80Var = new tr80(handleHeight, (this.Y - this.O0) - (agz0Var.getHandleHeight() / 2), 1);
        int iQ = yoi1.q((int) f, tr80Var);
        if (Math.abs(this.t - f) < 2.0f) {
            return;
        }
        float f2 = this.t;
        float f3 = iQ;
        RecyclerView recyclerView = this.a;
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int i3 = iComputeVerticalScrollRange - this.Y;
        int i4 = (int) f3;
        if (i4 == handleHeight) {
            i = -iComputeVerticalScrollOffset;
        } else {
            int i5 = ((rr80) tr80Var).b;
            if (i4 == i5) {
                i = i3 - iComputeVerticalScrollOffset;
            } else {
                int i6 = i5 - handleHeight;
                if (i6 == 0 || (i2 = iComputeVerticalScrollOffset + (i = (int) (((f3 - f2) / i6) * i3))) < 0 || i2 >= i3) {
                    i = 0;
                }
            }
        }
        this.h = iQ;
        if (i != 0) {
            recyclerView.scrollBy(0, i);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null && view.getHeight() == this.Y && view.getWidth() == this.X) {
            return;
        }
        this.Y = view != null ? view.getHeight() : 0;
        this.X = view != null ? view.getWidth() : 0;
    }

    public final void d(boolean z) {
    }
}
