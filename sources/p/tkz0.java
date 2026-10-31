package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tkz0 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ SceneTemplate.Quiz.Item b;
    public final /* synthetic */ gw70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz0(SceneTemplate.Quiz.Item item, gw70 gw70Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = item;
        this.c = gw70Var;
    }

    public final lnm create(lnm lnmVar) {
        return new tkz0(this.b, this.c, lnmVar);
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
        String url = this.b.s().getUrl();
        this.a = true;
        Object objG = u3k.a.g(url, this.c, false, this);
        d9n d9nVar = d9n.a;
        return objG == d9nVar ? d9nVar : objG;
    }
}
