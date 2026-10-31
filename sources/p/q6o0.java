package p;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q6o0 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public q6o0(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent viewParentE;
        if (!this.d || (viewParentE = e(0)) == null) {
            return false;
        }
        return t9p1.m(viewParentE, this.c, f, f2, z);
    }

    public final boolean b(float f, float f2) {
        ViewParent viewParentE;
        if (!this.d || (viewParentE = e(0)) == null) {
            return false;
        }
        return t9p1.n(viewParentE, this.c, f, f2);
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i4;
        int i5;
        int[] iArr3;
        if (this.d && (viewParentE = e(i3)) != null) {
            if (i != 0 || i2 != 0) {
                View view = this.c;
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    int[] iArr4 = this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                t9p1.o(viewParentE, this.c, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentE;
        int i6;
        int i7;
        int[] iArr3;
        if (this.d && (viewParentE = e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                View view = this.c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                t9p1.p(viewParentE, this.c, i, i2, i3, i4, i5, iArr3);
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final void g(boolean z) {
        if (this.d) {
            WeakHashMap weakHashMap = b8k1.a;
            this.c.stopNestedScroll();
        }
        this.d = z;
    }

    public final boolean h(int i, int i2) {
        if (f(i2)) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        View view = this.c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (t9p1.r(parent, view2, view, i, i2)) {
                if (i2 == 0) {
                    this.a = parent;
                } else if (i2 == 1) {
                    this.b = parent;
                }
                t9p1.q(parent, view2, view, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent viewParentE = e(i);
        if (viewParentE != null) {
            t9p1.s(viewParentE, this.c, i);
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
