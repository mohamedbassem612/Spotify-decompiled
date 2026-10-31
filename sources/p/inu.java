package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class inu implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public inu(vr20 vr20Var) {
        this.a = (byte) 4;
        x9a0 x9a0Var = x9a0.d;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:122:0x023f  */
    /* JADX WARN: Code duplicated, block: B:139:0x027c  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:181:0x030c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0354  */
    /* JADX WARN: Code duplicated, block: B:220:0x0391  */
    /* JADX WARN: Code duplicated, block: B:239:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0418  */
    /* JADX WARN: Code duplicated, block: B:284:0x0485  */
    /* JADX WARN: Code duplicated, block: B:301:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:316:0x0506  */
    /* JADX WARN: Code duplicated, block: B:333:0x0543  */
    /* JADX WARN: Code duplicated, block: B:355:0x058b  */
    /* JADX WARN: Code duplicated, block: B:370:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:385:0x0608  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:407:0x065d  */
    /* JADX WARN: Code duplicated, block: B:422:0x069b  */
    /* JADX WARN: Code duplicated, block: B:440:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:455:0x0721  */
    /* JADX WARN: Code duplicated, block: B:470:0x0763  */
    /* JADX WARN: Code duplicated, block: B:500:0x07db  */
    /* JADX WARN: Code duplicated, block: B:515:0x081c  */
    /* JADX WARN: Code duplicated, block: B:533:0x085a  */
    /* JADX WARN: Code duplicated, block: B:567:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        hnu hnuVar;
        jnu jnuVar;
        Object obj2;
        qnu qnuVar;
        snu snuVar;
        unu unuVar;
        jou jouVar;
        hpu hpuVar;
        kpu kpuVar;
        mpu mpuVar;
        npu npuVar;
        msu msuVar;
        rvu rvuVar;
        uvu uvuVar;
        ozu ozuVar;
        m3v m3vVar;
        abv abvVar;
        jbv jbvVar;
        String str;
        igv igvVar;
        jgv jgvVar;
        thv thvVar;
        gov govVar;
        hov hovVar;
        iov iovVar;
        mov movVar;
        qov qovVar;
        vsv vsvVar;
        otv otvVar;
        List list;
        rvv rvvVar;
        bwv bwvVar;
        cwv cwvVar;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Set setO = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof hnu) {
                    hnuVar = (hnu) lnmVar;
                    int i = hnuVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hnuVar.b = i - Integer.MIN_VALUE;
                    } else {
                        hnuVar = new hnu(this, lnmVar);
                    }
                } else {
                    hnuVar = new hnu(this, lnmVar);
                }
                Object obj3 = hnuVar.a;
                int i2 = hnuVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                jn41 jn41Var = (ln41) obj;
                setO = jn41Var instanceof jn41 ? ((r2t) jn41Var.a).o() : null;
                hnuVar.b = 1;
                return vr20Var.emit(setO, hnuVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof jnu) {
                    jnuVar = (jnu) lnmVar;
                    int i3 = jnuVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jnuVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        jnuVar = new jnu(this, lnmVar);
                    }
                } else {
                    jnuVar = new jnu(this, lnmVar);
                }
                Object obj4 = jnuVar.a;
                int i4 = jnuVar.b;
                if (i4 == 0) {
                    hm5.M(obj4);
                    e090 e090Var = (e090) obj;
                    if (e090Var instanceof zz80) {
                        obj2 = t9a0.a;
                    } else if ((e090Var instanceof a090) || (e090Var instanceof yz80) || (e090Var instanceof b090)) {
                        obj2 = u9a0.a;
                    } else if ((e090Var instanceof c090) || (e090Var instanceof d090)) {
                        obj2 = v9a0.a;
                    } else {
                        eg.o();
                    }
                    jnuVar.b = 1;
                    return vr20Var.emit(obj2, jnuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof qnu) {
                    qnuVar = (qnu) lnmVar;
                    int i5 = qnuVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qnuVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        qnuVar = new qnu(this, lnmVar);
                    }
                } else {
                    qnuVar = new qnu(this, lnmVar);
                }
                Object obj5 = qnuVar.a;
                int i6 = qnuVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                Set set = (dx80) obj;
                setO = set instanceof cx80 ? (cx80) set : null;
                qnuVar.b = 1;
                return vr20Var.emit(setO, qnuVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof snu) {
                    snuVar = (snu) lnmVar;
                    int i7 = snuVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        snuVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        snuVar = new snu(this, lnmVar);
                    }
                } else {
                    snuVar = new snu(this, lnmVar);
                }
                Object obj6 = snuVar.a;
                int i8 = snuVar.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    Float f = new Float((float) ((Double) obj).doubleValue());
                    snuVar.b = 1;
                    return vr20Var.emit(f, snuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof unu) {
                    unuVar = (unu) lnmVar;
                    int i9 = unuVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        unuVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        unuVar = new unu(this, lnmVar);
                    }
                } else {
                    unuVar = new unu(this, lnmVar);
                }
                Object obj7 = unuVar.a;
                int i10 = unuVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                qpu qpuVar = (qpu) obj;
                x9a0 x9a0Var = x9a0.d;
                Integer num = qpuVar.c;
                long jE = num != null ? z4p1.e(num.intValue()) : x9a0.d.a;
                Integer num2 = qpuVar.d;
                long jE2 = num2 != null ? z4p1.e(num2.intValue()) : x9a0.d.b;
                Integer num3 = qpuVar.e;
                x9a0 x9a0Var2 = new x9a0(jE, jE2, num3 != null ? z4p1.e(num3.intValue()) : x9a0.d.c);
                unuVar.b = 1;
                return vr20Var.emit(x9a0Var2, unuVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof jou) {
                    jouVar = (jou) lnmVar;
                    int i11 = jouVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        jouVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        jouVar = new jou(this, lnmVar);
                    }
                } else {
                    jouVar = new jou(this, lnmVar);
                }
                Object obj8 = jouVar.a;
                int i12 = jouVar.b;
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
                playerState.getClass();
                Boolean boolValueOf = Boolean.valueOf(o4p1.C(playerState));
                jouVar.b = 1;
                return vr20Var.emit(boolValueOf, jouVar) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof hpu) {
                    hpuVar = (hpu) lnmVar;
                    int i13 = hpuVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        hpuVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        hpuVar = new hpu(this, lnmVar);
                    }
                } else {
                    hpuVar = new hpu(this, lnmVar);
                }
                Object obj9 = hpuVar.a;
                int i14 = hpuVar.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    s4y s4yVar = new s4y(((Boolean) obj).booleanValue());
                    hpuVar.b = 1;
                    return vr20Var.emit(s4yVar, hpuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof kpu) {
                    kpuVar = (kpu) lnmVar;
                    int i15 = kpuVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        kpuVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        kpuVar = new kpu(this, lnmVar);
                    }
                } else {
                    kpuVar = new kpu(this, lnmVar);
                }
                Object obj10 = kpuVar.a;
                int i16 = kpuVar.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf2 = Boolean.valueOf(p5y.a(((PlayerState) obj).contextUri()) != null);
                    kpuVar.b = 1;
                    return vr20Var.emit(boolValueOf2, kpuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof mpu) {
                    mpuVar = (mpu) lnmVar;
                    int i17 = mpuVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        mpuVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        mpuVar = new mpu(this, lnmVar);
                    }
                } else {
                    mpuVar = new mpu(this, lnmVar);
                }
                Object obj11 = mpuVar.a;
                int i18 = mpuVar.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                ContextTrack contextTrackB = kbb.B(playerState2);
                mpuVar.b = 1;
                return vr20Var.emit(contextTrackB, mpuVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof npu) {
                    npuVar = (npu) lnmVar;
                    int i19 = npuVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        npuVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        npuVar = new npu(this, lnmVar);
                    }
                } else {
                    npuVar = new npu(this, lnmVar);
                }
                Object obj12 = npuVar.a;
                int i20 = npuVar.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                ContextTrack contextTrack = (ContextTrack) obj;
                String str2 = (String) contextTrack.metadata().get("segment");
                if (str2 == null) {
                    str2 = "";
                }
                String strUri = contextTrack.uri();
                mmr0 mmr0Var = new mmr0(str2, strUri != null ? strUri : "");
                npuVar.b = 1;
                return vr20Var.emit(mmr0Var, npuVar) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof msu) {
                    msuVar = (msu) lnmVar;
                    int i21 = msuVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        msuVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        msuVar = new msu(this, lnmVar);
                    }
                } else {
                    msuVar = new msu(this, lnmVar);
                }
                Object obj13 = msuVar.a;
                int i22 = msuVar.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                b1v b1vVar = (b1v) obj;
                wsu wsuVar = new wsu(b1vVar.a, b1vVar.b);
                msuVar.b = 1;
                return vr20Var.emit(wsuVar, msuVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof rvu) {
                    rvuVar = (rvu) lnmVar;
                    int i23 = rvuVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        rvuVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        rvuVar = new rvu(this, lnmVar);
                    }
                } else {
                    rvuVar = new rvu(this, lnmVar);
                }
                Object obj14 = rvuVar.a;
                int i24 = rvuVar.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf3 = Boolean.valueOf(((k78) obj).a);
                    rvuVar.b = 1;
                    return vr20Var.emit(boolValueOf3, rvuVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof uvu) {
                    uvuVar = (uvu) lnmVar;
                    int i25 = uvuVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        uvuVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        uvuVar = new uvu(this, lnmVar);
                    }
                } else {
                    uvuVar = new uvu(this, lnmVar);
                }
                Object obj15 = uvuVar.a;
                int i26 = uvuVar.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                setO = i1rVar2 != null ? (g3d0) i1rVar2.a : null;
                if (setO == null) {
                    return rih1Var;
                }
                uvuVar.b = 1;
                return vr20Var.emit(setO, uvuVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof ozu) {
                    ozuVar = (ozu) lnmVar;
                    int i27 = ozuVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ozuVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        ozuVar = new ozu(this, lnmVar);
                    }
                } else {
                    ozuVar = new ozu(this, lnmVar);
                }
                Object obj16 = ozuVar.a;
                int i28 = ozuVar.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                ozuVar.b = 1;
                return vr20Var.emit(objG, ozuVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof m3v) {
                    m3vVar = (m3v) lnmVar;
                    int i29 = m3vVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        m3vVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        m3vVar = new m3v(this, lnmVar);
                    }
                } else {
                    m3vVar = new m3v(this, lnmVar);
                }
                Object obj17 = m3vVar.a;
                int i30 = m3vVar.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf4 = Boolean.valueOf(!((YourLibraryResponse) obj).n().isEmpty());
                    m3vVar.b = 1;
                    return vr20Var.emit(boolValueOf4, m3vVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof abv) {
                    abvVar = (abv) lnmVar;
                    int i31 = abvVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        abvVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        abvVar = new abv(this, lnmVar);
                    }
                } else {
                    abvVar = new abv(this, lnmVar);
                }
                Object obj18 = abvVar.a;
                int i32 = abvVar.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                abvVar.b = 1;
                return vr20Var.emit(obj, abvVar) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof jbv) {
                    jbvVar = (jbv) lnmVar;
                    int i33 = jbvVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        jbvVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        jbvVar = new jbv(this, lnmVar);
                    }
                } else {
                    jbvVar = new jbv(this, lnmVar);
                }
                Object obj19 = jbvVar.a;
                int i34 = jbvVar.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    List<ck3> list2 = (List) obj;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (ck3 ck3Var : list2) {
                        if (ck3Var instanceof ck3) {
                            str = ck3Var.a;
                        } else if (ck3Var instanceof bk3) {
                            str = ebv.a;
                        } else {
                            eg.o();
                        }
                        arrayList.add(str);
                    }
                    Set setP1 = o7h.p1(arrayList);
                    jbvVar.b = 1;
                    return vr20Var.emit(setP1, jbvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof igv) {
                    igvVar = (igv) lnmVar;
                    int i35 = igvVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        igvVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        igvVar = new igv(this, lnmVar);
                    }
                } else {
                    igvVar = new igv(this, lnmVar);
                }
                Object obj20 = igvVar.a;
                int i36 = igvVar.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                Boolean bool = (Boolean) ((cma1) obj).a;
                Boolean boolValueOf5 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                igvVar.b = 1;
                return vr20Var.emit(boolValueOf5, igvVar) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof jgv) {
                    jgvVar = (jgv) lnmVar;
                    int i37 = jgvVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        jgvVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        jgvVar = new jgv(this, lnmVar);
                    }
                } else {
                    jgvVar = new jgv(this, lnmVar);
                }
                Object obj21 = jgvVar.a;
                int i38 = jgvVar.b;
                if (i38 == 0) {
                    hm5.M(obj21);
                    agv agvVar = ((Boolean) obj).booleanValue() ? agv.b : agv.a;
                    jgvVar.b = 1;
                    return vr20Var.emit(agvVar, jgvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof thv) {
                    thvVar = (thv) lnmVar;
                    int i39 = thvVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        thvVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        thvVar = new thv(this, lnmVar);
                    }
                } else {
                    thvVar = new thv(this, lnmVar);
                }
                Object obj22 = thvVar.a;
                int i40 = thvVar.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                Object objH = ((spq0) obj).h();
                if (objH == null) {
                    return rih1Var;
                }
                thvVar.b = 1;
                return vr20Var.emit(objH, thvVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof gov) {
                    govVar = (gov) lnmVar;
                    int i41 = govVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        govVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        govVar = new gov(this, lnmVar);
                    }
                } else {
                    govVar = new gov(this, lnmVar);
                }
                Object obj23 = govVar.a;
                int i42 = govVar.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                setO = i1rVar4 != null ? (g3d0) i1rVar4.a : null;
                if (setO == null) {
                    return rih1Var;
                }
                govVar.b = 1;
                return vr20Var.emit(setO, govVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof hov) {
                    hovVar = (hov) lnmVar;
                    int i43 = hovVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        hovVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        hovVar = new hov(this, lnmVar);
                    }
                } else {
                    hovVar = new hov(this, lnmVar);
                }
                Object obj24 = hovVar.a;
                int i44 = hovVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                i1r i1rVar5 = (k1r) obj;
                i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                setO = i1rVar6 != null ? (Set) i1rVar6.a : null;
                if (setO == null) {
                    return rih1Var;
                }
                hovVar.b = 1;
                return vr20Var.emit(setO, hovVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof iov) {
                    iovVar = (iov) lnmVar;
                    int i45 = iovVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        iovVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        iovVar = new iov(this, lnmVar);
                    }
                } else {
                    iovVar = new iov(this, lnmVar);
                }
                Object obj25 = iovVar.a;
                int i46 = iovVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                cxc0 cxc0Var = (cxc0) obj;
                if (cxc0Var.f.w.b && !cxc0Var.i) {
                    z = true;
                }
                Boolean boolValueOf6 = Boolean.valueOf(z);
                iovVar.b = 1;
                return vr20Var.emit(boolValueOf6, iovVar) == d9nVar ? d9nVar : rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof mov) {
                    movVar = (mov) lnmVar;
                    int i47 = movVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        movVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        movVar = new mov(this, lnmVar);
                    }
                } else {
                    movVar = new mov(this, lnmVar);
                }
                Object obj26 = movVar.a;
                int i48 = movVar.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                Object objG2 = u890.G((k1r) obj);
                if (objG2 == null) {
                    return rih1Var;
                }
                movVar.b = 1;
                return vr20Var.emit(objG2, movVar) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof qov) {
                    qovVar = (qov) lnmVar;
                    int i49 = qovVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        qovVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        qovVar = new qov(this, lnmVar);
                    }
                } else {
                    qovVar = new qov(this, lnmVar);
                }
                Object obj27 = qovVar.a;
                int i50 = qovVar.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                Object objG3 = u890.G((k1r) obj);
                if (objG3 == null) {
                    return rih1Var;
                }
                qovVar.b = 1;
                return vr20Var.emit(objG3, qovVar) == d9nVar ? d9nVar : rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof vsv) {
                    vsvVar = (vsv) lnmVar;
                    int i51 = vsvVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        vsvVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        vsvVar = new vsv(this, lnmVar);
                    }
                } else {
                    vsvVar = new vsv(this, lnmVar);
                }
                Object obj28 = vsvVar.a;
                int i52 = vsvVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                wqv wqvVar = (wqv) obj;
                xrv xrvVar = new xrv(new f8e0((wsc0) wqvVar.a.d(), wqvVar.b, wqvVar.c, wqvVar.d));
                vsvVar.b = 1;
                return vr20Var.emit(xrvVar, vsvVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof otv) {
                    otvVar = (otv) lnmVar;
                    int i53 = otvVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        otvVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        otvVar = new otv(this, lnmVar);
                    }
                } else {
                    otvVar = new otv(this, lnmVar);
                }
                Object obj29 = otvVar.a;
                int i54 = otvVar.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                wsc0 wsc0Var = (wsc0) ((wqv) obj).a.c();
                if (wsc0Var != null && (list = wsc0Var.e) != null) {
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((zuc0) it.next()).a);
                    }
                    setO = o7h.p1(arrayList2);
                }
                if (setO == null) {
                    setO = w7x.a;
                }
                otvVar.b = 1;
                return vr20Var.emit(setO, otvVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof rvv) {
                    rvvVar = (rvv) lnmVar;
                    int i55 = rvvVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        rvvVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        rvvVar = new rvv(this, lnmVar);
                    }
                } else {
                    rvvVar = new rvv(this, lnmVar);
                }
                Object obj30 = rvvVar.a;
                int i56 = rvvVar.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                h290 h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> arrayList3 = new ArrayList();
                for (Object obj31 : h290VarN) {
                    if (((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) obj31).hasPlaylist()) {
                        arrayList3.add(obj31);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : arrayList3) {
                    arrayList4.add(new qnu0(yourLibraryDecoratedEntity.e().getUri(), yourLibraryDecoratedEntity.e().getName(), yourLibraryDecoratedEntity.w().B(), yourLibraryDecoratedEntity.w().t()));
                }
                rvvVar.b = 1;
                return vr20Var.emit(arrayList4, rvvVar) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof bwv) {
                    bwvVar = (bwv) lnmVar;
                    int i57 = bwvVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bwvVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        bwvVar = new bwv(this, lnmVar);
                    }
                } else {
                    bwvVar = new bwv(this, lnmVar);
                }
                Object obj32 = bwvVar.a;
                int i58 = bwvVar.b;
                if (i58 == 0) {
                    hm5.M(obj32);
                    zvv zvvVar = new zvv((Set) obj);
                    bwvVar.b = 1;
                    return vr20Var.emit(zvvVar, bwvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof cwv) {
                    cwvVar = (cwv) lnmVar;
                    int i59 = cwvVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        cwvVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        cwvVar = new cwv(this, lnmVar);
                    }
                } else {
                    cwvVar = new cwv(this, lnmVar);
                }
                Object obj33 = cwvVar.a;
                int i60 = cwvVar.b;
                if (i60 == 0) {
                    hm5.M(obj33);
                    Boolean boolValueOf7 = Boolean.valueOf(((List) obj).isEmpty());
                    cwvVar.b = 1;
                    return vr20Var.emit(boolValueOf7, cwvVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ inu(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    public inu(vr20 vr20Var, p5y p5yVar) {
        this.a = (byte) 7;
        this.b = vr20Var;
    }
}
