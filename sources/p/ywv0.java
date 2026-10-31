package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.cosmos.util.proto.AlbumMetadata;
import com.spotify.cosmos.util.proto.TrackArtistMetadata;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.PlayCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywv0 implements xm51, Function {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public ywv0(t4h1 t4h1Var) {
        this.a = yv91.a(new q4h1(t4h1Var, (byte) 7));
        this.b = yv91.a(new x0e1(t4h1Var, this, (byte) 29));
        this.c = yv91.a(new q4h1(t4h1Var, (byte) 10));
        this.d = yv91.a(new q4h1(t4h1Var, (byte) 8));
        this.e = yv91.a(new q4h1(t4h1Var, (byte) 9));
        this.f = t4h1Var.l;
        this.g = t4h1Var.m;
        this.h = t4h1Var.n;
        this.i = t4h1Var.o;
    }

    public static final /* synthetic */ o241 a(ywv0 ywv0Var) {
        return (o241) ywv0Var.e;
    }

    public static boolean d(th61 th61Var) {
        return (!th61Var.b || th61Var.c || th61Var.d) ? false : true;
    }

    public static boolean e(th61 th61Var) {
        return (th61Var.b || th61Var.c || th61Var.d) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:170:0x050d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0580  */
    /* JADX WARN: Code duplicated, block: B:306:0x082a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0832  */
    /* JADX WARN: Code duplicated, block: B:313:0x0841  */
    /* JADX WARN: Code duplicated, block: B:316:0x084a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x084c  */
    /* JADX WARN: Code duplicated, block: B:318:0x084e  */
    /* JADX WARN: Code duplicated, block: B:371:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:416:0x0b46 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:417:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:467:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:517:0x0d3b  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) {
        char c;
        who0 who0Var;
        rsf1 rsf1Var;
        String link;
        ContextTrack contextTrackCreate;
        e3b e3bVar;
        Map map;
        boolean isInCollection;
        boolean isCurated;
        String str;
        lik1 lik1Var;
        String str2;
        vsf1 vsf1Var;
        me30 me30Var;
        e3b e3bVar2;
        blc0 blc0Var;
        kby kbyVar;
        ib3 ib3Var;
        mmr0 mmr0Var;
        jhm jhmVar;
        String str3;
        wsc0 wsc0Var;
        String str4;
        String str5;
        kby kbyVar2;
        who0 who0Var2;
        blc0 blc0Var2;
        String str6;
        lik1 lik1Var2;
        boolean z;
        Map map2;
        CollectionTrack collectionTrack;
        TrackArtistMetadata trackArtistMetadata;
        qrg1 qrg1Var;
        smc0 smc0VarK;
        boolean zG;
        int iB0;
        kby kbyVar3;
        ixa1 ixa1Var;
        qaa1 qaa1Var;
        jhm jhmVarS;
        List list;
        wsc0 wsc0Var2;
        kby kbyVar4;
        Map map3;
        kby kbyVar5;
        Map map4;
        ArrayList arrayListK;
        Object next;
        hhm hhmVar;
        rsf1 rsf1Var2;
        Object[] objArr = (Object[]) obj;
        spq0 spq0Var = (spq0) objArr[0];
        spq0 spq0Var2 = (spq0) objArr[1];
        kk3 kk3Var = (kk3) objArr[2];
        ksf1 ksf1Var = (ksf1) objArr[3];
        Map map5 = (Map) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        qrg1 qrg1Var2 = (qrg1) objArr[7];
        lsf1 lsf1Var = (lsf1) objArr[8];
        spq0 spq0Var3 = (spq0) objArr[9];
        boolean zBooleanValue3 = ((Boolean) objArr[10]).booleanValue();
        cw8 cw8Var = (cw8) objArr[11];
        boolean z2 = cw8Var.b;
        who0 who0VarA = (who0) ((spq0) objArr[12]).h();
        if (who0VarA != null) {
            wsc0 wsc0Var3 = (wsc0) spq0Var.h();
            kby kbyVar6 = wsc0Var3 != null ? wsc0Var3.f : null;
            if (kbyVar6 != null) {
                c = 1;
                who0VarA = who0.a(who0VarA, kbyVar6.j || kbyVar6.w.i);
            } else {
                c = 1;
            }
            who0Var = who0VarA;
        } else {
            c = 1;
            who0Var = null;
        }
        boolean zBooleanValue4 = ((Boolean) objArr[13]).booleanValue();
        v9p0 v9p0Var = (v9p0) objArr[14];
        i8n0 i8n0Var = (i8n0) objArr[15];
        List list2 = (List) objArr[16];
        if (((spq0) objArr[17]).h() != null) {
            bhn0.d();
            return null;
        }
        rsf1 rsf1Var3 = (rsf1) this.a;
        me30 me30Var2 = rsf1Var3.g;
        String str7 = (String) this.b;
        blc0 blc0Var3 = (blc0) this.c;
        CollectionTrack collectionTrack2 = (CollectionTrack) this.d;
        AlbumMetadata albumMetadataO = collectionTrack2.o().o();
        List list3 = (List) this.e;
        list3.getClass();
        TrackArtistMetadata trackArtistMetadata2 = (TrackArtistMetadata) this.f;
        trackArtistMetadata2.getClass();
        Map map6 = (Map) this.g;
        vsf1 vsf1Var2 = (vsf1) this.h;
        lik1 lik1Var3 = (lik1) this.i;
        boolean z3 = ksf1Var.c;
        boolean z4 = ksf1Var.d;
        boolean z5 = ksf1Var.e;
        boolean z6 = ksf1Var.f;
        boolean z7 = vsf1Var2.d1;
        boolean z8 = vsf1Var2.V0;
        boolean z9 = vsf1Var2.c1;
        boolean z10 = rsf1Var3.m;
        e3b e3bVar3 = rsf1Var3.c;
        eu4 eu4Var = rsf1Var3.r;
        upp0 upp0Var = rsf1Var3.z;
        tsf1 tsf1Var = rsf1Var3.j;
        ib3 ib3VarA = tsf1Var.a(collectionTrack2.s().getLink(), lik1Var3);
        e821 e821Var = (e821) ib3VarA.r;
        who0 who0Var3 = who0Var;
        lik1 lik1Var4 = (lik1) ib3VarA.I;
        String str8 = (String) ib3VarA.u;
        char c2 = blc0Var3 == blc0.Eh ? c : (char) 0;
        tsf1 tsf1Var2 = rsf1Var3.k;
        if (eu4Var.m() || (rsf1.i(map6) && z9)) {
            rsf1Var = rsf1Var3;
            if (map6 == null || (link = (String) map6.get("save_track.uri")) == null) {
                link = map6 != null ? (String) map6.get("audio_association") : null;
                if (link == null) {
                    link = collectionTrack2.s().getLink();
                }
            }
        } else {
            rsf1Var = rsf1Var3;
            link = collectionTrack2.s().getLink();
        }
        link.getClass();
        ib3 ib3VarA2 = tsf1Var2.a(link, lik1Var3);
        boolean z11 = vsf1Var2.l1;
        boolean z12 = vsf1Var2.h1;
        boolean z13 = vsf1Var2.k1;
        boolean z14 = vsf1Var2.Q0;
        boolean z15 = vsf1Var2.h;
        ugo0 ugo0Var = vsf1Var2.R0;
        g371 g371Var = vsf1Var2.W0;
        String str9 = vsf1Var2.Y;
        String str10 = vsf1Var2.b;
        if (z11) {
            ib3 ib3VarA3 = tsf1Var.a(rsf1.g(collectionTrack2), lik1Var3);
            smc0 smc0VarN = k4p1.n();
            List list4 = g371Var.a;
            if (!collectionTrack2.s().getIsLocal()) {
                if (!z8) {
                    str7 = null;
                }
                smc0VarN.add(((f971) ib3VarA3.a).a((String) ib3VarA3.u, list4, str7));
            }
            rsf1 rsf1Var4 = rsf1Var;
            rsf1Var4.a(smc0VarN, collectionTrack2, list3, ib3VarA3, trackArtistMetadata2, vsf1Var2, map6);
            rsf1Var2 = rsf1Var4;
            if (ugo0Var != null) {
                smc0VarN.add(ugo0Var.a ? ((kqi0) ib3VarA3.t).k(ugo0Var) : ((dxy) ib3VarA3.w).s(ugo0Var));
            }
            smc0VarK = k4p1.k(smc0VarN);
            trackArtistMetadata = trackArtistMetadata2;
        } else {
            vsf1 vsf1Var3 = vsf1Var2;
            rsf1 rsf1Var5 = rsf1Var;
            gjc1 gjc1Var = rsf1Var5.b0;
            m9d0[] m9d0VarArr = new m9d0[2];
            m9d0VarArr[0] = sc41.b;
            m9d0VarArr[c] = sc41.n;
            if (gjc1Var.a(m9d0VarArr) && collectionTrack2.s().getIsLocal()) {
                list2.isEmpty();
            }
            smc0 smc0VarN2 = k4p1.n();
            String strG = rsf1.g(collectionTrack2);
            if (map6 == null || (contextTrackCreate = ContextTrack.builder(strG).metadata(map6).build()) == null) {
                contextTrackCreate = ContextTrack.create(strG);
            }
            boolean zC = spq0Var3.c();
            hhm hhmVar2 = hhm.a;
            hhm hhmVar3 = hhm.b;
            if (!zC || l4o1.N(contextTrackCreate)) {
                vsf1Var3 = vsf1Var3;
                str7 = str7;
                hhmVar3 = hhmVar3;
                e3bVar = e3bVar3;
                map = map6;
            } else {
                map = map6;
                if (rsf1Var5.D.a(contextTrackCreate)) {
                    if (v9p0Var instanceof t9p0) {
                        t9p0 t9p0Var = (t9p0) v9p0Var;
                        String str11 = t9p0Var.a;
                        ArrayList arrayListN0 = o7h.N0(t9p0Var.b, Collections.singletonList(str11));
                        String str12 = t9p0Var.c;
                        if (str12 == null || arrayListN0.isEmpty()) {
                            e3bVar = e3bVar3;
                            str12 = null;
                        } else {
                            Iterator it = arrayListN0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Iterator it2 = it;
                                    e3bVar = e3bVar3;
                                    if (!nhc1.S((String) it.next(), str12, c)) {
                                        e3bVar3 = e3bVar;
                                        it = it2;
                                        c = 1;
                                    }
                                } else {
                                    e3bVar = e3bVar3;
                                    str12 = null;
                                }
                            }
                        }
                        arrayListK = cev0.K(str11, str12, upn1.s(), arrayListN0);
                    } else {
                        e3bVar = e3bVar3;
                        arrayListK = null;
                    }
                    o3e0 o3e0Var = rsf1Var5.V;
                    boolean zBooleanValue5 = ((Boolean) spq0Var3.b()).booleanValue();
                    Context context = (Context) o3e0Var.d;
                    String string = context.getString(2131957814);
                    if (arrayListK == null) {
                        string = f4i1.f(string, " • ", context.getString(zBooleanValue5 ? 2131957903 : 2131957902));
                    } else {
                        str7 = str7;
                        if (zBooleanValue5) {
                            Iterator it3 = arrayListK.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                Iterator it4 = it3;
                                if (((nbb0) next).c) {
                                    break;
                                }
                                it3 = it4;
                            }
                            nbb0 nbb0Var = (nbb0) next;
                            if (nbb0Var != null) {
                                String string2 = nbb0Var.d ? context.getString(2131957815) : nbb0Var.b;
                                string2.getClass();
                                string = string + " • " + string2;
                            }
                            String str13 = string;
                            etx etxVar = etx.c;
                            bhm bhmVar = new bhm(1);
                            if (zBooleanValue5) {
                                hhmVar = hhmVar3;
                            } else {
                                hhmVar = hhmVar2;
                            }
                            smc0VarN2.add(new jhm("npv_lyrics_toggle", etxVar, (fhm) null, (Integer) null, str13, false, (tm81) null, new ihm(bhmVar, hhmVar, new ghm(z1f0.Z, new cb8(arrayListK, zBooleanValue5, (byte) 14)), new c30(arrayListK, zBooleanValue5, o3e0Var, (byte) 21)), 236));
                        } else {
                            string = f4i1.f(string, " • ", context.getString(2131957902));
                        }
                    }
                    String str14 = string;
                    etx etxVar2 = etx.c;
                    bhm bhmVar2 = new bhm(1);
                    if (zBooleanValue5) {
                        hhmVar = hhmVar3;
                    } else {
                        hhmVar = hhmVar2;
                    }
                    smc0VarN2.add(new jhm("npv_lyrics_toggle", etxVar2, (fhm) null, (Integer) null, str14, false, (tm81) null, new ihm(bhmVar2, hhmVar, new ghm(z1f0.Z, new cb8(arrayListK, zBooleanValue5, (byte) 14)), new c30(arrayListK, zBooleanValue5, o3e0Var, (byte) 21)), 236));
                } else {
                    vsf1Var3 = vsf1Var3;
                    str7 = str7;
                    hhmVar3 = hhmVar3;
                    e3bVar = e3bVar3;
                }
            }
            zwg zwgVarA = rsf1Var5.f37p.a(lik1Var3);
            boolean z16 = (collectionTrack2.s().getIsLocal() && w6p1.v(collectionTrack2.s().getLink()) == null) ? false : true;
            f7h f7hVar = (f7h) o7h.p0(map5.values());
            String strG2 = rsf1.g(collectionTrack2);
            boolean z17 = rsf1.i(map) && z9;
            if (eu4Var.a() || z17) {
                boolean z18 = f7hVar.c;
                isInCollection = f7hVar.a;
                isCurated = z18;
            } else {
                isCurated = collectionTrack2.s().getIsCurated();
                isInCollection = collectionTrack2.r().getIsInCollection();
            }
            if (z16 && !isCurated) {
                jhm jhmVarL = zwgVarA.l(strG2, str7.length() == 0 ? lik1Var3.a : str7, kk3Var);
                if (jhmVarL != null) {
                    smc0VarN2.add(jhmVarL);
                }
            }
            if (z17) {
                smc0VarN2.add(((kr60) ib3VarA2.n).e((lik1) ib3VarA2.I, (String) ib3VarA2.u, strG2, true));
                str = str8;
            } else {
                str = str8;
                lik1Var = lik1Var4;
                smc0VarN2.add(((kr60) ib3VarA.n).e(lik1Var, str, str7.length() == 0 ? lik1Var3.a : str7, z16));
            }
            if (z15) {
                lik1Var = lik1Var4;
                str2 = str7;
                vsf1Var = vsf1Var3;
            } else {
                vsf1Var = vsf1Var3;
                str2 = str7;
                if (vsf1Var.P0 && rsf1Var5.j(str2) && isInCollection) {
                    k811 k811Var = (k811) zwgVarA.d;
                    smc0VarN2.add(new jhm("aligned_curation_remove_from_liked_songs", bpx.c, (fhm) null, 2131952228, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(i021.Y0, new nt01(strG2, k811Var, (byte) 16)), new v721(k811Var, strG2, (lik1) zwgVarA.a, (byte) 2)), 244));
                }
            }
            lik1Var = lik1Var4;
            lik1Var = lik1Var4;
            le30 le30Var = le30.g;
            if (z4) {
                blc0Var = blc0Var3;
                e3bVar2 = e3bVar;
                me30Var = me30Var2;
                ib3Var = ib3VarA;
            } else {
                if (rsf1.h(collectionTrack2)) {
                    blc0Var = blc0Var3;
                    e3bVar2 = e3bVar;
                    me30Var = me30Var2;
                } else {
                    if (vsf1Var.c) {
                        wsc0 wsc0Var4 = (wsc0) spq0Var.h();
                        me30Var = me30Var2;
                        if (me30Var.a((wsc0Var4 == null || (kbyVar = wsc0Var4.f) == null) ? null : kbyVar.p) == le30Var) {
                            e3bVar2 = e3bVar;
                            if (!e3bVar2.a.b()) {
                                blc0Var = blc0Var3;
                            }
                        } else {
                            e3bVar2 = e3bVar;
                        }
                        blc0Var = blc0Var3;
                        if (blc0Var != blc0.g1 && blc0Var != blc0.h1 && blc0Var != blc0.R3) {
                            if (!z14) {
                                if (rsf1.m(str2, blc0Var)) {
                                    if (!spq0Var.c() ? false : ((wsc0) spq0Var.b()).f.w.b) {
                                        if (rsf1.m(str2, blc0Var)) {
                                        }
                                    }
                                } else if ((rsf1.m(str2, blc0Var) || ((Boolean) spq0Var2.e(Boolean.FALSE)).booleanValue()) && (!rsf1Var5.j(str2) || collectionTrack2.r().getIsInCollection())) {
                                }
                            }
                        }
                    } else {
                        blc0Var = blc0Var3;
                        e3bVar2 = e3bVar;
                        me30Var = me30Var2;
                    }
                    ib3Var = ib3VarA;
                }
                ib3Var = ib3VarA;
                smc0VarN2.add(ib3Var.e(str2, vsf1Var.d, collectionTrack2.r().getIsBanned(), vsf1Var.t, zBooleanValue));
            }
            upp0Var.getClass();
            if (upp0.b(str2)) {
                smc0VarN2.add(new jhm("offline_remove_from_cache", bpx.c, (fhm) null, 2131959362, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(i021.W0, new q4z0(str, (byte) 25)), new nt01((k811) ib3Var.s, str, (byte) 15)), 244));
            }
            gid gidVar = rsf1Var5.t;
            String link2 = collectionTrack2.s().getLink();
            if (i8n0Var.equals(f8n0.a)) {
                jhmVar = null;
            } else {
                if (i8n0Var.equals(e8n0.a)) {
                    mmr0Var = new mmr0(Boolean.FALSE, hhmVar2);
                } else if (i8n0Var.equals(g8n0.a)) {
                    mmr0Var = new mmr0(Boolean.TRUE, hhmVar3);
                } else {
                    if (!i8n0Var.equals(h8n0.a)) {
                        eg.o();
                        return null;
                    }
                    mmr0Var = new mmr0(Boolean.TRUE, hhm.c);
                }
                boolean zBooleanValue6 = ((Boolean) mmr0Var.a).booleanValue();
                jhmVar = new jhm(zBooleanValue6 ? "music_video_remove_download" : "music_video_download", zBooleanValue6 ? umx.c : tmx.c, (fhm) null, Integer.valueOf(zBooleanValue6 ? 2131959048 : 2131959047), (String) null, false, (tm81) null, new ihm(gid.f, (hhm) mmr0Var.b, new ghm(k4n0.W0, new cl1(zBooleanValue6, link2, (byte) 23)), new gh1(gidVar, str2, zBooleanValue6, link2, (byte) 20)), 244);
            }
            if (jhmVar != null) {
                smc0VarN2.add(jhmVar);
            }
            if (vsf1Var.b1 && ((wj4) rsf1Var5.e.a.get()).a()) {
                in8 in8Var = (in8) ib3Var.m;
                String str15 = nik1.b2.a;
                smc0VarN2.add(new jhm("premium_destination_play_full_song", rtx.c, (fhm) null, 2131954416, (String) null, false, new tm81(1, 6, "premium_destination_play_full_song", (iu30) null, false), new ihm(new bhm(), new ghm(iet0.c1, new atp0(str15, (byte) 23)), new aft0(in8Var, str15, (byte) 4)), 116));
            }
            if (vsf1Var.f1 && rsf1Var5.K.a()) {
                smc0VarN2.add(rsf1Var5.H.d());
            }
            if (ugo0Var != null) {
                smc0VarN2.add(ugo0Var.a ? ((kqi0) ib3Var.t).k(ugo0Var) : ((dxy) ib3Var.w).s(ugo0Var));
            }
            p860 p860Var = vsf1Var.g1;
            if (p860Var != null) {
                smc0VarN2.add(rsf1Var5.I.h(p860Var));
            }
            wsc0 wsc0Var5 = (wsc0) spq0Var.h();
            if (u890.j((wsc0Var5 == null || (kbyVar5 = wsc0Var5.f) == null || (map4 = kbyVar5.q) == null) ? null : (String) map4.get("social_prompting_active"), LocalFilesProperties$TestHelper.TRUE)) {
                str3 = str10;
            } else if (z15) {
                if (str10 == null || ihc1.y0(str10)) {
                    hhg1.n("A row id is needed for showing the \"Remove from this playlist\" context menu.");
                    return null;
                }
                String str16 = str9 == null ? "" : str9;
                str3 = str10;
                smc0VarN2.add(e821Var.g(str16, str, str3, (xwp0) null));
            } else if (str3 == null || ihc1.y0(str3)) {
                str3 = str10;
                str3 = str10;
                str3 = str10;
                str3 = str10;
                if (e3bVar2.a.c()) {
                    wsc0Var = (wsc0) spq0Var.h();
                    if (wsc0Var != null || (kbyVar2 = wsc0Var.f) == null) {
                        str4 = null;
                    } else {
                        str4 = kbyVar2.p;
                    }
                    if (me30Var.a(str4) == le30Var) {
                        if (str9 == null) {
                            str5 = "";
                        } else {
                            str5 = str9;
                        }
                        smc0VarN2.add(new jhm("blend_remove_from_playlist", bpx.c, (fhm) null, 2131954424, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(i021.V0, new os(str, str5, (byte) 27)), new v721((vi11) ib3Var.x, str5, str, (byte) 0)), 244));
                    }
                }
            } else {
                if (!spq0Var.c() ? false : ((wsc0) spq0Var.b()).f.w.b) {
                    smc0VarN2.add(e821Var.g(str9 == null ? "" : str9, str, str3, (xwp0) null));
                } else {
                    str3 = str10;
                    str3 = str10;
                    str3 = str10;
                    str3 = str10;
                    if (e3bVar2.a.c()) {
                        wsc0Var = (wsc0) spq0Var.h();
                        if (wsc0Var != null) {
                            str4 = null;
                        } else {
                            str4 = null;
                        }
                        if (me30Var.a(str4) == le30Var) {
                            if (str9 == null) {
                                str5 = "";
                            } else {
                                str5 = str9;
                            }
                            smc0VarN2.add(new jhm("blend_remove_from_playlist", bpx.c, (fhm) null, 2131954424, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(i021.V0, new os(str, str5, (byte) 27)), new v721((vi11) ib3Var.x, str5, str, (byte) 0)), 244));
                        }
                    }
                }
            }
            if (rsf1.k(collectionTrack2) || upp0.b(str2)) {
                who0Var2 = who0Var3;
                blc0Var2 = blc0Var;
            } else if (!rsf1.m(str2, blc0Var2) || !rsf1Var5.S.a || str3 == null || ihc1.y0(str3) || !z13 || who0Var3 == null) {
                blc0Var2 = blc0Var;
                blc0Var2 = blc0Var;
                who0Var2 = who0Var3;
            } else {
                who0Var2 = who0Var3;
                smc0VarN2.addAll(rsf1Var5.U.h(str2, collectionTrack2.s().getLink(), str3, who0Var2));
            }
            boolean z19 = (who0Var2 == null || (who0Var2.b == null && who0Var2.c.isEmpty())) ? false : true;
            if (!rsf1.k(collectionTrack2) && !upp0.b(str2) && rsf1.m(str2, blc0Var2) && str3 != null && !ihc1.y0(str3) && z19 && zBooleanValue4 && z13) {
                smc0VarN2.add(new jhm("hide_contribution_notes_from_track", fux.c, (fhm) null, 2131954383, (String) null, false, (tm81) null, new ihm(new ygm(), new ghm(v160.X0, v160.Y0), new fz40(rsf1Var5.X, str2, (byte) 17)), 244));
            }
            if (z14) {
                String str17 = vsf1Var.a;
                kdy0 kdy0Var = (kdy0) ib3Var.v;
                fux fuxVar = fux.c;
                ygm ygmVar = new ygm(3);
                ghm ghmVar = new ghm(ma21.d, new os(str, str2, (byte) 29));
                String str18 = str2;
                lik1 lik1Var5 = lik1Var;
                tjf0 tjf0Var = new tjf0(kdy0Var, lik1Var5, str17, str, str18, (byte) 15);
                lik1Var2 = lik1Var5;
                str6 = str18;
                smc0VarN2.add(new jhm("smart_shuffle_remove_recommendation", fuxVar, (fhm) null, 2131954425, (String) null, false, (tm81) null, new ihm(ygmVar, ghmVar, tjf0Var), 244));
            } else {
                lik1Var2 = lik1Var;
            }
            if (z12) {
                str6 = str2;
                if (cw8Var.a) {
                    boolean z20 = cw8Var.c;
                    z = z2;
                    smc0VarN2.add(new jhm("npv_toggle_automix", ptx.c, (fhm) null, Integer.valueOf(z2 ? 2131958609 : 2131958610), (String) null, false, (tm81) null, new ihm(new ygm(), new ghm(zv8.e, new gy((byte) 8, z)), new ew8((ajq0) ib3Var.G, z, str6, z20, (byte) 0)), 244));
                } else {
                    str6 = str2;
                    z = z2;
                }
            } else {
                str6 = str2;
                z = z2;
            }
            if (z12 && z && rsf1Var5.P.T) {
                smc0VarN2.add(new jhm("npv_mix_track_order", kox.c, (fhm) null, 2131958608, (String) null, false, (tm81) null, new ihm(new ygm(), new ghm(ktj0.t, new nrj0((byte) 6)), ktj0.X), 244));
            }
            if (str3 != null && (wsc0Var2 = (wsc0) spq0Var.h()) != null && (kbyVar4 = wsc0Var2.f) != null && (map3 = kbyVar4.q) != null) {
                rsf1Var5.O.getClass();
                if (z6k0.a(map3)) {
                    smc0VarN2.add(new jhm("add_song_below", pjx.c, (fhm) null, 2131958611, (String) null, false, (tm81) null, new ihm(new ygm(), new ghm(uh1.X, uh1.Y), new d4((byte) 18, (yo31) ib3Var.H, new Uri.Builder().scheme("spotify").authority("internal").path("bridge-tracks-curation").appendQueryParameter("playlist", str6).appendQueryParameter("trackARowId", str3).build().toString())), 244));
                }
            }
            if (z10) {
                map2 = map;
                collectionTrack = collectionTrack2;
                rsf1.b(collectionTrack, map2, vsf1Var, new msf1(smc0VarN2, ib3Var, (byte) 0));
            } else {
                map2 = map;
                collectionTrack = collectionTrack2;
            }
            rsf1.b(collectionTrack, map2, vsf1Var, new msf1(smc0VarN2, ib3Var, (byte) 1));
            if (!z10 && (!vsf1Var.i || vsf1Var.f)) {
                smc0VarN2.add(((cab) ib3Var.j).n());
            }
            hll hllVar = lsf1Var.b;
            boolean z21 = lsf1Var.e;
            if (!upp0.b(str6) && vsf1Var.g && !rsf1.k(collectionTrack)) {
                if (rsf1.f(str6) && hllVar != null && (list = hllVar.d) != null) {
                    boolean zContains = list.contains(fll.c);
                    boolean zContains2 = list.contains(fll.b);
                    if (!zContains || zContains2) {
                        if (!z21) {
                            smc0VarN2.add(((t2) ib3Var.k).a(albumMetadataO.getLink(), albumMetadataO.getName(), false));
                        }
                    }
                } else if (!z21) {
                    smc0VarN2.add(((t2) ib3Var.k).a(albumMetadataO.getLink(), albumMetadataO.getName(), false));
                }
            }
            vsf1 vsf1Var4 = vsf1Var;
            Map map7 = map2;
            CollectionTrack collectionTrack3 = collectionTrack;
            ib3 ib3Var2 = ib3Var;
            rsf1Var5.a(smc0VarN2, collectionTrack3, list3, ib3Var2, trackArtistMetadata2, vsf1Var4, map7);
            rsf1 rsf1Var6 = rsf1Var5;
            collectionTrack2 = collectionTrack3;
            if (!rsf1.k(collectionTrack2) && list3.size() == 1 && trackArtistMetadata2.getLink().length() > 0 && (jhmVarS = rsf1Var6.J.s(trackArtistMetadata2.getLink())) != null) {
                smc0VarN2.add(jhmVarS);
            }
            if (!upp0.b(str6) && rsf1Var6.x.a && (qaa1Var = lsf1Var.a) != null && qaa1Var.a && blc0Var2 != blc0.Eh) {
                smc0VarN2.add(((mxr) ib3Var2.D).k(str));
            }
            List list5 = g371Var.a;
            if (!collectionTrack2.s().getIsLocal() && c2 == 0) {
                smc0VarN2.add(((f971) ib3Var2.a).a(str, list5, z8 ? str6 : null));
            }
            if (!rsf1Var6.M.b || !z6 || collectionTrack2.s().getIsLocal() || upp0.b(str6) || str9 == null || str9.length() == 0 || !rsf1.m(str6, blc0Var2)) {
                trackArtistMetadata = trackArtistMetadata2;
            } else {
                if ((!spq0Var.c() ? false : ((wsc0) spq0Var.b()).f.w.d) && ((ixa1Var = lsf1Var.c) == null || ixa1Var.a)) {
                    ro7 ro7Var = lsf1Var.d;
                    trackArtistMetadata = trackArtistMetadata2;
                    if ((ro7Var != null ? ro7Var.a : 0.0d) > 0.0d) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        smc0VarN2.add(new jhm("track_playback_speed_control", usx.c, (fhm) null, 2131954391, (String) null, false, (tm81) null, new ihm(new bhm(2), new ghm(uyf1.U0, uyf1.V0), new rsc1((ltf1) ib3Var2.F, str3, str9, (byte) 19)), 244));
                    }
                } else {
                    trackArtistMetadata = trackArtistMetadata2;
                }
            }
            if (collectionTrack2.s().getIsLocal() || upp0.b(str6)) {
                qrg1Var = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0d3b: MOVE (r8v35 'qrg1Var' p.qrg1) = (r34v0 p.qrg1) (LINE:3388) in method: p.ywv0.apply(java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 p.qrg1
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 3693
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.ywv0.apply(java.lang.Object):java.lang.Object");
            }

            public uoa b(String str, o2u0 o2u0Var) {
                uoa uoaVarA = woa.a((woa) this.a, str, o2u0Var, (w2k1) null, (kma) this.b, Collections.singletonList((cv7) this.d), false, (bas) null, new sn10(true), 708);
                uoaVarA.p(2);
                uoaVarA.t(false);
                uoaVarA.q(true);
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.e;
                if (videoSurfaceView != null) {
                    uoaVarA.d(videoSurfaceView);
                }
                return uoaVarA;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0062  */
            public Object c(String str, onm onmVar) {
                boolean z;
                l0l l0lVarC;
                l441 l441Var = new l441(aym.t(onmVar));
                pdj1 pdj1Var = new pdj1(l441Var, (byte) 0);
                pdj1 pdj1Var2 = new pdj1(l441Var, (byte) 1);
                pdj1 pdj1Var3 = new pdj1(l441Var, (byte) 2);
                if (!((x65) this.f).a() && (l0lVarC = ((g0l) ((z8c0) this.d).b).c()) != null && !l0lVarC.l() && !l0lVarC.x().contains("video/track")) {
                    Set setS0 = f46.S0(new blc0[]{blc0.Pg, blc0.ld});
                    Set set = s4b1.f;
                    z = setS0.contains(uic.x(str).c);
                }
                if (z) {
                    pdj1Var.invoke();
                } else {
                    if (z) {
                        eg.o();
                        return null;
                    }
                    ((Scheduler) this.i).c(new n9m(this, str, pdj1Var, pdj1Var2, pdj1Var3, (byte) 6));
                }
                return l441Var.a();
            }

            public void f(s29 s29Var, int i) {
                byte[] bArr;
                fog1 fog1Var;
                long j;
                gy8 gy8VarA;
                String str;
                gy8 gy8VarA2;
                qjb qjbVarA;
                String str2;
                Integer numValueOf;
                long j2;
                c21 c21Var;
                ywv0 ywv0Var = this;
                s29 s29Var2 = s29Var;
                byte[] bArr2 = s29Var2.b;
                c441 c441Var = (c441) ywv0Var.f;
                fog1 fog1VarA = ((ijj0) ywv0Var.b).a(s29Var2.a);
                long jMax = 0;
                gy8.b(0L);
                while (((Boolean) c441Var.g(new hyh1(ywv0Var, s29Var2, (byte) 0))).booleanValue()) {
                    Iterable iterable = (Iterable) c441Var.g(new hyh1(ywv0Var, s29Var2, (byte) 1));
                    if (!iterable.iterator().hasNext()) {
                        return;
                    }
                    if (fog1VarA == null) {
                        pdp1.i("Uploader", s29Var2, "Unknown backend for %s, deleting event batch for it...");
                        gy8VarA2 = gy8.a();
                        bArr = bArr2;
                        fog1Var = fog1VarA;
                        j = jMax;
                    } else {
                        ArrayList<s09> arrayList = new ArrayList();
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((r19) it.next()).c);
                        }
                        if (bArr2 != null) {
                            c441 c441Var2 = (c441) ywv0Var.i;
                            Objects.requireNonNull(c441Var2);
                            dkg dkgVar = (dkg) c441Var.g(new gyh1(c441Var2, (byte) 0));
                            em0 em0Var = new em0();
                            em0Var.Q0(new HashMap());
                            em0Var.e = Long.valueOf(((xqg) ywv0Var.g).b());
                            em0Var.f = Long.valueOf(((xqg) ywv0Var.h).b());
                            em0Var.b = "GDT_CLIENT_METRICS";
                            bbx bbxVar = new bbx("proto");
                            dkgVar.getClass();
                            yqu0 yqu0Var = nhy0.a;
                            yqu0Var.getClass();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                yqu0Var.e(dkgVar, byteArrayOutputStream);
                            } catch (IOException unused) {
                            }
                            em0Var.d = new rax(bbxVar, byteArrayOutputStream.toByteArray());
                            arrayList.add(((r9e) fog1VarA).a(em0Var.t()));
                        }
                        r9e r9eVar = (r9e) fog1VarA;
                        HashMap map = new HashMap();
                        for (s09 s09Var : arrayList) {
                            String str3 = s09Var.a;
                            if (map.containsKey(str3)) {
                                ((List) map.get(str3)).add(s09Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(s09Var);
                                map.put(str3, arrayList2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            s09 s09Var2 = (s09) ((List) entry.getValue()).get(0);
                            czy0 czy0Var = czy0.a;
                            long jB = r9eVar.f.b();
                            long jB2 = r9eVar.e.b();
                            oy8 oy8Var = new oy8(new dy8(Integer.valueOf(s09Var2.b("sdk-version")), s09Var2.a("model"), s09Var2.a("hardware"), s09Var2.a("device"), s09Var2.a("product"), s09Var2.a("os-uild"), s09Var2.a("manufacturer"), s09Var2.a("fingerprint"), s09Var2.a("locale"), s09Var2.a("country"), s09Var2.a("mcc_mnc"), s09Var2.a("application_build")));
                            try {
                                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                                str2 = null;
                            } catch (NumberFormatException unused2) {
                                str2 = (String) entry.getKey();
                                numValueOf = null;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (s09 s09Var3 : (List) entry.getValue()) {
                                byte[] bArr3 = bArr2;
                                rax raxVar = s09Var3.c;
                                fog1 fog1Var2 = fog1VarA;
                                byte[] bArr4 = s09Var3.j;
                                bbx bbxVar2 = raxVar.a;
                                byte[] bArr5 = raxVar.b;
                                if (bbxVar2.equals(new bbx("proto"))) {
                                    c21Var = new c21();
                                    c21Var.f = bArr5;
                                    j2 = jMax;
                                } else {
                                    j2 = jMax;
                                    if (bbxVar2.equals(new bbx("json"))) {
                                        String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                        c21 c21Var2 = new c21();
                                        c21Var2.g = str4;
                                        c21Var = c21Var2;
                                    } else if (Log.isLoggable(pdp1.m("CctTransportBackend"), 5)) {
                                        String.format("Received event of unsupported encoding %s. Skipping...", bbxVar2);
                                    }
                                    bArr2 = bArr3;
                                    fog1VarA = fog1Var2;
                                    jMax = j2;
                                }
                                c21Var.b = Long.valueOf(s09Var3.d);
                                c21Var.e = Long.valueOf(s09Var3.e);
                                String str5 = (String) s09Var3.f.get("tz-offset");
                                c21Var.h = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                                c21Var.i = new n19((c7o0) c7o0.c.get(s09Var3.b("net-type")), (b7o0) b7o0.a.get(s09Var3.b("mobile-subtype")));
                                Integer num = s09Var3.b;
                                if (num != null) {
                                    c21Var.c = num;
                                }
                                Integer num2 = s09Var3.g;
                                if (num2 != null) {
                                    w09 w09Var = new w09(new v09(num2));
                                    uyh uyhVar = uyh.a;
                                    c21Var.d = new ry8(w09Var);
                                }
                                byte[] bArr6 = s09Var3.i;
                                if (bArr6 != null || bArr4 != null) {
                                    if (bArr6 == null) {
                                        bArr6 = null;
                                    }
                                    c21Var.t = new u09(bArr6, bArr4 != null ? bArr4 : null);
                                }
                                String strConcat = ((Long) c21Var.b) == null ? " eventTimeMs" : "";
                                if (((Long) c21Var.e) == null) {
                                    strConcat = strConcat.concat(" eventUptimeMs");
                                }
                                if (((Long) c21Var.h) == null) {
                                    strConcat = strConcat.concat(" timezoneOffsetSeconds");
                                }
                                if (!strConcat.isEmpty()) {
                                    eg.m("Missing required properties:".concat(strConcat));
                                    return;
                                }
                                arrayList4.add(new j19(((Long) c21Var.b).longValue(), (Integer) c21Var.c, (ry8) c21Var.d, ((Long) c21Var.e).longValue(), (byte[]) c21Var.f, (String) c21Var.g, ((Long) c21Var.h).longValue(), (n19) c21Var.i, (u09) c21Var.t));
                                bArr2 = bArr3;
                                fog1VarA = fog1Var2;
                                jMax = j2;
                            }
                            arrayList3.add(new k19(jB, jB2, oy8Var, numValueOf, str2, arrayList4));
                            bArr2 = bArr2;
                        }
                        bArr = bArr2;
                        fog1Var = fog1VarA;
                        j = jMax;
                        hy8 hy8Var = new hy8(arrayList3);
                        URL urlB = r9eVar.d;
                        if (bArr != null) {
                            try {
                                xhc xhcVarA = xhc.a(bArr);
                                str = xhcVarA.b;
                                if (str == null) {
                                    str = null;
                                }
                                String str6 = xhcVarA.a;
                                if (str6 != null) {
                                    urlB = r9e.b(str6);
                                }
                            } catch (IllegalArgumentException unused3) {
                                gy8VarA = gy8.a();
                            }
                        } else {
                            str = null;
                        }
                        try {
                            cab cabVar = new cab(urlB, hy8Var, str, (byte) 28);
                            lpd lpdVar = new lpd(r9eVar, (byte) 4);
                            int i2 = 5;
                            do {
                                qjbVarA = lpdVar.a(cabVar);
                                URL url = (URL) qjbVarA.c;
                                if (url != null) {
                                    pdp1.i("CctTransportBackend", url, "Following redirect to: %s");
                                    cabVar = new cab(url, (hy8) cabVar.c, (String) cabVar.d, (byte) 28);
                                } else {
                                    cabVar = null;
                                }
                                if (cabVar == null) {
                                    break;
                                } else {
                                    i2--;
                                }
                            } while (i2 >= 1);
                            int i3 = qjbVarA.a;
                            if (i3 == 200) {
                                gy8VarA = gy8.b(qjbVarA.b);
                            } else if (i3 >= 500 || i3 == 404) {
                                gy8VarA = gy8.c();
                            } else {
                                gy8VarA = i3 == 400 ? new gy8(4, -1L) : gy8.a();
                            }
                        } catch (IOException unused4) {
                            pdp1.k("CctTransportBackend");
                            gy8VarA = gy8.c();
                        }
                        gy8VarA2 = gy8VarA;
                    }
                    int i4 = gy8VarA2.a;
                    if (i4 == 2) {
                        c441Var.g(new r5t(this, iterable, s29Var, j));
                        ((haa0) this.d).s(s29Var, i + 1, true);
                        return;
                    }
                    ywv0Var = this;
                    s29Var2 = s29Var;
                    jMax = j;
                    c441Var.g(new h341(ywv0Var, iterable, (byte) 17));
                    if (i4 == 1) {
                        jMax = Math.max(jMax, gy8VarA2.b);
                        if (bArr != null) {
                            c441Var.g(new iyh1(ywv0Var, (byte) 0));
                        }
                    } else if (i4 == 4) {
                        HashMap map2 = new HashMap();
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            String str7 = ((r19) it2.next()).c.a;
                            if (map2.containsKey(str7)) {
                                map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                            } else {
                                map2.put(str7, 1);
                            }
                        }
                        c441Var.g(new h341(ywv0Var, map2, (byte) 18));
                    }
                    bArr2 = bArr;
                    fog1VarA = fog1Var;
                }
                c441Var.g(new uhn(ywv0Var, jMax, s29Var2));
            }

            public void g(String str, tv80 tv80Var) {
                lzn0 lzn0Var = (lzn0) this.e;
                if (!lzn0Var.j((Activity) this.a)) {
                    a1r0.m((a1r0) this.f, str, tv80Var, (Bundle) null, 12);
                } else if (tv80Var != null) {
                    lzn0Var.a(str, tv80Var, (Bundle) null);
                } else {
                    lzn0Var.h(str);
                }
            }

            public Disposable h(PlayCommand playCommand, String str, ou80 ou80Var) {
                Single singleFlatMap;
                Single singleObserveOn;
                Single singleDoOnSuccess;
                Single singleDoOnError;
                Maybe maybeOnErrorComplete;
                Disposable disposableSubscribe;
                muz muzVar = (muz) this.h;
                return (muzVar == null || (singleFlatMap = muzVar.a(playCommand).flatMap(new ilh1(this, str, (byte) 8))) == null || (singleObserveOn = singleFlatMap.observeOn((Scheduler) this.i)) == null || (singleDoOnSuccess = singleObserveOn.doOnSuccess(new qdj1(this, ou80Var, (byte) 0))) == null || (singleDoOnError = singleDoOnSuccess.doOnError(new rdj1(this, (byte) 0))) == null || (maybeOnErrorComplete = singleDoOnError.onErrorComplete()) == null || (disposableSubscribe = maybeOnErrorComplete.subscribe()) == null) ? Disposable.e(Functions.b) : disposableSubscribe;
            }

            public void i(long j) {
                z6x z6xVar;
                jn51 jn51Var = (jn51) this.f;
                if (jn51Var != null) {
                    mmr0 mmr0VarR = qgo1.r((LinkedHashMap) this.i, j, jn51Var);
                    if (mmr0VarR == null) {
                        z6xVar = z6x.a;
                    } else {
                        List listA1 = o7h.a1(p7h.K(jn51Var.i), new s25(((Number) mmr0VarR.a).intValue(), (byte) 1));
                        ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
                        Iterator it = listA1.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((Number) it.next()).intValue() / (jn51Var.f * jn51Var.g)));
                        }
                        List listJ0 = o7h.j0(arrayList);
                        z6x arrayList2 = new ArrayList(q7h.U(listJ0, 10));
                        Iterator it2 = listJ0.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(qgo1.s((nn51) this.a, jn51Var, ((Number) it2.next()).intValue()));
                        }
                        z6xVar = arrayList2;
                    }
                    this.h = z6xVar;
                    xab1 xab1Var = (xab1) this.g;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    this.g = fn31.T((llm) this.c, (o8n) null, 0, new b751(this, (lnm) null, (byte) 2), 3);
                }
                ((bpb1) this.d).m((Object) null, Boolean.TRUE);
            }

            public void j(t45 t45Var) {
                oot0 oot0Var;
                if (t45Var != null) {
                    t45.m(t45Var, "resume", 4);
                }
                yqg yqgVar = ((fpa) this.c).a;
                y2g1 y2g1Var = new y2g1(yqgVar);
                y2g1Var.a = yqgVar.b();
                if (t45Var != null) {
                    t45.m(t45Var, "resume_betamax_acquire_player", 4);
                }
                uoa uoaVarB = b((String) this.i, (o2u0) this.g);
                if (t45Var != null) {
                    t45Var.g("resume_betamax_acquire_player");
                }
                uoaVarB.s(y2g1Var);
                if (uoaVarB != ((uoa) this.f)) {
                    this.f = uoaVarB;
                    if (t45Var != null) {
                        t45.m(t45Var, "resume_betamax_play_with_options", 4);
                    }
                    o2u0 o2u0Var = (o2u0) this.g;
                    if (o2u0Var != null && (oot0Var = (oot0) this.h) != null) {
                        uoaVarB.h(o2u0Var, oot0.a(oot0Var));
                    }
                    if (t45Var != null) {
                        t45Var.g("resume_betamax_play_with_options");
                    }
                } else {
                    if (t45Var != null) {
                        t45.m(t45Var, "betamax_resume", 4);
                    }
                    uoa uoaVar = (uoa) this.f;
                    if (uoaVar != null) {
                        uoaVar.l();
                    }
                    if (t45Var != null) {
                        t45Var.g("betamax_resume");
                    }
                }
                if (t45Var != null) {
                    t45Var.g("resume");
                }
            }

            public void k() {
                int i = df81.f2;
                df81 df81Var = new df81();
                df81Var.T0(mno1.h(new mmr0[]{new mmr0("premium_upsell_variant", zwv0.a)}));
                df81Var.g1((th30) this.c, (String) null);
            }

            public Completable l(tv80 tv80Var) {
                return yoi1.i(((am30) this.h).a(), o6x.a).firstOrError().onErrorReturn(d710.e1).flatMapCompletable(new xmu0(this, tv80Var, (byte) 10));
            }

            public void m(int i, int i2) {
                jn51 jn51VarA = ((cn51) this.b).a((nn51) this.a, new Size(i, i2));
                if (jn51VarA == null || u890.j((jn51) this.f, jn51VarA)) {
                    return;
                }
                o();
                n(i, i2);
            }

            public void n(int i, int i2) {
                nn51 nn51Var = (nn51) this.a;
                if (((wm51) this.e) == null) {
                    return;
                }
                jn51 jn51VarA = ((cn51) this.b).a(nn51Var, new Size(i, i2));
                if (jn51VarA == null && (jn51VarA = (jn51) o7h.C0(nn51Var.c)) == null) {
                    return;
                }
                this.f = jn51VarA;
            }

            public void o() {
                xab1 xab1Var = (xab1) this.g;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
            }

            public void p(s29 s29Var, int i, Runnable runnable) {
                ((Executor) this.e).execute(new q1i0(this, s29Var, i, runnable, (byte) 2));
            }

            public ywv0(woa woaVar, kma kmaVar, fpa fpaVar, cv7 cv7Var) {
                this.a = woaVar;
                this.b = kmaVar;
                this.c = fpaVar;
                this.d = cv7Var;
                this.i = "";
            }

            public ywv0(nn51 nn51Var, cn51 cn51Var, q8n q8nVar, qha qhaVar) {
                cfd ic9Var;
                this.a = nn51Var;
                this.b = cn51Var;
                this.c = us71.h(q8nVar);
                bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
                this.d = bpb1VarB;
                if (qhaVar != null) {
                    switch (qhaVar.a) {
                        case 0:
                            ic9Var = new ic9(qhaVar.b, bpb1VarB, (byte) 9);
                            break;
                        default:
                            ic9Var = new cfd(qhaVar.b, bpb1VarB, (byte) 29);
                            break;
                    }
                } else {
                    ic9Var = null;
                }
                this.e = ic9Var;
                this.h = z6x.a;
                this.i = qgo1.o(nn51Var);
            }

            public ywv0(lb61 lb61Var, Flowable flowable, g5t g5tVar, caq caqVar, o241 o241Var) {
                this.a = lb61Var;
                this.b = flowable;
                this.c = g5tVar;
                this.d = caqVar;
                this.e = o241Var;
                this.f = new kdn0(il8.a);
                this.g = new rku();
                this.h = new idd1(new l5v0(this, (byte) 15));
                this.i = new idd1(new l451(this, (byte) 15));
            }

            public ywv0(kt91 kt91Var, Resources resources, e7p0 e7p0Var, z8c0 z8c0Var, Scheduler scheduler, i5q i5qVar, x65 x65Var, Flowable flowable, muz muzVar) {
                this.a = kt91Var;
                this.b = resources;
                this.c = e7p0Var;
                this.d = z8c0Var;
                this.i = scheduler;
                this.e = i5qVar;
                this.f = x65Var;
                this.g = flowable;
                this.h = muzVar;
            }

            public ywv0(lzn0 lzn0Var, b7r0 b7r0Var, gbp gbpVar, Observable observable, pe peVar, ywv0 ywv0Var, ytp0 ytp0Var, iac0 iac0Var) {
                this.e = lzn0Var;
                this.a = b7r0Var;
                this.b = gbpVar;
                this.c = observable;
                this.d = peVar;
                this.f = ywv0Var;
                this.g = ytp0Var;
                this.h = iac0Var;
                this.i = new vku();
                iac0Var.getLifecycle().a(new i5h1(this, (byte) 2));
            }

            public ywv0(Flowable flowable, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, gw70 gw70Var, Context context, xs80 xs80Var, i8h1 i8h1Var, luk lukVar) {
                this.a = flowable;
                this.i = scheduler;
                this.b = scheduler2;
                this.c = scheduler3;
                this.d = gw70Var;
                this.e = context;
                this.f = xs80Var;
                this.g = i8h1Var;
                this.h = lukVar;
            }

            public /* synthetic */ ywv0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
                this.d = obj4;
                this.e = obj5;
                this.f = obj6;
                this.g = obj7;
                this.h = obj8;
                this.i = obj9;
            }
        }
