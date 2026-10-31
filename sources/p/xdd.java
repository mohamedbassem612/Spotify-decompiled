package p;

import com.spotify.campfire.datasource.impl.proto.DeleteChatForMeRequest;
import com.spotify.campfire.datasource.impl.proto.UnmuteHierarchyRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xdd extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bfd c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xdd(bfd bfdVar, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = bfdVar;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        bfd bfdVar = this.c;
        switch (b) {
            case 0:
                return new xdd(bfdVar, str, lnmVar, (byte) 0);
            default:
                return new xdd(bfdVar, str, lnmVar, (byte) 1);
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
        String str = this.d;
        bfd bfdVar = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    nad nadVar = bfdVar.b;
                    this.b = true;
                    Object objU = nadVar.a.u(DeleteChatForMeRequest.newBuilder().setHierarchyId(str).build(), this);
                    if (objU != d9nVar) {
                        objU = rih1Var;
                    }
                    if (objU == d9nVar) {
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
                    nad nadVar2 = bfdVar.b;
                    this.b = true;
                    Object objH = nadVar2.a.h(UnmuteHierarchyRequest.newBuilder().setHierarchyId(str).build(), this);
                    if (objH != d9nVar) {
                        objH = rih1Var;
                    }
                    if (objH == d9nVar) {
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
