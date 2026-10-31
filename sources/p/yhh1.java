package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yhh1 extends o1p1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ zhh1 d;

    public /* synthetic */ yhh1(zhh1 zhh1Var, byte b) {
        this.c = b;
        this.d = zhh1Var;
    }

    public final Object D(Intent intent, int i) {
        Bundle extras;
        swf swfVar;
        Bundle extras2;
        swf swfVar2;
        byte b = this.c;
        pwf pwfVar = pwf.a;
        zhh1 zhh1Var = this.d;
        switch (b) {
            case 0:
                zhh1Var.a.getClass();
                return (intent == null || (extras = intent.getExtras()) == null || (swfVar = (swf) jhc1.t(extras, "EXTRA_CHECKOUT_RESULT", swf.class)) == null) ? pwfVar : swfVar;
            default:
                zhh1Var.a.getClass();
                return (intent == null || (extras2 = intent.getExtras()) == null || (swfVar2 = (swf) jhc1.t(extras2, "EXTRA_CHECKOUT_RESULT", swf.class)) == null) ? pwfVar : swfVar2;
        }
    }

    public final Intent z(Context context, Object obj) {
        byte b = this.c;
        zhh1 zhh1Var = this.d;
        switch (b) {
            case 0:
                x8g x8gVar = zhh1Var.a;
                v5g v5gVar = new v5g(hxf.b, ((UUID) obj).toString(), (String) null);
                x8gVar.getClass();
                return x8g.a(context, v5gVar);
            default:
                zhh1Var.a.getClass();
                return x8g.a(context, (v5g) obj);
        }
    }
}
