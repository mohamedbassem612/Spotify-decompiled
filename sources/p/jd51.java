package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jd51 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kd51 b;

    public /* synthetic */ jd51(kd51 kd51Var, byte b) {
        this.a = b;
        this.b = kd51Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        kd51 kd51Var = this.b;
        switch (b) {
            case 0:
                kdn0 kdn0Var = kd51Var.t;
                bhk1 bhk1Var = (bhk1) kdn0Var.e();
                if (bhk1Var != null && bhk1Var.e) {
                    bhk1 bhk1Var2 = (bhk1) kdn0Var.e();
                    kdn0Var.m(bhk1Var2 != null ? bhk1.a(bhk1Var2, null, null, null, 215) : null);
                    break;
                }
                break;
            case 1:
                kd51Var.t.j((bhk1) obj);
                break;
            default:
                kd51Var.t.j((bhk1) obj);
                break;
        }
    }
}
