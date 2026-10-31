package p;

import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.Barrier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wyf0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ xyf0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wyf0(xyf0 xyf0Var, byte b) {
        this.b = b;
        switch (b) {
            case 2:
                this.c = xyf0Var;
                super((Object) null);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.c = xyf0Var;
                super(bool);
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        xyf0 xyf0Var = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != iIntValue) {
                    ObjectAnimator objectAnimator = xyf0Var.c;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    wyf0 wyf0Var = xyf0Var.h;
                    mma0 mma0Var2 = xyf0.i[2];
                    hgr0 hgr0Var = (hgr0) ((sgp0) wyf0Var).a;
                    int i = hgr0Var != null ? hgr0Var.b : 0;
                    Barrier barrier = xyf0Var.a;
                    if (i != 2) {
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(barrier, "margin", barrier.getMargin(), iIntValue);
                        objectAnimatorOfInt.setDuration(xyf0Var.b);
                        objectAnimatorOfInt.addUpdateListener(new kb5(xyf0Var, (byte) 12));
                        objectAnimatorOfInt.start();
                        xyf0Var.c = objectAnimatorOfInt;
                    } else {
                        barrier.setMargin(iIntValue);
                    }
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    xyf0Var.a();
                }
                break;
            default:
                if (!u890.j((hgr0) obj, (hgr0) obj2)) {
                    xyf0Var.a();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyf0(Integer num, xyf0 xyf0Var) {
        super(num);
        this.b = (byte) 0;
        this.c = xyf0Var;
    }
}
