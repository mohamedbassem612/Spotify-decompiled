package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h5o1 extends w4o1 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ o6o1 g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5o1(o6o1 o6o1Var, Bundle bundle, Activity activity) {
        super(o6o1Var.a, true);
        this.h = bundle;
        this.f = activity;
        this.g = o6o1Var;
    }

    public final void a() {
        Bundle bundle;
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Bundle bundle2 = (Bundle) this.h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                kvn1 kvn1Var = this.g.a.f;
                zod.s(kvn1Var);
                Activity activity = this.f;
                long j = ((w4o1) this).b;
                lyn1 lyn1VarJ = lyn1.j(activity);
                kvn1 kvn1Var2 = kvn1Var;
                Parcel parcelS = kvn1Var2.s();
                drn1.a(parcelS, lyn1VarJ);
                drn1.a(parcelS, bundle);
                parcelS.writeLong(j);
                kvn1Var2.B0(53, parcelS);
                break;
            default:
                kvn1 kvn1Var3 = this.g.a.f;
                zod.s(kvn1Var3);
                lyn1 lyn1VarJ2 = lyn1.j(this.f);
                mh70 mh70Var = (cvn1) this.h;
                long j2 = ((w4o1) this).b;
                kvn1 kvn1Var4 = kvn1Var3;
                Parcel parcelS2 = kvn1Var4.s();
                drn1.a(parcelS2, lyn1VarJ2);
                drn1.b(parcelS2, mh70Var);
                parcelS2.writeLong(j2);
                kvn1Var4.B0(57, parcelS2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5o1(o6o1 o6o1Var, Activity activity, cvn1 cvn1Var) {
        super(o6o1Var.a, true);
        this.f = activity;
        this.h = cvn1Var;
        this.g = o6o1Var;
    }
}
