package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mjm1 {
    public static final mjm1 b;
    public o4s a;

    static {
        mjm1 mjm1Var = new mjm1();
        mjm1Var.a = null;
        b = mjm1Var;
    }

    public static o4s a(Context context) {
        o4s o4sVar;
        mjm1 mjm1Var = b;
        synchronized (mjm1Var) {
            try {
                o4sVar = mjm1Var.a;
                if (o4sVar == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    o4sVar = new o4s(context);
                    mjm1Var.a = o4sVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4sVar;
    }
}
