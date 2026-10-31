package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o87 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q87 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o87(q87 q87Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = q87Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        q87 q87Var = this.b;
        switch (b) {
            case 0:
                km3 km3Var = q87Var.a;
                i8h1 i8h1Var = (i8h1) km3Var.b;
                ksk0 ksk0Var = (ksk0) km3Var.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(ra7.a);
                break;
            default:
                km3 km3Var2 = q87Var.a;
                i8h1 i8h1Var2 = (i8h1) km3Var2.b;
                ksk0 ksk0Var2 = (ksk0) km3Var2.c;
                x6h1 x6h1VarC3 = ksk0Var2.c.c();
                x6h1VarC3.i.add(new a7h1("search_box", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                String str = nik1.G0.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                iu30Var.invoke(new va7(i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, ksk0Var2.b, System.currentTimeMillis()), (xj61) null).a));
                break;
        }
        return rih1Var;
    }
}
