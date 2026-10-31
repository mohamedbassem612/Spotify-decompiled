package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bgs extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dgs c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bgs(dgs dgsVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = dgsVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        dgs dgsVar = this.c;
        switch (b) {
            case 0:
                return new bgs(dgsVar, str, lnmVar, (byte) 0);
            case 1:
                return new bgs(dgsVar, str, lnmVar, (byte) 1);
            default:
                return new bgs(dgsVar, str, lnmVar, (byte) 2);
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
        String str = this.d;
        dgs dgsVar = this.c;
        Serializable serializable = d9n.a;
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
                frh1 frh1Var = dgsVar.m;
                bn40 bn40Var = new bn40(str);
                this.b = true;
                Object objA = frh1Var.a(bn40Var, this);
                return objA == serializable ? serializable : objA;
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
                eqs eqsVar = dgsVar.h;
                this.b = true;
                Serializable serializableA = eqsVar.a(str, this);
                return serializableA == serializable ? serializable : serializableA;
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
                h0s h0sVar = dgsVar.i;
                this.b = true;
                Object objA2 = h0sVar.a(str, this);
                return objA2 == serializable ? serializable : objA2;
        }
    }
}
