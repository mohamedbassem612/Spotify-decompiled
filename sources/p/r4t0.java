package p;

import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.cosmos.util.proto.ShowPlayState;
import com.spotify.cosmos.util.proto.TrackArtistMetadata;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.SleepTimer;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionEpisode;
import spotify.collection.esperanto.proto.CollectionShow;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r4t0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ r4t0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x021c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0264  */
    /* JADX WARN: Code duplicated, block: B:151:0x029c  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:193:0x033d  */
    /* JADX WARN: Code duplicated, block: B:213:0x038d  */
    /* JADX WARN: Code duplicated, block: B:231:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:246:0x041d  */
    /* JADX WARN: Code duplicated, block: B:264:0x046d  */
    /* JADX WARN: Code duplicated, block: B:279:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:294:0x04df  */
    /* JADX WARN: Code duplicated, block: B:309:0x051a  */
    /* JADX WARN: Code duplicated, block: B:324:0x0556  */
    /* JADX WARN: Code duplicated, block: B:339:0x0597  */
    /* JADX WARN: Code duplicated, block: B:354:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:369:0x0633  */
    /* JADX WARN: Code duplicated, block: B:386:0x0670  */
    /* JADX WARN: Code duplicated, block: B:424:0x0746  */
    /* JADX WARN: Code duplicated, block: B:450:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:472:0x0818  */
    /* JADX WARN: Code duplicated, block: B:487:0x0855  */
    /* JADX WARN: Code duplicated, block: B:502:0x0892  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:522:0x08da  */
    /* JADX WARN: Code duplicated, block: B:537:0x0916  */
    /* JADX WARN: Code duplicated, block: B:552:0x0957  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        q4t0 q4t0Var;
        ybt0 ybt0Var;
        jft0 jft0Var;
        pit0 pit0Var;
        qit0 qit0Var;
        kot0 kot0Var;
        jtt0 jtt0Var;
        PlayabilityRestriction playabilityRestriction;
        EpisodePlayState episodePlayStateS;
        but0 but0Var;
        dut0 dut0Var;
        String link;
        eut0 eut0Var;
        gut0 gut0Var;
        jut0 jut0Var;
        kut0 kut0Var;
        put0 put0Var;
        fxt0 fxt0Var;
        a1u0 a1u0Var;
        d1u0 d1u0Var;
        f1u0 f1u0Var;
        x1u0 x1u0Var;
        m2u0 m2u0Var;
        y3u0 y3u0Var;
        o4u0 o4u0Var;
        z4u0 z4u0Var;
        y6u0 y6u0Var;
        j7u0 j7u0Var;
        fcu0 fcu0Var;
        ldu0 ldu0Var;
        sdu0 sdu0Var;
        ContextTrack contextTrack;
        beu0 beu0Var;
        seu0 seu0Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        z3p0 x0u0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof q4t0) {
                    q4t0Var = (q4t0) lnmVar;
                    int i = q4t0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        q4t0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        q4t0Var = new q4t0(this, lnmVar);
                    }
                } else {
                    q4t0Var = new q4t0(this, lnmVar);
                }
                Object obj2 = q4t0Var.a;
                int i2 = q4t0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                List<v4t0> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (v4t0 v4t0Var : list) {
                    arrayList.add(new h8k1(v4t0Var, v4t0Var.a()));
                }
                hj50 hj50Var = new hj50(arrayList, (ioj0) null);
                q4t0Var.b = 1;
                return vr20Var.emit(hj50Var, q4t0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof ybt0) {
                    ybt0Var = (ybt0) lnmVar;
                    int i3 = ybt0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ybt0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ybt0Var = new ybt0(this, lnmVar);
                    }
                } else {
                    ybt0Var = new ybt0(this, lnmVar);
                }
                Object obj3 = ybt0Var.a;
                int i4 = ybt0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf = Boolean.valueOf(u890.j((String) obj, "1"));
                    ybt0Var.b = 1;
                    return vr20Var.emit(boolValueOf, ybt0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof jft0) {
                    jft0Var = (jft0) lnmVar;
                    int i5 = jft0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jft0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        jft0Var = new jft0(this, lnmVar);
                    }
                } else {
                    jft0Var = new jft0(this, lnmVar);
                }
                Object obj4 = jft0Var.a;
                int i6 = jft0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    yet0 yet0Var = new yet0((zkm) obj);
                    jft0Var.b = 1;
                    return vr20Var.emit(yet0Var, jft0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof pit0) {
                    pit0Var = (pit0) lnmVar;
                    int i7 = pit0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        pit0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        pit0Var = new pit0(this, lnmVar);
                    }
                } else {
                    pit0Var = new pit0(this, lnmVar);
                }
                Object obj5 = pit0Var.a;
                int i8 = pit0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                pit0Var.b = 1;
                return vr20Var.emit(boolValueOf2, pit0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof qit0) {
                    qit0Var = (qit0) lnmVar;
                    int i9 = qit0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qit0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        qit0Var = new qit0(this, lnmVar);
                    }
                } else {
                    qit0Var = new qit0(this, lnmVar);
                }
                Object obj6 = qit0Var.a;
                int i10 = qit0Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    Boolean boolValueOf3 = Boolean.valueOf(((k78) obj).a);
                    qit0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, qit0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof kot0) {
                    kot0Var = (kot0) lnmVar;
                    int i11 = kot0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        kot0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        kot0Var = new kot0(this, lnmVar);
                    }
                } else {
                    kot0Var = new kot0(this, lnmVar);
                }
                Object obj7 = kot0Var.a;
                int i12 = kot0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf4 = Boolean.valueOf(((czl1) obj).b);
                    kot0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, kot0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof jtt0) {
                    jtt0Var = (jtt0) lnmVar;
                    int i13 = jtt0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        jtt0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        jtt0Var = new jtt0(this, lnmVar);
                    }
                } else {
                    jtt0Var = new jtt0(this, lnmVar);
                }
                Object obj8 = jtt0Var.a;
                int i14 = jtt0Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                CollectionEpisode collectionEpisode = (CollectionEpisode) o7h.s0(((CollectionDecorateResponse) obj).p());
                if (collectionEpisode == null || (episodePlayStateS = collectionEpisode.s()) == null || (playabilityRestriction = episodePlayStateS.getPlayabilityRestriction()) == null) {
                    playabilityRestriction = PlayabilityRestriction.UNKNOWN;
                }
                sgw0 sgw0Var = new sgw0(playabilityRestriction);
                jtt0Var.b = 1;
                return vr20Var.emit(sgw0Var, jtt0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof but0) {
                    but0Var = (but0) lnmVar;
                    int i15 = but0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        but0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        but0Var = new but0(this, lnmVar);
                    }
                } else {
                    but0Var = new but0(this, lnmVar);
                }
                Object obj9 = but0Var.a;
                int i16 = but0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    ycy ycyVar = (ycy) entry.getValue();
                    linkedHashMap.put(key, Boolean.valueOf(ycyVar.b || ycyVar.c.a()));
                }
                but0Var.b = 1;
                return vr20Var.emit(linkedHashMap, but0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof dut0) {
                    dut0Var = (dut0) lnmVar;
                    int i17 = dut0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        dut0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        dut0Var = new dut0(this, lnmVar);
                    }
                } else {
                    dut0Var = new dut0(this, lnmVar);
                }
                Object obj10 = dut0Var.a;
                int i18 = dut0Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
                h290<CollectionTrack> h290VarT = collectionDecorateResponse.t();
                int iS = zno1.s(q7h.U(h290VarT, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (CollectionTrack collectionTrack : h290VarT) {
                    String link2 = collectionTrack.getLink();
                    PlayabilityRestriction playabilityRestriction2 = collectionTrack.t().getPlayabilityRestriction();
                    TrackArtistMetadata trackArtistMetadata = (TrackArtistMetadata) o7h.s0(collectionTrack.s().getArtistList());
                    if (trackArtistMetadata == null || (link = trackArtistMetadata.getLink()) == null || link.length() <= 0) {
                        link = null;
                    }
                    linkedHashMap2.put(link2, new ytt0(playabilityRestriction2, (String) null, link, 2));
                }
                h290<CollectionShow> h290VarQ = collectionDecorateResponse.q();
                int iS2 = zno1.s(q7h.U(h290VarQ, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (CollectionShow collectionShow : h290VarQ) {
                    String link3 = collectionShow.getLink();
                    ShowPlayState showPlayStateR = collectionShow.r();
                    linkedHashMap3.put(link3, new ytt0(showPlayStateR.getPlayabilityRestriction(), showPlayStateR.getResumeEpisodeLink(), (String) null, 4));
                }
                LinkedHashMap linkedHashMapO = sqg0.O(linkedHashMap2, linkedHashMap3);
                dut0Var.b = 1;
                return vr20Var.emit(linkedHashMapO, dut0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof eut0) {
                    eut0Var = (eut0) lnmVar;
                    int i19 = eut0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        eut0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        eut0Var = new eut0(this, lnmVar);
                    }
                } else {
                    eut0Var = new eut0(this, lnmVar);
                }
                Object obj11 = eut0Var.a;
                int i20 = eut0Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                eut0Var.b = 1;
                return vr20Var.emit(obj, eut0Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof gut0) {
                    gut0Var = (gut0) lnmVar;
                    int i21 = gut0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        gut0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        gut0Var = new gut0(this, lnmVar);
                    }
                } else {
                    gut0Var = new gut0(this, lnmVar);
                }
                Object obj12 = gut0Var.a;
                int i22 = gut0Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                Map map2 = (Map) obj;
                map2.getClass();
                mmr0 mmr0Var = new mmr0(Boolean.valueOf(y7y0.G(map2)), Boolean.valueOf(y7y0.A(map2)));
                gut0Var.b = 1;
                return vr20Var.emit(mmr0Var, gut0Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof jut0) {
                    jut0Var = (jut0) lnmVar;
                    int i23 = jut0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        jut0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        jut0Var = new jut0(this, lnmVar);
                    }
                } else {
                    jut0Var = new jut0(this, lnmVar);
                }
                Object obj13 = jut0Var.a;
                int i24 = jut0Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf5 = Boolean.valueOf(eqr0.r(((cxc0) obj).k, (dlc0[]) Arrays.copyOf(new dlc0[]{dlc0.b}, 1)));
                    jut0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, jut0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof kut0) {
                    kut0Var = (kut0) lnmVar;
                    int i25 = kut0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        kut0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        kut0Var = new kut0(this, lnmVar);
                    }
                } else {
                    kut0Var = new kut0(this, lnmVar);
                }
                Object obj14 = kut0Var.a;
                int i26 = kut0Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf6 = Boolean.valueOf(u890.j((String) obj, "UNRESTRICTED"));
                    kut0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, kut0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof put0) {
                    put0Var = (put0) lnmVar;
                    int i27 = put0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        put0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        put0Var = new put0(this, lnmVar);
                    }
                } else {
                    put0Var = new put0(this, lnmVar);
                }
                Object obj15 = put0Var.a;
                int i28 = put0Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    fio fioVar = new fio((Map) obj);
                    put0Var.b = 1;
                    return vr20Var.emit(fioVar, put0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof fxt0) {
                    fxt0Var = (fxt0) lnmVar;
                    int i29 = fxt0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        fxt0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        fxt0Var = new fxt0(this, lnmVar);
                    }
                } else {
                    fxt0Var = new fxt0(this, lnmVar);
                }
                Object obj16 = fxt0Var.a;
                int i30 = fxt0Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    String strB0 = l4o1.b0((ContextTrack) obj);
                    fxt0Var.b = 1;
                    return vr20Var.emit(strB0, fxt0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof a1u0) {
                    a1u0Var = (a1u0) lnmVar;
                    int i31 = a1u0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        a1u0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        a1u0Var = new a1u0(this, lnmVar);
                    }
                } else {
                    a1u0Var = new a1u0(this, lnmVar);
                }
                Object obj17 = a1u0Var.a;
                int i32 = a1u0Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    ktl ktlVar = ((mtl) obj).a;
                    a1u0Var.b = 1;
                    return vr20Var.emit(ktlVar, a1u0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof d1u0) {
                    d1u0Var = (d1u0) lnmVar;
                    int i33 = d1u0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        d1u0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        d1u0Var = new d1u0(this, lnmVar);
                    }
                } else {
                    d1u0Var = new d1u0(this, lnmVar);
                }
                Object obj18 = d1u0Var.a;
                int i34 = d1u0Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    String str = ((jo70) obj).a;
                    d1u0Var.b = 1;
                    return vr20Var.emit(str, d1u0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof f1u0) {
                    f1u0Var = (f1u0) lnmVar;
                    int i35 = f1u0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        f1u0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        f1u0Var = new f1u0(this, lnmVar);
                    }
                } else {
                    f1u0Var = new f1u0(this, lnmVar);
                }
                Object obj19 = f1u0Var.a;
                int i36 = f1u0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                ContextTrack contextTrack2 = (ContextTrack) ((PlayerState) obj).track().h();
                x0u0Var = contextTrack2 != null ? new x0u0(l4o1.b0(contextTrack2), l4o1.v(contextTrack2)) : null;
                f1u0Var.b = 1;
                return vr20Var.emit(x0u0Var, f1u0Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof x1u0) {
                    x1u0Var = (x1u0) lnmVar;
                    int i37 = x1u0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        x1u0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        x1u0Var = new x1u0(this, lnmVar);
                    }
                } else {
                    x1u0Var = new x1u0(this, lnmVar);
                }
                Object obj20 = x1u0Var.a;
                int i38 = x1u0Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf7 = Boolean.valueOf(!((PlayerState) obj).isPaused());
                    x1u0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, x1u0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof m2u0) {
                    m2u0Var = (m2u0) lnmVar;
                    int i39 = m2u0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        m2u0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        m2u0Var = new m2u0(this, lnmVar);
                    }
                } else {
                    m2u0Var = new m2u0(this, lnmVar);
                }
                Object obj21 = m2u0Var.a;
                int i40 = m2u0Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                l2u0 l2u0Var = (l2u0) obj;
                if (l2u0Var == null) {
                    l2u0Var = new l2u0(false, 0L, 0L, 0L, 0L, 0.0f, (Integer) null, (Integer) null, 448);
                }
                m2u0Var.b = 1;
                return vr20Var.emit(l2u0Var, m2u0Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof y3u0) {
                    y3u0Var = (y3u0) lnmVar;
                    int i41 = y3u0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        y3u0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        y3u0Var = new y3u0(this, lnmVar);
                    }
                } else {
                    y3u0Var = new y3u0(this, lnmVar);
                }
                Object obj22 = y3u0Var.a;
                int i42 = y3u0Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    byte[] bArr = (byte[]) obj;
                    try {
                        PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChangeQ = PlaybackSettingsEsperantoService$StreamSettingChange.q(bArr);
                        y3u0Var.b = 1;
                        return vr20Var.emit(playbackSettingsEsperantoService$StreamSettingChangeQ, y3u0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.StreamSettingChange: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i42 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 21:
                if (lnmVar instanceof o4u0) {
                    o4u0Var = (o4u0) lnmVar;
                    int i43 = o4u0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        o4u0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        o4u0Var = new o4u0(this, lnmVar);
                    }
                } else {
                    o4u0Var = new o4u0(this, lnmVar);
                }
                Object obj23 = o4u0Var.a;
                int i44 = o4u0Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = (PlaybackSettingsEsperantoService$StreamSettingChange) obj;
                if (playbackSettingsEsperantoService$StreamSettingChange.p() && playbackSettingsEsperantoService$StreamSettingChange.o().u()) {
                    x0u0Var = Boolean.valueOf(playbackSettingsEsperantoService$StreamSettingChange.o().q());
                }
                o4u0Var.b = 1;
                return vr20Var.emit(x0u0Var, o4u0Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof z4u0) {
                    z4u0Var = (z4u0) lnmVar;
                    int i45 = z4u0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        z4u0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        z4u0Var = new z4u0(this, lnmVar);
                    }
                } else {
                    z4u0Var = new z4u0(this, lnmVar);
                }
                Object obj24 = z4u0Var.a;
                int i46 = z4u0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                t4u0 t4u0Var = (t4u0) obj;
                Boolean bool = t4u0Var.h.a;
                Boolean boolValueOf8 = Boolean.valueOf(bool != null ? bool.booleanValue() : t4u0Var.e == xzc0.a);
                z4u0Var.b = 1;
                return vr20Var.emit(boolValueOf8, z4u0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof y6u0) {
                    y6u0Var = (y6u0) lnmVar;
                    int i47 = y6u0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        y6u0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        y6u0Var = new y6u0(this, lnmVar);
                    }
                } else {
                    y6u0Var = new y6u0(this, lnmVar);
                }
                Object obj25 = y6u0Var.a;
                int i48 = y6u0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (!(obj instanceof r6u0)) {
                    return rih1Var;
                }
                y6u0Var.b = 1;
                return vr20Var.emit(obj, y6u0Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof j7u0) {
                    j7u0Var = (j7u0) lnmVar;
                    int i49 = j7u0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        j7u0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        j7u0Var = new j7u0(this, lnmVar);
                    }
                } else {
                    j7u0Var = new j7u0(this, lnmVar);
                }
                Object obj26 = j7u0Var.a;
                int i50 = j7u0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                PlayerState playerState2 = (PlayerState) obj;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf9 = Boolean.valueOf(z);
                j7u0Var.b = 1;
                return vr20Var.emit(boolValueOf9, j7u0Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof fcu0) {
                    fcu0Var = (fcu0) lnmVar;
                    int i51 = fcu0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        fcu0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        fcu0Var = new fcu0(this, lnmVar);
                    }
                } else {
                    fcu0Var = new fcu0(this, lnmVar);
                }
                Object obj27 = fcu0Var.a;
                int i52 = fcu0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                CharSequence charSequence = (CharSequence) ((PlayerState) obj).contextMetadata().get("player.arch");
                Boolean boolValueOf10 = Boolean.valueOf(!(charSequence == null || ihc1.y0(charSequence)));
                fcu0Var.b = 1;
                return vr20Var.emit(boolValueOf10, fcu0Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof ldu0) {
                    ldu0Var = (ldu0) lnmVar;
                    int i53 = ldu0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        ldu0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        ldu0Var = new ldu0(this, lnmVar);
                    }
                } else {
                    ldu0Var = new ldu0(this, lnmVar);
                }
                Object obj28 = ldu0Var.a;
                int i54 = ldu0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                PlayerState playerState3 = (PlayerState) obj;
                if (playerState3.isPlaying() && !playerState3.isPaused()) {
                    z = true;
                }
                mmr0 mmr0Var2 = new mmr0(Boolean.valueOf(z), playerState3.playOrigin().featureIdentifier());
                ldu0Var.b = 1;
                return vr20Var.emit(mmr0Var2, ldu0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof sdu0) {
                    sdu0Var = (sdu0) lnmVar;
                    int i55 = sdu0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        sdu0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        sdu0Var = new sdu0(this, lnmVar);
                    }
                } else {
                    sdu0Var = new sdu0(this, lnmVar);
                }
                Object obj29 = sdu0Var.a;
                int i56 = sdu0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                PlayerState playerState4 = (PlayerState) obj;
                String strContextUri = playerState4.contextUri();
                if (strContextUri != null && strContextUri.length() != 0 && (contextTrack = (ContextTrack) playerState4.track().h()) != null) {
                    x0u0Var = new z3p0(playerState4.contextUri(), contextTrack.uri(), ihc1.Y0(contextTrack.uid(), ':'));
                }
                sdu0Var.b = 1;
                return vr20Var.emit(x0u0Var, sdu0Var) == d9nVar ? d9nVar : rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (lnmVar instanceof beu0) {
                    beu0Var = (beu0) lnmVar;
                    int i57 = beu0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        beu0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        beu0Var = new beu0(this, lnmVar);
                    }
                } else {
                    beu0Var = new beu0(this, lnmVar);
                }
                Object obj30 = beu0Var.a;
                int i58 = beu0Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                mmr0 mmr0Var3 = (mmr0) obj;
                PlayerState playerState5 = (PlayerState) mmr0Var3.a;
                iko ikoVar = (iko) mmr0Var3.b;
                ContextTrack contextTrack3 = (ContextTrack) playerState5.track().h();
                boolean zJ = contextTrack3 != null ? l4o1.J(contextTrack3) : false;
                spq0 spq0VarTrack = playerState5.track();
                xdu0 xdu0Var = new xdu0(spq0VarTrack.c() ? ((ContextTrack) spq0VarTrack.b()).uri() : "", playerState5.isPlaying(), playerState5.isPaused(), zJ, !playerState5.restrictions().disallowSkippingNextReasons().isEmpty(), !playerState5.restrictions().disallowSkippingPrevReasons().isEmpty(), !playerState5.restrictions().disallowSeekingReasons().isEmpty(), ikoVar);
                beu0Var.b = 1;
                return vr20Var.emit(xdu0Var, beu0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof seu0) {
                    seu0Var = (seu0) lnmVar;
                    int i59 = seu0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        seu0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        seu0Var = new seu0(this, lnmVar);
                    }
                } else {
                    seu0Var = new seu0(this, lnmVar);
                }
                Object obj31 = seu0Var.a;
                int i60 = seu0Var.b;
                if (i60 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf11 = Boolean.valueOf(((SleepTimer) obj) != null);
                    seu0Var.b = 1;
                    return vr20Var.emit(boolValueOf11, seu0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
