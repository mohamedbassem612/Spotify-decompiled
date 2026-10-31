package p;

import androidx.car.app.navigation.model.Maneuver;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages$InstallSpotifyStatusUpdate;
import com.spotify.connectivity.esperanto.proto.GetStateResponse;
import com.spotify.connectivity.quality.esperanto.proto.EsConnectionQualityService;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y0l implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public y0l(vr20 vr20Var, xll xllVar) {
        this.a = (byte) 21;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:145:0x0234  */
    /* JADX WARN: Code duplicated, block: B:163:0x0270  */
    /* JADX WARN: Code duplicated, block: B:184:0x02be  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:218:0x0331  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:255:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:284:0x042c  */
    /* JADX WARN: Code duplicated, block: B:304:0x047a  */
    /* JADX WARN: Code duplicated, block: B:321:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:340:0x0504  */
    /* JADX WARN: Code duplicated, block: B:360:0x054e  */
    /* JADX WARN: Code duplicated, block: B:375:0x058e  */
    /* JADX WARN: Code duplicated, block: B:395:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:415:0x062a  */
    /* JADX WARN: Code duplicated, block: B:430:0x0666  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:456:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:476:0x0715  */
    /* JADX WARN: Code duplicated, block: B:494:0x0761  */
    /* JADX WARN: Code duplicated, block: B:508:0x079d  */
    /* JADX WARN: Code duplicated, block: B:511:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:518:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:543:0x0830  */
    /* JADX WARN: Code duplicated, block: B:555:0x085c  */
    /* JADX WARN: Code duplicated, block: B:572:0x089d  */
    /* JADX WARN: Code duplicated, block: B:587:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:602:0x091d  */
    /* JADX WARN: Code duplicated, block: B:626:0x083d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x082a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:683:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final Object emit(Object obj, lnm lnmVar) {
        x0l x0lVar;
        z0l z0lVar;
        a1l a1lVar;
        b1l b1lVar;
        h2l h2lVar;
        ArrayList arrayList;
        b3l b3lVar;
        ao80 ao80Var;
        d3l d3lVar;
        i3l i3lVar;
        j3l j3lVar;
        c4l c4lVar;
        y5l y5lVar;
        e6l e6lVar;
        h6l h6lVar;
        i6l i6lVar;
        j8l j8lVar;
        k8l k8lVar;
        hal halVar;
        abl ablVar;
        sal qalVar;
        dcl dclVar;
        ywp0 ywp0Var;
        gcl gclVar;
        yil yilVar;
        wll wllVar;
        hix0 hix0Var;
        ywl ywlVar;
        zwl zwlVar;
        axl axlVar;
        bxl bxlVar;
        e1m e1mVar;
        e5m e5mVar;
        rlm rlmVar;
        slm slmVar;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        zmd zmdVar = null;
        sx50Var = null;
        sx50 sx50Var = null;
        nnrVar = null;
        nnr nnrVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof x0l) {
                    x0lVar = (x0l) lnmVar;
                    int i = x0lVar.b;
                    if ((i & os00.INVALID_ID) != 0) {
                        x0lVar.b = i - os00.INVALID_ID;
                    } else {
                        x0lVar = new x0l(this, lnmVar);
                    }
                } else {
                    x0lVar = new x0l(this, lnmVar);
                }
                Object obj3 = x0lVar.a;
                int i2 = x0lVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                mmr0 mmr0Var = (mmr0) obj;
                if (!u890.j(((ji0) mmr0Var.b).a, ((ContextTrack) mmr0Var.a).metadata().get("ad_id"))) {
                    return rih1Var;
                }
                x0lVar.b = 1;
                return vr20Var.emit(obj, x0lVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof z0l) {
                    z0lVar = (z0l) lnmVar;
                    int i3 = z0lVar.b;
                    if ((i3 & os00.INVALID_ID) != 0) {
                        z0lVar.b = i3 - os00.INVALID_ID;
                    } else {
                        z0lVar = new z0l(this, lnmVar);
                    }
                } else {
                    z0lVar = new z0l(this, lnmVar);
                }
                Object obj4 = z0lVar.a;
                int i4 = z0lVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                mmr0 mmr0Var2 = (mmr0) obj;
                z6l z6lVar = new z6l((ContextTrack) mmr0Var2.a, (ji0) mmr0Var2.b);
                z0lVar.b = 1;
                return vr20Var.emit(z6lVar, z0lVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof a1l) {
                    a1lVar = (a1l) lnmVar;
                    int i5 = a1lVar.b;
                    if ((i5 & os00.INVALID_ID) != 0) {
                        a1lVar.b = i5 - os00.INVALID_ID;
                    } else {
                        a1lVar = new a1l(this, lnmVar);
                    }
                } else {
                    a1lVar = new a1l(this, lnmVar);
                }
                Object obj5 = a1lVar.a;
                int i6 = a1lVar.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    v6l v6lVar = new v6l((ContextTrack) obj);
                    a1lVar.b = 1;
                    return vr20Var.emit(v6lVar, a1lVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof b1l) {
                    b1lVar = (b1l) lnmVar;
                    int i7 = b1lVar.b;
                    if ((i7 & os00.INVALID_ID) != 0) {
                        b1lVar.b = i7 - os00.INVALID_ID;
                    } else {
                        b1lVar = new b1l(this, lnmVar);
                    }
                } else {
                    b1lVar = new b1l(this, lnmVar);
                }
                Object obj6 = b1lVar.a;
                int i8 = b1lVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                Object objH = ((PlayerState) obj).track().h();
                if (objH == null) {
                    return rih1Var;
                }
                b1lVar.b = 1;
                return vr20Var.emit(objH, b1lVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof h2l) {
                    h2lVar = (h2l) lnmVar;
                    int i9 = h2lVar.b;
                    if ((i9 & os00.INVALID_ID) != 0) {
                        h2lVar.b = i9 - os00.INVALID_ID;
                    } else {
                        h2lVar = new h2l(this, lnmVar);
                    }
                } else {
                    h2lVar = new h2l(this, lnmVar);
                }
                Object obj7 = h2lVar.a;
                int i10 = h2lVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (Object obj8 : list2) {
                        if (!((l0l) obj8).l()) {
                            arrayList.add(obj8);
                        }
                    }
                } else {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                                if (!((l0l) obj8).l()) {
                                    arrayList.add(obj8);
                                }
                            }
                        } else if (((l0l) it.next()).isActive()) {
                            arrayList = new ArrayList();
                            for (Object obj9 : list2) {
                                if (!((l0l) obj9).isActive()) {
                                    arrayList.add(obj9);
                                }
                            }
                        }
                    }
                }
                h2lVar.b = 1;
                return vr20Var.emit(arrayList, h2lVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof b3l) {
                    b3lVar = (b3l) lnmVar;
                    int i11 = b3lVar.b;
                    if ((i11 & os00.INVALID_ID) != 0) {
                        b3lVar.b = i11 - os00.INVALID_ID;
                    } else {
                        b3lVar = new b3l(this, lnmVar);
                    }
                } else {
                    b3lVar = new b3l(this, lnmVar);
                }
                Object obj10 = b3lVar.a;
                int i12 = b3lVar.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                int iN = ((ConnectMessages$InstallSpotifyStatusUpdate) obj).n();
                for (Object obj11 : ao80.e) {
                    if (((ao80) obj11).a == iN) {
                        obj2 = obj11;
                        ao80Var = (ao80) obj2;
                        if (ao80Var == null) {
                            ao80Var = ao80.c;
                        }
                        b3lVar.b = 1;
                        if (vr20Var.emit(ao80Var, b3lVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                ao80Var = (ao80) obj2;
                if (ao80Var == null) {
                    ao80Var = ao80.c;
                }
                b3lVar.b = 1;
                if (vr20Var.emit(ao80Var, b3lVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof d3l) {
                    d3lVar = (d3l) lnmVar;
                    int i13 = d3lVar.b;
                    if ((i13 & os00.INVALID_ID) != 0) {
                        d3lVar.b = i13 - os00.INVALID_ID;
                    } else {
                        d3lVar = new d3l(this, lnmVar);
                    }
                } else {
                    d3lVar = new d3l(this, lnmVar);
                }
                Object obj12 = d3lVar.a;
                int i14 = d3lVar.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                l0l l0lVar = (l0l) ((spq0) obj).h();
                h1m1 h1m1Var = new h1m1(l0lVar != null ? Boolean.valueOf(l0lVar.l()) : null);
                d3lVar.b = 1;
                return vr20Var.emit(h1m1Var, d3lVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof i3l) {
                    i3lVar = (i3l) lnmVar;
                    int i15 = i3lVar.b;
                    if ((i15 & os00.INVALID_ID) != 0) {
                        i3lVar.b = i15 - os00.INVALID_ID;
                    } else {
                        i3lVar = new i3l(this, lnmVar);
                    }
                } else {
                    i3lVar = new i3l(this, lnmVar);
                }
                Object obj13 = i3lVar.a;
                int i16 = i3lVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                nnr nnrVar2 = (nnr) ((spq0) obj).h();
                if (nnrVar2 != null && nnrVar2.B.a.d == luq0.e) {
                    nnrVar = nnrVar2;
                }
                i3lVar.b = 1;
                return vr20Var.emit(nnrVar, i3lVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof j3l) {
                    j3lVar = (j3l) lnmVar;
                    int i17 = j3lVar.b;
                    if ((i17 & os00.INVALID_ID) != 0) {
                        j3lVar.b = i17 - os00.INVALID_ID;
                    } else {
                        j3lVar = new j3l(this, lnmVar);
                    }
                } else {
                    j3lVar = new j3l(this, lnmVar);
                }
                Object obj14 = j3lVar.a;
                int i18 = j3lVar.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                List list3 = (List) obj;
                list3.getClass();
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (!((l0l) it2.next()).l()) {
                            z = true;
                        }
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                j3lVar.b = 1;
                return vr20Var.emit(boolValueOf, j3lVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof c4l) {
                    c4lVar = (c4l) lnmVar;
                    int i19 = c4lVar.b;
                    if ((i19 & os00.INVALID_ID) != 0) {
                        c4lVar.b = i19 - os00.INVALID_ID;
                    } else {
                        c4lVar = new c4l(this, lnmVar);
                    }
                } else {
                    c4lVar = new c4l(this, lnmVar);
                }
                Object obj15 = c4lVar.a;
                int i20 = c4lVar.b;
                if (i20 == 0) {
                    hm5.M(obj15);
                    w0a0 w0a0Var = new w0a0((Set) obj);
                    c4lVar.b = 1;
                    return vr20Var.emit(w0a0Var, c4lVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof y5l) {
                    y5lVar = (y5l) lnmVar;
                    int i21 = y5lVar.b;
                    if ((i21 & os00.INVALID_ID) != 0) {
                        y5lVar.b = i21 - os00.INVALID_ID;
                    } else {
                        y5lVar = new y5l(this, lnmVar);
                    }
                } else {
                    y5lVar = new y5l(this, lnmVar);
                }
                Object obj16 = y5lVar.a;
                int i22 = y5lVar.b;
                if (i22 == 0) {
                    hm5.M(obj16);
                    byte[] bArr = (byte[]) obj;
                    try {
                        ConnectMessages$InstallSpotifyStatusUpdate connectMessages$InstallSpotifyStatusUpdateO = ConnectMessages$InstallSpotifyStatusUpdate.o(bArr);
                        y5lVar.b = 1;
                        return vr20Var.emit(connectMessages$InstallSpotifyStatusUpdateO, y5lVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.InstallSpotifyStatusUpdate: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i22 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 11:
                if (lnmVar instanceof e6l) {
                    e6lVar = (e6l) lnmVar;
                    int i23 = e6lVar.b;
                    if ((i23 & os00.INVALID_ID) != 0) {
                        e6lVar.b = i23 - os00.INVALID_ID;
                    } else {
                        e6lVar = new e6l(this, lnmVar);
                    }
                } else {
                    e6lVar = new e6l(this, lnmVar);
                }
                Object obj17 = e6lVar.a;
                int i24 = e6lVar.b;
                if (i24 == 0) {
                    hm5.M(obj17);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        ConnectMessages.StateResponse stateResponseT = ConnectMessages.StateResponse.t(bArr2);
                        e6lVar.b = 1;
                        return vr20Var.emit(stateResponseT, e6lVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.StateResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i24 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 12:
                if (lnmVar instanceof h6l) {
                    h6lVar = (h6l) lnmVar;
                    int i25 = h6lVar.b;
                    if ((i25 & os00.INVALID_ID) != 0) {
                        h6lVar.b = i25 - os00.INVALID_ID;
                    } else {
                        h6lVar = new h6l(this, lnmVar);
                    }
                } else {
                    h6lVar = new h6l(this, lnmVar);
                }
                Object obj18 = h6lVar.a;
                int i26 = h6lVar.b;
                if (i26 == 0) {
                    hm5.M(obj18);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    h6lVar.b = 1;
                    return vr20Var.emit(boolValueOf2, h6lVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof i6l) {
                    i6lVar = (i6l) lnmVar;
                    int i27 = i6lVar.b;
                    if ((i27 & os00.INVALID_ID) != 0) {
                        i6lVar.b = i27 - os00.INVALID_ID;
                    } else {
                        i6lVar = new i6l(this, lnmVar);
                    }
                } else {
                    i6lVar = new i6l(this, lnmVar);
                }
                Object obj19 = i6lVar.a;
                int i28 = i6lVar.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                l0l l0lVar2 = (l0l) ((spq0) obj).h();
                if (l0lVar2 != null && !l0lVar2.l()) {
                    z = true;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                i6lVar.b = 1;
                return vr20Var.emit(boolValueOf3, i6lVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof j8l) {
                    j8lVar = (j8l) lnmVar;
                    int i29 = j8lVar.b;
                    if ((i29 & os00.INVALID_ID) != 0) {
                        j8lVar.b = i29 - os00.INVALID_ID;
                    } else {
                        j8lVar = new j8l(this, lnmVar);
                    }
                } else {
                    j8lVar = new j8l(this, lnmVar);
                }
                Object obj20 = j8lVar.a;
                int i30 = j8lVar.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                l0l l0lVar3 = (l0l) ((spq0) obj).h();
                Boolean boolValueOf4 = l0lVar3 != null ? Boolean.valueOf(l0lVar3.l()) : null;
                if (boolValueOf4 == null) {
                    return rih1Var;
                }
                j8lVar.b = 1;
                return vr20Var.emit(boolValueOf4, j8lVar) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof k8l) {
                    k8lVar = (k8l) lnmVar;
                    int i31 = k8lVar.b;
                    if ((i31 & os00.INVALID_ID) != 0) {
                        k8lVar.b = i31 - os00.INVALID_ID;
                    } else {
                        k8lVar = new k8l(this, lnmVar);
                    }
                } else {
                    k8lVar = new k8l(this, lnmVar);
                }
                Object obj21 = k8lVar.a;
                int i32 = k8lVar.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                Object objH2 = ((PlayerState) obj).track().h();
                if (objH2 == null) {
                    return rih1Var;
                }
                k8lVar.b = 1;
                return vr20Var.emit(objH2, k8lVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof hal) {
                    halVar = (hal) lnmVar;
                    int i33 = halVar.b;
                    if ((i33 & os00.INVALID_ID) != 0) {
                        halVar.b = i33 - os00.INVALID_ID;
                    } else {
                        halVar = new hal(this, lnmVar);
                    }
                } else {
                    halVar = new hal(this, lnmVar);
                }
                Object obj22 = halVar.a;
                int i34 = halVar.b;
                if (i34 == 0) {
                    hm5.M(obj22);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        EsConnectionQualityService.ConnectionQualityEvent connectionQualityEventQ = EsConnectionQualityService.ConnectionQualityEvent.q(bArr3);
                        halVar.b = 1;
                        return vr20Var.emit(connectionQualityEventQ, halVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e3) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.quality.esperanto.proto.EsConnectionQualityService.ConnectionQualityEvent: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i34 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 17:
                if (lnmVar instanceof abl) {
                    ablVar = (abl) lnmVar;
                    int i35 = ablVar.b;
                    if ((i35 & os00.INVALID_ID) != 0) {
                        ablVar.b = i35 - os00.INVALID_ID;
                    } else {
                        ablVar = new abl(this, lnmVar);
                    }
                } else {
                    ablVar = new abl(this, lnmVar);
                }
                Object obj23 = ablVar.a;
                int i36 = ablVar.b;
                if (i36 == 0) {
                    hm5.M(obj23);
                    swz0 swz0Var = (uwz0) obj;
                    if (swz0Var instanceof twz0) {
                        qalVar = sal.a;
                    } else if (swz0Var instanceof swz0) {
                        fho0 fho0Var = swz0Var.a;
                        if (fho0Var.equals(dho0.a)) {
                            qalVar = new qal(1);
                        } else if (fho0Var instanceof eho0) {
                            qalVar = new qal(2);
                        } else {
                            eg.o();
                        }
                    } else {
                        eg.o();
                    }
                    ablVar.b = 1;
                    return vr20Var.emit(qalVar, ablVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof dcl) {
                    dclVar = (dcl) lnmVar;
                    int i37 = dclVar.b;
                    if ((i37 & os00.INVALID_ID) != 0) {
                        dclVar.b = i37 - os00.INVALID_ID;
                    } else {
                        dclVar = new dcl(this, lnmVar);
                    }
                } else {
                    dclVar = new dcl(this, lnmVar);
                }
                Object obj24 = dclVar.a;
                int i38 = dclVar.b;
                if (i38 == 0) {
                    hm5.M(obj24);
                    GetStateResponse getStateResponse = (GetStateResponse) obj;
                    if (getStateResponse.p() == iq40.b) {
                        String status = getStateResponse.getStatus();
                        if (status != null) {
                            int iHashCode = status.hashCode();
                            if (iHashCode != -1548612125) {
                                if (iHashCode != -1012222381) {
                                    if (iHashCode == -424567171 && status.equals("forced_offline")) {
                                        ywp0Var = new ywp0(3);
                                        dclVar.b = 1;
                                        if (vr20Var.emit(ywp0Var, dclVar) == d9nVar) {
                                            return d9nVar;
                                        }
                                        return rih1Var;
                                    }
                                } else if (status.equals("online")) {
                                    ywp0Var = new ywp0(1);
                                    dclVar.b = 1;
                                    if (vr20Var.emit(ywp0Var, dclVar) == d9nVar) {
                                        return d9nVar;
                                    }
                                    return rih1Var;
                                }
                            } else if (status.equals("offline")) {
                                ywp0Var = new ywp0(2);
                                dclVar.b = 1;
                                if (vr20Var.emit(ywp0Var, dclVar) == d9nVar) {
                                    return d9nVar;
                                }
                                return rih1Var;
                            }
                        }
                        eg.m(getStateResponse.getStatus());
                    } else {
                        eg.m(getStateResponse.o());
                    }
                } else {
                    if (i38 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 19:
                if (lnmVar instanceof gcl) {
                    gclVar = (gcl) lnmVar;
                    int i39 = gclVar.b;
                    if ((i39 & os00.INVALID_ID) != 0) {
                        gclVar.b = i39 - os00.INVALID_ID;
                    } else {
                        gclVar = new gcl(this, lnmVar);
                    }
                } else {
                    gclVar = new gcl(this, lnmVar);
                }
                Object obj25 = gclVar.a;
                int i40 = gclVar.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                gclVar.b = 1;
                return vr20Var.emit(obj, gclVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof yil) {
                    yilVar = (yil) lnmVar;
                    int i41 = yilVar.b;
                    if ((i41 & os00.INVALID_ID) != 0) {
                        yilVar.b = i41 - os00.INVALID_ID;
                    } else {
                        yilVar = new yil(this, lnmVar);
                    }
                } else {
                    yilVar = new yil(this, lnmVar);
                }
                Object obj26 = yilVar.a;
                int i42 = yilVar.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (!(obj instanceof njl)) {
                    return rih1Var;
                }
                yilVar.b = 1;
                return vr20Var.emit(obj, yilVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof wll) {
                    wllVar = (wll) lnmVar;
                    int i43 = wllVar.b;
                    if ((i43 & os00.INVALID_ID) != 0) {
                        wllVar.b = i43 - os00.INVALID_ID;
                    } else {
                        wllVar = new wll(this, lnmVar);
                    }
                } else {
                    wllVar = new wll(this, lnmVar);
                }
                Object obj27 = wllVar.a;
                int i44 = wllVar.b;
                if (i44 == 0) {
                    hm5.M(obj27);
                    i1r i1rVar = (k1r) obj;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    if (i1rVar2 != null && (hix0Var = (iix0) i1rVar2.a) != null) {
                        o3r o3rVar = xll.d;
                        boolean z2 = hix0Var instanceof hix0;
                        sx50 sx50Var2 = rx50.a;
                        if (z2) {
                            hix0 hix0Var2 = hix0Var;
                            if (hix0Var2.a) {
                                sx50Var = sx50Var2;
                            } else {
                                sx50Var = new tx50(hix0Var2.b);
                            }
                        } else if (hix0Var instanceof gix0) {
                            gix0 gix0Var = (gix0) hix0Var;
                            long j = gix0Var.b;
                            if (j <= 0 || gix0Var.c < j) {
                                sx50Var = new sx50(8, gix0Var.c, j);
                            } else {
                                sx50Var = sx50Var2;
                            }
                        } else {
                            eg.o();
                        }
                    }
                    if (sx50Var == null) {
                        return rih1Var;
                    }
                    wllVar.b = 1;
                    return vr20Var.emit(sx50Var, wllVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof ywl) {
                    ywlVar = (ywl) lnmVar;
                    int i45 = ywlVar.b;
                    if ((i45 & os00.INVALID_ID) != 0) {
                        ywlVar.b = i45 - os00.INVALID_ID;
                    } else {
                        ywlVar = new ywl(this, lnmVar);
                    }
                } else {
                    ywlVar = new ywl(this, lnmVar);
                }
                Object obj28 = ywlVar.a;
                int i46 = ywlVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!(((w5e0) obj) instanceof v5e0)) {
                    return rih1Var;
                }
                ywlVar.b = 1;
                return vr20Var.emit(obj, ywlVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof zwl) {
                    zwlVar = (zwl) lnmVar;
                    int i47 = zwlVar.b;
                    if ((i47 & os00.INVALID_ID) != 0) {
                        zwlVar.b = i47 - os00.INVALID_ID;
                    } else {
                        zwlVar = new zwl(this, lnmVar);
                    }
                } else {
                    zwlVar = new zwl(this, lnmVar);
                }
                Object obj29 = zwlVar.a;
                int i48 = zwlVar.b;
                if (i48 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf5 = Boolean.valueOf(((w5e0) obj) instanceof t5e0);
                    zwlVar.b = 1;
                    return vr20Var.emit(boolValueOf5, zwlVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof axl) {
                    axlVar = (axl) lnmVar;
                    int i49 = axlVar.b;
                    if ((i49 & os00.INVALID_ID) != 0) {
                        axlVar.b = i49 - os00.INVALID_ID;
                    } else {
                        axlVar = new axl(this, lnmVar);
                    }
                } else {
                    axlVar = new axl(this, lnmVar);
                }
                Object obj30 = axlVar.a;
                int i50 = axlVar.b;
                if (i50 == 0) {
                    hm5.M(obj30);
                    u7h u7hVar = new u7h(z4p1.e(((w5e0) obj).a.h));
                    axlVar.b = 1;
                    return vr20Var.emit(u7hVar, axlVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof bxl) {
                    bxlVar = (bxl) lnmVar;
                    int i51 = bxlVar.b;
                    if ((i51 & os00.INVALID_ID) != 0) {
                        bxlVar.b = i51 - os00.INVALID_ID;
                    } else {
                        bxlVar = new bxl(this, lnmVar);
                    }
                } else {
                    bxlVar = new bxl(this, lnmVar);
                }
                Object obj31 = bxlVar.a;
                int i52 = bxlVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                mno mnoVar = (mno) obj;
                if (mnoVar != null) {
                    int i53 = mnoVar.b;
                    zmdVar = new zmd(mnoVar.a, new tr80(0, i53, 1), new tr80(mnoVar.c, i53, 1));
                }
                if (zmdVar == null) {
                    return rih1Var;
                }
                bxlVar.b = 1;
                return vr20Var.emit(zmdVar, bxlVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof e1m) {
                    e1mVar = (e1m) lnmVar;
                    int i54 = e1mVar.b;
                    if ((i54 & os00.INVALID_ID) != 0) {
                        e1mVar.b = i54 - os00.INVALID_ID;
                    } else {
                        e1mVar = new e1m(this, lnmVar);
                    }
                } else {
                    e1mVar = new e1m(this, lnmVar);
                }
                Object obj32 = e1mVar.a;
                int i55 = e1mVar.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                e1mVar.b = 1;
                return vr20Var.emit(obj, e1mVar) == d9nVar ? d9nVar : rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (lnmVar instanceof e5m) {
                    e5mVar = (e5m) lnmVar;
                    int i56 = e5mVar.b;
                    if ((i56 & os00.INVALID_ID) != 0) {
                        e5mVar.b = i56 - os00.INVALID_ID;
                    } else {
                        e5mVar = new e5m(this, lnmVar);
                    }
                } else {
                    e5mVar = new e5m(this, lnmVar);
                }
                Object obj33 = e5mVar.a;
                int i57 = e5mVar.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                ResumptionProgressEsperanto.ContentResumedEvent contentResumedEvent = (ResumptionProgressEsperanto.ContentResumedEvent) obj;
                if (!contentResumedEvent.q() || !contentResumedEvent.n()) {
                    return rih1Var;
                }
                e5mVar.b = 1;
                return vr20Var.emit(obj, e5mVar) == d9nVar ? d9nVar : rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (lnmVar instanceof rlm) {
                    rlmVar = (rlm) lnmVar;
                    int i58 = rlmVar.b;
                    if ((i58 & os00.INVALID_ID) != 0) {
                        rlmVar.b = i58 - os00.INVALID_ID;
                    } else {
                        rlmVar = new rlm(this, lnmVar);
                    }
                } else {
                    rlmVar = new rlm(this, lnmVar);
                }
                Object obj34 = rlmVar.a;
                int i59 = rlmVar.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                Object objH3 = ((spq0) obj).h();
                if (objH3 == null) {
                    return rih1Var;
                }
                rlmVar.b = 1;
                return vr20Var.emit(objH3, rlmVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof slm) {
                    slmVar = (slm) lnmVar;
                    int i60 = slmVar.b;
                    if ((i60 & os00.INVALID_ID) != 0) {
                        slmVar.b = i60 - os00.INVALID_ID;
                    } else {
                        slmVar = new slm(this, lnmVar);
                    }
                } else {
                    slmVar = new slm(this, lnmVar);
                }
                Object obj35 = slmVar.a;
                int i61 = slmVar.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj35);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj35);
                Object objH4 = ((spq0) obj).h();
                if (objH4 == null) {
                    return rih1Var;
                }
                slmVar.b = 1;
                return vr20Var.emit(objH4, slmVar) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ y0l(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
