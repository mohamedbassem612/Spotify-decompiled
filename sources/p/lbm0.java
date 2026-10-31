package p;

import com.spotify.address.endpoint.model.v1.proto.GetFormRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lbm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ i12 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbm0(i12 i12Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = i12Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new lbm0(this.c, lnmVar, (byte) 0);
            case 1:
                return new lbm0(this.c, lnmVar, (byte) 1);
            default:
                return new lbm0(this.c, lnmVar, (byte) 2);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        i12 i12Var = this.c;
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
                GetFormRequest getFormRequestN = GetFormRequest.n();
                this.b = true;
                Object objA = i12Var.a(getFormRequestN, this);
                return objA == d9nVar ? d9nVar : objA;
            case 1:
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
                GetFormRequest getFormRequestN2 = GetFormRequest.n();
                this.b = true;
                Object objA2 = i12Var.a(getFormRequestN2, this);
                return objA2 == d9nVar ? d9nVar : objA2;
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
                GetFormRequest getFormRequestN3 = GetFormRequest.n();
                this.b = true;
                Object objA3 = i12Var.a(getFormRequestN3, this);
                return objA3 == d9nVar ? d9nVar : objA3;
        }
    }
}
