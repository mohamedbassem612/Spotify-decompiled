package p;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mil extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nil b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mil(nil nilVar, byte b) {
        super(1);
        this.a = b;
        this.b = nilVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nil nilVar = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                    Handler handler = nilVar.b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        nilVar.b = handler;
                    }
                    handler.post(new t94(function0, (byte) 5));
                } else {
                    function0.invoke();
                }
                break;
            default:
                nilVar.d = true;
                break;
        }
        return rih1Var;
    }
}
