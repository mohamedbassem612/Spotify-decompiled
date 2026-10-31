package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vfm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ avp0 b;
    public final /* synthetic */ l4m0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfm1(avp0 avp0Var, l4m0 l4m0Var, String str, byte b) {
        super(0);
        this.a = b;
        this.b = avp0Var;
        this.c = l4m0Var;
        this.d = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        l4m0 l4m0Var = this.c;
        avp0 avp0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) avp0Var.d;
                l4m0Var.getClass();
                x6h1 x6h1VarC = l4m0Var.b.c();
                x6h1VarC.i.add(new a7h1("video_preview", this.d, (Integer) null, (String) null, "loaded"));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC.a(), l4m0Var.a, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) avp0Var.d;
                l4m0Var.getClass();
                x6h1 x6h1VarC2 = l4m0Var.b.c();
                x6h1VarC2.i.add(new a7h1("video_preview", this.d, (Integer) null, (String) null, "error"));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), l4m0Var.a, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
