package p;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import io.reactivex.rxjava3.core.SingleEmitter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mtn1 extends mh70 {
    public final zgz0 l;
    public final lxn1 m;
    public final int n;

    public mtn1(zgz0 zgz0Var, bym1 bym1Var, int i) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", (byte) 2);
        this.l = zgz0Var;
        this.m = bym1Var;
        this.n = i;
    }

    @Override // p.mh70
    public final boolean B0(int i, Parcel parcel, Parcel parcel2) {
        v231 b231Var;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) lon1.a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(f4i1.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        int i2 = this.n;
        jno1 jno1Var = jno1.b;
        lxn1 lxn1Var = this.m;
        zgz0 zgz0Var = this.l;
        if (bundle == null) {
            iua iuaVar = iyn1.f;
            ((bym1) lxn1Var).n(hxn1.b(63, 13, iuaVar, null, jno1Var), i2);
            zgz0Var.g(iuaVar);
        } else {
            int iA = vsn1.a(bundle, "BillingClient");
            String strF = vsn1.f(bundle, "BillingClient");
            v vVarA = iua.a();
            vVarA.a = iA;
            vVarA.c = strF;
            if (iA != 0) {
                Log.isLoggable("BillingClient", 5);
                iua iuaVarA = vVarA.a();
                ((bym1) lxn1Var).n(hxn1.b(23, 13, iuaVarA, null, jno1Var), i2);
                zgz0Var.g(iuaVarA);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    String strOptString = new JSONObject(bundle.getString("BILLING_CONFIG")).optString("countryCode");
                    iua iuaVarA2 = vVarA.a();
                    zgz0Var.getClass();
                    int i3 = iuaVarA2.a;
                    if (i3 == 0) {
                        b231Var = strOptString != null ? new v231(new zsa(strOptString)) : new h231(9, new IllegalStateException("null config.countryCode"));
                    } else {
                        b231Var = new b231(9, i3, iuaVarA2.c);
                    }
                    ((SingleEmitter) zgz0Var.b).onSuccess(b231Var);
                } catch (JSONException unused) {
                    vsn1.i("BillingClient");
                    iua iuaVar2 = iyn1.f;
                    ((bym1) lxn1Var).n(hxn1.b(65, 13, iuaVar2, null, jno1Var), i2);
                    zgz0Var.g(iuaVar2);
                }
            } else {
                Log.isLoggable("BillingClient", 5);
                vVarA.a = 6;
                iua iuaVarA3 = vVarA.a();
                ((bym1) lxn1Var).n(hxn1.b(64, 13, iuaVarA3, null, jno1Var), i2);
                zgz0Var.g(iuaVarA3);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
