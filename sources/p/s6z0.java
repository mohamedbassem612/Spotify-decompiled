package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1.SearchProto;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.a;
import com.spotify.profile.mainprofilesections.artists.ArtistlistResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.party.orchestra.v1.RegisterNotifications;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6z0 implements Function, Function3, qiw {
    public final /* synthetic */ byte a;
    public final Object b;

    public s6z0(Field field) {
        this.a = (byte) 24;
        this.b = field;
        field.setAccessible(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(pew pewVar, onm onmVar) {
        ta21 ta21Var;
        if (onmVar instanceof ta21) {
            ta21Var = (ta21) onmVar;
            int i = ta21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta21Var.d = i - Integer.MIN_VALUE;
            } else {
                ta21Var = new ta21(this, onmVar);
            }
        } else {
            ta21Var = new ta21(this, onmVar);
        }
        Object obj = ta21Var.b;
        int i2 = ta21Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzz jzzVar = ta21Var.a;
            hm5.M(obj);
            return jzzVar;
        }
        hm5.M(obj);
        xyc0 xyc0Var = (iyc0) this.b;
        String str = pewVar.a;
        jzz jzzVar2 = jzz.a;
        ta21Var.a = jzzVar2;
        ta21Var.d = 1;
        a aVarN = ModificationRequest.Attributes.n();
        aVarN.s("");
        Object objR = xyc0Var.r(str, aVarN, ta21Var);
        d9n d9nVar = d9n.a;
        return objR == d9nVar ? d9nVar : jzzVar2;
    }

    public Object apply(Object obj) {
        tv80 tv80VarM;
        gzy gzyVar;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 1;
        int i = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                o5z0 o5z0Var = (o5z0) obj;
                t6z0 t6z0Var = (t6z0) obj2;
                rzo0 rzo0Var = t6z0Var.g;
                int i2 = o5z0Var.e;
                String str = o5z0Var.f;
                adz0 adz0Var = o5z0Var.d;
                if (adz0Var.equals(xpf1.a)) {
                    i8h1 i8h1VarA = rzo0Var.A();
                    x6h1 x6h1VarC = ((xrl0) rzo0Var.c).a.c();
                    x6h1VarC.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    Integer numValueOf = Integer.valueOf(i2);
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("queued_track", (String) null, numValueOf, str, (String) null));
                    x6h1VarC2.j = true;
                    tv80VarM = i8h1VarA.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (!adz0Var.equals(ypf1.a)) {
                        eg.o();
                        return null;
                    }
                    i8h1 i8h1VarA2 = rzo0Var.A();
                    x6h1 x6h1VarC3 = ((xrl0) rzo0Var.c).a.c();
                    x6h1VarC3.i.add(new a7h1("track_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    Integer numValueOf2 = Integer.valueOf(i2);
                    x6h1 x6h1VarC4 = y6h1VarA2.c();
                    x6h1VarC4.i.add(new a7h1("queued_track", (String) null, numValueOf2, str, (String) null));
                    x6h1VarC4.j = true;
                    tv80VarM = i8h1VarA2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return t6z0Var.f.o(adz0Var, tv80VarM.a).s(t6z0Var.a).d(Observable.just(w8z0.a));
            case 1:
            case 3:
            case 4:
            case 6:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 20:
            case 23:
            case 24:
            case 26:
            default:
                return Observable.create(new nn61((x981) obj2, (m401) obj, false, (byte) 15));
            case 2:
                return ((g0l) ((l0x0) obj2).c).j();
            case 5:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                List<ArtistlistResponse.RecentlyPlayedArtist> artistsList = ((ArtistlistResponse.RecentlyPlayedArtistsList) obj).getArtistsList();
                ArrayList arrayList = new ArrayList(q7h.U(artistsList, 10));
                for (ArtistlistResponse.RecentlyPlayedArtist recentlyPlayedArtist : artistsList) {
                    arrayList.add(new ncx0(recentlyPlayedArtist.n(), recentlyPlayedArtist.getName(), recentlyPlayedArtist.getImageUrl(), recentlyPlayedArtist.getUri(), (String) null));
                }
                return new mo01(arrayList, zBooleanValue);
            case 7:
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kjf1) it.next()).a);
                }
                return ((uu00) ((ytp0) obj2).c).b(new oi("android-smart-shuffle-recommendations", false, new k011(arrayList2, (byte) 0))).firstOrError().map(w1x0.f).onErrorReturnItem(b7xVar).flatMapMaybe(new hyy0(arrayList2, list, (byte) 13));
            case 8:
                fxd0 fxd0Var = (fxd0) obj;
                we11 we11VarN = RegisterNotifications.RegisterNotificationRequest.n();
                we11VarN.n(fxd0Var.a);
                RegisterNotifications.RegisterNotificationRequest registerNotificationRequestBuild = we11VarN.build();
                ye11 ye11Var = (ye11) obj2;
                ze11 ze11Var = ye11Var.b;
                registerNotificationRequestBuild.getClass();
                return ze11Var.a(registerNotificationRequestBuild).doOnSuccess(new lyw0(ye11Var, fxd0Var, (byte) 20)).map(r6x0.f).onErrorReturn(y6x0.e);
            case 10:
                d3c1 d3c1Var = (f3c1) obj;
                xz11 xz11Var = (xz11) obj2;
                if (!(d3c1Var instanceof e3c1)) {
                    if (!(d3c1Var instanceof d3c1)) {
                        eg.o();
                        return null;
                    }
                    if (Math.abs((xz11Var.b.b() - d3c1Var.a) / 1000) <= 10) {
                        return CompletableEmpty.a;
                    }
                }
                vz11 vz11Var = xz11Var.c;
                return vz11Var.b().c(vz11Var.a(x020.c));
            case 13:
                uqx0 uqx0Var = (uqx0) obj;
                return ((uqn) obj2).b.g(0L, uqx0Var.a, uqx0Var.b).distinctUntilChanged().map(new rpv0(uqx0Var, (byte) 24));
            case 15:
                Map map = (Map) obj;
                g931 g931Var = (g931) obj2;
                z3n0 z3n0Var = (z3n0) ((ynb0) g931Var.b).get();
                qpt0 qpt0VarX = g931.x(z3n0Var.P());
                qma qmaVar = (qma) g931Var.d;
                boolean zF0 = z3n0Var.f0();
                String str2 = (String) map.get("video-manifest-url");
                if (str2 == null) {
                    str2 = "";
                }
                if (zF0) {
                    str2 = "https://spclient.wg.spotify.com/manifests/v9/hls/sources/%s/master.m3u8?supports_drm&gzip&filetype=mp4";
                }
                int iOrdinal = qpt0VarX.ordinal();
                lig0 lig0Var = new lig0((iOrdinal == 1 || iOrdinal == 3) ? "https://spclient.wg.spotify.com/sneaktables/v2/hls/4/{audio_id}/master.m3u8" : "https://spclient.wg.spotify.com/sneaktables/v2/hls/1/{audio_id}/master.m3u8", str2);
                String str3 = (String) map.get("widevine-license-url");
                if (str3 == null) {
                    str3 = "";
                }
                e8c0 e8c0Var = new e8c0("https://spclient.wg.spotify.com/widevine-license/v1/audio/license", str3);
                String str4 = (String) map.get("video-cdn-sampling");
                try {
                    i = Integer.parseInt(str4 != null ? str4 : "");
                    break;
                } catch (NumberFormatException unused) {
                }
                return qma.a(qmaVar, lig0Var, e8c0Var, i, false, false, false, false, false, 0, 0, false, 0, 0, false, false, (jpb) null, (jpb) null, false, false, (ym51) null, false, 0, 0, false, 0, 0, 0, 0, 0, false, 0, false, false, false, false, (k89) null, false, (kr50) null, false, false, false, 0, 0, 0, 0, false, false, false, false, false, false, (qpt0) null, false, (ttp0) null, false, false, false, false, false, 0, 0, false, false, false, 0, false, false, false, 0, false, false, false, false, false, -8, -1, 1023);
            case 17:
                qa41 qa41Var = (qa41) obj;
                String str5 = qa41Var.c;
                boolean z = qa41Var.d;
                Observable map2 = ((v5n) obj2).b(str5).map(i5x0.h);
                if (!z) {
                    map2 = map2.take(1L);
                }
                return map2.map(e4x0.i).onErrorReturn(f4x0.g);
            case 18:
                rj91 rj91Var = (rj91) obj;
                long jE = ((yqg) ((yx11) obj2).b).e();
                return new ek91(new ll91(rj91Var.a, rj91Var.b + jE), jE);
            case 19:
                List list3 = (List) obj;
                SearchProto.MainViewUriResponse mainViewUriResponse = (SearchProto.MainViewUriResponse) obj2;
                String pageToken = mainViewUriResponse.getPageToken();
                d290 d290VarN = mainViewUriResponse.n();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = d290VarN.iterator();
                while (it2.hasNext()) {
                    switch (((p751) it2.next()).ordinal()) {
                        case 1:
                            gzyVar = gzy.d;
                            break;
                        case 2:
                            gzyVar = gzy.b;
                            break;
                        case 3:
                            gzyVar = gzy.c;
                            break;
                        case 4:
                            gzyVar = gzy.a;
                            break;
                        case 5:
                            gzyVar = gzy.e;
                            break;
                        case 6:
                            gzyVar = gzy.f;
                            break;
                        case 7:
                            gzyVar = gzy.g;
                            break;
                        default:
                            gzyVar = null;
                            break;
                    }
                    if (gzyVar != null) {
                        arrayList3.add(gzyVar);
                    }
                }
                return new q551(pageToken, arrayList3, list3);
            case 21:
                cs51 cs51Var = (cs51) obj;
                zr51 zr51Var = (zr51) obj2;
                return zr51Var.a.a(new i9u0(cs51Var.b)).ignoreElement().c(new CompletableFromAction(new tt60(zr51Var, cs51Var, (byte) 22))).w();
            case 22:
                by51 by51Var = (by51) obj2;
                return Flowable.h(by51Var.c, by51Var.d, new vr51((ey51) obj, b2)).z().toObservable();
            case 25:
                cs61 cs61Var = (cs61) obj2;
                return cs61Var.a.a().flatMap(new nn61(((so61) obj).a, cs61Var, false, (byte) 1));
            case 27:
                return kp5.A(((cfr) ((yx11) obj2).b).b, ms91.a).w();
        }
    }

    public boolean b(ContextTrack contextTrack) {
        return (nhc1.Y(contextTrack.uri(), "spotify:room:", false) || !s3o1.v(contextTrack, false)) && ((hod0) this.b).g(contextTrack);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object c(String str, onm onmVar) {
        ql11 ql11Var;
        s6z0 s6z0Var;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4 = str;
        if (onmVar instanceof ql11) {
            ql11Var = (ql11) onmVar;
            int i = ql11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql11Var.d = i - Integer.MIN_VALUE;
                s6z0Var = this;
            } else {
                s6z0Var = this;
                ql11Var = new ql11(s6z0Var, onmVar);
            }
        } else {
            s6z0Var = this;
            ql11Var = new ql11(s6z0Var, onmVar);
        }
        Object objS = ql11Var.b;
        int i2 = ql11Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                try {
                    str2 = new y6b1(str4, false).e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                } catch (SpotifyUriParserException unused) {
                }
                if (str2 != null) {
                    String strF = f4i1.f("spotify:list:mvcdp-related-items-track:", str2, "");
                    xd1 xd1Var = new xd1(s6z0Var, new qvc0(strF, (c3d0) null, (Set) null, (mqz0) null, 14), new rxc0(strF), (lnm) null, (byte) 22);
                    ql11Var.a = str4;
                    ql11Var.d = 1;
                    objS = smo1.s(xd1Var, ql11Var);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = ql11Var.a;
            hm5.M(objS);
            mmr0 mmr0Var = (mmr0) objS;
            oy21 oy21Var = (py21) mmr0Var.a;
            oy21 oy21Var2 = (py21) mmr0Var.b;
            if (oy21Var instanceof oy21) {
                Iterable iterable = (Iterable) oy21Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pvc0) it.next()).c);
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                }
                if (arrayList != null) {
                    if (oy21Var2 instanceof oy21) {
                        str3 = ((qxc0) oy21Var2.a).a;
                        if (str3.length() <= 0) {
                        }
                        if (str3 != null) {
                            return new em11(str3, arrayList);
                        }
                    } else {
                        if (oy21Var2 instanceof ly21) {
                            eg.o();
                            return null;
                        }
                        Logger.d("RelatedEntityDataSource: failed to fetch metadata for %s: %s", new Object[]{str4, ((ly21) oy21Var2).a});
                    }
                    str3 = null;
                    if (str3 != null) {
                        return new em11(str3, arrayList);
                    }
                }
                return null;
            }
            if (!(oy21Var instanceof ly21)) {
                eg.o();
                return null;
            }
            Logger.d("RelatedEntityDataSource: failed to fetch items for %s: %s", new Object[]{str4, ((ly21) oy21Var).a});
            arrayList = null;
            if (arrayList != null) {
                if (oy21Var2 instanceof oy21) {
                    str3 = ((qxc0) oy21Var2.a).a;
                    if (str3.length() <= 0) {
                    }
                    if (str3 != null) {
                        return new em11(str3, arrayList);
                    }
                } else {
                    if (oy21Var2 instanceof ly21) {
                        eg.o();
                        return null;
                    }
                    Logger.d("RelatedEntityDataSource: failed to fetch metadata for %s: %s", new Object[]{str4, ((ly21) oy21Var2).a});
                }
                str3 = null;
                if (str3 != null) {
                    return new em11(str3, arrayList);
                }
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "RelatedEntityDataSource: failed to fetch list for %s", new Object[]{str4});
            return null;
        }
    }

    public void d(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.getInt("_aweme_open_sdk_params_type") != 4) {
            return;
        }
        Bundle extras2 = intent.getExtras();
        c431 c431Var = extras2 != null ? new c431(extras2.getString("_aweme_open_sdk_params_state"), extras2.getInt("_aweme_open_sdk_params_sub_error_code"), extras2.getInt("_aweme_open_sdk_params_error_code"), extras2.getString("_aweme_open_sdk_params_error_msg"), extras2.getBundle("_bytedance_params_extra")) : null;
        if ((c431Var != null ? Integer.valueOf(c431Var.b) : null) != null) {
            g871 g871Var = (g871) this.b;
            String strC = f4i1.c(c431Var.b, "tiktok:");
            int i = c431Var.c;
            String str = c431Var.d;
            if (str == null) {
                str = "no-error-msg";
            }
            g871Var.c(new j8r(strC, i, str));
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        int i;
        Set set;
        w7x w7xVarL;
        Map map = (Map) obj;
        Restrictions restrictions = (Restrictions) obj2;
        Boolean bool = (Boolean) obj3;
        yaz0 yaz0Var = (yaz0) this.b;
        if (y7y0.L(map)) {
            i = 1;
        } else {
            i = yaz0Var.f(map) ? 2 : 3;
        }
        boolean z = y7y0.L(map) || (yaz0Var.f(map) && bool.booleanValue());
        boolean zIsEmpty = restrictions.disallowAddToQueueReasons().isEmpty();
        Set set2 = abz0.a;
        xj61 xj61VarL = ujo1.l(i == 2 ? false : restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons().isEmpty(), i == 2 ? false : restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons().isEmpty());
        xj61 xj61VarL2 = ujo1.l(i == 2 ? false : restrictions.disallowReorderingEpisodeInNextTracksReasons().isEmpty(), i == 2 ? false : restrictions.disallowReorderingTrackInNextTracksReasons().isEmpty());
        abz0 abz0Var = abz0.d;
        boolean z2 = xj61VarL.a.containsKey(abz0Var) && xj61VarL2.a.containsKey(abz0Var);
        abz0 abz0Var2 = abz0.c;
        xj61 xj61VarL3 = ujo1.l(z2, xj61VarL.a.containsKey(abz0Var2) && xj61VarL2.a.containsKey(abz0Var2));
        Set set3 = w7x.a;
        if (i == 2) {
            set = set3;
        } else {
            set = restrictions.disallowRemovingFromNextTracksReasons().isEmpty() ? abz0.a : abz0.b;
        }
        if (i != 2) {
            set3 = restrictions.disallowRemovingFromContextTracksReasons().isEmpty() ? abz0.a : abz0.b;
        }
        Set set4 = set3;
        boolean zIsEmpty2 = restrictions.disallowViewingOrderedTracksInNextTracksReasons().isEmpty();
        xj61 xj61VarL4 = ujo1.l(true, restrictions.disallowTapToPlayTrackInNextTracksReasons().isEmpty());
        if (z) {
            w7xVarL = ujo1.l(zIsEmpty, zIsEmpty && restrictions.disallowAddToQueueTrackReasons().isEmpty());
        } else {
            w7xVarL = abz0.b;
        }
        return new bbz0(z, i, xj61VarL, xj61VarL2, xj61VarL3, set, set4, zIsEmpty2, xj61VarL4, w7xVarL, true, y7y0.G(map) && y7y0.z(map) && !y7y0.E(map), restrictions.disallowAddToQueueReasons(), 4);
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                ((a901) obj2).a.setBackgroundColor(((Number) obj).intValue());
                break;
            default:
                ((bpb1) obj2).l(((od51) obj).d);
                break;
        }
    }

    public s6z0(jxa jxaVar, brl0 brl0Var) {
        this.a = (byte) 6;
        this.b = brl0Var;
    }

    public s6z0(nt21 nt21Var) {
        this.a = (byte) 16;
        b3s b3sVar = b3s.c;
        this.b = nt21Var;
    }

    public /* synthetic */ s6z0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
