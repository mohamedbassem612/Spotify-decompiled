package p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ys80 implements xs80 {
    public final Context a;
    public final pbk1 b;
    public final String c;
    public final idd1 d = new idd1(new nd70(this, (byte) 20));

    public ys80(Context context, pbk1 pbk1Var, String str) {
        this.a = context;
        this.b = pbk1Var;
        this.c = str;
    }

    public final Intent a(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(context, this.c);
        return intent;
    }
}
