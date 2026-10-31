package p;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v611 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public v611(RecyclerView recyclerView) {
        this.g = recyclerView;
        y511 y511Var = RecyclerView.j2;
        this.d = y511Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), y511Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        y511 y511Var = RecyclerView.j2;
        if (interpolator != y511Var) {
            this.d = y511Var;
            this.c = new OverScroller(recyclerView.getContext(), y511Var);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = b8k1.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.j2;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.U1;
        if (recyclerView.Q0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.t();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.a;
            int i7 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iS = RecyclerView.s(i6, recyclerView.l1, recyclerView.n1, recyclerView.getWidth());
            int iS2 = RecyclerView.s(i7, recyclerView.m1, recyclerView.o1, recyclerView.getHeight());
            int[] iArr2 = recyclerView.U1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.z(iS, iS2, 1, iArr2, null)) {
                iS -= iArr[0];
                iS2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.r(iS, iS2);
            }
            if (recyclerView.P0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(iS, iS2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iS - i8;
                int i11 = iS2 - i9;
                wic0 wic0Var = recyclerView.Q0.e;
                if (wic0Var != null && !wic0Var.f() && wic0Var.g()) {
                    int iB = recyclerView.H1.b();
                    if (iB == 0) {
                        wic0Var.m();
                    } else if (wic0Var.e() >= iB) {
                        wic0Var.k(iB - 1);
                        wic0Var.h(i8, i9);
                    } else {
                        wic0Var.h(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iS;
                i2 = iS2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.S0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.U1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.A(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.B(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            wic0 wic0Var2 = recyclerView.Q0.e;
            if ((wic0Var2 == null || !wic0Var2.f()) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.D();
                        if (recyclerView.l1.isFinished()) {
                            recyclerView.l1.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.E();
                        if (recyclerView.n1.isFinished()) {
                            recyclerView.n1.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.F();
                        if (recyclerView.m1.isFinished()) {
                            recyclerView.m1.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.C();
                        if (recyclerView.o1.isFinished()) {
                            recyclerView.o1.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = b8k1.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.h2) {
                    recyclerView.G1.i();
                }
            } else {
                b();
                d440 d440Var = recyclerView.F1;
                if (d440Var != null) {
                    d440Var.a(recyclerView, i3, i4);
                }
            }
        }
        wic0 wic0Var3 = recyclerView.Q0.e;
        if (wic0Var3 != null && wic0Var3.f()) {
            wic0Var3.h(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.a(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = b8k1.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
