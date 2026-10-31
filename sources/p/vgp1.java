package p;

import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedResponse;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedAlbum;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedArtist;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedCollectionTracks;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedContext;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedEpisode;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedPlaylist;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedProfile;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedShow;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedTrack;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vgp1 implements s2i1, Function, Init, Predicate, t2n, np80, hiy {
    public static vgp1 b;
    public final /* synthetic */ byte a;
    public static final vgp1 c = new vgp1(1);
    public static final vgp1 d = new vgp1(3);
    public static final vgp1 e = new vgp1(4);
    public static final vgp1 f = new vgp1(5);
    public static final vgp1 g = new vgp1(6);
    public static final vgp1 h = new vgp1(7);
    public static final vgp1 i = new vgp1(8);
    public static final vgp1 t = new vgp1(9);
    public static final vgp1 X = new vgp1(10);
    public static final vgp1 Y = new vgp1(11);
    public static final vgp1 Z = new vgp1(12);
    public static final vgp1 N0 = new vgp1(13);
    public static final vgp1 O0 = new vgp1(14);
    public static final vgp1 P0 = new vgp1(15);
    public static final vgp1 Q0 = new vgp1(16);
    public static final vgp1 R0 = new vgp1(17);
    public static final vgp1 S0 = new vgp1(18);
    public static final vgp1 T0 = new vgp1(19);
    public static final vgp1 U0 = new vgp1(20);
    public static final vgp1 V0 = new vgp1(21);
    public static final vgp1 W0 = new vgp1(22);
    public static final vgp1 X0 = new vgp1(23);
    public static final vgp1 Y0 = new vgp1(24);
    public static final vgp1 Z0 = new vgp1(25);
    public static final vgp1 a1 = new vgp1(26);
    public static final vgp1 b1 = new vgp1(27);
    public static final vgp1 c1 = new vgp1(28);
    public static final vgp1 d1 = new vgp1(29);

    public /* synthetic */ vgp1(byte b2) {
        this.a = b2;
    }

    public static Next a(bb1 bb1Var, String str) {
        mlr0 mlr0Var = new mlr0(3);
        z6x z6xVar = z6x.a;
        return Next.i(bb1.a(bb1Var, str, z6xVar, z6xVar, false, false, false, (String) null, mlr0Var, (u380) null, (String) null, 6407), Collections.singleton(i81.c));
    }

    public static Next b(bb1 bb1Var, String str) {
        mlr0 mlr0Var = new mlr0(3);
        z6x z6xVar = z6x.a;
        bb1 bb1VarA = bb1.a(bb1Var, str, z6xVar, z6xVar, true, false, false, (String) null, mlr0Var, (u380) null, (String) null, 6407);
        boolean z = bb1Var.c;
        flr0 flr0Var = bb1Var.Y;
        String str2 = bb1Var.a;
        return Next.i(bb1VarA, f46.S0(new u4p1[]{z ? new l81(str2, str, flr0Var) : new k81(str2, str, flr0Var), i81.c}));
    }

    public static Next c(bb1 bb1Var, fwz0 fwz0Var) {
        g4a g4aVarD = ilo1.D(bb1Var.b);
        if (fwz0Var.a() == g4aVarD) {
            g4aVarD = g4a.b;
        }
        g4a g4aVar = g4aVarD;
        return Next.i(bb1.a(bb1Var, (String) null, (List) null, (List) null, false, false, false, (String) null, (mlr0) null, mqo1.H(dm61.x0(fwz0Var.getUri(), bb1Var.Z)), (String) null, 12287), Collections.singleton(new u81(bb1Var.a, fwz0Var.getUri(), g4aVar, fwz0Var.a(), true)));
    }

    public static synchronized void d() {
        if (b == null) {
            b = new vgp1((byte) 0);
        }
    }

    public Object apply(Object obj) {
        mig1 mig1VarQ0;
        RecentlyPlayedEntity recentlyPlayedEntityA;
        switch (this.a) {
            case 3:
                return cm2.a;
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 17:
            case 25:
            case 26:
            default:
                GetRecentlyPlayedResponse getRecentlyPlayedResponse = (GetRecentlyPlayedResponse) obj;
                List list = xuz.a;
                int iN = getRecentlyPlayedResponse.n();
                boolean zP = getRecentlyPlayedResponse.p();
                h290<RecentlyPlayedContext> h290VarO = getRecentlyPlayedResponse.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (RecentlyPlayedContext recentlyPlayedContext : h290VarO) {
                    recentlyPlayedContext.getClass();
                    if (recentlyPlayedContext.hasAlbum()) {
                        RecentlyPlayedAlbum recentlyPlayedAlbumN = recentlyPlayedContext.n();
                        recentlyPlayedEntityA = xuz.a(recentlyPlayedAlbumN.n().getLink(), recentlyPlayedAlbumN.n().getName(), recentlyPlayedAlbumN.n().getCovers().getStandardLink(), recentlyPlayedAlbumN.q(), recentlyPlayedAlbumN.o().getOffline(), (String) null, (String) null, o7h.y0(recentlyPlayedAlbumN.n().getArtistsList(), ",", (String) null, (String) null, f9z.d1, 30), (String) null, false, (String) null, false, 67108546);
                    } else if (recentlyPlayedContext.hasArtist()) {
                        RecentlyPlayedArtist recentlyPlayedArtistO = recentlyPlayedContext.o();
                        recentlyPlayedEntityA = xuz.a(recentlyPlayedArtistO.n().getLink(), recentlyPlayedArtistO.n().getName(), recentlyPlayedArtistO.n().getPortraits().getStandardLink(), recentlyPlayedArtistO.p(), (String) null, (String) null, (String) null, recentlyPlayedArtistO.n().getName(), (String) null, false, (String) null, false, 67108578);
                    } else if (recentlyPlayedContext.v()) {
                        RecentlyPlayedCollectionTracks recentlyPlayedCollectionTracksP = recentlyPlayedContext.p();
                        recentlyPlayedEntityA = xuz.a(recentlyPlayedCollectionTracksP.getLink(), (String) null, (String) null, recentlyPlayedCollectionTracksP.o(), (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, 67108846);
                    } else if (recentlyPlayedContext.w()) {
                        RecentlyPlayedEpisode recentlyPlayedEpisodeQ = recentlyPlayedContext.q();
                        recentlyPlayedEntityA = xuz.a(recentlyPlayedEpisodeQ.o().getLink(), recentlyPlayedEpisodeQ.o().getName(), recentlyPlayedEpisodeQ.o().getCovers().getStandardLink(), recentlyPlayedEpisodeQ.p(), (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, 67108834);
                    } else if (recentlyPlayedContext.hasPlaylist()) {
                        RecentlyPlayedPlaylist recentlyPlayedPlaylistR = recentlyPlayedContext.r();
                        recentlyPlayedEntityA = xuz.a(recentlyPlayedPlaylistR.p().getLink(), recentlyPlayedPlaylistR.p().getName(), recentlyPlayedPlaylistR.p().z().getStandardLink(), recentlyPlayedPlaylistR.q(), recentlyPlayedPlaylistR.o().getOffline(), recentlyPlayedPlaylistR.p().x().getDisplayName(), (String) null, (String) null, (String) null, recentlyPlayedPlaylistR.p().w(), recentlyPlayedPlaylistR.p().v().getDisplayName(), false, 62898050);
                    } else if (recentlyPlayedContext.hasProfile()) {
                        RecentlyPlayedProfile recentlyPlayedProfileS = recentlyPlayedContext.s();
                        String link = recentlyPlayedProfileS.getLink();
                        String name = recentlyPlayedProfileS.getName();
                        String strO = recentlyPlayedProfileS.o();
                        String strQ = recentlyPlayedProfileS.q();
                        String str = (String) o7h.t0(recentlyPlayedProfileS.p(), xuz.b);
                        recentlyPlayedEntityA = xuz.a(link, name, strO, strQ, str == null ? "unknown" : str, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, 67108802);
                    } else if (recentlyPlayedContext.hasShow()) {
                        RecentlyPlayedShow recentlyPlayedShowT = recentlyPlayedContext.t();
                        String link2 = recentlyPlayedShowT.o().getLink();
                        String name2 = recentlyPlayedShowT.o().getName();
                        String standardLink = recentlyPlayedShowT.o().getCovers().getStandardLink();
                        String strP = recentlyPlayedShowT.p();
                        String publisher = recentlyPlayedShowT.o().getPublisher();
                        String str2 = (String) o7h.t0(recentlyPlayedShowT.o().getMediaTypeEnum(), xuz.a);
                        recentlyPlayedEntityA = xuz.a(link2, name2, standardLink, strP, (String) null, (String) null, publisher, (String) null, str2 == null ? "unknown" : str2, false, (String) null, recentlyPlayedShowT.o().getIsBook(), 33553250);
                    } else {
                        RecentlyPlayedTrack recentlyPlayedTrackU = recentlyPlayedContext.u();
                        recentlyPlayedEntityA = xuz.a(recentlyPlayedTrackU.o().getLink(), recentlyPlayedTrackU.o().getName(), recentlyPlayedTrackU.o().getAlbum().getCovers().getStandardLink(), recentlyPlayedTrackU.p(), (String) null, (String) null, (String) null, o7h.y0(recentlyPlayedTrackU.o().getArtistList(), ", ", (String) null, (String) null, f9z.e1, 30), (String) null, false, (String) null, false, 67108578);
                    }
                    arrayList.add(recentlyPlayedEntityA);
                }
                return new RecentlyPlayedResponse(iN, zP, arrayList);
            case 6:
                String str3 = (String) ((cxc0) obj).f.q.get("artistUris");
                mig1VarQ0 = str3 != null ? ihc1.Q0(str3, new String[]{","}, 0, 6) : null;
                return mig1VarQ0 == null ? z6x.a : mig1VarQ0;
            case 9:
                l851 l851Var = (l851) obj;
                return new i39(l851Var.a, l851Var.b);
            case 13:
                o710 o710Var = (o710) obj;
                boolean z = o710Var.c;
                String str4 = o710Var.a;
                return z ? new nqd(str4) : new oqd(str4);
            case 14:
                return new m7g((GetSessionStatusResponse) obj);
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionGetArtistViewResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionGetArtistViewResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                return Boolean.FALSE;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return Boolean.TRUE;
            case 20:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 21:
                return new jh20((atq0) obj);
            case 22:
                return Boolean.valueOf(((r560) obj) == r560.a);
            case 23:
                tv00 tv00Var = (tv00) o7h.s0(((uv00) obj).b(mig1.class));
                mig1VarQ0 = tv00Var != null ? tv00Var.b : null;
                return mig1VarQ0 != null ? Single.just(mig1VarQ0) : Single.error(new NoSuchElementException());
            case 24:
                return eau.a;
            case 27:
                return Boolean.FALSE;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 4:
                fn3 fn3Var = (fn3) obj;
                fn3Var.getClass();
                return First.c(fn3Var, Collections.singleton(im3.a));
            default:
                return First.b((htv) obj);
        }
    }

    public Object g(Object obj) {
        return (uz21) obj;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 1:
                return new nl0(xkg0Var, str2, str);
            case 7:
                return new j18(xkg0Var, str2, str);
            default:
                return new oab(xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((spq0) obj).c();
            case 8:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            case 10:
                return !((uv00) obj).f;
            default:
                return ((w510) obj) instanceof u510;
        }
    }
}
