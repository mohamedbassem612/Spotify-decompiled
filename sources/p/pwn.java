package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pwn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y1c1 b;
    public final /* synthetic */ iac0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwn(y1c1 y1c1Var, iac0 iac0Var, byte b) {
        super(0);
        this.a = b;
        this.b = y1c1Var;
        this.c = iac0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        iac0 iac0Var = this.c;
        w2c1 w2c1Var = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0VarV = w2c1Var.V(whx0.class);
                fai0 fai0VarF = wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b);
                Object objE = fai0VarF.e();
                objE.getClass();
                bpb1 bpb1VarB = gio1.b(objE);
                fai0VarF.f(iac0Var, new qpj0(bpb1VarB, (byte) 9));
                return bpb1VarB;
            default:
                mmr0 mmr0VarV2 = w2c1Var.V(whx0.class);
                fai0 fai0VarF2 = wgo1.F((ymd0) mmr0VarV2.a, mmr0VarV2.b);
                Object objE2 = fai0VarF2.e();
                objE2.getClass();
                bpb1 bpb1VarB2 = gio1.b(objE2);
                fai0VarF2.f(iac0Var, new qpj0(bpb1VarB2, (byte) 9));
                return bpb1VarB2;
        }
    }
}
