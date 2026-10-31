package p;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wof1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cpf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wof1(cpf1 cpf1Var, byte b) {
        super(1);
        this.a = b;
        this.b = cpf1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        cpf1 cpf1Var = this.b;
        switch (b) {
            case 0:
                ay8 ay8VarH = d3p1.H(cpf1Var.b, cpf1Var.i, (oof1) obj);
                FlowableMap flowableMap = cpf1Var.a;
                vbm[] vbmVarArr = q601.a;
                byte b2 = 4;
                return h5p1.s(ay8VarH, new kge(flowableMap), new kge(flowableMap.j(mo9.h)), new cj81(b2, lnmVar, b2));
            case 1:
                ((qtr) obj).b(new lcm(cpf1Var, (lnm) null, (byte) 16));
                return rih1.a;
            case 2:
                oof1 oof1Var = (oof1) obj;
                if (cpf1Var.g.a && oof1Var.b == null) {
                    return oof1Var.a;
                }
                return null;
            default:
                return cpf1Var.h;
        }
    }
}
