package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ev41 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fv41 b;

    public /* synthetic */ ev41(fv41 fv41Var, byte b) {
        this.a = b;
        this.b = fv41Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fv41 fv41Var = this.b;
        neg negVar = (neg) obj;
        switch (b) {
            case 0:
                neg.b(negVar, "type", chc1.b, 12);
                neg.b(negVar, "value", omo1.k("kotlinx.serialization.Sealed<" + fv41Var.a.r() + '>', k661.h, new h661[0], new ev41(fv41Var, (byte) 1)), 12);
                negVar.b = fv41Var.b;
                break;
            default:
                for (Map.Entry entry : fv41Var.e.entrySet()) {
                    neg.b(negVar, (String) entry.getKey(), ((nma0) entry.getValue()).getDescriptor(), 12);
                }
                break;
        }
        return rih1Var;
    }
}
