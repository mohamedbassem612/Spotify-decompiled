package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wud1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xud1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wud1(xud1 xud1Var, byte b) {
        super(0);
        this.a = b;
        this.b = xud1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xud1 xud1Var = this.b;
        switch (b) {
            case 0:
                gw10 gw10Var = xud1Var.e;
                gw10Var.e.l((Object) null);
                gw10Var.i.l((Object) null);
                bpb1 bpb1Var = gw10Var.g;
                bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
                break;
            default:
                gw10 gw10Var2 = xud1Var.e;
                bpb1 bpb1Var2 = gw10Var2.e;
                bpb1 bpb1Var3 = gw10Var2.d;
                ew10 ew10Var = (ew10) bpb1Var2.getValue();
                if (ew10Var != null) {
                    bpb1Var2.l((Object) null);
                    Boolean bool = Boolean.FALSE;
                    bpb1Var3.m((Object) null, bool);
                    gw10Var2.a.m((Object) null, ew10Var.b);
                    bpb1Var3.m((Object) null, bool);
                    bpb1 bpb1Var4 = gw10Var2.g;
                    bpb1Var4.m((Object) null, Integer.valueOf(((Number) bpb1Var4.getValue()).intValue() + 1));
                }
                break;
        }
        return rih1Var;
    }
}
