package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xj6 extends a8d1 implements vu30 {
    public String a;
    public boolean b;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.TopSong c;
    public final /* synthetic */ bju d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ gw70 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj6(SceneTemplate.ArtistCardsContent.TopSong topSong, bju bjuVar, int i, int i2, gw70 gw70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = topSong;
        this.d = bjuVar;
        this.e = i;
        this.f = i2;
        this.g = gw70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new xj6(this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            SceneTemplate.ArtistCardsContent.TopSong topSong = this.c;
            String strQ = topSong.q();
            String strI = cy30.i(this.e, "bonus_song_art_", this.f, "_");
            iu30 i24Var = new i24(topSong, this.g, (lnm) null, (byte) 4);
            this.a = strQ;
            this.b = true;
            obj = this.d.e(strI, i24Var, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            str = strQ;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            hm5.M(obj);
        }
        return new yi6(str, (yj41) obj);
    }
}
