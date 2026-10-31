package p;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zun extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewGroup b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zun(ViewGroup viewGroup, byte b) {
        super(1);
        this.a = b;
        this.b = viewGroup;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((jen0) obj).a(viewGroup);
                return rih1Var;
            case 1:
                ((jen0) obj).a(viewGroup);
                return rih1Var;
            case 2:
                ((jen0) obj).a(viewGroup);
                return rih1Var;
            default:
                int action = ((MotionEvent) obj).getAction();
                if (action != 0) {
                    if ((action == 1 || action == 3) && viewGroup != null) {
                        viewGroup.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (viewGroup != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                }
                return Boolean.FALSE;
        }
    }
}
