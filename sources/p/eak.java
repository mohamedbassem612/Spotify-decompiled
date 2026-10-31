package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eak extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d520 c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eak(d520 d520Var, List list, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d520Var;
        this.d = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        List list = this.d;
        d520 d520Var = this.c;
        switch (b) {
            case 0:
                return new eak(d520Var, list, lnmVar, (byte) 0);
            default:
                return new eak(d520Var, list, lnmVar, (byte) 1);
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
        d520 d520Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    dg8 dg8Var = (dg8) d520Var.c;
                    this.b = true;
                    if (dg8Var.h(list, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    dg8 dg8Var2 = (dg8) d520Var.c;
                    this.b = true;
                    w4h w4hVar = (w4h) dg8Var2.b;
                    u4h u4hVarQ = CollectionPlatformItemsRequest.q();
                    u4hVarQ.n(list);
                    u4hVarQ.t(w5h.f);
                    Object objI = fc11.i(w4hVar.b(u4hVarQ.build()).ignoreElement(), this);
                    if (objI != d9nVar) {
                        objI = rih1Var;
                    }
                    if (objI != d9nVar) {
                        objI = rih1Var;
                    }
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
