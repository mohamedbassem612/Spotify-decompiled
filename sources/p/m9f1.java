package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m9f1 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ SceneTemplate.TopFivePodcastsContent.Card1.PodcastItem b;
    public final /* synthetic */ o9f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9f1(SceneTemplate.TopFivePodcastsContent.Card1.PodcastItem podcastItem, o9f1 o9f1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = podcastItem;
        this.c = o9f1Var;
    }

    public final lnm create(lnm lnmVar) {
        return new m9f1(this.b, this.c, lnmVar);
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
        Image imageN = this.b.n();
        gw70 gw70Var = this.c.a;
        this.a = true;
        Object objK = u3k.a.k(imageN, gw70Var, this);
        d9n d9nVar = d9n.a;
        return objK == d9nVar ? d9nVar : objK;
    }
}
