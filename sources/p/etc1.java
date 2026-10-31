package p;

import android.app.Activity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class etc1 {
    public static final etc1 a = new etc1();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final LinkedHashSet c = new LinkedHashSet();
    public static final LinkedHashSet d = new LinkedHashSet();

    public static final synchronized void a() {
        if (dhn.a.contains(etc1.class)) {
            return;
        }
        try {
            wf10.c().execute(new k((byte) 15));
        } catch (Throwable th) {
            dhn.a(etc1.class, th);
        }
    }

    public static final void d(Activity activity) {
        Set set = dhn.a;
        if (set.contains(etc1.class)) {
            return;
        }
        try {
            if (b.get()) {
                boolean z = false;
                if (!set.contains(mm10.class)) {
                    try {
                        z = mm10.g;
                    } catch (Throwable th) {
                        dhn.a(mm10.class, th);
                    }
                }
                if (z) {
                    if (c.isEmpty()) {
                        if (!d.isEmpty()) {
                        }
                    }
                    HashMap map = tck1.d;
                    p9p1.B(activity);
                    return;
                }
            }
            HashMap map2 = tck1.d;
            p9p1.C(activity);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            dhn.a(etc1.class, th2);
        }
    }

    public final void b() {
        String str;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            c120 c120VarK = g120.k(wf10.b(), false);
            if (c120VarK != null && (str = c120VarK.k) != null) {
                c(str);
                if (c.isEmpty() && d.isEmpty()) {
                    return;
                }
                File fileD = dim0.d();
                if (fileD == null) {
                    return;
                }
                mm10.f(fileD);
                WeakReference weakReference = og0.k;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void c(String str) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    c.add(jSONArray.getString(i));
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    d.add(jSONArray2.getString(i2));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
