package p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wa80 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ b2c a;

    public wa80(b2c b2cVar) {
        this.a = b2cVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) throws NoWhenBranchMatchedException {
        b2c b2cVar = this.a;
        if (!b2c.a(b2cVar)) {
            if (na80.a(b2cVar.f(), 1)) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((w94) b2c.b(b2cVar)).invoke(yx20.a(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (na80.a(b2cVar.f(), 2) && Math.abs(f2) > Math.abs(f)) {
                ((w94) b2c.b(b2cVar)).invoke(yx20.a(f2 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
