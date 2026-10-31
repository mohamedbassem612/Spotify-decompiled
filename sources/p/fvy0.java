package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fvy0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivy0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvy0(ivy0 ivy0Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = ivy0Var;
        this.c = i;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        ivy0 ivy0Var = this.b;
        switch (b) {
            case 0:
                hma1 hma1VarEdit = ivy0Var.e.a.edit();
                hma1VarEdit.b(q8o.a, i);
                hma1VarEdit.g();
                break;
            default:
                hma1 hma1VarEdit2 = ivy0Var.e.a.edit();
                hma1VarEdit2.b(q8o.a, i + 1);
                hma1VarEdit2.g();
                break;
        }
        return rih1Var;
    }
}
