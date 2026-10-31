package p;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class cw50 extends vck1 {
    public uu1 c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    @Override // p.e3n
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        WeakReference weakReference;
        View view2;
        int iFindPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.g) > this.h) {
                    this.g = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.f = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
                    if (baseBehavior.o == null) {
                    }
                    this.e = z;
                    if (z) {
                        this.g = y;
                        this.f = motionEvent.getPointerId(0);
                        if (this.i == null) {
                            this.i = VelocityTracker.obtain();
                        }
                        overScroller = this.d;
                        if (overScroller != null) {
                            this.d.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                AppBarLayout.BaseBehavior baseBehavior2 = (AppBarLayout.BaseBehavior) this;
                z = (baseBehavior2.o == null || (weakReference = baseBehavior2.n) == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.p(view, x2, y);
                this.e = z;
                if (z) {
                    this.g = y;
                    this.f = motionEvent.getPointerId(0);
                    if (this.i == null) {
                        this.i = VelocityTracker.obtain();
                    }
                    overScroller = this.d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101 A[ADDED_TO_REGION] */
    @Override // p.e3n
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        cw50 cw50Var = this;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(cw50Var.f);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = cw50Var.g - y;
                    cw50Var.g = y;
                    cw50Var.x(coordinatorLayout, view, cw50Var.w() - i, -((AppBarLayout) view).getDownNestedScrollRange(), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    cw50Var.f = motionEvent.getPointerId(i2);
                    cw50Var.g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = cw50Var.i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !cw50Var.e || z;
        }
        VelocityTracker velocityTracker3 = cw50Var.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            cw50Var.i.computeCurrentVelocity(1000);
            float yVelocity = cw50Var.i.getYVelocity(cw50Var.f);
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = -appBarLayout.getTotalScrollRange();
            uu1 uu1Var = cw50Var.c;
            if (uu1Var != null) {
                view.removeCallbacks(uu1Var);
                cw50Var.c = null;
            }
            OverScroller overScroller = cw50Var.d;
            if (overScroller == null) {
                overScroller = new OverScroller(view.getContext());
                cw50Var.d = overScroller;
            }
            overScroller.fling(0, cw50Var.t(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (cw50Var.d.computeScrollOffset()) {
                uu1 uu1Var2 = new uu1(this, coordinatorLayout, view, false, (byte) 17);
                cw50Var = this;
                cw50Var.c = uu1Var2;
                WeakHashMap weakHashMap = b8k1.a;
                view.postOnAnimation(uu1Var2);
            } else {
                ((AppBarLayout.BaseBehavior) cw50Var).D(coordinatorLayout, appBarLayout);
                if (appBarLayout.O0) {
                    appBarLayout.f(appBarLayout.g(AppBarLayout.BaseBehavior.A(coordinatorLayout)));
                }
            }
            z = true;
        }
        cw50Var.e = false;
        cw50Var.f = -1;
        velocityTracker = cw50Var.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            cw50Var.i = null;
        }
        velocityTracker2 = cw50Var.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (cw50Var.e) {
        }
        z = false;
        cw50Var.e = false;
        cw50Var.f = -1;
        velocityTracker = cw50Var.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            cw50Var.i = null;
        }
        velocityTracker2 = cw50Var.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (cw50Var.e) {
        }
    }

    public abstract int w();

    public abstract int x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    public final void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
