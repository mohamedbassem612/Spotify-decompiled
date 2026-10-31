package p;

import com.ravelin.core.model.Events;
import com.ravelin.core.model.Payload;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c7n1 {
    public final p6n1 a;

    public c7n1(t7n1 t7n1Var) {
        this.a = (p6n1) t7n1Var.a.b(p6n1.class);
    }

    public static dxc a(c7n1 c7n1Var, String str, Events events) {
        Payload[] payloadArrCOM7;
        return c7n1Var.a.d(str, (events == null || (payloadArrCOM7 = events.COM7()) == null) ? null : payloadArrCOM7[0], "android");
    }
}
