package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fcf1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ g7m1 c;
    public final /* synthetic */ SceneTemplate.TopPlaylistsContent.Single d;
    public final /* synthetic */ t7f1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcf1(SceneTemplate.TopPlaylistsContent.Single single, g7m1 g7m1Var, t7f1 t7f1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = single;
        this.c = g7m1Var;
        this.e = t7f1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        t7f1 t7f1Var = this.e;
        SceneTemplate.TopPlaylistsContent.Single single = this.d;
        g7m1 g7m1Var = this.c;
        switch (b) {
            case 0:
                return new fcf1(single, g7m1Var, t7f1Var, lnmVar);
            default:
                return new fcf1(g7m1Var, single, t7f1Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        t7f1 t7f1Var = this.e;
        SceneTemplate.TopPlaylistsContent.Single single = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                RiveAnimation riveAnimationP = single.p();
                ti31 ti31Var = t7f1Var.e;
                kj31 kj31Var = t7f1Var.f;
                cxc cxcVar = t7f1Var.g;
                this.b = true;
                Object objD = u3k.d(riveAnimationP, this.c, ti31Var, kj31Var, cxcVar, null, null, this, 224);
                return objD == d9nVar ? d9nVar : objD;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar = this.c.b;
                ob01 ob01Var = new ob01(single, t7f1Var, (lnm) null, (byte) 20);
                this.b = true;
                Object objE = bjuVar.e("single_playlist", ob01Var, this);
                return objE == d9nVar ? d9nVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcf1(g7m1 g7m1Var, SceneTemplate.TopPlaylistsContent.Single single, t7f1 t7f1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = g7m1Var;
        this.d = single;
        this.e = t7f1Var;
    }
}
