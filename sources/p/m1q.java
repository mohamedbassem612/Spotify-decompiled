package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m1q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ m1q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yxb0 a(uxb0 uxb0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                i2q i2qVar = (i2q) r7qVar;
                teq teqVar = i2qVar.b;
                daq daqVar = teqVar.d;
                t8h t8hVar = new t8h((Flowable) daqVar.D5.get(), (q8n) daqVar.r2.get());
                n1q n1qVar = (n1q) i2qVar.c.A2.get();
                r5q r5qVar = (r5q) teqVar.Pf.get();
                daq daqVar2 = i2qVar.a;
                return new yxb0(t8hVar, n1qVar, uxb0Var, r5qVar, (gw70) daqVar2.d8.get(), (i8h1) daqVar2.A5.get());
            case 1:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                daq daqVar3 = v5qVar.b;
                t8h t8hVar2 = new t8h((Flowable) daqVar3.D5.get(), (q8n) daqVar3.r2.get());
                n1q n1qVar2 = (n1q) v5qVar.P8.get();
                r5q r5qVar2 = (r5q) v5qVar.Q8.get();
                daq daqVar4 = thqVar.b;
                return new yxb0(t8hVar2, n1qVar2, uxb0Var, r5qVar2, (gw70) daqVar4.d8.get(), (i8h1) daqVar4.A5.get());
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar2 = r7qVar2.d;
                daq daqVar5 = teqVar2.d;
                t8h t8hVar3 = new t8h((Flowable) daqVar5.D5.get(), (q8n) daqVar5.r2.get());
                n1q n1qVar3 = (n1q) teqVar2.Of.get();
                r5q r5qVar3 = (r5q) teqVar2.Pf.get();
                daq daqVar6 = r7qVar2.b;
                return new yxb0(t8hVar3, n1qVar3, uxb0Var, r5qVar3, (gw70) daqVar6.d8.get(), (i8h1) daqVar6.A5.get());
        }
    }
}
