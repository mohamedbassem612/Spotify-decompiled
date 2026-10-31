package p;

import com.spotify.offline.utilcore.SubscribeContextsException;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oq0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ oq0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:138:0x026c  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:183:0x0333  */
    /* JADX WARN: Code duplicated, block: B:201:0x0375  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:234:0x0406  */
    /* JADX WARN: Code duplicated, block: B:241:0x0419  */
    /* JADX WARN: Code duplicated, block: B:264:0x0460  */
    /* JADX WARN: Code duplicated, block: B:279:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:304:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:319:0x0537  */
    /* JADX WARN: Code duplicated, block: B:338:0x057c  */
    /* JADX WARN: Code duplicated, block: B:353:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:368:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:388:0x0648  */
    /* JADX WARN: Code duplicated, block: B:403:0x0683  */
    /* JADX WARN: Code duplicated, block: B:418:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:433:0x0706  */
    /* JADX WARN: Code duplicated, block: B:450:0x0743  */
    /* JADX WARN: Code duplicated, block: B:467:0x077e  */
    /* JADX WARN: Code duplicated, block: B:490:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:549:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) throws NoWhenBranchMatchedException {
        nq0 nq0Var;
        u83 u83Var;
        Set setP1;
        bz3 bz3Var;
        cj7 cj7Var;
        g6a g6aVar;
        ycd ycdVar;
        qhd qhdVar;
        ckm ckmVar;
        zio zioVar;
        rzs rzsVar;
        nax naxVar;
        p010 p010Var;
        i110 i110Var;
        ld10 ld10Var;
        vw80 vw80Var;
        r5a0 r5a0Var;
        spq0 spq0VarA;
        c0d0 c0d0Var;
        ere0 ere0Var;
        hdk0 hdk0Var;
        qgn0 qgn0Var;
        ayp0 ayp0Var;
        m231 m231Var;
        w3x0 w3x0Var;
        uoz0 uoz0Var;
        ywz0 ywz0Var;
        mx11 mx11Var;
        jq41 jq41Var;
        eh81 eh81Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof nq0) {
                    nq0Var = (nq0) lnmVar;
                    int i = nq0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nq0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        nq0Var = new nq0(this, lnmVar);
                    }
                } else {
                    nq0Var = new nq0(this, lnmVar);
                }
                Object obj3 = nq0Var.a;
                int i2 = nq0Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    ji0 ji0VarA = ((g780) obj).a();
                    nq0Var.b = 1;
                    return vr20Var.emit(ji0VarA, nq0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof u83) {
                    u83Var = (u83) lnmVar;
                    int i3 = u83Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u83Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        u83Var = new u83(this, lnmVar);
                    }
                } else {
                    u83Var = new u83(this, lnmVar);
                }
                Object obj4 = u83Var.a;
                int i4 = u83Var.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    hc91 hc91Var = (jc91) obj;
                    if (hc91Var instanceof hc91) {
                        setP1 = o7h.p1(hc91Var.a());
                    } else if (hc91Var instanceof ic91) {
                        setP1 = w7x.a;
                    } else {
                        eg.o();
                    }
                    u83Var.b = 1;
                    return vr20Var.emit(setP1, u83Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof bz3) {
                    bz3Var = (bz3) lnmVar;
                    int i5 = bz3Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bz3Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        bz3Var = new bz3(this, lnmVar);
                    }
                } else {
                    bz3Var = new bz3(this, lnmVar);
                }
                Object obj5 = bz3Var.a;
                int i6 = bz3Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (((qt80) obj) instanceof ty20) {
                    return rih1Var;
                }
                bz3Var.b = 1;
                return vr20Var.emit(obj, bz3Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof cj7) {
                    cj7Var = (cj7) lnmVar;
                    int i7 = cj7Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        cj7Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        cj7Var = new cj7(this, lnmVar);
                    }
                } else {
                    cj7Var = new cj7(this, lnmVar);
                }
                Object obj6 = cj7Var.a;
                int i8 = cj7Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                cj7Var.b = 1;
                return vr20Var.emit(obj, cj7Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof g6a) {
                    g6aVar = (g6a) lnmVar;
                    int i9 = g6aVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        g6aVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        g6aVar = new g6a(this, lnmVar);
                    }
                } else {
                    g6aVar = new g6a(this, lnmVar);
                }
                Object obj7 = g6aVar.a;
                int i10 = g6aVar.b;
                if (i10 == 0) {
                    hm5.M(obj7);
                    f6a f6aVar = new f6a((z7a) obj);
                    g6aVar.b = 1;
                    return vr20Var.emit(f6aVar, g6aVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof ycd) {
                    ycdVar = (ycd) lnmVar;
                    int i11 = ycdVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ycdVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        ycdVar = new ycd(this, lnmVar);
                    }
                } else {
                    ycdVar = new ycd(this, lnmVar);
                }
                Object obj8 = ycdVar.a;
                int i12 = ycdVar.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    Boolean boolM = yah0.m(u890.j(((Map) obj).get("campfire-requires-child-protection"), "1"));
                    ycdVar.b = 1;
                    return vr20Var.emit(boolM, ycdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof qhd) {
                    qhdVar = (qhd) lnmVar;
                    int i13 = qhdVar.c;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qhdVar.c = i13 - Integer.MIN_VALUE;
                    } else {
                        qhdVar = new qhd(this, lnmVar);
                    }
                } else {
                    qhdVar = new qhd(this, lnmVar);
                }
                Object obj9 = qhdVar.a;
                int i14 = qhdVar.c;
                if (i14 == 0) {
                    hm5.M(obj9);
                    op71.x(qhdVar.getContext());
                    qhdVar.c = 1;
                    return vr20Var.emit(obj, qhdVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof ckm) {
                    ckmVar = (ckm) lnmVar;
                    int i15 = ckmVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ckmVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        ckmVar = new ckm(this, lnmVar);
                    }
                } else {
                    ckmVar = new ckm(this, lnmVar);
                }
                Object obj10 = ckmVar.a;
                int i16 = ckmVar.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsContextPlayerState.ContextPlayerState contextPlayerStateZ = EsContextPlayerState.ContextPlayerState.Z(bArr);
                        ckmVar.b = 1;
                        return vr20Var.emit(contextPlayerStateZ, ckmVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerState.ContextPlayerState: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i16 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                if (lnmVar instanceof zio) {
                    zioVar = (zio) lnmVar;
                    int i17 = zioVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        zioVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        zioVar = new zio(this, lnmVar);
                    }
                } else {
                    zioVar = new zio(this, lnmVar);
                }
                Object obj11 = zioVar.a;
                int i18 = zioVar.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    e331 e331Var = new e331(obj);
                    zioVar.b = 1;
                    return vr20Var.emit(e331Var, zioVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof rzs) {
                    rzsVar = (rzs) lnmVar;
                    int i19 = rzsVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        rzsVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        rzsVar = new rzs(this, lnmVar);
                    }
                } else {
                    rzsVar = new rzs(this, lnmVar);
                }
                Object obj12 = rzsVar.a;
                int i20 = rzsVar.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    Float fO = yah0.o(((float) ((Double) obj).doubleValue()) * 100.0f);
                    rzsVar.b = 1;
                    return vr20Var.emit(fO, rzsVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof nax) {
                    naxVar = (nax) lnmVar;
                    int i21 = naxVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        naxVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        naxVar = new nax(this, lnmVar);
                    }
                } else {
                    naxVar = new nax(this, lnmVar);
                }
                Object obj13 = naxVar.a;
                int i22 = naxVar.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    iax gaxVar = ((Boolean) obj).booleanValue() ? iax.a : new gax((Integer) null, (String) null);
                    naxVar.b = 1;
                    return vr20Var.emit(gaxVar, naxVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof p010) {
                    p010Var = (p010) lnmVar;
                    int i23 = p010Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        p010Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        p010Var = new p010(this, lnmVar);
                    }
                } else {
                    p010Var = new p010(this, lnmVar);
                }
                Object obj14 = p010Var.a;
                int i24 = p010Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    dvl1 dvl1Var = new dvl1(((Number) o390.c1.invoke(obj)).longValue(), obj);
                    p010Var.b = 1;
                    return vr20Var.emit(dvl1Var, p010Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof i110) {
                    i110Var = (i110) lnmVar;
                    int i25 = i110Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        i110Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        i110Var = new i110(this, lnmVar);
                    }
                } else {
                    i110Var = new i110(this, lnmVar);
                }
                Object obj15 = i110Var.a;
                int i26 = i110Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    pyc pycVar = (syc) obj;
                    if (pycVar instanceof pyc) {
                        obj2 = pycVar.a;
                    } else if (pycVar instanceof qyc) {
                        obj2 = ((qyc) pycVar).a;
                    } else if (!(pycVar instanceof ryc)) {
                        eg.o();
                    }
                    i110Var.b = 1;
                    return vr20Var.emit(obj2, i110Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof ld10) {
                    ld10Var = (ld10) lnmVar;
                    int i27 = ld10Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ld10Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        ld10Var = new ld10(this, lnmVar);
                    }
                } else {
                    ld10Var = new ld10(this, lnmVar);
                }
                Object obj16 = ld10Var.a;
                int i28 = ld10Var.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    hd10 hd10Var = new hd10(((Boolean) obj).booleanValue());
                    ld10Var.b = 1;
                    return vr20Var.emit(hd10Var, ld10Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                Object objEmit = vr20Var.emit(obj, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 15:
                if (lnmVar instanceof vw80) {
                    vw80Var = (vw80) lnmVar;
                    int i29 = vw80Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        vw80Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        vw80Var = new vw80(this, lnmVar);
                    }
                } else {
                    vw80Var = new vw80(this, lnmVar);
                }
                Object obj17 = vw80Var.a;
                int i30 = vw80Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                e090 e090Var = (e090) obj;
                if (!(e090Var instanceof b090) && !(e090Var instanceof a090)) {
                    return rih1Var;
                }
                vw80Var.b = 1;
                return vr20Var.emit(obj, vw80Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof r5a0) {
                    r5a0Var = (r5a0) lnmVar;
                    int i31 = r5a0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        r5a0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        r5a0Var = new r5a0(this, lnmVar);
                    }
                } else {
                    r5a0Var = new r5a0(this, lnmVar);
                }
                Object obj18 = r5a0Var.a;
                int i32 = r5a0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                List list = (List) obj;
                list.getClass();
                for (Object obj19 : list) {
                    if (((l0l) obj19).l()) {
                        obj2 = obj19;
                        spq0VarA = spq0.a(obj2);
                        r5a0Var.b = 1;
                        if (vr20Var.emit(spq0VarA, r5a0Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                spq0VarA = spq0.a(obj2);
                r5a0Var.b = 1;
                if (vr20Var.emit(spq0VarA, r5a0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 17:
                if (lnmVar instanceof c0d0) {
                    c0d0Var = (c0d0) lnmVar;
                    int i33 = c0d0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        c0d0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        c0d0Var = new c0d0(this, lnmVar);
                    }
                } else {
                    c0d0Var = new c0d0(this, lnmVar);
                }
                Object obj20 = c0d0Var.a;
                int i34 = c0d0Var.b;
                if (i34 == 0) {
                    hm5.M(obj20);
                    Map mapT = ((Boolean) obj).booleanValue() ? zno1.t(oqn1.n("playlist_video_toggle", "true")) : b7x.a;
                    c0d0Var.b = 1;
                    return vr20Var.emit(mapT, c0d0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof ere0) {
                    ere0Var = (ere0) lnmVar;
                    int i35 = ere0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ere0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        ere0Var = new ere0(this, lnmVar);
                    }
                } else {
                    ere0Var = new ere0(this, lnmVar);
                }
                Object obj21 = ere0Var.a;
                int i36 = ere0Var.b;
                if (i36 == 0) {
                    hm5.M(obj21);
                    Boolean boolM2 = yah0.m(((String) obj).length() > 0);
                    ere0Var.b = 1;
                    return vr20Var.emit(boolM2, ere0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                Object objEmit2 = vr20Var.emit(dt3.e1.invoke((bp90) obj), lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 20:
                Object objEmit3 = vr20Var.emit(k74.b.invoke(obj), lnmVar);
                return objEmit3 == d9nVar ? objEmit3 : rih1Var;
            case 21:
                if (lnmVar instanceof hdk0) {
                    hdk0Var = (hdk0) lnmVar;
                    int i37 = hdk0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        hdk0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        hdk0Var = new hdk0(this, lnmVar);
                    }
                } else {
                    hdk0Var = new hdk0(this, lnmVar);
                }
                Object obj22 = hdk0Var.a;
                int i38 = hdk0Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                EsContextPlayerState.ContextPlayerState contextPlayerState = (EsContextPlayerState.ContextPlayerState) obj;
                yck0 zck0Var = i3p1.o(contextPlayerState) ? yck0.a : i3p1.q(contextPlayerState) ? new zck0(contextPlayerState.getTimestamp(), contextPlayerState.J().o(), contextPlayerState.S().o().getUri(), i3p1.p(contextPlayerState)) : adk0.a;
                hdk0Var.b = 1;
                return vr20Var.emit(zck0Var, hdk0Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof qgn0) {
                    qgn0Var = (qgn0) lnmVar;
                    int i39 = qgn0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qgn0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        qgn0Var = new qgn0(this, lnmVar);
                    }
                } else {
                    qgn0Var = new qgn0(this, lnmVar);
                }
                Object obj23 = qgn0Var.a;
                int i40 = qgn0Var.b;
                if (i40 == 0) {
                    hm5.M(obj23);
                    Boolean boolM3 = yah0.m(((pgn0) obj) instanceof ngn0);
                    qgn0Var.b = 1;
                    return vr20Var.emit(boolM3, qgn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof ayp0) {
                    ayp0Var = (ayp0) lnmVar;
                    int i41 = ayp0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ayp0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        ayp0Var = new ayp0(this, lnmVar);
                    }
                } else {
                    ayp0Var = new ayp0(this, lnmVar);
                }
                Object obj24 = ayp0Var.a;
                int i42 = ayp0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                EsOffline.GetContextsResponse getContextsResponse = (EsOffline.GetContextsResponse) obj;
                if (getContextsResponse.q() > 0) {
                    m231Var = new m231(new SubscribeContextsException(getContextsResponse.q()));
                } else {
                    h290<EsOffline.ContextInfo> h290VarP = getContextsResponse.p();
                    int iS = zno1.s(q7h.U(h290VarP, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    m231 linkedHashMap = new LinkedHashMap(iS);
                    for (EsOffline.ContextInfo contextInfo : h290VarP) {
                        mmr0 mmr0VarN = oqn1.n(contextInfo.o().getUri(), cqg0.c(contextInfo.o()));
                        linkedHashMap.put(mmr0VarN.a, mmr0VarN.b);
                    }
                    m231Var = linkedHashMap;
                }
                e331 e331Var2 = new e331(m231Var);
                ayp0Var.b = 1;
                return vr20Var.emit(e331Var2, ayp0Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof w3x0) {
                    w3x0Var = (w3x0) lnmVar;
                    int i43 = w3x0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        w3x0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        w3x0Var = new w3x0(this, lnmVar);
                    }
                } else {
                    w3x0Var = new w3x0(this, lnmVar);
                }
                Object obj25 = w3x0Var.a;
                int i44 = w3x0Var.b;
                if (i44 == 0) {
                    hm5.M(obj25);
                    Object objA = ((bdx0) obj).a();
                    w3x0Var.b = 1;
                    return vr20Var.emit(objA, w3x0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof uoz0) {
                    uoz0Var = (uoz0) lnmVar;
                    int i45 = uoz0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        uoz0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        uoz0Var = new uoz0(this, lnmVar);
                    }
                } else {
                    uoz0Var = new uoz0(this, lnmVar);
                }
                Object obj26 = uoz0Var.a;
                int i46 = uoz0Var.b;
                if (i46 == 0) {
                    hm5.M(obj26);
                    Boolean boolM4 = yah0.m(y7y0.I((String) obj));
                    uoz0Var.b = 1;
                    return vr20Var.emit(boolM4, uoz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof ywz0) {
                    ywz0Var = (ywz0) lnmVar;
                    int i47 = ywz0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ywz0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        ywz0Var = new ywz0(this, lnmVar);
                    }
                } else {
                    ywz0Var = new ywz0(this, lnmVar);
                }
                Object obj27 = ywz0Var.a;
                int i48 = ywz0Var.b;
                if (i48 == 0) {
                    hm5.M(obj27);
                    Boolean boolM5 = yah0.m(((uwz0) obj) instanceof twz0);
                    ywz0Var.b = 1;
                    return vr20Var.emit(boolM5, ywz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof mx11) {
                    mx11Var = (mx11) lnmVar;
                    int i49 = mx11Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        mx11Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        mx11Var = new mx11(this, lnmVar);
                    }
                } else {
                    mx11Var = new mx11(this, lnmVar);
                }
                Object obj28 = mx11Var.a;
                int i50 = mx11Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                List items = ((yw11) obj).getItems();
                ArrayList arrayList = new ArrayList();
                for (Object obj29 : items) {
                    if (obj29 instanceof ux11) {
                        arrayList.add(obj29);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ux11) it.next()).getUri());
                }
                mx11Var.b = 1;
                return vr20Var.emit(arrayList2, mx11Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof jq41) {
                    jq41Var = (jq41) lnmVar;
                    int i51 = jq41Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        jq41Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        jq41Var = new jq41(this, lnmVar);
                    }
                } else {
                    jq41Var = new jq41(this, lnmVar);
                }
                Object obj30 = jq41Var.a;
                int i52 = jq41Var.b;
                if (i52 == 0) {
                    hm5.M(obj30);
                    jq41Var.b = 1;
                    return vr20Var.emit(rih1Var, jq41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof eh81) {
                    eh81Var = (eh81) lnmVar;
                    int i53 = eh81Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        eh81Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        eh81Var = new eh81(this, lnmVar);
                    }
                } else {
                    eh81Var = new eh81(this, lnmVar);
                }
                Object obj31 = eh81Var.a;
                int i54 = eh81Var.b;
                if (i54 == 0) {
                    hm5.M(obj31);
                    Boolean boolM6 = yah0.m(((w8c0) obj) == w8c0.e);
                    eh81Var.b = 1;
                    return vr20Var.emit(boolM6, eh81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ oq0(vr20 vr20Var, zob1 zob1Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
