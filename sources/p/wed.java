package p;

import com.spotify.campfire.datasource.impl.proto.RenameGroup;
import com.spotify.campfire.datasource.impl.proto.RenameGroupRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wed extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bfd c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wed(bfd bfdVar, String str, String str2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = bfdVar;
        this.d = str;
        this.e = str2;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new wed(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new wed(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        String str = this.e;
        String str2 = this.d;
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
                    if (nadVar.z(str2, str, this) == d9nVar) {
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
                    Object objI = nadVar2.a.i(RenameGroupRequest.newBuilder().setRenameGroup(RenameGroup.newBuilder().setHierarchyId(str2).setName(str)).build(), this);
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
