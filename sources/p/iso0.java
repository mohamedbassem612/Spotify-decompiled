package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iso0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8h1 b;
    public final /* synthetic */ ogl0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iso0(i8h1 i8h1Var, ogl0 ogl0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = i8h1Var;
        this.c = ogl0Var;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        b7x b7xVar = b7x.a;
        ogl0 ogl0Var = this.c;
        i8h1 i8h1Var = this.b;
        switch (b) {
            case 0:
                ogl0Var.getClass();
                x6h1 x6h1VarC = ogl0Var.a.c();
                x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
            case 1:
                ogl0Var.getClass();
                x6h1 x6h1VarC2 = ogl0Var.a.c();
                x6h1VarC2.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
            default:
                ogl0Var.getClass();
                x6h1 x6h1VarC3 = ogl0Var.a.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
