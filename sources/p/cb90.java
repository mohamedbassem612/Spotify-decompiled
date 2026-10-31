package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cb90 extends hab0 implements vu30 {
    public final /* synthetic */ SceneTemplate.IntroTrackContent.Card1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb90(SceneTemplate.IntroTrackContent.Card1 card1) {
        super(2);
        this.a = card1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj;
        x340Var.i0(-1724149793);
        vnr0 vnr0VarA = shy0.a(this.a.q().q(), x340Var);
        x340Var.r(false);
        return vnr0VarA;
    }
}
