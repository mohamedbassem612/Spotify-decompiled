package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l8d1 {
    public final lzn0 a;
    public final ryf b;
    public final Activity c;
    public final rwb d;

    public l8d1(lzn0 lzn0Var, ryf ryfVar, Activity activity, rwb rwbVar) {
        this.a = lzn0Var;
        this.b = ryfVar;
        this.c = activity;
        this.d = rwbVar;
    }

    public static void a(l8d1 l8d1Var, String str, tv80 tv80Var, int i) {
        if ((i & 4) != 0) {
            tv80Var = null;
        }
        tv80 tv80Var2 = tv80Var;
        if (str.length() == 0) {
            l8d1Var.getClass();
            return;
        }
        Activity activity = l8d1Var.c;
        if (activity != null) {
            huj.b(l8d1Var.a, activity, l8d1Var.b, oxf.b, str, tv80Var2);
        }
    }
}
