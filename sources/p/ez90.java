package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ez90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs90 b;
    public final /* synthetic */ cz90 c;
    public final /* synthetic */ zy90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez90(cs90 cs90Var, cz90 cz90Var, zy90 zy90Var, byte b) {
        super(0);
        this.a = b;
        this.b = cs90Var;
        this.c = cz90Var;
        this.d = zy90Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zy90 zy90Var = this.d;
        cz90 cz90Var = this.c;
        cs90 cs90Var = this.b;
        switch (b) {
            case 0:
                up90 up90Var = cs90Var.c;
                wmo1.m(zy90Var, up90Var.d(new sp90(up90Var, !((az90) cz90Var).c, (byte) 0)));
                break;
            default:
                up90 up90Var2 = cs90Var.c;
                wmo1.m(zy90Var, up90Var2.d(new sp90(up90Var2, !((az90) cz90Var).d, (byte) 1)));
                break;
        }
        return rih1Var;
    }
}
