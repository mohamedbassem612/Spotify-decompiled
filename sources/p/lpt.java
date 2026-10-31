package p;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class lpt implements id50 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ppt b;

    public /* synthetic */ lpt(ppt pptVar, byte b) {
        this.a = b;
        this.b = pptVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    @Override // p.id50
    public final void a(pd50 pd50Var) throws FacebookException {
        byte b = this.a;
        ppt pptVar = this.b;
        switch (b) {
            case 0:
                if (!pptVar.Z1.get()) {
                    lf10 lf10Var = pd50Var.c;
                    if (lf10Var != null) {
                        int i = lf10Var.c;
                        if (i == 1349174 || i == 1349172) {
                            pptVar.o1();
                        } else if (i == 1349152) {
                            npt nptVar = pptVar.c2;
                            if (nptVar != null) {
                                wvt.a(nptVar.b);
                            }
                            rye0 rye0Var = pptVar.f2;
                            if (rye0Var == null) {
                                pptVar.k1();
                            } else {
                                pptVar.q1(rye0Var);
                            }
                        } else if (i != 1349173) {
                            FacebookException facebookException = lf10Var.i;
                            if (facebookException == null) {
                                facebookException = new FacebookException();
                            }
                            pptVar.l1(facebookException);
                        } else {
                            pptVar.k1();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = pd50Var.b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            pptVar.m1(jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")), jSONObject.getString("access_token"));
                        } catch (JSONException e) {
                            pptVar.l1(new FacebookException(e));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                if (!pptVar.d2) {
                    lf10 lf10Var2 = pd50Var.c;
                    if (lf10Var2 != null) {
                        FacebookException facebookException2 = lf10Var2.i;
                        if (facebookException2 == null) {
                            facebookException2 = new FacebookException();
                        }
                        pptVar.l1(facebookException2);
                    } else {
                        JSONObject jSONObject2 = pd50Var.b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        npt nptVar2 = new npt();
                        try {
                            String string = jSONObject2.getString("user_code");
                            nptVar2.b = string;
                            nptVar2.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                            nptVar2.c = jSONObject2.getString("code");
                            nptVar2.d = jSONObject2.getLong("interval");
                            pptVar.p1(nptVar2);
                        } catch (JSONException e2) {
                            pptVar.l1(new FacebookException(e2));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
