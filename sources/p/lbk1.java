package p;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lbk1 {
    public static final /* synthetic */ int e = 0;
    public final WeakReference b;
    public Timer c;
    public String d = null;
    public final Handler a = new Handler(Looper.getMainLooper());

    public lbk1(Activity activity) {
        this.b = new WeakReference(activity);
    }

    public static final void a() {
        dhn.a.contains(lbk1.class);
    }

    public final void b(md50 md50Var, String str) {
        Set set = dhn.a;
        if (set.contains(this) || md50Var == null) {
            return;
        }
        try {
            pd50 pd50VarC = md50Var.c();
            try {
                JSONObject jSONObject = pd50VarC.b;
                if (jSONObject == null) {
                    Objects.toString(pd50VarC.c);
                    return;
                }
                if ("true".equals(jSONObject.optString("success"))) {
                    fza fzaVar = oue0.a;
                    synchronized (wf10.b) {
                    }
                    this.d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(wwg.class)) {
                        return;
                    }
                    try {
                        wwg.g.set(z);
                    } catch (Throwable th) {
                        dhn.a(wwg.class, th);
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    public final void c() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            try {
                wf10.c().execute(new qub1(this, new kbk1(this, (byte) 0), (byte) 11));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
