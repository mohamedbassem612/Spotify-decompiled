package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class u0s implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0s(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        xd xdVarQ;
        hww0 hww0Var;
        String string2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                v0s v0sVar = (v0s) obj;
                synchronized (v0sVar) {
                    try {
                        q6y q6yVar = (q6y) v0sVar.a.get();
                        ArrayList arrayListD = q6yVar.d();
                        q6yVar.c();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListD.size(); i++) {
                            z09 z09Var = (z09) arrayListD.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", z09Var.b());
                            jSONObject.put("dates", new JSONArray((Collection) z09Var.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                vf10 vf10Var = (vf10) obj;
                ne neVarU0 = ne.f.u0();
                SharedPreferences sharedPreferences = ((ae) neVarU0.b).a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string2 = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(string2);
                        Date date = xd.Y;
                        xdVarQ = fuo1.q(jSONObject3);
                    } catch (JSONException unused) {
                        xdVarQ = null;
                    }
                    break;
                } else {
                    xdVarQ = null;
                }
                if (xdVarQ != null) {
                    neVarU0.S(xdVarQ, false);
                }
                uo5 uo5VarO = uo5.Y.o();
                String string3 = ((ae) uo5VarO.c).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string3 != null) {
                    try {
                        hww0Var = new hww0(new JSONObject(string3));
                    } catch (JSONException unused2) {
                        hww0Var = null;
                    }
                    break;
                } else {
                    hww0Var = null;
                }
                if (hww0Var != null) {
                    uo5VarO.M(hww0Var, false);
                }
                Date date2 = xd.Y;
                if (fuo1.w() && vby0.s() == null) {
                    vby0.o();
                }
                if (vf10Var != null) {
                    vf10Var.d();
                }
                w0o1.n(wf10.a(), wf10.d);
                if (!dhn.a.contains(wgi1.class)) {
                    try {
                        Context contextA = wf10.a();
                        Bundle bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
                        if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            ouz ouzVar = new ouz(contextA);
                            Bundle bundle2 = new Bundle();
                            if (!fpi1.t()) {
                                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            ouzVar.n(bundle2, "fb_auto_applink");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused3) {
                    } catch (Throwable th6) {
                        dhn.a(wgi1.class, th6);
                    }
                }
                w0o1.o(wf10.a().getApplicationContext()).c();
                return null;
        }
    }
}
