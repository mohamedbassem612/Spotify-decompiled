package p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xae {
    public final Activity a;
    public final efr b;
    public final lo9 c;

    public /* synthetic */ xae(Activity activity, efr efrVar, lo9 lo9Var) {
        this.a = activity;
        this.b = efrVar;
        this.c = lo9Var;
    }

    public static void a(Function0 function0) {
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new is3(function0, (byte) 8));
        }
    }
}
