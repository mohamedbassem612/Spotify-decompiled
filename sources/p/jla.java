package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jla extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate.BespokeListeningAgeContent.Card2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jla(SceneTemplate.BespokeListeningAgeContent.Card2 card2, byte b) {
        super(2);
        this.a = b;
        this.b = card2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        SceneTemplate.BespokeListeningAgeContent.Card2 card2 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-758430192);
                vnr0 vnr0VarA = shy0.a(card2.t(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            default:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(-840340914);
                vnr0 vnr0VarA2 = shy0.a(card2.s(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
        }
    }
}
