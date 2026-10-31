package p;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.messages.ListeningPartyLeftDevice;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.SleepTimer;
import com.spotify.smartshuffle.loggingimpl.events.proto.SmartShuffleOperationResultAction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rwa0 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public rwa0(ke71 ke71Var) {
        this.a = (byte) 13;
        this.b = new rwa0(ke71Var, (byte) 12);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    public final void accept(Object obj) throws Throwable {
        Throwable th;
        String str;
        String str2;
        cqs0 cqs0VarT;
        wm71 vm71Var;
        aef0 aef0Var;
        pgl1 pgl1Var;
        Set setKeySet;
        j380 j380VarMetadata;
        j380 j380VarMetadata2;
        j380 j380VarMetadata3;
        j380 j380VarDisallowSignals;
        PlayOrigin playOrigin;
        t380 t380VarDisallowAddToQueueReasons;
        PlayerOptions playerOptionsOptions;
        t380 t380VarDisallowSleepTimerEndOfTrackReasons;
        t380 t380VarDisallowSleepTimerDurationReasons;
        t380 t380VarDisallowSleepTimerClearReasons;
        j380 j380VarMetadata4;
        j380 j380VarMetadata5;
        j380 j380VarMetadata6;
        t380 t380VarDisallowSeekingReasons;
        j380 j380VarMetadata7;
        j380 j380VarContextMetadata;
        spq0 spq0VarSleepTimer;
        spq0 spq0VarTrack;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                zsk zskVar = (zsk) obj;
                swa0 swa0Var = (swa0) obj2;
                swa0Var.d = twa0.a(swa0Var.d, (String) null, (String) null, (String) null, zskVar.e, zskVar.d, zskVar.c, zskVar.a, zskVar.b, 0, (String) null, (yxa0) null, zskVar.f, 3847);
                return;
            case 1:
                deb0 deb0Var = (deb0) obj2;
                leb0 leb0Var = deb0Var.c;
                i8h1 i8h1Var = leb0Var.a;
                tdl0 tdl0Var = leb0Var.b;
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("save_confirmation_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = tdl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                kt91 kt91Var = deb0Var.b;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957173});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131957173, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 2:
                IconCompat iconCompat = (IconCompat) obj;
                iconCompat.getClass();
                ((hgb0) obj2).invoke(iconCompat);
                return;
            case 3:
                IconCompat iconCompat2 = (IconCompat) obj;
                iconCompat2.getClass();
                ((hgb0) obj2).invoke(iconCompat2);
                return;
            case 4:
                ((m1c0) obj2).b(1, (String) obj);
                return;
            case 5:
                rxt0 rxt0Var = (rxt0) obj;
                zd1 zd1Var = (zd1) obj2;
                ((PublishSubject) zd1Var.d).onNext(rxt0Var);
                t2j0 t2j0Var = (t2j0) zd1Var.c;
                gkd0 gkd0VarN = ListeningPartyLeftDevice.n();
                gkd0VarN.n(rxt0Var.a.toString());
                t2j0Var.a(gkd0VarN.build());
                return;
            case 6:
                jld0 jld0Var = (jld0) obj;
                ppd0 ppd0Var = (ppd0) obj2;
                qpd0 qpd0Var = new qpd0(jld0Var.b, jld0Var.a);
                ppd0Var.i = qpd0Var;
                ppd0Var.h.invoke(qpd0Var);
                return;
            case 7:
                ((md7) ((t4d1) obj2).b).accept(hd7.a);
                return;
            case 8:
                o5e0 o5e0Var = (o5e0) obj;
                if (o5e0Var.a() || o5e0Var.e() || o5e0Var.d() || o5e0Var.g()) {
                    v7e0 v7e0Var = (v7e0) obj2;
                    if (v7e0Var.c && v7e0Var.f.compareAndSet(false, true)) {
                        v7e0Var.b.f(new dwn0(v7e0Var.d, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                bi20 bi20Var = (ci20) obj;
                dxy dxyVar = ((g8e0) obj2).d;
                if (dxyVar != null) {
                    RecyclerView recyclerView = (RecyclerView) dxyVar.f;
                    ViewGroup viewGroup = (ViewGroup) dxyVar.d;
                    ((qzh) ((tzo) dxyVar.c).b).f(new k451(bi20Var.a()));
                    if (bi20Var instanceof bi20) {
                        viewGroup.setVisibility(8);
                        recyclerView.setVisibility(0);
                        ((qxx0) ((t4d1) dxyVar.g).b).C(bi20Var.c);
                        return;
                    } else {
                        if (bi20Var instanceof ai20) {
                            viewGroup.setVisibility(0);
                            recyclerView.setVisibility(8);
                            k9r k9rVar = (k9r) dxyVar.e;
                            ((TextView) k9rVar.d).setText(((Context) k9rVar.b).getString(2131956021, ((ai20) bi20Var).a));
                            return;
                        }
                        if (!(bi20Var instanceof zh20)) {
                            eg.o();
                            return;
                        } else {
                            viewGroup.setVisibility(8);
                            recyclerView.setVisibility(8);
                            return;
                        }
                    }
                }
                return;
            case 10:
                ((mae0) obj2).a = ((eir0) obj).a;
                return;
            case 11:
                j2h1.D(igu.b, new tfe0(this, (axg0) obj, (lnm) null, (byte) 5)).subscribe();
                return;
            case 12:
                nj91 nj91Var = (nj91) obj;
                ke71 ke71Var = (ke71) obj2;
                boolean z = nj91Var.a;
                boolean z2 = nj91Var.b;
                String str3 = nj91Var.c;
                List list = nj91Var.d;
                int i = nj91Var.e;
                int i2 = nj91Var.f;
                tv80 tv80Var = nj91Var.g;
                t2j0 t2j0Var2 = (t2j0) ke71Var.c;
                nn91 nn91VarO = SmartShuffleOperationResultAction.o();
                nn91VarO.u(z);
                nn91VarO.s(z2);
                nn91VarO.v();
                ((agc0) ke71Var.b).getClass();
                if (str3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str3.equals("spotify:collection:tracks") || str3.equals("spotify:internal:collection:tracks") || (nhc1.Y(str3, "spotify:user:", false) && nhc1.R(str3, ":collection", false))) {
                    str3 = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
                }
                nn91VarO.q(str3);
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mh10) it.next()).a);
                }
                nn91VarO.n(arrayList);
                if (i == 1) {
                    th = null;
                    str = "NOT_PLAYING";
                } else if (i == 2) {
                    th = null;
                    str = "PLAYING_LOCALLY";
                } else {
                    if (i != 3) {
                        throw null;
                    }
                    str = "PLAYING_OVER_CONNECT";
                    th = null;
                }
                nn91VarO.t(str);
                switch (i2) {
                    case 1:
                        str2 = "USER_INITIATED";
                        break;
                    case 2:
                        str2 = "JAM_STARTED";
                        break;
                    case 3:
                        str2 = "JAM_ENDED";
                        break;
                    case 4:
                        str2 = "SMART_LINEAR";
                        break;
                    case 5:
                        str2 = "REVERT_AFTER_FAILURE";
                        break;
                    case 6:
                        str2 = "UNKNOWN";
                        break;
                    default:
                        throw th;
                }
                nn91VarO.r(str2);
                if (tv80Var != null) {
                    nn91VarO.w(tv80Var.a.a);
                }
                t2j0Var2.a(nn91VarO.build());
                return;
            case 13:
                ((rwa0) obj2).accept((nj91) obj);
                return;
            case 14:
                uov0 uov0Var = (uov0) obj;
                ((cwe0) obj2).a.a(new khv0((String) null, 1, sqg0.J(new mmr0[]{new mmr0("partner", uov0Var.a), new mmr0("referrer", uov0Var.b)}), "preload_info"));
                return;
            case 15:
                ((pjf0) obj2).a(((ief0) obj).c, pzm.g("translation_mode_enabled", false));
                return;
            case 16:
                ((yku) obj2).accept((phf0) obj);
                return;
            case 17:
                ((sqs0) obj2).a(((xhf0) obj).a);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((PublishProcessor) obj2).onNext((ju41) obj);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                zhf0 zhf0Var = (zhf0) obj;
                zhf0Var.getClass();
                ifl1 ifl1Var = (ifl1) obj2;
                LinkedHashMap linkedHashMap = zhf0Var.a;
                dof1 dof1Var = zhf0Var.b;
                a9h a9hVar = zhf0Var.c;
                int i3 = zhf0Var.e;
                tv80 tv80Var2 = zhf0Var.d;
                c380 c380Var = zhf0Var.f;
                gy71 gy71Var = zhf0Var.g;
                Set setKeySet2 = linkedHashMap.keySet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = setKeySet2.iterator();
                while (it2.hasNext()) {
                    Integer numC0 = nhc1.c0((String) it2.next());
                    if (numC0 != null) {
                        arrayList2.add(numC0);
                    }
                }
                Integer num = (Integer) o7h.G0(arrayList2);
                Long lValueOf = (num == null || (aef0Var = (aef0) o7h.t0(num.intValue(), a9hVar.a.a)) == null) ? null : Long.valueOf(aef0Var.a);
                String str4 = dof1Var.a;
                String str5 = str4 == null ? "" : str4;
                String str6 = dof1Var.b;
                String str7 = str6 == null ? "" : str6;
                String str8 = dof1Var.c;
                String str9 = str8 == null ? "" : str8;
                String str10 = dof1Var.d;
                cqs0 cqs0VarB = mqo1.B(linkedHashMap);
                c9 c9VarH = b5p1.h(a9hVar.b);
                fef0 fef0Var = a9hVar.a;
                ay61 ay61Var = new ay61(str5, str7, str9, str10, cqs0VarB, c9VarH, fef0Var.f, fef0Var.e, fef0Var.b, c380Var, gy71Var, (String) null, 4096);
                if (lValueOf == null || (cqs0VarT = mqo1.t(new mmr0[]{new mmr0("t", String.valueOf(lValueOf.longValue() / 1000))})) == null) {
                    cqs0VarT = dqs0.e;
                }
                cqs0 cqs0Var = cqs0VarT;
                xh71 xh71Var = (xh71) ifl1Var.b;
                wa71 wa71Var = new wa71(str10, (String) null, cqs0Var, (dqi1) null, (String) null, (String) null, mno1.h(new mmr0[]{new mmr0("lyrics.share.asset_content", ay61Var)}), 58);
                int iC = l1d.C(i3);
                if (iC == 0) {
                    vm71Var = new vm71("lyricssharing");
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    vm71Var = wm71.b;
                }
                xh71.b(xh71Var, wa71Var, (Bundle) null, vm71Var, tv80Var2, (List) null, 18);
                return;
            case 20:
                oqf0 oqf0Var = (oqf0) obj;
                Objects.toString(oqf0Var.c);
                ((ykf0) obj2).a(oqf0Var.f, oqf0Var.a, oqf0Var.b, oqf0Var.e, oqf0Var.c, oqf0Var.d, oqf0Var.g);
                return;
            case 21:
                float f = ((rqf0) obj).a;
                hma1 hma1VarEdit = ((dma1) ((npf0) obj2).c.getValue()).edit();
                hma1VarEdit.a.putFloat(vmf0.a().a, f);
                hma1VarEdit.i();
                hma1VarEdit.g();
                return;
            case 22:
                g4o0 g4o0Var = (g4o0) obj;
                Iterator it3 = ((qig0) obj2).e.iterator();
                while (it3.hasNext()) {
                    ((u1o0) it3.next()).h(g4o0Var);
                }
                return;
            case 23:
                qug0 qug0Var = (qug0) obj2;
                boolean z3 = ((bx0) obj) instanceof ax0;
                MobiusLoop mobiusLoop = qug0Var.f;
                if (z3) {
                    if (mobiusLoop == null) {
                        qug0Var.f = qug0Var.d.g(wxg0.d);
                        return;
                    }
                    return;
                } else {
                    if (mobiusLoop != null) {
                        mobiusLoop.dispose();
                    }
                    qug0Var.f = null;
                    return;
                }
            case 24:
                ivg0 ivg0Var = (ivg0) obj2;
                pk1 pk1VarA = pk1.a(ivg0Var.p, ((Boolean) obj).booleanValue() ? qk1.b : qk1.a, (j7p1) null, 30);
                ivg0Var.p = pk1VarA;
                twg0 twg0Var = ivg0Var.a.P0;
                if (twg0Var == null) {
                    twg0Var = twg0.d;
                }
                mwg0 mwg0Var = ivg0Var.n;
                if (mwg0Var == null) {
                    u890.C("viewBinder");
                    throw null;
                }
                pk1 pk1VarA2 = pk1.a(pk1VarA, (qk1) null, twg0Var == twg0.c ? rk1.c : tk1.c, 15);
                EncoreAddToButtonView encoreAddToButtonView = mwg0Var.R1;
                if (encoreAddToButtonView != null) {
                    encoreAddToButtonView.g(pk1VarA2);
                    return;
                } else {
                    u890.C("saveButton");
                    throw null;
                }
            case 25:
                beh behVar = (feh) obj;
                cjh0 cjh0Var = (cjh0) obj2;
                if (behVar instanceof beh) {
                    String str11 = behVar.a;
                    Collections.singletonList(str11);
                    cjh0Var.c();
                    Logger.b("Media button command failed: %s", new Object[]{str11});
                    return;
                }
                return;
            case 26:
                inh0 inh0Var = (inh0) obj2;
                if (((zfe0) obj) != zfe0.a) {
                    inh0Var.a("Local playback stopped");
                    return;
                }
                if (inh0Var.c.a() || !inh0Var.i.get()) {
                    fnh0 fnh0Var = inh0Var.b;
                    fnh0Var.g.u(new kz20(true, inh0Var.f, inh0Var.g, 2));
                    jnh0 jnh0Var = fnh0Var.c;
                    Handler handler = jnh0Var.b;
                    if (handler != null) {
                        handler.post(new unc0(fnh0Var.a, fnh0Var.h, fnh0Var.g, fnh0Var.f, fnh0Var.b, jnh0Var, fnh0Var.e, (byte) 1));
                    }
                }
                AtomicBoolean atomicBoolean = inh0Var.h;
                try {
                    if (atomicBoolean.getAndSet(true)) {
                        return;
                    }
                    Logger.b("Registering receiver in MediaFocusManagerService (Local playback started)", new Object[0]);
                    i2p1.s(inh0Var.d, inh0Var.t, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 28);
                    return;
                } catch (IllegalArgumentException e) {
                    atomicBoolean.set(false);
                    n57.g("Error registering receiver in MediaFocusManagerService", e);
                    return;
                }
            case 27:
                t0i0 t0i0Var = (t0i0) obj;
                tyh0 tyh0Var = (tyh0) ((syh0) obj2);
                pgl1 pgl1Var2 = t0i0Var.d;
                PlayerState playerState = t0i0Var.a;
                ContextTrack contextTrack = (playerState == null || (spq0VarTrack = playerState.track()) == null) ? null : (ContextTrack) spq0VarTrack.h();
                if (pgl1Var2 != null) {
                    String str12 = pgl1Var2.a;
                    if (nhc1.Y(str12, "spotify:audiobook:", false) || nhc1.Y(str12, "spotify:show:", false)) {
                        pgl1Var = pgl1Var2;
                    } else {
                        pgl1Var = null;
                    }
                } else {
                    pgl1Var = null;
                }
                SleepTimer sleepTimer = (playerState == null || (spq0VarSleepTimer = playerState.sleepTimer()) == null) ? null : (SleepTimer) spq0VarSleepTimer.h();
                Restrictions restrictions = playerState != null ? playerState.restrictions() : null;
                j380 j380VarContextMetadata2 = playerState != null ? playerState.contextMetadata() : null;
                ryh0 ryh0Var = tyh0Var.b;
                String str13 = (playerState == null || (j380VarContextMetadata = playerState.contextMetadata()) == null) ? null : (String) j380VarContextMetadata.get("context_description");
                String strA0 = contextTrack != null ? l4o1.a0(contextTrack, "album_title") : null;
                String str14 = (contextTrack == null || (j380VarMetadata7 = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata7.get("station_subtitle");
                String strContextUri = playerState != null ? playerState.contextUri() : null;
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                String strUid = contextTrack != null ? contextTrack.uid() : null;
                String strA1 = contextTrack != null ? l4o1.a0(contextTrack, "album_uri") : null;
                Boolean boolValueOf = (restrictions == null || (t380VarDisallowSeekingReasons = restrictions.disallowSeekingReasons()) == null) ? null : Boolean.valueOf(t380VarDisallowSeekingReasons.isEmpty());
                ktl ktlVar = t0i0Var.c;
                String strName = ktlVar != null ? ktlVar.name() : null;
                Boolean boolValueOf2 = contextTrack != null ? Boolean.valueOf(l4o1.O(contextTrack)) : null;
                Boolean boolValueOf3 = contextTrack != null ? Boolean.valueOf(l4o1.G(contextTrack)) : null;
                Boolean boolValueOf4 = pgl1Var != null ? Boolean.valueOf(pgl1Var.c) : null;
                Boolean boolValueOf5 = pgl1Var2 != null ? Boolean.valueOf(pgl1Var2.b) : null;
                Boolean boolValueOf6 = contextTrack != null ? Boolean.valueOf(l4o1.J(contextTrack)) : null;
                Boolean boolValueOf7 = contextTrack != null ? Boolean.valueOf(l4o1.K(contextTrack)) : null;
                Integer num2 = t0i0Var.b;
                String str15 = (contextTrack == null || (j380VarMetadata6 = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata6.get("extracted_color");
                String str16 = (contextTrack == null || (j380VarMetadata5 = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata5.get("image_url");
                String str17 = (contextTrack == null || (j380VarMetadata4 = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata4.get("artist_uri");
                Boolean boolValueOf8 = (restrictions == null || (t380VarDisallowSleepTimerClearReasons = restrictions.disallowSleepTimerClearReasons()) == null) ? null : Boolean.valueOf(!t380VarDisallowSleepTimerClearReasons.isEmpty());
                Boolean boolValueOf9 = (restrictions == null || (t380VarDisallowSleepTimerDurationReasons = restrictions.disallowSleepTimerDurationReasons()) == null) ? null : Boolean.valueOf(!t380VarDisallowSleepTimerDurationReasons.isEmpty());
                Boolean boolValueOf10 = (restrictions == null || (t380VarDisallowSleepTimerEndOfTrackReasons = restrictions.disallowSleepTimerEndOfTrackReasons()) == null) ? null : Boolean.valueOf(!t380VarDisallowSleepTimerEndOfTrackReasons.isEmpty());
                Boolean boolValueOf11 = j380VarContextMetadata2 != null ? Boolean.valueOf(Boolean.parseBoolean((String) j380VarContextMetadata2.get("mix")) || u890.j(j380VarContextMetadata2.get("mix-type"), "only-auto")) : null;
                Boolean boolValueOf12 = (playerState == null || (playerOptionsOptions = playerState.options()) == null) ? null : Boolean.valueOf(playerOptionsOptions.shufflingContext());
                Boolean boolValueOf13 = (restrictions == null || (t380VarDisallowAddToQueueReasons = restrictions.disallowAddToQueueReasons()) == null) ? null : Boolean.valueOf(!t380VarDisallowAddToQueueReasons.isEmpty());
                String strReferrerIdentifier = (playerState == null || (playOrigin = playerState.playOrigin()) == null) ? null : playOrigin.referrerIdentifier();
                String strW = contextTrack != null ? l4o1.w(contextTrack) : null;
                String strX = contextTrack != null ? l4o1.x(contextTrack) : null;
                b380 b380VarSignals = playerState != null ? playerState.signals() : null;
                if (restrictions == null || (j380VarDisallowSignals = restrictions.disallowSignals()) == null) {
                    setKeySet = null;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : j380VarDisallowSignals.entrySet()) {
                        if (!((Restrictions.RestrictionReasons) entry.getValue()).reasons().isEmpty()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    setKeySet = linkedHashMap2.keySet();
                }
                ryh0 ryh0VarA = ryh0.a(ryh0Var, false, str13, strA0, str14, strContextUri, strUri, strUid, strA1, num2, boolValueOf, strName, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, str15, str16, str17, sleepTimer, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, strReferrerIdentifier, strW, strX, b380VarSignals, setKeySet, (contextTrack == null || (j380VarMetadata3 = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata3.get("save_track.uri"), (contextTrack == null || (j380VarMetadata2 = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata2.get("audio_association"), (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) ? null : (String) j380VarMetadata.get("is_music_video"), 1, 0);
                if (tyh0Var.b.equals(ryh0VarA)) {
                    return;
                }
                tyh0Var.b = ryh0VarA;
                dg90 dg90Var = tyh0Var.a;
                if (dg90Var != null) {
                    ((y490) dg90Var.b).setExtras(ryh0VarA.b());
                    return;
                }
                return;
            case 28:
                spq0 spq0Var = (spq0) obj;
                if (spq0Var.c()) {
                    ((r0i0) spq0Var.b()).getClass();
                    ((y490) obj2).l((r0i0) spq0Var.b());
                    return;
                }
                return;
            default:
                SingleSubject singleSubject = (SingleSubject) ((kcs) obj2).a.remove(((odj0) obj).c.a);
                if (singleSubject != null) {
                    singleSubject.onSuccess(new q981(1));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rwa0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
