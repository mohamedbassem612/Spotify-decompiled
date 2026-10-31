package p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jzr extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ k9r b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzr(String str, lnm lnmVar, k9r k9rVar) {
        super(2, lnmVar);
        this.b = k9rVar;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new jzr(this.c, lnmVar, this.b);
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
            vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
            vwu0VarR.D(TrackDecorationPolicy.newBuilder().setLink(true).build());
            hru0VarS.z(vwu0VarR);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 478);
            this.a = true;
            obj = rsc0Var.f("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", trc0Var, this);
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
        i3o i3oVar = new i3o(this.c, (byte) 10);
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
