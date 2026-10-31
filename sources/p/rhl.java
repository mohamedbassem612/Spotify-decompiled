package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rhl implements vda {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public rhl(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // p.vda
    public final void a() {
        ConstraintLayout constraintLayout = this.a;
        ArrayList arrayList = constraintLayout.b;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            constraintLayout.getChildAt(i);
        }
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((ohl) arrayList.get(i2)).getClass();
            }
        }
    }

    @Override // p.vda
    public final void b(cjl cjlVar, uda udaVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        if (cjlVar == null) {
            return;
        }
        lhl lhlVar = cjlVar.L;
        lhl lhlVar2 = cjlVar.J;
        if (cjlVar.i0 == 8) {
            udaVar.e = 0;
            udaVar.f = 0;
            udaVar.g = 0;
            return;
        }
        if (cjlVar.V == null) {
            return;
        }
        bjl bjlVar = udaVar.a;
        bjl bjlVar2 = udaVar.b;
        int i2 = udaVar.c;
        int i3 = udaVar.d;
        int i4 = this.b + this.c;
        int i5 = this.d;
        View view = (View) cjlVar.h0;
        int iOrdinal = bjlVar.ordinal();
        if (iOrdinal == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else if (iOrdinal == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
        } else if (iOrdinal == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            boolean z2 = cjlVar.s == 1;
            int i6 = udaVar.j;
            if (i6 == 1 || i6 == 2) {
                boolean z3 = view.getMeasuredHeight() == cjlVar.m();
                if (udaVar.j == 2 || !z2 || ((z2 && z3) || cjlVar.C())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(cjlVar.s(), 1073741824);
                }
            }
        } else if (iOrdinal != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i7 = this.f;
            int i8 = lhlVar2 != null ? lhlVar2.g : 0;
            if (lhlVar != null) {
                i8 += lhlVar.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
        }
        int iOrdinal2 = bjlVar2.ordinal();
        if (iOrdinal2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else if (iOrdinal2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
        } else if (iOrdinal2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            boolean z4 = cjlVar.t == 1;
            int i9 = udaVar.j;
            if (i9 == 1 || i9 == 2) {
                boolean z5 = view.getMeasuredWidth() == cjlVar.s();
                if (udaVar.j == 2 || !z4 || ((z4 && z5) || cjlVar.D())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(cjlVar.m(), 1073741824);
                }
            }
        } else if (iOrdinal2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i10 = this.g;
            int i11 = lhlVar2 != null ? cjlVar.K.g : 0;
            if (lhlVar != null) {
                i11 += cjlVar.M.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
        }
        djl djlVar = (djl) cjlVar.V;
        ConstraintLayout constraintLayout = this.h;
        if (djlVar != null && ltn1.z(constraintLayout.i, 256) && view.getMeasuredWidth() == cjlVar.s() && view.getMeasuredWidth() < djlVar.s() && view.getMeasuredHeight() == cjlVar.m() && view.getMeasuredHeight() < djlVar.m() && view.getBaseline() == cjlVar.c0 && !cjlVar.B() && c(cjlVar.H, iMakeMeasureSpec, cjlVar.s()) && c(cjlVar.I, iMakeMeasureSpec2, cjlVar.m())) {
            udaVar.e = cjlVar.s();
            udaVar.f = cjlVar.m();
            udaVar.g = cjlVar.c0;
            return;
        }
        bjl bjlVar3 = bjl.c;
        boolean z6 = bjlVar == bjlVar3;
        boolean z7 = bjlVar2 == bjlVar3;
        bjl bjlVar4 = bjl.a;
        bjl bjlVar5 = bjl.d;
        boolean z8 = bjlVar2 == bjlVar5 || bjlVar2 == bjlVar4;
        boolean z9 = bjlVar == bjlVar5 || bjlVar == bjlVar4;
        boolean z10 = z6 && cjlVar.Y > 0.0f;
        boolean z11 = z7 && cjlVar.Y > 0.0f;
        if (view == null) {
            return;
        }
        qhl qhlVar = (qhl) view.getLayoutParams();
        int i12 = udaVar.j;
        if (i12 != 1 && i12 != 2 && z6 && cjlVar.s == 0 && z7 && cjlVar.t == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof kjk1) && (cjlVar instanceof ljk1)) {
                ((kjk1) view).n((ljk1) cjlVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            cjlVar.H = iMakeMeasureSpec;
            cjlVar.I = iMakeMeasureSpec2;
            cjlVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i13 = cjlVar.v;
            iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
            int i14 = cjlVar.w;
            if (i14 > 0) {
                iMax = Math.min(i14, iMax);
            }
            int i15 = cjlVar.y;
            iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
            int i16 = iMakeMeasureSpec2;
            int i17 = cjlVar.z;
            if (i17 > 0) {
                iMax2 = Math.min(i17, iMax2);
            }
            if (!ltn1.z(constraintLayout.i, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * cjlVar.Y) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / cjlVar.Y) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i16;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                cjlVar.H = iMakeMeasureSpec;
                cjlVar.I = iMakeMeasureSpec3;
                z = false;
                cjlVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        udaVar.i = (iMax == udaVar.c && iMax2 == udaVar.d) ? z : true;
        boolean z13 = qhlVar.c0 ? true : z12;
        if (z13 && baseline != -1 && cjlVar.c0 != baseline) {
            udaVar.i = true;
        }
        udaVar.e = iMax;
        udaVar.f = iMax2;
        udaVar.h = z13;
        udaVar.g = baseline;
    }
}
