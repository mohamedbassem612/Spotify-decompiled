package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import spotify.socialgraph.esperanto.proto.FollowRequestV4;
import spotify.socialgraph.esperanto.proto.FollowedUsersRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w430 {
    public final be a;

    public w430(be beVar) {
        this.a = beVar;
    }

    public final Completable a(String str, boolean z) {
        y630 y630VarN = FollowRequestV4.n();
        y630VarN.q(str);
        y630VarN.n(z);
        FollowRequestV4 followRequestV4 = (FollowRequestV4) y630VarN.build();
        followRequestV4.getClass();
        return this.a.callSingle("spotify.socialgraph_esperanto.proto.SocialGraphService", "FollowUser", followRequestV4).map(r3x0.P0).map(qs10.c).flatMapCompletable(new clv(str, (byte) 9));
    }

    public final Observable b() {
        e830 e830VarN = FollowedUsersRequest.n();
        e830VarN.n();
        FollowedUsersRequest followedUsersRequest = (FollowedUsersRequest) e830VarN.build();
        followedUsersRequest.getClass();
        return this.a.callStream("spotify.socialgraph_esperanto.proto.SocialGraphService", "SubscribeToFollowedUsers", followedUsersRequest).map(a4x0.O0).switchMap(yz10.c);
    }
}
