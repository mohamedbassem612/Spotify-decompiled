package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zmg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmg(y7e1 y7e1Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = y7e1Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ven0 ven0Var = this.c;
        y7e1 y7e1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(!u890.j(y7e1Var.d().d.toString(), (String) ven0Var.getValue()));
            default:
                return Boolean.valueOf((ihc1.y0(y7e1Var.d().d) || ((Boolean) ven0Var.getValue()).booleanValue()) ? false : true);
        }
    }
}
