package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class euc implements buc {
    public static final PlaylistRequestDecorationPolicy d;
    public final xrc0 a;
    public final kly0 b;
    public final be c;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        vwu0VarR.y();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setLength(true).setIsCurated(true).setIsExplicit(true).setIs19PlusOnly(true).setLocallyPlayable(true));
        vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setCovers(true));
        vwu0VarR.s(dgu0VarP);
        hru0VarS.z(vwu0VarR);
        d = (PlaylistRequestDecorationPolicy) hru0VarS.build();
    }

    public euc(xrc0 xrc0Var, kly0 kly0Var, be beVar) {
        this.a = xrc0Var;
        this.b = kly0Var;
        this.c = beVar;
    }

    public static trc0 b(ztc ztcVar) {
        xj61 xj61Var = new xj61();
        List list = ztcVar.c;
        if (!list.isEmpty()) {
            xj61Var.add(new qqc0((String) list.get(0)));
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        Integer num = ztcVar.f;
        mqz0 iqz0Var = num != null ? new iqz0(0, num.intValue()) : hqz0.a;
        g3d0 g3d0VarR = kln1.r(ztcVar.a);
        Integer num2 = ztcVar.h;
        return new trc0(d, g3d0VarR, xj61VarJ, false, null, iqz0Var, null, num2 != null ? num2.intValue() : 10000, null, 344);
    }

    public final Observable a(auc aucVar) {
        ((upp0) this.b.get()).getClass();
        String strA = upp0.a();
        iqz0 iqz0Var = new iqz0(0, 5);
        Integer numA = aucVar.a();
        return yoi1.i(new mgb(((rsc0) this.a).k(strA, new trc0(null, null, null, false, null, iqz0Var, null, numA != null ? numA.intValue() : 10000, null, 351)), aucVar, (byte) 8), o6x.a);
    }
}
