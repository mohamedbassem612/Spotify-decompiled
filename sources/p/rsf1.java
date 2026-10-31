package p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.cosmos.util.proto.AlbumMetadata;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.cosmos.util.proto.TrackArtistMetadata;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rsf1 implements jsf1 {
    public final g2z A;
    public final sun B;
    public final boolean C;
    public final bhf0 D;
    public final aqs0 E;
    public final smf0 F;
    public final bog1 G;
    public final gmt H;
    public final o860 I;
    public final dh30 J;
    public final wvd1 K;
    public final ahu0 L;
    public final oqa1 M;
    public final hp91 N;
    public final z6k0 O;
    public final rxj0 P;
    public final p5q Q;
    public final r2r R;
    public final oum S;
    public final go41 T;
    public final kqi0 U;
    public final o3e0 V;
    public final hum W;
    public final lc20 X;
    public final q8n Y;
    public final xlr Z;
    public final hsf1 a;
    public final w6x a0;
    public final xrc0 b;
    public final gjc1 b0;
    public final e3b c;
    public final vbs c0;
    public final rh11 d;
    public final Observable d0;
    public final xgb e;
    public final Observable e0;
    public final sb40 f;
    public final idd1 f0;
    public final me30 g;
    public final b0a0 h;
    public final bl3 i;
    public final tsf1 j;
    public final tsf1 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final c9c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y4q f37p;
    public final g7h q;
    public final eu4 r;
    public final rok0 s;
    public final gid t;
    public final uu00 u;
    public final ek1 v;
    public final a4q0 w;
    public final a7a1 x;
    public final agc0 y;
    public final upp0 z;

    public rsf1(ov20 ov20Var, hsf1 hsf1Var, xrc0 xrc0Var, e3b e3bVar, rh11 rh11Var, xgb xgbVar, sb40 sb40Var, me30 me30Var, b0a0 b0a0Var, bl3 bl3Var, tsf1 tsf1Var, tsf1 tsf1Var2, boolean z, boolean z2, boolean z3, c9c0 c9c0Var, y4q y4qVar, g7h g7hVar, eu4 eu4Var, rok0 rok0Var, gid gidVar, uu00 uu00Var, ek1 ek1Var, a4q0 a4q0Var, a7a1 a7a1Var, agc0 agc0Var, upp0 upp0Var, g2z g2zVar, sun sunVar, boolean z4, bhf0 bhf0Var, aqs0 aqs0Var, smf0 smf0Var, bog1 bog1Var, gmt gmtVar, o860 o860Var, dh30 dh30Var, wvd1 wvd1Var, ahu0 ahu0Var, oqa1 oqa1Var, hp91 hp91Var, z6k0 z6k0Var, rxj0 rxj0Var, p5q p5qVar, r2r r2rVar, oum oumVar, go41 go41Var, kqi0 kqi0Var, o3e0 o3e0Var, hum humVar, lc20 lc20Var, q8n q8nVar, xlr xlrVar, m4c m4cVar, w6x w6xVar, gjc1 gjc1Var, Activity activity, vbs vbsVar) {
        this.a = hsf1Var;
        this.b = xrc0Var;
        this.c = e3bVar;
        this.d = rh11Var;
        this.e = xgbVar;
        this.f = sb40Var;
        this.g = me30Var;
        this.h = b0a0Var;
        this.i = bl3Var;
        this.j = tsf1Var;
        this.k = tsf1Var2;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = c9c0Var;
        this.f37p = y4qVar;
        this.q = g7hVar;
        this.r = eu4Var;
        this.s = rok0Var;
        this.t = gidVar;
        this.u = uu00Var;
        this.v = ek1Var;
        this.w = a4q0Var;
        this.x = a7a1Var;
        this.y = agc0Var;
        this.z = upp0Var;
        this.A = g2zVar;
        this.B = sunVar;
        this.C = z4;
        this.D = bhf0Var;
        this.E = aqs0Var;
        this.F = smf0Var;
        this.G = bog1Var;
        this.H = gmtVar;
        this.I = o860Var;
        this.J = dh30Var;
        this.K = wvd1Var;
        this.L = ahu0Var;
        this.M = oqa1Var;
        this.N = hp91Var;
        this.O = z6k0Var;
        this.P = rxj0Var;
        this.Q = p5qVar;
        this.R = r2rVar;
        this.S = oumVar;
        this.T = go41Var;
        this.U = kqi0Var;
        this.V = o3e0Var;
        this.W = humVar;
        this.X = lc20Var;
        this.Y = q8nVar;
        this.Z = xlrVar;
        this.a0 = w6xVar;
        this.b0 = gjc1Var;
        this.c0 = vbsVar;
        bw20 bw20Var = (bw20) ov20Var;
        jha1 jha1Var = new jha1(rqt0.u(new p3t(bw20Var.a, (byte) 23)), (byte) 16);
        o6x o6xVar = o6x.a;
        this.d0 = yoi1.i(jha1Var, o6xVar).take(1L);
        this.e0 = yoi1.i(new jha1(bw20Var.c("disable-blocked-content", "0"), (byte) 17), o6xVar).take(1L);
        this.f0 = new idd1(new j4f1(this, (byte) 9));
    }

    public static void b(CollectionTrack collectionTrack, Map map, vsf1 vsf1Var, iu30 iu30Var) {
        ContextTrack contextTrackCreate;
        if (!vsf1Var.i && collectionTrack.t().getIsPlayable() && collectionTrack.t().getPlayabilityRestriction() == PlayabilityRestriction.NO_RESTRICTION) {
            String link = collectionTrack.s().getLink();
            if (map == null || (contextTrackCreate = ContextTrack.builder(link).metadata(map).build()) == null) {
                contextTrackCreate = ContextTrack.create(link);
            }
            iu30Var.invoke(contextTrackCreate);
        }
    }

    public static boolean f(String str) {
        Set set = s4b1.f;
        return uic.k(str, nyu0.e, wyu0.f);
    }

    public static String g(CollectionTrack collectionTrack) {
        return collectionTrack.s().getLink();
    }

    public static boolean h(CollectionTrack collectionTrack) {
        return collectionTrack.r().getIsBanned();
    }

    public static boolean i(Map map) {
        if (!Boolean.parseBoolean(map != null ? (String) map.get("is_in_video_first_playlist") : null)) {
            return false;
        }
        String str = map != null ? (String) map.get("is_music_video") : null;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = map != null ? (String) map.get("audio_association") : null;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public static boolean k(CollectionTrack collectionTrack) {
        return collectionTrack.s().getIsLocal();
    }

    public static boolean m(String str, blc0 blc0Var) {
        return blc0Var == blc0.L1 || f(str);
    }

    public final void a(smc0 smc0Var, CollectionTrack collectionTrack, List list, ib3 ib3Var, TrackArtistMetadata trackArtistMetadata, vsf1 vsf1Var, Map map) {
        if (!vsf1Var.X || collectionTrack.s().getIsLocal()) {
            return;
        }
        if (vsf1Var.l1 || !l(map) || i(map)) {
            if (list.size() == 1) {
                smc0Var.add(((i6c) ib3Var.l).a(trackArtistMetadata.getLink(), trackArtistMetadata.getName()));
                return;
            }
            ic9 ic9Var = (ic9) ib3Var.B;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TrackArtistMetadata) it.next()).getLink());
            }
            smc0Var.add(ic9Var.d(arrayList));
        }
    }

    public final void c(smc0 smc0Var, ib3 ib3Var, vsf1 vsf1Var, boolean z) {
        if (this.l || z || (this.n && vsf1Var.e)) {
            if (!z) {
                smc0Var.add(jl21.b((jl21) ib3Var.b, (String) ib3Var.u, (lik1) ib3Var.I));
                return;
            }
            mxr mxrVar = (mxr) ib3Var.D;
            String str = (String) ib3Var.u;
            z6c z6cVar = (z6c) mxrVar.c;
            smc0Var.add(new jhm("songdna_track_credits_report", csx.c, (fhm) null, 2131962773, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(p9a1.c, p9a1.d), new iv81(str, z6cVar, (byte) 17)), 244));
            i6c i6cVar = (i6c) ((mxr) ib3Var.D).d;
            smc0Var.add(new jhm("songdna_about", ynx.c, (fhm) null, 2131962772, (String) null, false, (tm81) null, new ihm(zgm.c, new ghm(y5a1.t, y5a1.X), new dr91(i6cVar, (byte) 10)), 244));
        }
    }

    public final Observable d(dmf1 dmf1Var) {
        Single singleJust;
        String str = dmf1Var.a;
        boolean z = dmf1Var.d.c1;
        z6x z6xVar = z6x.a;
        if (z) {
            singleJust = this.u.b(new oi("audio_associations_metadata_loader", false, new hqa1(str, (byte) 29))).filter(r5x0.U0).map(r6x0.T0).first(new lo7(z6xVar));
        } else {
            singleJust = Single.just(new lo7(z6xVar));
            singleJust.getClass();
        }
        String str2 = dmf1Var.c;
        isf1 isf1Var = this.a;
        isf1Var.getClass();
        e3h e3hVarP = CollectionDecorateRequest.p();
        e3hVarP.q(str);
        e3hVarP.y(isf1.b);
        if (str2 != null) {
            e3hVarP.s(str2);
        }
        return Single.zip(isf1Var.a.b(e3hVarP.build()).map(new az8(str, str2, (byte) 5)), singleJust, f4x0.R0).flatMapObservable(new vnd1(this, dmf1Var, (byte) 8));
    }

    public final igm e(CollectionTrack collectionTrack, AlbumMetadata albumMetadata, TrackArtistMetadata trackArtistMetadata, boolean z) {
        if (z) {
            return new igm(collectionTrack.s().getName(), (rzn1) null, f0o1.t(p7h.M(new String[]{trackArtistMetadata.getName(), albumMetadata.getName()})), 2);
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(trackArtistMetadata.getName());
        if (!this.L.c) {
            smc0VarN.add(albumMetadata.getName());
        }
        if (this.b0.a(new m9d0[]{sc41.b, sc41.n})) {
            collectionTrack.s().getIsLocal();
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        String name = collectionTrack.s().getName();
        String strT = f0o1.t(smc0VarK);
        AlbumMetadata albumMetadataO = collectionTrack.o().o();
        String standardLink = albumMetadataO.getCovers().getStandardLink();
        albumMetadataO.getCovers().getSmallLink();
        albumMetadataO.getCovers().getLargeLink();
        albumMetadataO.getCovers().getXlargeLink();
        Uri uri = Uri.parse(standardLink);
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        return new igm(name, new wfm(uri, ggm.c), strT);
    }

    public final boolean j(String str) {
        this.y.getClass();
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    public final boolean l(Map map) {
        boolean z;
        eu4 eu4Var = this.r;
        boolean z2 = eu4Var.m() || eu4Var.a();
        String str = map != null ? (String) map.get("save_track.uri") : null;
        if (str == null || str.length() == 0) {
            String str2 = map != null ? (String) map.get("audio_association") : null;
            if (str2 == null || str2.length() == 0) {
                String str3 = map != null ? (String) map.get("is_music_video") : null;
                if (str3 == null || str3.length() == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        return z2 && z;
    }
}
