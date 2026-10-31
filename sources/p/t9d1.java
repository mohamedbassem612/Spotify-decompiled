package p;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t9d1 extends z6p1 {
    public int c;
    public int d = -1;
    public final /* synthetic */ SwipeDismissBehavior e;

    public t9d1(SwipeDismissBehavior swipeDismissBehavior) {
        this.e = swipeDismissBehavior;
    }

    @Override // p.z6p1
    public final void B(View view, int i) {
        this.d = i;
        this.c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // p.z6p1
    public final void C(int i) {
        jc9 jc9Var = this.e.b;
        if (jc9Var != null) {
            eda edaVar = ((kda) jc9Var.b).o;
            if (i == 0) {
                ua91.F().Q(edaVar);
            } else if (i == 1 || i == 2) {
                ua91.F().P(edaVar);
            }
        }
    }

    @Override // p.z6p1
    public final void D(View view, int i, int i2) {
        float f = this.c;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.e;
        float f2 = (width * swipeDismissBehavior.e) + f;
        float width2 = (view.getWidth() * swipeDismissBehavior.f) + this.c;
        float f3 = i;
        if (f3 <= f2) {
            view.setAlpha(1.0f);
        } else if (f3 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    @Override // p.z6p1
    public final void E(View view, float f, float f2) {
        int left;
        int i;
        int i2;
        jc9 jc9Var;
        this.d = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.e;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = b8k1.a;
            boolean z2 = view.getLayoutDirection() == 1;
            byte b = swipeDismissBehavior.d;
            if (b != 2 && (b != 0 ? b != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i2 = this.c;
            } else {
                left = view.getLeft();
                i = this.c;
                if (left < i) {
                    i2 = i - width;
                } else {
                    i2 = i + width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.c) >= Math.round(view.getWidth() * 0.5f)) {
                left = view.getLeft();
                i = this.c;
                if (left < i) {
                    i2 = i - width;
                } else {
                    i2 = i + width;
                }
                z = true;
            } else {
                i2 = this.c;
            }
        }
        if (swipeDismissBehavior.a.p(i2, view.getTop())) {
            n1d n1dVar = new n1d(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = b8k1.a;
            view.postOnAnimation(n1dVar);
        } else {
            if (!z || (jc9Var = swipeDismissBehavior.b) == null) {
                return;
            }
            jc9Var.p(view);
        }
    }

    @Override // p.z6p1
    public final boolean H(View view, int i) {
        int i2 = this.d;
        return (i2 == -1 || i2 == i) && this.e.t(view);
    }

    @Override // p.z6p1
    public final int u(View view, int i) {
        int width;
        int width2;
        WeakHashMap weakHashMap = b8k1.a;
        boolean z = view.getLayoutDirection() == 1;
        byte b = this.e.d;
        if (b == 0) {
            width = this.c;
            if (z) {
                width -= view.getWidth();
                width2 = this.c;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i2 = this.c;
            if (b != 1) {
                width = i2 - view.getWidth();
                width2 = this.c + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i2;
                width = i2;
            } else {
                width = i2 - view.getWidth();
                width2 = this.c;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p.z6p1
    public final int v(View view, int i) {
        return view.getTop();
    }

    @Override // p.z6p1
    public final int x(View view) {
        return view.getWidth();
    }
}
