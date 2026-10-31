package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class w5o0 extends CoordinatorLayout implements p6o0 {
    public static final /* synthetic */ int f1 = 0;
    public final idd1 b1;
    public final v5o0 c1;
    public final View d1;
    public final h3n e1;

    /* JADX WARN: Multi-variable type inference failed */
    public w5o0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = new idd1(new ivn0(this, (byte) 8));
        v5o0 v5o0Var = new v5o0();
        this.c1 = v5o0Var;
        View view = new View(getContext());
        WeakHashMap weakHashMap = b8k1.a;
        view.setElevation(view.getElevation());
        this.d1 = view;
        h3n h3nVar = new h3n(0, 0);
        h3nVar.b(v5o0Var);
        this.e1 = h3nVar;
    }

    private final q6o0 getHelper() {
        return (q6o0) this.b1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getNestedTarget() {
        View view = this.c1.h;
        if (view != null) {
            return i1o1.s(view);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getHelper().a(f, f2, z) && isNestedScrollingEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getHelper().b(f, f2) && isNestedScrollingEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getHelper().c(i, i2, 0, iArr, iArr2) && isNestedScrollingEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getHelper().d(i, i2, i3, i4, iArr, 0, (int[]) null) && isNestedScrollingEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean hasNestedScrollingParent() {
        return getHelper().f(0) && isNestedScrollingEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            h3n h3nVar = this.e1;
            ((ViewGroup.MarginLayoutParams) h3nVar).width = i3 - i;
            ((ViewGroup.MarginLayoutParams) h3nVar).height = i4 - i2;
            View view = this.d1;
            removeViewInLayout(view);
            addViewInLayout(view, -1, h3nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean startNestedScroll(int i) {
        return getHelper().h(i, 0) && isNestedScrollingEnabled();
    }

    public final void stopNestedScroll() {
        getHelper().i(0);
    }
}
