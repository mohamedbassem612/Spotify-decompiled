package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xxa1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxa1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxa1(yxa1 yxa1Var, byte b) {
        super(0);
        this.a = b;
        this.b = yxa1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        yxa1 yxa1Var = this.b;
        switch (b) {
            case 0:
                yt91 yt91Var = yxa1Var.n;
                bqk0 bqk0Var = (bqk0) yt91Var.c;
                if (bqk0Var != null) {
                    i8h1 i8h1Var = (i8h1) yt91Var.b;
                    x6h1 x6h1VarC = bqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            default:
                yxa1Var.j.o("split_webview_expanded", yxa1Var.a.a);
                yt91 yt91Var2 = yxa1Var.n;
                bqk0 bqk0Var2 = (bqk0) yt91Var2.c;
                if (bqk0Var2 != null) {
                    i8h1 i8h1Var2 = (i8h1) yt91Var2.b;
                    x6h1 x6h1VarC2 = bqk0Var2.b.c();
                    x6h1VarC2.i.add(new a7h1("webview", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
        }
        return rih1Var;
    }
}
