package p;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k8k1 {
    public static final aja x = new aja((byte) 3);
    public byte a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f62p;
    public byte q;
    public final OverScroller r;
    public final z6p1 s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final seg1 w = new seg1(this, (byte) 5);

    public k8k1(Context context, ViewGroup viewGroup, z6p1 z6p1Var) {
        if (z6p1Var == null) {
            hhg1.n("Callback may not be null");
            throw null;
        }
        this.v = viewGroup;
        this.s = z6p1Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f62p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, x);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            eg.n("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup, ")");
            return;
        }
        this.t = view;
        this.c = i;
        this.s.B(view, i);
        o(1);
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        float f3 = this.b;
        if (fAbs <= f3 && fAbs2 <= f3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.s.getClass();
        }
        return (this.i[i] & i2) == 0 && fAbs > ((float) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean d(View view, float f, float f2) {
        if (view != null) {
            z6p1 z6p1Var = this.s;
            boolean z = z6p1Var.x(view) > 0;
            boolean z2 = z6p1Var.y() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.b;
                if (f3 > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.b) : Math.abs(f) > this.b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                WeakHashMap weakHashMap = b8k1.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                WeakHashMap weakHashMap2 = b8k1.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.D(this.t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            }
        }
        return this.a == 2;
    }

    public final View h(int i, int i2) {
        ViewGroup viewGroup = this.v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.r;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            o(0);
            return false;
        }
        View view = this.t;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.n;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        z6p1 z6p1Var = this.s;
        overScroller.startScroll(left, top, i5, i6, (int) ((f(i6, i4, z6p1Var.y()) * f6) + (f(i5, i3, z6p1Var.x(view)) * f5)));
        o(2);
        return true;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        VelocityTracker velocityTrackerObtain = this.l;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.l = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        z6p1 z6p1Var = this.s;
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x2, (int) y);
            m(pointerId, x2, y);
            s(viewH, pointerId);
            if ((this.q & this.h[pointerId]) != 0) {
                z6p1Var.A();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                k();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if ((this.k & (1 << pointerId2)) != 0) {
                        float x3 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x3 - this.d[pointerId2];
                        float f2 = y2 - this.e[pointerId2];
                        l(pointerId2, f, f2);
                        if (this.a != 1) {
                            View viewH2 = h((int) x3, (int) y2);
                            if (d(viewH2, f, f2) && s(viewH2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                n(motionEvent);
                return;
            }
            int i3 = this.c;
            if ((this.k & (1 << i3)) != 0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i4 = this.c;
                int i5 = (int) (x4 - fArr[i4]);
                int i6 = (int) (y3 - this.g[i4]);
                int left = this.t.getLeft() + i5;
                int top = this.t.getTop() + i6;
                int left2 = this.t.getLeft();
                int top2 = this.t.getTop();
                if (i5 != 0) {
                    left = z6p1Var.u(this.t, left);
                    WeakHashMap weakHashMap = b8k1.a;
                    this.t.offsetLeftAndRight(left - left2);
                }
                if (i6 != 0) {
                    top = z6p1Var.v(this.t, top);
                    WeakHashMap weakHashMap2 = b8k1.a;
                    this.t.offsetTopAndBottom(top - top2);
                }
                if (i5 != 0 || i6 != 0) {
                    z6p1Var.D(this.t, left, top);
                }
                n(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                this.u = true;
                z6p1Var.E(this.t, 0.0f, 0.0f);
                this.u = false;
                if (this.a == 1) {
                    o(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m(pointerId3, x5, y4);
            if (this.a == 0) {
                s(h((int) x5, (int) y4), pointerId3);
                if ((this.q & this.h[pointerId3]) != 0) {
                    z6p1Var.A();
                    return;
                }
                return;
            }
            int i7 = (int) x5;
            int i8 = (int) y4;
            View view = this.t;
            if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                s(this.t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.a == 1 && pointerId4 == this.c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.c) {
                    View viewH3 = h((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view2 = this.t;
                    if (viewH3 == view2 && s(view2, pointerId5)) {
                        i = this.c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                k();
            }
        }
        e(pointerId4);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f3 = this.n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.u = true;
        this.s.E(this.t, xVelocity, f);
        this.u = false;
        if (this.a == 1) {
            o(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void l(int i, float f, float f2) {
        int i2;
        boolean zC = c(f, f2, i, 1);
        ?? r0 = zC;
        if (c(f2, f, i, 4)) {
            r0 = (zC ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (c(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (c(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.i;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.s.z((int) r2, i);
    }

    public final void m(int i, float f, float f2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
            fArr = fArr2;
        }
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.e;
        this.g[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k = (1 << i) | this.k;
    }

    public final void n(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.s.C(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean p(int i, int i2) {
        if (this.u) {
            return i(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        eg.m("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    public final boolean q(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        VelocityTracker velocityTrackerObtain = this.l;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.l = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        z6p1 z6p1Var = this.s;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m(pointerId, x2, y);
            View viewH2 = h((int) x2, (int) y);
            if (viewH2 == this.t && this.a == 2) {
                s(viewH2, pointerId);
            }
            if ((this.h[pointerId] & this.q) != 0) {
                z6p1Var.A();
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m(pointerId2, x3, y2);
                byte b = this.a;
                if (b == 0) {
                    if ((this.h[pointerId2] & this.q) != 0) {
                        z6p1Var.A();
                    }
                } else if (b == 2 && (viewH = h((int) x3, (int) y2)) == this.t) {
                    s(viewH, pointerId2);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.d != null && this.e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 0; i < pointerCount; i++) {
                int pointerId3 = motionEvent.getPointerId(i);
                if ((this.k & (1 << pointerId3)) != 0) {
                    float x4 = motionEvent.getX(i);
                    float y3 = motionEvent.getY(i);
                    float f = x4 - this.d[pointerId3];
                    float f2 = y3 - this.e[pointerId3];
                    View viewH3 = h((int) x4, (int) y3);
                    boolean z = viewH3 != null && d(viewH3, f, f2);
                    if (!z) {
                        l(pointerId3, f, f2);
                        if (this.a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        int iU = z6p1Var.u(viewH3, ((int) f) + left);
                        int top = viewH3.getTop();
                        int iV = z6p1Var.v(viewH3, ((int) f2) + top);
                        int iX = z6p1Var.x(viewH3);
                        int iY = z6p1Var.y();
                        if ((iX == 0 || (iX > 0 && iU == left)) && (iY == 0 || (iY > 0 && iV == top))) {
                            break;
                        }
                        l(pointerId3, f, f2);
                        if (this.a != 1 || (z && s(viewH3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            n(motionEvent);
        }
        return this.a == 1;
    }

    public final boolean r(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean zI = i(i, i2, 0, 0);
        if (!zI && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return zI;
    }

    public final boolean s(View view, int i) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null || !this.s.H(view, i)) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }
}
