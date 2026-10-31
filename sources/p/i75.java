package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i75 implements gfh0 {
    public final /* synthetic */ k75 a;
    public final /* synthetic */ hmb0 b;

    public i75(k75 k75Var, hmb0 hmb0Var) {
        this.a = k75Var;
        this.b = hmb0Var;
    }

    @Override // p.gfh0
    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        k75 k75Var = this.a;
        ViewGroup.LayoutParams layoutParams = k75Var.getLayoutParams();
        layoutParams.getClass();
        k75Var.measure(k75.i(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return k75Var.getMeasuredHeight();
    }

    @Override // p.gfh0
    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        k75 k75Var = this.a;
        ViewGroup.LayoutParams layoutParams = k75Var.getLayoutParams();
        layoutParams.getClass();
        k75Var.measure(iMakeMeasureSpec, k75.i(0, i, layoutParams.height));
        return k75Var.getMeasuredWidth();
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        k75 k75Var = this.a;
        int childCount = k75Var.getChildCount();
        b7x b7xVar = b7x.a;
        if (childCount == 0) {
            return ifh0Var.S(hjl.k(j), hjl.j(j), b7xVar, new z9((byte) 20));
        }
        if (hjl.k(j) != 0) {
            k75Var.getChildAt(0).setMinimumWidth(hjl.k(j));
        }
        if (hjl.j(j) != 0) {
            k75Var.getChildAt(0).setMinimumHeight(hjl.j(j));
        }
        int iK = hjl.k(j);
        int i = hjl.i(j);
        ViewGroup.LayoutParams layoutParams = k75Var.getLayoutParams();
        layoutParams.getClass();
        int i2 = k75.i(iK, i, layoutParams.width);
        int iJ = hjl.j(j);
        int iH = hjl.h(j);
        ViewGroup.LayoutParams layoutParams2 = k75Var.getLayoutParams();
        layoutParams2.getClass();
        k75Var.measure(i2, k75.i(iJ, iH, layoutParams2.height));
        return ifh0Var.S(k75Var.getMeasuredWidth(), k75Var.getMeasuredHeight(), b7xVar, new e75(k75Var, this.b, (byte) 2));
    }

    @Override // p.gfh0
    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        k75 k75Var = this.a;
        ViewGroup.LayoutParams layoutParams = k75Var.getLayoutParams();
        layoutParams.getClass();
        k75Var.measure(k75.i(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return k75Var.getMeasuredHeight();
    }

    @Override // p.gfh0
    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        k75 k75Var = this.a;
        ViewGroup.LayoutParams layoutParams = k75Var.getLayoutParams();
        layoutParams.getClass();
        k75Var.measure(iMakeMeasureSpec, k75.i(0, i, layoutParams.height));
        return k75Var.getMeasuredWidth();
    }
}
