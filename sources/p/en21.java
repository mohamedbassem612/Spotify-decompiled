package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class en21 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mzr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en21(mzr0 mzr0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mzr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        mzr0 mzr0Var = this.c;
        switch (b) {
            case 0:
                return new en21(mzr0Var, lnmVar, (byte) 0);
            default:
                return new en21(mzr0Var, lnmVar, (byte) 1);
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
        mzr0 mzr0Var = this.c;
        d9n d9nVar = d9n.a;
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
                mr20 mr20Var = ((zr00) mzr0Var.d).a;
                this.b = true;
                Object objI = b5p1.i(mr20Var, this);
                return objI == d9nVar ? d9nVar : objI;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ezc ezcVar = ((ov20) mzr0Var.g).a;
                    this.b = true;
                    obj = b5p1.i(ezcVar, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(y7y0.A((Map) obj));
        }
    }
}
