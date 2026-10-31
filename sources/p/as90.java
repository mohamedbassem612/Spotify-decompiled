package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class as90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs90 b;
    public final /* synthetic */ yr90 c;
    public final /* synthetic */ vr90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as90(cs90 cs90Var, yr90 yr90Var, vr90 vr90Var, byte b) {
        super(0);
        this.a = b;
        this.b = cs90Var;
        this.c = yr90Var;
        this.d = vr90Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr90 vr90Var = this.d;
        wr90 wr90Var = this.c;
        cs90 cs90Var = this.b;
        switch (b) {
            case 0:
                up90 up90Var = cs90Var.c;
                wmo1.m(vr90Var, up90Var.d(new sp90(up90Var, !wr90Var.d, (byte) 0)));
                break;
            default:
                up90 up90Var2 = cs90Var.c;
                wmo1.m(vr90Var, up90Var2.d(new sp90(up90Var2, wr90Var.e, (byte) 1)));
                break;
        }
        return rih1Var;
    }
}
