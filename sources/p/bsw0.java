package p;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class bsw0 {
    public static volatile zrw0 a;
    public static volatile b3e0 b;
    public static volatile Integer c;
    public static final bbc d = mno1.a(-1, 0, 6);
    public static final Object e = new Object();
    public static llm f;

    public static void a(Context context, UUID uuid) {
        synchronized (e) {
            if (f == null) {
                fns fnsVar = igu.a;
                llm llmVarE = smo1.e(flo1.l(guo1.B(), b3s.c).y(new z8n("process-state-summary-writer")));
                fn31.T(llmVarE, (o8n) null, 0, new i7u0(2, null), 3);
                f = llmVarE;
            }
        }
        d.l(new asw0(context, uuid));
    }

    public static void b(Context context, UUID uuid) {
        zrw0 zrw0Var = a;
        String str = zrw0Var != null ? zrw0Var.a : null;
        String str2 = zrw0Var != null ? zrw0Var.b : null;
        b3e0 b3e0Var = b;
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
            if (activityManager == null) {
                return;
            }
            byte[] bArrN = sjo0.n(uuid, str, str2, b3e0Var);
            if (bArrN.length > 128) {
                bArrN = sjo0.n(uuid, str, (String) null, b3e0Var);
                if (bArrN.length > 128) {
                    bArrN = sjo0.n(uuid, (String) null, (String) null, b3e0Var);
                    if (bArrN.length > 128) {
                        bArrN = sjo0.n(uuid, (String) null, (String) null, (b3e0) null);
                    }
                }
            }
            if (bArrN.length > 128) {
                throw new IllegalStateException("Check failed.");
            }
            activityManager.setProcessStateSummary(bArrN);
        } catch (RuntimeException e2) {
            Logger.l(e2, "Failed to write process state summary", new Object[0]);
        }
    }
}
