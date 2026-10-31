package p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ec6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ic6 c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec6(ic6 ic6Var, List list, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ic6Var;
        this.d = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        List list = this.d;
        ic6 ic6Var = this.c;
        switch (b) {
            case 0:
                return new ec6(ic6Var, list, lnmVar, (byte) 0);
            default:
                return new ec6(ic6Var, list, lnmVar, (byte) 1);
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
        List list = this.d;
        ic6 ic6Var = this.c;
        Serializable serializable = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableL = ic6Var.l(list, this);
                    return serializableL == serializable ? serializable : serializableL;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableK = ic6Var.k(list, this);
                    return serializableK == serializable ? serializable : serializableK;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
