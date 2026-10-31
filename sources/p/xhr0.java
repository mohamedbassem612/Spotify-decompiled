package p;

import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.List;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto$ObserveInvalidationResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xhr0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ xhr0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x021a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0259  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:208:0x032b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0365  */
    /* JADX WARN: Code duplicated, block: B:243:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:263:0x03de  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:278:0x0418  */
    /* JADX WARN: Code duplicated, block: B:293:0x0457  */
    /* JADX WARN: Code duplicated, block: B:308:0x0491  */
    /* JADX WARN: Code duplicated, block: B:325:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:340:0x050b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0578  */
    /* JADX WARN: Code duplicated, block: B:380:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:402:0x0603  */
    /* JADX WARN: Code duplicated, block: B:419:0x0644  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:434:0x0686  */
    /* JADX WARN: Code duplicated, block: B:451:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:471:0x0707  */
    /* JADX WARN: Code duplicated, block: B:486:0x0745  */
    /* JADX WARN: Code duplicated, block: B:504:0x0785  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        whr0 whr0Var;
        yhr0 yhr0Var;
        zhr0 zhr0Var;
        cjr0 cjr0Var;
        n6r0 n6r0Var;
        pkr0 pkr0Var;
        qkr0 qkr0Var;
        tkr0 tkr0Var;
        dyr0 dyr0Var;
        wyr0 wyr0Var;
        m1s0 m1s0Var;
        n1s0 n1s0Var;
        w4s0 w4s0Var;
        y4s0 y4s0Var;
        p5s0 p5s0Var;
        t5s0 t5s0Var;
        vgs0 vgs0Var;
        ms60 ms60Var;
        wgs0 wgs0Var;
        xgs0 xgs0Var;
        ygs0 ygs0Var;
        jns0 jns0Var;
        kns0 kns0Var;
        pns0 pns0Var;
        zps0 zps0Var;
        vqs0 vqs0Var;
        wqs0 wqs0Var;
        xqs0 xqs0Var;
        yqs0 yqs0Var;
        hts0 hts0Var;
        tus0 tus0Var;
        xzs0 xzs0Var;
        byte b = this.a;
        h6r0 h6r0Var = h6r0.b;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        vgc0 vgc0VarPath = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof whr0) {
                    whr0Var = (whr0) lnmVar;
                    int i = whr0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        whr0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        whr0Var = new whr0(this, lnmVar);
                    }
                } else {
                    whr0Var = new whr0(this, lnmVar);
                }
                Object obj2 = whr0Var.a;
                int i2 = whr0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                h6r0 h6r0Var2 = (h6r0) obj;
                h6r0Var2.getClass();
                Boolean boolValueOf = Boolean.valueOf(h6r0Var2 == h6r0Var);
                whr0Var.b = 1;
                return vr20Var.emit(boolValueOf, whr0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof yhr0) {
                    yhr0Var = (yhr0) lnmVar;
                    int i3 = yhr0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yhr0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        yhr0Var = new yhr0(this, lnmVar);
                    }
                } else {
                    yhr0Var = new yhr0(this, lnmVar);
                }
                Object obj3 = yhr0Var.a;
                int i4 = yhr0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                h6r0 h6r0Var3 = (h6r0) obj;
                h6r0Var3.getClass();
                Boolean boolValueOf2 = Boolean.valueOf(h6r0Var3 == h6r0Var);
                yhr0Var.b = 1;
                return vr20Var.emit(boolValueOf2, yhr0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof zhr0) {
                    zhr0Var = (zhr0) lnmVar;
                    int i5 = zhr0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zhr0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        zhr0Var = new zhr0(this, lnmVar);
                    }
                } else {
                    zhr0Var = new zhr0(this, lnmVar);
                }
                Object obj4 = zhr0Var.a;
                int i6 = zhr0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    vir0 vir0VarG = f610.g(((Boolean) obj).booleanValue());
                    zhr0Var.b = 1;
                    return vr20Var.emit(vir0VarG, zhr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof cjr0) {
                    cjr0Var = (cjr0) lnmVar;
                    int i7 = cjr0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        cjr0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        cjr0Var = new cjr0(this, lnmVar);
                    }
                } else {
                    cjr0Var = new cjr0(this, lnmVar);
                }
                Object obj5 = cjr0Var.a;
                int i8 = cjr0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                bn70 bn70Var = (bn70) obj;
                if (bn70Var != null && (n6r0Var = bn70Var.a) != null) {
                    vgc0VarPath = n6r0Var.path();
                }
                cjr0Var.b = 1;
                return vr20Var.emit(vgc0VarPath, cjr0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof pkr0) {
                    pkr0Var = (pkr0) lnmVar;
                    int i9 = pkr0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        pkr0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        pkr0Var = new pkr0(this, lnmVar);
                    }
                } else {
                    pkr0Var = new pkr0(this, lnmVar);
                }
                Object obj6 = pkr0Var.a;
                int i10 = pkr0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (((YourLibraryResponse) obj).q().r()) {
                    return rih1Var;
                }
                pkr0Var.b = 1;
                return vr20Var.emit(obj, pkr0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof qkr0) {
                    qkr0Var = (qkr0) lnmVar;
                    int i11 = qkr0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qkr0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        qkr0Var = new qkr0(this, lnmVar);
                    }
                } else {
                    qkr0Var = new qkr0(this, lnmVar);
                }
                Object obj7 = qkr0Var.a;
                int i12 = qkr0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    mmr0 mmr0Var = new mmr0((YourLibraryResponse) obj, new Long(0L));
                    qkr0Var.b = 1;
                    return vr20Var.emit(mmr0Var, qkr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof tkr0) {
                    tkr0Var = (tkr0) lnmVar;
                    int i13 = tkr0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        tkr0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        tkr0Var = new tkr0(this, lnmVar);
                    }
                } else {
                    tkr0Var = new tkr0(this, lnmVar);
                }
                Object obj8 = tkr0Var.a;
                int i14 = tkr0Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (((YourLibraryResponse) obj).q().r()) {
                    return rih1Var;
                }
                tkr0Var.b = 1;
                return vr20Var.emit(obj, tkr0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof dyr0) {
                    dyr0Var = (dyr0) lnmVar;
                    int i15 = dyr0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        dyr0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        dyr0Var = new dyr0(this, lnmVar);
                    }
                } else {
                    dyr0Var = new dyr0(this, lnmVar);
                }
                Object obj9 = dyr0Var.a;
                int i16 = dyr0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                PlayerState playerState = (PlayerState) obj;
                ayr0 ayr0Var = new ayr0(o4p1.o(playerState), playerState.isPaused() ? 2 : playerState.isPlaying() ? 1 : 3);
                dyr0Var.b = 1;
                return vr20Var.emit(ayr0Var, dyr0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof wyr0) {
                    wyr0Var = (wyr0) lnmVar;
                    int i17 = wyr0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        wyr0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        wyr0Var = new wyr0(this, lnmVar);
                    }
                } else {
                    wyr0Var = new wyr0(this, lnmVar);
                }
                Object obj10 = wyr0Var.a;
                int i18 = wyr0Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    v910 v910Var = new v910((PlayerState) obj);
                    wyr0Var.b = 1;
                    return vr20Var.emit(v910Var, wyr0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof m1s0) {
                    m1s0Var = (m1s0) lnmVar;
                    int i19 = m1s0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        m1s0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        m1s0Var = new m1s0(this, lnmVar);
                    }
                } else {
                    m1s0Var = new m1s0(this, lnmVar);
                }
                Object obj11 = m1s0Var.a;
                int i20 = m1s0Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj12 : list) {
                    l0l l0lVar = (l0l) obj12;
                    if (!l0lVar.l() && l0lVar.isActive() && nhc1.S(l0lVar.E(), "samsung", true)) {
                        arrayList.add(obj12);
                    }
                }
                m1s0Var.b = 1;
                return vr20Var.emit(arrayList, m1s0Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof n1s0) {
                    n1s0Var = (n1s0) lnmVar;
                    int i21 = n1s0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        n1s0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        n1s0Var = new n1s0(this, lnmVar);
                    }
                } else {
                    n1s0Var = new n1s0(this, lnmVar);
                }
                Object obj13 = n1s0Var.a;
                int i22 = n1s0Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf3 = Boolean.valueOf(!((List) obj).isEmpty());
                    n1s0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, n1s0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof w4s0) {
                    w4s0Var = (w4s0) lnmVar;
                    int i23 = w4s0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        w4s0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        w4s0Var = new w4s0(this, lnmVar);
                    }
                } else {
                    w4s0Var = new w4s0(this, lnmVar);
                }
                Object obj14 = w4s0Var.a;
                int i24 = w4s0Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (((String) obj) == null) {
                    return rih1Var;
                }
                w4s0Var.b = 1;
                return vr20Var.emit(obj, w4s0Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof y4s0) {
                    y4s0Var = (y4s0) lnmVar;
                    int i25 = y4s0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        y4s0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        y4s0Var = new y4s0(this, lnmVar);
                    }
                } else {
                    y4s0Var = new y4s0(this, lnmVar);
                }
                Object obj15 = y4s0Var.a;
                int i26 = y4s0Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    Object objH = ((spq0) obj).h();
                    y4s0Var.b = 1;
                    return vr20Var.emit(objH, y4s0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof p5s0) {
                    p5s0Var = (p5s0) lnmVar;
                    int i27 = p5s0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        p5s0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        p5s0Var = new p5s0(this, lnmVar);
                    }
                } else {
                    p5s0Var = new p5s0(this, lnmVar);
                }
                Object obj16 = p5s0Var.a;
                int i28 = p5s0Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                x5s0 x5s0Var = (x5s0) obj;
                g901 g901Var = new g901(x5s0Var.c, x5s0Var.d);
                p5s0Var.b = 1;
                return vr20Var.emit(g901Var, p5s0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof t5s0) {
                    t5s0Var = (t5s0) lnmVar;
                    int i29 = t5s0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        t5s0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        t5s0Var = new t5s0(this, lnmVar);
                    }
                } else {
                    t5s0Var = new t5s0(this, lnmVar);
                }
                Object obj17 = t5s0Var.a;
                int i30 = t5s0Var.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    Object objH2 = ((spq0) obj).h();
                    t5s0Var.b = 1;
                    return vr20Var.emit(objH2, t5s0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof vgs0) {
                    vgs0Var = (vgs0) lnmVar;
                    int i31 = vgs0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        vgs0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        vgs0Var = new vgs0(this, lnmVar);
                    }
                } else {
                    vgs0Var = new vgs0(this, lnmVar);
                }
                Object obj18 = vgs0Var.a;
                int i32 = vgs0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                os60 os60Var = (os60) obj;
                if (os60Var == null || (ms60Var = os60Var.b) == null) {
                    ms60Var = is60.a;
                }
                vgs0Var.b = 1;
                return vr20Var.emit(ms60Var, vgs0Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof wgs0) {
                    wgs0Var = (wgs0) lnmVar;
                    int i33 = wgs0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        wgs0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        wgs0Var = new wgs0(this, lnmVar);
                    }
                } else {
                    wgs0Var = new wgs0(this, lnmVar);
                }
                Object obj19 = wgs0Var.a;
                int i34 = wgs0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                if (!(((ms60) obj) instanceof ls60)) {
                    return rih1Var;
                }
                wgs0Var.b = 1;
                return vr20Var.emit(obj, wgs0Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof xgs0) {
                    xgs0Var = (xgs0) lnmVar;
                    int i35 = xgs0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        xgs0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        xgs0Var = new xgs0(this, lnmVar);
                    }
                } else {
                    xgs0Var = new xgs0(this, lnmVar);
                }
                Object obj20 = xgs0Var.a;
                int i36 = xgs0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                os60 os60Var2 = (os60) obj;
                vgc0VarPath = os60Var2 != null ? os60Var2.b : null;
                xgs0Var.b = 1;
                return vr20Var.emit(vgc0VarPath, xgs0Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof ygs0) {
                    ygs0Var = (ygs0) lnmVar;
                    int i37 = ygs0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ygs0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        ygs0Var = new ygs0(this, lnmVar);
                    }
                } else {
                    ygs0Var = new ygs0(this, lnmVar);
                }
                Object obj21 = ygs0Var.a;
                int i38 = ygs0Var.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    ygs0Var.b = 1;
                    return vr20Var.emit(rih1Var, ygs0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof jns0) {
                    jns0Var = (jns0) lnmVar;
                    int i39 = jns0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        jns0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        jns0Var = new jns0(this, lnmVar);
                    }
                } else {
                    jns0Var = new jns0(this, lnmVar);
                }
                Object obj22 = jns0Var.a;
                int i40 = jns0Var.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    byte[] bArr = (byte[]) obj;
                    try {
                        PermissionsEsperanto.BYOMRestrictionState bYOMRestrictionStateP = PermissionsEsperanto.BYOMRestrictionState.p(bArr);
                        jns0Var.b = 1;
                        return vr20Var.emit(bYOMRestrictionStateP, jns0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.BYOMRestrictionState: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 20:
                if (lnmVar instanceof kns0) {
                    kns0Var = (kns0) lnmVar;
                    int i41 = kns0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        kns0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        kns0Var = new kns0(this, lnmVar);
                    }
                } else {
                    kns0Var = new kns0(this, lnmVar);
                }
                Object obj23 = kns0Var.a;
                int i42 = kns0Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        PermissionsEsperanto$ObserveInvalidationResponse permissionsEsperanto$ObserveInvalidationResponseO = PermissionsEsperanto$ObserveInvalidationResponse.o(bArr2);
                        kns0Var.b = 1;
                        return vr20Var.emit(permissionsEsperanto$ObserveInvalidationResponseO, kns0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.ObserveInvalidationResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 21:
                if (lnmVar instanceof pns0) {
                    pns0Var = (pns0) lnmVar;
                    int i43 = pns0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        pns0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        pns0Var = new pns0(this, lnmVar);
                    }
                } else {
                    pns0Var = new pns0(this, lnmVar);
                }
                Object obj24 = pns0Var.a;
                int i44 = pns0Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    j5q0 j5q0Var = new j5q0(((PermissionsEsperanto$ObserveInvalidationResponse) obj).n());
                    pns0Var.b = 1;
                    return vr20Var.emit(j5q0Var, pns0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof zps0) {
                    zps0Var = (zps0) lnmVar;
                    int i45 = zps0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        zps0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        zps0Var = new zps0(this, lnmVar);
                    }
                } else {
                    zps0Var = new zps0(this, lnmVar);
                }
                Object obj25 = zps0Var.a;
                int i46 = zps0Var.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf4 = Boolean.valueOf(u890.j(((cma1) obj).a, Boolean.TRUE));
                    zps0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, zps0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof vqs0) {
                    vqs0Var = (vqs0) lnmVar;
                    int i47 = vqs0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        vqs0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        vqs0Var = new vqs0(this, lnmVar);
                    }
                } else {
                    vqs0Var = new vqs0(this, lnmVar);
                }
                Object obj26 = vqs0Var.a;
                int i48 = vqs0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                vqs0Var.b = 1;
                return vr20Var.emit(obj, vqs0Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof wqs0) {
                    wqs0Var = (wqs0) lnmVar;
                    int i49 = wqs0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        wqs0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        wqs0Var = new wqs0(this, lnmVar);
                    }
                } else {
                    wqs0Var = new wqs0(this, lnmVar);
                }
                Object obj27 = wqs0Var.a;
                int i50 = wqs0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                wqs0Var.b = 1;
                return vr20Var.emit(obj, wqs0Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof xqs0) {
                    xqs0Var = (xqs0) lnmVar;
                    int i51 = xqs0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        xqs0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        xqs0Var = new xqs0(this, lnmVar);
                    }
                } else {
                    xqs0Var = new xqs0(this, lnmVar);
                }
                Object obj28 = xqs0Var.a;
                int i52 = xqs0Var.b;
                if (i52 == 0) {
                    hm5.M(obj28);
                    ((Boolean) obj).getClass();
                    xqs0Var.b = 1;
                    return vr20Var.emit(ars0.c, xqs0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof yqs0) {
                    yqs0Var = (yqs0) lnmVar;
                    int i53 = yqs0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        yqs0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        yqs0Var = new yqs0(this, lnmVar);
                    }
                } else {
                    yqs0Var = new yqs0(this, lnmVar);
                }
                Object obj29 = yqs0Var.a;
                int i54 = yqs0Var.b;
                if (i54 == 0) {
                    hm5.M(obj29);
                    yqs0Var.b = 1;
                    return vr20Var.emit(ars0.d, yqs0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (lnmVar instanceof hts0) {
                    hts0Var = (hts0) lnmVar;
                    int i55 = hts0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        hts0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        hts0Var = new hts0(this, lnmVar);
                    }
                } else {
                    hts0Var = new hts0(this, lnmVar);
                }
                Object obj30 = hts0Var.a;
                int i56 = hts0Var.b;
                if (i56 == 0) {
                    hm5.M(obj30);
                    vgc0VarPath = ((Boolean) obj).booleanValue() ? new vgc0(2131955125, tgc0.a, 1) : null;
                    hts0Var.b = 1;
                    return vr20Var.emit(vgc0VarPath, hts0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof tus0) {
                    tus0Var = (tus0) lnmVar;
                    int i57 = tus0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        tus0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        tus0Var = new tus0(this, lnmVar);
                    }
                } else {
                    tus0Var = new tus0(this, lnmVar);
                }
                Object obj31 = tus0Var.a;
                int i58 = tus0Var.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf5 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    tus0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, tus0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof xzs0) {
                    xzs0Var = (xzs0) lnmVar;
                    int i59 = xzs0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        xzs0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        xzs0Var = new xzs0(this, lnmVar);
                    }
                } else {
                    xzs0Var = new xzs0(this, lnmVar);
                }
                Object obj32 = xzs0Var.a;
                int i60 = xzs0Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                if (((Number) obj).intValue() <= 0) {
                    return rih1Var;
                }
                xzs0Var.b = 1;
                return vr20Var.emit(obj, xzs0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ xhr0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
