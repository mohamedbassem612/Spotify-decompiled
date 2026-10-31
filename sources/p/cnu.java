package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cnu extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fnu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cnu(fnu fnuVar, byte b) {
        super(0);
        this.a = b;
        this.b = fnuVar;
    }

    public final Object invoke() {
        byte b = this.a;
        fnu fnuVar = this.b;
        switch (b) {
            case 0:
                kt91 kt91Var = fnuVar.m;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963488});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.o(new er91((fs91) null, "", 2131963488, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            default:
                dg30 dg30Var = fnuVar.i;
                hce1 hce1Var = new hce1(dg30Var.o(), dg30Var.N(), n9p1.s(dg30Var));
                tka0 tka0VarB = rc11.a.b(wnu.class);
                String strO = tka0VarB.o();
                if (strO != null) {
                    return hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
                }
                hhg1.n("Local and anonymous classes can not be ViewModels");
                return null;
        }
    }
}
