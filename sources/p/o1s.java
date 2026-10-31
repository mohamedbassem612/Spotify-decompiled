package p;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o1s {
    public final Activity a;

    public o1s(Activity activity) {
        this.a = activity;
    }

    public static mw40 a(o1s o1sVar, Context context, String str, String str2, String str3, Function0 function0, String str4, Function0 function1, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            function1 = h050.V0;
        }
        h050 h050Var = h050.W0;
        o1sVar.getClass();
        uw0 uw0Var = new uw0();
        uw0Var.c = str;
        uw0Var.Y = str2;
        uw0Var.Z = str3;
        uw0Var.N0 = function0;
        uw0Var.b = str4;
        uw0Var.O0 = function1;
        new nxr((Object) h050Var, (Object) o1sVar, (byte) 5);
        return new mw40(context, uw0Var);
    }
}
