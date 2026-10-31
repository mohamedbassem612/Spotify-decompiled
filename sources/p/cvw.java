package p;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cvw extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvw(evw evwVar, byte b) {
        super(0);
        this.a = b;
        this.b = evwVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        evw evwVar = this.b;
        switch (b) {
            case 0:
                wvw wvwVar = (wvw) evwVar.K1.getValue();
                jut jutVar = wvwVar.c;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC = ((h4l0) jutVar.b).b.c();
                x6h1VarC.i.add(new a7h1("login_with_password_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                w6b1 w6b1VarA = f7b1.a(blc0.oa);
                String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                wvwVar.W(new mhv0("email_otp", "login_with_password", ew80.c, (String) null));
                String string = evwVar.O0().getString("login_email");
                if (string == null) {
                    string = evwVar.O0().getString("email_address");
                }
                kg0 kg0Var = evwVar.G1;
                if (kg0Var != null) {
                    kg0.e(kg0Var, new tjt(string), (ifl1) null);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            case 1:
                wvw wvwVar2 = (wvw) evwVar.K1.getValue();
                jut jutVar2 = wvwVar2.c;
                i8h1 i8h1Var2 = (i8h1) jutVar2.c;
                x6h1 x6h1VarC2 = ((h4l0) jutVar2.b).b.c();
                x6h1VarC2.i.add(new a7h1("open_email_app_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                wvwVar2.W(new mhv0("email_otp", "open_email_app", ew80.c, (String) null));
                if (evwVar.H1 != null) {
                    bvw.a(evwVar.P0());
                    return rih1Var;
                }
                u890.C("emailClientLauncher");
                throw null;
            default:
                Map map = evwVar.J1;
                if (map == null) {
                    u890.C("viewModelFactoryMap");
                    throw null;
                }
                Object obj = map.get(wvw.class);
                obj.getClass();
                return (eck1) obj;
        }
    }
}
