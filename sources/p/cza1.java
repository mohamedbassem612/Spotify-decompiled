package p;

import android.graphics.Color;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cza1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ cza1(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0193  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:132:0x0211  */
    /* JADX WARN: Code duplicated, block: B:147:0x0251  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:208:0x0365  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:238:0x03db  */
    /* JADX WARN: Code duplicated, block: B:259:0x0424  */
    /* JADX WARN: Code duplicated, block: B:274:0x0465  */
    /* JADX WARN: Code duplicated, block: B:289:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:311:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:326:0x052f  */
    /* JADX WARN: Code duplicated, block: B:344:0x0571  */
    /* JADX WARN: Code duplicated, block: B:361:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:378:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:397:0x0634  */
    /* JADX WARN: Code duplicated, block: B:412:0x0675  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:432:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:452:0x0705  */
    /* JADX WARN: Code duplicated, block: B:467:0x074e  */
    /* JADX WARN: Code duplicated, block: B:492:0x079f  */
    /* JADX WARN: Code duplicated, block: B:509:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:526:0x083b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        bza1 bza1Var;
        hza1 hza1Var;
        iza1 iza1Var;
        oza1 oza1Var;
        rza1 rza1Var;
        h0b1 h0b1Var;
        m0b1 m0b1Var;
        s0b1 s0b1Var;
        z0b1 z0b1Var;
        int color;
        o1b1 o1b1Var;
        l2b1 l2b1Var;
        acb1 acb1Var;
        tcb1 tcb1Var;
        vcb1 vcb1Var;
        zcb1 zcb1Var;
        adb1 adb1Var;
        cfb1 cfb1Var;
        uhb1 uhb1Var;
        agc1 agc1Var;
        xmc1 xmc1Var;
        ymc1 ymc1Var;
        dwc1 dwc1Var;
        fxc1 fxc1Var;
        gxc1 gxc1Var;
        l2d1 l2d1Var;
        qbd1 qbd1Var;
        ikd1 ikd1Var;
        dmd1 dmd1Var;
        rrt0 rrt0Var;
        hmd1 hmd1Var;
        z6x z6xVarSingletonList;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof bza1) {
                    bza1Var = (bza1) lnmVar;
                    int i = bza1Var.b;
                    if ((i & os00.INVALID_ID) != 0) {
                        bza1Var.b = i - os00.INVALID_ID;
                    } else {
                        bza1Var = new bza1(this, lnmVar);
                    }
                } else {
                    bza1Var = new bza1(this, lnmVar);
                }
                Object obj3 = bza1Var.a;
                int i2 = bza1Var.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    String strContextUri = ((PlayerState) obj).contextUri();
                    bza1Var.b = 1;
                    return vr20Var.emit(strContextUri, bza1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof hza1) {
                    hza1Var = (hza1) lnmVar;
                    int i3 = hza1Var.b;
                    if ((i3 & os00.INVALID_ID) != 0) {
                        hza1Var.b = i3 - os00.INVALID_ID;
                    } else {
                        hza1Var = new hza1(this, lnmVar);
                    }
                } else {
                    hza1Var = new hza1(this, lnmVar);
                }
                Object obj4 = hza1Var.a;
                int i4 = hza1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                hza1Var.b = 1;
                return vr20Var.emit(obj, hza1Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof iza1) {
                    iza1Var = (iza1) lnmVar;
                    int i5 = iza1Var.b;
                    if ((i5 & os00.INVALID_ID) != 0) {
                        iza1Var.b = i5 - os00.INVALID_ID;
                    } else {
                        iza1Var = new iza1(this, lnmVar);
                    }
                } else {
                    iza1Var = new iza1(this, lnmVar);
                }
                Object obj5 = iza1Var.a;
                int i6 = iza1Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                mmr0 mmr0Var = (mmr0) obj;
                if (!u890.j(((ji0) mmr0Var.a).a, ((ContextTrack) ((PlayerState) mmr0Var.b).track().b()).metadata().get("ad_id"))) {
                    return rih1Var;
                }
                iza1Var.b = 1;
                return vr20Var.emit(obj, iza1Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof oza1) {
                    oza1Var = (oza1) lnmVar;
                    int i7 = oza1Var.b;
                    if ((i7 & os00.INVALID_ID) != 0) {
                        oza1Var.b = i7 - os00.INVALID_ID;
                    } else {
                        oza1Var = new oza1(this, lnmVar);
                    }
                } else {
                    oza1Var = new oza1(this, lnmVar);
                }
                Object obj6 = oza1Var.a;
                int i8 = oza1Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    mx0 mx0Var = (px0) obj;
                    if (mx0Var instanceof mx0) {
                        obj2 = mx0Var.a;
                    } else if (!(mx0Var instanceof nx0) && !u890.j(mx0Var, ox0.a)) {
                        eg.o();
                    }
                    oza1Var.b = 1;
                    return vr20Var.emit(obj2, oza1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof rza1) {
                    rza1Var = (rza1) lnmVar;
                    int i9 = rza1Var.b;
                    if ((i9 & os00.INVALID_ID) != 0) {
                        rza1Var.b = i9 - os00.INVALID_ID;
                    } else {
                        rza1Var = new rza1(this, lnmVar);
                    }
                } else {
                    rza1Var = new rza1(this, lnmVar);
                }
                Object obj7 = rza1Var.a;
                int i10 = rza1Var.b;
                if (i10 == 0) {
                    hm5.M(obj7);
                    ly50 ly50VarA = ly50.a((ly50) obj, (iy50) null, false, false, 0, false, (px50) null, (by50) null, 127);
                    rza1Var.b = 1;
                    return vr20Var.emit(ly50VarA, rza1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof h0b1) {
                    h0b1Var = (h0b1) lnmVar;
                    int i11 = h0b1Var.b;
                    if ((i11 & os00.INVALID_ID) != 0) {
                        h0b1Var.b = i11 - os00.INVALID_ID;
                    } else {
                        h0b1Var = new h0b1(this, lnmVar);
                    }
                } else {
                    h0b1Var = new h0b1(this, lnmVar);
                }
                Object obj8 = h0b1Var.a;
                int i12 = h0b1Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                h0b1Var.b = 1;
                return vr20Var.emit(boolValueOf, h0b1Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof m0b1) {
                    m0b1Var = (m0b1) lnmVar;
                    int i13 = m0b1Var.b;
                    if ((i13 & os00.INVALID_ID) != 0) {
                        m0b1Var.b = i13 - os00.INVALID_ID;
                    } else {
                        m0b1Var = new m0b1(this, lnmVar);
                    }
                } else {
                    m0b1Var = new m0b1(this, lnmVar);
                }
                Object obj9 = m0b1Var.a;
                int i14 = m0b1Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                PlayerState playerState2 = (PlayerState) obj;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                m0b1Var.b = 1;
                return vr20Var.emit(boolValueOf2, m0b1Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof s0b1) {
                    s0b1Var = (s0b1) lnmVar;
                    int i15 = s0b1Var.b;
                    if ((i15 & os00.INVALID_ID) != 0) {
                        s0b1Var.b = i15 - os00.INVALID_ID;
                    } else {
                        s0b1Var = new s0b1(this, lnmVar);
                    }
                } else {
                    s0b1Var = new s0b1(this, lnmVar);
                }
                Object obj10 = s0b1Var.a;
                int i16 = s0b1Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf3 = Boolean.valueOf(((w8c0) obj).a(w8c0.e));
                    s0b1Var.b = 1;
                    return vr20Var.emit(boolValueOf3, s0b1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof z0b1) {
                    z0b1Var = (z0b1) lnmVar;
                    int i17 = z0b1Var.b;
                    if ((i17 & os00.INVALID_ID) != 0) {
                        z0b1Var.b = i17 - os00.INVALID_ID;
                    } else {
                        z0b1Var = new z0b1(this, lnmVar);
                    }
                } else {
                    z0b1Var = new z0b1(this, lnmVar);
                }
                Object obj11 = z0b1Var.a;
                int i18 = z0b1Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                try {
                    color = Color.parseColor(l4o1.y(contextTrack));
                    break;
                } catch (Exception unused) {
                    color = d1b1.a;
                }
                Integer num = new Integer(t5p1.l(color));
                z0b1Var.b = 1;
                return vr20Var.emit(num, z0b1Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof o1b1) {
                    o1b1Var = (o1b1) lnmVar;
                    int i19 = o1b1Var.b;
                    if ((i19 & os00.INVALID_ID) != 0) {
                        o1b1Var.b = i19 - os00.INVALID_ID;
                    } else {
                        o1b1Var = new o1b1(this, lnmVar);
                    }
                } else {
                    o1b1Var = new o1b1(this, lnmVar);
                }
                Object obj12 = o1b1Var.a;
                int i20 = o1b1Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                o1b1Var.b = 1;
                return vr20Var.emit(obj, o1b1Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof l2b1) {
                    l2b1Var = (l2b1) lnmVar;
                    int i21 = l2b1Var.b;
                    if ((i21 & os00.INVALID_ID) != 0) {
                        l2b1Var.b = i21 - os00.INVALID_ID;
                    } else {
                        l2b1Var = new l2b1(this, lnmVar);
                    }
                } else {
                    l2b1Var = new l2b1(this, lnmVar);
                }
                Object obj13 = l2b1Var.a;
                int i22 = l2b1Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                if (!(obj instanceof jn41)) {
                    return rih1Var;
                }
                l2b1Var.b = 1;
                return vr20Var.emit(obj, l2b1Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof acb1) {
                    acb1Var = (acb1) lnmVar;
                    int i23 = acb1Var.b;
                    if ((i23 & os00.INVALID_ID) != 0) {
                        acb1Var.b = i23 - os00.INVALID_ID;
                    } else {
                        acb1Var = new acb1(this, lnmVar);
                    }
                } else {
                    acb1Var = new acb1(this, lnmVar);
                }
                Object obj14 = acb1Var.a;
                int i24 = acb1Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf4 = Boolean.valueOf(((ly50) obj).a == iy50.c);
                    acb1Var.b = 1;
                    return vr20Var.emit(boolValueOf4, acb1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof tcb1) {
                    tcb1Var = (tcb1) lnmVar;
                    int i25 = tcb1Var.b;
                    if ((i25 & os00.INVALID_ID) != 0) {
                        tcb1Var.b = i25 - os00.INVALID_ID;
                    } else {
                        tcb1Var = new tcb1(this, lnmVar);
                    }
                } else {
                    tcb1Var = new tcb1(this, lnmVar);
                }
                Object obj15 = tcb1Var.a;
                int i26 = tcb1Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    Integer num2 = new Integer(-((Number) obj).intValue());
                    tcb1Var.b = 1;
                    return vr20Var.emit(num2, tcb1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof vcb1) {
                    vcb1Var = (vcb1) lnmVar;
                    int i27 = vcb1Var.b;
                    if ((i27 & os00.INVALID_ID) != 0) {
                        vcb1Var.b = i27 - os00.INVALID_ID;
                    } else {
                        vcb1Var = new vcb1(this, lnmVar);
                    }
                } else {
                    vcb1Var = new vcb1(this, lnmVar);
                }
                Object obj16 = vcb1Var.a;
                int i28 = vcb1Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                obj2 = i1rVar2 != null ? (Set) i1rVar2.a : null;
                if (obj2 == null) {
                    return rih1Var;
                }
                vcb1Var.b = 1;
                return vr20Var.emit(obj2, vcb1Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof zcb1) {
                    zcb1Var = (zcb1) lnmVar;
                    int i29 = zcb1Var.b;
                    if ((i29 & os00.INVALID_ID) != 0) {
                        zcb1Var.b = i29 - os00.INVALID_ID;
                    } else {
                        zcb1Var = new zcb1(this, lnmVar);
                    }
                } else {
                    zcb1Var = new zcb1(this, lnmVar);
                }
                Object obj17 = zcb1Var.a;
                int i30 = zcb1Var.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf5 = Boolean.valueOf(((p0d0) obj).a.a());
                    zcb1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, zcb1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof adb1) {
                    adb1Var = (adb1) lnmVar;
                    int i31 = adb1Var.b;
                    if ((i31 & os00.INVALID_ID) != 0) {
                        adb1Var.b = i31 - os00.INVALID_ID;
                    } else {
                        adb1Var = new adb1(this, lnmVar);
                    }
                } else {
                    adb1Var = new adb1(this, lnmVar);
                }
                Object obj18 = adb1Var.a;
                int i32 = adb1Var.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    Boolean boolValueOf6 = Boolean.valueOf(((p0d0) obj).a.b());
                    adb1Var.b = 1;
                    return vr20Var.emit(boolValueOf6, adb1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                Object objEmit = vr20Var.emit((yeb1) obj, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 17:
                if (lnmVar instanceof cfb1) {
                    cfb1Var = (cfb1) lnmVar;
                    int i33 = cfb1Var.b;
                    if ((i33 & os00.INVALID_ID) != 0) {
                        cfb1Var.b = i33 - os00.INVALID_ID;
                    } else {
                        cfb1Var = new cfb1(this, lnmVar);
                    }
                } else {
                    cfb1Var = new cfb1(this, lnmVar);
                }
                Object obj19 = cfb1Var.a;
                int i34 = cfb1Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                k1r k1rVar = (k1r) obj;
                k1rVar.getClass();
                if (k1rVar instanceof j1r) {
                    return rih1Var;
                }
                cfb1Var.b = 1;
                return vr20Var.emit(obj, cfb1Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof uhb1) {
                    uhb1Var = (uhb1) lnmVar;
                    int i35 = uhb1Var.b;
                    if ((i35 & os00.INVALID_ID) != 0) {
                        uhb1Var.b = i35 - os00.INVALID_ID;
                    } else {
                        uhb1Var = new uhb1(this, lnmVar);
                    }
                } else {
                    uhb1Var = new uhb1(this, lnmVar);
                }
                Object obj20 = uhb1Var.a;
                int i36 = uhb1Var.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    Object objH = ((spq0) obj).h();
                    uhb1Var.b = 1;
                    return vr20Var.emit(objH, uhb1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof agc1) {
                    agc1Var = (agc1) lnmVar;
                    int i37 = agc1Var.b;
                    if ((i37 & os00.INVALID_ID) != 0) {
                        agc1Var.b = i37 - os00.INVALID_ID;
                    } else {
                        agc1Var = new agc1(this, lnmVar);
                    }
                } else {
                    agc1Var = new agc1(this, lnmVar);
                }
                Object obj21 = agc1Var.a;
                int i38 = agc1Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    List listN = p7h.N((gay) obj);
                    agc1Var.b = 1;
                    return vr20Var.emit(listN, agc1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof xmc1) {
                    xmc1Var = (xmc1) lnmVar;
                    int i39 = xmc1Var.b;
                    if ((i39 & os00.INVALID_ID) != 0) {
                        xmc1Var.b = i39 - os00.INVALID_ID;
                    } else {
                        xmc1Var = new xmc1(this, lnmVar);
                    }
                } else {
                    xmc1Var = new xmc1(this, lnmVar);
                }
                Object obj22 = xmc1Var.a;
                int i40 = xmc1Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                List<ucd0> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (ucd0 ucd0Var : list) {
                    String str = ucd0Var.a;
                    tcd0 tcd0Var = ucd0Var.b;
                    arrayList.add(new zad0(str, tcd0Var != null ? new gad0(tcd0Var.d, tcd0Var.a, tcd0Var.b, tcd0Var.c) : null));
                }
                sad0 sad0Var = new sad0(arrayList);
                xmc1Var.b = 1;
                return vr20Var.emit(sad0Var, xmc1Var) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof ymc1) {
                    ymc1Var = (ymc1) lnmVar;
                    int i41 = ymc1Var.b;
                    if ((i41 & os00.INVALID_ID) != 0) {
                        ymc1Var.b = i41 - os00.INVALID_ID;
                    } else {
                        ymc1Var = new ymc1(this, lnmVar);
                    }
                } else {
                    ymc1Var = new ymc1(this, lnmVar);
                }
                Object obj23 = ymc1Var.a;
                int i42 = ymc1Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                Object obj24 = ((e331) obj).a;
                Throwable thA = e331.a(obj24);
                if (thA != null) {
                    Logger.d("BUZZ: ListeningActivityButton subscribe failed", new Object[]{thA});
                }
                obj2 = obj24 instanceof m231 ? null : obj24;
                if (obj2 == null) {
                    return rih1Var;
                }
                ymc1Var.b = 1;
                return vr20Var.emit(obj2, ymc1Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof dwc1) {
                    dwc1Var = (dwc1) lnmVar;
                    int i43 = dwc1Var.b;
                    if ((i43 & os00.INVALID_ID) != 0) {
                        dwc1Var.b = i43 - os00.INVALID_ID;
                    } else {
                        dwc1Var = new dwc1(this, lnmVar);
                    }
                } else {
                    dwc1Var = new dwc1(this, lnmVar);
                }
                Object obj25 = dwc1Var.a;
                int i44 = dwc1Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                PlayerState playerState3 = (PlayerState) obj;
                playerState3.getClass();
                mmr0 mmr0Var2 = new mmr0(Boolean.valueOf(o4p1.t(playerState3)), Boolean.valueOf(o4p1.C(playerState3)));
                dwc1Var.b = 1;
                return vr20Var.emit(mmr0Var2, dwc1Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof fxc1) {
                    fxc1Var = (fxc1) lnmVar;
                    int i45 = fxc1Var.b;
                    if ((i45 & os00.INVALID_ID) != 0) {
                        fxc1Var.b = i45 - os00.INVALID_ID;
                    } else {
                        fxc1Var = new fxc1(this, lnmVar);
                    }
                } else {
                    fxc1Var = new fxc1(this, lnmVar);
                }
                Object obj26 = fxc1Var.a;
                int i46 = fxc1Var.b;
                if (i46 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf7 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    fxc1Var.b = 1;
                    return vr20Var.emit(boolValueOf7, fxc1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof gxc1) {
                    gxc1Var = (gxc1) lnmVar;
                    int i47 = gxc1Var.b;
                    if ((i47 & os00.INVALID_ID) != 0) {
                        gxc1Var.b = i47 - os00.INVALID_ID;
                    } else {
                        gxc1Var = new gxc1(this, lnmVar);
                    }
                } else {
                    gxc1Var = new gxc1(this, lnmVar);
                }
                Object obj27 = gxc1Var.a;
                int i48 = gxc1Var.b;
                if (i48 == 0) {
                    hm5.M(obj27);
                    Boolean boolValueOf8 = Boolean.valueOf(u890.j((String) obj, "ENABLED"));
                    gxc1Var.b = 1;
                    return vr20Var.emit(boolValueOf8, gxc1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof l2d1) {
                    l2d1Var = (l2d1) lnmVar;
                    int i49 = l2d1Var.b;
                    if ((i49 & os00.INVALID_ID) != 0) {
                        l2d1Var.b = i49 - os00.INVALID_ID;
                    } else {
                        l2d1Var = new l2d1(this, lnmVar);
                    }
                } else {
                    l2d1Var = new l2d1(this, lnmVar);
                }
                Object obj28 = l2d1Var.a;
                int i50 = l2d1Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                l2d1Var.b = 1;
                return vr20Var.emit(obj, l2d1Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof qbd1) {
                    qbd1Var = (qbd1) lnmVar;
                    int i51 = qbd1Var.b;
                    if ((i51 & os00.INVALID_ID) != 0) {
                        qbd1Var.b = i51 - os00.INVALID_ID;
                    } else {
                        qbd1Var = new qbd1(this, lnmVar);
                    }
                } else {
                    qbd1Var = new qbd1(this, lnmVar);
                }
                Object obj29 = qbd1Var.a;
                int i52 = qbd1Var.b;
                if (i52 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf9 = Boolean.valueOf(((Number) obj).intValue() == 1);
                    qbd1Var.b = 1;
                    return vr20Var.emit(boolValueOf9, qbd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (lnmVar instanceof ikd1) {
                    ikd1Var = (ikd1) lnmVar;
                    int i53 = ikd1Var.b;
                    if ((i53 & os00.INVALID_ID) != 0) {
                        ikd1Var.b = i53 - os00.INVALID_ID;
                    } else {
                        ikd1Var = new ikd1(this, lnmVar);
                    }
                } else {
                    ikd1Var = new ikd1(this, lnmVar);
                }
                Object obj30 = ikd1Var.a;
                int i54 = ikd1Var.b;
                if (i54 == 0) {
                    hm5.M(obj30);
                    qla1 qla1Var = new qla1(obj);
                    ikd1Var.b = 1;
                    return vr20Var.emit(qla1Var, ikd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (lnmVar instanceof dmd1) {
                    dmd1Var = (dmd1) lnmVar;
                    int i55 = dmd1Var.b;
                    if ((i55 & os00.INVALID_ID) != 0) {
                        dmd1Var.b = i55 - os00.INVALID_ID;
                    } else {
                        dmd1Var = new dmd1(this, lnmVar);
                    }
                } else {
                    dmd1Var = new dmd1(this, lnmVar);
                }
                Object obj31 = dmd1Var.a;
                int i56 = dmd1Var.b;
                if (i56 == 0) {
                    hm5.M(obj31);
                    int iOrdinal = ((yrt0) obj).ordinal();
                    if (iOrdinal == 0) {
                        rrt0Var = rrt0.a;
                    } else if (iOrdinal == 1) {
                        rrt0Var = rrt0.b;
                    } else if (iOrdinal == 2) {
                        rrt0Var = rrt0.c;
                    } else {
                        eg.o();
                    }
                    dmd1Var.b = 1;
                    return vr20Var.emit(rrt0Var, dmd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof hmd1) {
                    hmd1Var = (hmd1) lnmVar;
                    int i57 = hmd1Var.b;
                    if ((i57 & os00.INVALID_ID) != 0) {
                        hmd1Var.b = i57 - os00.INVALID_ID;
                    } else {
                        hmd1Var = new hmd1(this, lnmVar);
                    }
                } else {
                    hmd1Var = new hmd1(this, lnmVar);
                }
                Object obj32 = hmd1Var.a;
                int i58 = hmd1Var.b;
                if (i58 == 0) {
                    hm5.M(obj32);
                    glm0 glm0Var = (glm0) obj;
                    if (glm0Var instanceof elm0) {
                        ArrayList<zkm0> arrayList2 = ((elm0) glm0Var).a;
                        if (arrayList2.isEmpty()) {
                            fjd1 fjd1Var = fjd1.a;
                            z6xVarSingletonList = Collections.singletonList(new h8k1(fjd1Var, fjd1Var));
                        } else {
                            z6x arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                            for (zkm0 zkm0Var : arrayList2) {
                                ojd1 ojd1Var = new ojd1(zkm0Var.a, zkm0Var.b);
                                arrayList3.add(new h8k1(ojd1Var, ojd1Var));
                            }
                            z6xVarSingletonList = arrayList3;
                        }
                    } else if (glm0Var instanceof dlm0) {
                        cjd1 cjd1Var = cjd1.a;
                        z6xVarSingletonList = Collections.singletonList(new h8k1(cjd1Var, cjd1Var));
                    } else if (u890.j(glm0Var, flm0.a)) {
                        z6xVarSingletonList = z6x.a;
                    } else {
                        eg.o();
                    }
                    hmd1Var.b = 1;
                    return vr20Var.emit(z6xVarSingletonList, hmd1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ cza1(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
