package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x861 extends p3c {
    public final u861 a;
    public final CountDownLatch b;
    public final /* synthetic */ y861 c;

    public x861(y861 y861Var, u861 u861Var, CountDownLatch countDownLatch) {
        this.c = y861Var;
        this.a = u861Var;
        this.b = countDownLatch;
    }

    public final void b(b961 b961Var) {
        boolean z;
        String string;
        String str;
        String string2 = "";
        u861 u861Var = this.a;
        try {
            i1k0.B("onPostExecuteInner " + u861Var);
            if (n3c.x != null && (u861Var instanceof v861)) {
                JSONObject jSONObject = u861Var.c;
                f4t f4tVar = f4t.RandomizedBundleToken;
                String string3 = jSONObject.has("external_intent_uri") ? u861Var.c.getString("external_intent_uri") : "";
                JSONObject jSONObjectA = b961Var.a();
                int i = b961Var.a;
                if (i != 200) {
                    String str2 = b961Var.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    if (i == -113) {
                        str = " Check network connectivity or DNS settings.";
                    } else if (i == -114) {
                        str = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
                    } else if (i == -104) {
                        str = " Did you forget to call init? Make sure you init the session before making Branch calls.";
                    } else if (i == -101) {
                        str = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
                    } else if (i == -102) {
                        str = " Please add 'android.permission.INTERNET' in your applications manifest file.";
                    } else if (i == -105) {
                        str = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
                    } else if (i == -108) {
                        str = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
                    } else if (i == -109) {
                        str = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
                    } else if (i == -110) {
                        str = " Unable create share options. Couldn't find applications on device to share the link.";
                    } else if (i == -111) {
                        str = " Request to Branch server timed out. Please check your internet connectivity";
                    } else if (i == -117) {
                        str = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
                    } else if (i == -118) {
                        str = " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
                    } else if (i >= 500 || i == -112) {
                        str = " Unable to reach the Branch servers, please try again shortly.";
                    } else if (i == 409 || i == -115) {
                        str = " A resource with this identifier already exists.";
                    } else if (i >= 400 || i == -116) {
                        str = " The request was invalid";
                    } else if (i == -119) {
                        str = "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".";
                    } else {
                        str = i == -120 ? " Task exceeded timeout." : " See exception message or logs for more details. ";
                    }
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = "";
                }
                bb01 bb01Var = n3c.x;
                u861Var.e();
                bb01Var.q(string3, string, jSONObjectA);
            }
        } catch (Exception e) {
            i1k0.n("Failed to invoke tracing request callback:" + e.getMessage());
        }
        this.b.countDown();
        if (b961Var == null) {
            u861Var.f(-122, "Null response.");
            return;
        }
        String str3 = b961Var.c;
        int i2 = b961Var.a;
        y861 y861Var = this.c;
        if (i2 == 200) {
            i1k0.B("onRequestSuccess " + b961Var);
            JSONObject jSONObjectA2 = b961Var.a();
            if (jSONObjectA2 == null) {
                u861Var.f(500, "Null response json.");
            }
            if (u861Var instanceof oaz0) {
                n3c.h().g.clear();
                n3c.h().f.d();
            }
            if (u861Var instanceof v861) {
                if (!n3c.h().k.a && jSONObjectA2 != null) {
                    try {
                        f4t f4tVar2 = f4t.RandomizedBundleToken;
                        if (jSONObjectA2.has("session_id")) {
                            n3c.h().b.Z("bnc_session_id", jSONObjectA2.getString("session_id"));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (jSONObjectA2.has("randomized_bundle_token")) {
                            String string4 = jSONObjectA2.getString("randomized_bundle_token");
                            if (!n3c.h().b.B().equals(string4)) {
                                n3c.h().g.clear();
                                n3c.h().b.Z("bnc_randomized_bundle_token", string4);
                                z = true;
                            }
                        }
                        if (jSONObjectA2.has("randomized_device_token")) {
                            n3c.h().b.Z("bnc_randomized_device_token", jSONObjectA2.getString("randomized_device_token"));
                            z = true;
                        }
                        if (z) {
                            y861Var.s();
                        }
                    } catch (JSONException e2) {
                        l1d.A(e2, new StringBuilder("Caught JSONException "));
                    }
                }
                n3c.h().n = 1;
                n3c.h().a();
                n3c.h().getClass();
                n3c.h().getClass();
            }
            if (jSONObjectA2 != null) {
                u861Var.h(b961Var, n3c.h());
                y861Var.q(u861Var);
            } else {
                y861Var.q(u861Var);
            }
        } else {
            i1k0.B("onRequestFailed " + str3);
            if ((u861Var instanceof v861) && "bnc_no_value".equals(n3c.h().b.F("bnc_session_params"))) {
                n3c.h().n = 3;
            }
            y861Var.a = false;
            StringBuilder sb2 = new StringBuilder();
            try {
                JSONObject jSONObjectA3 = b961Var.a();
                if (jSONObjectA3 != null && jSONObjectA3.has("error") && jSONObjectA3.getJSONObject("error").has("message") && (string2 = jSONObjectA3.getJSONObject("error").getString("message")) != null && string2.trim().length() > 0) {
                    string2 = string2.concat(".");
                }
            } catch (Exception e3) {
                i1k0.C("Caught Exception ServerResponse getFailReason: " + e3.getMessage());
            }
            sb2.append(string2);
            sb2.append(i2);
            sb2.append(" ");
            sb2.append(str3);
            u861Var.f(i2, sb2.toString());
            if (400 <= i2) {
            }
            n3c.h().f.q(u861Var);
        }
        y861Var.a = false;
        new Handler(Looper.getMainLooper()).post(new xfz0(this, (byte) 11));
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        u861 u861Var = this.a;
        u861Var.a();
        int i = u861Var.d;
        if ((u861Var instanceof oaz0) || (u861Var instanceof paz0)) {
            return new b961(200, "");
        }
        if (n3c.h().k.a && !u861Var.i()) {
            return new b961(-117, "Tracking is disabled");
        }
        String strF = n3c.h().b.F("bnc_branch_key");
        b961 b961VarF = null;
        try {
            i1k0.B("BranchPostTask doInBackground beginning rest post for " + u861Var);
            b961VarF = n3c.h().a.f(u861Var.d((ConcurrentHashMap) this.c.d), u861Var.e(), eqq.f(i), strF);
            this.b.countDown();
            return b961VarF;
        } catch (Exception e) {
            i1k0.B("BranchPostTask doInBackground caught exception: " + e.getMessage());
            return b961VarF;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b961 b961Var = (b961) obj;
        super.onPostExecute(b961Var);
        b(b961Var);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        u861 u861Var = this.a;
        u861Var.g();
        u861Var.b();
    }
}
