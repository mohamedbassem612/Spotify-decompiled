package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dc2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eyh0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc2(eyh0 eyh0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = eyh0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        eyh0 eyh0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((idd1) eyh0Var.d).getValue();
                d7l0 d7l0Var = (d7l0) eyh0Var.c;
                x6h1 x6h1VarC = d7l0Var.b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                iu30Var.invoke(new w100(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), d7l0Var.a, System.currentTimeMillis()), (xj61) null)));
                break;
            case 1:
                i8h1 i8h1Var2 = (i8h1) ((idd1) eyh0Var.d).getValue();
                d7l0 d7l0Var2 = (d7l0) eyh0Var.c;
                x6h1 x6h1VarC2 = d7l0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), d7l0Var2.a, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(b100.a);
                break;
            case 2:
                String str = nik1.Z6.a;
                i8h1 i8h1Var3 = (i8h1) ((idd1) eyh0Var.d).getValue();
                x6h1 x6h1VarC3 = ((h4l0) eyh0Var.b).b.c();
                x6h1VarC3.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                iu30Var.invoke(new o100(str, i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                break;
            default:
                i8h1 i8h1Var4 = (i8h1) ((idd1) eyh0Var.d).getValue();
                x6h1 x6h1VarC4 = ((h4l0) eyh0Var.b).b.c();
                x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(r000.a);
                break;
        }
        return rih1Var;
    }
}
