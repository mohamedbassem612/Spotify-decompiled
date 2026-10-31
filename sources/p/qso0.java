package p;

import io.reactivex.rxjava3.internal.functions.Functions;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qso0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sso0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qso0(sso0 sso0Var, byte b) {
        super(0);
        this.a = b;
        this.b = sso0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        sso0 sso0Var = this.b;
        switch (b) {
            case 0:
                pf30 pf30Var = sso0Var.G1;
                if (pf30Var == null) {
                    u890.C("requestPermissionLauncher");
                    throw null;
                }
                pf30Var.a("android.permission.POST_NOTIFICATIONS");
                qnv0 qnv0Var = sso0Var.J1;
                if (qnv0Var == null) {
                    u890.C("preferencesOptInApi");
                    throw null;
                }
                qnv0Var.a(gfe.b, 7, "spotify:internal:notifications:reinstall-prompt").o(Functions.h).subscribe();
                dma1 dma1Var = sso0Var.H1;
                if (dma1Var == null) {
                    u890.C("prefs");
                    throw null;
                }
                bma1 bma1Var = tso0.i;
                int iL = dma1Var.l(bma1Var, 0) + 1;
                dma1 dma1Var2 = sso0Var.H1;
                if (dma1Var2 == null) {
                    u890.C("prefs");
                    throw null;
                }
                hma1 hma1VarEdit = dma1Var2.edit();
                hma1VarEdit.b(bma1Var, iL);
                hma1VarEdit.g();
                bnj0 bnj0Var = sso0Var.I1;
                if (bnj0Var == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                i8h1 i8h1Var = (i8h1) bnj0Var.b;
                x6h1 x6h1VarC = ((yvk0) bnj0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("reinstall_opt_in_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            default:
                bnj0 bnj0Var2 = sso0Var.I1;
                if (bnj0Var2 == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                i8h1 i8h1Var2 = (i8h1) bnj0Var2.b;
                x6h1 x6h1VarC2 = ((yvk0) bnj0Var2.c).b.c();
                x6h1VarC2.i.add(new a7h1("reinstall_dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                dg30 dg30VarF0 = sso0Var.f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.finish();
                }
                return rih1Var;
        }
    }
}
