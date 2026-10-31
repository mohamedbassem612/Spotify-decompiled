package p;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z2g1 {
    public final Context a;
    public final til b;
    public final yha c;
    public final q8o0 d;
    public final til e;

    public z2g1(Context context, dwl1 dwl1Var) {
        q8o0 q8o0Var;
        vha vhaVar = new vha(context.getApplicationContext(), dwl1Var, (byte) 0);
        yha yhaVar = new yha(context.getApplicationContext(), dwl1Var);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext = context.getApplicationContext();
            int i = p8o0.a;
            q8o0Var = new q8o0(applicationContext, dwl1Var);
        } else {
            q8o0Var = null;
        }
        vha vhaVar2 = new vha(context.getApplicationContext(), dwl1Var, (byte) 1);
        this.a = context;
        this.b = vhaVar;
        this.c = yhaVar;
        this.d = q8o0Var;
        this.e = vhaVar2;
    }
}
