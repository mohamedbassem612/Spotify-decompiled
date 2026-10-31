package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d481 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ r961 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d481(r961 r961Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.b = r961Var;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new d481(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            rsc0 rsc0Var = (xrc0) this.b.b;
            Set setSingleton = Collections.singleton(yqc0.a);
            iqz0 iqz0Var = new iqz0(0, 100);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 sku0VarP = PlaylistDecorationPolicy.p();
            sku0VarP.R();
            hru0VarS.x(sku0VarP);
            llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
            llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).setLength(true).setPreviewId(true).setIsExplicit(true).setDescription(true).setPublishDate(true).setIs19PlusOnly(true));
            hru0VarS.t(llu0VarR);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, setSingleton, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 474);
            this.a = true;
            obj = rsc0Var.f(this.c, trc0Var, this);
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
        return ((py21) obj).d();
    }
}
