package p;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t8n1 extends jim0 {
    public final Context b;
    public final /* synthetic */ lz40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8n1(lz40 lz40Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 2);
        this.c = lz40Var;
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            new StringBuilder(String.valueOf(i).length() + 39);
            return;
        }
        int i2 = mz40.a;
        lz40 lz40Var = this.c;
        Context context = this.b;
        int iC = lz40Var.c(context, i2);
        if (h450.g(iC)) {
            Intent intentA = lz40Var.a(iC, context, "n");
            lz40Var.h(context, iC, intentA == null ? null : fqo1.D(context, intentA));
        }
    }
}
