package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ir41 extends k611 {
    public boolean X;
    public boolean Y;
    public i2k a;
    public final ViewPager2 b;
    public final g570 c;
    public final LinearLayoutManager d;
    public int e;
    public byte f;
    public final hr41 g;
    public int h;
    public int i;
    public boolean t;

    public ir41(ViewPager2 viewPager2) {
        this.b = viewPager2;
        g570 g570Var = viewPager2.t;
        this.c = g570Var;
        this.d = g570Var.getLayoutManager();
        this.g = new hr41();
        n();
    }

    public final void c(RecyclerView recyclerView, int i) {
        i2k i2kVar;
        i2k i2kVar2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.f1();
            }
            i(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.X) {
                i(2);
                this.t = true;
                return;
            }
            return;
        }
        hr41 hr41Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            p();
            if (!this.X) {
                int i4 = hr41Var.b;
                if (i4 != -1 && (i2kVar2 = this.a) != null) {
                    i2kVar2.b(i4, 0, 0.0f);
                }
            } else if (hr41Var.c == 0) {
                int i5 = this.h;
                int i6 = hr41Var.b;
                if (i5 != i6 && (i2kVar = this.a) != null) {
                    i2kVar.c(i6);
                }
            }
            i(0);
            n();
        }
        if (this.e == 2 && i == 0 && this.Y) {
            p();
            if (hr41Var.c == 0) {
                int i7 = this.i;
                int i8 = hr41Var.b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    i2k i2kVar3 = this.a;
                    if (i2kVar3 != null) {
                        i2kVar3.c(i8);
                    }
                }
                i(0);
                n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    public final void h(RecyclerView recyclerView, int i, int i2) {
        int i3;
        i2k i2kVar;
        this.X = true;
        p();
        boolean z = this.t;
        hr41 hr41Var = this.g;
        if (z) {
            this.t = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.g.S() == 1)) {
                        if (hr41Var.c != 0) {
                            i3 = hr41Var.b + 1;
                        }
                    }
                }
                i3 = hr41Var.b;
            } else if (hr41Var.c != 0) {
                i3 = hr41Var.b + 1;
            } else {
                i3 = hr41Var.b;
            }
            this.i = i3;
            if (this.h != i3 && (i2kVar = this.a) != null) {
                i2kVar.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = hr41Var.b;
            if (i4 == -1) {
                i4 = 0;
            }
            i2k i2kVar2 = this.a;
            if (i2kVar2 != null) {
                i2kVar2.c(i4);
            }
        }
        int i5 = hr41Var.b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = hr41Var.a;
        int i6 = hr41Var.c;
        i2k i2kVar3 = this.a;
        if (i2kVar3 != null) {
            i2kVar3.b(i5, i6, f);
        }
        int i7 = hr41Var.b;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && hr41Var.c == 0 && this.f != 1) {
            i(0);
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        i2k i2kVar = this.a;
        if (i2kVar != null) {
            i2kVar.a(i);
        }
    }

    public final double j() {
        p();
        hr41 hr41Var = this.g;
        return ((double) hr41Var.b) + ((double) hr41Var.a);
    }

    public final int k() {
        return this.f;
    }

    public final boolean l() {
        return this.f == 0;
    }

    public final void m(int i, boolean z) {
        i2k i2kVar;
        this.e = z ? 2 : 3;
        boolean z2 = this.i != i;
        this.i = i;
        i(2);
        if (!z2 || (i2kVar = this.a) == null) {
            return;
        }
        i2kVar.c(i);
    }

    public final void n() {
        this.e = 0;
        this.f = (byte) 0;
        hr41 hr41Var = this.g;
        hr41Var.b = -1;
        hr41Var.a = 0.0f;
        hr41Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.t = false;
        this.X = false;
        this.Y = false;
    }

    public final void o(i2k i2kVar) {
        this.a = i2kVar;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[LOOP:2: B:64:0x013c->B:67:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014b A[SYNTHETIC] */
    public final void p() {
        int top;
        int I;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iF1 = linearLayoutManager.f1();
        hr41 hr41Var = this.g;
        hr41Var.b = iF1;
        if (iF1 == -1) {
            hr41Var.b = -1;
            hr41Var.a = 0.0f;
            hr41Var.c = 0;
            return;
        }
        View viewD = linearLayoutManager.D(iF1);
        if (viewD == null) {
            hr41Var.b = -1;
            hr41Var.a = 0.0f;
            hr41Var.c = 0;
            return;
        }
        int i3 = viewD.getLayoutParams().b.left;
        int i4 = viewD.getLayoutParams().b.right;
        int i5 = viewD.getLayoutParams().b.top;
        int i6 = viewD.getLayoutParams().b.bottom;
        ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewD.getHeight() + i5 + i6;
        int width = viewD.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.Q0;
        RecyclerView recyclerView = this.c;
        if (i7 == 0) {
            top = (viewD.getLeft() - i3) - recyclerView.getPaddingLeft();
            if (this.b.g.S() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewD.getTop() - i5) - recyclerView.getPaddingTop();
        }
        int i8 = -top;
        hr41Var.c = i8;
        if (i8 >= 0) {
            hr41Var.a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int I2 = linearLayoutManager.I();
        if (I2 != 0) {
            boolean z = linearLayoutManager.Q0 == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, I2, 2);
            for (int i9 = 0; i9 < I2; i9++) {
                View viewH = linearLayoutManager.H(i9);
                if (viewH == null) {
                    eg.m("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewH.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : aa5.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewH.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewH.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewH.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewH.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new k0d((byte) 19));
            int i10 = 1;
            while (true) {
                if (i10 >= I2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[I2 - 1][1] >= i13) {
                        if (linearLayoutManager.I() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                I = linearLayoutManager.I();
                for (int i14 = 0; i14 < I; i14++) {
                    if (!aa5.a(linearLayoutManager.H(i14))) {
                        eg.m("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.I() <= 1) {
            I = linearLayoutManager.I();
            while (i14 < I) {
                if (!aa5.a(linearLayoutManager.H(i14))) {
                    eg.m("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        eg.m(f4i1.c(hr41Var.c, "Page can only be offset by a positive amount, not by "));
    }
}
