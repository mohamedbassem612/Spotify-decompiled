package p;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ly4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ifv0 b;

    public /* synthetic */ ly4(ifv0 ifv0Var, byte b) {
        this.a = b;
        this.b = ifv0Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, p.ifv0] */
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ?? r3 = this.b;
        switch (b) {
            case 0:
                r3.m634setPopupContentSizefhxjrPA((yr80) obj);
                r3.D();
                break;
            case 1:
                elb0 elb0VarJ = ((elb0) obj).J();
                elb0VarJ.getClass();
                r3.C(elb0VarJ);
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = r3.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = r3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new t94(function0, (byte) 6));
                    }
                } else {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
