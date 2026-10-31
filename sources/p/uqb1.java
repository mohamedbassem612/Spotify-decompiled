package p;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uqb1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqb1 b;
    public final /* synthetic */ cyp c;

    public /* synthetic */ uqb1(vqb1 vqb1Var, cyp cypVar, byte b) {
        this.a = b;
        this.b = vqb1Var;
        this.c = cypVar;
    }

    public final arb1 a() {
        byte b = this.a;
        vqb1 vqb1Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return vqb1Var.b;
    }

    public final muz b() {
        byte b = this.a;
        cyp cypVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return cypVar.d();
    }

    public final tuz c() {
        byte b = this.a;
        cyp cypVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return cypVar.e();
    }

    public final FlowableFilter d() {
        byte b = this.a;
        vqb1 vqb1Var = this.b;
        switch (b) {
            case 0:
                return vqb1Var.a().x(mgx0.P0);
            case 1:
                return vqb1Var.a().x(bjx0.Q0);
            default:
                return vqb1Var.a().x(djx0.Q0);
        }
    }
}
