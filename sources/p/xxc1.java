package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xxc1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ua91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxc1(ua91 ua91Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ua91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ua91 ua91Var = this.c;
        switch (b) {
            case 0:
                return new xxc1(ua91Var, lnmVar, (byte) 0);
            default:
                return new xxc1(ua91Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ua91 ua91Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowableH = yoi1.h(((xb0) ua91Var.c).d, b3s.c);
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableH);
                this.b = true;
                Object objI = b5p1.i(kgeVar, this);
                return objI == d9nVar ? d9nVar : objI;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xxc1 xxc1Var = new xxc1(ua91Var, lnmVar, (byte) 0);
                this.b = true;
                Object objO = rc2.O(500L, xxc1Var, this);
                return objO == d9nVar ? d9nVar : objO;
        }
    }
}
