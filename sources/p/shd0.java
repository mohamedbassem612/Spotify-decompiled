package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class shd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate.ListeningAgeContent.Card1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shd0(SceneTemplate.ListeningAgeContent.Card1 card1, byte b) {
        super(2);
        this.a = b;
        this.b = card1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        SceneTemplate.ListeningAgeContent.Card1 card1 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-751203562);
                vnr0 vnr0VarA = shy0.a(card1.q(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            default:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(-1338595305);
                vnr0 vnr0VarA2 = shy0.a(card1.p(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
        }
    }
}
