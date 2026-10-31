package p;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i1f0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k1f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1f0(k1f0 k1f0Var, byte b) {
        super(0);
        this.a = b;
        this.b = k1f0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k1f0 k1f0Var = this.b;
        switch (b) {
            case 0:
                Context contextP0 = k1f0Var.P0();
                hrr0 hrr0Var = k1f0Var.P1;
                if (((Boolean) hrr0Var.getValue()).booleanValue()) {
                    uo5 uo5Var = k1f0Var.Y0().d;
                    uba ubaVar = (b2r0) uo5Var.c;
                    x6h1 x6h1VarC = ((xdl0) uo5Var.d).a.c();
                    x6h1VarC.i.add(new a7h1("open_email_app_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    uba ubaVar2 = ubaVar;
                    ubaVar2.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                    ((ohv0) uo5Var.b).a(new mhv0("autosend_dual_button", ktd.d(18), ew80.c, (String) null));
                    hrr0Var.setValue(Boolean.FALSE);
                }
                if (k1f0Var.N1 != null) {
                    bvw.a(contextP0);
                    return rih1Var;
                }
                u890.C("emailClientLauncher");
                throw null;
            case 1:
                hrr0 hrr0Var2 = k1f0Var.P1;
                if (((Boolean) hrr0Var2.getValue()).booleanValue()) {
                    ((ohv0) k1f0Var.Y0().d.b).a(new mhv0("autosend_dual_button", ktd.d(39), ew80.c, (String) null));
                }
                hrr0Var2.setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                ((ohv0) k1f0Var.Y0().d.b).a(new mhv0("login", ab80.g(2), ew80.b, (String) null));
                return rih1Var;
            default:
                ((ohv0) k1f0Var.Y0().d.b).a(new khv0("login", 4, (Map) null, "password_autofill"));
                return rih1Var;
        }
    }
}
