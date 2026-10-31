package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dcf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate.TopPlaylistsContent.Single b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dcf1(SceneTemplate.TopPlaylistsContent.Single single, byte b) {
        super(2);
        this.a = b;
        this.b = single;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        SceneTemplate.TopPlaylistsContent.Single single = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(650942235);
                vnr0 vnr0VarA = shy0.a(single.t(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            case 1:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(1483008028);
                vnr0 vnr0VarA2 = shy0.a(single.s(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
            case 2:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(-1979893475);
                vnr0 vnr0VarA3 = shy0.a(single.n(), x340Var3);
                x340Var3.r(false);
                return vnr0VarA3;
            default:
                ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj;
                x340Var4.i0(-1147827682);
                vnr0 vnr0VarA4 = shy0.a(single.o(), x340Var4);
                x340Var4.r(false);
                return vnr0VarA4;
        }
    }
}
