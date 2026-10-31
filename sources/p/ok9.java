package p;

import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ok9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok9(tm tmVar, byte b) {
        super(1);
        this.a = b;
        this.b = tmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                pqc1 pqc1Var = (pqc1) tmVar.c;
                BehaviorProcessor behaviorProcessor = pqc1Var.h;
                vbm[] vbmVarArr = q601.a;
                return new x010(new kge(behaviorProcessor), new kge(pqc1Var.i), new l2(3, (lnm) null, (byte) 13), (byte) 1);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new f3(tmVar, qtrVar, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
