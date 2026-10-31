package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rir implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ rir(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01db  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:167:0x0271  */
    /* JADX WARN: Code duplicated, block: B:182:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:201:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:218:0x0326  */
    /* JADX WARN: Code duplicated, block: B:236:0x036e  */
    /* JADX WARN: Code duplicated, block: B:246:0x038e  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0402  */
    /* JADX WARN: Code duplicated, block: B:300:0x0459  */
    /* JADX WARN: Code duplicated, block: B:317:0x049b  */
    /* JADX WARN: Code duplicated, block: B:336:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:364:0x0540  */
    /* JADX WARN: Code duplicated, block: B:379:0x0579  */
    /* JADX WARN: Code duplicated, block: B:394:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:409:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:433:0x0671  */
    /* JADX WARN: Code duplicated, block: B:451:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:476:0x0702  */
    /* JADX WARN: Code duplicated, block: B:521:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:539:0x081a  */
    /* JADX WARN: Code duplicated, block: B:556:0x0852  */
    /* JADX WARN: Code duplicated, block: B:578:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:596:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0165  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public final Object emit(Object obj, lnm lnmVar) {
        qir qirVar;
        mjr mjrVar;
        pjr pjrVar;
        zkr zkrVar;
        rnr rnrVar;
        tnr tnrVar;
        b2l y1lVar;
        b2l b2lVar;
        b2l z1lVar;
        nor norVar;
        oor oorVar;
        por porVar;
        gh91 gh91Var;
        epr eprVar;
        jpr jprVar;
        kpr kprVar;
        upr uprVar;
        pnl pnlVar;
        urr urrVar;
        xtr xtrVar;
        ywr ywrVar;
        pyr pyrVar;
        syr syrVar;
        l0s l0sVar;
        hp90 hp90Var;
        i1s i1sVar;
        j1s j1sVar;
        k1s k1sVar;
        q2s q2sVar;
        r2s r2sVar;
        p3s p3sVar;
        q3s q3sVar;
        t3s t3sVar;
        u3s u3sVar;
        w3s w3sVar;
        s4s s4sVar;
        byte b = this.a;
        luq0 luq0Var = luq0.e;
        z6x z6xVarSingletonList = z6x.a;
        int i = 2;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        j6l j6lVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof qir) {
                    qirVar = (qir) lnmVar;
                    int i2 = qirVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        qirVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        qirVar = new qir(this, lnmVar);
                    }
                } else {
                    qirVar = new qir(this, lnmVar);
                }
                Object obj3 = qirVar.a;
                int i3 = qirVar.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!((pir) obj).b()) {
                    return rih1Var;
                }
                qirVar.b = 1;
                return vr20Var.emit(obj, qirVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof mjr) {
                    mjrVar = (mjr) lnmVar;
                    int i4 = mjrVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        mjrVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        mjrVar = new mjr(this, lnmVar);
                    }
                } else {
                    mjrVar = new mjr(this, lnmVar);
                }
                Object obj4 = mjrVar.a;
                int i5 = mjrVar.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                l0l l0lVar = (l0l) ((e1l) obj).c.h();
                String strD = l0lVar != null ? l0lVar.d() : null;
                mjrVar.b = 1;
                return vr20Var.emit(strD, mjrVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof pjr) {
                    pjrVar = (pjr) lnmVar;
                    int i6 = pjrVar.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        pjrVar.b = i6 - Integer.MIN_VALUE;
                    } else {
                        pjrVar = new pjr(this, lnmVar);
                    }
                } else {
                    pjrVar = new pjr(this, lnmVar);
                }
                Object obj5 = pjrVar.a;
                int i7 = pjrVar.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                nnr nnrVar = (l0l) ((spq0) obj).h();
                if (nnrVar != null && nnrVar.l() && nnrVar.B.a.d == luq0Var) {
                    z = true;
                }
                lkb lkbVar = new lkb(z);
                pjrVar.b = 1;
                return vr20Var.emit(lkbVar, pjrVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof zkr) {
                    zkrVar = (zkr) lnmVar;
                    int i8 = zkrVar.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        zkrVar.b = i8 - Integer.MIN_VALUE;
                    } else {
                        zkrVar = new zkr(this, lnmVar);
                    }
                } else {
                    zkrVar = new zkr(this, lnmVar);
                }
                Object obj6 = zkrVar.a;
                int i9 = zkrVar.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!(obj instanceof bzc)) {
                    return rih1Var;
                }
                zkrVar.b = 1;
                return vr20Var.emit(obj, zkrVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof rnr) {
                    rnrVar = (rnr) lnmVar;
                    int i10 = rnrVar.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        rnrVar.b = i10 - Integer.MIN_VALUE;
                    } else {
                        rnrVar = new rnr(this, lnmVar);
                    }
                } else {
                    rnrVar = new rnr(this, lnmVar);
                }
                Object obj7 = rnrVar.a;
                int i11 = rnrVar.b;
                if (i11 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf = Boolean.valueOf(((j6l) obj) != null);
                    rnrVar.b = 1;
                    return vr20Var.emit(boolValueOf, rnrVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i11 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof tnr) {
                    tnrVar = (tnr) lnmVar;
                    int i12 = tnrVar.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        tnrVar.b = i12 - Integer.MIN_VALUE;
                    } else {
                        tnrVar = new tnr(this, lnmVar);
                    }
                } else {
                    tnrVar = new tnr(this, lnmVar);
                }
                Object obj8 = tnrVar.a;
                int i13 = tnrVar.b;
                if (i13 == 0) {
                    hm5.M(obj8);
                    k5l k5lVar = (m5l) obj;
                    if (k5lVar instanceof l5l) {
                        b2lVar = b2l.a;
                    } else {
                        if (k5lVar instanceof k5l) {
                            z1lVar = new a2l(k5lVar.a.a);
                        } else if (k5lVar instanceof j5l) {
                            l0l l0lVar2 = ((j5l) k5lVar).a;
                            z1lVar = new z1l(hqq0.T(l0lVar2), l0lVar2.z(), m1p1.w(l0lVar2), hqq0.S(l0lVar2));
                        } else if (k5lVar instanceof f5l) {
                            f5l f5lVar = (f5l) k5lVar;
                            hry0 hry0Var = f5lVar.b;
                            h5l h5lVar = f5lVar.a;
                            if (h5lVar instanceof h5l) {
                                l0l l0lVar3 = h5lVar.a;
                                y1lVar = new y1l(hqq0.T(l0lVar3), l0lVar3.z(), m1p1.w(l0lVar3), false, hry0Var.a, hqq0.S(l0lVar3));
                            } else if (h5lVar instanceof g5l) {
                                kx7 kx7Var = ((g5l) h5lVar).a;
                                f0u f0uVarQ = hqq0.Q(kx7Var);
                                xvd1 xvd1VarV = m1p1.v(kx7Var);
                                up7 up7Var = kx7Var.e;
                                y1lVar = new y1l(f0uVarQ, false, xvd1VarV, true, hry0Var.a, kx7Var.d == luq0Var ? up7Var != null ? up7Var.a : 0 : 0);
                            } else {
                                eg.o();
                            }
                            b2lVar = y1lVar;
                        } else {
                            eg.o();
                        }
                        b2lVar = z1lVar;
                    }
                    tnrVar.b = 1;
                    return vr20Var.emit(b2lVar, tnrVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof nor) {
                    norVar = (nor) lnmVar;
                    int i14 = norVar.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        norVar.b = i14 - Integer.MIN_VALUE;
                    } else {
                        norVar = new nor(this, lnmVar);
                    }
                } else {
                    norVar = new nor(this, lnmVar);
                }
                Object obj9 = norVar.a;
                int i15 = norVar.b;
                if (i15 == 0) {
                    hm5.M(obj9);
                    snb1 snb1Var = (snb1) obj;
                    if (snb1Var != null) {
                        m6l m6lVar = snb1Var.c;
                        t6l t6lVar = snb1Var.b;
                        if (t6lVar instanceof s6l) {
                            i = 1;
                        } else if (!(t6lVar instanceof n6l)) {
                            eg.o();
                        }
                        j6lVar = new j6l(m6lVar, i);
                    }
                    norVar.b = 1;
                    return vr20Var.emit(j6lVar, norVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof oor) {
                    oorVar = (oor) lnmVar;
                    int i16 = oorVar.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        oorVar.b = i16 - Integer.MIN_VALUE;
                    } else {
                        oorVar = new oor(this, lnmVar);
                    }
                } else {
                    oorVar = new oor(this, lnmVar);
                }
                Object obj10 = oorVar.a;
                int i17 = oorVar.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                snb1 snb1Var2 = (snb1) obj;
                if (snb1Var2 != null) {
                    z6xVarSingletonList = Collections.singletonList(snb1Var2.a);
                }
                oorVar.b = 1;
                return vr20Var.emit(z6xVarSingletonList, oorVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof por) {
                    porVar = (por) lnmVar;
                    int i18 = porVar.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        porVar.b = i18 - Integer.MIN_VALUE;
                    } else {
                        porVar = new por(this, lnmVar);
                    }
                } else {
                    porVar = new por(this, lnmVar);
                }
                Object obj11 = porVar.a;
                int i19 = porVar.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                snb1 snb1Var3 = (snb1) obj;
                if (snb1Var3 != null) {
                    nqs nqsVar = snb1Var3.e;
                    t6l t6lVar2 = snb1Var3.b;
                    m6l m6lVar2 = snb1Var3.c;
                    ah91 ah91Var = snb1Var3.d;
                    mr20 mr20Var = snb1Var3.f;
                    Long l = snb1Var3.h;
                    gh91Var = new gh91(t6lVar2, m6lVar2, ah91Var, nqsVar, mr20Var, l != null ? l.longValue() : 8000L, snb1Var3.g, new ptj(1, nqsVar, nqs.class, "dismiss", "dismiss$src_main_java_com_spotify_connect_smartcontrol_smartcontrolimpl_smartcontrolimpl(Lcom/spotify/connect/smartcontrol/smartcontrolimpl/StatusReason;)V", 0, (byte) 22));
                } else {
                    gh91Var = fh91.a;
                }
                porVar.b = 1;
                return vr20Var.emit(gh91Var, porVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof epr) {
                    eprVar = (epr) lnmVar;
                    int i20 = eprVar.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        eprVar.b = i20 - Integer.MIN_VALUE;
                    } else {
                        eprVar = new epr(this, lnmVar);
                    }
                } else {
                    eprVar = new epr(this, lnmVar);
                }
                Object obj12 = eprVar.a;
                int i21 = eprVar.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    Boolean boolValueOf2 = Boolean.valueOf(!((List) obj).isEmpty());
                    eprVar.b = 1;
                    return vr20Var.emit(boolValueOf2, eprVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof jpr) {
                    jprVar = (jpr) lnmVar;
                    int i22 = jprVar.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        jprVar.b = i22 - Integer.MIN_VALUE;
                    } else {
                        jprVar = new jpr(this, lnmVar);
                    }
                } else {
                    jprVar = new jpr(this, lnmVar);
                }
                Object obj13 = jprVar.a;
                int i23 = jprVar.b;
                if (i23 == 0) {
                    hm5.M(obj13);
                    pr31 pr31Var = ((vyc) obj).b;
                    jprVar.b = 1;
                    return vr20Var.emit(pr31Var, jprVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i23 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof kpr) {
                    kprVar = (kpr) lnmVar;
                    int i24 = kprVar.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        kprVar.b = i24 - Integer.MIN_VALUE;
                    } else {
                        kprVar = new kpr(this, lnmVar);
                    }
                } else {
                    kprVar = new kpr(this, lnmVar);
                }
                Object obj14 = kprVar.a;
                int i25 = kprVar.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    pr31 pr31Var2 = ((uyc) obj).b;
                    kprVar.b = 1;
                    return vr20Var.emit(pr31Var2, kprVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof upr) {
                    uprVar = (upr) lnmVar;
                    int i26 = uprVar.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        uprVar.b = i26 - Integer.MIN_VALUE;
                    } else {
                        uprVar = new upr(this, lnmVar);
                    }
                } else {
                    uprVar = new upr(this, lnmVar);
                }
                Object obj15 = uprVar.a;
                int i27 = uprVar.b;
                if (i27 == 0) {
                    hm5.M(obj15);
                    gh91 gh91Var2 = (ih91) obj;
                    if (gh91Var2 instanceof gh91) {
                        gh91 gh91Var3 = gh91Var2;
                        ah91 ah91Var2 = gh91Var3.c;
                        UUID uuid = gh91Var3.d.a;
                        s6l s6lVar = gh91Var3.a;
                        s6l s6lVar2 = s6lVar instanceof s6l ? s6lVar : null;
                        pnlVar = new pnl(ah91Var2, uuid, s6lVar2 != null ? s6lVar2.g : false);
                    } else if (gh91Var2 instanceof fh91) {
                        pnlVar = new pnl((ah91) null, (UUID) null, false);
                    } else {
                        eg.o();
                    }
                    uprVar.b = 1;
                    return vr20Var.emit(pnlVar, uprVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i27 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof urr) {
                    urrVar = (urr) lnmVar;
                    int i28 = urrVar.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        urrVar.b = i28 - Integer.MIN_VALUE;
                    } else {
                        urrVar = new urr(this, lnmVar);
                    }
                } else {
                    urrVar = new urr(this, lnmVar);
                }
                Object obj16 = urrVar.a;
                int i29 = urrVar.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                z6x z6xVar = (List) ((py21) obj).c();
                if (z6xVar != null) {
                    z6xVarSingletonList = z6xVar;
                }
                urrVar.b = 1;
                return vr20Var.emit(z6xVarSingletonList, urrVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof xtr) {
                    xtrVar = (xtr) lnmVar;
                    int i30 = xtrVar.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        xtrVar.b = i30 - Integer.MIN_VALUE;
                    } else {
                        xtrVar = new xtr(this, lnmVar);
                    }
                } else {
                    xtrVar = new xtr(this, lnmVar);
                }
                Object obj17 = xtrVar.a;
                int i31 = xtrVar.b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    return rih1Var;
                }
                xtrVar.b = 1;
                return vr20Var.emit(obj, xtrVar) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof ywr) {
                    ywrVar = (ywr) lnmVar;
                    int i32 = ywrVar.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ywrVar.b = i32 - Integer.MIN_VALUE;
                    } else {
                        ywrVar = new ywr(this, lnmVar);
                    }
                } else {
                    ywrVar = new ywr(this, lnmVar);
                }
                Object obj18 = ywrVar.a;
                int i33 = ywrVar.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                f7l1 f7l1VarA = ((cxc0) obj).f.x.a(f7l1.class);
                sqe sqeVar = f7l1VarA != null ? f7l1VarA.a : null;
                Boolean boolValueOf3 = Boolean.valueOf((sqeVar instanceof y6l1 ? (y6l1) sqeVar : null) != null);
                ywrVar.b = 1;
                return vr20Var.emit(boolValueOf3, ywrVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof pyr) {
                    pyrVar = (pyr) lnmVar;
                    int i34 = pyrVar.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        pyrVar.b = i34 - Integer.MIN_VALUE;
                    } else {
                        pyrVar = new pyr(this, lnmVar);
                    }
                } else {
                    pyrVar = new pyr(this, lnmVar);
                }
                Object obj19 = pyrVar.a;
                int i35 = pyrVar.b;
                if (i35 == 0) {
                    hm5.M(obj19);
                    Object objH = ((spq0) obj).h();
                    pyrVar.b = 1;
                    return vr20Var.emit(objH, pyrVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i35 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof syr) {
                    syrVar = (syr) lnmVar;
                    int i36 = syrVar.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        syrVar.b = i36 - Integer.MIN_VALUE;
                    } else {
                        syrVar = new syr(this, lnmVar);
                    }
                } else {
                    syrVar = new syr(this, lnmVar);
                }
                Object obj20 = syrVar.a;
                int i37 = syrVar.b;
                if (i37 == 0) {
                    hm5.M(obj20);
                    String str = ((th61) obj).a;
                    syrVar.b = 1;
                    return vr20Var.emit(str, syrVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof l0s) {
                    l0sVar = (l0s) lnmVar;
                    int i38 = l0sVar.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        l0sVar.b = i38 - Integer.MIN_VALUE;
                    } else {
                        l0sVar = new l0s(this, lnmVar);
                    }
                } else {
                    l0sVar = new l0s(this, lnmVar);
                }
                Object obj21 = l0sVar.a;
                int i39 = l0sVar.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                pp90 pp90Var = (pp90) obj;
                if (pp90Var != null) {
                    for (Object obj22 : pp90Var.c) {
                        if (u890.j(((hp90) obj22).c, pp90Var.h.b.c)) {
                            obj2 = obj22;
                            hp90Var = (hp90) obj2;
                            if (hp90Var != null && hp90Var.e) {
                                z = true;
                            }
                        }
                    }
                    hp90Var = (hp90) obj2;
                    if (hp90Var != null) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                l0sVar.b = 1;
                return vr20Var.emit(boolValueOf4, l0sVar) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof i1s) {
                    i1sVar = (i1s) lnmVar;
                    int i40 = i1sVar.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        i1sVar.b = i40 - Integer.MIN_VALUE;
                    } else {
                        i1sVar = new i1s(this, lnmVar);
                    }
                } else {
                    i1sVar = new i1s(this, lnmVar);
                }
                Object obj23 = i1sVar.a;
                int i41 = i1sVar.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                i1sVar.b = 1;
                return vr20Var.emit(obj, i1sVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof j1s) {
                    j1sVar = (j1s) lnmVar;
                    int i42 = j1sVar.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        j1sVar.b = i42 - Integer.MIN_VALUE;
                    } else {
                        j1sVar = new j1s(this, lnmVar);
                    }
                } else {
                    j1sVar = new j1s(this, lnmVar);
                }
                Object obj24 = j1sVar.a;
                int i43 = j1sVar.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                ro90 ro90Var = ((ap90) obj).b;
                if (ro90Var.a == null && ro90Var.b == null) {
                    return rih1Var;
                }
                j1sVar.b = 1;
                return vr20Var.emit(obj, j1sVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof k1s) {
                    k1sVar = (k1s) lnmVar;
                    int i44 = k1sVar.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        k1sVar.b = i44 - Integer.MIN_VALUE;
                    } else {
                        k1sVar = new k1s(this, lnmVar);
                    }
                } else {
                    k1sVar = new k1s(this, lnmVar);
                }
                Object obj25 = k1sVar.a;
                int i45 = k1sVar.b;
                if (i45 == 0) {
                    hm5.M(obj25);
                    to90 to90Var = ((ap90) obj).c;
                    k1sVar.b = 1;
                    return vr20Var.emit(to90Var, k1sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof q2s) {
                    q2sVar = (q2s) lnmVar;
                    int i46 = q2sVar.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        q2sVar.b = i46 - Integer.MIN_VALUE;
                    } else {
                        q2sVar = new q2s(this, lnmVar);
                    }
                } else {
                    q2sVar = new q2s(this, lnmVar);
                }
                Object obj26 = q2sVar.a;
                int i47 = q2sVar.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                ArrayList arrayList = new ArrayList();
                for (Object obj27 : (List) obj) {
                    if (((ki90) obj27).a.e) {
                        arrayList.add(obj27);
                    }
                }
                q2sVar.b = 1;
                return vr20Var.emit(arrayList, q2sVar) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof r2s) {
                    r2sVar = (r2s) lnmVar;
                    int i48 = r2sVar.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        r2sVar.b = i48 - Integer.MIN_VALUE;
                    } else {
                        r2sVar = new r2s(this, lnmVar);
                    }
                } else {
                    r2sVar = new r2s(this, lnmVar);
                }
                Object obj28 = r2sVar.a;
                int i49 = r2sVar.b;
                if (i49 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf5 = Boolean.valueOf(((tal) obj) instanceof qal);
                    r2sVar.b = 1;
                    return vr20Var.emit(boolValueOf5, r2sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i49 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof p3s) {
                    p3sVar = (p3s) lnmVar;
                    int i50 = p3sVar.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        p3sVar.b = i50 - Integer.MIN_VALUE;
                    } else {
                        p3sVar = new p3s(this, lnmVar);
                    }
                } else {
                    p3sVar = new p3s(this, lnmVar);
                }
                Object obj29 = p3sVar.a;
                int i51 = p3sVar.b;
                if (i51 == 0) {
                    hm5.M(obj29);
                    de9 de9Var = ((ge9) obj).b;
                    if (de9Var instanceof be9) {
                        return rih1Var;
                    }
                    if (de9Var instanceof de9) {
                        UUID uuid2 = de9Var.a;
                        if (!u890.j(uuid2, pe9.d) && !u890.j(uuid2, pe9.e)) {
                            return rih1Var;
                        }
                    } else if (de9Var instanceof ce9) {
                        int iOrdinal = ((ce9) de9Var).a.ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1) {
                            if (iOrdinal == 2 || iOrdinal == 3) {
                                return rih1Var;
                            }
                            eg.o();
                        }
                    } else {
                        eg.o();
                    }
                    p3sVar.b = 1;
                    return vr20Var.emit(obj, p3sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i51 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof q3s) {
                    q3sVar = (q3s) lnmVar;
                    int i52 = q3sVar.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        q3sVar.b = i52 - Integer.MIN_VALUE;
                    } else {
                        q3sVar = new q3s(this, lnmVar);
                    }
                } else {
                    q3sVar = new q3s(this, lnmVar);
                }
                Object obj30 = q3sVar.a;
                int i53 = q3sVar.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                if (!(obj instanceof ge9)) {
                    return rih1Var;
                }
                q3sVar.b = 1;
                return vr20Var.emit(obj, q3sVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof t3s) {
                    t3sVar = (t3s) lnmVar;
                    int i54 = t3sVar.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        t3sVar.b = i54 - Integer.MIN_VALUE;
                    } else {
                        t3sVar = new t3s(this, lnmVar);
                    }
                } else {
                    t3sVar = new t3s(this, lnmVar);
                }
                Object obj31 = t3sVar.a;
                int i55 = t3sVar.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                me9 me9Var = (me9) obj;
                if (!u890.j(me9Var.d, pe9.d) && !u890.j(me9Var.d, pe9.e)) {
                    return rih1Var;
                }
                t3sVar.b = 1;
                return vr20Var.emit(obj, t3sVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof u3s) {
                    u3sVar = (u3s) lnmVar;
                    int i56 = u3sVar.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        u3sVar.b = i56 - Integer.MIN_VALUE;
                    } else {
                        u3sVar = new u3s(this, lnmVar);
                    }
                } else {
                    u3sVar = new u3s(this, lnmVar);
                }
                Object obj32 = u3sVar.a;
                int i57 = u3sVar.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                if (!(obj instanceof me9)) {
                    return rih1Var;
                }
                u3sVar.b = 1;
                return vr20Var.emit(obj, u3sVar) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof w3s) {
                    w3sVar = (w3s) lnmVar;
                    int i58 = w3sVar.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        w3sVar.b = i58 - Integer.MIN_VALUE;
                    } else {
                        w3sVar = new w3s(this, lnmVar);
                    }
                } else {
                    w3sVar = new w3s(this, lnmVar);
                }
                Object obj33 = w3sVar.a;
                int i59 = w3sVar.b;
                if (i59 == 0) {
                    hm5.M(obj33);
                    Boolean boolValueOf6 = Boolean.valueOf(((bp90) obj).b);
                    w3sVar.b = 1;
                    return vr20Var.emit(boolValueOf6, w3sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i59 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof s4s) {
                    s4sVar = (s4s) lnmVar;
                    int i60 = s4sVar.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        s4sVar.b = i60 - Integer.MIN_VALUE;
                    } else {
                        s4sVar = new s4s(this, lnmVar);
                    }
                } else {
                    s4sVar = new s4s(this, lnmVar);
                }
                Object obj34 = s4sVar.a;
                int i61 = s4sVar.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                if (((List) obj).isEmpty()) {
                    return rih1Var;
                }
                s4sVar.b = 1;
                return vr20Var.emit(obj, s4sVar) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ rir(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
