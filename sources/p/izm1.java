package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class izm1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qzm1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izm1(qzm1 qzm1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = qzm1Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        qzm1 qzm1Var = this.c;
        switch (b) {
            case 0:
                return new izm1(qzm1Var, lnmVar, (byte) 0);
            default:
                return new izm1(qzm1Var, lnmVar, (byte) 1);
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
        qzm1 qzm1Var = this.c;
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
                fv9 fv9Var = qzm1Var.d;
                Context context = qzm1Var.a;
                boolean z2 = qzm1Var.l.b;
                this.b = true;
                Object objD = fv9Var.d(context, z2, this);
                return objD == d9nVar ? d9nVar : objD;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr51 vr51Var = qzm1Var.e;
                this.b = true;
                Object objK = vr51Var.k(this);
                return objK == d9nVar ? d9nVar : objK;
        }
    }
}
