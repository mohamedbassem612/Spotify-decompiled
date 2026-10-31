package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vym0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fvf1 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vym0(fvf1 fvf1Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = fvf1Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fvf1 fvf1Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                wx wxVar = (wx) ven0Var.getValue();
                long j = fvf1Var.a;
                int i = vpd1.b;
                ven0Var.setValue(vpd1.a(wxVar, 1, j > 0 ? (int) ((j + 14999) / 15000) : 0));
                break;
            default:
                wx wxVar2 = (wx) ven0Var.getValue();
                long j2 = fvf1Var.b - fvf1Var.a;
                int i2 = vpd1.b;
                ven0Var.setValue(vpd1.a(wxVar2, 2, j2 > 0 ? (int) ((j2 + 14999) / 15000) : 0));
                break;
        }
        return rih1Var;
    }
}
