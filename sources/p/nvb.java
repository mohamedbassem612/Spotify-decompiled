package p;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nvb extends z6p1 {
    public final /* synthetic */ BottomSheetBehavior c;

    public nvb(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    @Override // p.z6p1
    public final void C(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.c;
            if (bottomSheetBehavior.F) {
                bottomSheetBehavior.M(1);
            }
        }
    }

    @Override // p.z6p1
    public final void D(View view, int i, int i2) {
        this.c.x(i2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    @Override // p.z6p1
    public final void E(View view, float f, float f2) {
        int iB;
        int i = 6;
        BottomSheetBehavior bottomSheetBehavior = this.c;
        if (f2 < 0.0f) {
            if (bottomSheetBehavior.b) {
                iB = bottomSheetBehavior.y;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                int i2 = bottomSheetBehavior.z;
                if (top > i2) {
                    iB = i2;
                } else {
                    iB = bottomSheetBehavior.B();
                }
            }
            i = 3;
        } else if (bottomSheetBehavior.D && bottomSheetBehavior.O(view, f2)) {
            if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                if (view.getTop() > (bottomSheetBehavior.B() + bottomSheetBehavior.N) / 2) {
                    iB = bottomSheetBehavior.N;
                    i = 5;
                } else {
                    if (bottomSheetBehavior.b) {
                        iB = bottomSheetBehavior.y;
                    } else if (Math.abs(view.getTop() - bottomSheetBehavior.B()) < Math.abs(view.getTop() - bottomSheetBehavior.z)) {
                        iB = bottomSheetBehavior.B();
                    } else {
                        iB = bottomSheetBehavior.z;
                    }
                    i = 3;
                }
            } else {
                iB = bottomSheetBehavior.N;
                i = 5;
            }
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.b) {
                int i3 = bottomSheetBehavior.z;
                if (top2 < i3) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.B)) {
                        iB = bottomSheetBehavior.B();
                        i = 3;
                    } else {
                        iB = bottomSheetBehavior.z;
                    }
                } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.B)) {
                    iB = bottomSheetBehavior.z;
                } else {
                    iB = bottomSheetBehavior.B;
                    i = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.y) < Math.abs(top2 - bottomSheetBehavior.B)) {
                iB = bottomSheetBehavior.y;
                i = 3;
            } else {
                iB = bottomSheetBehavior.B;
                i = 4;
            }
        } else {
            if (bottomSheetBehavior.b) {
                iB = bottomSheetBehavior.B;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.z) < Math.abs(top3 - bottomSheetBehavior.B)) {
                    iB = bottomSheetBehavior.z;
                } else {
                    iB = bottomSheetBehavior.B;
                }
            }
            i = 4;
        }
        bottomSheetBehavior.P(view, i, iB, true);
    }

    @Override // p.z6p1
    public final boolean H(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        int i2 = bottomSheetBehavior.G;
        if (i2 == 1 || bottomSheetBehavior.U) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.S == i) {
            WeakReference weakReference = bottomSheetBehavior.P;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.O;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // p.z6p1
    public final int v(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        return u890.o(i, bottomSheetBehavior.B(), bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
    }

    @Override // p.z6p1
    public final int y() {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        return bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B;
    }
}
