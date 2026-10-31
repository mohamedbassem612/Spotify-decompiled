package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z9f1 extends hab0 implements vu30 {
    public final /* synthetic */ SceneTemplate.TopFive.Item a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9f1(SceneTemplate.TopFive.Item item) {
        super(2);
        this.a = item;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj;
        x340Var.i0(144677111);
        vnr0 vnr0VarA = shy0.a(this.a.r(), x340Var);
        x340Var.r(false);
        return vnr0VarA;
    }
}
