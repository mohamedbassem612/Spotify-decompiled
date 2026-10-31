package p;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gnn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hnn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnn0(hnn0 hnn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hnn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hnn0 hnn0Var = this.b;
        switch (b) {
            case 0:
                Context context = hnn0Var.a;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new we41(applicationContext instanceof Application ? (Application) applicationContext : null, hnn0Var, hnn0Var.a());
            default:
                if (!hnn0Var.t) {
                    eg.m("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (hnn0Var.h.i == w8c0.a) {
                    eg.m("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                hce1 hce1Var = new hce1(hnn0Var.o(), new enn0(hnn0Var), n9p1.s(hnn0Var));
                tka0 tka0VarB = rc11.a.b(fnn0.class);
                String strO = tka0VarB.o();
                if (strO != null) {
                    return ((fnn0) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB)).b;
                }
                hhg1.n("Local and anonymous classes can not be ViewModels");
                return null;
        }
    }
}
