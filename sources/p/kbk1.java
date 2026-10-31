package p;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kbk1 extends TimerTask {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kbk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        jub1 jub1VarQ;
        byte b = this.a;
        Handler handler = null;
        Object obj = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                lbk1 lbk1Var = (lbk1) obj;
                try {
                    if (dhn.a.contains(lbk1.class)) {
                        weakReference = null;
                    } else {
                        try {
                            weakReference = lbk1Var.b;
                        } catch (Throwable th) {
                            dhn.a(lbk1.class, th);
                            weakReference = null;
                        }
                    }
                    Activity activity = (Activity) weakReference.get();
                    View viewK = jm5.k(activity);
                    if (activity != null && viewK != null) {
                        String simpleName = activity.getClass().getSimpleName();
                        wwg wwgVar = wwg.a;
                        if (!dhn.a.contains(wwg.class)) {
                            try {
                                z = wwg.g.get();
                            } catch (Throwable th2) {
                                dhn.a(wwg.class, th2);
                            }
                        }
                        if (z) {
                            FutureTask futureTask = new FutureTask(new sra(viewK));
                            if (!dhn.a.contains(lbk1.class)) {
                                try {
                                    handler = lbk1Var.a;
                                } catch (Throwable th3) {
                                    dhn.a(lbk1.class, th3);
                                }
                            }
                            handler.post(futureTask);
                            String str = "";
                            try {
                                str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                            } catch (Exception unused) {
                                lbk1.a();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("screenname", simpleName);
                                jSONObject.put("screenshot", str);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(ibk1.d(viewK));
                                jSONObject.put("view", jSONArray);
                            } catch (JSONException unused2) {
                                lbk1.a();
                            }
                            String string = jSONObject.toString();
                            Set set = dhn.a;
                            if (!set.contains(lbk1.class)) {
                                try {
                                    if (!set.contains(lbk1Var)) {
                                        try {
                                            wf10.c().execute(new qub1(string, lbk1Var, (byte) 12));
                                        } catch (Throwable th4) {
                                            dhn.a(lbk1Var, th4);
                                        }
                                    }
                                } catch (Throwable th5) {
                                    dhn.a(lbk1.class, th5);
                                    return;
                                }
                                break;
                            }
                            break;
                        }
                    }
                } catch (Exception unused3) {
                    lbk1.a();
                    return;
                }
                break;
            case 1:
                koh0 koh0Var = (koh0) obj;
                ArrayDeque arrayDeque = (ArrayDeque) koh0Var.h;
                if (!arrayDeque.isEmpty() && ((BasePendingResult) koh0Var.k) == null && koh0Var.a != 0) {
                    e321 e321Var = (e321) koh0Var.c;
                    int[] iArrD = o4e.d(arrayDeque);
                    e321Var.getClass();
                    zod.n("Must be called from the main thread.");
                    if (e321Var.r()) {
                        jub1 min1Var = new min1(e321Var, iArrD);
                        e321.s(min1Var);
                        jub1VarQ = min1Var;
                    } else {
                        jub1VarQ = e321.q();
                    }
                    koh0Var.k = jub1VarQ;
                    jub1VarQ.h(new vso1(koh0Var, (byte) 0));
                    arrayDeque.clear();
                }
                break;
            default:
                try {
                    fqn1 fqn1Var = (fqn1) obj;
                    fn31.T(((pjo1) ((qeh1) fqn1Var.d).b).f.a, null, 0, new gld(fqn1Var, 0, (lnm) null), 3);
                } catch (Exception unused4) {
                    return;
                }
                break;
        }
    }
}
