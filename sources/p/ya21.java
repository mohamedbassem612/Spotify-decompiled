package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ya21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s880 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ za21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya21(s880 s880Var, String str, String str2, za21 za21Var, byte b) {
        super(0);
        this.a = b;
        this.b = s880Var;
        this.c = str;
        this.d = str2;
        this.e = za21Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                s880 s880Var = this.b;
                i8h1 i8h1Var = (i8h1) s880Var.c;
                zul0 zul0Var = (zul0) ((idd1) s880Var.a).getValue();
                zul0Var.getClass();
                x6h1 x6h1VarC = zul0Var.a.c();
                x6h1VarC.i.add(new a7h1("remove_suggestion_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q((dg30) s880Var.f), (o8n) null, 0, new elu0((Object) this.e, (Object) s880Var, (Object) this.c, (Object) this.d, (lnm) null, (byte) 20), 3);
                break;
            default:
                s880 s880Var2 = this.b;
                fn31.T(cto1.q((dg30) s880Var2.f), (o8n) null, 0, new elu0((Object) this.e, (Object) s880Var2, (Object) this.c, (Object) this.d, (lnm) null, (byte) 20), 3);
                break;
        }
        return rih1Var;
    }
}
