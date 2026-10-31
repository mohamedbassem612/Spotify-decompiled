package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qkv0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ qkv0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x021c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0263  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:190:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:205:0x0326  */
    /* JADX WARN: Code duplicated, block: B:220:0x0365  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:250:0x03df  */
    /* JADX WARN: Code duplicated, block: B:265:0x0417  */
    /* JADX WARN: Code duplicated, block: B:282:0x0452  */
    /* JADX WARN: Code duplicated, block: B:297:0x048a  */
    /* JADX WARN: Code duplicated, block: B:322:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:334:0x051e  */
    /* JADX WARN: Code duplicated, block: B:349:0x055a  */
    /* JADX WARN: Code duplicated, block: B:366:0x0597  */
    /* JADX WARN: Code duplicated, block: B:381:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:396:0x0613  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:411:0x065e  */
    /* JADX WARN: Code duplicated, block: B:426:0x069c  */
    /* JADX WARN: Code duplicated, block: B:441:0x06da  */
    /* JADX WARN: Code duplicated, block: B:456:0x0715  */
    /* JADX WARN: Code duplicated, block: B:474:0x0752  */
    /* JADX WARN: Code duplicated, block: B:489:0x0790  */
    /* JADX WARN: Code duplicated, block: B:504:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:546:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        pkv0 pkv0Var;
        rov0 rov0Var;
        jpv0 jpv0Var;
        kpv0 kpv0Var;
        vzv0 vzv0Var;
        tew0 tew0Var;
        uew0 uew0Var;
        efw0 efw0Var;
        lfw0 lfw0Var;
        mfw0 mfw0Var;
        hjw0 hjw0Var;
        ijw0 ijw0Var;
        jjw0 jjw0Var;
        mmr0 mmr0Var;
        String str;
        yjw0 yjw0Var;
        fkw0 fkw0Var;
        gkw0 gkw0Var;
        mkw0 mkw0Var;
        gpw0 gpw0Var;
        hpw0 hpw0Var;
        ipw0 ipw0Var;
        bqw0 bqw0Var;
        dqw0 dqw0Var;
        mtw0 mtw0Var;
        ntw0 ntw0Var;
        otw0 otw0Var;
        pb2 pb2Var;
        ptw0 ptw0Var;
        oe2 oe2Var;
        tuw0 tuw0Var;
        uuw0 uuw0Var;
        vuw0 vuw0Var;
        rvw0 rvw0Var;
        byte b = this.a;
        w8c0 w8c0Var = w8c0.d;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object vgc0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof pkv0) {
                    pkv0Var = (pkv0) lnmVar;
                    int i = pkv0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pkv0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        pkv0Var = new pkv0(this, lnmVar);
                    }
                } else {
                    pkv0Var = new pkv0(this, lnmVar);
                }
                Object obj2 = pkv0Var.a;
                int i2 = pkv0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Map map = (Map) obj;
                map.getClass();
                ykv0 ykv0Var = new ykv0(map);
                pkv0Var.b = 1;
                return vr20Var.emit(ykv0Var, pkv0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof rov0) {
                    rov0Var = (rov0) lnmVar;
                    int i3 = rov0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rov0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        rov0Var = new rov0(this, lnmVar);
                    }
                } else {
                    rov0Var = new rov0(this, lnmVar);
                }
                Object obj3 = rov0Var.a;
                int i4 = rov0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    jfn jfnVar = new jfn(((Boolean) obj).booleanValue());
                    rov0Var.b = 1;
                    return vr20Var.emit(jfnVar, rov0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof jpv0) {
                    jpv0Var = (jpv0) lnmVar;
                    int i5 = jpv0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jpv0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        jpv0Var = new jpv0(this, lnmVar);
                    }
                } else {
                    jpv0Var = new jpv0(this, lnmVar);
                }
                Object obj4 = jpv0Var.a;
                int i6 = jpv0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf = Boolean.valueOf(y7y0.A((Map) obj));
                    jpv0Var.b = 1;
                    return vr20Var.emit(boolValueOf, jpv0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof kpv0) {
                    kpv0Var = (kpv0) lnmVar;
                    int i7 = kpv0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kpv0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        kpv0Var = new kpv0(this, lnmVar);
                    }
                } else {
                    kpv0Var = new kpv0(this, lnmVar);
                }
                Object obj5 = kpv0Var.a;
                int i8 = kpv0Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    Boolean boolValueOf2 = Boolean.valueOf(((hpe0) obj) != null);
                    kpv0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, kpv0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof vzv0) {
                    vzv0Var = (vzv0) lnmVar;
                    int i9 = vzv0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vzv0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        vzv0Var = new vzv0(this, lnmVar);
                    }
                } else {
                    vzv0Var = new vzv0(this, lnmVar);
                }
                Object obj6 = vzv0Var.a;
                int i10 = vzv0Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    fio fioVar = new fio((Map) obj);
                    vzv0Var.b = 1;
                    return vr20Var.emit(fioVar, vzv0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof tew0) {
                    tew0Var = (tew0) lnmVar;
                    int i11 = tew0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        tew0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        tew0Var = new tew0(this, lnmVar);
                    }
                } else {
                    tew0Var = new tew0(this, lnmVar);
                }
                Object obj7 = tew0Var.a;
                int i12 = tew0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    vir0 vir0VarG = f610.g(((Boolean) obj).booleanValue());
                    tew0Var.b = 1;
                    return vr20Var.emit(vir0VarG, tew0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof uew0) {
                    uew0Var = (uew0) lnmVar;
                    int i13 = uew0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        uew0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        uew0Var = new uew0(this, lnmVar);
                    }
                } else {
                    uew0Var = new uew0(this, lnmVar);
                }
                Object obj8 = uew0Var.a;
                int i14 = uew0Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf3 = Boolean.valueOf(((w8c0) obj).a(w8c0Var));
                    uew0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, uew0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof efw0) {
                    efw0Var = (efw0) lnmVar;
                    int i15 = efw0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        efw0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        efw0Var = new efw0(this, lnmVar);
                    }
                } else {
                    efw0Var = new efw0(this, lnmVar);
                }
                Object obj9 = efw0Var.a;
                int i16 = efw0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                mmr0 mmr0Var2 = (mmr0) obj;
                maw0 maw0Var = new maw0(fqo1.C((hwt) mmr0Var2.a), ((Boolean) mmr0Var2.b).booleanValue());
                efw0Var.b = 1;
                return vr20Var.emit(maw0Var, efw0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof lfw0) {
                    lfw0Var = (lfw0) lnmVar;
                    int i17 = lfw0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        lfw0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        lfw0Var = new lfw0(this, lnmVar);
                    }
                } else {
                    lfw0Var = new lfw0(this, lnmVar);
                }
                Object obj10 = lfw0Var.a;
                int i18 = lfw0Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    vir0 vir0VarG2 = f610.g(((Boolean) obj).booleanValue());
                    lfw0Var.b = 1;
                    return vr20Var.emit(vir0VarG2, lfw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof mfw0) {
                    mfw0Var = (mfw0) lnmVar;
                    int i19 = mfw0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        mfw0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        mfw0Var = new mfw0(this, lnmVar);
                    }
                } else {
                    mfw0Var = new mfw0(this, lnmVar);
                }
                Object obj11 = mfw0Var.a;
                int i20 = mfw0Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf4 = Boolean.valueOf(((w8c0) obj).a(w8c0Var));
                    mfw0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, mfw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof hjw0) {
                    hjw0Var = (hjw0) lnmVar;
                    int i21 = hjw0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        hjw0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        hjw0Var = new hjw0(this, lnmVar);
                    }
                } else {
                    hjw0Var = new hjw0(this, lnmVar);
                }
                Object obj12 = hjw0Var.a;
                int i22 = hjw0Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
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
                hjw0Var.b = 1;
                return vr20Var.emit(obj, hjw0Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof ijw0) {
                    ijw0Var = (ijw0) lnmVar;
                    int i23 = ijw0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ijw0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        ijw0Var = new ijw0(this, lnmVar);
                    }
                } else {
                    ijw0Var = new ijw0(this, lnmVar);
                }
                Object obj13 = ijw0Var.a;
                int i24 = ijw0Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    List listB = ((uv00) obj).b(pjw0.class);
                    ijw0Var.b = 1;
                    return vr20Var.emit(listB, ijw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof jjw0) {
                    jjw0Var = (jjw0) lnmVar;
                    int i25 = jjw0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        jjw0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        jjw0Var = new jjw0(this, lnmVar);
                    }
                } else {
                    jjw0Var = new jjw0(this, lnmVar);
                }
                Object obj14 = jjw0Var.a;
                int i26 = jjw0Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    ArrayList arrayList = new ArrayList();
                    for (tv00 tv00Var : (List) obj) {
                        String str2 = tv00Var.a;
                        pjw0 pjw0Var = tv00Var.b;
                        if (pjw0Var != null) {
                            ljw0 ljw0Var = pjw0Var.b;
                            if (ljw0Var instanceof ljw0) {
                                str = ljw0Var.a.a.a.a;
                            } else if (ljw0Var instanceof mjw0) {
                                ko7 ko7Var = ((mjw0) ljw0Var).a.c;
                                str = ko7Var != null ? ko7Var.a.a.a : null;
                            } else {
                                eg.o();
                            }
                            if (str == null) {
                                mmr0Var = null;
                            } else {
                                mmr0Var = new mmr0(str2, str);
                            }
                        } else {
                            mmr0Var = null;
                        }
                        if (mmr0Var != null) {
                            arrayList.add(mmr0Var);
                        }
                    }
                    Map mapT = sqg0.T(arrayList);
                    jjw0Var.b = 1;
                    return vr20Var.emit(mapT, jjw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof yjw0) {
                    yjw0Var = (yjw0) lnmVar;
                    int i27 = yjw0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        yjw0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        yjw0Var = new yjw0(this, lnmVar);
                    }
                } else {
                    yjw0Var = new yjw0(this, lnmVar);
                }
                Object obj15 = yjw0Var.a;
                int i28 = yjw0Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    o091 o091Var = ((i091) obj).h;
                    yjw0Var.b = 1;
                    return vr20Var.emit(o091Var, yjw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof fkw0) {
                    fkw0Var = (fkw0) lnmVar;
                    int i29 = fkw0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        fkw0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        fkw0Var = new fkw0(this, lnmVar);
                    }
                } else {
                    fkw0Var = new fkw0(this, lnmVar);
                }
                Object obj16 = fkw0Var.a;
                int i30 = fkw0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                if (!((fw8) obj).b) {
                    return rih1Var;
                }
                fkw0Var.b = 1;
                return vr20Var.emit(obj, fkw0Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof gkw0) {
                    gkw0Var = (gkw0) lnmVar;
                    int i31 = gkw0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        gkw0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        gkw0Var = new gkw0(this, lnmVar);
                    }
                } else {
                    gkw0Var = new gkw0(this, lnmVar);
                }
                Object obj17 = gkw0Var.a;
                int i32 = gkw0Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    o091 o091Var2 = ((i091) obj).h;
                    gkw0Var.b = 1;
                    return vr20Var.emit(o091Var2, gkw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof mkw0) {
                    mkw0Var = (mkw0) lnmVar;
                    int i33 = mkw0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        mkw0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        mkw0Var = new mkw0(this, lnmVar);
                    }
                } else {
                    mkw0Var = new mkw0(this, lnmVar);
                }
                Object obj18 = mkw0Var.a;
                int i34 = mkw0Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    l3k0 l3k0Var = new l3k0((bdk0) obj);
                    mkw0Var.b = 1;
                    return vr20Var.emit(l3k0Var, mkw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof gpw0) {
                    gpw0Var = (gpw0) lnmVar;
                    int i35 = gpw0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        gpw0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        gpw0Var = new gpw0(this, lnmVar);
                    }
                } else {
                    gpw0Var = new gpw0(this, lnmVar);
                }
                Object obj19 = gpw0Var.a;
                int i36 = gpw0Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf5 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    gpw0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, gpw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof hpw0) {
                    hpw0Var = (hpw0) lnmVar;
                    int i37 = hpw0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        hpw0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        hpw0Var = new hpw0(this, lnmVar);
                    }
                } else {
                    hpw0Var = new hpw0(this, lnmVar);
                }
                Object obj20 = hpw0Var.a;
                int i38 = hpw0Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    zow0 zow0Var = new zow0(((Boolean) obj).booleanValue());
                    hpw0Var.b = 1;
                    return vr20Var.emit(zow0Var, hpw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof ipw0) {
                    ipw0Var = (ipw0) lnmVar;
                    int i39 = ipw0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        ipw0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        ipw0Var = new ipw0(this, lnmVar);
                    }
                } else {
                    ipw0Var = new ipw0(this, lnmVar);
                }
                Object obj21 = ipw0Var.a;
                int i40 = ipw0Var.b;
                if (i40 == 0) {
                    hm5.M(obj21);
                    apw0 apw0Var = new apw0(((Boolean) obj).booleanValue());
                    ipw0Var.b = 1;
                    return vr20Var.emit(apw0Var, ipw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof bqw0) {
                    bqw0Var = (bqw0) lnmVar;
                    int i41 = bqw0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        bqw0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        bqw0Var = new bqw0(this, lnmVar);
                    }
                } else {
                    bqw0Var = new bqw0(this, lnmVar);
                }
                Object obj22 = bqw0Var.a;
                int i42 = bqw0Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    wls0 wls0Var = ((cxc0) obj).f.v;
                    bqw0Var.b = 1;
                    return vr20Var.emit(wls0Var, bqw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof dqw0) {
                    dqw0Var = (dqw0) lnmVar;
                    int i43 = dqw0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        dqw0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        dqw0Var = new dqw0(this, lnmVar);
                    }
                } else {
                    dqw0Var = new dqw0(this, lnmVar);
                }
                Object obj23 = dqw0Var.a;
                int i44 = dqw0Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    vgc0Var = ((Boolean) obj).booleanValue() ? new vgc0(2131960430, tgc0.a, 1) : null;
                    dqw0Var.b = 1;
                    return vr20Var.emit(vgc0Var, dqw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof mtw0) {
                    mtw0Var = (mtw0) lnmVar;
                    int i45 = mtw0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        mtw0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        mtw0Var = new mtw0(this, lnmVar);
                    }
                } else {
                    mtw0Var = new mtw0(this, lnmVar);
                }
                Object obj24 = mtw0Var.a;
                int i46 = mtw0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                try {
                    Integer num = new Integer(Integer.parseInt((String) obj));
                    if (num.intValue() != -1) {
                        vgc0Var = num;
                    }
                } catch (NumberFormatException unused) {
                }
                mtw0Var.b = 1;
                return vr20Var.emit(vgc0Var, mtw0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof ntw0) {
                    ntw0Var = (ntw0) lnmVar;
                    int i47 = ntw0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ntw0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        ntw0Var = new ntw0(this, lnmVar);
                    }
                } else {
                    ntw0Var = new ntw0(this, lnmVar);
                }
                Object obj25 = ntw0Var.a;
                int i48 = ntw0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                try {
                    Integer num2 = new Integer(Integer.parseInt((String) obj));
                    if (num2.intValue() != -1) {
                        vgc0Var = num2;
                    }
                } catch (NumberFormatException unused2) {
                }
                ntw0Var.b = 1;
                return vr20Var.emit(vgc0Var, ntw0Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof otw0) {
                    otw0Var = (otw0) lnmVar;
                    int i49 = otw0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        otw0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        otw0Var = new otw0(this, lnmVar);
                    }
                } else {
                    otw0Var = new otw0(this, lnmVar);
                }
                Object obj26 = otw0Var.a;
                int i50 = otw0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                String str3 = (String) obj;
                d7 d7Var = new d7(pb2.d, (byte) 0);
                while (d7Var.hasNext()) {
                    Object next = d7Var.next();
                    if (((pb2) next).a.equalsIgnoreCase(str3)) {
                        vgc0Var = next;
                        pb2Var = (pb2) vgc0Var;
                        if (pb2Var == null) {
                            pb2Var = pb2.b;
                        }
                        otw0Var.b = 1;
                        if (vr20Var.emit(pb2Var, otw0Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                pb2Var = (pb2) vgc0Var;
                if (pb2Var == null) {
                    pb2Var = pb2.b;
                }
                otw0Var.b = 1;
                if (vr20Var.emit(pb2Var, otw0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 25:
                if (lnmVar instanceof ptw0) {
                    ptw0Var = (ptw0) lnmVar;
                    int i51 = ptw0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        ptw0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        ptw0Var = new ptw0(this, lnmVar);
                    }
                } else {
                    ptw0Var = new ptw0(this, lnmVar);
                }
                Object obj27 = ptw0Var.a;
                int i52 = ptw0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                String str4 = (String) obj;
                d7 d7Var2 = new d7(oe2.d, (byte) 0);
                while (d7Var2.hasNext()) {
                    Object next2 = d7Var2.next();
                    if (((oe2) next2).a.equalsIgnoreCase(str4)) {
                        vgc0Var = next2;
                        oe2Var = (oe2) vgc0Var;
                        if (oe2Var == null) {
                            oe2Var = oe2.b;
                        }
                        ptw0Var.b = 1;
                        if (vr20Var.emit(oe2Var, ptw0Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                oe2Var = (oe2) vgc0Var;
                if (oe2Var == null) {
                    oe2Var = oe2.b;
                }
                ptw0Var.b = 1;
                if (vr20Var.emit(oe2Var, ptw0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 26:
                if (lnmVar instanceof tuw0) {
                    tuw0Var = (tuw0) lnmVar;
                    int i53 = tuw0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        tuw0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        tuw0Var = new tuw0(this, lnmVar);
                    }
                } else {
                    tuw0Var = new tuw0(this, lnmVar);
                }
                Object obj28 = tuw0Var.a;
                int i54 = tuw0Var.b;
                if (i54 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf6 = Boolean.valueOf(u890.j((String) obj, "1"));
                    tuw0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, tuw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof uuw0) {
                    uuw0Var = (uuw0) lnmVar;
                    int i55 = uuw0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        uuw0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        uuw0Var = new uuw0(this, lnmVar);
                    }
                } else {
                    uuw0Var = new uuw0(this, lnmVar);
                }
                Object obj29 = uuw0Var.a;
                int i56 = uuw0Var.b;
                if (i56 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf7 = Boolean.valueOf(u890.j((String) obj, "1"));
                    uuw0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, uuw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof vuw0) {
                    vuw0Var = (vuw0) lnmVar;
                    int i57 = vuw0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        vuw0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        vuw0Var = new vuw0(this, lnmVar);
                    }
                } else {
                    vuw0Var = new vuw0(this, lnmVar);
                }
                Object obj30 = vuw0Var.a;
                int i58 = vuw0Var.b;
                if (i58 == 0) {
                    hm5.M(obj30);
                    Boolean boolValueOf8 = Boolean.valueOf(u890.j((String) obj, "1"));
                    vuw0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, vuw0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof rvw0) {
                    rvw0Var = (rvw0) lnmVar;
                    int i59 = rvw0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        rvw0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        rvw0Var = new rvw0(this, lnmVar);
                    }
                } else {
                    rvw0Var = new rvw0(this, lnmVar);
                }
                Object obj31 = rvw0Var.a;
                int i60 = rvw0Var.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                Map map2 = (Map) obj;
                map2.getClass();
                Boolean boolValueOf9 = Boolean.valueOf(y7y0.G(map2));
                rvw0Var.b = 1;
                return vr20Var.emit(boolValueOf9, rvw0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ qkv0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
