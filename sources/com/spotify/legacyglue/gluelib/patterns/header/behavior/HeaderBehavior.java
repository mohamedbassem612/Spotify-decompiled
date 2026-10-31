package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.ago1;
import p.b8k1;
import p.dw50;
import p.e160;
import p.hd;
import p.jw40;
import p.lc20;
import p.o0c;
import p.o6o0;
import p.os00;
import p.sok;
import p.uck1;
import p.wck1;
import p.xt41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class HeaderBehavior<T extends View & jw40> extends uck1 {
    public boolean d;
    public int f;
    public VelocityTracker h;
    public ValueAnimator j;
    public int k;
    public int m;
    public boolean n;
    public int e = -1;
    public int g = -1;
    public final lc20 i = new lc20((byte) 26);
    public float l = -2.1474836E9f;

    public HeaderBehavior() {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (motionEvent.getAction() == 0) {
            this.i.p();
        }
        if (this.g < 0) {
            this.g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.d) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = false;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (u() > (-this.m) - this.k && ago1.n(coordinatorLayout).j() && coordinatorLayout.p(view, x, y)) {
                this.f = y;
                this.e = motionEvent.getPointerId(0);
                if (this.h == null) {
                    this.h = VelocityTracker.obtain();
                }
            }
        } else if (actionMasked == 1) {
            w();
        } else if (actionMasked == 2) {
            int i = this.e;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f) > this.g) {
                    this.d = true;
                    this.f = y2;
                }
            }
        } else if (actionMasked == 3) {
            w();
        }
        VelocityTracker velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.d;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.h(coordinatorLayout, view, i);
        wck1 wck1Var = ((uck1) this).a;
        jw40 jw40Var = (jw40) view;
        wck1Var.e = -jw40Var.getTotalScrollRange();
        wck1Var.f = 0;
        wck1Var.g = true;
        if (this.l != -2.1474836E9f) {
            wck1 wck1Var2 = ((uck1) this).a;
            int i2 = (int) (((-jw40Var.getTotalScrollRange()) - this.k) * this.l);
            if (wck1Var2.d != i2) {
                wck1Var2.d = i2;
                wck1Var2.a();
            }
        }
        int iU = u();
        view.setAlpha(1.0f);
        int iMin = Math.min(-iU, jw40Var.getTotalScrollRange());
        ((xt41) view).a(iMin / jw40Var.getTotalScrollRange(), iMin);
        this.m = jw40Var.getTotalScrollRange();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        View childAt;
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) coordinatorLayout;
        int childCount = glueHeaderLayout.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                childAt = null;
                break;
            }
            childAt = glueHeaderLayout.getChildAt(i4);
            if (childAt.getLayoutParams().a instanceof GlueHeaderAccessoryBehavior) {
                break;
            }
            i4++;
        }
        if (childAt != null) {
            coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), childAt);
            int measuredHeight = childAt.getMeasuredHeight() / 2;
            if (view instanceof hd) {
                ((hd) view).setCoordinatorAccessoryOffset(measuredHeight);
            }
        }
        if (childAt != null) {
            this.k = childAt.getMeasuredHeight() / 2;
            return false;
        }
        if (view instanceof hd) {
            ((hd) view).setCoordinatorAccessoryOffset(0);
        }
        this.k = 0;
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i2 >= 0 || u() > (-this.m) - this.k) {
            jw40 jw40Var = (jw40) view;
            int i4 = (-jw40Var.getTotalScrollRange()) - this.k;
            x(view);
            int iU = u() - i2;
            int i5 = 0;
            int iMax = Math.max(i4, Math.min(iU, 0));
            int i6 = (-jw40Var.getTotalScrollRange()) - this.k;
            x(view);
            int iU2 = u();
            int iMax2 = Math.max(i6, Math.min(iU, 0));
            if (iU2 >= i6 && iU2 <= 0 && iU2 != iMax2) {
                int iU3 = u();
                v(iMax);
                view.setAlpha(1.0f);
                int iMin = Math.min(-iMax, jw40Var.getTotalScrollRange());
                ((xt41) view).a(iMin / jw40Var.getTotalScrollRange(), iMin);
                coordinatorLayout.f(view);
                i5 = iU3 - iMax;
            }
            iArr[1] = i5;
        }
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (i < 0) {
            jw40 jw40Var = (jw40) view;
            int i2 = (-jw40Var.getTotalScrollRange()) - this.k;
            x(view);
            int iU = u() - i;
            int iMax = Math.max(i2, Math.min(iU, 0));
            int i3 = (-jw40Var.getTotalScrollRange()) - this.k;
            x(view);
            int iU2 = u();
            int iMax2 = Math.max(i3, Math.min(iU, 0));
            if (iU2 >= i3 && iU2 <= 0 && iU2 != iMax2) {
                u();
                v(iMax);
                view.setAlpha(1.0f);
                int iMin = Math.min(-iMax, jw40Var.getTotalScrollRange());
                ((xt41) view).a(iMin / jw40Var.getTotalScrollRange(), iMin);
                coordinatorLayout.f(view);
            }
        }
        boolean z = i < 0;
        boolean z2 = i > 0;
        int iU3 = u() - i;
        int i4 = (-((jw40) view).getTotalScrollRange()) - this.k;
        x(view);
        int iU4 = u();
        boolean z3 = iU4 < i4 || iU4 > 0 || iU4 == Math.max(i4, Math.min(iU3, 0));
        if ((z && z3) || z2) {
            WeakHashMap weakHashMap = b8k1.a;
            if (view2 instanceof o6o0) {
                ((o6o0) view2).a(1);
            }
        }
    }

    public final void o(View view, Parcelable parcelable) {
        if (!(parcelable instanceof dw50)) {
            this.l = -2.1474836E9f;
            return;
        }
        dw50 dw50Var = (dw50) parcelable;
        dw50Var.getSuperState();
        boolean z = dw50Var.b;
        this.n = z;
        this.l = z ? 1.0f : dw50Var.a;
    }

    public final Parcelable p(View view) {
        this.n = u() <= (-this.m) - this.k;
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        int iU = u();
        float totalScrollRange = ((jw40) view).getTotalScrollRange();
        boolean z = this.n;
        dw50 dw50Var = new dw50(absSavedState);
        dw50Var.a = o0c.t(0.0f, 1.0f, Math.abs(iU / totalScrollRange));
        dw50Var.b = z;
        return dw50Var;
    }

    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.l = -2.1474836E9f;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.g < 0) {
            this.g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (coordinatorLayout.p(view, x, y) && u() > (-this.m) - this.k && ago1.n(coordinatorLayout).j()) {
                this.f = y;
                this.e = motionEvent.getPointerId(0);
                if (this.h == null) {
                    this.h = VelocityTracker.obtain();
                }
                velocityTracker = this.h;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return true;
            }
            return false;
        }
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.h;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.h.computeCurrentVelocity(1000);
                float yVelocity = this.h.getYVelocity(this.e);
                int i = -(((jw40) view).getTotalScrollRange() + this.k);
                int iU = u();
                lc20 lc20Var = new lc20(this, coordinatorLayout, view, false, (byte) 25);
                lc20 lc20Var2 = this.i;
                lc20Var2.p();
                Scroller scroller = (Scroller) lc20Var2.c;
                if (scroller == null) {
                    scroller = new Scroller(view.getContext(), sok.a);
                    lc20Var2.c = scroller;
                }
                scroller.fling(0, iU, 0, Math.round(yVelocity), 0, 0, os00.INVALID_ID, Alert.DURATION_SHOW_INDEFINITELY);
                if (((Scroller) lc20Var2.c).computeScrollOffset()) {
                    e160 e160Var = new e160(lc20Var2, view, i, lc20Var);
                    lc20Var2.b = e160Var;
                    WeakHashMap weakHashMap = b8k1.a;
                    view.postOnAnimation(e160Var);
                    lc20Var2.d = new WeakReference(view);
                } else {
                    lc20Var2.b = null;
                }
            }
            w();
        } else {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.e);
                if (iFindPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f - y2;
                    if (!this.d) {
                        int iAbs = Math.abs(i2);
                        int i3 = this.g;
                        if (iAbs > i3) {
                            this.d = true;
                            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                        }
                    }
                    if (this.d) {
                        this.f = y2;
                        jw40 jw40Var = (jw40) view;
                        int i4 = (-jw40Var.getTotalScrollRange()) - this.k;
                        x(view);
                        int iU2 = u() - i2;
                        int iMax = Math.max(i4, Math.min(iU2, 0));
                        int i5 = (-jw40Var.getTotalScrollRange()) - this.k;
                        x(view);
                        int iU3 = u();
                        int iMax2 = Math.max(i5, Math.min(iU2, 0));
                        if (iU3 >= i5 && iU3 <= 0 && iU3 != iMax2) {
                            u();
                            v(iMax);
                            view.setAlpha(1.0f);
                            jw40 jw40Var2 = (jw40) view;
                            int iMin = Math.min(-iMax, jw40Var2.getTotalScrollRange());
                            ((xt41) view).a(iMin / jw40Var2.getTotalScrollRange(), iMin);
                            coordinatorLayout.f(view);
                        }
                    }
                }
                return false;
            }
            if (actionMasked == 3) {
                w();
            }
        }
        velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return true;
    }

    public final void w() {
        this.d = false;
        this.e = -1;
        VelocityTracker velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h = null;
        }
    }

    public final void x(View view) {
        wck1 wck1Var = ((uck1) this).a;
        if (wck1Var == null) {
            return;
        }
        wck1Var.e = -((jw40) view).getTotalScrollRange();
        wck1Var.f = 0;
        wck1Var.g = true;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
    }
}
