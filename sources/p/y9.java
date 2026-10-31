package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bt41 c;
    public /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(bt41 bt41Var, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = bt41Var;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                y9 y9Var = new y9(this.c, lnmVar);
                y9Var.d = ((Offset) obj).a;
                return y9Var;
            case 1:
                return new y9(this.c, this.d, lnmVar, (byte) 1);
            default:
                return new y9(this.c, this.d, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Offset offset = (Offset) obj;
                long j = offset.a;
                return ((y9) create(offset, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((y9) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((y9) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bt41 bt41Var = this.c;
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
                long j = this.d;
                this.b = true;
                Object objB = ws41.b(bt41Var.r1, j, this);
                return objB == d9nVar ? d9nVar : objB;
            case 1:
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
                du41 du41Var = bt41Var.r1;
                long j2 = this.d;
                this.b = true;
                return du41Var.c(j2, true, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                du41 du41Var2 = bt41Var.r1;
                long j3 = this.d;
                this.b = true;
                return du41Var2.c(j3, false, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(bt41 bt41Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = bt41Var;
    }
}
