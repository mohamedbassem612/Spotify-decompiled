package p;

import com.spotify.wrapped.v1.proto.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oec extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ rec b;
    public final /* synthetic */ Action c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oec(rec recVar, Action action, lnm lnmVar) {
        super(2, lnmVar);
        this.b = recVar;
        this.c = action;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new oec(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            pp31 pp31Var = this.b.g;
            String playlistUri = this.c.q().getPlaylistUri();
            this.a = true;
            Object objC = pp31Var.c(playlistUri, this);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
