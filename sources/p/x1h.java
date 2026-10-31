package p;

import android.graphics.Color;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x1h implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ x1h(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object b(Object obj, lnm lnmVar) {
        r0l r0lVar;
        Object next;
        kx7 kx7Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        Object next2;
        up7 up7Var;
        if (lnmVar instanceof r0l) {
            r0lVar = (r0l) lnmVar;
            int i3 = r0lVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r0lVar.b = i3 - Integer.MIN_VALUE;
            } else {
                r0lVar = new r0l(this, lnmVar);
            }
        } else {
            r0lVar = new r0l(this, lnmVar);
        }
        Object obj2 = r0lVar.a;
        int i4 = r0lVar.b;
        if (i4 == 0) {
            hm5.M(obj2);
            List list = (List) obj;
            list.getClass();
            List list2 = list;
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((l0l) next).l());
            nnr nnrVar = next instanceof nnr ? (nnr) next : null;
            if (nnrVar != null) {
                Iterator it2 = nnrVar.B.b.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    up7Var = ((kx7) next2).e;
                } while ((up7Var != null ? up7Var.a : 0) != 2);
                kx7Var = (kx7) next2;
            } else {
                kx7Var = null;
            }
            boolean z4 = list2 instanceof Collection;
            f0u f0uVar = f0u.Z;
            if (!z4 || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    l0l l0lVar = (l0l) it3.next();
                    if (l0lVar.getType() == f0uVar && l0lVar.getState() == 4) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z4 || !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = false;
                        break;
                    }
                    l0l l0lVar2 = (l0l) it4.next();
                    if (l0lVar2.getType() == f0uVar && l0lVar2.getState() == 4 && l0lVar2.isActive()) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if ((nnrVar != null && nnrVar.h) || (z4 && list2.isEmpty())) {
                z3 = true;
                break;
            }
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z3 = true;
                    break;
                }
                if (((l0l) it5.next()).isActive()) {
                    z3 = false;
                    break;
                }
            }
            if (nnrVar != null) {
                List list3 = nnrVar.B.b;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it6 = list3.iterator();
                    i2 = 0;
                    while (it6.hasNext()) {
                        luq0 luq0Var = ((kx7) it6.next()).d;
                        if (luq0Var == luq0.e || luq0Var == luq0.d) {
                            i2++;
                            if (i2 < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                }
                i = i2;
            } else {
                i = 0;
            }
            b7l b7lVar = new b7l(i, z, z2, z3, kx7Var != null, kx7Var != null && kx7Var.c);
            r0lVar.b = 1;
            Object objEmit = this.b.emit(b7lVar, r0lVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x0244  */
    /* JADX WARN: Code duplicated, block: B:185:0x0292  */
    /* JADX WARN: Code duplicated, block: B:202:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:219:0x0308  */
    /* JADX WARN: Code duplicated, block: B:234:0x0343  */
    /* JADX WARN: Code duplicated, block: B:251:0x0382  */
    /* JADX WARN: Code duplicated, block: B:266:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:281:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:296:0x043e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:311:0x047d  */
    /* JADX WARN: Code duplicated, block: B:328:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:350:0x0501  */
    /* JADX WARN: Code duplicated, block: B:369:0x0563  */
    /* JADX WARN: Code duplicated, block: B:384:0x059f  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:419:0x0632  */
    /* JADX WARN: Code duplicated, block: B:438:0x067a  */
    /* JADX WARN: Code duplicated, block: B:453:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:472:0x0708  */
    /* JADX WARN: Code duplicated, block: B:487:0x0742  */
    /* JADX WARN: Code duplicated, block: B:504:0x077f  */
    /* JADX WARN: Code duplicated, block: B:527:0x082d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x016e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object emit(Object obj, lnm lnmVar) {
        w1h w1hVar;
        a3h a3hVar;
        q8h q8hVar;
        r8h r8hVar;
        s8h s8hVar;
        int i;
        dbh dbhVar;
        ohh ohhVar;
        drh drhVar;
        irh irhVar;
        mrh mrhVar;
        ruj rujVar;
        qxj qxjVar;
        jzj jzjVar;
        k7k k7kVar;
        l7k l7kVar;
        yik yikVar;
        zik zikVar;
        bjk bjkVar;
        frk frkVar;
        msk mskVar;
        nsk nskVar;
        rtk rtkVar;
        wsc0 wsc0Var;
        kby kbyVar;
        gxk gxkVar;
        int i2;
        char c;
        ixk ixkVar;
        rzk rzkVar;
        b0l b0lVar;
        d0l d0lVar;
        q0l q0lVar;
        v0l v0lVar;
        byte b = this.a;
        char c2 = 0;
        z = false;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object objValueOf = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof w1h) {
                    w1hVar = (w1h) lnmVar;
                    int i3 = w1hVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        w1hVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        w1hVar = new w1h(this, lnmVar);
                    }
                } else {
                    w1hVar = new w1h(this, lnmVar);
                }
                Object obj2 = w1hVar.a;
                int i4 = w1hVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                p0d0 p0d0Var = (p0d0) obj;
                n0d0 n0d0Var = p0d0Var.c;
                cob1 cob1Var = p0d0Var.a;
                t2h s2hVar = n0d0Var instanceof n0d0 ? new s2h(n0d0Var.a) : n0d0Var instanceof l0d0 ? new r2h(((l0d0) n0d0Var).a) : q2h.a;
                p2h p2hVar = cob1Var.b() ? new p2h(s2hVar) : cob1Var == cob1.b ? new o2h(s2hVar) : n2h.a;
                w1hVar.b = 1;
                return vr20Var.emit(p2hVar, w1hVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof a3h) {
                    a3hVar = (a3h) lnmVar;
                    int i5 = a3hVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        a3hVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        a3hVar = new a3h(this, lnmVar);
                    }
                } else {
                    a3hVar = new a3h(this, lnmVar);
                }
                Object obj3 = a3hVar.a;
                int i6 = a3hVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), Boolean.valueOf(((f7h) entry.getValue()).c));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry2 : map.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(((f7h) entry2.getValue()).b));
                }
                fio fioVar = new fio(linkedHashMap, linkedHashMap2);
                a3hVar.b = 1;
                return vr20Var.emit(fioVar, a3hVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof q8h) {
                    q8hVar = (q8h) lnmVar;
                    int i7 = q8hVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        q8hVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        q8hVar = new q8h(this, lnmVar);
                    }
                } else {
                    q8hVar = new q8h(this, lnmVar);
                }
                Object obj4 = q8hVar.a;
                int i8 = q8hVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!((spq0) obj).c()) {
                    return rih1Var;
                }
                q8hVar.b = 1;
                return vr20Var.emit(obj, q8hVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof r8h) {
                    r8hVar = (r8h) lnmVar;
                    int i9 = r8hVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        r8hVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        r8hVar = new r8h(this, lnmVar);
                    }
                } else {
                    r8hVar = new r8h(this, lnmVar);
                }
                Object obj5 = r8hVar.a;
                int i10 = r8hVar.b;
                if (i10 == 0) {
                    hm5.M(obj5);
                    spq0 spq0VarTrack = ((PlayerState) obj).track();
                    r8hVar.b = 1;
                    return vr20Var.emit(spq0VarTrack, r8hVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof s8h) {
                    s8hVar = (s8h) lnmVar;
                    int i11 = s8hVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        s8hVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        s8hVar = new s8h(this, lnmVar);
                    }
                } else {
                    s8hVar = new s8h(this, lnmVar);
                }
                Object obj6 = s8hVar.a;
                int i12 = s8hVar.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                try {
                    i = uah.i(Color.argb(127, 0, 0, 0), Color.parseColor(l4o1.y((ContextTrack) ((spq0) obj).b())));
                    break;
                } catch (Exception unused) {
                    i = fyb0.a;
                }
                n8h n8hVar = new n8h(i);
                s8hVar.b = 1;
                return vr20Var.emit(n8hVar, s8hVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof dbh) {
                    dbhVar = (dbh) lnmVar;
                    int i13 = dbhVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        dbhVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        dbhVar = new dbh(this, lnmVar);
                    }
                } else {
                    dbhVar = new dbh(this, lnmVar);
                }
                Object obj7 = dbhVar.a;
                int i14 = dbhVar.b;
                if (i14 == 0) {
                    hm5.M(obj7);
                    cy50 cy50Var = ((ly50) obj).g;
                    dbhVar.b = 1;
                    return vr20Var.emit(cy50Var, dbhVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof ohh) {
                    ohhVar = (ohh) lnmVar;
                    int i15 = ohhVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ohhVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        ohhVar = new ohh(this, lnmVar);
                    }
                } else {
                    ohhVar = new ohh(this, lnmVar);
                }
                Object obj8 = ohhVar.a;
                int i16 = ohhVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                i1r i1rVar = (k1r) obj;
                nhh nhhVar = i1rVar instanceof i1r ? (nhh) i1rVar.a : new nhh(z6x.a, (jo70) null, (xkk1) null);
                ohhVar.b = 1;
                return vr20Var.emit(nhhVar, ohhVar) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof drh) {
                    drhVar = (drh) lnmVar;
                    int i17 = drhVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        drhVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        drhVar = new drh(this, lnmVar);
                    }
                } else {
                    drhVar = new drh(this, lnmVar);
                }
                Object obj9 = drhVar.a;
                int i18 = drhVar.b;
                if (i18 == 0) {
                    hm5.M(obj9);
                    byte[] bArr = (byte[]) obj;
                    try {
                        CommonCappingOuterClass.ObserveCapStateChangedResponse observeCapStateChangedResponseQ = CommonCappingOuterClass.ObserveCapStateChangedResponse.q(bArr);
                        drhVar.b = 1;
                        return vr20Var.emit(observeCapStateChangedResponseQ, drhVar) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass.ObserveCapStateChangedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i18 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                if (lnmVar instanceof irh) {
                    irhVar = (irh) lnmVar;
                    int i19 = irhVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        irhVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        irhVar = new irh(this, lnmVar);
                    }
                } else {
                    irhVar = new irh(this, lnmVar);
                }
                Object obj10 = irhVar.a;
                int i20 = irhVar.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                CommonCappingOuterClass.ObserveCapStateChangedResponse observeCapStateChangedResponse = (CommonCappingOuterClass.ObserveCapStateChangedResponse) obj;
                bf90 bf90Var = new bf90(observeCapStateChangedResponse.o(), observeCapStateChangedResponse.p());
                irhVar.b = 1;
                return vr20Var.emit(bf90Var, irhVar) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof mrh) {
                    mrhVar = (mrh) lnmVar;
                    int i21 = mrhVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        mrhVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        mrhVar = new mrh(this, lnmVar);
                    }
                } else {
                    mrhVar = new mrh(this, lnmVar);
                }
                Object obj11 = mrhVar.a;
                int i22 = mrhVar.b;
                if (i22 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf = Boolean.valueOf(((bf90) obj).a);
                    mrhVar.b = 1;
                    return vr20Var.emit(boolValueOf, mrhVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof ruj) {
                    rujVar = (ruj) lnmVar;
                    int i23 = rujVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        rujVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        rujVar = new ruj(this, lnmVar);
                    }
                } else {
                    rujVar = new ruj(this, lnmVar);
                }
                Object obj12 = rujVar.a;
                int i24 = rujVar.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                List list = ((m7e0) obj).b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new pbr(((l7e0) it.next()).a()));
                }
                rujVar.b = 1;
                return vr20Var.emit(arrayList, rujVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof qxj) {
                    qxjVar = (qxj) lnmVar;
                    int i25 = qxjVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        qxjVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        qxjVar = new qxj(this, lnmVar);
                    }
                } else {
                    qxjVar = new qxj(this, lnmVar);
                }
                Object obj13 = qxjVar.a;
                int i26 = qxjVar.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                i1r i1rVar2 = (k1r) obj;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                objValueOf = i1rVar3 != null ? (Boolean) i1rVar3.a : null;
                if (objValueOf == null) {
                    return rih1Var;
                }
                qxjVar.b = 1;
                return vr20Var.emit(objValueOf, qxjVar) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof jzj) {
                    jzjVar = (jzj) lnmVar;
                    int i27 = jzjVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        jzjVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        jzjVar = new jzj(this, lnmVar);
                    }
                } else {
                    jzjVar = new jzj(this, lnmVar);
                }
                Object obj14 = jzjVar.a;
                int i28 = jzjVar.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                jzjVar.b = 1;
                return vr20Var.emit(obj, jzjVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof k7k) {
                    k7kVar = (k7k) lnmVar;
                    int i29 = k7kVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        k7kVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        k7kVar = new k7k(this, lnmVar);
                    }
                } else {
                    k7kVar = new k7k(this, lnmVar);
                }
                Object obj15 = k7kVar.a;
                int i30 = k7kVar.b;
                if (i30 == 0) {
                    hm5.M(obj15);
                    q8k q8kVar = new q8k(((Boolean) obj).booleanValue());
                    k7kVar.b = 1;
                    return vr20Var.emit(q8kVar, k7kVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof l7k) {
                    l7kVar = (l7k) lnmVar;
                    int i31 = l7kVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        l7kVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        l7kVar = new l7k(this, lnmVar);
                    }
                } else {
                    l7kVar = new l7k(this, lnmVar);
                }
                Object obj16 = l7kVar.a;
                int i32 = l7kVar.b;
                if (i32 == 0) {
                    hm5.M(obj16);
                    u8k u8kVar = new u8k(((Boolean) obj).booleanValue());
                    l7kVar.b = 1;
                    return vr20Var.emit(u8kVar, l7kVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof yik) {
                    yikVar = (yik) lnmVar;
                    int i33 = yikVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        yikVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        yikVar = new yik(this, lnmVar);
                    }
                } else {
                    yikVar = new yik(this, lnmVar);
                }
                Object obj17 = yikVar.a;
                int i34 = yikVar.b;
                if (i34 == 0) {
                    hm5.M(obj17);
                    mlk mlkVar = new mlk((String) obj);
                    yikVar.b = 1;
                    return vr20Var.emit(mlkVar, yikVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof zik) {
                    zikVar = (zik) lnmVar;
                    int i35 = zikVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        zikVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        zikVar = new zik(this, lnmVar);
                    }
                } else {
                    zikVar = new zik(this, lnmVar);
                }
                Object obj18 = zikVar.a;
                int i36 = zikVar.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                Boolean bool = (Boolean) obj;
                bool.getClass();
                olk olkVar = new olk(bool.booleanValue());
                zikVar.b = 1;
                return vr20Var.emit(olkVar, zikVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof bjk) {
                    bjkVar = (bjk) lnmVar;
                    int i37 = bjkVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        bjkVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        bjkVar = new bjk(this, lnmVar);
                    }
                } else {
                    bjkVar = new bjk(this, lnmVar);
                }
                Object obj19 = bjkVar.a;
                int i38 = bjkVar.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                if (!((w8c0) obj).a(w8c0.e)) {
                    return rih1Var;
                }
                bjkVar.b = 1;
                return vr20Var.emit(obj, bjkVar) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof frk) {
                    frkVar = (frk) lnmVar;
                    int i39 = frkVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        frkVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        frkVar = new frk(this, lnmVar);
                    }
                } else {
                    frkVar = new frk(this, lnmVar);
                }
                Object obj20 = frkVar.a;
                int i40 = frkVar.b;
                if (i40 == 0) {
                    hm5.M(obj20);
                    da10 da10Var = new da10((ioj0) obj);
                    frkVar.b = 1;
                    return vr20Var.emit(da10Var, frkVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof msk) {
                    mskVar = (msk) lnmVar;
                    int i41 = mskVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        mskVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        mskVar = new msk(this, lnmVar);
                    }
                } else {
                    mskVar = new msk(this, lnmVar);
                }
                Object obj21 = mskVar.a;
                int i42 = mskVar.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                if (((lsk) obj).b == null) {
                    return rih1Var;
                }
                mskVar.b = 1;
                return vr20Var.emit(obj, mskVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof nsk) {
                    nskVar = (nsk) lnmVar;
                    int i43 = nskVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        nskVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        nskVar = new nsk(this, lnmVar);
                    }
                } else {
                    nskVar = new nsk(this, lnmVar);
                }
                Object obj22 = nskVar.a;
                int i44 = nskVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (!((lsk) obj).a) {
                    return rih1Var;
                }
                nskVar.b = 1;
                return vr20Var.emit(obj, nskVar) == d9nVar ? d9nVar : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof rtk) {
                    rtkVar = (rtk) lnmVar;
                    int i45 = rtkVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        rtkVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        rtkVar = new rtk(this, lnmVar);
                    }
                } else {
                    rtkVar = new rtk(this, lnmVar);
                }
                Object obj23 = rtkVar.a;
                int i46 = rtkVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                oy21 oy21Var = (py21) obj;
                oy21 oy21Var2 = oy21Var instanceof oy21 ? oy21Var : null;
                if (oy21Var2 != null && (wsc0Var = (wsc0) oy21Var2.a) != null && (kbyVar = wsc0Var.f) != null) {
                    objValueOf = kbyVar.G;
                }
                if (objValueOf == null) {
                    return rih1Var;
                }
                rtkVar.b = 1;
                return vr20Var.emit(objValueOf, rtkVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof gxk) {
                    gxkVar = (gxk) lnmVar;
                    int i47 = gxkVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        gxkVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        gxkVar = new gxk(this, lnmVar);
                    }
                } else {
                    gxkVar = new gxk(this, lnmVar);
                }
                Object obj24 = gxkVar.a;
                int i48 = gxkVar.b;
                if (i48 == 0) {
                    hm5.M(obj24);
                    kvh1 kvh1Var = (mvh1) obj;
                    if (kvh1Var.equals(jvh1.a)) {
                        i2 = 1;
                    } else if (kvh1Var.equals(hvh1.a)) {
                        i2 = 2;
                    } else if (kvh1Var instanceof kvh1) {
                        i2 = 3;
                    } else if (kvh1Var.equals(ivh1.a)) {
                        i2 = 4;
                    } else {
                        eg.o();
                    }
                    if (kvh1Var instanceof kvh1) {
                        n7r n7rVar = (n7r) o7h.t0(kvh1Var.a - 1, n7r.i);
                        if (n7rVar == null) {
                            n7rVar = n7r.a;
                        }
                        switch (n7rVar.ordinal()) {
                            case 0:
                                c2 = 1;
                                break;
                            case 1:
                                c2 = 2;
                                break;
                            case 2:
                                c2 = 3;
                                break;
                            case 3:
                                c2 = 4;
                                break;
                            case 4:
                                c = 5;
                                c2 = c;
                                break;
                            case 5:
                                c = 6;
                                c2 = c;
                                break;
                            case 6:
                                c = 7;
                                c2 = c;
                                break;
                            default:
                                eg.o();
                                break;
                        }
                    }
                    wwk wwkVar = new wwk(new sxk(i2, c2));
                    gxkVar.b = 1;
                    return vr20Var.emit(wwkVar, gxkVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof ixk) {
                    ixkVar = (ixk) lnmVar;
                    int i49 = ixkVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ixkVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        ixkVar = new ixk(this, lnmVar);
                    }
                } else {
                    ixkVar = new ixk(this, lnmVar);
                }
                Object obj25 = ixkVar.a;
                int i50 = ixkVar.b;
                if (i50 == 0) {
                    hm5.M(obj25);
                    lwk lwkVar = new lwk((dyh1) obj);
                    ixkVar.b = 1;
                    return vr20Var.emit(lwkVar, ixkVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof rzk) {
                    rzkVar = (rzk) lnmVar;
                    int i51 = rzkVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        rzkVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        rzkVar = new rzk(this, lnmVar);
                    }
                } else {
                    rzkVar = new rzk(this, lnmVar);
                }
                Object obj26 = rzkVar.a;
                int i52 = rzkVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                rzkVar.b = 1;
                return vr20Var.emit(obj, rzkVar) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof b0l) {
                    b0lVar = (b0l) lnmVar;
                    int i53 = b0lVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        b0lVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        b0lVar = new b0l(this, lnmVar);
                    }
                } else {
                    b0lVar = new b0l(this, lnmVar);
                }
                Object obj27 = b0lVar.a;
                int i54 = b0lVar.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                b0lVar.b = 1;
                return vr20Var.emit(obj, b0lVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof d0l) {
                    d0lVar = (d0l) lnmVar;
                    int i55 = d0lVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        d0lVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        d0lVar = new d0l(this, lnmVar);
                    }
                } else {
                    d0lVar = new d0l(this, lnmVar);
                }
                Object obj28 = d0lVar.a;
                int i56 = d0lVar.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                d0lVar.b = 1;
                return vr20Var.emit(boolValueOf2, d0lVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof q0l) {
                    q0lVar = (q0l) lnmVar;
                    int i57 = q0lVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        q0lVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        q0lVar = new q0l(this, lnmVar);
                    }
                } else {
                    q0lVar = new q0l(this, lnmVar);
                }
                Object obj29 = q0lVar.a;
                int i58 = q0lVar.b;
                if (i58 == 0) {
                    hm5.M(obj29);
                    m0l m0lVar = new m0l(((lx7) obj).a);
                    q0lVar.b = 1;
                    return vr20Var.emit(m0lVar, q0lVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof v0l) {
                    v0lVar = (v0l) lnmVar;
                    int i59 = v0lVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        v0lVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        v0lVar = new v0l(this, lnmVar);
                    }
                } else {
                    v0lVar = new v0l(this, lnmVar);
                }
                Object obj30 = v0lVar.a;
                int i60 = v0lVar.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                l0l l0lVar = (l0l) ((spq0) obj).h();
                objValueOf = l0lVar != null ? Boolean.valueOf(l0lVar.l()) : null;
                if (objValueOf == null) {
                    return rih1Var;
                }
                v0lVar.b = 1;
                return vr20Var.emit(objValueOf, v0lVar) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ x1h(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
