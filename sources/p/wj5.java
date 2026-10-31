package p;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wj5 extends ContentFrameLayout {
    public final /* synthetic */ yj5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj5(yj5 yj5Var, plm plmVar) {
        super(plmVar);
        this.i = yj5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.t(keyEvent) || super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                yj5 yj5Var = this.i;
                yj5Var.r(yj5Var.x(0), true);
                return true;
            }
        }
        return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(f0o1.j(getContext(), i));
    }
}
