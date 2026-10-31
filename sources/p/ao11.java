package p;

import com.spotify.wrapped.v1.proto.SceneTemplate$RelationshipStatusContent$Card2;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ao11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate$RelationshipStatusContent$Card2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao11(SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card2, byte b) {
        super(2);
        this.a = b;
        this.b = sceneTemplate$RelationshipStatusContent$Card2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card2 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-2010441955);
                vnr0 vnr0VarA = shy0.a(sceneTemplate$RelationshipStatusContent$Card2.r(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            case 1:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(883633852);
                vnr0 vnr0VarA2 = shy0.a(sceneTemplate$RelationshipStatusContent$Card2.t(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
            default:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(-517257637);
                vnr0 vnr0VarA3 = shy0.a(sceneTemplate$RelationshipStatusContent$Card2.s(), x340Var3);
                x340Var3.r(false);
                return vnr0VarA3;
        }
    }
}
