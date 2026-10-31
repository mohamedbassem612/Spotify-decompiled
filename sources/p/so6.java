package p;

import com.spotify.artist.artistfactsui.ArtistFactsView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class so6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ArtistFactsView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so6(ArtistFactsView artistFactsView) {
        super(2);
        this.b = artistFactsView;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArtistFactsView artistFactsView = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    eko1.b(artistFactsView.getCurrentFacts(), (qim0) null, false, artistFactsView.getTitleOutsideCard(), artistFactsView.getOnLearnMoreClick(), x340Var2, 0, 6);
                }
                break;
            default:
                ((Number) obj2).intValue();
                artistFactsView.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so6(ArtistFactsView artistFactsView, int i) {
        super(2);
        this.b = artistFactsView;
    }
}
