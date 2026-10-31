package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.proto.PlaylistMembersRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistQuery;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rsc0 implements xrc0 {
    public final yqg a;
    public final thy0 b;
    public final q8n c;
    public final jn7 d;
    public final yn4 e;
    public final jn7 f;
    public final jn7 g;
    public final dss0 h;
    public final Optional i;
    public final pdb0 j = new pdb0(this, (byte) 22);

    public rsc0(yqg yqgVar, thy0 thy0Var, q8n q8nVar, jn7 jn7Var, yn4 yn4Var, jn7 jn7Var2, jn7 jn7Var3, dss0 dss0Var, Optional optional) {
        this.a = yqgVar;
        this.b = thy0Var;
        this.c = q8nVar;
        this.d = jn7Var;
        this.e = yn4Var;
        this.f = jn7Var2;
        this.g = jn7Var3;
        this.h = dss0Var;
        this.i = optional;
    }

    public static void c(smc0 smc0Var, hz00 hz00Var, boolean z) {
        if (z) {
            t0z t0zVar = zrc0.a;
            ArrayList<clc0> arrayList = new ArrayList();
            t0zVar.getClass();
            d7 d7Var = new d7(t0zVar, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (((clc0) next) != clc0.UNRECOGNIZED) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (clc0 clc0Var : arrayList) {
                fj90 fj90VarN = ItemExtensionPolicy.n();
                fj90VarN.r(clc0Var);
                fj90VarN.n(hz00Var);
                arrayList2.add((ItemExtensionPolicy) fj90VarN.build());
            }
            smc0Var.addAll(arrayList2);
        }
    }

    public static int e(PlaylistQuery playlistQuery) {
        return playlistQuery.v().hashCode() ^ ((playlistQuery.x().hashCode() ^ playlistQuery.w().hashCode()) ^ playlistQuery.t().hashCode());
    }

    public final PlaylistGetRequest d(String str, boolean z, trc0 trc0Var) {
        pmu0 pmu0VarN = PlaylistGetRequest.n();
        pmu0VarN.t(str);
        hru0 hru0Var = (hru0) trc0Var.a.toBuilder();
        boolean z2 = true;
        boolean z3 = hru0Var.r().q().getIsCurated() || hru0Var.n().p().getIsCurated() || hru0Var.q().p().getIsCurated();
        boolean z4 = hru0Var.r().getInCollection() || hru0Var.r().getIsBanned() || hru0Var.n().n().getIsInListenLater() || hru0Var.q().o();
        boolean z5 = hru0Var.r().q().getLink() || hru0Var.n().p().getLink() || hru0Var.q().u();
        boolean z6 = hru0Var.r().q().getName() || hru0Var.n().p().getName() || hru0Var.q().s().getName();
        boolean z7 = hru0Var.n().q().getSyncProgress() || hru0Var.q().t().getSyncProgress();
        boolean z8 = hru0Var.r().getOffline() || hru0Var.n().q().getOffline() || hru0Var.q().t().getOfflineState();
        boolean z9 = hru0Var.r().q().getLocallyPlayable() || hru0Var.q().t().getLocallyPlayable();
        boolean z10 = hru0Var.r().q().getIsExplicit() || hru0Var.n().p().getIsExplicit() || hru0Var.q().s().getIsExplicit();
        if (z5 || z6 || z7 || z8 || z10 || z3 || z4) {
            iou0 iou0Var = (iou0) hru0Var.q().toBuilder();
            iou0Var.D(z5);
            iou0Var.t(z4);
            if (z6 || z10) {
                nl90 nl90Var = (nl90) hru0Var.q().s().toBuilder();
                nl90Var.r(z6);
                nl90Var.q(z10);
                iou0Var.w(nl90Var);
            }
            if (z3) {
                dj90 dj90Var = (dj90) hru0Var.q().p().toBuilder();
                dj90Var.n(z3);
                iou0Var.u(dj90Var);
            }
            if (z8 || z7 || z9) {
                ol90 ol90Var = (ol90) hru0Var.q().t().toBuilder();
                ol90Var.q(z8);
                ol90Var.r(z7);
                ol90Var.n(z9);
                iou0Var.z(ol90Var);
            }
            hru0Var.v(iou0Var);
        }
        if (this.e.b()) {
            boolean z11 = hru0Var.r().n().n().getCovers() || hru0Var.n().p().getCovers();
            boolean isBookChapter = hru0Var.n().p().getIsBookChapter();
            boolean publishDate = hru0Var.n().p().getPublishDate();
            boolean z12 = z6 || hru0Var.r().o().getName() || hru0Var.n().p().getDescription();
            if (!z10 && !hru0Var.r().q().getIs19PlusOnly() && !hru0Var.n().p().getIs19PlusOnly() && !hru0Var.r().q().getLength() && !hru0Var.n().p().getLength() && !hru0Var.n().p().getMediaTypeEnum()) {
                z2 = false;
            }
            iou0 iou0Var2 = (iou0) hru0Var.q().toBuilder();
            smc0 smc0VarN = k4p1.n();
            smc0VarN.addAll(iou0Var2.q());
            c(smc0VarN, hz00.IDENTITY_TRAIT, z12);
            c(smc0VarN, hz00.ENTITY_TYPE_TRAIT, isBookChapter);
            c(smc0VarN, hz00.VISUAL_IDENTITY_TRAIT, z11);
            c(smc0VarN, hz00.PUBLISHING_METADATA_TRAIT, publishDate);
            c(smc0VarN, hz00.CONSUMPTION_EXPERIENCE_TRAIT, z2);
            iou0Var2.n(k4p1.k(smc0VarN));
            nl90 nl90Var2 = (nl90) hru0Var.q().s().toBuilder();
            if (z12) {
                nl90Var2.r(false);
            }
            if (z2) {
                nl90Var2.q(false);
            }
            iou0Var2.w(nl90Var2);
            hru0Var.v(iou0Var2);
            vwu0 vwu0Var = (vwu0) hru0Var.r().toBuilder();
            ArtistDecorationPolicy.Builder builder = (ArtistDecorationPolicy.Builder) hru0Var.r().o().toBuilder();
            if (z12) {
                builder.setName(false);
            }
            vwu0Var.t(builder);
            dgu0 dgu0Var = (dgu0) hru0Var.r().n().toBuilder();
            AlbumDecorationPolicy.Builder builder2 = (AlbumDecorationPolicy.Builder) hru0Var.r().n().n().toBuilder();
            if (z11) {
                builder2.setCovers(false);
            }
            dgu0Var.n(builder2);
            vwu0Var.s(dgu0Var);
            TrackDecorationPolicy.Builder builder3 = (TrackDecorationPolicy.Builder) hru0Var.r().q().toBuilder();
            if (z2) {
                builder3.setLength(false);
                builder3.setIsExplicit(false);
                builder3.setIs19PlusOnly(false);
            }
            vwu0Var.C(builder3);
            hru0Var.z(vwu0Var);
            llu0 llu0Var = (llu0) hru0Var.n().toBuilder();
            EpisodeDecorationPolicy.Builder builder4 = (EpisodeDecorationPolicy.Builder) hru0Var.n().p().toBuilder();
            if (z12) {
                builder4.setDescription(false);
            }
            if (isBookChapter) {
                builder4.setIsBookChapter(false);
            }
            if (z11) {
                builder4.setCovers(false);
            }
            if (publishDate) {
                builder4.setPublishDate(false);
            }
            if (z2) {
                builder4.setLength(false);
                builder4.setIsExplicit(false);
                builder4.setIs19PlusOnly(false);
                builder4.setMediaTypeEnum(false);
            }
            llu0Var.s(builder4);
            hru0Var.t(llu0Var);
        }
        pmu0VarN.n((PlaylistRequestDecorationPolicy) hru0Var.build());
        pmu0VarN.s(mlu0.b(z, trc0Var));
        return (PlaylistGetRequest) pmu0VarN.build();
    }

    public final Object f(String str, trc0 trc0Var, lnm lnmVar) {
        return c921.H(this.c, new zfe(this, str, trc0Var, null, (byte) 8), lnmVar);
    }

    public final Object g(Map map, Integer num, onm onmVar) {
        return c921.H(this.c, new n0a0(this, num, map, (lnm) null, (byte) 10), onmVar);
    }

    public final Object h(String str, String str2, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, onm onmVar) {
        return c921.H(this.c, new z290(this, str, str2, playlistRequestDecorationPolicy, (lnm) null, (byte) 7), onmVar);
    }

    public final Object i(qvc0 qvc0Var, onm onmVar) {
        return c921.H(this.c, new k53(qvc0Var, this, (lnm) null, (byte) 16), onmVar);
    }

    public final Object j(rxc0 rxc0Var, onm onmVar) {
        return c921.H(this.c, new ss90(this, rxc0Var, (lnm) null, (byte) 24), onmVar);
    }

    public final mr20 k(String str, trc0 trc0Var) {
        PlaylistGetRequest playlistGetRequestD = d(str, this.e.a(), trc0Var);
        playlistGetRequestD.getClass();
        return o4p1.r(new x010(this.f.E0(playlistGetRequestD), str, this, (byte) 3), this.c);
    }

    public final mr20 l(String str, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.w(collaboratingUsersDecorationPolicy);
        sku0VarP.X(collaboratingUsersDecorationPolicy.o().o());
        sku0VarP.R();
        hru0VarS.w((PlaylistDecorationPolicy) sku0VarP.build());
        PlaylistGetRequest playlistGetRequestD = d(str, this.e.a(), new trc0((PlaylistRequestDecorationPolicy) hru0VarS.build(), null, null, false, qrc0.a, jqz0.a, null, 0, null, 462));
        playlistGetRequestD.getClass();
        return o4p1.r(new ipr((byte) 27, this, str, this.f.E0(playlistGetRequestD)), this.c);
    }

    public final mr20 m(String str, String str2, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        return o4p1.r(new mnc0(k(str, new trc0(playlistRequestDecorationPolicy, null, Collections.singleton(new hrc0(str2)), false, qrc0.a, hqz0.a, null, 0, null, 458)), (byte) 3), this.c);
    }

    public final mr20 n(qvc0 qvc0Var) {
        trc0 trc0VarA = xsc0.a();
        mqz0 mqz0VarC = qvc0Var.c();
        PlaylistGetRequest playlistGetRequestD = d(qvc0Var.a(), this.e.a(), trc0.a(trc0VarA, null, qvc0Var.d(), qvc0Var.b(), mqz0VarC, 473));
        playlistGetRequestD.getClass();
        return o4p1.r(new ipr(this.f.E0(playlistGetRequestD), qvc0Var, this, (byte) 28), this.c);
    }

    public final mr20 o(String str) {
        cpu0 cpu0VarN = PlaylistMembersRequest.n();
        cpu0VarN.n(str);
        return o4p1.r(new ipr((byte) 29, this, str, this.d.F0(cpu0VarN.build())), this.c);
    }

    public final mr20 p(rxc0 rxc0Var) {
        PlaylistGetRequest playlistGetRequestD = d(rxc0Var.a(), this.e.a(), xsc0.b());
        playlistGetRequestD.getClass();
        return o4p1.r(new qsc0(this.f.E0(playlistGetRequestD), rxc0Var, this, (byte) 0), this.c);
    }
}
