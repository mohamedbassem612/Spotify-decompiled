package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformAddContextItemsRequest;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItem;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformRemoveContextItemsRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q860 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ r860 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q860(r860 r860Var, int i, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = r860Var;
        this.d = i;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new q860(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new q860(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        r860 r860Var = this.c;
        int i = this.d;
        String str = this.e;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        w4h w4hVar = r860Var.a;
                        q4h q4hVarO = CollectionPlatformAddContextItemsRequest.o();
                        q4hVarO.q();
                        r4h r4hVarO = CollectionPlatformContextItem.o();
                        r4hVarO.q(str);
                        r4hVarO.n(kx40.b(i));
                        q4hVarO.n((CollectionPlatformContextItem) r4hVarO.build());
                        Single map = w4hVar.callSingle("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "AddContextItems", (CollectionPlatformAddContextItemsRequest) q4hVarO.build()).map(bbn.P0);
                        this.b = true;
                        obj = fc11.j(map, this);
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
                    obj.getClass();
                    return rih1Var;
                } catch (Exception e) {
                    n57.g("Failed to hide " + str + " from " + kx40.d(i), e);
                    return rih1Var;
                }
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        w4h w4hVar2 = r860Var.a;
                        v4h v4hVarO = CollectionPlatformRemoveContextItemsRequest.o();
                        v4hVarO.q();
                        r4h r4hVarO2 = CollectionPlatformContextItem.o();
                        r4hVarO2.q(str);
                        r4hVarO2.n(kx40.b(i));
                        v4hVarO.n((CollectionPlatformContextItem) r4hVarO2.build());
                        Single map2 = w4hVar2.callSingle("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "RemoveContextItems", (CollectionPlatformRemoveContextItemsRequest) v4hVarO.build()).map(v560.P0);
                        this.b = true;
                        obj = fc11.j(map2, this);
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
                    obj.getClass();
                    return rih1Var;
                } catch (Exception e2) {
                    n57.g("Failed to unhide " + str + " from " + kx40.d(i), e2);
                    return rih1Var;
                }
        }
    }
}
