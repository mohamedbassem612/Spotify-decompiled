package p;

import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i161 implements xpw {
    public static final PlaylistRequestDecorationPolicy t;
    public final String a;
    public final String b;
    public final Function0 c;
    public final vdq d;
    public final xrc0 e;
    public final idd1 f = new idd1(new l451(this, (byte) 12));
    public final js20 g = x3p1.n(new h161(this, (byte) 0), new h161(this, (byte) 1), new u841(this, (byte) 15), (o8n) null, (iu30) null, 24);
    public final psw h;
    public final eih1 i;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.v();
        hru0VarS.u(iou0VarV.build());
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.B();
        hru0VarS.y(vwu0VarR.build());
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.A();
        hru0VarS.s(llu0VarR.build());
        t = hru0VarS.build();
    }

    public i161(String str, String str2, Function0 function0, vdq vdqVar, xrc0 xrc0Var, pvc pvcVar) {
        this.a = str;
        this.b = str2;
        this.c = function0;
        this.d = vdqVar;
        this.e = xrc0Var;
        j2i j2iVar = new j2i(-631653863, new hg31(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
        this.i = new eih1();
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
