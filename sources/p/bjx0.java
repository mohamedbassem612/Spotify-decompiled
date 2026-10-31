package p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.reachability.esperanto.proto.EsReachability;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import spotify.collection.esperanto.proto.CollectionArtist;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bjx0 implements Function, Function4, Predicate, tn41, xu91, com.spotify.mobius.functions.Function, BiPredicate, jrn0, s2i1, qs40 {
    public final /* synthetic */ byte a;
    public static final bjx0 b = new bjx0((byte) 0);
    public static final bjx0 c = new bjx0((byte) 1);
    public static final bjx0 d = new bjx0((byte) 2);
    public static final bjx0 e = new bjx0((byte) 3);
    public static final bjx0 f = new bjx0((byte) 4);
    public static final bjx0 g = new bjx0((byte) 5);
    public static final bjx0 h = new bjx0((byte) 6);
    public static final bjx0 i = new bjx0((byte) 7);
    public static final bjx0 t = new bjx0((byte) 8);
    public static final bjx0 X = new bjx0((byte) 9);
    public static final bjx0 Y = new bjx0((byte) 10);
    public static final bjx0 Z = new bjx0((byte) 11);
    public static final bjx0 N0 = new bjx0((byte) 12);
    public static final bjx0 O0 = new bjx0((byte) 13);
    public static final bjx0 P0 = new bjx0((byte) 14);
    public static final bjx0 Q0 = new bjx0((byte) 15);
    public static final bjx0 R0 = new bjx0((byte) 16);
    public static final bjx0 S0 = new bjx0((byte) 17);
    public static final bjx0 T0 = new bjx0((byte) 18);
    public static final bjx0 U0 = new bjx0((byte) 19);
    public static final bjx0 V0 = new bjx0((byte) 20);
    public static final bjx0 W0 = new bjx0((byte) 21);
    public static final bjx0 X0 = new bjx0((byte) 22);
    public static final bjx0 Y0 = new bjx0((byte) 23);
    public static final bjx0 Z0 = new bjx0((byte) 24);
    public static final bjx0 a1 = new bjx0((byte) 25);
    public static final bjx0 b1 = new bjx0((byte) 26);

    public bjx0(mq6 mq6Var) {
        this.a = (byte) 28;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        str.getClass();
        return new yi11(str, (Restrictions) obj2, (fvf1) obj3, (tig0) obj4);
    }

    public int a(int i2, int i3, int i4, int i5) {
        return ((i2 / 2) - (i3 / 2)) - i4;
    }

    public Object apply(Object obj) {
        hix0 gix0Var;
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Integer num = ((i1z) entry.getValue()).r;
                    int iIntValue = num != null ? num.intValue() : ((i1z) entry.getValue()).q;
                    int i2 = ((i1z) entry.getValue()).q;
                    ngv ngvVar = ngv.e;
                    if (iIntValue == i2) {
                        boolean z = ((i1z) entry.getValue()).s;
                        ytw0 ytw0Var = jfv.b;
                        gix0Var = new hix0(z, jfv.h(fdg1.k0(((i1z) entry.getValue()).q, ngvVar)));
                    } else {
                        ytw0 ytw0Var2 = jfv.b;
                        gix0Var = new gix0(jfv.h(fdg1.k0(((i1z) entry.getValue()).q, ngvVar)), jfv.h(fdg1.k0(((i1z) entry.getValue()).q - iIntValue, ngvVar)), ((i1z) entry.getValue()).s);
                    }
                    linkedHashMap.put(key, gix0Var);
                }
                return linkedHashMap;
            case 1:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new g7z0(message);
            case 2:
                return ((EsReachability.LegacyReachability) obj).toByteArray();
            case 3:
                return new e011((List) obj);
            case 4:
            case 5:
            case 7:
            case 9:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 24:
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
            case 26:
            default:
                CollectionArtist collectionArtistN = ((CollectionGetArtistViewResponse) obj).n();
                String name = collectionArtistN.q().getName();
                int numExplicitlyLikedTracks = collectionArtistN.p().getNumExplicitlyLikedTracks();
                int numAlbumsInCollection = collectionArtistN.p().getNumAlbumsInCollection();
                String offline = collectionArtistN.r().getOffline();
                String collectionLink = collectionArtistN.p().getCollectionLink();
                ImageGroup portraits = collectionArtistN.q().getPortraits();
                return new nq6(numAlbumsInCollection, numExplicitlyLikedTracks, name, offline, collectionLink, p7h.M(new pfv0[]{new pfv0(portraits.getStandardLink(), 1), new pfv0(portraits.getSmallLink(), 2), new pfv0(portraits.getLargeLink(), 3), new pfv0(portraits.getXlargeLink(), 4)}));
            case 6:
                pd50 pd50Var = (pd50) obj;
                JSONObject jSONObject = pd50Var.b;
                return (jSONObject == null || jhc1.F(jSONObject.optString("id"))) ? new ff10(String.valueOf(pd50Var.c)) : new hf10(jSONObject);
            case 8:
                long j = ((Boolean) obj).booleanValue() ? 3000L : 0L;
                int i3 = Flowable.a;
                return Flowable.a0(j, TimeUnit.MILLISECONDS, Schedulers.b);
            case 10:
                return spq0.d((u3u0) ((mmr0) obj).b);
            case 11:
                return ((qq81) obj).c;
            case 12:
                return Collections.singletonList((tl91) obj);
            case 13:
                return new g8o0((Throwable) obj, (bk8) null);
            case 14:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Assisted Curation Social Recommendations: failed to load recs: %s", new Object[]{th.getMessage()});
                return b7x.a;
            case 16:
                return ((th61) obj).a;
            case 18:
                return Integer.valueOf(((l3c1) obj).getRevision());
            case 22:
                a1f1 a1f1Var = (b1f1) obj;
                if (a1f1Var instanceof a1f1) {
                    wze1 wze1Var = a1f1Var.a;
                    return wze1Var.a.length() == 0 ? Single.error(new IllegalStateException("STT Success received with missing token.")) : Single.just(wze1Var);
                }
                if (!(a1f1Var instanceof z0f1)) {
                    eg.o();
                    return null;
                }
                return Single.error(new RuntimeException("Failure received during STT exchange . Response: " + a1f1Var));
            case 27:
                return h62.b.get(obj);
        }
    }

    public Object b(String str, Function0 function0) {
        return function0.invoke();
    }

    public void c(wax waxVar) {
        waxVar.c(t0p1.class, rko1.a);
        waxVar.c(j9p1.class, vvo1.a);
        waxVar.c(u0p1.class, uko1.a);
        waxVar.c(j1p1.class, xko1.a);
        waxVar.c(h1p1.class, vko1.a);
        waxVar.c(i1p1.class, alo1.a);
        waxVar.c(jyo1.class, hgo1.a);
        waxVar.c(hyo1.class, ego1.a);
        waxVar.c(b0p1.class, fjo1.a);
        waxVar.c(k8p1.class, iuo1.a);
        waxVar.c(gyo1.class, bgo1.a);
        waxVar.c(fyo1.class, yfo1.a);
        waxVar.c(x3p1.class, opo1.a);
        waxVar.c(fbp1.class, aio1.a);
        waxVar.c(vzo1.class, hio1.a);
        waxVar.c(czo1.class, xho1.a);
        waxVar.c(a4p1.class, qpo1.a);
        waxVar.c(t7p1.class, duo1.a);
        waxVar.c(g8p1.class, euo1.a);
        waxVar.c(p7p1.class, auo1.a);
        waxVar.c(o1p1.class, plo1.a);
        waxVar.c(ebp1.class, sdo1.a);
        waxVar.c(p1p1.class, slo1.a);
        waxVar.c(r4p1.class, pqo1.a);
        waxVar.c(z4p1.class, aro1.a);
        waxVar.c(x4p1.class, wqo1.a);
        waxVar.c(u4p1.class, sqo1.a);
        waxVar.c(b6p1.class, dso1.a);
        waxVar.c(e6p1.class, fso1.a);
        waxVar.c(i6p1.class, kso1.a);
        waxVar.c(g6p1.class, iso1.a);
        waxVar.c(n1p1.class, olo1.a);
        waxVar.c(j6p1.class, mso1.a);
        waxVar.c(l6p1.class, yso1.a);
        waxVar.c(m6p1.class, ato1.a);
        waxVar.c(o6p1.class, dto1.a);
        waxVar.c(w6p1.class, lto1.a);
        waxVar.c(t6p1.class, nto1.a);
        waxVar.c(z5p1.class, rro1.a);
        waxVar.c(h0p1.class, yjo1.a);
        waxVar.c(t5p1.class, xro1.a);
        waxVar.c(k5p1.class, uro1.a);
        waxVar.c(w5p1.class, aso1.a);
        waxVar.c(i8p1.class, huo1.a);
        waxVar.c(x9p1.class, fwo1.a);
        waxVar.c(axo1.class, heo1.a);
        waxVar.c(wwo1.class, beo1.a);
        waxVar.c(uwo1.class, zdo1.a);
        waxVar.c(ywo1.class, feo1.a);
        waxVar.c(gxo1.class, neo1.a);
        waxVar.c(dxo1.class, keo1.a);
        waxVar.c(hxo1.class, qeo1.a);
        waxVar.c(vxo1.class, teo1.a);
        waxVar.c(wxo1.class, veo1.a);
        waxVar.c(yxo1.class, jfo1.a);
        waxVar.c(zxo1.class, mfo1.a);
        waxVar.c(a6o1.class, gdo1.a);
        waxVar.c(l6o1.class, mdo1.a);
        waxVar.c(f6o1.class, kdo1.a);
        waxVar.c(d0p1.class, sjo1.a);
        waxVar.c(kyo1.class, jgo1.a);
        waxVar.c(uyn1.class, w6o1.a);
        waxVar.c(ryn1.class, l7o1.a);
        waxVar.c(zyo1.class, pho1.a);
        waxVar.c(bzn1.class, o7o1.a);
        waxVar.c(xyn1.class, s7o1.a);
        waxVar.c(w0o1.class, e9o1.a);
        waxVar.c(q0o1.class, j9o1.a);
        waxVar.c(jzn1.class, u7o1.a);
        waxVar.c(ezn1.class, y7o1.a);
        waxVar.c(p2o1.class, dao1.a);
        waxVar.c(q1o1.class, hao1.a);
        waxVar.c(f3o1.class, vao1.a);
        waxVar.c(b3o1.class, zao1.a);
        waxVar.c(v5o1.class, ado1.a);
        waxVar.c(m5o1.class, ddo1.a);
        waxVar.c(n3o1.class, dbo1.a);
        waxVar.c(i3o1.class, vbo1.a);
        waxVar.c(y3o1.class, zbo1.a);
        waxVar.c(s3o1.class, eco1.a);
        waxVar.c(uap1.class, quo1.a);
        waxVar.c(fap1.class, ngo1.a);
        waxVar.c(oap1.class, mlo1.a);
        waxVar.c(lap1.class, jlo1.a);
        waxVar.c(hap1.class, cio1.a);
        waxVar.c(sap1.class, nuo1.a);
        waxVar.c(pap1.class, muo1.a);
        waxVar.c(xap1.class, ruo1.a);
        waxVar.c(jap1.class, jjo1.a);
        waxVar.c(cbp1.class, jwo1.a);
        waxVar.c(bbp1.class, lwo1.a);
        waxVar.c(yap1.class, hwo1.a);
        waxVar.c(p8p1.class, vuo1.a);
        waxVar.c(c0p1.class, mjo1.a);
        waxVar.c(i0p1.class, bko1.a);
        waxVar.c(rwo1.class, wdo1.a);
        waxVar.c(xzo1.class, tio1.a);
        waxVar.c(g0p1.class, vjo1.a);
        waxVar.c(azo1.class, uho1.a);
        waxVar.c(nyo1.class, ugo1.a);
        waxVar.c(qyo1.class, xgo1.a);
        waxVar.c(myo1.class, rgo1.a);
        waxVar.c(ryo1.class, aho1.a);
        waxVar.c(m1p1.class, glo1.a);
        waxVar.c(k1p1.class, clo1.a);
        waxVar.c(nyn1.class, q6o1.a);
        waxVar.c(s9p1.class, cwo1.a);
        waxVar.c(v9p1.class, ewo1.a);
        waxVar.c(t9p1.class, dwo1.a);
        waxVar.c(pwo1.class, pdo1.a);
        waxVar.c(eyo1.class, tfo1.a);
        waxVar.c(cyo1.class, rfo1.a);
        waxVar.c(byo1.class, ofo1.a);
        waxVar.c(q3p1.class, woo1.a);
        waxVar.c(w3p1.class, cpo1.a);
        waxVar.c(t3p1.class, zoo1.a);
        waxVar.c(l0o1.class, v8o1.a);
        waxVar.c(j0o1.class, z8o1.a);
        waxVar.c(c4p1.class, spo1.a);
        waxVar.c(h4p1.class, bqo1.a);
        waxVar.c(e4p1.class, vpo1.a);
        waxVar.c(f4p1.class, xpo1.a);
        waxVar.c(d1o1.class, m9o1.a);
        waxVar.c(z0o1.class, s9o1.a);
        waxVar.c(z8p1.class, lvo1.a);
        waxVar.c(x8p1.class, jvo1.a);
        waxVar.c(n9p1.class, xvo1.a);
        waxVar.c(p9p1.class, zvo1.a);
        waxVar.c(b5p1.class, cro1.a);
        waxVar.c(h5p1.class, mro1.a);
        waxVar.c(d5p1.class, fro1.a);
        waxVar.c(f5p1.class, jro1.a);
        waxVar.c(zzo1.class, bjo1.a);
        waxVar.c(y2o1.class, lao1.a);
        waxVar.c(u2o1.class, rao1.a);
        waxVar.c(yzo1.class, yio1.a);
        waxVar.c(dzo1.class, fio1.a);
        waxVar.c(k4p1.class, gqo1.a);
        waxVar.c(o4p1.class, nqo1.a);
        waxVar.c(l4p1.class, jqo1.a);
        waxVar.c(k1o1.class, w9o1.a);
        waxVar.c(i1o1.class, aao1.a);
        waxVar.c(o2p1.class, qno1.a);
        waxVar.c(r2p1.class, sno1.a);
        waxVar.c(t2p1.class, wno1.a);
        waxVar.c(xzn1.class, g8o1.a);
        waxVar.c(vzn1.class, k8o1.a);
        waxVar.c(i2p1.class, ino1.a);
        waxVar.c(j2p1.class, lno1.a);
        waxVar.c(l2p1.class, nno1.a);
        waxVar.c(rzn1.class, c8o1.a);
        waxVar.c(ozn1.class, e8o1.a);
        waxVar.c(u2p1.class, aoo1.a);
        waxVar.c(x2p1.class, coo1.a);
        waxVar.c(d3p1.class, goo1.a);
        waxVar.c(g3p1.class, joo1.a);
        waxVar.c(f0o1.class, m8o1.a);
        waxVar.c(b0o1.class, s8o1.a);
        waxVar.c(t8p1.class, xuo1.a);
        waxVar.c(s8p1.class, zuo1.a);
        waxVar.c(j0p1.class, fko1.a);
        waxVar.c(m0p1.class, lko1.a);
        waxVar.c(l0p1.class, jko1.a);
        waxVar.c(o0p1.class, oko1.a);
        waxVar.c(z6p1.class, qto1.a);
        waxVar.c(d7p1.class, rto1.a);
        waxVar.c(o4o1.class, oco1.a);
        waxVar.c(l4o1.class, rco1.a);
        waxVar.c(b9p1.class, nvo1.a);
        waxVar.c(p6p1.class, hto1.a);
        waxVar.c(r6p1.class, ito1.a);
        waxVar.c(h4o1.class, hco1.a);
        waxVar.c(d4o1.class, kco1.a);
        waxVar.c(w8p1.class, avo1.a);
        waxVar.c(g2p1.class, kmo1.a);
        waxVar.c(f2p1.class, gno1.a);
        waxVar.c(z1p1.class, xmo1.a);
        waxVar.c(x1p1.class, tmo1.a);
        waxVar.c(b2p1.class, ano1.a);
        waxVar.c(c2p1.class, cno1.a);
        waxVar.c(v1p1.class, rmo1.a);
        waxVar.c(r1p1.class, fmo1.a);
        waxVar.c(u1p1.class, pmo1.a);
        waxVar.c(s1p1.class, nmo1.a);
        waxVar.c(l3p1.class, qoo1.a);
        waxVar.c(vyo1.class, jho1.a);
        waxVar.c(i3p1.class, moo1.a);
        waxVar.c(n3p1.class, uoo1.a);
        waxVar.c(tyo1.class, hho1.a);
        waxVar.c(wyo1.class, lho1.a);
        waxVar.c(n8p1.class, uuo1.a);
        waxVar.c(f7p1.class, uto1.a);
        waxVar.c(g9p1.class, uvo1.a);
        waxVar.c(j7p1.class, zto1.a);
        waxVar.c(h7p1.class, vto1.a);
        waxVar.c(d9p1.class, pvo1.a);
        waxVar.c(y4o1.class, uco1.a);
        waxVar.c(r4o1.class, xco1.a);
        waxVar.c(e9p1.class, svo1.a);
        waxVar.c(syo1.class, dho1.a);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new fji1(str4, str3, xkg0Var, str2, str);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null) {
            strK = "";
        }
        return new hrn0(ewg1.class, new hwg1(strK), new b6w0(false));
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return u890.j(playerState.track(), playerState2.track()) && u890.j(playerState.prevTracks(), playerState2.prevTracks()) && u890.j(playerState.nextTracks(), playerState2.nextTracks()) && u890.j(playerState.restrictions(), playerState2.restrictions()) && o4p1.v(playerState) == o4p1.v(playerState2);
    }

    public /* synthetic */ bjx0(byte b2) {
        this.a = b2;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                Boolean bool = (Boolean) ((mmr0) obj).b;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 15:
                return ((PlayerState) obj).track().c();
            default:
                return voo1.p((th61) obj);
        }
    }
}
