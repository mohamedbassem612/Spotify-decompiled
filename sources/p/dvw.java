package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dvw extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvw(evw evwVar, byte b) {
        super(2);
        this.a = b;
        this.b = evwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        evw evwVar = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String string = evwVar.O0().getString("email_address", "");
                    int i = evwVar.O0().getInt("number_digits");
                    String string2 = evwVar.O0().getString("attempted_code");
                    boolean z2 = evwVar.O0().getBoolean("return_from_resend");
                    boolean z3 = evwVar.O0().getBoolean("show_generic_error");
                    boolean z4 = evwVar.O0().getBoolean("show_too_many_attempts_error");
                    boolean z5 = evwVar.O0().getBoolean("is_login_flow", true);
                    String string3 = evwVar.O0().getString("signup_step_info");
                    boolean zI = x340Var2.i(evwVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        i5w i5wVar = new i5w(evwVar, (byte) 6);
                        x340Var2.s0(i5wVar);
                        obj3 = i5wVar;
                    }
                    iu30 iu30Var = (iu30) obj3;
                    boolean zI2 = x340Var2.i(evwVar);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        cvw cvwVar = new cvw(evwVar, (byte) 0);
                        x340Var2.s0(cvwVar);
                        obj4 = cvwVar;
                    }
                    Function0 function0 = (Function0) obj4;
                    boolean zI3 = x340Var2.i(evwVar);
                    Object objT3 = x340Var2.T();
                    Object obj5 = objT3;
                    if (zI3 || objT3 == m4cVar) {
                        cvw cvwVar2 = new cvw(evwVar, (byte) 1);
                        x340Var2.s0(cvwVar2);
                        obj5 = cvwVar2;
                    }
                    ago1.c(string, i, string2, z2, iu30Var, function0, z3, z4, z5, string3, (Function0) obj5, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-1353152339, new dvw(evwVar, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kiv kivVar = zge0.a;
                    Map map = evwVar.J1;
                    if (map == null) {
                        u890.C("viewModelFactoryMap");
                        throw null;
                    }
                    mod.b(kivVar.a(map), apo.r(-922404902, new dvw(evwVar, b2), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
