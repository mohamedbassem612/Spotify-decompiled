package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ovn1 {
    public final byte a;
    public final Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ovn1(axn1 axn1Var, int i) {
        this.b = axn1Var;
        this.a = i;
    }

    public String a(f1p1 f1p1Var) {
        String str;
        axn1 axn1Var = (axn1) this.b;
        byte b = this.a;
        try {
            if (axn1Var.N == null) {
                throw null;
            }
            apn1 apn1Var = axn1Var.N;
            String packageName = axn1Var.L.getPackageName();
            if (b == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (b == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (b == 4) {
                str = "CONSUME_ASYNC";
            } else if (b != 5) {
                str = b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            mwn1 mwn1Var = new mwn1(f1p1Var);
            ron1 ron1Var = (ron1) apn1Var;
            Parcel parcelE1 = ron1Var.e1();
            parcelE1.writeString(packageName);
            parcelE1.writeString(str);
            int i = lon1.a;
            parcelE1.writeStrongBinder(mwn1Var);
            try {
                ((y9n1) ron1Var).l.transact(1, parcelE1, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelE1.recycle();
            }
        } catch (Exception unused) {
            axn1Var.d0(95, 28, iyn1.C);
            vsn1.i("BillingClientTesting");
            f1p1Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ovn1(int i, v3j1... v3j1VarArr) {
        this.a = i;
        this.b = v3j1VarArr;
    }
}
