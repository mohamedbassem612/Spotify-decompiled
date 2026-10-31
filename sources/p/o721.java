package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import spotify.socialgraph.esperanto.proto.FollowedUsersRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o721 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mzr0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o721(mzr0 mzr0Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mzr0Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        mzr0 mzr0Var = this.c;
        switch (b) {
            case 0:
                return new o721(mzr0Var, str, lnmVar, (byte) 0);
            default:
                return new o721(mzr0Var, str, lnmVar, (byte) 1);
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
        String str = this.d;
        mzr0 mzr0Var = this.c;
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
                w430 w430Var = (w430) mzr0Var.f;
                w430Var.getClass();
                e830 e830VarN = FollowedUsersRequest.n();
                e830VarN.n();
                FollowedUsersRequest followedUsersRequest = (FollowedUsersRequest) e830VarN.build();
                be beVar = w430Var.a;
                followedUsersRequest.getClass();
                Single map = beVar.callSingle("spotify.socialgraph_esperanto.proto.SocialGraphService", "GetFollowedUsers", followedUsersRequest).map(u3x0.P0).flatMap(ws10.c).map(new ljp1(str, (byte) 10));
                this.b = true;
                Object objJ = fc11.j(map, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Completable completableA = ((w430) mzr0Var.f).a(str, false);
                    this.b = true;
                    if (fc11.i(completableA, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
