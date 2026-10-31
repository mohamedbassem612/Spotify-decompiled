package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q750 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dh30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q750(dh30 dh30Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = dh30Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        dh30 dh30Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((xep) dh30Var.b).get();
                x6h1 x6h1VarC = ((txk0) dh30Var.c).b.c();
                x6h1VarC.i.add(new a7h1("start_graduation_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = nik1.i4.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                iu30Var.invoke(new q100(i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) ((xep) dh30Var.b).get();
                x6h1 x6h1VarC2 = ((txk0) dh30Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(p000.d);
                break;
        }
        return rih1Var;
    }
}
