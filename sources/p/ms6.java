package p;

import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ms6 {
    public final r5h a;
    public final CollectionArtistDecorationPolicy b;

    public ms6(r5h r5hVar) {
        this.a = r5hVar;
        ArtistDecorationPolicy artistDecorationPolicyBuild = ArtistDecorationPolicy.newBuilder().setName(true).setLink(true).setPortraits(true).build();
        ArtistCollectionDecorationPolicy artistCollectionDecorationPolicyBuild = ArtistCollectionDecorationPolicy.newBuilder().setCollectionLink(true).setIsBanned(true).setIsFollowed(true).setNumTracksInCollection(true).build();
        ArtistSyncDecorationPolicy artistSyncDecorationPolicyBuild = ArtistSyncDecorationPolicy.newBuilder().setOfflineState(true).build();
        l0h l0hVarO = CollectionArtistDecorationPolicy.o();
        l0hVarO.n(artistDecorationPolicyBuild);
        l0hVarO.r(artistSyncDecorationPolicyBuild);
        l0hVarO.q(artistCollectionDecorationPolicyBuild);
        this.b = l0hVarO.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        ls6 ls6Var;
        if (onmVar instanceof ls6) {
            ls6Var = (ls6) onmVar;
            int i = ls6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ls6Var.c = i - Integer.MIN_VALUE;
            } else {
                ls6Var = new ls6(this, onmVar);
            }
        } else {
            ls6Var = new ls6(this, onmVar);
        }
        Object objJ = ls6Var.a;
        int i2 = ls6Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            e3h e3hVarP = CollectionDecorateRequest.p();
            e3hVarP.q(str);
            e3hVarP.r(this.b);
            CollectionDecorateRequest collectionDecorateRequestBuild = e3hVarP.build();
            collectionDecorateRequestBuild.getClass();
            Single singleFirstOrError = this.a.e(collectionDecorateRequestBuild).timeout(Observable.timer(10L, TimeUnit.SECONDS), stf0.Y).map(olj0.i).firstOrError();
            ls6Var.c = 1;
            objJ = fc11.j(singleFirstOrError, ls6Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }
}
