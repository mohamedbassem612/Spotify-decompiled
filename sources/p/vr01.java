package p;

import com.google.protobuf.h;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDataSourceErrorEvent;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vr01 implements ir01 {
    public final xrc0 a;
    public final s880 b;
    public final phi0 c;
    public final iyc0 d;
    public final bf3 e;
    public final q8n f;
    public final poj0 g;
    public final dxy h;
    public final kdy0 i;
    public final yt91 j;
    public final l0x0 k;
    public final cik1 l;
    public final hgd0 m;
    public final Flowable n;
    public final zle1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f91p;
    public final vh4 q;
    public final t2j0 r;
    public final PlaylistRequestDecorationPolicy s;
    public final PlaylistRequestDecorationPolicy t;
    public final mr20 u;

    /* JADX WARN: Multi-variable type inference failed */
    public vr01(Flowable flowable, xrc0 xrc0Var, s880 s880Var, phi0 phi0Var, iyc0 iyc0Var, bf3 bf3Var, q8n q8nVar, poj0 poj0Var, dxy dxyVar, kdy0 kdy0Var, yt91 yt91Var, l0x0 l0x0Var, cik1 cik1Var, hgd0 hgd0Var, Flowable flowable2, zle1 zle1Var, String str, vh4 vh4Var, t2j0 t2j0Var) {
        this.a = xrc0Var;
        this.b = s880Var;
        this.c = phi0Var;
        this.d = iyc0Var;
        this.e = bf3Var;
        this.f = q8nVar;
        this.g = poj0Var;
        this.h = dxyVar;
        this.i = kdy0Var;
        this.j = yt91Var;
        this.k = l0x0Var;
        this.l = cik1Var;
        this.m = hgd0Var;
        this.n = flowable2;
        this.o = zle1Var;
        this.f91p = str;
        this.q = vh4Var;
        this.r = t2j0Var;
        sku0 sku0Var = (sku0) PlaylistDecorationPolicy.o().toBuilder();
        sku0Var.j0();
        sku0Var.G();
        PlaylistDecorationPolicy playlistDecorationPolicy = (PlaylistDecorationPolicy) sku0Var.build();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.x();
        fj90 fj90VarN = ItemExtensionPolicy.n();
        clc0 clc0Var = clc0.ARTIST;
        fj90VarN.r(clc0Var);
        hz00 hz00Var = hz00.IDENTITY_TRAIT;
        fj90VarN.n(hz00Var);
        h hVarBuild = fj90VarN.build();
        fj90 fj90VarN2 = ItemExtensionPolicy.n();
        fj90VarN2.r(clc0Var);
        hz00 hz00Var2 = hz00.VISUAL_IDENTITY_TRAIT;
        fj90VarN2.n(hz00Var2);
        h hVarBuild2 = fj90VarN2.build();
        fj90 fj90VarN3 = ItemExtensionPolicy.n();
        clc0 clc0Var2 = clc0.SHOW;
        fj90VarN3.r(clc0Var2);
        fj90VarN3.n(hz00Var);
        h hVarBuild3 = fj90VarN3.build();
        fj90 fj90VarN4 = ItemExtensionPolicy.n();
        fj90VarN4.r(clc0Var2);
        fj90VarN4.n(hz00Var2);
        h hVarBuild4 = fj90VarN4.build();
        fj90 fj90VarN5 = ItemExtensionPolicy.n();
        fj90VarN5.r(clc0.EPISODE);
        fj90VarN5.n(hz00Var2);
        h hVarBuild5 = fj90VarN5.build();
        fj90 fj90VarN6 = ItemExtensionPolicy.n();
        clc0 clc0Var3 = clc0.ALBUM;
        fj90VarN6.r(clc0Var3);
        fj90VarN6.n(hz00Var);
        h hVarBuild6 = fj90VarN6.build();
        fj90 fj90VarN7 = ItemExtensionPolicy.n();
        fj90VarN7.r(clc0Var3);
        fj90VarN7.n(hz00Var2);
        fj90 fj90VarN8 = ItemExtensionPolicy.n();
        clc0 clc0Var4 = clc0.KALLAX;
        fj90VarN8.r(clc0Var4);
        fj90VarN8.n(hz00Var);
        fj90 fj90VarN9 = ItemExtensionPolicy.n();
        fj90VarN9.r(clc0Var4);
        fj90VarN9.n(hz00Var2);
        fj90 fj90VarN10 = ItemExtensionPolicy.n();
        fj90VarN10.r(clc0.TRACK);
        fj90VarN10.n(hz00Var2);
        fj90 fj90VarN11 = ItemExtensionPolicy.n();
        clc0 clc0Var5 = clc0.LISTENING_STATS;
        fj90VarN11.r(clc0Var5);
        fj90VarN11.n(hz00Var);
        fj90 fj90VarN12 = ItemExtensionPolicy.n();
        fj90VarN12.r(clc0Var5);
        fj90VarN12.n(hz00Var2);
        iou0VarV.n(t380.w(hVarBuild, hVarBuild2, hVarBuild3, hVarBuild4, hVarBuild5, hVarBuild6, new ItemExtensionPolicy[]{fj90VarN7.build(), fj90VarN8.build(), fj90VarN9.build(), fj90VarN10.build(), fj90VarN11.build(), fj90VarN12.build()}));
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = (PlaylistItemDecorationPolicy) iou0VarV.build();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.v(true);
        vwu0VarR.n();
        vwu0VarR.A();
        vwu0VarR.D((TrackDecorationPolicy) TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setPlayable(true).setIsExplicit(true).setIs19PlusOnly(true).setIsPremiumOnly(true).build());
        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true));
        vwu0VarR.r((PlaylistAlbumDecorationPolicy) dgu0VarP.build());
        vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) vwu0VarR.build();
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.x();
        llu0VarR.n();
        llu0VarR.t((EpisodeDecorationPolicy) EpisodeDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).setIsExplicit(true).setIsBookChapter(true).setPublishDate(true).setDescription(true).setIs19PlusOnly(true).build());
        llu0VarR.w((EpisodePlayedStateDecorationPolicy) EpisodePlayedStateDecorationPolicy.newBuilder().setPlayable(true).build());
        llu0VarR.z((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setLink(true).setName(true).setCovers(true).setDescription(true).setIsBook(true).build());
        llu0VarR.u();
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = (PlaylistEpisodeDecorationPolicy) llu0VarR.build();
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        hru0VarS.w(playlistDecorationPolicy);
        hru0VarS.u(playlistItemDecorationPolicy);
        hru0VarS.y(playlistTrackDecorationPolicy);
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) hru0VarS.build();
        this.s = playlistRequestDecorationPolicy;
        hru0 hru0Var = (hru0) playlistRequestDecorationPolicy.toBuilder();
        hru0Var.s(playlistEpisodeDecorationPolicy);
        this.t = (PlaylistRequestDecorationPolicy) hru0Var.build();
        vbm[] vbmVarArr = q601.a;
        this.u = rqt0.u(new m010(new kge(flowable), (byte) 1));
    }

    public static trc0 a(lv01 lv01Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy) {
        List list = lv01Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("group_id_" + ((String) it.next()));
        }
        if (lv01Var.f) {
            arrayList = o7h.N0(arrayList, k4p1.x("group_id_0"));
        }
        ArrayList arrayList2 = new ArrayList(lv01Var.e ? z6x.a : k4p1.x(arrayList));
        m9m m9mVar = lv01Var.c;
        if (m9mVar != null) {
            arrayList2.add(k4p1.x("content_type_".concat(m9mVar.name().toLowerCase(Locale.ROOT))));
        }
        br01 br01Var = lv01Var.d;
        if (br01Var != null) {
            arrayList2.add(k4p1.x("recent_type_".concat(br01Var.name().toLowerCase(Locale.ROOT))));
        }
        return new trc0(playlistRequestDecorationPolicy, null, Collections.singleton(new arc0(arrayList2)), false, qrc0.a, new iqz0(0, lv01Var.a + 1), null, 0, null, 458);
    }

    public static mr20 e(vr01 vr01Var, mr20 mr20Var) {
        return !vr01Var.q.a() ? mr20Var : f5p1.q(mr20Var, new ic01(new n5f0(2000L, 5000L), (lnm) null, (byte) 4));
    }

    public static br01 h(zn01 zn01Var) {
        int iOrdinal = zn01Var.ordinal();
        if (iOrdinal == 1) {
            return br01.SAVED;
        }
        if (iOrdinal == 2) {
            return br01.PLAYED;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return br01.AUTO_GENERATED;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(wsc0 wsc0Var, su01 su01Var, onm onmVar) {
        or01 or01Var;
        vr01 vr01Var;
        if (onmVar instanceof or01) {
            or01Var = (or01) onmVar;
            int i = or01Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                or01Var.e = i - Integer.MIN_VALUE;
            } else {
                or01Var = new or01(this, onmVar);
            }
        } else {
            or01Var = new or01(this, onmVar);
        }
        Object objS = or01Var.c;
        int i2 = or01Var.e;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objS);
            List list = wsc0Var.e;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((zuc0) it.next()).c);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                Set set = s4b1.f;
                v5b1 v5b1Var = uic.x((String) obj).d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    arrayList2.add(obj);
                }
            }
            long jB = this.q.b();
            or01Var.a = su01Var;
            or01Var.b = this;
            or01Var.e = 1;
            objS = this.c.s(arrayList2, su01Var, jB);
            Object obj2 = d9n.a;
            if (objS == obj2) {
                return obj2;
            }
            vr01Var = this;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vr01Var = or01Var.b;
            su01Var = or01Var.a;
            hm5.M(objS);
        }
        return fyo1.v(rqt0.u(x4p1.h(e(vr01Var, (mr20) objS), new ms4((Object) this, lnmVar, (byte) 7))), new dsr0(su01Var, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(List list, su01 su01Var, onm onmVar) {
        sr01 sr01Var;
        if (onmVar instanceof sr01) {
            sr01Var = (sr01) onmVar;
            int i = sr01Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sr01Var.e = i - Integer.MIN_VALUE;
            } else {
                sr01Var = new sr01(this, onmVar);
            }
        } else {
            sr01Var = new sr01(this, onmVar);
        }
        Object objD = sr01Var.c;
        int i2 = sr01Var.e;
        if (i2 == 0) {
            hm5.M(objD);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(((zuc0) obj).c).c;
                if (blc0Var == blc0.SHOW_SHOW || blc0Var == blc0.SHOW_EPISODE) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((zuc0) it.next()).c);
            }
            Set setP1 = o7h.p1(arrayList2);
            sr01Var.a = su01Var;
            sr01Var.b = this;
            sr01Var.e = 1;
            objD = this.h.D(setP1, su01Var);
            Object obj2 = d9n.a;
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = sr01Var.b;
            su01Var = sr01Var.a;
            hm5.M(objD);
        }
        return fyo1.v(rqt0.u(x4p1.h(e(this, (mr20) objD), new q8t0((byte) 8))), new dsr0(su01Var, (byte) 9));
    }

    public final iib d(lv01 lv01Var) {
        su01 su01Var = new su01(this.o, lv01Var.a);
        trc0 trc0VarA = a(lv01Var, this.t);
        m9m m9mVar = lv01Var.c;
        rsc0 rsc0Var = (rsc0) this.a;
        String str = this.f91p;
        jge jgeVarE = hu20.e(hu20.a(rsc0Var.k(str, trc0VarA), new i3y0(su01Var, this, (lnm) null, (byte) 8)), new nr01((lnm) null, this, su01Var, m9mVar));
        q8n q8nVar = this.f;
        mr20 mr20VarR = o4p1.r(jgeVarE, q8nVar);
        if (!lv01Var.g) {
            mr20VarR = h4p1.l(new ciw0(z4p1.F(o4p1.r(hu20.e(hu20.a(z4p1.F(rsc0Var.k(str, a(lv01Var, this.s)), 1), new i3y0(su01Var, this, (lnm) null, (byte) 8)), new nr01((lnm) null, this, su01Var, m9mVar)), q8nVar), 1), mr20VarR, (lnm) null, (byte) 6));
        }
        return u4p1.a0(f5p1.q(mr20VarR, new tr01(su01Var, (lnm) null, (byte) 0)), new mpw(su01Var, this, (lnm) null));
    }

    public final void f(String str) {
        Logger.d(str, new Object[0]);
        jr01 jr01VarN = RecentsDataSourceErrorEvent.n();
        jr01VarN.n(str);
        jr01VarN.q(this.f91p);
        this.r.a(jr01VarN.build());
    }

    public final ezc g() {
        String strD = this.e.d();
        rqt0.F(igu.b, new b201(this, strD, (lnm) null, (byte) 15)).doOnError(new z0u0(this, strD, (byte) 9)).onErrorComplete().subscribe();
        return yoi1.g(rqt0.G(new vse0(this, (lnm) null, (byte) 16)).map(new mlw0(this, (byte) 15)).toObservable());
    }
}
