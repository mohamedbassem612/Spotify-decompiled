package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kzr extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ k9r b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzr(String str, lnm lnmVar, k9r k9rVar) {
        super(2, lnmVar);
        this.b = k9rVar;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new kzr(this.c, lnmVar, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            rsc0 rsc0Var = (xrc0) this.b.b;
            iqz0 iqz0Var = new iqz0(0, 2);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
            llu0VarR.t(EpisodeDecorationPolicy.newBuilder().setLink(true).build());
            hru0VarS.t(llu0VarR);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 478);
            this.a = true;
            obj = rsc0Var.f("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", trc0Var, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        oy21 oy21Var = (py21) obj;
        i3o i3oVar = new i3o(this.c, (byte) 11);
        oy21Var.getClass();
        if (oy21Var instanceof ly21) {
            return Boolean.FALSE;
        }
        if (oy21Var instanceof oy21) {
            return i3oVar.invoke(oy21Var.a);
        }
        eg.o();
        return null;
    }
}
