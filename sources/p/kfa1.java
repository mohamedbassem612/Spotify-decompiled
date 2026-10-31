package p;

import com.spotify.wrapped.v1.proto.SceneTemplate$TopSongJourneyContent$SongEntry;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kfa1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate$TopSongJourneyContent$SongEntry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfa1(SceneTemplate$TopSongJourneyContent$SongEntry sceneTemplate$TopSongJourneyContent$SongEntry, byte b) {
        super(2);
        this.a = b;
        this.b = sceneTemplate$TopSongJourneyContent$SongEntry;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        SceneTemplate$TopSongJourneyContent$SongEntry sceneTemplate$TopSongJourneyContent$SongEntry = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(1395912196);
                vnr0 vnr0VarA = shy0.a(sceneTemplate$TopSongJourneyContent$SongEntry.r(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            case 1:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(-1749222813);
                vnr0 vnr0VarA2 = shy0.a(sceneTemplate$TopSongJourneyContent$SongEntry.s(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
            case 2:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(-599390526);
                vnr0 vnr0VarA3 = shy0.a(sceneTemplate$TopSongJourneyContent$SongEntry.n(), x340Var3);
                x340Var3.r(false);
                return vnr0VarA3;
            default:
                ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj;
                x340Var4.i0(550441761);
                vnr0 vnr0VarA4 = shy0.a(sceneTemplate$TopSongJourneyContent$SongEntry.q(), x340Var4);
                x340Var4.r(false);
                return vnr0VarA4;
        }
    }
}
