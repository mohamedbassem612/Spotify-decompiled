package p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ds50 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object m231Var;
        try {
            m231Var = new bs50(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object b(a8d1 a8d1Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            ohd ohdVar = new ohd(1, aym.t(a8d1Var));
            ohdVar.t();
            choreographer2.postFrameCallback(new cs50(ohdVar));
            return ohdVar.r();
        }
        ohd ohdVar2 = new ohd(1, aym.t(a8d1Var));
        ohdVar2.t();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c(ohdVar2);
        } else {
            fns fnsVar = igu.a;
            pyf0.a.h(ohdVar2.e, new a6n(ohdVar2, (byte) 27));
        }
        return ohdVar2.r();
    }

    public static final void c(ohd ohdVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new cs50(ohdVar));
    }
}
