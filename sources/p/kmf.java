package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsContextTrack;
import com.spotify.player.esperanto.proto.EsProvidedTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kmf implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ kmf(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:128:0x0204  */
    /* JADX WARN: Code duplicated, block: B:143:0x0240  */
    /* JADX WARN: Code duplicated, block: B:165:0x0288  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:209:0x0318  */
    /* JADX WARN: Code duplicated, block: B:231:0x0360  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:284:0x0422  */
    /* JADX WARN: Code duplicated, block: B:301:0x045f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:324:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:344:0x0538  */
    /* JADX WARN: Code duplicated, block: B:370:0x059e  */
    /* JADX WARN: Code duplicated, block: B:385:0x05de  */
    /* JADX WARN: Code duplicated, block: B:400:0x061a  */
    /* JADX WARN: Code duplicated, block: B:415:0x065b  */
    /* JADX WARN: Code duplicated, block: B:430:0x0698  */
    /* JADX WARN: Code duplicated, block: B:445:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:462:0x0703  */
    /* JADX WARN: Code duplicated, block: B:472:0x071f  */
    /* JADX WARN: Code duplicated, block: B:490:0x075d  */
    /* JADX WARN: Code duplicated, block: B:508:0x079b  */
    /* JADX WARN: Code duplicated, block: B:535:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:553:0x083d  */
    /* JADX WARN: Code duplicated, block: B:572:0x0886  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:587:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:605:0x0902  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final Object emit(Object obj, lnm lnmVar) {
        jmf jmfVar;
        epf epfVar;
        usf usfVar;
        etf etfVar;
        ntf ntfVar;
        fvf fvfVar;
        wsc0 wsc0Var;
        i0g i0gVar;
        k0g k0gVar;
        l0g l0gVar;
        r1g r1gVar;
        c2g c2gVar;
        d2g d2gVar;
        a3g a3gVar;
        e3g e3gVar;
        h3g h3gVar;
        l3g l3gVar;
        eag eagVar;
        EsContextTrack.ContextTrack contextTrackO;
        String uri;
        qbg qbgVar;
        wbg wbgVar;
        vgg vggVar;
        yng yngVar;
        ppg ppgVar;
        upg upgVar;
        vpg vpgVar;
        wpg wpgVar;
        jqg jqgVar;
        tvg tvgVar;
        uvg uvgVar;
        h0h h0hVar;
        PlayabilityRestriction playabilityRestriction;
        String str;
        String str2;
        fbp1 fbp1Var;
        o1v o1vVar;
        j0h j0hVar;
        byte b = this.a;
        h0g h0gVar = h0g.a;
        h0g h0gVar2 = h0g.b;
        String str3 = "";
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (lnmVar instanceof jmf) {
                    jmfVar = (jmf) lnmVar;
                    int i = jmfVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jmfVar.b = i - Integer.MIN_VALUE;
                    } else {
                        jmfVar = new jmf(this, lnmVar);
                    }
                } else {
                    jmfVar = new jmf(this, lnmVar);
                }
                Object obj2 = jmfVar.a;
                int i2 = jmfVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Boolean boolValueOf = Boolean.valueOf(u890.j((k9d0) obj, i9d0.a));
                    jmfVar.b = 1;
                    return vr20Var.emit(boolValueOf, jmfVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof epf) {
                    epfVar = (epf) lnmVar;
                    int i3 = epfVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        epfVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        epfVar = new epf(this, lnmVar);
                    }
                } else {
                    epfVar = new epf(this, lnmVar);
                }
                Object obj3 = epfVar.a;
                int i4 = epfVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                w7x w7xVar = (Set) ((cma1) obj).a;
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                epfVar.b = 1;
                return vr20Var.emit(w7xVar, epfVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof usf) {
                    usfVar = (usf) lnmVar;
                    int i5 = usfVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        usfVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        usfVar = new usf(this, lnmVar);
                    }
                } else {
                    usfVar = new usf(this, lnmVar);
                }
                Object obj4 = usfVar.a;
                int i6 = usfVar.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf2 = Boolean.valueOf(((bp90) obj).b);
                    usfVar.b = 1;
                    return vr20Var.emit(boolValueOf2, usfVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof etf) {
                    etfVar = (etf) lnmVar;
                    int i7 = etfVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        etfVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        etfVar = new etf(this, lnmVar);
                    }
                } else {
                    etfVar = new etf(this, lnmVar);
                }
                Object obj5 = etfVar.a;
                int i8 = etfVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                Object obj6 = ((e331) obj).a;
                i1f i1fVar = e331.a(obj6) == null ? new i1f((goe) obj6) : f1f.a;
                etfVar.b = 1;
                return vr20Var.emit(i1fVar, etfVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof ntf) {
                    ntfVar = (ntf) lnmVar;
                    int i9 = ntfVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ntfVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        ntfVar = new ntf(this, lnmVar);
                    }
                } else {
                    ntfVar = new ntf(this, lnmVar);
                }
                Object obj7 = ntfVar.a;
                int i10 = ntfVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                ContextTrack contextTrackCreate = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrackCreate == null) {
                    contextTrackCreate = ContextTrack.create("");
                }
                ntfVar.b = 1;
                return vr20Var.emit(contextTrackCreate, ntfVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof fvf) {
                    fvfVar = (fvf) lnmVar;
                    int i11 = fvfVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        fvfVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        fvfVar = new fvf(this, lnmVar);
                    }
                } else {
                    fvfVar = new fvf(this, lnmVar);
                }
                Object obj8 = fvfVar.a;
                int i12 = fvfVar.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                spq0 spq0VarTrack = ((PlayerState) obj).track();
                wsc0Var = spq0VarTrack != null ? (ContextTrack) spq0VarTrack.h() : null;
                evf evfVar = (wsc0Var == null || !l4o1.X(wsc0Var)) ? evf.a : l4o1.P(wsc0Var) ? evf.c : evf.b;
                fvfVar.b = 1;
                return vr20Var.emit(evfVar, fvfVar) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof i0g) {
                    i0gVar = (i0g) lnmVar;
                    int i13 = i0gVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        i0gVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        i0gVar = new i0g(this, lnmVar);
                    }
                } else {
                    i0gVar = new i0g(this, lnmVar);
                }
                Object obj9 = i0gVar.a;
                int i14 = i0gVar.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf3 = Boolean.valueOf(((h0g) obj) == h0gVar2);
                    i0gVar.b = 1;
                    return vr20Var.emit(boolValueOf3, i0gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof k0g) {
                    k0gVar = (k0g) lnmVar;
                    int i15 = k0gVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        k0gVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        k0gVar = new k0g(this, lnmVar);
                    }
                } else {
                    k0gVar = new k0g(this, lnmVar);
                }
                Object obj10 = k0gVar.a;
                int i16 = k0gVar.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf4 = Boolean.valueOf(((h0g) obj) == h0gVar);
                    k0gVar.b = 1;
                    return vr20Var.emit(boolValueOf4, k0gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof l0g) {
                    l0gVar = (l0g) lnmVar;
                    int i17 = l0gVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        l0gVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        l0gVar = new l0g(this, lnmVar);
                    }
                } else {
                    l0gVar = new l0g(this, lnmVar);
                }
                Object obj11 = l0gVar.a;
                int i18 = l0gVar.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                int iOrdinal = ((xa50) obj).ordinal();
                if (iOrdinal != 1 && iOrdinal != 5) {
                    if (iOrdinal == 6) {
                        h0gVar = h0gVar2;
                    } else if (iOrdinal != 7) {
                        if (iOrdinal != 8) {
                            h0gVar = h0g.c;
                        } else {
                            h0gVar = h0gVar2;
                        }
                    }
                }
                l0gVar.b = 1;
                return vr20Var.emit(h0gVar, l0gVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof r1g) {
                    r1gVar = (r1g) lnmVar;
                    int i19 = r1gVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        r1gVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        r1gVar = new r1g(this, lnmVar);
                    }
                } else {
                    r1gVar = new r1g(this, lnmVar);
                }
                Object obj12 = r1gVar.a;
                int i20 = r1gVar.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    r1gVar.b = 1;
                    return vr20Var.emit(g1g.a, r1gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof c2g) {
                    c2gVar = (c2g) lnmVar;
                    int i21 = c2gVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c2gVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        c2gVar = new c2g(this, lnmVar);
                    }
                } else {
                    c2gVar = new c2g(this, lnmVar);
                }
                Object obj13 = c2gVar.a;
                int i22 = c2gVar.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf5 = Boolean.valueOf(((vir0) obj) instanceof sir0);
                    c2gVar.b = 1;
                    return vr20Var.emit(boolValueOf5, c2gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (lnmVar instanceof d2g) {
                    d2gVar = (d2g) lnmVar;
                    int i23 = d2gVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        d2gVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        d2gVar = new d2g(this, lnmVar);
                    }
                } else {
                    d2gVar = new d2g(this, lnmVar);
                }
                Object obj14 = d2gVar.a;
                int i24 = d2gVar.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf6 = Boolean.valueOf(((w8c0) obj).a(w8c0.e));
                    d2gVar.b = 1;
                    return vr20Var.emit(boolValueOf6, d2gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case grn1.d /* 12 */:
                if (lnmVar instanceof a3g) {
                    a3gVar = (a3g) lnmVar;
                    int i25 = a3gVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        a3gVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        a3gVar = new a3g(this, lnmVar);
                    }
                } else {
                    a3gVar = new a3g(this, lnmVar);
                }
                Object obj15 = a3gVar.a;
                int i26 = a3gVar.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    TreeMap treeMap = new TreeMap((Map) obj);
                    a3gVar.b = 1;
                    return vr20Var.emit(treeMap, a3gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof e3g) {
                    e3gVar = (e3g) lnmVar;
                    int i27 = e3gVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        e3gVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        e3gVar = new e3g(this, lnmVar);
                    }
                } else {
                    e3gVar = new e3g(this, lnmVar);
                }
                Object obj16 = e3gVar.a;
                int i28 = e3gVar.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    Boolean boolValueOf7 = Boolean.valueOf(!((Map) obj).isEmpty());
                    e3gVar.b = 1;
                    return vr20Var.emit(boolValueOf7, e3gVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof h3g) {
                    h3gVar = (h3g) lnmVar;
                    int i29 = h3gVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        h3gVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        h3gVar = new h3g(this, lnmVar);
                    }
                } else {
                    h3gVar = new h3g(this, lnmVar);
                }
                Object obj17 = h3gVar.a;
                int i30 = h3gVar.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            z = true;
                        }
                    }
                }
                Boolean boolValueOf8 = Boolean.valueOf(z);
                h3gVar.b = 1;
                return vr20Var.emit(boolValueOf8, h3gVar) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof l3g) {
                    l3gVar = (l3g) lnmVar;
                    int i31 = l3gVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        l3gVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        l3gVar = new l3g(this, lnmVar);
                    }
                } else {
                    l3gVar = new l3g(this, lnmVar);
                }
                Object obj18 = l3gVar.a;
                int i32 = l3gVar.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                wsc0 wsc0Var2 = (k1r) obj;
                wsc0Var = wsc0Var2 instanceof i1r ? (i1r) wsc0Var2 : null;
                Boolean boolValueOf9 = Boolean.valueOf(wsc0Var != null ? ((Boolean) ((i1r) wsc0Var).a).booleanValue() : false);
                l3gVar.b = 1;
                return vr20Var.emit(boolValueOf9, l3gVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof eag) {
                    eagVar = (eag) lnmVar;
                    int i33 = eagVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eagVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        eagVar = new eag(this, lnmVar);
                    }
                } else {
                    eagVar = new eag(this, lnmVar);
                }
                Object obj19 = eagVar.a;
                int i34 = eagVar.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                EsContextPlayerState.ContextPlayerState contextPlayerState = (EsContextPlayerState.ContextPlayerState) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                EsProvidedTrack.ProvidedTrack providedTrackS = contextPlayerState.S();
                if (providedTrackS != null && (contextTrackO = providedTrackS.o()) != null && (uri = contextTrackO.getUri()) != null) {
                    str3 = uri;
                }
                String string = new uga0(linkedHashMap).toString();
                eagVar.b = 1;
                return vr20Var.emit(string, eagVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof qbg) {
                    qbgVar = (qbg) lnmVar;
                    int i35 = qbgVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        qbgVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        qbgVar = new qbg(this, lnmVar);
                    }
                } else {
                    qbgVar = new qbg(this, lnmVar);
                }
                Object obj20 = qbgVar.a;
                int i36 = qbgVar.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                qbgVar.b = 1;
                return vr20Var.emit(obj, qbgVar) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof wbg) {
                    wbgVar = (wbg) lnmVar;
                    int i37 = wbgVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        wbgVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        wbgVar = new wbg(this, lnmVar);
                    }
                } else {
                    wbgVar = new wbg(this, lnmVar);
                }
                Object obj21 = wbgVar.a;
                int i38 = wbgVar.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    jbg jbgVar = new jbg(((Boolean) obj).booleanValue());
                    wbgVar.b = 1;
                    return vr20Var.emit(jbgVar, wbgVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof vgg) {
                    vggVar = (vgg) lnmVar;
                    int i39 = vggVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        vggVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        vggVar = new vgg(this, lnmVar);
                    }
                } else {
                    vggVar = new vgg(this, lnmVar);
                }
                Object obj22 = vggVar.a;
                int i40 = vggVar.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    Boolean boolValueOf10 = Boolean.valueOf(((p0d0) obj).a == cob1.a);
                    vggVar.b = 1;
                    return vr20Var.emit(boolValueOf10, vggVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof yng) {
                    yngVar = (yng) lnmVar;
                    int i41 = yngVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        yngVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        yngVar = new yng(this, lnmVar);
                    }
                } else {
                    yngVar = new yng(this, lnmVar);
                }
                Object obj23 = yngVar.a;
                int i42 = yngVar.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i8g1 i8g1Var = (i8g1) obj;
                if ((i8g1Var instanceof g8g1) || (i8g1Var instanceof h8g1)) {
                    return rih1Var;
                }
                yngVar.b = 1;
                return vr20Var.emit(obj, yngVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof ppg) {
                    ppgVar = (ppg) lnmVar;
                    int i43 = ppgVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ppgVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        ppgVar = new ppg(this, lnmVar);
                    }
                } else {
                    ppgVar = new ppg(this, lnmVar);
                }
                Object obj24 = ppgVar.a;
                int i44 = ppgVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                wsc0Var = i1rVar2 != null ? (Set) i1rVar2.a : null;
                if (wsc0Var == null) {
                    return rih1Var;
                }
                ppgVar.b = 1;
                return vr20Var.emit(wsc0Var, ppgVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof upg) {
                    upgVar = (upg) lnmVar;
                    int i45 = upgVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        upgVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        upgVar = new upg(this, lnmVar);
                    }
                } else {
                    upgVar = new upg(this, lnmVar);
                }
                Object obj25 = upgVar.a;
                int i46 = upgVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                wsc0Var = i1rVar4 != null ? (Set) i1rVar4.a : null;
                if (wsc0Var == null) {
                    return rih1Var;
                }
                upgVar.b = 1;
                return vr20Var.emit(wsc0Var, upgVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof vpg) {
                    vpgVar = (vpg) lnmVar;
                    int i47 = vpgVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        vpgVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        vpgVar = new vpg(this, lnmVar);
                    }
                } else {
                    vpgVar = new vpg(this, lnmVar);
                }
                Object obj26 = vpgVar.a;
                int i48 = vpgVar.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                i1r i1rVar5 = (k1r) obj;
                i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                wsc0Var = i1rVar6 != null ? (g3d0) i1rVar6.a : null;
                if (wsc0Var == null) {
                    return rih1Var;
                }
                vpgVar.b = 1;
                return vr20Var.emit(wsc0Var, vpgVar) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof wpg) {
                    wpgVar = (wpg) lnmVar;
                    int i49 = wpgVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        wpgVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        wpgVar = new wpg(this, lnmVar);
                    }
                } else {
                    wpgVar = new wpg(this, lnmVar);
                }
                Object obj27 = wpgVar.a;
                int i50 = wpgVar.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                i1r i1rVar7 = (k1r) obj;
                i1r i1rVar8 = i1rVar7 instanceof i1r ? i1rVar7 : null;
                wsc0Var = i1rVar8 != null ? (Set) i1rVar8.a : null;
                if (wsc0Var == null) {
                    return rih1Var;
                }
                wpgVar.b = 1;
                return vr20Var.emit(wsc0Var, wpgVar) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof jqg) {
                    jqgVar = (jqg) lnmVar;
                    int i51 = jqgVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        jqgVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        jqgVar = new jqg(this, lnmVar);
                    }
                } else {
                    jqgVar = new jqg(this, lnmVar);
                }
                Object obj28 = jqgVar.a;
                int i52 = jqgVar.b;
                if (i52 == 0) {
                    hm5.M(obj28);
                    hj50 hj50Var = new hj50((List) obj, (ioj0) null);
                    jqgVar.b = 1;
                    return vr20Var.emit(hj50Var, jqgVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof tvg) {
                    tvgVar = (tvg) lnmVar;
                    int i53 = tvgVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        tvgVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        tvgVar = new tvg(this, lnmVar);
                    }
                } else {
                    tvgVar = new tvg(this, lnmVar);
                }
                Object obj29 = tvgVar.a;
                int i54 = tvgVar.b;
                if (i54 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf11 = Boolean.valueOf(((czl1) obj).b);
                    tvgVar.b = 1;
                    return vr20Var.emit(boolValueOf11, tvgVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof uvg) {
                    uvgVar = (uvg) lnmVar;
                    int i55 = uvgVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        uvgVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        uvgVar = new uvg(this, lnmVar);
                    }
                } else {
                    uvgVar = new uvg(this, lnmVar);
                }
                Object obj30 = uvgVar.a;
                int i56 = uvgVar.b;
                if (i56 == 0) {
                    hm5.M(obj30);
                    g1m1 g1m1Var = new g1m1(((Boolean) obj).booleanValue());
                    uvgVar.b = 1;
                    return vr20Var.emit(g1m1Var, uvgVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof h0h) {
                    h0hVar = (h0h) lnmVar;
                    int i57 = h0hVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        h0hVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        h0hVar = new h0h(this, lnmVar);
                    }
                } else {
                    h0hVar = new h0h(this, lnmVar);
                }
                Object obj31 = h0hVar.a;
                int i58 = h0hVar.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    List<zuc0> list = ((wsc0) obj).e;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (zuc0 zuc0Var : list) {
                        fjf1 fjf1Var = zuc0Var.p;
                        fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                        String str4 = zuc0Var.c;
                        String str5 = zuc0Var.a;
                        String str6 = zuc0Var.i;
                        boolean z2 = zuc0Var.k;
                        boolean zC = zuc0Var.c();
                        boolean zF = zuc0Var.f();
                        switch (zuc0Var.b().ordinal()) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                playabilityRestriction = PlayabilityRestriction.UNKNOWN;
                                PlayabilityRestriction playabilityRestriction2 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c) || fbp1Var.equals(qwp0.c)) {
                                    o1vVar = o1v.a;
                                } else if (fbp1Var.equals(iwp0.c) || fbp1Var.equals(uwp0.c)) {
                                    o1vVar = o1v.d;
                                } else if (fbp1Var instanceof kwp0) {
                                    o1vVar = o1v.c;
                                } else if ((fbp1Var instanceof wwp0) || fbp1Var.equals(owp0.c)) {
                                    o1vVar = o1v.b;
                                } else if (!fbp1Var.equals(mwp0.c)) {
                                    eg.o();
                                } else {
                                    o1vVar = o1v.e;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction2, str2, strA, o1vVar));
                                break;
                            case 1:
                                playabilityRestriction = PlayabilityRestriction.NO_RESTRICTION;
                                PlayabilityRestriction playabilityRestriction3 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA2 = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c)) {
                                    o1vVar = o1v.a;
                                } else {
                                    o1vVar = o1v.a;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction3, str2, strA2, o1vVar));
                                break;
                            case 2:
                                playabilityRestriction = PlayabilityRestriction.EXPLICIT_CONTENT;
                                PlayabilityRestriction playabilityRestriction4 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA3 = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c)) {
                                    o1vVar = o1v.a;
                                } else {
                                    o1vVar = o1v.a;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction4, str2, strA3, o1vVar));
                                break;
                            case 3:
                                playabilityRestriction = PlayabilityRestriction.AGE_RESTRICTED;
                                PlayabilityRestriction playabilityRestriction5 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA4 = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c)) {
                                    o1vVar = o1v.a;
                                } else {
                                    o1vVar = o1v.a;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction5, str2, strA4, o1vVar));
                                break;
                            case 4:
                                playabilityRestriction = PlayabilityRestriction.NOT_IN_CATALOGUE;
                                PlayabilityRestriction playabilityRestriction6 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA5 = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c)) {
                                    o1vVar = o1v.a;
                                } else {
                                    o1vVar = o1v.a;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction6, str2, strA5, o1vVar));
                                break;
                            case 5:
                                playabilityRestriction = PlayabilityRestriction.NOT_AVAILABLE_OFFLINE;
                                PlayabilityRestriction playabilityRestriction7 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA6 = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c)) {
                                    o1vVar = o1v.a;
                                } else {
                                    o1vVar = o1v.a;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction7, str2, strA6, o1vVar));
                                break;
                            case 6:
                                playabilityRestriction = PlayabilityRestriction.PREMIUM_ONLY;
                                PlayabilityRestriction playabilityRestriction8 = playabilityRestriction;
                                if (fjf1Var2 != null) {
                                    str = fjf1Var2.a.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                String strA7 = zuc0Var.a(1);
                                fbp1Var = zuc0Var.n;
                                if (!fbp1Var.equals(swp0.c)) {
                                    o1vVar = o1v.a;
                                } else {
                                    o1vVar = o1v.a;
                                }
                                arrayList.add(new fy6(str4, str5, str6, z2, zC, zF, playabilityRestriction8, str2, strA7, o1vVar));
                                break;
                            default:
                                eg.o();
                                break;
                        }
                    }
                    h0hVar.b = 1;
                    return vr20Var.emit(arrayList, h0hVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof j0h) {
                    j0hVar = (j0h) lnmVar;
                    int i59 = j0hVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        j0hVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        j0hVar = new j0h(this, lnmVar);
                    }
                } else {
                    j0hVar = new j0h(this, lnmVar);
                }
                Object obj32 = j0hVar.a;
                int i60 = j0hVar.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                oy21 oy21Var = (py21) obj;
                oy21 oy21Var2 = oy21Var instanceof oy21 ? oy21Var : null;
                wsc0Var = oy21Var2 != null ? (wsc0) oy21Var2.a : null;
                if (wsc0Var == null) {
                    return rih1Var;
                }
                j0hVar.b = 1;
                return vr20Var.emit(wsc0Var, j0hVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
