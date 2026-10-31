package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l9o0 implements rhh0 {
    public final /* synthetic */ byte a = 0;
    public final Context b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public l9o0(Context context, o3e0 o3e0Var, mre0 mre0Var, jih1 jih1Var) {
        this.b = context;
        this.c = mre0Var;
        this.d = jih1Var;
        Boolean bool = Boolean.TRUE;
        Map mapJ = sqg0.J(oqn1.n("name", bool), oqn1.n("link", bool), oqn1.n("covers", bool), oqn1.n("length", bool), oqn1.n("isExplicit", bool), oqn1.n("isBookChapter", bool), oqn1.n("type", bool), oqn1.n("mediaTypeEnum", bool), oqn1.n("publishDate", bool), oqn1.n("available", bool), oqn1.n("timeLeft", bool), oqn1.n("isPlayed", bool), oqn1.n("available", bool), oqn1.n("syncProgress", bool), oqn1.n("type", bool), oqn1.n("offline", bool), oqn1.n("playable", bool), oqn1.n("isPlayable", bool), oqn1.n("lastPlayedAt", bool), oqn1.n("is19PlusOnly", bool));
        this.e = mapJ;
        nia1 nia1Var = v3h.a;
        d1z d1zVar = d1z.a;
        this.f = new iih1(new s3h(new n3h(new p3h(mapJ, new u3h(sqg0.H(oqn1.n("name", bool))), k4p1.x(22)))), new gih1(), new hih1(), 139);
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                iih1 iih1Var = (iih1) this.f;
                lih1 lih1Var = ((jih1) obj).a;
                return lih1Var.a.callSingle("spotify.collection_esperanto.proto.CollectionService", "GetUnplayedEpisodes", lih1.b(iih1Var)).map(cxo1.Q0).map(new ezb1(lih1Var, (byte) 14)).map(new drj0(this, r9cVar, (byte) 12));
            default:
                return ((yt91) this.c).h(r9cVar).map(new xgc((ypa) obj, (byte) 25)).compose((v191) this.e).map(new n381(this, r9cVar, (byte) 29));
        }
    }

    public l9o0(Context context, yt91 yt91Var, ypa ypaVar, v191 v191Var, myy myyVar) {
        this.b = context;
        this.c = yt91Var;
        this.d = ypaVar;
        this.e = v191Var;
        this.f = myyVar;
    }
}
