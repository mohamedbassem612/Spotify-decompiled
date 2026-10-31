package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vdb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdb(zdb zdbVar, byte b) {
        super(0);
        this.a = b;
        this.b = zdbVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zdb zdbVar = this.b;
        switch (b) {
            case 0:
                teb tebVar = zdbVar.U1;
                if (tebVar != null) {
                    ((ohv0) tebVar.e).a(new khv0(((gp41) tebVar.d).a, 4, (Map) null, "email_autofill"));
                    return rih1Var;
                }
                u890.C("blueprintActionsTracker");
                throw null;
            case 1:
                teb tebVar2 = zdbVar.U1;
                if (tebVar2 == null) {
                    u890.C("blueprintActionsTracker");
                    throw null;
                }
                if (!tebVar2.a) {
                    tebVar2.a = true;
                    i8h1 i8h1Var = (i8h1) tebVar2.f;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-login-and-sign-up-screen";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    y6h1 y6h1VarA = x6h1VarI.a();
                    p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("email_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC.a();
                    b7x b7xVar = b7x.a;
                    i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()));
                }
                return rih1Var;
            case 2:
                zdbVar.a2.setValue((Object) null);
                return rih1Var;
            default:
                zdbVar.a1().F();
                return rih1Var;
        }
    }
}
