package p;

import android.os.Bundle;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.AvailableConcepts;
import com.spotify.playlist.policy.proto.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemCurationStatePolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.ItemMetadataPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class roc0 implements koc0 {
    public final b7n a;
    public final String b;
    public final xrc0 c;
    public final u9c0 d;
    public final iz00 e;
    public final ezu0 f;
    public final wen0 g;
    public final r3d0 h;
    public final haa0 i;
    public final Bundle j;
    public final boolean k;
    public final joc0 l;
    public final z2r m;
    public final rrc0 n;
    public final PlaylistTrackDecorationPolicy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlaylistEpisodeDecorationPolicy f38p;
    public final PlaylistRequestDecorationPolicy q;
    public final PlaylistRequestDecorationPolicy r;
    public boolean s;
    public xe01 t;
    public xe01 u;
    public xe01 v;
    public final mr20 w;
    public final wsc0 x;

    public roc0(b7n b7nVar, String str, xrc0 xrc0Var, u9c0 u9c0Var, iz00 iz00Var, ezu0 ezu0Var, wen0 wen0Var, r3d0 r3d0Var, haa0 haa0Var, Bundle bundle, boolean z, joc0 joc0Var, z2r z2rVar, rrc0 rrc0Var) {
        clc0 clc0Var;
        this.a = b7nVar;
        this.b = str;
        this.c = xrc0Var;
        this.d = u9c0Var;
        this.e = iz00Var;
        this.f = ezu0Var;
        this.g = wen0Var;
        this.h = r3d0Var;
        this.i = haa0Var;
        this.j = bundle;
        this.k = z;
        this.l = joc0Var;
        this.m = z2rVar;
        this.n = rrc0Var;
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.s();
        i8i1VarO.r();
        i8i1VarO.n();
        i8i1VarO.q();
        i8i1VarO.u();
        i8i1VarO.t();
        UserDecorationPolicy userDecorationPolicyBuild = i8i1VarO.build();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.w();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setPlayable(true).setPreviewId(true).setIs19PlusOnly(true).setIsPremiumOnly(true));
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true));
        vwu0VarR.s(dgu0VarP);
        vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
        this.o = vwu0VarR.build();
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.v(EpisodePlayedStateDecorationPolicy.newBuilder().setPlayable(true).setPlayabilityRestriction(true));
        llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setCovers(true).setLength(true).setPreviewId(true).setPublishDate(true).setDescription(true).setIs19PlusOnly(true).setMediaTypeEnum(true));
        llu0VarR.y(ShowDecorationPolicy.newBuilder().setName(true).setCovers(true).setPublisher(true));
        this.f38p = llu0VarR.build();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.A();
        iou0VarV.r();
        iou0VarV.C();
        iou0VarV.B();
        iou0VarV.E();
        iou0VarV.v();
        iou0VarV.s(userDecorationPolicyBuild);
        nl90 nl90VarO = ItemMetadataPolicy.o();
        nl90VarO.r(true);
        nl90VarO.q(true);
        iou0VarV.w(nl90VarO);
        iou0VarV.x();
        dj90 dj90VarP = ItemCurationStatePolicy.p();
        dj90VarP.n(true);
        iou0VarV.u(dj90VarP);
        ol90 ol90VarO = ItemOfflineStateDecorationPolicy.o();
        ol90VarO.q(true);
        ol90VarO.r(true);
        iou0VarV.z(ol90VarO);
        List<ll90> listL1 = o7h.l1(joc0Var.a);
        ArrayList arrayList = new ArrayList(q7h.U(listL1, 10));
        for (ll90 ll90Var : listL1) {
            fj90 fj90VarN = ItemExtensionPolicy.n();
            switch (l1d.C(ll90Var.a)) {
                case 0:
                    clc0Var = clc0.i;
                    break;
                case 1:
                    clc0Var = clc0.g;
                    break;
                case 2:
                    clc0Var = clc0.d;
                    break;
                case 3:
                    clc0Var = clc0.e;
                    break;
                case 4:
                    clc0Var = clc0.c;
                    break;
                case 5:
                    clc0Var = clc0.h;
                    break;
                case 6:
                    clc0Var = clc0.t;
                    break;
                default:
                    eg.o();
                    throw null;
            }
            fj90VarN.r(clc0Var);
            fj90VarN.q(((Number) o7h.q0(this.e.a(Collections.singleton(ll90Var.b)))).intValue());
            arrayList.add(fj90VarN.build());
        }
        iou0VarV.n(arrayList);
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        hru0VarS.v(iou0VarV);
        hru0VarS.y(this.o);
        hru0VarS.s(this.f38p);
        this.q = hru0VarS.build();
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.N();
        sku0VarP.R();
        sku0VarP.M();
        sku0VarP.O();
        sku0VarP.T();
        sku0VarP.Z();
        sku0VarP.E();
        sku0VarP.b0();
        sku0VarP.D();
        sku0VarP.A();
        sku0VarP.c0();
        sku0VarP.F();
        sku0VarP.C();
        sku0VarP.W();
        sku0VarP.h0();
        sku0VarP.l0();
        sku0VarP.f0();
        sku0VarP.H();
        sku0VarP.u();
        sku0VarP.j0();
        sku0VarP.i0();
        sku0VarP.B();
        sku0VarP.t();
        sku0VarP.k0();
        sku0VarP.J();
        sku0VarP.I();
        sku0VarP.z();
        sku0VarP.G();
        sku0VarP.e0();
        sku0VarP.g0();
        sku0VarP.V();
        sku0VarP.U();
        sku0VarP.r();
        sku0VarP.S();
        sku0VarP.v();
        sku0VarP.L();
        i8i1 i8i1VarO2 = UserDecorationPolicy.o();
        i8i1VarO2.s();
        i8i1VarO2.r();
        i8i1VarO2.n();
        i8i1VarO2.q();
        i8i1VarO2.u();
        i8i1VarO2.t();
        sku0VarP.Y(i8i1VarO2);
        if (this.m.a.f != null) {
            l89 l89VarO = AvailableConcepts.o();
            l89VarO.q();
            l89VarO.n(0.7f);
            sku0VarP.s(l89VarO.build());
        }
        i8i1 i8i1VarO3 = UserDecorationPolicy.o();
        i8i1VarO3.s();
        i8i1VarO3.u();
        sku0VarP.Q(i8i1VarO3);
        oxg oxgVarP = CollaboratingUsersDecorationPolicy.p();
        oxgVarP.q();
        oxgVarP.r(0);
        sku0VarP.x(oxgVarP);
        Set set = this.l.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(((umy) it.next()).a);
        }
        sku0VarP.n(this.e.a(o7h.p1(arrayList2)));
        hru0VarS2.x(sku0VarP);
        this.r = hru0VarS2.build();
        this.w = this.m.c ? this.h.c(this.b) : new huz((Object) null, (byte) 10);
        this.x = new wsc0(0, 0, 0, false, (List) null, new kby(this.b, -2), 0L, (Integer) null, false, (Map) null, 0L, (List) null, 0, 16351);
    }

    public static boolean b(jy21 jy21Var) {
        return (jy21Var instanceof gy21) || (jy21Var instanceof cy21) || (jy21Var instanceof hy21);
    }

    public final zob1 a() {
        xe01 xe01Var = this.u;
        if (xe01Var != null) {
            return xe01Var;
        }
        xe01 xe01VarF = f(hu20.e(new x010(this.i.o(this.b), this.w, new poc0(3, null, (byte) 0), (byte) 1), new moc0(null, this, (byte) 5)));
        this.u = xe01VarF;
        return xe01VarF;
    }

    public final any c() {
        xe01 xe01VarF = this.v;
        if (xe01VarF == null) {
            xe01VarF = f(hu20.e(new any(a(), (byte) 18), new moc0(null, this, (byte) 3)));
            this.v = xe01VarF;
        }
        return new any(xe01VarF, (byte) 18);
    }

    public final any d() {
        xe01 xe01VarF = this.t;
        if (xe01VarF == null) {
            xe01VarF = f(hu20.e(new any(a(), (byte) 18), new moc0(null, this, (byte) 4)));
            this.t = xe01VarF;
        }
        return new any(xe01VarF, (byte) 18);
    }

    public final Observable e() {
        return yoi1.i(d(), o6x.a);
    }

    public final xe01 f(jge jgeVar) {
        return d5p1.t(jgeVar, this.d, new alb1(100L, 3000L), (Object) null);
    }
}
