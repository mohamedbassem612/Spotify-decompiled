package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bee1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dfm c;
    public final /* synthetic */ wde1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bee1(dfm dfmVar, wde1 wde1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = dfmVar;
        this.d = wde1Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        wde1 wde1Var = this.d;
        dfm dfmVar = this.c;
        switch (b) {
            case 0:
                return new bee1(dfmVar, wde1Var, lnmVar, (byte) 0);
            default:
                return new bee1(dfmVar, wde1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wde1 wde1Var = this.d;
        dfm dfmVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mcu0 mcu0Var = (mcu0) dfmVar.f;
                String str = wde1Var.a;
                long j = wde1Var.b;
                this.b = true;
                FlowableMap flowableMap = mcu0Var.d;
                d18 d18Var = new d18(mcu0Var, j, str);
                int i = Flowable.a;
                Flowable flowableA = flowableMap.A(d18Var, i, i);
                flowableA.getClass();
                Object objI = fc11.i(new FlowableIgnoreElementsCompletable(flowableA), this);
                if (objI != d9nVar) {
                    objI = rih1Var;
                }
                return objI == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mcu0 mcu0Var2 = (mcu0) dfmVar.f;
                String str2 = wde1Var.a;
                long j2 = wde1Var.b;
                this.b = true;
                return mcu0Var2.b(str2, j2, null, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
