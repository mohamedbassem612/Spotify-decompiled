package p;

import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qp extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp(sp spVar, byte b) {
        super(2);
        this.a = b;
        this.b = spVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sp spVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    boolean zI = x340Var2.i(spVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new g3(spVar, (byte) 5);
                        x340Var2.s0(objT);
                    }
                    dro.l((Function0) objT, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (((Boolean) ((hrr0) spVar.h).getValue()).booleanValue()) {
                    x340Var4.i0(242400845);
                    nyx.a(2, (wux) null, apo.r(-1262821212, new qp(spVar, b2), x340Var4), x340Var4, 3078, 6);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(242557488);
                    x340Var4.r(false);
                }
                return rih1Var;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                ho hoVar = (ho) obj2;
                Consumer consumer = (Consumer) spVar.f;
                fp fpVar = (fp) spVar.d;
                txk0 txk0Var = fpVar.b;
                uba ubaVar = fpVar.a;
                if (consumer == null) {
                    u890.C("consumer");
                    throw null;
                }
                consumer.accept(new to(hoVar));
                boolean z = hoVar instanceof fo;
                b7x b7xVar = b7x.a;
                if (z) {
                    String str = ((fo) hoVar).a;
                    Integer numValueOf = Integer.valueOf(iIntValue3);
                    x6h1 x6h1VarC = txk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("managed_account_row", (String) null, numValueOf, str, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str2 = nik1.z0.a;
                    ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return rih1Var;
                }
                if (!(hoVar instanceof go)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = txk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("plan_manager_account_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                String str3 = nik1.z0.a;
                ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
        }
    }
}
