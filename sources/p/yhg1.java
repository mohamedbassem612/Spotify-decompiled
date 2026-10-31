package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yhg1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ yhg1(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x019b  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:138:0x0218  */
    /* JADX WARN: Code duplicated, block: B:153:0x0257  */
    /* JADX WARN: Code duplicated, block: B:168:0x0293  */
    /* JADX WARN: Code duplicated, block: B:183:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:198:0x0316  */
    /* JADX WARN: Code duplicated, block: B:224:0x038c  */
    /* JADX WARN: Code duplicated, block: B:244:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:259:0x041b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0452  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:317:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:332:0x052b  */
    /* JADX WARN: Code duplicated, block: B:347:0x0567  */
    /* JADX WARN: Code duplicated, block: B:364:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:381:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:399:0x0626  */
    /* JADX WARN: Code duplicated, block: B:414:0x0667  */
    /* JADX WARN: Code duplicated, block: B:429:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:444:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:461:0x0721  */
    /* JADX WARN: Code duplicated, block: B:478:0x0759  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:493:0x0794  */
    /* JADX WARN: Code duplicated, block: B:508:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:525:0x080a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final Object emit(Object obj, lnm lnmVar) {
        xhg1 xhg1Var;
        dng1 dng1Var;
        eng1 eng1Var;
        fng1 fng1Var;
        nng1 nng1Var;
        png1 png1Var;
        qng1 qng1Var;
        ipg1 ipg1Var;
        opg1 opg1Var;
        zpg1 zpg1Var;
        irg1 irg1Var;
        vtg1 vtg1Var;
        wtg1 wtg1Var;
        svg1 svg1Var;
        hxg1 hxg1Var;
        ixg1 ixg1Var;
        spq0 spq0VarTrack;
        ContextTrack contextTrack;
        w3h1 w3h1Var;
        z9h1 z9h1Var;
        cah1 cah1Var;
        dah1 dah1Var;
        au61 zt61Var;
        imh1 imh1Var;
        jmh1 jmh1Var;
        pmh1 pmh1Var;
        rqh1 rqh1Var;
        tqh1 tqh1Var;
        zqh1 zqh1Var;
        ysh1 ysh1Var;
        qmu0 qmu0Var;
        nuh1 nuh1Var;
        ouh1 ouh1Var;
        ywh1 ywh1Var;
        bro1 vk7Var;
        bro1 wk7Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        ath1 ath1Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof xhg1) {
                    xhg1Var = (xhg1) lnmVar;
                    int i = xhg1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xhg1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        xhg1Var = new xhg1(this, lnmVar);
                    }
                } else {
                    xhg1Var = new xhg1(this, lnmVar);
                }
                Object obj2 = xhg1Var.a;
                int i2 = xhg1Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                h290 h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : h290VarN) {
                    if (((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj3).hasPlaylist()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it.next()).e().getUri());
                }
                xhg1Var.b = 1;
                return vr20Var.emit(arrayList2, xhg1Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof dng1) {
                    dng1Var = (dng1) lnmVar;
                    int i3 = dng1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dng1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        dng1Var = new dng1(this, lnmVar);
                    }
                } else {
                    dng1Var = new dng1(this, lnmVar);
                }
                Object obj4 = dng1Var.a;
                int i4 = dng1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!(((k1r) obj) instanceof i1r)) {
                    return rih1Var;
                }
                dng1Var.b = 1;
                return vr20Var.emit(obj, dng1Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof eng1) {
                    eng1Var = (eng1) lnmVar;
                    int i5 = eng1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        eng1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        eng1Var = new eng1(this, lnmVar);
                    }
                } else {
                    eng1Var = new eng1(this, lnmVar);
                }
                Object obj5 = eng1Var.a;
                int i6 = eng1Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    Object objK = u890.k((k1r) obj, (d0r) null, (n4r) null);
                    eng1Var.b = 1;
                    return vr20Var.emit(objK, eng1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof fng1) {
                    fng1Var = (fng1) lnmVar;
                    int i7 = fng1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        fng1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        fng1Var = new fng1(this, lnmVar);
                    }
                } else {
                    fng1Var = new fng1(this, lnmVar);
                }
                Object obj6 = fng1Var.a;
                int i8 = fng1Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    f901 f901VarB = gng1.b((k8g1) obj);
                    fng1Var.b = 1;
                    return vr20Var.emit(f901VarB, fng1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof nng1) {
                    nng1Var = (nng1) lnmVar;
                    int i9 = nng1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nng1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        nng1Var = new nng1(this, lnmVar);
                    }
                } else {
                    nng1Var = new nng1(this, lnmVar);
                }
                Object obj7 = nng1Var.a;
                int i10 = nng1Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (!(obj instanceof jn41)) {
                    return rih1Var;
                }
                nng1Var.b = 1;
                return vr20Var.emit(obj, nng1Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof png1) {
                    png1Var = (png1) lnmVar;
                    int i11 = png1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        png1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        png1Var = new png1(this, lnmVar);
                    }
                } else {
                    png1Var = new png1(this, lnmVar);
                }
                Object obj8 = png1Var.a;
                int i12 = png1Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (!(obj instanceof lng1)) {
                    return rih1Var;
                }
                png1Var.b = 1;
                return vr20Var.emit(obj, png1Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof qng1) {
                    qng1Var = (qng1) lnmVar;
                    int i13 = qng1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qng1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        qng1Var = new qng1(this, lnmVar);
                    }
                } else {
                    qng1Var = new qng1(this, lnmVar);
                }
                Object obj9 = qng1Var.a;
                int i14 = qng1Var.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    String str = ((lng1) obj).a;
                    qng1Var.b = 1;
                    return vr20Var.emit(str, qng1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof ipg1) {
                    ipg1Var = (ipg1) lnmVar;
                    int i15 = ipg1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ipg1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        ipg1Var = new ipg1(this, lnmVar);
                    }
                } else {
                    ipg1Var = new ipg1(this, lnmVar);
                }
                Object obj10 = ipg1Var.a;
                int i16 = ipg1Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    ly50 ly50VarA = ly50.a((ly50) obj, iy50.b, true, false, 0, false, (px50) null, (by50) null, 252);
                    ipg1Var.b = 1;
                    return vr20Var.emit(ly50VarA, ipg1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof opg1) {
                    opg1Var = (opg1) lnmVar;
                    int i17 = opg1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        opg1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        opg1Var = new opg1(this, lnmVar);
                    }
                } else {
                    opg1Var = new opg1(this, lnmVar);
                }
                Object obj11 = opg1Var.a;
                int i18 = opg1Var.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf = Boolean.valueOf(d82.a(((m7e0) obj).b));
                    opg1Var.b = 1;
                    return vr20Var.emit(boolValueOf, opg1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof zpg1) {
                    zpg1Var = (zpg1) lnmVar;
                    int i19 = zpg1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        zpg1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        zpg1Var = new zpg1(this, lnmVar);
                    }
                } else {
                    zpg1Var = new zpg1(this, lnmVar);
                }
                Object obj12 = zpg1Var.a;
                int i20 = zpg1Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf2 = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                zpg1Var.b = 1;
                return vr20Var.emit(boolValueOf2, zpg1Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof irg1) {
                    irg1Var = (irg1) lnmVar;
                    int i21 = irg1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        irg1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        irg1Var = new irg1(this, lnmVar);
                    }
                } else {
                    irg1Var = new irg1(this, lnmVar);
                }
                Object obj13 = irg1Var.a;
                int i22 = irg1Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                irg1Var.b = 1;
                return vr20Var.emit(objG, irg1Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof vtg1) {
                    vtg1Var = (vtg1) lnmVar;
                    int i23 = vtg1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        vtg1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        vtg1Var = new vtg1(this, lnmVar);
                    }
                } else {
                    vtg1Var = new vtg1(this, lnmVar);
                }
                Object obj14 = vtg1Var.a;
                int i24 = vtg1Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                vtg1Var.b = 1;
                return vr20Var.emit(obj, vtg1Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof wtg1) {
                    wtg1Var = (wtg1) lnmVar;
                    int i25 = wtg1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        wtg1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        wtg1Var = new wtg1(this, lnmVar);
                    }
                } else {
                    wtg1Var = new wtg1(this, lnmVar);
                }
                Object obj15 = wtg1Var.a;
                int i26 = wtg1Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                ((Boolean) obj).getClass();
                exz exzVar = exz.a;
                wtg1Var.b = 1;
                return vr20Var.emit(exzVar, wtg1Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof svg1) {
                    svg1Var = (svg1) lnmVar;
                    int i27 = svg1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        svg1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        svg1Var = new svg1(this, lnmVar);
                    }
                } else {
                    svg1Var = new svg1(this, lnmVar);
                }
                Object obj16 = svg1Var.a;
                int i28 = svg1Var.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    mgn mgnVar = new mgn(((Number) obj).intValue());
                    svg1Var.b = 1;
                    return vr20Var.emit(mgnVar, svg1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof hxg1) {
                    hxg1Var = (hxg1) lnmVar;
                    int i29 = hxg1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        hxg1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        hxg1Var = new hxg1(this, lnmVar);
                    }
                } else {
                    hxg1Var = new hxg1(this, lnmVar);
                }
                Object obj17 = hxg1Var.a;
                int i30 = hxg1Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                hxg1Var.b = 1;
                return vr20Var.emit(obj, hxg1Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof ixg1) {
                    ixg1Var = (ixg1) lnmVar;
                    int i31 = ixg1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ixg1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        ixg1Var = new ixg1(this, lnmVar);
                    }
                } else {
                    ixg1Var = new ixg1(this, lnmVar);
                }
                Object obj18 = ixg1Var.a;
                int i32 = ixg1Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused() && (spq0VarTrack = playerState.track()) != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null && l4o1.X(contextTrack)) {
                    z = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                ixg1Var.b = 1;
                return vr20Var.emit(boolValueOf3, ixg1Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof w3h1) {
                    w3h1Var = (w3h1) lnmVar;
                    int i33 = w3h1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        w3h1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        w3h1Var = new w3h1(this, lnmVar);
                    }
                } else {
                    w3h1Var = new w3h1(this, lnmVar);
                }
                Object obj19 = w3h1Var.a;
                int i34 = w3h1Var.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    w3h1Var.b = 1;
                    return vr20Var.emit(obj, w3h1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof z9h1) {
                    z9h1Var = (z9h1) lnmVar;
                    int i35 = z9h1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        z9h1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        z9h1Var = new z9h1(this, lnmVar);
                    }
                } else {
                    z9h1Var = new z9h1(this, lnmVar);
                }
                Object obj20 = z9h1Var.a;
                int i36 = z9h1Var.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    e331 e331Var = new e331(new Integer(((w9h1) obj).b));
                    z9h1Var.b = 1;
                    return vr20Var.emit(e331Var, z9h1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof cah1) {
                    cah1Var = (cah1) lnmVar;
                    int i37 = cah1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        cah1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        cah1Var = new cah1(this, lnmVar);
                    }
                } else {
                    cah1Var = new cah1(this, lnmVar);
                }
                Object obj21 = cah1Var.a;
                int i38 = cah1Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                l0l l0lVar = (l0l) ((spq0) obj).h();
                if (l0lVar != null && !l0lVar.l()) {
                    z = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(!z);
                cah1Var.b = 1;
                return vr20Var.emit(boolValueOf4, cah1Var) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof dah1) {
                    dah1Var = (dah1) lnmVar;
                    int i39 = dah1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        dah1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        dah1Var = new dah1(this, lnmVar);
                    }
                } else {
                    dah1Var = new dah1(this, lnmVar);
                }
                Object obj22 = dah1Var.a;
                int i40 = dah1Var.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    hmx hmxVar = hmx.c;
                    Integer num = new Integer(a6o1.u(f0u.d));
                    Integer num2 = zBooleanValue ? new Integer(2131963441) : null;
                    if (zBooleanValue) {
                        zt61Var = new yt61();
                    } else if (zBooleanValue) {
                        eg.o();
                    } else {
                        zt61Var = new zt61();
                    }
                    bu61 bu61Var = new bu61(hmxVar, num, (String) null, num2, zt61Var, 20);
                    dah1Var.b = 1;
                    return vr20Var.emit(bu61Var, dah1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof imh1) {
                    imh1Var = (imh1) lnmVar;
                    int i41 = imh1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        imh1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        imh1Var = new imh1(this, lnmVar);
                    }
                } else {
                    imh1Var = new imh1(this, lnmVar);
                }
                Object obj23 = imh1Var.a;
                int i42 = imh1Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf5 = Boolean.valueOf(((PlayerState) obj).options().repeatingTrack());
                    imh1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, imh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof jmh1) {
                    jmh1Var = (jmh1) lnmVar;
                    int i43 = jmh1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        jmh1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        jmh1Var = new jmh1(this, lnmVar);
                    }
                } else {
                    jmh1Var = new jmh1(this, lnmVar);
                }
                Object obj24 = jmh1Var.a;
                int i44 = jmh1Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    h8z0 h8z0Var = new h8z0(((Boolean) obj).booleanValue());
                    jmh1Var.b = 1;
                    return vr20Var.emit(h8z0Var, jmh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof pmh1) {
                    pmh1Var = (pmh1) lnmVar;
                    int i45 = pmh1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        pmh1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        pmh1Var = new pmh1(this, lnmVar);
                    }
                } else {
                    pmh1Var = new pmh1(this, lnmVar);
                }
                Object obj25 = pmh1Var.a;
                int i46 = pmh1Var.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    hj50 hj50Var = new hj50((List) obj, (ioj0) null);
                    pmh1Var.b = 1;
                    return vr20Var.emit(hj50Var, pmh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof rqh1) {
                    rqh1Var = (rqh1) lnmVar;
                    int i47 = rqh1Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        rqh1Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        rqh1Var = new rqh1(this, lnmVar);
                    }
                } else {
                    rqh1Var = new rqh1(this, lnmVar);
                }
                Object obj26 = rqh1Var.a;
                int i48 = rqh1Var.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf6 = Boolean.valueOf(((EsOffline.Progress) obj).s());
                    rqh1Var.b = 1;
                    return vr20Var.emit(boolValueOf6, rqh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof tqh1) {
                    tqh1Var = (tqh1) lnmVar;
                    int i49 = tqh1Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        tqh1Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        tqh1Var = new tqh1(this, lnmVar);
                    }
                } else {
                    tqh1Var = new tqh1(this, lnmVar);
                }
                Object obj27 = tqh1Var.a;
                int i50 = tqh1Var.b;
                if (i50 == 0) {
                    hm5.M(obj27);
                    Boolean boolValueOf7 = Boolean.valueOf(((YourLibraryResponse) obj).a() > 0);
                    tqh1Var.b = 1;
                    return vr20Var.emit(boolValueOf7, tqh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof zqh1) {
                    zqh1Var = (zqh1) lnmVar;
                    int i51 = zqh1Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        zqh1Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        zqh1Var = new zqh1(this, lnmVar);
                    }
                } else {
                    zqh1Var = new zqh1(this, lnmVar);
                }
                Object obj28 = zqh1Var.a;
                int i52 = zqh1Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (((w8c0) obj) != w8c0.e) {
                    return rih1Var;
                }
                zqh1Var.b = 1;
                return vr20Var.emit(obj, zqh1Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof ysh1) {
                    ysh1Var = (ysh1) lnmVar;
                    int i53 = ysh1Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        ysh1Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        ysh1Var = new ysh1(this, lnmVar);
                    }
                } else {
                    ysh1Var = new ysh1(this, lnmVar);
                }
                Object obj29 = ysh1Var.a;
                int i54 = ysh1Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null && (qmu0Var = (qmu0) i1rVar2.a) != null) {
                    ath1Var = new ath1(qmu0Var.a, qmu0Var.b);
                }
                if (ath1Var == null) {
                    return rih1Var;
                }
                ysh1Var.b = 1;
                return vr20Var.emit(ath1Var, ysh1Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof nuh1) {
                    nuh1Var = (nuh1) lnmVar;
                    int i55 = nuh1Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        nuh1Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        nuh1Var = new nuh1(this, lnmVar);
                    }
                } else {
                    nuh1Var = new nuh1(this, lnmVar);
                }
                Object obj30 = nuh1Var.a;
                int i56 = nuh1Var.b;
                if (i56 == 0) {
                    hm5.M(obj30);
                    cuh1 cuh1Var = new cuh1(((Boolean) obj).booleanValue());
                    nuh1Var.b = 1;
                    return vr20Var.emit(cuh1Var, nuh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof ouh1) {
                    ouh1Var = (ouh1) lnmVar;
                    int i57 = ouh1Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        ouh1Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        ouh1Var = new ouh1(this, lnmVar);
                    }
                } else {
                    ouh1Var = new ouh1(this, lnmVar);
                }
                Object obj31 = ouh1Var.a;
                int i58 = ouh1Var.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    iuh1 iuh1Var = new iuh1(((Boolean) obj).booleanValue());
                    ouh1Var.b = 1;
                    return vr20Var.emit(iuh1Var, ouh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof ywh1) {
                    ywh1Var = (ywh1) lnmVar;
                    int i59 = ywh1Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ywh1Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        ywh1Var = new ywh1(this, lnmVar);
                    }
                } else {
                    ywh1Var = new ywh1(this, lnmVar);
                }
                Object obj32 = ywh1Var.a;
                int i60 = ywh1Var.b;
                if (i60 == 0) {
                    hm5.M(obj32);
                    cyh1 cyh1Var = (dyh1) obj;
                    if (cyh1Var instanceof ayh1) {
                        vk7Var = yk7.b;
                    } else if (cyh1Var instanceof cyh1) {
                        vk7Var = new al7(cyh1Var.b);
                    } else if (cyh1Var instanceof byh1) {
                        byh1 byh1Var = (byh1) cyh1Var;
                        String str2 = byh1Var.b;
                        String str3 = byh1Var.a;
                        if (ihc1.y0(str3)) {
                            vk7Var = new vk7(str2);
                        } else {
                            wk7Var = new zk7(str3, str2);
                            vk7Var = wk7Var;
                        }
                    } else if (cyh1Var instanceof zxh1) {
                        zxh1 zxh1Var = (zxh1) cyh1Var;
                        String str4 = zxh1Var.b;
                        lk7 lk7Var = zxh1Var.a;
                        if (lk7Var instanceof jk7) {
                            wk7Var = new wk7(str4, ((jk7) lk7Var).a);
                            vk7Var = wk7Var;
                        } else if (lk7Var.equals(kk7.a)) {
                            vk7Var = new vk7(str4);
                        } else {
                            eg.o();
                        }
                    } else {
                        eg.o();
                    }
                    mwh1 mwh1Var = new mwh1(vk7Var);
                    ywh1Var.b = 1;
                    return vr20Var.emit(mwh1Var, ywh1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ yhg1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
