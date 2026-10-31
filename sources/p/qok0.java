package p;

import android.app.Activity;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qok0 {
    public static final Object b = new Object();
    public static qok0 c;
    public k1i a;

    public static qok0 c() {
        qok0 qok0Var;
        synchronized (b) {
            zod.v("MlKitContext has not been initialized", c != null);
            qok0Var = c;
            zod.s(qok0Var);
        }
        return qok0Var;
    }

    public static qok0 d(Activity activity, Executor executor) {
        qok0 qok0Var;
        synchronized (b) {
            zod.v("MlKitContext is already initialized", c == null);
            qok0 qok0Var2 = new qok0();
            c = qok0Var2;
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext != null) {
                activity = applicationContext;
            }
            ArrayList arrayListG = aod.h(activity, MlKitComponentDiscoveryService.class).g();
            lag lagVar = new lag(executor);
            lagVar.d(arrayListG);
            lagVar.b(vzh.c(activity, Context.class, new Class[0]));
            lagVar.b(vzh.c(qok0Var2, qok0.class, new Class[0]));
            k1i k1iVarE = lagVar.e();
            qok0Var2.a = k1iVarE;
            k1iVarE.i(true);
            qok0Var = c;
        }
        return qok0Var;
    }

    public final Object a(Class cls) {
        zod.v("MlKitContext has been deleted", c == this);
        zod.s(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
