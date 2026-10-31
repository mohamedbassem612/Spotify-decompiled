package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e6f1 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ SceneTemplate.TopAlbumsContent.Carousel.RankedAlbum b;
    public final /* synthetic */ f6f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6f1(SceneTemplate.TopAlbumsContent.Carousel.RankedAlbum rankedAlbum, f6f1 f6f1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = rankedAlbum;
        this.c = f6f1Var;
    }

    public final lnm create(lnm lnmVar) {
        return new e6f1(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        Image imageO = this.b.o();
        gw70 gw70Var = this.c.a;
        this.a = true;
        Object objK = u3k.a.k(imageO, gw70Var, this);
        d9n d9nVar = d9n.a;
        return objK == d9nVar ? d9nVar : objK;
    }
}
