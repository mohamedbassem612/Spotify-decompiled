package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xkj1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SceneTemplate.VideoEntity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xkj1(SceneTemplate.VideoEntity videoEntity, byte b) {
        super(2);
        this.a = b;
        this.b = videoEntity;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        SceneTemplate.VideoEntity videoEntity = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-523059677);
                vnr0 vnr0VarA = shy0.a(videoEntity.r(), x340Var);
                x340Var.r(false);
                return vnr0VarA;
            case 1:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(1966404324);
                vnr0 vnr0VarA2 = shy0.a(videoEntity.q(), x340Var2);
                x340Var2.r(false);
                return vnr0VarA2;
            case 2:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(-842114910);
                vnr0 vnr0VarA3 = shy0.a(videoEntity.r(), x340Var3);
                x340Var3.r(false);
                return vnr0VarA3;
            default:
                ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj;
                x340Var4.i0(-1410087133);
                vnr0 vnr0VarA4 = shy0.a(videoEntity.q(), x340Var4);
                x340Var4.r(false);
                return vnr0VarA4;
        }
    }
}
