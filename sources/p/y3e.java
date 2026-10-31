package p;

import android.net.Uri;
import com.google.protobuf.BytesValue;
import com.spotify.concertpageview.v1.Row;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$ConnectRequest;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.PlayerState;
import j$.util.Base64;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y3e implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ y3e(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x021c  */
    /* JADX WARN: Code duplicated, block: B:144:0x025c  */
    /* JADX WARN: Code duplicated, block: B:162:0x029c  */
    /* JADX WARN: Code duplicated, block: B:177:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:194:0x0310  */
    /* JADX WARN: Code duplicated, block: B:215:0x0356  */
    /* JADX WARN: Code duplicated, block: B:236:0x039c  */
    /* JADX WARN: Code duplicated, block: B:253:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:270:0x040f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0447  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:304:0x0482  */
    /* JADX WARN: Code duplicated, block: B:321:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:355:0x052d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0565  */
    /* JADX WARN: Code duplicated, block: B:387:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:404:0x05de  */
    /* JADX WARN: Code duplicated, block: B:419:0x0628  */
    /* JADX WARN: Code duplicated, block: B:434:0x0664  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:449:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:481:0x071d  */
    /* JADX WARN: Code duplicated, block: B:501:0x076b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:88:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final Object emit(Object obj, lnm lnmVar) {
        x3e x3eVar;
        z3e z3eVar;
        c4e c4eVar;
        oae oaeVar;
        sae saeVar;
        fee feeVar;
        cie cieVar;
        jie jieVar;
        kie kieVar;
        yie yieVar;
        bje bjeVar;
        cje cjeVar;
        eje ejeVar;
        fje fjeVar;
        ije ijeVar;
        jje jjeVar;
        eke ekeVar;
        ike ikeVar;
        iix0 iix0Var;
        dme dmeVar;
        gte gteVar;
        hte hteVar;
        p0f p0fVar;
        t3f t3fVar;
        l9f l9fVar;
        f9f h9fVar;
        vef vefVar;
        iff iffVar;
        sff sffVar;
        yif yifVar;
        hkf hkfVar;
        clf clfVar;
        byte b = this.a;
        i9d0 i9d0Var = i9d0.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof x3e) {
                    x3eVar = (x3e) lnmVar;
                    int i = x3eVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        x3eVar.b = i - Integer.MIN_VALUE;
                    } else {
                        x3eVar = new x3e(this, lnmVar);
                    }
                } else {
                    x3eVar = new x3e(this, lnmVar);
                }
                Object obj2 = x3eVar.a;
                int i2 = x3eVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    byte[] bArr = (byte[]) obj;
                    try {
                        CastMessages$ConnectRequest castMessages$ConnectRequestO = CastMessages$ConnectRequest.o(bArr);
                        x3eVar.b = 1;
                        return vr20Var.emit(castMessages$ConnectRequestO, x3eVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.discovery.cast.esperanto.proto.CastMessages.ConnectRequest: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                if (lnmVar instanceof z3e) {
                    z3eVar = (z3e) lnmVar;
                    int i3 = z3eVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z3eVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        z3eVar = new z3e(this, lnmVar);
                    }
                } else {
                    z3eVar = new z3e(this, lnmVar);
                }
                Object obj3 = z3eVar.a;
                int i4 = z3eVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        BytesValue bytesValueP = BytesValue.p(bArr2);
                        z3eVar.b = 1;
                        return vr20Var.emit(bytesValueP, z3eVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.BytesValue: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                if (lnmVar instanceof c4e) {
                    c4eVar = (c4e) lnmVar;
                    int i5 = c4eVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c4eVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        c4eVar = new c4e(this, lnmVar);
                    }
                } else {
                    c4eVar = new c4e(this, lnmVar);
                }
                Object obj4 = c4eVar.a;
                int i6 = c4eVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (((ie61) obj) instanceof ce61) {
                    return rih1Var;
                }
                c4eVar.b = 1;
                return vr20Var.emit(obj, c4eVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof oae) {
                    oaeVar = (oae) lnmVar;
                    int i7 = oaeVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        oaeVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        oaeVar = new oae(this, lnmVar);
                    }
                } else {
                    oaeVar = new oae(this, lnmVar);
                }
                Object obj5 = oaeVar.a;
                int i8 = oaeVar.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    lae laeVar = new lae(((Boolean) obj).booleanValue());
                    oaeVar.b = 1;
                    return vr20Var.emit(laeVar, oaeVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof sae) {
                    saeVar = (sae) lnmVar;
                    int i9 = saeVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        saeVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        saeVar = new sae(this, lnmVar);
                    }
                } else {
                    saeVar = new sae(this, lnmVar);
                }
                Object obj6 = saeVar.a;
                int i10 = saeVar.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    rlq0 rlq0Var = new rlq0(((qae) obj).b);
                    saeVar.b = 1;
                    return vr20Var.emit(rlq0Var, saeVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof fee) {
                    feeVar = (fee) lnmVar;
                    int i11 = feeVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        feeVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        feeVar = new fee(this, lnmVar);
                    }
                } else {
                    feeVar = new fee(this, lnmVar);
                }
                Object obj7 = feeVar.a;
                int i12 = feeVar.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    izz izzVar = new izz((Uri) obj);
                    feeVar.b = 1;
                    return vr20Var.emit(izzVar, feeVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof cie) {
                    cieVar = (cie) lnmVar;
                    int i13 = cieVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        cieVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        cieVar = new cie(this, lnmVar);
                    }
                } else {
                    cieVar = new cie(this, lnmVar);
                }
                Object obj8 = cieVar.a;
                int i14 = cieVar.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                qie qieVar = (qie) obj;
                eie eieVar = new eie(qieVar.a, qieVar.b, qieVar.e, qieVar.c, qieVar.d);
                cieVar.b = 1;
                return vr20Var.emit(eieVar, cieVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof jie) {
                    jieVar = (jie) lnmVar;
                    int i15 = jieVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        jieVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        jieVar = new jie(this, lnmVar);
                    }
                } else {
                    jieVar = new jie(this, lnmVar);
                }
                Object obj9 = jieVar.a;
                int i16 = jieVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                jieVar.b = 1;
                return vr20Var.emit(obj, jieVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof kie) {
                    kieVar = (kie) lnmVar;
                    int i17 = kieVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        kieVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        kieVar = new kie(this, lnmVar);
                    }
                } else {
                    kieVar = new kie(this, lnmVar);
                }
                Object obj10 = kieVar.a;
                int i18 = kieVar.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    ((Boolean) obj).getClass();
                    kieVar.b = 1;
                    return vr20Var.emit(fie.a, kieVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof yie) {
                    yieVar = (yie) lnmVar;
                    int i19 = yieVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        yieVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        yieVar = new yie(this, lnmVar);
                    }
                } else {
                    yieVar = new yie(this, lnmVar);
                }
                Object obj11 = yieVar.a;
                int i20 = yieVar.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                yieVar.b = 1;
                return vr20Var.emit(obj, yieVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof bje) {
                    bjeVar = (bje) lnmVar;
                    int i21 = bjeVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        bjeVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        bjeVar = new bje(this, lnmVar);
                    }
                } else {
                    bjeVar = new bje(this, lnmVar);
                }
                Object obj12 = bjeVar.a;
                int i22 = bjeVar.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                bjeVar.b = 1;
                return vr20Var.emit(obj, bjeVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof cje) {
                    cjeVar = (cje) lnmVar;
                    int i23 = cjeVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        cjeVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        cjeVar = new cje(this, lnmVar);
                    }
                } else {
                    cjeVar = new cje(this, lnmVar);
                }
                Object obj13 = cjeVar.a;
                int i24 = cjeVar.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                Object obj14 = ((i1r) obj).a;
                if (obj14 == null) {
                    return rih1Var;
                }
                cjeVar.b = 1;
                return vr20Var.emit(obj14, cjeVar) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof eje) {
                    ejeVar = (eje) lnmVar;
                    int i25 = ejeVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ejeVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        ejeVar = new eje(this, lnmVar);
                    }
                } else {
                    ejeVar = new eje(this, lnmVar);
                }
                Object obj15 = ejeVar.a;
                int i26 = ejeVar.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                ejeVar.b = 1;
                return vr20Var.emit(obj, ejeVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof fje) {
                    fjeVar = (fje) lnmVar;
                    int i27 = fjeVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        fjeVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        fjeVar = new fje(this, lnmVar);
                    }
                } else {
                    fjeVar = new fje(this, lnmVar);
                }
                Object obj16 = fjeVar.a;
                int i28 = fjeVar.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                Object obj17 = ((i1r) obj).a;
                if (obj17 == null) {
                    return rih1Var;
                }
                fjeVar.b = 1;
                return vr20Var.emit(obj17, fjeVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof ije) {
                    ijeVar = (ije) lnmVar;
                    int i29 = ijeVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ijeVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        ijeVar = new ije(this, lnmVar);
                    }
                } else {
                    ijeVar = new ije(this, lnmVar);
                }
                Object obj18 = ijeVar.a;
                int i30 = ijeVar.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                ijeVar.b = 1;
                return vr20Var.emit(obj, ijeVar) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof jje) {
                    jjeVar = (jje) lnmVar;
                    int i31 = jjeVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        jjeVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        jjeVar = new jje(this, lnmVar);
                    }
                } else {
                    jjeVar = new jje(this, lnmVar);
                }
                Object obj19 = jjeVar.a;
                int i32 = jjeVar.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                Object obj20 = ((i1r) obj).a;
                if (obj20 == null) {
                    return rih1Var;
                }
                jjeVar.b = 1;
                return vr20Var.emit(obj20, jjeVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof eke) {
                    ekeVar = (eke) lnmVar;
                    int i33 = ekeVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ekeVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        ekeVar = new eke(this, lnmVar);
                    }
                } else {
                    ekeVar = new eke(this, lnmVar);
                }
                Object obj21 = ekeVar.a;
                int i34 = ekeVar.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                if (!(obj instanceof lb31)) {
                    return rih1Var;
                }
                ekeVar.b = 1;
                return vr20Var.emit(obj, ekeVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof ike) {
                    ikeVar = (ike) lnmVar;
                    int i35 = ikeVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ikeVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        ikeVar = new ike(this, lnmVar);
                    }
                } else {
                    ikeVar = new ike(this, lnmVar);
                }
                Object obj22 = ikeVar.a;
                int i36 = ikeVar.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                iix0Var = i1rVar2 != null ? (iix0) i1rVar2.a : null;
                ikeVar.b = 1;
                return vr20Var.emit(iix0Var, ikeVar) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof dme) {
                    dmeVar = (dme) lnmVar;
                    int i37 = dmeVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        dmeVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        dmeVar = new dme(this, lnmVar);
                    }
                } else {
                    dmeVar = new dme(this, lnmVar);
                }
                Object obj23 = dmeVar.a;
                int i38 = dmeVar.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                iix0Var = i1rVar4 != null ? (iix0) i1rVar4.a : null;
                dmeVar.b = 1;
                return vr20Var.emit(iix0Var, dmeVar) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof gte) {
                    gteVar = (gte) lnmVar;
                    int i39 = gteVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        gteVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        gteVar = new gte(this, lnmVar);
                    }
                } else {
                    gteVar = new gte(this, lnmVar);
                }
                Object obj24 = gteVar.a;
                int i40 = gteVar.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                gteVar.b = 1;
                return vr20Var.emit(obj, gteVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof hte) {
                    hteVar = (hte) lnmVar;
                    int i41 = hteVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hteVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        hteVar = new hte(this, lnmVar);
                    }
                } else {
                    hteVar = new hte(this, lnmVar);
                }
                Object obj25 = hteVar.a;
                int i42 = hteVar.b;
                if (i42 == 0) {
                    hm5.M(obj25);
                    String str = ((th61) obj).a;
                    hteVar.b = 1;
                    return vr20Var.emit(str, hteVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof p0f) {
                    p0fVar = (p0f) lnmVar;
                    int i43 = p0fVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        p0fVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        p0fVar = new p0f(this, lnmVar);
                    }
                } else {
                    p0fVar = new p0f(this, lnmVar);
                }
                Object obj26 = p0fVar.a;
                int i44 = p0fVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                u3f u3fVar = (u3f) obj;
                if (u3fVar == null) {
                    u3fVar = new u3f((ibf) null, z6x.a);
                }
                p0fVar.b = 1;
                return vr20Var.emit(u3fVar, p0fVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof t3f) {
                    t3fVar = (t3f) lnmVar;
                    int i45 = t3fVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        t3fVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        t3fVar = new t3f(this, lnmVar);
                    }
                } else {
                    t3fVar = new t3f(this, lnmVar);
                }
                Object obj27 = t3fVar.a;
                int i46 = t3fVar.b;
                if (i46 == 0) {
                    hm5.M(obj27);
                    Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    t3fVar.b = 1;
                    return vr20Var.emit(boolValueOf, t3fVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof l9f) {
                    l9fVar = (l9f) lnmVar;
                    int i47 = l9fVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        l9fVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        l9fVar = new l9f(this, lnmVar);
                    }
                } else {
                    l9fVar = new l9f(this, lnmVar);
                }
                Object obj28 = l9fVar.a;
                int i48 = l9fVar.b;
                if (i48 == 0) {
                    hm5.M(obj28);
                    z7d z7dVar = (z7d) obj;
                    if (u890.j(z7dVar, y7d.a)) {
                        h9fVar = f9f.a;
                    } else if (u890.j(z7dVar, w7d.a)) {
                        h9fVar = g9f.a;
                    } else if (z7dVar instanceof x7d) {
                        h9fVar = new h9f(((x7d) z7dVar).a);
                    } else {
                        eg.o();
                    }
                    l9fVar.b = 1;
                    return vr20Var.emit(h9fVar, l9fVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof vef) {
                    vefVar = (vef) lnmVar;
                    int i49 = vefVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        vefVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        vefVar = new vef(this, lnmVar);
                    }
                } else {
                    vefVar = new vef(this, lnmVar);
                }
                Object obj29 = vefVar.a;
                int i50 = vefVar.b;
                if (i50 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf2 = Boolean.valueOf(y7y0.A((Map) obj));
                    vefVar.b = 1;
                    return vr20Var.emit(boolValueOf2, vefVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof iff) {
                    iffVar = (iff) lnmVar;
                    int i51 = iffVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        iffVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        iffVar = new iff(this, lnmVar);
                    }
                } else {
                    iffVar = new iff(this, lnmVar);
                }
                Object obj30 = iffVar.a;
                int i52 = iffVar.b;
                if (i52 == 0) {
                    hm5.M(obj30);
                    Boolean boolValueOf3 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    iffVar.b = 1;
                    return vr20Var.emit(boolValueOf3, iffVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof sff) {
                    sffVar = (sff) lnmVar;
                    int i53 = sffVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        sffVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        sffVar = new sff(this, lnmVar);
                    }
                } else {
                    sffVar = new sff(this, lnmVar);
                }
                Object obj31 = sffVar.a;
                int i54 = sffVar.b;
                if (i54 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf4 = Boolean.valueOf(y7y0.A((Map) obj));
                    sffVar.b = 1;
                    return vr20Var.emit(boolValueOf4, sffVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof yif) {
                    yifVar = (yif) lnmVar;
                    int i55 = yifVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        yifVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        yifVar = new yif(this, lnmVar);
                    }
                } else {
                    yifVar = new yif(this, lnmVar);
                }
                Object obj32 = yifVar.a;
                int i56 = yifVar.b;
                if (i56 == 0) {
                    hm5.M(obj32);
                    qif qifVar = new qif(((Boolean) obj).booleanValue());
                    yifVar.b = 1;
                    return vr20Var.emit(qifVar, yifVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof hkf) {
                    hkfVar = (hkf) lnmVar;
                    int i57 = hkfVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        hkfVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        hkfVar = new hkf(this, lnmVar);
                    }
                } else {
                    hkfVar = new hkf(this, lnmVar);
                }
                Object obj33 = hkfVar.a;
                int i58 = hkfVar.b;
                if (i58 == 0) {
                    hm5.M(obj33);
                    Boolean boolValueOf5 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    hkfVar.b = 1;
                    return vr20Var.emit(boolValueOf5, hkfVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof clf) {
                    clfVar = (clf) lnmVar;
                    int i59 = clfVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        clfVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        clfVar = new clf(this, lnmVar);
                    }
                } else {
                    clfVar = new clf(this, lnmVar);
                }
                Object obj34 = clfVar.a;
                int i60 = clfVar.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                PlayerState playerState = (PlayerState) obj;
                String strContextUri = playerState.contextUri();
                strContextUri.getClass();
                if (ihc1.y0(strContextUri) || hzg0.a.contains(playerState.playOrigin().featureIdentifier())) {
                    return rih1Var;
                }
                clfVar.b = 1;
                return vr20Var.emit(obj, clfVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
