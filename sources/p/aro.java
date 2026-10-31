package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aro extends cil1 {
    public static final Parcelable.Creator<aro> CREATOR = new rco((byte) 13);
    public static boolean i;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final oe h;

    public aro(tye0 tye0Var) {
        super(tye0Var);
        this.g = "custom_tab";
        this.h = oe.e;
        this.e = new BigInteger(100, new SecureRandom()).toString(32);
        i = false;
        this.f = dro.C(super.k());
    }

    @Override // p.cil1
    public final String F() {
        return "chrome_custom_tab";
    }

    @Override // p.cil1
    public final oe H() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.t1f0
    public final String j() {
        return this.g;
    }

    @Override // p.t1f0
    public final String k() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: JSONException -> 0x0070, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0070, blocks: (B:24:0x0056, B:27:0x005f), top: B:69:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // p.t1f0
    public final boolean n(int i2, int i3, Intent intent) {
        rye0 rye0Var;
        String stringExtra;
        Bundle bundleE;
        String string;
        String string2;
        String string3;
        int i4;
        String string4;
        boolean zJ = false;
        if (intent != null) {
            int i5 = CustomTabMainActivity.c;
            if (!intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                if (i2 == 1 && (rye0Var = h().g) != null) {
                    if (i3 == -1) {
                        K(rye0Var, null, new FacebookOperationCanceledException());
                        return false;
                    }
                    if (intent != null) {
                        int i6 = CustomTabMainActivity.c;
                        stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
                    } else {
                        stringExtra = null;
                    }
                    if (stringExtra != null && (nhc1.Y(stringExtra, "fbconnect://cct.", false) || nhc1.Y(stringExtra, super.k(), false))) {
                        Uri uri = Uri.parse(stringExtra);
                        bundleE = fpi1.E(uri.getQuery());
                        bundleE.putAll(fpi1.E(uri.getFragment()));
                        try {
                            string4 = bundleE.getString("state");
                            if (string4 == null) {
                                zJ = u890.j(new JSONObject(string4).getString("7_challenge"), this.e);
                            }
                        } catch (JSONException unused) {
                        }
                        if (zJ) {
                            string = bundleE.getString("error");
                            if (string == null) {
                                string = bundleE.getString("error_type");
                            }
                            string2 = bundleE.getString("error_msg");
                            if (string2 == null) {
                                string2 = bundleE.getString("error_message");
                            }
                            if (string2 == null) {
                                string2 = bundleE.getString("error_description");
                            }
                            string3 = bundleE.getString("error_code");
                            if (string3 != null) {
                                try {
                                    i4 = Integer.parseInt(string3);
                                } catch (NumberFormatException unused2) {
                                    i4 = -1;
                                }
                            } else {
                                i4 = -1;
                            }
                            if (!fpi1.y(string) && fpi1.y(string2) && i4 == -1) {
                                if (bundleE.containsKey("access_token")) {
                                    K(rye0Var, bundleE, null);
                                } else {
                                    wf10.c().execute(new c45(this, rye0Var, bundleE, (byte) 8));
                                }
                            } else if ((string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || i4 == 4201) {
                                K(rye0Var, null, new FacebookOperationCanceledException());
                            } else {
                                K(rye0Var, null, new FacebookServiceException(new lf10(i4, string, string2), string2));
                            }
                        } else {
                            K(rye0Var, null, new FacebookException("Invalid state parameter"));
                        }
                    }
                    return true;
                }
            }
        } else if (i2 == 1) {
            if (i3 == -1) {
                K(rye0Var, null, new FacebookOperationCanceledException());
                return false;
            }
            if (intent != null) {
                int i7 = CustomTabMainActivity.c;
                stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                Uri uri2 = Uri.parse(stringExtra);
                bundleE = fpi1.E(uri2.getQuery());
                bundleE.putAll(fpi1.E(uri2.getFragment()));
                string4 = bundleE.getString("state");
                if (string4 == null) {
                    zJ = u890.j(new JSONObject(string4).getString("7_challenge"), this.e);
                }
                if (zJ) {
                    K(rye0Var, null, new FacebookException("Invalid state parameter"));
                } else {
                    string = bundleE.getString("error");
                    if (string == null) {
                        string = bundleE.getString("error_type");
                    }
                    string2 = bundleE.getString("error_msg");
                    if (string2 == null) {
                        string2 = bundleE.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = bundleE.getString("error_description");
                    }
                    string3 = bundleE.getString("error_code");
                    if (string3 != null) {
                        i4 = Integer.parseInt(string3);
                    } else {
                        i4 = -1;
                    }
                    if (!fpi1.y(string)) {
                        if (string == null) {
                            K(rye0Var, null, new FacebookServiceException(new lf10(i4, string, string2), string2));
                        } else {
                            K(rye0Var, null, new FacebookServiceException(new lf10(i4, string, string2), string2));
                        }
                    } else if (string == null) {
                        K(rye0Var, null, new FacebookServiceException(new lf10(i4, string, string2), string2));
                    } else {
                        K(rye0Var, null, new FacebookServiceException(new lf10(i4, string, string2), string2));
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.t1f0
    public final void s(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.e);
    }

    @Override // p.t1f0
    public final int t(rye0 rye0Var) {
        int i2 = rye0Var.N0;
        tye0 tye0VarH = h();
        if (this.f.length() == 0) {
            return 0;
        }
        Bundle bundleB = B(rye0Var);
        x(bundleB, rye0Var);
        if (i) {
            bundleB.putString("cct_over_app_switch", "1");
        }
        if (wf10.n) {
            if (i2 == 2) {
                asn asnVar = cro.b;
                hyo1.o(fpi1.a(kno1.w(), "oauth/authorize", bundleB));
            } else {
                asn asnVar2 = cro.b;
                hyo1.o(fpi1.a(kno1.r(), wf10.d() + "/dialog/oauth", bundleB));
            }
        }
        dg30 dg30VarJ = tye0VarH.j();
        if (dg30VarJ == null) {
            return 0;
        }
        Intent intent = new Intent((Context) dg30VarJ, (Class<?>) CustomTabMainActivity.class);
        int i3 = CustomTabMainActivity.c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", bundleB);
        String strZ = this.d;
        if (strZ == null) {
            strZ = dro.z();
            this.d = strZ;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", strZ);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", pze0.b(i2));
        l1f0 l1f0Var = tye0VarH.c;
        if (l1f0Var != null) {
            l1f0Var.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // p.t1f0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.e);
    }

    @Override // p.cil1
    public final void x(Bundle bundle, rye0 rye0Var) {
        String str = rye0Var.f;
        super.x(bundle, rye0Var);
        String strConcat = rye0Var.e;
        if (strConcat == null || strConcat.length() == 0) {
            strConcat = (str == null || str.length() == 0) ? this.f : "intent://".concat(str);
        }
        bundle.putString("redirect_uri", strConcat);
    }

    public aro(Parcel parcel) {
        super(parcel);
        this.g = "custom_tab";
        this.h = oe.e;
        this.e = parcel.readString();
        this.f = dro.C(super.k());
    }
}
