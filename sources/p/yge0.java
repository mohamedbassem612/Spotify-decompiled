package p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import com.spotify.base.java.logging.Logger;
import com.spotify.lockstate.lockedscreen.data.LockStateResolutionException;
import com.spotify.lockstate.v1.proto.GetLockRequest;
import com.spotify.lockstate.v1.proto.GetLockResponse;
import com.spotify.marquee.marquee.events.proto.MarqueeOptOutEvent;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yge0 implements Function, dkz, l6u0, juh0, FlowableOnSubscribe, ix30, l381 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public yge0(uiq uiqVar, w7w w7wVar, v0g0 v0g0Var, Context context, boolean z) {
        lzh lzhVar;
        this.a = (byte) 10;
        this.b = w7wVar;
        boolean zEquals = v0g0Var.equals(s0g0.b);
        aqr0 aqr0Var = aqr0.a;
        if (zEquals) {
            teq teqVar = uiqVar.a.c;
            lzhVar = new lzh(new xzf0(new rl1((dg30) teqVar.f.a, teqVar.b.G, context, z, (byte) 21), (byte) 0), aqr0Var);
        } else {
            lzhVar = new lzh(new xzf0(this, (byte) 1), aqr0Var);
        }
        this.c = lzhVar;
    }

    public void a() {
        yjg0 yjg0Var = (yjg0) ((qkg0) this.b).a.d.a;
        Consumer consumer = (Consumer) ((s59) this.c).b;
        if (consumer != null) {
            consumer.accept(yjg0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:174:0x03e1 A[PHI: r37
      0x03e1: PHI (r37v2 p.rjj0) = (r37v1 p.rjj0), (r37v4 p.rjj0), (r37v5 p.rjj0), (r37v6 p.rjj0) binds: [B:195:0x0494, B:182:0x0430, B:176:0x03ec, B:173:0x03df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:268:0x0646  */
    /* JADX WARN: Code duplicated, block: B:316:0x0649 A[SYNTHETIC] */
    public Object apply(Object obj) {
        Single singleE;
        String strP;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        LinkedHashMap linkedHashMap7;
        LinkedHashMap linkedHashMap8;
        rjj0 rjj0Var;
        char c;
        oh90 bh90Var;
        ArrayList arrayList;
        boolean z;
        oh90 ch90Var;
        boolean z2;
        mq70 mq70Var;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                ihf0 ihf0Var = (ihf0) obj;
                lnf0 lnf0Var = (lnf0) obj2;
                String str = ihf0Var.c;
                ContextTrack contextTrack = ihf0Var.a;
                if (!((bhf0) obj3).a(contextTrack)) {
                    return Observable.just(new pif0(spf0.a));
                }
                Single singleD = lnf0Var.d(contextTrack.uri(), ihf0Var.b, dhf0.FULLSCREEN, str);
                if (str != null) {
                    singleD = singleD.onErrorResumeNext(new fad0(lnf0Var, ihf0Var, (byte) 15));
                    singleD.getClass();
                }
                return singleD.map(va20.Y).toObservable().onErrorReturn(kc20.Z);
            case 7:
                o3e0 o3e0Var = ((lnf0) obj3).e;
                Single singleDefer = Single.defer(new omf0(o3e0Var, (String) obj2, (byte) 0));
                Scheduler scheduler = (Scheduler) o3e0Var.d;
                return singleDefer.subscribeOn(scheduler).flatMap(new eb80(o3e0Var, (byte) 21)).observeOn(scheduler);
            case 8:
                String str2 = (String) obj;
                fdc fdcVar = (fdc) obj3;
                ContextTrack contextTrack2 = (ContextTrack) obj2;
                return yoi1.i(((zwz0) fdcVar.f).c(), o6xVar).firstOrError().flatMap(new o3e0(fdcVar, contextTrack2, str2, (byte) 11)).map(new n740(contextTrack2, str2, (byte) 1));
            case 9:
                q461 q461Var = (q461) obj;
                wwf0 wwf0Var = (wwf0) obj3;
                String str3 = q461Var.c;
                wwf0Var.c.a(new wp80(2, 8, Collections.singletonMap("is_email_input", String.valueOf(ihc1.h0(str3, "@", false)))));
                nxf0 nxf0Var = (nxf0) obj2;
                return ((ao) wwf0Var.b.createWebgateService(ao.class, "android-libs-magiclink")).b(new owf0(str3, wwf0Var.d.b)).map(new fad0(nxf0Var, q461Var, (byte) 16)).onErrorReturn(new jpa0(nxf0Var, (byte) 15));
            case 17:
                g710 g710VarC = ((x610) ((s24) obj3).b).c();
                m210 m210Var = (m210) obj2;
                PlayOrigin playOrigin = uxh0.a;
                z610 z610Var = new z610((String) obj, (com.spotify.player.model.Context) null, (Map) null, (PreparePlayOptions) null, playOrigin, (LoggingParams) null, 46);
                g710 g710Var = g710VarC;
                if (m210Var == null || (strP = g710Var.e.a(m210Var).p()) == null) {
                    singleE = g710Var.e(z610Var);
                } else {
                    PlayOrigin playOriginBuild = playOrigin.toBuilder().restrictionIdentifier(strP).build();
                    playOriginBuild.getClass();
                    singleE = g710Var.e(z610.b(z610Var, playOriginBuild));
                }
                return singleE.ignoreElement();
            case 23:
                Single singleB = sdj0.b((Set) obj3, (kcs) obj2, ((pdj0) obj).c);
                return singleB != null ? singleB.toObservable().concatMap(ak20.Y) : Observable.empty();
            case 24:
                rjj0 rjj0Var2 = (rjj0) obj;
                Map map = rjj0Var2.b;
                Map map2 = rjj0Var2.d.a;
                List list = (List) map2.get(va81.class);
                LinkedHashMap linkedHashMap9 = b7x.a;
                if (list != null) {
                    List<vu00> list2 = list;
                    int iS = zno1.s(q7h.U(list2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iS);
                    for (vu00 vu00Var : list2) {
                        String str4 = vu00Var.a;
                        va81 va81Var = vu00Var.b;
                        if (va81Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.showv4.ShowV4");
                            return null;
                        }
                        linkedHashMap.put(str4, va81Var);
                    }
                } else {
                    linkedHashMap = linkedHashMap9;
                }
                List list3 = (List) map2.get(gh3.class);
                if (list3 != null) {
                    List<vu00> list4 = list3;
                    int iS2 = zno1.s(q7h.U(list4, 10));
                    if (iS2 < 16) {
                        iS2 = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(iS2);
                    for (vu00 vu00Var2 : list4) {
                        String str5 = vu00Var2.a;
                        gh3 gh3Var = vu00Var2.b;
                        if (gh3Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.albumv4.AlbumV4");
                            return null;
                        }
                        linkedHashMap2.put(str5, gh3Var);
                    }
                } else {
                    linkedHashMap2 = linkedHashMap9;
                }
                List list5 = (List) map2.get(z1g1.class);
                if (list5 != null) {
                    List<vu00> list6 = list5;
                    int iS3 = zno1.s(q7h.U(list6, 10));
                    if (iS3 < 16) {
                        iS3 = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(iS3);
                    for (vu00 vu00Var3 : list6) {
                        String str6 = vu00Var3.a;
                        z1g1 z1g1Var = vu00Var3.b;
                        if (z1g1Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.trackv4.TrackV4");
                            return null;
                        }
                        linkedHashMap3.put(str6, z1g1Var);
                    }
                } else {
                    linkedHashMap3 = linkedHashMap9;
                }
                List list7 = (List) map2.get(vy6.class);
                if (list7 != null) {
                    List<vu00> list8 = list7;
                    int iS4 = zno1.s(q7h.U(list8, 10));
                    if (iS4 < 16) {
                        iS4 = 16;
                    }
                    linkedHashMap4 = new LinkedHashMap(iS4);
                    for (vu00 vu00Var4 : list8) {
                        String str7 = vu00Var4.a;
                        vy6 vy6Var = vu00Var4.b;
                        if (vy6Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.artistv4.ArtistV4");
                            return null;
                        }
                        linkedHashMap4.put(str7, vy6Var);
                    }
                } else {
                    linkedHashMap4 = linkedHashMap9;
                }
                List list9 = (List) map2.get(mdz.class);
                if (list9 != null) {
                    List<vu00> list10 = list9;
                    int iS5 = zno1.s(q7h.U(list10, 10));
                    if (iS5 < 16) {
                        iS5 = 16;
                    }
                    linkedHashMap5 = new LinkedHashMap(iS5);
                    for (vu00 vu00Var5 : list10) {
                        String str8 = vu00Var5.a;
                        mdz mdzVar = vu00Var5.b;
                        if (mdzVar == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.episodev4.EpisodeV4");
                            return null;
                        }
                        linkedHashMap5.put(str8, mdzVar);
                    }
                } else {
                    linkedHashMap5 = linkedHashMap9;
                }
                List list11 = (List) map2.get(jo70.class);
                if (list11 != null) {
                    List<vu00> list12 = list11;
                    int iS6 = zno1.s(q7h.U(list12, 10));
                    if (iS6 < 16) {
                        iS6 = 16;
                    }
                    linkedHashMap6 = new LinkedHashMap(iS6);
                    for (vu00 vu00Var6 : list12) {
                        String str9 = vu00Var6.a;
                        jo70 jo70Var = vu00Var6.b;
                        if (jo70Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                            return null;
                        }
                        linkedHashMap6.put(str9, jo70Var);
                    }
                } else {
                    linkedHashMap6 = linkedHashMap9;
                }
                List list13 = (List) map2.get(xkk1.class);
                if (list13 != null) {
                    List<vu00> list14 = list13;
                    int iS7 = zno1.s(q7h.U(list14, 10));
                    if (iS7 < 16) {
                        iS7 = 16;
                    }
                    linkedHashMap9 = new LinkedHashMap(iS7);
                    for (vu00 vu00Var7 : list14) {
                        String str10 = vu00Var7.a;
                        xkk1 xkk1Var = vu00Var7.b;
                        if (xkk1Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                            return null;
                        }
                        linkedHashMap9.put(str10, xkk1Var);
                    }
                }
                r7j0 r7j0Var = new r7j0(rjj0Var2, (byte) 3);
                sjj0 sjj0Var = (sjj0) obj2;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((List) obj3).iterator();
                while (it.hasNext()) {
                    String str11 = (String) it.next();
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(str11);
                    v5b1 v5b1Var = s4b1VarX.d;
                    Iterator it2 = it;
                    if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                        jo70 jo70Var2 = (jo70) linkedHashMap6.get(str11);
                        String str12 = jo70Var2 != null ? jo70Var2.a : null;
                        if (str12 == null) {
                            str12 = "";
                        }
                        linkedHashMap7 = linkedHashMap6;
                        xkk1 xkk1Var2 = (xkk1) linkedHashMap9.get(str11);
                        if (xkk1Var2 == null || (mq70Var = xkk1Var2.a) == null) {
                            linkedHashMap8 = linkedHashMap9;
                        } else {
                            linkedHashMap8 = linkedHashMap9;
                            up70 up70VarA = mq70Var.a(vp70.c);
                            String str13 = up70VarA != null ? up70VarA.a.a : null;
                            bh90Var = new oh90(str11, str12, str13 != null ? str13 : "");
                            rjj0Var = rjj0Var2;
                        }
                        bh90Var = new oh90(str11, str12, str13 != null ? str13 : "");
                        rjj0Var = rjj0Var2;
                    } else {
                        linkedHashMap7 = linkedHashMap6;
                        linkedHashMap8 = linkedHashMap9;
                        int iOrdinal = s4b1VarX.c.ordinal();
                        if (iOrdinal != 30) {
                            ArrayList arrayList3 = z6x.a;
                            if (iOrdinal == 44) {
                                rjj0Var = rjj0Var2;
                                vy6 vy6Var2 = (vy6) linkedHashMap4.get(str11);
                                if (vy6Var2 != null) {
                                    String str14 = vy6Var2.b;
                                    String str15 = vy6Var2.c.a;
                                    Boolean bool = (Boolean) map.get(str11);
                                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                    ArrayList arrayList4 = vy6Var2.d;
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        String str16 = (String) o7h.C0(((ty6) it3.next()).a);
                                        if (str16 != null) {
                                            arrayList5.add(str16);
                                        }
                                    }
                                    ArrayList arrayList6 = vy6Var2.e;
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it4 = arrayList6.iterator();
                                    while (it4.hasNext()) {
                                        String str17 = str14;
                                        String str18 = (String) o7h.C0(((ty6) it4.next()).a);
                                        if (str18 != null) {
                                            arrayList7.add(str18);
                                        }
                                        str14 = str17;
                                    }
                                    String str19 = str14;
                                    ArrayList arrayList8 = vy6Var2.f;
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it5 = arrayList8.iterator();
                                    while (it5.hasNext()) {
                                        Iterator it6 = it5;
                                        String str20 = (String) o7h.C0(((ty6) it5.next()).a);
                                        if (str20 != null) {
                                            arrayList9.add(str20);
                                        }
                                        it5 = it6;
                                    }
                                    uy6 uy6Var = (uy6) o7h.s0(vy6Var2.g);
                                    ch90Var = new ch90(str11, str19, str15, zBooleanValue, arrayList5, arrayList7, uy6Var != null ? uy6Var.b : arrayList3, arrayList9);
                                    bh90Var = ch90Var;
                                } else {
                                    bh90Var = null;
                                }
                            } else if (iOrdinal == 844) {
                                rjj0Var = rjj0Var2;
                                mdz mdzVar2 = (mdz) linkedHashMap5.get(str11);
                                if (mdzVar2 != null) {
                                    String str21 = mdzVar2.c;
                                    kdz kdzVar = mdzVar2.d;
                                    String str22 = kdzVar != null ? kdzVar.a : null;
                                    String str23 = str22 == null ? "" : str22;
                                    boolean z3 = mdzVar2.i;
                                    String str24 = mdzVar2.e.a;
                                    boolean zX = qqn1.X(mdzVar2);
                                    String str25 = mdzVar2.m;
                                    long j = mdzVar2.n / 1000;
                                    gdz gdzVar = (gdz) o7h.s0(mdzVar2.h);
                                    ch90Var = new jh90(str11, str21, str24, str23, (String) r7j0Var.invoke(gdzVar != null ? gdzVar.a : ""), str25, z3, zX, j, mdzVar2.o.a(sjj0Var.a.d()).getTime() / 1000);
                                    bh90Var = ch90Var;
                                } else {
                                    bh90Var = null;
                                }
                            } else if (iOrdinal == 860) {
                                rjj0Var = rjj0Var2;
                                va81 va81Var2 = (va81) linkedHashMap.get(str11);
                                if (va81Var2 != null) {
                                    String str26 = va81Var2.c;
                                    den denVar = va81Var2.g;
                                    boolean z4 = va81Var2.i;
                                    String str27 = va81Var2.b;
                                    if (z4) {
                                        ch90Var = new eh90(str11, str27, denVar.a, "", 0.0f, "", va81Var2.d, va81Var2.h, (String) null, str26, 0L, arrayList3, 0L);
                                        bh90Var = ch90Var;
                                    } else {
                                        bh90Var = new vh90(str11, str27, denVar.a, str26);
                                    }
                                } else {
                                    bh90Var = null;
                                }
                            } else if (iOrdinal != 926) {
                                rjj0Var = rjj0Var2;
                                bh90Var = null;
                            } else {
                                Set set2 = rjj0Var2.c;
                                z1g1 z1g1Var2 = (z1g1) linkedHashMap3.get(str11);
                                if (z1g1Var2 != null) {
                                    ArrayList arrayList10 = z1g1Var2.g;
                                    String str28 = z1g1Var2.b;
                                    String str29 = z1g1Var2.h;
                                    rjj0Var = rjj0Var2;
                                    boolean z5 = z1g1Var2.f;
                                    String str30 = z1g1Var2.c.a;
                                    boolean zC = poz0.C(z1g1Var2);
                                    String str31 = z1g1Var2.i;
                                    boolean zD = poz0.D(z1g1Var2);
                                    String str32 = (String) r7j0Var.invoke(z1g1Var2.e);
                                    ArrayList arrayList11 = new ArrayList(q7h.U(arrayList10, 10));
                                    Iterator it7 = arrayList10.iterator();
                                    while (it7.hasNext()) {
                                        s1g1 s1g1Var = (s1g1) it7.next();
                                        arrayList11.add(new xh90(s1g1Var.a, s1g1Var.b));
                                        it7 = it7;
                                        str29 = str29;
                                    }
                                    String str33 = str29;
                                    Boolean bool2 = (Boolean) map.get(str11);
                                    if (bool2 != null ? bool2.booleanValue() : false) {
                                        z2 = true;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(q7h.U(arrayList10, 10));
                                        Iterator it8 = arrayList10.iterator();
                                        while (it8.hasNext()) {
                                            arrayList12.add(((s1g1) it8.next()).a);
                                        }
                                        if (!arrayList12.isEmpty()) {
                                            Iterator it9 = arrayList12.iterator();
                                            while (true) {
                                                if (it9.hasNext()) {
                                                    Boolean bool3 = (Boolean) map.get((String) it9.next());
                                                    if (bool3 != null ? bool3.booleanValue() : false) {
                                                        z2 = true;
                                                    }
                                                }
                                            }
                                        }
                                        z2 = false;
                                    }
                                    ch90Var = new yh90(str11, str28, str30, str33, str31, str32, z5, zC, zD, z2, arrayList11, set2.contains(str11));
                                    bh90Var = ch90Var;
                                } else {
                                    rjj0Var = rjj0Var2;
                                    bh90Var = null;
                                }
                            }
                            c = '\n';
                        } else {
                            rjj0Var = rjj0Var2;
                            gh3 gh3Var2 = (gh3) linkedHashMap2.get(str11);
                            if (gh3Var2 != null) {
                                ArrayList arrayList13 = gh3Var2.d;
                                String str34 = gh3Var2.b;
                                String str35 = gh3Var2.c.a;
                                boolean z6 = gh3Var2.h;
                                ArrayList arrayList14 = gh3Var2.g;
                                ArrayList arrayList15 = new ArrayList();
                                for (Iterator it10 = arrayList14.iterator(); it10.hasNext(); it10 = it10) {
                                    r7h.W(((fh3) it10.next()).a, arrayList15);
                                }
                                r7j0Var = r7j0Var;
                                ArrayList arrayList16 = new ArrayList(q7h.U(arrayList13, 10));
                                Iterator it11 = arrayList13.iterator();
                                while (it11.hasNext()) {
                                    arrayList16.add(((dh3) it11.next()).b);
                                }
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj4 : arrayList16) {
                                    if (!ihc1.y0((String) obj4)) {
                                        arrayList17.add(obj4);
                                    }
                                }
                                Boolean bool4 = (Boolean) map.get(str11);
                                if (bool4 != null ? bool4.booleanValue() : false) {
                                    arrayList = arrayList17;
                                    c = '\n';
                                } else {
                                    arrayList = arrayList17;
                                    c = '\n';
                                    ArrayList arrayList18 = new ArrayList(q7h.U(arrayList13, 10));
                                    Iterator it12 = arrayList13.iterator();
                                    while (it12.hasNext()) {
                                        arrayList18.add(((dh3) it12.next()).a);
                                    }
                                    if (!arrayList18.isEmpty()) {
                                        Iterator it13 = arrayList18.iterator();
                                        while (true) {
                                            if (it13.hasNext()) {
                                                Boolean bool5 = (Boolean) map.get((String) it13.next());
                                                if (bool5 != null ? bool5.booleanValue() : false) {
                                                }
                                            }
                                        }
                                    }
                                    z = false;
                                    bh90Var = new bh90(1, str11, str34, str35, arrayList15, arrayList, z, z6);
                                }
                                z = true;
                                bh90Var = new bh90(1, str11, str34, str35, arrayList15, arrayList, z, z6);
                            } else {
                                r7j0Var = r7j0Var;
                                c = '\n';
                                bh90Var = null;
                            }
                        }
                        if (bh90Var != null) {
                            arrayList2.add(bh90Var);
                        }
                        r7j0Var = r7j0Var;
                        it = it2;
                        linkedHashMap6 = linkedHashMap7;
                        linkedHashMap9 = linkedHashMap8;
                        rjj0Var2 = rjj0Var;
                    }
                    c = '\n';
                    if (bh90Var != null) {
                        arrayList2.add(bh90Var);
                    }
                    r7j0Var = r7j0Var;
                    it = it2;
                    linkedHashMap6 = linkedHashMap7;
                    linkedHashMap9 = linkedHashMap8;
                    rjj0Var2 = rjj0Var;
                }
                return arrayList2;
            default:
                Map map3 = (Map) obj;
                zsc zscVar = (zsc) obj3;
                ibk0 ibk0VarA = ((jbk0) zscVar.d).a((String) map3.get("mixing-tools"), (String) map3.get("type"));
                if (!ibk0VarA.b()) {
                    return Observable.just(new q7z0(false, false));
                }
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.q(hz00.b5);
                sku0VarP.k0();
                sku0VarP.G();
                hru0VarS.x(sku0VarP);
                return yoi1.i(((xrc0) zscVar.c).k((String) obj2, new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478)), o6xVar).map(new eb80(zscVar, ibk0VarA, (byte) 29)).onErrorReturn(qs10.Q0);
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public ParcelFileDescriptor c(Uri uri, File file, String str) throws IOException {
        String queryParameter;
        String strP;
        String strY0 = o7h.y0(o7h.k0(uri.getPathSegments(), 1), "/", (String) null, (String) null, (iu30) null, 62);
        if (strY0.length() == 0 || (queryParameter = uri.getQueryParameter("cdn")) == null) {
            strP = null;
        } else {
            strP = cy30.p(ihc1.h0(queryParameter, "localhost", false) ? "http" : "https", "://", queryParameter, "/", strY0);
        }
        if (strP == null) {
            return null;
        }
        ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
        fn31.T((llm) this.c, (o8n) null, 0, new az80(strP, this, parcelFileDescriptorArrCreateReliablePipe[1], (lnm) null, (byte) 20), 3);
        return parcelFileDescriptorArrCreateReliablePipe[0];
    }

    public void d() {
        yjg0 yjg0Var = (yjg0) ((qkg0) this.b).a.c.a;
        Consumer consumer = (Consumer) ((s59) this.c).b;
        if (consumer != null) {
            consumer.accept(yjg0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object e(onm onmVar) {
        bre0 bre0Var;
        i6a1 i6a1Var = (i6a1) this.c;
        if (onmVar instanceof bre0) {
            bre0Var = (bre0) onmVar;
            int i = bre0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bre0Var.c = i - Integer.MIN_VALUE;
            } else {
                bre0Var = new bre0(this, onmVar);
            }
        } else {
            bre0Var = new bre0(this, onmVar);
        }
        Object objA = bre0Var.a;
        int i2 = bre0Var.c;
        int i3 = 1;
        if (i2 == 0) {
            hm5.M(objA);
            GetLockRequest getLockRequestN = GetLockRequest.n();
            fre0 fre0Var = (fre0) this.b;
            getLockRequestN.getClass();
            bre0Var.c = 1;
            objA = fre0Var.a(getLockRequestN, bre0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        GetLockResponse getLockResponse = (GetLockResponse) objA;
        if (!getLockResponse.q()) {
            if (!getLockResponse.p()) {
                return null;
            }
            try {
                return sap1.q(getLockResponse.n());
            } catch (LockStateResolutionException e) {
                Logger.d(l1d.m("LockStateDataSource: Failed to map lock content: ", e.getMessage()), new Object[0]);
                i6a1Var.a(e);
                return null;
            }
        }
        int iOrdinal = getLockResponse.o().ordinal();
        if (iOrdinal != 1) {
            i3 = 2;
            if (iOrdinal != 2) {
                i3 = 3;
            }
        }
        Logger.d("LockStateDataSource: Lock content resolution failed: ".concat(g5d0.t(i3)), new Object[0]);
        i6a1Var.a(new LockStateResolutionException(i3));
        return null;
    }

    public gms0 f() {
        dg30 dg30Var = (dg30) this.b;
        if (x74.j(dg30Var, "android.permission.RECORD_AUDIO") == 0) {
            return gms0.a;
        }
        if (ag0.C0(dg30Var, "android.permission.RECORD_AUDIO")) {
            return gms0.c;
        }
        return ((dma1) this.c).h(xqj0.a, false) ? gms0.d : gms0.b;
    }

    public i8h1 g() {
        return (i8h1) ((kly0) this.b).get();
    }

    public x010 h() {
        return new x010(new ht20(yoi1.g(((yjj1) this.b).a()), new pk50(2, (lnm) null, (byte) 8)), yoi1.g(((c3s) this.c).e), new vv70(3, (lnm) null, (byte) 17), (byte) 1);
    }

    public tv80 i(String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        k5m0 k5m0Var = (k5m0) this.c;
        x6h1 x6h1VarC = k5m0Var.a.c();
        x6h1VarC.i.add(new a7h1("trailing_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), k5m0Var.b.c.b, System.currentTimeMillis()), (xj61) null);
    }

    public void j(String str, String str2, String str3, String str4) {
        t2j0 t2j0Var = (t2j0) this.b;
        yug0 yug0VarN = MarqueeOptOutEvent.n();
        yug0VarN.q(str);
        yug0VarN.s(str2);
        yug0VarN.n(str3);
        yug0VarN.r(str4);
        t2j0Var.a(yug0VarN.build());
    }

    public void k(iu30 iu30Var) {
        hma1 hma1VarEdit = ((dma1) this.c).edit();
        hma1VarEdit.a(xqj0.a, true);
        hma1VarEdit.g();
        ((g0i) ((dg30) this.b)).i.h("mic_permission_request", new e1r0((byte) 4), new srt(this, iu30Var, (byte) 2)).a("android.permission.RECORD_AUDIO");
    }

    public String[] l() {
        return new String[]{"video/mp4"};
    }

    public void onFailure(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    public void onSuccess(Object obj) {
        ((Surface) this.b).release();
        ((SurfaceTexture) this.c).release();
    }

    public void subscribe(FlowableEmitter flowableEmitter) {
        wpi0 wpi0Var = new wpi0(flowableEmitter);
        xpi0 xpi0Var = (xpi0) this.b;
        r630 r630Var = xpi0Var.c;
        String str = (String) this.c;
        r630Var.b(str, wpi0Var);
        flowableEmitter.setCancellable(new fi30(xpi0Var, str, wpi0Var, (byte) 1));
    }

    public boolean t(Object obj) {
        fxj0 fxj0Var = (fxj0) obj;
        ixj0 ixj0Var = (ixj0) this.c;
        qxc0 qxc0Var = fxj0Var.a;
        Map map = qxc0Var.X;
        Map map2 = qxc0Var.O0;
        return r1p1.i(z6k0.b(map), qxc0Var.t.c && gyo1.G(map2, new dlc0[]{dlc0.d}), !gyo1.L(map2), ixj0Var.c.a(fxj0Var.b, fxj0Var.c), ixj0Var.b.m);
    }

    public yge0(blp blpVar) {
        this.a = (byte) 1;
        this.b = blpVar;
        this.c = new p2m0(new brl0((byte) 17), (byte) 1);
    }

    public yge0(dlp dlpVar) {
        this.a = (byte) 11;
        this.b = dlpVar;
        this.c = new h7l0((byte) 14);
    }

    public /* synthetic */ yge0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public yge0(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = (byte) 3;
        this.b = i8h1Var;
        this.c = new k5m0(new mjl0(new uqk0(r6h1Var, (byte) 4)));
    }

    public yge0(String str, bsp bspVar) {
        this.a = (byte) 29;
        this.b = bspVar;
        r6h1 r6h1Var = r6h1.c;
        this.c = new yok0(str, (byte) 23);
    }

    public yge0(cxc cxcVar, q8n q8nVar) {
        this.a = (byte) 20;
        this.b = cxcVar;
        this.c = i3a.k(q8nVar);
    }

    public yge0(ixj0 ixj0Var) {
        this.a = (byte) 27;
        this.c = ixj0Var;
        this.b = ixj0Var.h;
    }

    public yge0(String str, Bundle bundle) {
        this.a = (byte) 18;
        if (str != null) {
            this.b = str;
            this.c = bundle;
        } else {
            hhg1.n("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            throw null;
        }
    }

    public void apply(long j) {
        rtg0 rtg0Var = (rtg0) this.b;
        rtg0Var.h.onNext(new otg0((mtg0) this.c, j, rtg0Var.e.b()));
    }
}
