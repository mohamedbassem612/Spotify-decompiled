package p;

import androidx.car.app.navigation.model.Maneuver;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w0x implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ w0x(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0203  */
    /* JADX WARN: Code duplicated, block: B:163:0x023d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0281  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:226:0x0332  */
    /* JADX WARN: Code duplicated, block: B:241:0x0376  */
    /* JADX WARN: Code duplicated, block: B:267:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:291:0x0411  */
    /* JADX WARN: Code duplicated, block: B:313:0x0458  */
    /* JADX WARN: Code duplicated, block: B:332:0x0497  */
    /* JADX WARN: Code duplicated, block: B:347:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:362:0x050a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0545  */
    /* JADX WARN: Code duplicated, block: B:392:0x0584  */
    /* JADX WARN: Code duplicated, block: B:407:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:429:0x060e  */
    /* JADX WARN: Code duplicated, block: B:444:0x064d  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:459:0x068e  */
    /* JADX WARN: Code duplicated, block: B:477:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:492:0x0711  */
    /* JADX WARN: Code duplicated, block: B:507:0x0747  */
    /* JADX WARN: Code duplicated, block: B:528:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:543:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:558:0x0831  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:89:0x0138  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        v0x v0xVar;
        x0x x0xVar;
        c1x c1xVar;
        v1x v1xVar;
        PlayerState playerState;
        u2x u2xVar;
        v2x v2xVar;
        q0y q0yVar;
        s0y s0yVar;
        q2y q2yVar;
        gey geyVar;
        kby kbyVar;
        xmy xmyVar;
        ymy ymyVar;
        zmy zmyVar;
        bny bnyVar;
        kqy kqyVar;
        lqy lqyVar;
        mqy mqyVar;
        nqy nqyVar;
        ast0 ast0Var;
        pqy pqyVar;
        String str;
        qqy qqyVar;
        ity ityVar;
        zty ztyVar;
        iuy iuyVar;
        wuy wuyVar;
        zuy zuyVar;
        dvy dvyVar;
        fvy fvyVar;
        s5z s5zVar;
        Set setSingleton;
        g6z g6zVar;
        h6z h6zVar;
        byte b = this.a;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        j1r j1rVar = j1r.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object objO = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof v0x) {
                    v0xVar = (v0x) lnmVar;
                    int i2 = v0xVar.b;
                    if ((i2 & os00.INVALID_ID) != 0) {
                        v0xVar.b = i2 - os00.INVALID_ID;
                    } else {
                        v0xVar = new v0x(this, lnmVar);
                    }
                } else {
                    v0xVar = new v0x(this, lnmVar);
                }
                Object obj2 = v0xVar.a;
                int i3 = v0xVar.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                v0xVar.b = 1;
                return vr20Var.emit(obj, v0xVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof x0x) {
                    x0xVar = (x0x) lnmVar;
                    int i4 = x0xVar.b;
                    if ((i4 & os00.INVALID_ID) != 0) {
                        x0xVar.b = i4 - os00.INVALID_ID;
                    } else {
                        x0xVar = new x0x(this, lnmVar);
                    }
                } else {
                    x0xVar = new x0x(this, lnmVar);
                }
                Object obj3 = x0xVar.a;
                int i5 = x0xVar.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    Boolean bool = Boolean.FALSE;
                    x0xVar.b = 1;
                    return vr20Var.emit(bool, x0xVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof c1x) {
                    c1xVar = (c1x) lnmVar;
                    int i6 = c1xVar.b;
                    if ((i6 & os00.INVALID_ID) != 0) {
                        c1xVar.b = i6 - os00.INVALID_ID;
                    } else {
                        c1xVar = new c1x(this, lnmVar);
                    }
                } else {
                    c1xVar = new c1x(this, lnmVar);
                }
                Object obj4 = c1xVar.a;
                int i7 = c1xVar.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    spq0 spq0VarTrack = ((PlayerState) obj).track();
                    c1xVar.b = 1;
                    return vr20Var.emit(spq0VarTrack, c1xVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof v1x) {
                    v1xVar = (v1x) lnmVar;
                    int i8 = v1xVar.b;
                    if ((i8 & os00.INVALID_ID) != 0) {
                        v1xVar.b = i8 - os00.INVALID_ID;
                    } else {
                        v1xVar = new v1x(this, lnmVar);
                    }
                } else {
                    v1xVar = new v1x(this, lnmVar);
                }
                Object obj5 = v1xVar.a;
                int i9 = v1xVar.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    mmr0 mmr0Var = (mmr0) obj;
                    PlayerState playerState2 = (PlayerState) mmr0Var.a;
                    cnf1 cnf1Var = (cnf1) mmr0Var.b;
                    v1xVar.c = vr20Var;
                    v1xVar.f = playerState2;
                    v1xVar.d = 0;
                    v1xVar.b = 1;
                    lkd lkdVar = cnf1Var.a;
                    lkdVar.getClass();
                    hce1 hce1Var = cnf1Var.b;
                    Object objF = a4p1.f(playerState2, lkdVar, (fza1) hce1Var.c, ((j44) hce1Var.d).g(), v1xVar);
                    if (objF != d9nVar) {
                        playerState = playerState2;
                        obj5 = objF;
                    }
                    return d9nVar;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = v1xVar.d;
                playerState = v1xVar.f;
                vr20Var = v1xVar.c;
                hm5.M(obj5);
                mmr0 mmr0Var2 = new mmr0(obj5, playerState);
                v1xVar.c = null;
                v1xVar.f = null;
                v1xVar.d = i;
                v1xVar.b = 2;
                if (vr20Var.emit(mmr0Var2, v1xVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 4:
                if (lnmVar instanceof u2x) {
                    u2xVar = (u2x) lnmVar;
                    int i10 = u2xVar.b;
                    if ((i10 & os00.INVALID_ID) != 0) {
                        u2xVar.b = i10 - os00.INVALID_ID;
                    } else {
                        u2xVar = new u2x(this, lnmVar);
                    }
                } else {
                    u2xVar = new u2x(this, lnmVar);
                }
                Object obj6 = u2xVar.a;
                int i11 = u2xVar.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    u2xVar.b = 1;
                    return vr20Var.emit(rih1Var, u2xVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i11 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof v2x) {
                    v2xVar = (v2x) lnmVar;
                    int i12 = v2xVar.b;
                    if ((i12 & os00.INVALID_ID) != 0) {
                        v2xVar.b = i12 - os00.INVALID_ID;
                    } else {
                        v2xVar = new v2x(this, lnmVar);
                    }
                } else {
                    v2xVar = new v2x(this, lnmVar);
                }
                Object obj7 = v2xVar.a;
                int i13 = v2xVar.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    o6d1 o6d1Var = new o6d1(((Boolean) obj).booleanValue());
                    v2xVar.b = 1;
                    return vr20Var.emit(o6d1Var, v2xVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof q0y) {
                    q0yVar = (q0y) lnmVar;
                    int i14 = q0yVar.b;
                    if ((i14 & os00.INVALID_ID) != 0) {
                        q0yVar.b = i14 - os00.INVALID_ID;
                    } else {
                        q0yVar = new q0y(this, lnmVar);
                    }
                } else {
                    q0yVar = new q0y(this, lnmVar);
                }
                Object obj8 = q0yVar.a;
                int i15 = q0yVar.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                jn41 jn41Var = (ln41) obj;
                objO = jn41Var instanceof jn41 ? ((r2t) jn41Var.a).o() : null;
                q0yVar.b = 1;
                return vr20Var.emit(objO, q0yVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof s0y) {
                    s0yVar = (s0y) lnmVar;
                    int i16 = s0yVar.b;
                    if ((i16 & os00.INVALID_ID) != 0) {
                        s0yVar.b = i16 - os00.INVALID_ID;
                    } else {
                        s0yVar = new s0y(this, lnmVar);
                    }
                } else {
                    s0yVar = new s0y(this, lnmVar);
                }
                Object obj9 = s0yVar.a;
                int i17 = s0yVar.b;
                if (i17 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf = Boolean.valueOf(!u890.j((hnk0) obj, fnk0.a));
                    s0yVar.b = 1;
                    return vr20Var.emit(boolValueOf, s0yVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof q2y) {
                    q2yVar = (q2y) lnmVar;
                    int i18 = q2yVar.b;
                    if ((i18 & os00.INVALID_ID) != 0) {
                        q2yVar.b = i18 - os00.INVALID_ID;
                    } else {
                        q2yVar = new q2y(this, lnmVar);
                    }
                } else {
                    q2yVar = new q2y(this, lnmVar);
                }
                Object obj10 = q2yVar.a;
                int i19 = q2yVar.b;
                if (i19 == 0) {
                    hm5.M(obj10);
                    h2y h2yVar = new h2y(((Boolean) obj).booleanValue());
                    q2yVar.b = 1;
                    return vr20Var.emit(h2yVar, q2yVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof gey) {
                    geyVar = (gey) lnmVar;
                    int i20 = geyVar.b;
                    if ((i20 & os00.INVALID_ID) != 0) {
                        geyVar.b = i20 - os00.INVALID_ID;
                    } else {
                        geyVar = new gey(this, lnmVar);
                    }
                } else {
                    geyVar = new gey(this, lnmVar);
                }
                Object obj11 = geyVar.a;
                int i21 = geyVar.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                wsc0 wsc0Var = (wsc0) ((py21) obj).c();
                if (wsc0Var != null && (kbyVar = wsc0Var.f) != null && kbyVar.g) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                geyVar.b = 1;
                return vr20Var.emit(boolValueOf2, geyVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof xmy) {
                    xmyVar = (xmy) lnmVar;
                    int i22 = xmyVar.b;
                    if ((i22 & os00.INVALID_ID) != 0) {
                        xmyVar.b = i22 - os00.INVALID_ID;
                    } else {
                        xmyVar = new xmy(this, lnmVar);
                    }
                } else {
                    xmyVar = new xmy(this, lnmVar);
                }
                Object obj12 = xmyVar.a;
                int i23 = xmyVar.b;
                if (i23 == 0) {
                    hm5.M(obj12);
                    ufy ufyVar = new ufy(((Boolean) obj).booleanValue());
                    xmyVar.b = 1;
                    return vr20Var.emit(ufyVar, xmyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i23 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof ymy) {
                    ymyVar = (ymy) lnmVar;
                    int i24 = ymyVar.b;
                    if ((i24 & os00.INVALID_ID) != 0) {
                        ymyVar.b = i24 - os00.INVALID_ID;
                    } else {
                        ymyVar = new ymy(this, lnmVar);
                    }
                } else {
                    ymyVar = new ymy(this, lnmVar);
                }
                Object obj13 = ymyVar.a;
                int i25 = ymyVar.b;
                if (i25 == 0) {
                    hm5.M(obj13);
                    nfy nfyVar = new nfy(((Boolean) obj).booleanValue());
                    ymyVar.b = 1;
                    return vr20Var.emit(nfyVar, ymyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof zmy) {
                    zmyVar = (zmy) lnmVar;
                    int i26 = zmyVar.b;
                    if ((i26 & os00.INVALID_ID) != 0) {
                        zmyVar.b = i26 - os00.INVALID_ID;
                    } else {
                        zmyVar = new zmy(this, lnmVar);
                    }
                } else {
                    zmyVar = new zmy(this, lnmVar);
                }
                Object obj14 = zmyVar.a;
                int i27 = zmyVar.b;
                if (i27 == 0) {
                    hm5.M(obj14);
                    wfy wfyVar = new wfy((jf81) obj);
                    zmyVar.b = 1;
                    return vr20Var.emit(wfyVar, zmyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i27 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof bny) {
                    bnyVar = (bny) lnmVar;
                    int i28 = bnyVar.b;
                    if ((i28 & os00.INVALID_ID) != 0) {
                        bnyVar.b = i28 - os00.INVALID_ID;
                    } else {
                        bnyVar = new bny(this, lnmVar);
                    }
                } else {
                    bnyVar = new bny(this, lnmVar);
                }
                Object obj15 = bnyVar.a;
                int i29 = bnyVar.b;
                if (i29 == 0) {
                    hm5.M(obj15);
                    rfy rfyVar = new rfy((g1d0) obj);
                    bnyVar.b = 1;
                    return vr20Var.emit(rfyVar, bnyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof kqy) {
                    kqyVar = (kqy) lnmVar;
                    int i30 = kqyVar.b;
                    if ((i30 & os00.INVALID_ID) != 0) {
                        kqyVar.b = i30 - os00.INVALID_ID;
                    } else {
                        kqyVar = new kqy(this, lnmVar);
                    }
                } else {
                    kqyVar = new kqy(this, lnmVar);
                }
                Object obj16 = kqyVar.a;
                int i31 = kqyVar.b;
                if (i31 == 0) {
                    hm5.M(obj16);
                    Object obj17 = ((i1r) obj).a;
                    kqyVar.b = 1;
                    return vr20Var.emit(obj17, kqyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof lqy) {
                    lqyVar = (lqy) lnmVar;
                    int i32 = lqyVar.b;
                    if ((i32 & os00.INVALID_ID) != 0) {
                        lqyVar.b = i32 - os00.INVALID_ID;
                    } else {
                        lqyVar = new lqy(this, lnmVar);
                    }
                } else {
                    lqyVar = new lqy(this, lnmVar);
                }
                Object obj18 = lqyVar.a;
                int i33 = lqyVar.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                k1r k1rVar = (k1r) obj;
                objO = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                if (objO == null) {
                    return rih1Var;
                }
                lqyVar.b = 1;
                return vr20Var.emit(objO, lqyVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof mqy) {
                    mqyVar = (mqy) lnmVar;
                    int i34 = mqyVar.b;
                    if ((i34 & os00.INVALID_ID) != 0) {
                        mqyVar.b = i34 - os00.INVALID_ID;
                    } else {
                        mqyVar = new mqy(this, lnmVar);
                    }
                } else {
                    mqyVar = new mqy(this, lnmVar);
                }
                Object obj19 = mqyVar.a;
                int i35 = mqyVar.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                objO = i1rVar2 != null ? (zry) i1rVar2.a : null;
                if (objO == null) {
                    return rih1Var;
                }
                mqyVar.b = 1;
                return vr20Var.emit(objO, mqyVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof nqy) {
                    nqyVar = (nqy) lnmVar;
                    int i36 = nqyVar.b;
                    if ((i36 & os00.INVALID_ID) != 0) {
                        nqyVar.b = i36 - os00.INVALID_ID;
                    } else {
                        nqyVar = new nqy(this, lnmVar);
                    }
                } else {
                    nqyVar = new nqy(this, lnmVar);
                }
                Object obj20 = nqyVar.a;
                int i37 = nqyVar.b;
                if (i37 == 0) {
                    hm5.M(obj20);
                    int iOrdinal = ((rrt0) obj).ordinal();
                    if (iOrdinal == 0) {
                        ast0Var = ast0.a;
                    } else if (iOrdinal == 1) {
                        ast0Var = ast0.c;
                    } else if (iOrdinal == 2) {
                        ast0Var = ast0.b;
                    } else {
                        eg.o();
                    }
                    nqyVar.b = 1;
                    return vr20Var.emit(ast0Var, nqyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof pqy) {
                    pqyVar = (pqy) lnmVar;
                    int i38 = pqyVar.b;
                    if ((i38 & os00.INVALID_ID) != 0) {
                        pqyVar.b = i38 - os00.INVALID_ID;
                    } else {
                        pqyVar = new pqy(this, lnmVar);
                    }
                } else {
                    pqyVar = new pqy(this, lnmVar);
                }
                Object obj21 = pqyVar.a;
                int i39 = pqyVar.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar4 != null && (str = (String) i1rVar4.a) != null && str.length() > 0) {
                    objO = str;
                }
                if (objO == null) {
                    return rih1Var;
                }
                pqyVar.b = 1;
                return vr20Var.emit(objO, pqyVar) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof qqy) {
                    qqyVar = (qqy) lnmVar;
                    int i40 = qqyVar.b;
                    if ((i40 & os00.INVALID_ID) != 0) {
                        qqyVar.b = i40 - os00.INVALID_ID;
                    } else {
                        qqyVar = new qqy(this, lnmVar);
                    }
                } else {
                    qqyVar = new qqy(this, lnmVar);
                }
                Object obj22 = qqyVar.a;
                int i41 = qqyVar.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                uq30 uq30Var = new uq30((String) obj);
                List listSingletonList = Collections.singletonList(new h8k1(uq30Var, uq30Var));
                qqyVar.b = 1;
                return vr20Var.emit(listSingletonList, qqyVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof ity) {
                    ityVar = (ity) lnmVar;
                    int i42 = ityVar.b;
                    if ((i42 & os00.INVALID_ID) != 0) {
                        ityVar.b = i42 - os00.INVALID_ID;
                    } else {
                        ityVar = new ity(this, lnmVar);
                    }
                } else {
                    ityVar = new ity(this, lnmVar);
                }
                Object obj23 = ityVar.a;
                int i43 = ityVar.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i1r i1rVar5 = (k1r) obj;
                i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                objO = i1rVar6 != null ? i1rVar6.a : null;
                if (objO == null) {
                    return rih1Var;
                }
                ityVar.b = 1;
                return vr20Var.emit(objO, ityVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof zty) {
                    ztyVar = (zty) lnmVar;
                    int i44 = ztyVar.b;
                    if ((i44 & os00.INVALID_ID) != 0) {
                        ztyVar.b = i44 - os00.INVALID_ID;
                    } else {
                        ztyVar = new zty(this, lnmVar);
                    }
                } else {
                    ztyVar = new zty(this, lnmVar);
                }
                Object obj24 = ztyVar.a;
                int i45 = ztyVar.b;
                if (i45 == 0) {
                    hm5.M(obj24);
                    h1r h1rVar = (k1r) obj;
                    if (h1rVar instanceof h1r) {
                        objO = new e331(new m231(new Exception(h1rVar.a.getMessage())));
                    } else if (h1rVar instanceof i1r) {
                        objO = new e331(((i1r) h1rVar).a);
                    } else if (!u890.j(h1rVar, j1rVar)) {
                        eg.o();
                    }
                    if (objO == null) {
                        return rih1Var;
                    }
                    ztyVar.b = 1;
                    return vr20Var.emit(objO, ztyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof iuy) {
                    iuyVar = (iuy) lnmVar;
                    int i46 = iuyVar.b;
                    if ((i46 & os00.INVALID_ID) != 0) {
                        iuyVar.b = i46 - os00.INVALID_ID;
                    } else {
                        iuyVar = new iuy(this, lnmVar);
                    }
                } else {
                    iuyVar = new iuy(this, lnmVar);
                }
                Object obj25 = iuyVar.a;
                int i47 = iuyVar.b;
                if (i47 == 0) {
                    hm5.M(obj25);
                    String strUri = ((ContextTrack) ((PlayerState) obj).track().b()).uri();
                    iuyVar.b = 1;
                    return vr20Var.emit(strUri, iuyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i47 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof wuy) {
                    wuyVar = (wuy) lnmVar;
                    int i48 = wuyVar.b;
                    if ((i48 & os00.INVALID_ID) != 0) {
                        wuyVar.b = i48 - os00.INVALID_ID;
                    } else {
                        wuyVar = new wuy(this, lnmVar);
                    }
                } else {
                    wuyVar = new wuy(this, lnmVar);
                }
                Object obj26 = wuyVar.a;
                int i49 = wuyVar.b;
                if (i49 == 0) {
                    hm5.M(obj26);
                    String strA = ((suy) obj).a();
                    wuyVar.b = 1;
                    return vr20Var.emit(strA, wuyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i49 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof zuy) {
                    zuyVar = (zuy) lnmVar;
                    int i50 = zuyVar.b;
                    if ((i50 & os00.INVALID_ID) != 0) {
                        zuyVar.b = i50 - os00.INVALID_ID;
                    } else {
                        zuyVar = new zuy(this, lnmVar);
                    }
                } else {
                    zuyVar = new zuy(this, lnmVar);
                }
                Object obj27 = zuyVar.a;
                int i51 = zuyVar.b;
                if (i51 == 0) {
                    hm5.M(obj27);
                    Long l = new Long(((suy) obj).a);
                    zuyVar.b = 1;
                    return vr20Var.emit(l, zuyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i51 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof dvy) {
                    dvyVar = (dvy) lnmVar;
                    int i52 = dvyVar.b;
                    if ((i52 & os00.INVALID_ID) != 0) {
                        dvyVar.b = i52 - os00.INVALID_ID;
                    } else {
                        dvyVar = new dvy(this, lnmVar);
                    }
                } else {
                    dvyVar = new dvy(this, lnmVar);
                }
                Object obj28 = dvyVar.a;
                int i53 = dvyVar.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                i1r i1rVar7 = (k1r) obj;
                i1r i1rVar8 = i1rVar7 instanceof i1r ? i1rVar7 : null;
                objO = i1rVar8 != null ? (Set) i1rVar8.a : null;
                if (objO == null) {
                    return rih1Var;
                }
                dvyVar.b = 1;
                return vr20Var.emit(objO, dvyVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof fvy) {
                    fvyVar = (fvy) lnmVar;
                    int i54 = fvyVar.b;
                    if ((i54 & os00.INVALID_ID) != 0) {
                        fvyVar.b = i54 - os00.INVALID_ID;
                    } else {
                        fvyVar = new fvy(this, lnmVar);
                    }
                } else {
                    fvyVar = new fvy(this, lnmVar);
                }
                Object obj29 = fvyVar.a;
                int i55 = fvyVar.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                i1r i1rVar9 = (k1r) obj;
                i1r i1rVar10 = i1rVar9 instanceof i1r ? i1rVar9 : null;
                objO = i1rVar10 != null ? (g3d0) i1rVar10.a : null;
                if (objO == null) {
                    return rih1Var;
                }
                fvyVar.b = 1;
                return vr20Var.emit(objO, fvyVar) == d9nVar ? d9nVar : rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (lnmVar instanceof s5z) {
                    s5zVar = (s5z) lnmVar;
                    int i56 = s5zVar.b;
                    if ((i56 & os00.INVALID_ID) != 0) {
                        s5zVar.b = i56 - os00.INVALID_ID;
                    } else {
                        s5zVar = new s5z(this, lnmVar);
                    }
                } else {
                    s5zVar = new s5z(this, lnmVar);
                }
                Object obj30 = s5zVar.a;
                int i57 = s5zVar.b;
                if (i57 == 0) {
                    hm5.M(obj30);
                    int iOrdinal2 = ton1.y((pb31) obj).b.ordinal();
                    if (iOrdinal2 == 0) {
                        setSingleton = w7x.a;
                    } else if (iOrdinal2 == 1) {
                        setSingleton = Collections.singleton(pqc0.a);
                    } else if (iOrdinal2 == 2) {
                        setSingleton = Collections.singleton(drc0.a);
                    } else {
                        eg.o();
                    }
                    s5zVar.b = 1;
                    return vr20Var.emit(setSingleton, s5zVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (lnmVar instanceof g6z) {
                    g6zVar = (g6z) lnmVar;
                    int i58 = g6zVar.b;
                    if ((i58 & os00.INVALID_ID) != 0) {
                        g6zVar.b = i58 - os00.INVALID_ID;
                    } else {
                        g6zVar = new g6z(this, lnmVar);
                    }
                } else {
                    g6zVar = new g6z(this, lnmVar);
                }
                Object obj31 = g6zVar.a;
                int i59 = g6zVar.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                i1r i1rVar11 = (k1r) obj;
                i1r i1rVar12 = i1rVar11 instanceof i1r ? i1rVar11 : null;
                Boolean boolValueOf3 = Boolean.valueOf(u890.j(i1rVar12 != null ? (g3v) i1rVar12.a : null, c3v.a));
                g6zVar.b = 1;
                return vr20Var.emit(boolValueOf3, g6zVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof h6z) {
                    h6zVar = (h6z) lnmVar;
                    int i60 = h6zVar.b;
                    if ((i60 & os00.INVALID_ID) != 0) {
                        h6zVar.b = i60 - os00.INVALID_ID;
                    } else {
                        h6zVar = new h6z(this, lnmVar);
                    }
                } else {
                    h6zVar = new h6z(this, lnmVar);
                }
                Object obj32 = h6zVar.a;
                int i61 = h6zVar.b;
                if (i61 == 0) {
                    hm5.M(obj32);
                    i1r i1rVar13 = (k1r) obj;
                    i1r i1rVar14 = i1rVar13 instanceof i1r ? i1rVar13 : null;
                    k1r k1rVar2 = i1rVar14 != null ? (k1r) i1rVar14.a : null;
                    if (k1rVar2 instanceof i1r) {
                        objO = ((mtl) ((i1r) k1rVar2).a).a;
                    } else if (k1rVar2 instanceof h1r) {
                        objO = ktl.a;
                    } else if (!u890.j(k1rVar2, j1rVar) && k1rVar2 != null) {
                        eg.o();
                    }
                    if (objO == null) {
                        return rih1Var;
                    }
                    h6zVar.b = 1;
                    return vr20Var.emit(objO, h6zVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i61 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
