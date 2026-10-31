package p;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uf10 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ uf10(Context context, String str, byte b) {
        this.a = b;
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = this.b;
                String str = this.c;
                wf10 wf10Var = wf10.a;
                if (dhn.a.contains(wf10Var)) {
                    return;
                }
                try {
                    en7 en7VarQ = lro1.q(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String strConcat = str.concat("ping");
                    long j = sharedPreferences.getLong(strConcat, 0L);
                    try {
                        sm5 sm5Var = sm5.a;
                        String strJ = w0o1.j(context);
                        w0h1.H();
                        JSONObject jSONObjectA = tm5.a(sm5Var, en7VarQ, strJ, context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false), context);
                        String strI = wbx0.i();
                        if (strI != null) {
                            jSONObjectA.put("install_referrer", strI);
                        }
                        String str2 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                        wf10.t.getClass();
                        String str3 = md50.j;
                        md50 md50VarR = cwl1.R((xd) null, str2, jSONObjectA, (id50) null);
                        if (j == 0 && md50VarR.c().c == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(strConcat, System.currentTimeMillis());
                            editorEdit.apply();
                            fza fzaVar = oue0.a;
                            synchronized (wf10.b) {
                            }
                            return;
                        }
                        return;
                    } catch (JSONException e) {
                        throw new FacebookException("An error occurred while publishing install.", e);
                    }
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    dhn.a(wf10Var, th);
                    return;
                }
            default:
                Context context2 = this.b;
                String str4 = this.c;
                Set set = dhn.a;
                if (set.contains(x4q0.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String strConcat2 = str4.concat("pingForOnDevice");
                    if (sharedPreferences2.getLong(strConcat2, 0L) == 0) {
                        u321 u321Var = u321.b;
                        if (!set.contains(u321.class)) {
                            try {
                                u321.b.d(str4, z6x.a, 1);
                            } catch (Throwable th2) {
                                dhn.a(u321.class, th2);
                            }
                            break;
                        }
                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                        editorEdit2.putLong(strConcat2, System.currentTimeMillis());
                        editorEdit2.apply();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    dhn.a(x4q0.class, th3);
                    return;
                }
        }
    }
}
