package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gt91 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt91 b;
    public final /* synthetic */ xq91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt91(kt91 kt91Var, xq91 xq91Var, byte b) {
        super(0);
        this.a = b;
        this.b = kt91Var;
        this.c = xq91Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xq91 xq91Var = this.c;
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                kt91Var.f.add(xq91Var);
                break;
            default:
                kt91Var.f.remove(xq91Var);
                break;
        }
        return rih1Var;
    }
}
