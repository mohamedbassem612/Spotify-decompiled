package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xbc0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ccc0 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ ubc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xbc0(ccc0 ccc0Var, List list, ubc0 ubc0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = ccc0Var;
        this.d = list;
        this.e = ubc0Var;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new xbc0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new xbc0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        ubc0 ubc0Var = this.e;
        List list = this.d;
        ccc0 ccc0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    r5h r5hVar = ccc0Var.d;
                    c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
                    c0hVarQ.n(ccc0.e(list, ubc0Var));
                    Single singleA = r5hVar.a(c0hVarQ.build());
                    this.b = true;
                    obj = fc11.j(singleA, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    r5h r5hVar2 = ccc0Var.d;
                    c0h c0hVarQ2 = CollectionAddRemoveItemsRequest.q();
                    c0hVarQ2.n(ccc0.e(list, ubc0Var));
                    Single singleC = r5hVar2.c(c0hVarQ2.build());
                    this.b = true;
                    obj = fc11.j(singleC, this);
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
                return obj;
        }
    }
}
