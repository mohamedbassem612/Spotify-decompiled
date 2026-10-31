package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class by71 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r9y0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ by71(r9y0 r9y0Var, String str, byte b) {
        super(0);
        this.a = b;
        this.b = r9y0Var;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        r9y0 r9y0Var = this.b;
        switch (b) {
            case 0:
                r9y0Var.invoke(new jx71(str));
                break;
            default:
                r9y0Var.invoke(new lx71(str));
                break;
        }
        return rih1Var;
    }
}
