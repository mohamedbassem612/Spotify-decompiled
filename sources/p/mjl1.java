package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mjl1 extends cil1 {
    public static final Parcelable.Creator<mjl1> CREATOR = new ylk1((byte) 20);
    public ail1 d;
    public String e;

    @Override // p.t1f0
    public final void b() {
        ail1 ail1Var = this.d;
        if (ail1Var != null) {
            if (ail1Var != null) {
                ail1Var.cancel();
            }
            this.d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.t1f0
    public final String j() {
        return "web_view";
    }

    @Override // p.t1f0
    public final int t(rye0 rye0Var) {
        dg30 dg30Var;
        ail1 ail1Var;
        Uri uriA;
        String str = rye0Var.e;
        Bundle bundleB = B(rye0Var);
        x(bundleB, rye0Var);
        ilh1 ilh1Var = new ilh1(this, rye0Var, (byte) 27);
        String strM = mod.m();
        this.e = strM;
        a("e2e", strM);
        dg30 dg30VarJ = h().j();
        if (dg30VarJ == null) {
            return 0;
        }
        boolean zU = fpi1.u(dg30VarJ);
        String str2 = rye0Var.d;
        w0h1.D(str2, "applicationId");
        String str3 = this.e;
        String str4 = zU ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String str5 = rye0Var.t;
        int i = rye0Var.a;
        int i2 = rye0Var.N0;
        boolean z = rye0Var.O0;
        boolean z2 = rye0Var.P0;
        boolean z3 = str == null || str.length() == 0;
        if (!bundleB.containsKey("redirect_uri")) {
            bundleB.putString("redirect_uri", str4);
        }
        bundleB.putString("client_id", str2);
        bundleB.putString("e2e", str3);
        bundleB.putString("response_type", i2 == 2 ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundleB.putString("return_scopes", "true");
        bundleB.putString("auth_type", str5);
        bundleB.putString("login_behavior", g5d0.s(i));
        if (z) {
            bundleB.putString("fx_app", pze0.b(i2));
        }
        if (z2) {
            bundleB.putString("skip_dedupe", "true");
        }
        if (z3) {
            int i3 = ail1.Z;
            ail1.b(dg30VarJ);
            dg30Var = dg30VarJ;
            ail1Var = new ail1(dg30Var, "oauth", bundleB, i2, ilh1Var);
        } else {
            int i4 = ljl1.O0;
            str.getClass();
            Bundle bundle = new Bundle(bundleB);
            bundle.putString("display", "touch");
            bundle.putString("client_id", wf10.b());
            bundle.putString("sdk", "android-18.2.3");
            if (kjl1.a[l1d.C(i2)] == 1) {
                uriA = fpi1.a(kno1.w(), "oauth/authorize", bundle);
            } else {
                uriA = fpi1.a(kno1.r(), wf10.d() + "/dialog/oauth", bundle);
            }
            ail1.b(dg30VarJ);
            ljl1 ljl1Var = new ljl1(dg30VarJ, uriA.toString(), str);
            ljl1Var.c = ilh1Var;
            dg30Var = dg30VarJ;
            ail1Var = ljl1Var;
        }
        this.d = ail1Var;
        cf10 cf10Var = new cf10();
        cf10Var.W0();
        cf10Var.V1 = this.d;
        cf10Var.g1(dg30Var.e0(), "FacebookDialogFragment");
        return 1;
    }

    @Override // p.t1f0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
