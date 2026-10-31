package p;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fn90 extends f611 implements h611 {
    public int N0;
    public int P0;
    public RecyclerView Q0;
    public VelocityTracker S0;
    public ArrayList T0;
    public ArrayList U0;
    public mev W0;
    public en90 X0;
    public final dn90 Y;
    public Rect Z0;
    public long a1;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float t;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public w611 c = null;
    public int X = -1;
    public byte Z = 0;
    public final ArrayList O0 = new ArrayList();
    public final an90 R0 = new an90(this, (byte) 0);
    public View V0 = null;
    public final bn90 Y0 = new bn90(this);

    public fn90(dn90 dn90Var) {
        this.Y = dn90Var;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void a(View view) {
        if (view == this.V0) {
            this.V0 = null;
        }
        w611 w611VarT = this.Q0.T(view);
        if (w611VarT == null) {
            return;
        }
        w611 w611Var = this.c;
        if (w611Var != null && w611VarT == w611Var) {
            r(0, null);
            return;
        }
        m(w611VarT, false);
        if (this.a.remove(w611VarT.a)) {
            this.Y.a(this.Q0, w611VarT);
        }
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        rect.setEmpty();
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        float f;
        float f2;
        dn90 dn90Var;
        fn90 fn90Var = this;
        if (fn90Var.c != null) {
            float[] fArr = fn90Var.b;
            fn90Var.o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        w611 w611Var = fn90Var.c;
        byte b = fn90Var.Z;
        ArrayList arrayList = fn90Var.O0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            dn90Var = fn90Var.Y;
            if (i >= size) {
                break;
            }
            cn90 cn90Var = (cn90) arrayList.get(i);
            w611 w611Var2 = cn90Var.e;
            float f4 = cn90Var.a;
            float f5 = cn90Var.c;
            if (f4 == f5) {
                cn90Var.i = w611Var2.a.getTranslationX();
            } else {
                cn90Var.i = l1d.e(f5, f4, cn90Var.m, f4);
            }
            float f6 = cn90Var.b;
            float f7 = cn90Var.d;
            if (f6 == f7) {
                cn90Var.j = w611Var2.a.getTranslationY();
            } else {
                cn90Var.j = l1d.e(f7, f6, cn90Var.m, f6);
            }
            int iSave = canvas.save();
            dn90Var.i(canvas, recyclerView, cn90Var.e, cn90Var.i, cn90Var.j, cn90Var.f, false);
            canvas.restoreToCount(iSave);
            i++;
            fn90Var = this;
        }
        if (w611Var != null) {
            int iSave2 = canvas.save();
            dn90Var.i(canvas, recyclerView, w611Var, f2, f, b, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        w611 w611Var = this.c;
        ArrayList arrayList = this.O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cn90 cn90Var = (cn90) arrayList.get(i);
            int iSave = canvas.save();
            View view = cn90Var.e.a;
            canvas.restoreToCount(iSave);
        }
        if (w611Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            cn90 cn90Var2 = (cn90) arrayList.get(i2);
            boolean z2 = cn90Var2.l;
            if (z2 && !cn90Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.Q0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        bn90 bn90Var = this.Y0;
        if (recyclerView2 != null) {
            recyclerView2.n0(this);
            RecyclerView recyclerView3 = this.Q0;
            recyclerView3.T0.remove(bn90Var);
            if (recyclerView3.U0 == bn90Var) {
                recyclerView3.U0 = null;
            }
            this.Q0.o0(this);
            ArrayList arrayList = this.O0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                cn90 cn90Var = (cn90) arrayList.get(0);
                cn90Var.g.cancel();
                this.Y.a(this.Q0, cn90Var.e);
            }
            arrayList.clear();
            this.V0 = null;
            VelocityTracker velocityTracker = this.S0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.S0 = null;
            }
            en90 en90Var = this.X0;
            if (en90Var != null) {
                en90Var.b = false;
                this.X0 = null;
            }
            if (this.W0 != null) {
                this.W0 = null;
            }
        }
        this.Q0 = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            resources.getDimension(2131166192);
            this.f = resources.getDimension(2131166191);
            this.P0 = ViewConfiguration.get(this.Q0.getContext()).getScaledTouchSlop();
            this.Q0.j(this);
            this.Q0.l(bn90Var);
            this.Q0.k(this);
            this.X0 = new en90(this);
            this.W0 = new mev(this.Q0.getContext(), this.X0);
        }
    }

    public final int j(int i, w611 w611Var) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.g > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.S0;
        dn90 dn90Var = this.Y;
        if (velocityTracker != null && this.X > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.S0.getXVelocity(this.X);
            float yVelocity = this.S0.getYVelocity(this.X);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= dn90Var.f() && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fG = dn90Var.g() * this.Q0.getWidth();
        if ((i & i2) == 0 || Math.abs(this.g) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void k(int i, int i2, MotionEvent motionEvent) {
        View viewN;
        if (this.c != null || i != 2 || this.Z == 2 || this.Q0.getScrollState() == 1) {
            return;
        }
        a layoutManager = this.Q0.getLayoutManager();
        int i3 = this.X;
        w611 w611VarT = null;
        if (i3 != -1) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i3);
            float x = motionEvent.getX(iFindPointerIndex) - this.d;
            float y = motionEvent.getY(iFindPointerIndex) - this.e;
            float fAbs = Math.abs(x);
            float fAbs2 = Math.abs(y);
            float f = this.P0;
            if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.q()) && ((fAbs2 <= fAbs || !layoutManager.r()) && (viewN = n(motionEvent)) != null))) {
                w611VarT = this.Q0.T(viewN);
            }
        }
        if (w611VarT == null) {
            return;
        }
        RecyclerView recyclerView = this.Q0;
        int iE = this.Y.e(w611VarT);
        WeakHashMap weakHashMap = b8k1.a;
        int iB = (dn90.b(iE, recyclerView.getLayoutDirection()) & 65280) >> 8;
        if (iB == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.d;
        float f3 = y2 - this.e;
        float fAbs3 = Math.abs(f2);
        float fAbs4 = Math.abs(f3);
        float f4 = this.P0;
        if (fAbs3 >= f4 || fAbs4 >= f4) {
            if (fAbs3 > fAbs4) {
                if (f2 < 0.0f && (iB & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iB & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iB & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iB & 2) == 0) {
                    return;
                }
            }
            this.h = 0.0f;
            this.g = 0.0f;
            this.X = motionEvent.getPointerId(0);
            r(1, w611VarT);
        }
    }

    public final int l(int i, w611 w611Var) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.S0;
        dn90 dn90Var = this.Y;
        if (velocityTracker != null && this.X > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f);
            float xVelocity = this.S0.getXVelocity(this.X);
            float yVelocity = this.S0.getYVelocity(this.X);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= dn90Var.f() && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fG = dn90Var.g() * this.Q0.getHeight();
        if ((i & i2) == 0 || Math.abs(this.h) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void m(w611 w611Var, boolean z) {
        ArrayList arrayList = this.O0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cn90 cn90Var = (cn90) arrayList.get(size);
            if (cn90Var.e == w611Var) {
                cn90Var.k |= z;
                if (!cn90Var.l) {
                    cn90Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        w611 w611Var = this.c;
        if (w611Var != null) {
            View view = w611Var.a;
            if (p(view, x, y, this.i + this.g, this.t + this.h)) {
                return view;
            }
        }
        ArrayList arrayList = this.O0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cn90 cn90Var = (cn90) arrayList.get(size);
            View view2 = cn90Var.e.a;
            if (p(view2, x, y, cn90Var.i, cn90Var.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.Q0;
        for (int iC = recyclerView.f.c() - 1; iC >= 0; iC--) {
            View viewB = recyclerView.f.b(iC);
            float translationX = viewB.getTranslationX();
            float translationY = viewB.getTranslationY();
            if (x >= viewB.getLeft() + translationX && x <= viewB.getRight() + translationX && y >= viewB.getTop() + translationY && y <= viewB.getBottom() + translationY) {
                return viewB;
            }
        }
        return null;
    }

    public final void o(float[] fArr) {
        if ((this.N0 & 12) != 0) {
            fArr[0] = (this.i + this.g) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.N0 & 3) != 0) {
            fArr[1] = (this.t + this.h) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void q(w611 w611Var) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (this.Q0.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.Z != 2) {
            return;
        }
        int i = (int) (this.i + this.g);
        int i2 = (int) (this.t + this.h);
        View view = w611Var.a;
        if (Math.abs(i2 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.T0;
            if (arrayList == null) {
                this.T0 = new ArrayList();
                this.U0 = new ArrayList();
            } else {
                arrayList.clear();
                this.U0.clear();
            }
            int iRound = Math.round(this.i + this.g);
            int iRound2 = Math.round(this.t + this.h);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i3 = (iRound + width) / 2;
            int i4 = (iRound2 + height) / 2;
            a layoutManager = this.Q0.getLayoutManager();
            int I = layoutManager.I();
            int i5 = 0;
            while (i5 < I) {
                char c2 = c;
                View viewH = layoutManager.H(i5);
                if (viewH != view && viewH.getBottom() >= iRound2 && viewH.getTop() <= height && viewH.getRight() >= iRound && viewH.getLeft() <= width) {
                    w611 w611VarT = this.Q0.T(viewH);
                    int iAbs5 = Math.abs(i3 - ((viewH.getRight() + viewH.getLeft()) / 2));
                    int iAbs6 = Math.abs(i4 - ((viewH.getBottom() + viewH.getTop()) / 2));
                    int i6 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    int size = this.T0.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size) {
                        int i9 = size;
                        if (i6 <= ((Integer) this.U0.get(i7)).intValue()) {
                            break;
                        }
                        i8++;
                        i7++;
                        size = i9;
                    }
                    this.T0.add(i8, w611VarT);
                    this.U0.add(i8, Integer.valueOf(i6));
                }
                i5++;
                c = c2;
                i = i;
                i2 = i2;
                iRound = iRound;
            }
            int i10 = i;
            int i11 = i2;
            ArrayList arrayList2 = this.T0;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i10;
            int height2 = view.getHeight() + i11;
            int left2 = i10 - view.getLeft();
            int top2 = i11 - view.getTop();
            int size2 = arrayList2.size();
            w611 w611Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size2; i13++) {
                w611 w611Var3 = (w611) arrayList2.get(i13);
                if (left2 > 0 && (right = w611Var3.a.getRight() - width2) < 0 && w611Var3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    i12 = iAbs4;
                    w611Var2 = w611Var3;
                }
                if (left2 < 0 && (left = w611Var3.a.getLeft() - i10) > 0 && w611Var3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    i12 = iAbs3;
                    w611Var2 = w611Var3;
                }
                if (top2 < 0 && (top = w611Var3.a.getTop() - i11) > 0 && w611Var3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    i12 = iAbs2;
                    w611Var2 = w611Var3;
                }
                if (top2 > 0 && (bottom = w611Var3.a.getBottom() - height2) < 0 && w611Var3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    i12 = iAbs;
                    w611Var2 = w611Var3;
                }
            }
            if (w611Var2 == null) {
                this.T0.clear();
                this.U0.clear();
                return;
            }
            View view2 = w611Var2.a;
            int iM = w611Var2.m();
            w611Var.m();
            if (this.Y.j(w611Var, w611Var2)) {
                RecyclerView recyclerView = this.Q0;
                LinearLayoutManager layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.q()) {
                        if (a.M(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.u0(iM);
                        }
                        if (a.P(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.u0(iM);
                        }
                    }
                    if (layoutManager2.r()) {
                        if (a.Q(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.u0(iM);
                        }
                        if (a.L(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.u0(iM);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = layoutManager2;
                linearLayoutManager.n("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.a1();
                linearLayoutManager.u1();
                int iV = a.V(view);
                int iV2 = a.V(view2);
                byte b = iV < iV2 ? (byte) 1 : (byte) -1;
                boolean z = linearLayoutManager.V0;
                dyb0 dyb0Var = linearLayoutManager.S0;
                if (z) {
                    if (b == 1) {
                        linearLayoutManager.w1(iV2, dyb0Var.i() - (linearLayoutManager.S0.e(view) + linearLayoutManager.S0.g(view2)));
                        return;
                    } else {
                        linearLayoutManager.w1(iV2, dyb0Var.i() - linearLayoutManager.S0.d(view2));
                        return;
                    }
                }
                if (b == -1) {
                    linearLayoutManager.w1(iV2, dyb0Var.g(view2));
                } else {
                    linearLayoutManager.w1(iV2, dyb0Var.d(view2) - linearLayoutManager.S0.e(view));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [byte, int] */
    public final void r(int i, w611 w611Var) {
        dn90 dn90Var;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        w611 w611Var2;
        boolean z2;
        int iL;
        char c;
        float fSignum;
        Object obj;
        long jH;
        if (w611Var == this.c && i == this.Z) {
            return;
        }
        this.a1 = Long.MIN_VALUE;
        byte b = this.Z;
        m(w611Var, true);
        this.Z = i;
        if (i == 2) {
            if (w611Var == null) {
                hhg1.n("Must pass a ViewHolder when dragging");
                return;
            }
            this.V0 = w611Var.a;
        }
        int i2 = (1 << ((i * 8) + 8)) - 1;
        w611 w611Var3 = this.c;
        dn90 dn90Var2 = this.Y;
        if (w611Var3 != null) {
            View view = w611Var3.a;
            if (view.getParent() != null) {
                if (b == 2 || this.Z == 2) {
                    iL = 0;
                } else {
                    int iE = dn90Var2.e(w611Var3);
                    RecyclerView recyclerView = this.Q0;
                    WeakHashMap weakHashMap = b8k1.a;
                    int iB = (dn90.b(iE, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (iB == 0) {
                        iL = 0;
                    } else {
                        int i3 = (iE & 65280) >> 8;
                        if (Math.abs(this.g) > Math.abs(this.h)) {
                            iL = j(iB, w611Var3);
                            if (iL <= 0) {
                                iL = l(iB, w611Var3);
                                if (iL <= 0) {
                                    iL = 0;
                                }
                            } else if ((i3 & iL) == 0) {
                                iL = dn90.c(iL, this.Q0.getLayoutDirection());
                            }
                        } else {
                            iL = l(iB, w611Var3);
                            if (iL <= 0) {
                                iL = j(iB, w611Var3);
                                if (iL <= 0) {
                                    iL = 0;
                                } else if ((i3 & iL) == 0) {
                                    iL = dn90.c(iL, this.Q0.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.S0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.S0 = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iL == 1 || iL == 2) {
                    c = 0;
                    fSignum = Math.signum(this.h) * this.Q0.getHeight();
                    obj = null;
                } else if (iL == 4 || iL == 8 || iL == 16 || iL == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.g) * this.Q0.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (b == 2) {
                    c2 = '\b';
                } else if (iL > 0) {
                    c2 = 2;
                }
                float[] fArr = this.b;
                o(fArr);
                char c3 = c2;
                ?? r15 = c;
                cn90 cn90Var = new cn90(this, w611Var3, b, fArr[c], fArr[1], fSignum2, fSignum, iL, w611Var3);
                e611 itemAnimator = this.Q0.getItemAnimator();
                if (itemAnimator == null) {
                    jH = c3 == '\b' ? 200L : 250L;
                } else {
                    jH = c3 == '\b' ? itemAnimator.e : itemAnimator.h();
                }
                ValueAnimator valueAnimator = cn90Var.g;
                valueAnimator.setDuration(jH);
                this.O0.add(cn90Var);
                w611Var3.B((boolean) r15);
                valueAnimator.start();
                dn90Var = dn90Var2;
                z2 = true;
                w611Var2 = null;
                r14 = r15;
            } else {
                r14 = 0;
                if (view == this.V0) {
                    w611Var2 = null;
                    this.V0 = null;
                } else {
                    w611Var2 = null;
                }
                dn90Var = dn90Var2;
                dn90Var.a(this.Q0, w611Var3);
                z2 = false;
            }
            this.c = w611Var2;
            z = z2;
            r12 = r14;
        } else {
            dn90Var = dn90Var2;
            r12 = 0;
            z = false;
        }
        if (w611Var != null) {
            View view2 = w611Var.a;
            RecyclerView recyclerView2 = this.Q0;
            int iE2 = dn90Var.e(w611Var);
            WeakHashMap weakHashMap2 = b8k1.a;
            this.N0 = (dn90.b(iE2, recyclerView2.getLayoutDirection()) & i2) >> (this.Z * 8);
            this.i = view2.getLeft();
            this.t = view2.getTop();
            this.c = w611Var;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.Q0.getParent();
        if (parent != 0) {
            if (this.c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.Q0.getLayoutManager().f = true;
        }
        dn90Var.k(this.Z, this.c);
        this.Q0.invalidate();
    }

    public final void s(w611 w611Var) {
        RecyclerView recyclerView = this.Q0;
        int iE = this.Y.e(w611Var);
        WeakHashMap weakHashMap = b8k1.a;
        if ((dn90.b(iE, recyclerView.getLayoutDirection()) & 16711680) == 0 || w611Var.a.getParent() != this.Q0) {
            return;
        }
        VelocityTracker velocityTracker = this.S0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.S0 = VelocityTracker.obtain();
        this.h = 0.0f;
        this.g = 0.0f;
        r(2, w611Var);
    }

    public final void t(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.d;
        this.g = fMax;
        this.h = y - this.e;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.g = fMax;
        }
        if ((i & 8) == 0) {
            this.g = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.h = Math.max(0.0f, this.h);
        }
        if ((i & 2) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
    }

    public final void c(View view) {
    }
}
