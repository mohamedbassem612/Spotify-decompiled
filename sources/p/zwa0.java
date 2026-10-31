package p;

import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zwa0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xk b;
    public final /* synthetic */ swa0 c;

    public /* synthetic */ zwa0(xk xkVar, swa0 swa0Var, byte b) {
        this.a = b;
        this.b = xkVar;
        this.c = swa0Var;
    }

    public final void accept(Object obj) {
        String str;
        byte b = this.a;
        swa0 swa0Var = this.c;
        xk xkVar = this.b;
        switch (b) {
            case 0:
                xwa0 xwa0Var = (xwa0) obj;
                tv80 tv80Var = xwa0Var.d;
                dxr0 dxr0Var = new dxr0(xwa0Var.a, xwa0Var.b);
                if (!(xwa0Var.c instanceof xxa0)) {
                    nwa nwaVar = swa0Var.c;
                    swa0Var.d = twa0.a(swa0Var.d, (String) null, (String) null, (String) null, dxr0Var, (String) null, (String) null, false, false, 0, (String) null, (yxa0) null, (tpw0) null, 8183);
                    Bundle bundle = new Bundle();
                    yxa0 yxa0Var = swa0Var.d.Y;
                    if (u890.j(yxa0Var, txa0.a)) {
                        bundle.putString("name", swa0Var.d.b);
                        bundle.putString("birthday", nwaVar.a(swa0Var.d.c));
                        bundle.putString("pin", swa0Var.d.a);
                        bundle.putParcelable("parental_controls", swa0Var.d.d);
                        bundle.putParcelable("key_flow_type", swa0Var.d.Y);
                        str = nik1.A3.a;
                    } else if (yxa0Var instanceof uxa0) {
                        bundle.putParcelable("flow_type", yxa0Var);
                        bundle.putString("kid_name", swa0Var.d.b);
                        bundle.putString("kid_birthday", nwaVar.a(swa0Var.d.c));
                        bundle.putString("pin", swa0Var.d.a);
                        bundle.putParcelable("parental_controls", swa0Var.d.d);
                        str = nik1.N3.a;
                    } else if (!(yxa0Var instanceof xxa0)) {
                        eg.o();
                    } else {
                        eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                    }
                    swa0Var.a.c(str, tv80Var, bundle);
                } else {
                    xkVar.c(dl.b, tv80Var, mno1.h(new mmr0[]{new mmr0("default_control", dxr0Var)}));
                }
                break;
            default:
                mlg1 mlg1Var = (mlg1) obj;
                if (!mlg1Var.b) {
                    int i = swa0Var.d.i;
                    Parcelable.Creator creator = twa0.CREATOR;
                    rzn1.t();
                    swa0Var.d = twa0.N0;
                    swa0Var.a.b(i + 2);
                } else {
                    xkVar.b(mlg1Var.c, mlg1Var.d);
                }
                break;
        }
    }
}
