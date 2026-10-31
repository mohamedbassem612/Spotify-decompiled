package p;

import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedTwinContent$IntroCard;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cyg1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate$WrappedTwinContent$IntroCard b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyg1(SceneTemplate$WrappedTwinContent$IntroCard sceneTemplate$WrappedTwinContent$IntroCard, byte b) {
        super(2);
        this.a = b;
        this.b = sceneTemplate$WrappedTwinContent$IntroCard;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        SceneTemplate$WrappedTwinContent$IntroCard sceneTemplate$WrappedTwinContent$IntroCard = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(1817502432);
                vnr0 vnr0VarA = shy0.a(sceneTemplate$WrappedTwinContent$IntroCard.q(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            default:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(-1096304577);
                vnr0 vnr0VarA2 = shy0.a(sceneTemplate$WrappedTwinContent$IntroCard.p(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
        }
    }
}
