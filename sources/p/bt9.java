package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.socialprompting.v1.SocialPromptingPusherMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bt9 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ bt9(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01af  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:147:0x022c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0273  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x032e  */
    /* JADX WARN: Code duplicated, block: B:234:0x0379  */
    /* JADX WARN: Code duplicated, block: B:249:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:269:0x0405  */
    /* JADX WARN: Code duplicated, block: B:284:0x0444  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:301:0x0485  */
    /* JADX WARN: Code duplicated, block: B:318:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:333:0x0503  */
    /* JADX WARN: Code duplicated, block: B:356:0x0551  */
    /* JADX WARN: Code duplicated, block: B:373:0x058c  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:407:0x0602  */
    /* JADX WARN: Code duplicated, block: B:426:0x0643  */
    /* JADX WARN: Code duplicated, block: B:441:0x0681  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:476:0x070c  */
    /* JADX WARN: Code duplicated, block: B:498:0x0758  */
    /* JADX WARN: Code duplicated, block: B:513:0x0791  */
    /* JADX WARN: Code duplicated, block: B:533:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        at9 at9Var;
        ct9 ct9Var;
        dt9 dt9Var;
        pt9 pt9Var;
        ContextTrack contextTrack;
        qt9 qt9Var;
        ContextTrack contextTrack2;
        rt9 rt9Var;
        st9 st9Var;
        w6a w6aVar;
        x7a x7aVar;
        y7a y7aVar;
        a8a a8aVar;
        xba xbaVar;
        wls0 wls0Var;
        yba ybaVar;
        oya oyaVar;
        qya qyaVar;
        rya ryaVar;
        sya syaVar;
        vya vyaVar;
        iza izaVar;
        u1b u1bVar;
        w1b w1bVar;
        r3b r3bVar;
        z3b z3bVar;
        xfb xfbVar;
        kgb kgbVar;
        qgb qgbVar;
        jib jibVar;
        bib cibVar;
        ckb ckbVar;
        dkb dkbVar;
        xmb xmbVar;
        byte b = this.a;
        boolean z = false;
        int i = 0;
        zY = false;
        boolean zY = false;
        z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        i1r i1rVarUri = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof at9) {
                    at9Var = (at9) lnmVar;
                    int i2 = at9Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        at9Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        at9Var = new at9(this, lnmVar);
                    }
                } else {
                    at9Var = new at9(this, lnmVar);
                }
                Object obj2 = at9Var.a;
                int i3 = at9Var.b;
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
                at9Var.b = 1;
                return vr20Var.emit(obj, at9Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof ct9) {
                    ct9Var = (ct9) lnmVar;
                    int i4 = ct9Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ct9Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        ct9Var = new ct9(this, lnmVar);
                    }
                } else {
                    ct9Var = new ct9(this, lnmVar);
                }
                Object obj3 = ct9Var.a;
                int i5 = ct9Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                ct9Var.b = 1;
                return vr20Var.emit(boolValueOf, ct9Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof dt9) {
                    dt9Var = (dt9) lnmVar;
                    int i6 = dt9Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        dt9Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        dt9Var = new dt9(this, lnmVar);
                    }
                } else {
                    dt9Var = new dt9(this, lnmVar);
                }
                Object obj4 = dt9Var.a;
                int i7 = dt9Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    ((Boolean) obj).getClass();
                    dt9Var.b = 1;
                    return vr20Var.emit(rih1Var, dt9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof pt9) {
                    pt9Var = (pt9) lnmVar;
                    int i8 = pt9Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        pt9Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        pt9Var = new pt9(this, lnmVar);
                    }
                } else {
                    pt9Var = new pt9(this, lnmVar);
                }
                Object obj5 = pt9Var.a;
                int i9 = pt9Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                spq0 spq0VarTrack = ((PlayerState) obj).track();
                if (spq0VarTrack != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null) {
                    i1rVarUri = contextTrack.uri();
                }
                if (i1rVarUri == null) {
                    i1rVarUri = "";
                }
                pt9Var.b = 1;
                return vr20Var.emit(i1rVarUri, pt9Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof qt9) {
                    qt9Var = (qt9) lnmVar;
                    int i10 = qt9Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        qt9Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        qt9Var = new qt9(this, lnmVar);
                    }
                } else {
                    qt9Var = new qt9(this, lnmVar);
                }
                Object obj6 = qt9Var.a;
                int i11 = qt9Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                spq0 spq0VarTrack2 = ((PlayerState) obj).track();
                if (spq0VarTrack2 != null && (contextTrack2 = (ContextTrack) spq0VarTrack2.h()) != null) {
                    zY = l4o1.Y(contextTrack2);
                }
                Boolean boolValueOf2 = Boolean.valueOf(zY);
                qt9Var.b = 1;
                return vr20Var.emit(boolValueOf2, qt9Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof rt9) {
                    rt9Var = (rt9) lnmVar;
                    int i12 = rt9Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        rt9Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        rt9Var = new rt9(this, lnmVar);
                    }
                } else {
                    rt9Var = new rt9(this, lnmVar);
                }
                Object obj7 = rt9Var.a;
                int i13 = rt9Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf3 = Boolean.valueOf(!((PlayerState) obj).isPaused());
                    rt9Var.b = 1;
                    return vr20Var.emit(boolValueOf3, rt9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof st9) {
                    st9Var = (st9) lnmVar;
                    int i14 = st9Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        st9Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        st9Var = new st9(this, lnmVar);
                    }
                } else {
                    st9Var = new st9(this, lnmVar);
                }
                Object obj8 = st9Var.a;
                int i15 = st9Var.b;
                if (i15 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf4 = Boolean.valueOf(i3p1.A((lp9) obj));
                    st9Var.b = 1;
                    return vr20Var.emit(boolValueOf4, st9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof w6a) {
                    w6aVar = (w6a) lnmVar;
                    int i16 = w6aVar.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        w6aVar.b = i16 - Integer.MIN_VALUE;
                    } else {
                        w6aVar = new w6a(this, lnmVar);
                    }
                } else {
                    w6aVar = new w6a(this, lnmVar);
                }
                Object obj9 = w6aVar.a;
                int i17 = w6aVar.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                j6w0 j6w0Var = (j6w0) obj;
                List listSingletonList = j6w0Var != null ? Collections.singletonList(j6w0Var.b) : z6x.a;
                w6aVar.b = 1;
                return vr20Var.emit(listSingletonList, w6aVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof x7a) {
                    x7aVar = (x7a) lnmVar;
                    int i18 = x7aVar.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        x7aVar.b = i18 - Integer.MIN_VALUE;
                    } else {
                        x7aVar = new x7a(this, lnmVar);
                    }
                } else {
                    x7aVar = new x7a(this, lnmVar);
                }
                Object obj10 = x7aVar.a;
                int i19 = x7aVar.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                if (((v7a) obj) != v7a.d) {
                    return rih1Var;
                }
                x7aVar.b = 1;
                return vr20Var.emit(obj, x7aVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof y7a) {
                    y7aVar = (y7a) lnmVar;
                    int i20 = y7aVar.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        y7aVar.b = i20 - Integer.MIN_VALUE;
                    } else {
                        y7aVar = new y7a(this, lnmVar);
                    }
                } else {
                    y7aVar = new y7a(this, lnmVar);
                }
                Object obj11 = y7aVar.a;
                int i21 = y7aVar.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (((v7a) obj) != v7a.c) {
                    return rih1Var;
                }
                y7aVar.b = 1;
                return vr20Var.emit(obj, y7aVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof a8a) {
                    a8aVar = (a8a) lnmVar;
                    int i22 = a8aVar.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        a8aVar.b = i22 - Integer.MIN_VALUE;
                    } else {
                        a8aVar = new a8a(this, lnmVar);
                    }
                } else {
                    a8aVar = new a8a(this, lnmVar);
                }
                Object obj12 = a8aVar.a;
                int i23 = a8aVar.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                if (((v7a) obj) != v7a.b) {
                    return rih1Var;
                }
                a8aVar.b = 1;
                return vr20Var.emit(obj, a8aVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof xba) {
                    xbaVar = (xba) lnmVar;
                    int i24 = xbaVar.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        xbaVar.b = i24 - Integer.MIN_VALUE;
                    } else {
                        xbaVar = new xba(this, lnmVar);
                    }
                } else {
                    xbaVar = new xba(this, lnmVar);
                }
                Object obj13 = xbaVar.a;
                int i25 = xbaVar.b;
                if (i25 == 0) {
                    hm5.M(obj13);
                    oy21 oy21Var = (py21) obj;
                    if (oy21Var instanceof oy21) {
                        wls0Var = ((qxc0) oy21Var.a).i;
                    } else if (oy21Var instanceof ly21) {
                        wls0Var = wls0.b;
                    } else {
                        eg.o();
                    }
                    xbaVar.b = 1;
                    return vr20Var.emit(wls0Var, xbaVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof yba) {
                    ybaVar = (yba) lnmVar;
                    int i26 = ybaVar.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        ybaVar.b = i26 - Integer.MIN_VALUE;
                    } else {
                        ybaVar = new yba(this, lnmVar);
                    }
                } else {
                    ybaVar = new yba(this, lnmVar);
                }
                Object obj14 = ybaVar.a;
                int i27 = ybaVar.b;
                if (i27 == 0) {
                    hm5.M(obj14);
                    wba wbaVar = new wba((wls0) obj);
                    ybaVar.b = 1;
                    return vr20Var.emit(wbaVar, ybaVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i27 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof oya) {
                    oyaVar = (oya) lnmVar;
                    int i28 = oyaVar.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        oyaVar.b = i28 - Integer.MIN_VALUE;
                    } else {
                        oyaVar = new oya(this, lnmVar);
                    }
                } else {
                    oyaVar = new oya(this, lnmVar);
                }
                Object obj15 = oyaVar.a;
                int i29 = oyaVar.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                if (!u890.j(((je9) obj).n(), qe9.a)) {
                    return rih1Var;
                }
                oyaVar.b = 1;
                return vr20Var.emit(obj, oyaVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof qya) {
                    qyaVar = (qya) lnmVar;
                    int i30 = qyaVar.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        qyaVar.b = i30 - Integer.MIN_VALUE;
                    } else {
                        qyaVar = new qya(this, lnmVar);
                    }
                } else {
                    qyaVar = new qya(this, lnmVar);
                }
                Object obj16 = qyaVar.a;
                int i31 = qyaVar.b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                if (!((re9) obj).d.contains(qe9.a)) {
                    return rih1Var;
                }
                qyaVar.b = 1;
                return vr20Var.emit(obj, qyaVar) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof rya) {
                    ryaVar = (rya) lnmVar;
                    int i32 = ryaVar.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ryaVar.b = i32 - Integer.MIN_VALUE;
                    } else {
                        ryaVar = new rya(this, lnmVar);
                    }
                } else {
                    ryaVar = new rya(this, lnmVar);
                }
                Object obj17 = ryaVar.a;
                int i33 = ryaVar.b;
                if (i33 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf5 = Boolean.valueOf(!((Map) obj).isEmpty());
                    ryaVar.b = 1;
                    return vr20Var.emit(boolValueOf5, ryaVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i33 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof sya) {
                    syaVar = (sya) lnmVar;
                    int i34 = syaVar.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        syaVar.b = i34 - Integer.MIN_VALUE;
                    } else {
                        syaVar = new sya(this, lnmVar);
                    }
                } else {
                    syaVar = new sya(this, lnmVar);
                }
                Object obj18 = syaVar.a;
                int i35 = syaVar.b;
                if (i35 == 0) {
                    hm5.M(obj18);
                    syaVar.d = 0;
                    syaVar.b = 1;
                    if (vr20Var.emit((Map) obj, syaVar) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i35 != 1) {
                    if (i35 == 2) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = syaVar.d;
                hm5.M(obj18);
                syaVar.d = i;
                syaVar.b = 2;
                if (hap1.i(1000L, syaVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 17:
                if (lnmVar instanceof vya) {
                    vyaVar = (vya) lnmVar;
                    int i36 = vyaVar.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        vyaVar.b = i36 - Integer.MIN_VALUE;
                    } else {
                        vyaVar = new vya(this, lnmVar);
                    }
                } else {
                    vyaVar = new vya(this, lnmVar);
                }
                Object obj19 = vyaVar.a;
                int i37 = vyaVar.b;
                if (i37 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf6 = Boolean.valueOf(!((Map) obj).isEmpty());
                    vyaVar.b = 1;
                    return vr20Var.emit(boolValueOf6, vyaVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof iza) {
                    izaVar = (iza) lnmVar;
                    int i38 = izaVar.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        izaVar.b = i38 - Integer.MIN_VALUE;
                    } else {
                        izaVar = new iza(this, lnmVar);
                    }
                } else {
                    izaVar = new iza(this, lnmVar);
                }
                Object obj20 = izaVar.a;
                int i39 = izaVar.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                k1r k1rVar = (k1r) obj;
                i1rVarUri = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                Boolean boolValueOf7 = Boolean.valueOf(i1rVarUri != null ? ((Boolean) i1rVarUri.a).booleanValue() : false);
                izaVar.b = 1;
                return vr20Var.emit(boolValueOf7, izaVar) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof u1b) {
                    u1bVar = (u1b) lnmVar;
                    int i40 = u1bVar.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        u1bVar.b = i40 - Integer.MIN_VALUE;
                    } else {
                        u1bVar = new u1b(this, lnmVar);
                    }
                } else {
                    u1bVar = new u1b(this, lnmVar);
                }
                Object obj21 = u1bVar.a;
                int i41 = u1bVar.b;
                if (i41 == 0) {
                    hm5.M(obj21);
                    String str = ((cxc0) obj).f.p;
                    u1bVar.b = 1;
                    return vr20Var.emit(str, u1bVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i41 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof w1b) {
                    w1bVar = (w1b) lnmVar;
                    int i42 = w1bVar.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        w1bVar.b = i42 - Integer.MIN_VALUE;
                    } else {
                        w1bVar = new w1b(this, lnmVar);
                    }
                } else {
                    w1bVar = new w1b(this, lnmVar);
                }
                Object obj22 = w1bVar.a;
                int i43 = w1bVar.b;
                if (i43 == 0) {
                    hm5.M(obj22);
                    Boolean boolValueOf8 = Boolean.valueOf(((le30) obj) == le30.g);
                    w1bVar.b = 1;
                    return vr20Var.emit(boolValueOf8, w1bVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i43 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof r3b) {
                    r3bVar = (r3b) lnmVar;
                    int i44 = r3bVar.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        r3bVar.b = i44 - Integer.MIN_VALUE;
                    } else {
                        r3bVar = new r3b(this, lnmVar);
                    }
                } else {
                    r3bVar = new r3b(this, lnmVar);
                }
                Object obj23 = r3bVar.a;
                int i45 = r3bVar.b;
                if (i45 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf9 = Boolean.valueOf(wm5.A(((cxc0) obj).f.q));
                    r3bVar.b = 1;
                    return vr20Var.emit(boolValueOf9, r3bVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof z3b) {
                    z3bVar = (z3b) lnmVar;
                    int i46 = z3bVar.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        z3bVar.b = i46 - Integer.MIN_VALUE;
                    } else {
                        z3bVar = new z3b(this, lnmVar);
                    }
                } else {
                    z3bVar = new z3b(this, lnmVar);
                }
                Object obj24 = z3bVar.a;
                int i47 = z3bVar.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                SocialPromptingPusherMessage socialPromptingPusherMessage = (SocialPromptingPusherMessage) obj;
                if (socialPromptingPusherMessage.n() != ch40.GENERATION_STATUS_COMPLETE && socialPromptingPusherMessage.n() != ch40.GENERATION_STATUS_ERROR) {
                    return rih1Var;
                }
                z3bVar.b = 1;
                return vr20Var.emit(obj, z3bVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof xfb) {
                    xfbVar = (xfb) lnmVar;
                    int i48 = xfbVar.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        xfbVar.b = i48 - Integer.MIN_VALUE;
                    } else {
                        xfbVar = new xfb(this, lnmVar);
                    }
                } else {
                    xfbVar = new xfb(this, lnmVar);
                }
                Object obj25 = xfbVar.a;
                int i49 = xfbVar.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return rih1Var;
                }
                xfbVar.b = 1;
                return vr20Var.emit(obj, xfbVar) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof kgb) {
                    kgbVar = (kgb) lnmVar;
                    int i50 = kgbVar.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        kgbVar.b = i50 - Integer.MIN_VALUE;
                    } else {
                        kgbVar = new kgb(this, lnmVar);
                    }
                } else {
                    kgbVar = new kgb(this, lnmVar);
                }
                Object obj26 = kgbVar.a;
                int i51 = kgbVar.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (!((spq0) obj).c()) {
                    return rih1Var;
                }
                kgbVar.b = 1;
                return vr20Var.emit(obj, kgbVar) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof qgb) {
                    qgbVar = (qgb) lnmVar;
                    int i52 = qgbVar.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        qgbVar.b = i52 - Integer.MIN_VALUE;
                    } else {
                        qgbVar = new qgb(this, lnmVar);
                    }
                } else {
                    qgbVar = new qgb(this, lnmVar);
                }
                Object obj27 = qgbVar.a;
                int i53 = qgbVar.b;
                if (i53 == 0) {
                    hm5.M(obj27);
                    pgb pgbVar = new pgb((lkb) obj);
                    qgbVar.b = 1;
                    return vr20Var.emit(pgbVar, qgbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof jib) {
                    jibVar = (jib) lnmVar;
                    int i54 = jibVar.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        jibVar.b = i54 - Integer.MIN_VALUE;
                    } else {
                        jibVar = new jib(this, lnmVar);
                    }
                } else {
                    jibVar = new jib(this, lnmVar);
                }
                Object obj28 = jibVar.a;
                int i55 = jibVar.b;
                if (i55 == 0) {
                    hm5.M(obj28);
                    neo0 neo0Var = (peo0) obj;
                    if (neo0Var.equals(meo0.a)) {
                        cibVar = bib.a;
                    } else if (neo0Var instanceof neo0) {
                        cibVar = new cib(neo0Var.a);
                    } else if (neo0Var.equals(oeo0.a)) {
                        cibVar = dib.a;
                    } else {
                        eg.o();
                    }
                    jibVar.b = 1;
                    return vr20Var.emit(cibVar, jibVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof ckb) {
                    ckbVar = (ckb) lnmVar;
                    int i56 = ckbVar.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        ckbVar.b = i56 - Integer.MIN_VALUE;
                    } else {
                        ckbVar = new ckb(this, lnmVar);
                    }
                } else {
                    ckbVar = new ckb(this, lnmVar);
                }
                Object obj29 = ckbVar.a;
                int i57 = ckbVar.b;
                if (i57 == 0) {
                    hm5.M(obj29);
                    hmi1 hmi1Var = new hmi1(((Boolean) obj).booleanValue());
                    ckbVar.b = 1;
                    return vr20Var.emit(hmi1Var, ckbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof dkb) {
                    dkbVar = (dkb) lnmVar;
                    int i58 = dkbVar.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        dkbVar.b = i58 - Integer.MIN_VALUE;
                    } else {
                        dkbVar = new dkb(this, lnmVar);
                    }
                } else {
                    dkbVar = new dkb(this, lnmVar);
                }
                Object obj30 = dkbVar.a;
                int i59 = dkbVar.b;
                if (i59 == 0) {
                    hm5.M(obj30);
                    fkb fkbVar = (fkb) obj;
                    fkbVar.getClass();
                    int iOrdinal = fkbVar.ordinal();
                    if (iOrdinal == 0) {
                        i1rVarUri = Boolean.FALSE;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i1rVarUri = Boolean.TRUE;
                        } else if (iOrdinal != 3 && iOrdinal != 4) {
                            eg.o();
                        }
                    }
                    if (i1rVarUri == null) {
                        return rih1Var;
                    }
                    dkbVar.b = 1;
                    return vr20Var.emit(i1rVarUri, dkbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i59 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof xmb) {
                    xmbVar = (xmb) lnmVar;
                    int i60 = xmbVar.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        xmbVar.b = i60 - Integer.MIN_VALUE;
                    } else {
                        xmbVar = new xmb(this, lnmVar);
                    }
                } else {
                    xmbVar = new xmb(this, lnmVar);
                }
                Object obj31 = xmbVar.a;
                int i61 = xmbVar.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                c380<gnb> c380Var = (c380) obj;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (gnb gnbVar : c380Var) {
                    arrayList.add(new h8k1(gnbVar, gnbVar.toString()));
                }
                xmbVar.b = 1;
                return vr20Var.emit(arrayList, xmbVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
