package p;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class nx51 {
    public static final f341 a = w1x0.Z;

    public static final boolean a(bav0 bav0Var) {
        MotionEvent motionEventA;
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((hav0) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = bav0Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = bav0Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
