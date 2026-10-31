package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gyq extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxq b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyq(xxq xxqVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = xxqVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        xxq xxqVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1VarA = xxqVar.a();
                x6h1 x6h1VarC = xxqVar.b.b.c();
                x6h1VarC.i.add(new a7h1("request_data_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("request_data_confirmation_dialog_okay_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(oxq.a);
                break;
            case 1:
                i8h1 i8h1VarA2 = xxqVar.a();
                x6h1 x6h1VarC3 = xxqVar.b.b.c();
                x6h1VarC3.i.add(new a7h1("data_sections", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("refresh_code_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1VarA2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(oxq.b);
                break;
            case 2:
                xxqVar.c();
                iu30Var.invoke(oxq.h);
                break;
            case 3:
                xxqVar.d();
                iu30Var.invoke(oxq.g);
                break;
            case 4:
                xxqVar.c();
                iu30Var.invoke(oxq.j);
                break;
            case 5:
                xxqVar.d();
                iu30Var.invoke(oxq.i);
                break;
            default:
                i8h1 i8h1VarA3 = xxqVar.a();
                x6h1 x6h1VarC5 = xxqVar.b.b.c();
                x6h1VarC5.i.add(new a7h1("request_data_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1VarA3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(oxq.d);
                break;
        }
        return rih1Var;
    }
}
