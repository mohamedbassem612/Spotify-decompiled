package p;

import android.view.MotionEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ct91 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ct91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (x340) b0kVar;
                if (!x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var.b0();
                } else {
                    q9e1.c(((wr91) obj3).a.a(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, x340Var, 0, 0, 262142);
                }
                break;
            default:
                i25 i25Var = (i25) obj3;
                c921.y((c9n) i25Var.c, (o8n) null, 0, new os20(i25Var, (String) obj, MotionEvent.obtain((MotionEvent) obj2), null, (byte) 4), 3);
                break;
        }
        return rih1Var;
    }
}
