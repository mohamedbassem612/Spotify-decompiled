package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xn50 implements fjo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ejo b;

    public /* synthetic */ xn50(ejo ejoVar, byte b) {
        this.a = b;
        this.b = ejoVar;
    }

    public final djo a(String str, lik1 lik1Var) {
        byte b = this.a;
        ejo ejoVar = this.b;
        switch (b) {
            case 0:
                w0p w0pVar = (w0p) ((yn50) ejoVar).b;
                switch (w0pVar.a) {
                    case 0:
                        x0p x0pVar = (x0p) w0pVar.b.c;
                        tuz tuzVarE = ((cyp) x0pVar.C.get()).e();
                        tuz tuzVarE2 = ((cyp) x0pVar.C.get()).e();
                        Context contextA = x0pVar.b.a();
                        c8o.l(contextA);
                        return new ao50(str, tuzVarE, new ro30(tuzVarE2, contextA, (byte) 12));
                    case 1:
                        yxo yxoVar = (yxo) w0pVar.b.c;
                        tuz tuzVarE3 = ((cyp) yxoVar.i.get()).e();
                        tuz tuzVarE4 = ((cyp) yxoVar.i.get()).e();
                        Context contextA2 = ((ae7) yxoVar.d).a();
                        c8o.l(contextA2);
                        return new ao50(str, tuzVarE3, new ro30(tuzVarE4, contextA2, (byte) 12));
                    default:
                        voa voaVar = (voa) w0pVar.b.c;
                        tuz tuzVarE5 = ((cyp) ((jly0) voaVar.h).get()).e();
                        tuz tuzVarE6 = ((cyp) ((jly0) voaVar.h).get()).e();
                        Context contextA3 = ((oe7) voaVar.b).a();
                        c8o.l(contextA3);
                        return new ao50(str, tuzVarE5, new ro30(tuzVarE6, contextA3, (byte) 12));
                }
            default:
                return (lcc0) ((yn50) ejoVar).b;
        }
    }
}
