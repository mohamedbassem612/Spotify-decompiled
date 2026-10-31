package p;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kgh implements View.OnTouchListener {
    public static final kgh b = new kgh(0);
    public static final kgh c = new kgh(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ kgh(byte b2) {
        this.a = b2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            case 1:
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
                return true;
            case 2:
            case 3:
            case 4:
                return true;
            default:
                return false;
        }
    }
}
