package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ne6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.ArtistListItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne6(SceneTemplate.ArtistCardsContent.ArtistListItem artistListItem, byte b) {
        super(2);
        this.a = b;
        this.b = artistListItem;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        SceneTemplate.ArtistCardsContent.ArtistListItem artistListItem = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(34771115);
                vnr0 vnr0VarA = shy0.a(artistListItem.o(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            default:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(1850258604);
                vnr0 vnr0VarA2 = shy0.a(artistListItem.n(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
        }
    }
}
