package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class udd extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public vr20 b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bfd e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udd(bfd bfdVar, ArrayList arrayList, List list, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = bfdVar;
        this.f = arrayList;
        this.g = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                udd uddVar = new udd(this.e, this.f, this.g, lnmVar, (byte) 0);
                uddVar.d = obj;
                return uddVar;
            default:
                udd uddVar2 = new udd(this.e, this.f, this.g, lnmVar, (byte) 1);
                uddVar2.d = obj;
                return uddVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.g;
        ArrayList arrayList = this.f;
        bfd bfdVar = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.d;
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    p2o0 p2o0Var = bfdVar.g;
                    this.d = null;
                    this.b = vr20Var;
                    this.c = (byte) 1;
                    obj = p2o0Var.u(arrayList, list, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr20Var = this.b;
                hm5.M(obj);
                this.d = null;
                this.b = null;
                this.c = (byte) 2;
                if (vr20Var.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                vr20 vr20Var2 = (vr20) this.d;
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    p2o0 p2o0Var2 = bfdVar.g;
                    this.d = null;
                    this.b = vr20Var2;
                    this.c = (byte) 1;
                    obj = p2o0Var2.u(arrayList, list, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vr20Var2 = this.b;
                hm5.M(obj);
                this.d = null;
                this.b = null;
                this.c = (byte) 2;
                if (vr20Var2.emit(obj, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
