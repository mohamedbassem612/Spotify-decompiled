package p;

import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uk50 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ uk50(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x0205  */
    /* JADX WARN: Code duplicated, block: B:155:0x024f  */
    /* JADX WARN: Code duplicated, block: B:172:0x028c  */
    /* JADX WARN: Code duplicated, block: B:187:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:202:0x030c  */
    /* JADX WARN: Code duplicated, block: B:217:0x034d  */
    /* JADX WARN: Code duplicated, block: B:232:0x038c  */
    /* JADX WARN: Code duplicated, block: B:249:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:273:0x041d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0461  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:311:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:329:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:344:0x0521  */
    /* JADX WARN: Code duplicated, block: B:366:0x0569  */
    /* JADX WARN: Code duplicated, block: B:381:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:414:0x0625  */
    /* JADX WARN: Code duplicated, block: B:432:0x0660  */
    /* JADX WARN: Code duplicated, block: B:447:0x069d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:467:0x06df  */
    /* JADX WARN: Code duplicated, block: B:508:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:526:0x0804  */
    /* JADX WARN: Code duplicated, block: B:541:0x0844  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:99:0x017e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        tk50 tk50Var;
        in50 in50Var;
        on50 on50Var;
        do50 do50Var;
        no50 no50Var;
        jo50 jo50Var;
        ns60 ns60Var;
        mv50 mv50Var;
        qy50 qy50Var;
        p060 p060Var;
        a160 a160Var;
        x160 x160Var;
        b260 b260Var;
        c260 c260Var;
        o260 o260Var;
        z260 z260Var;
        s560 s560Var;
        t560 t560Var;
        t860 t860Var;
        ag60 ag60Var;
        bg60 bg60Var;
        dg60 dg60Var;
        eg60 eg60Var;
        zo60 zo60Var;
        yr60 yr60Var;
        zr60 zr60Var;
        as60 as60Var;
        cs60 cs60Var;
        es60 es60Var;
        su60 su60Var;
        tu60 tu60Var;
        vv60 vv60Var;
        ms60 ms60Var;
        byte b = this.a;
        i9d0 i9d0Var = i9d0.a;
        int i = 0;
        i = 0;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        brl1 v1p0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof tk50) {
                    tk50Var = (tk50) lnmVar;
                    int i2 = tk50Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        tk50Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        tk50Var = new tk50(this, lnmVar);
                    }
                } else {
                    tk50Var = new tk50(this, lnmVar);
                }
                Object obj2 = tk50Var.a;
                int i3 = tk50Var.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Double d = (Double) obj;
                if (d == null) {
                    return rih1Var;
                }
                tk50Var.b = 1;
                return vr20Var.emit(d, tk50Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof in50) {
                    in50Var = (in50) lnmVar;
                    int i4 = in50Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        in50Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        in50Var = new in50(this, lnmVar);
                    }
                } else {
                    in50Var = new in50(this, lnmVar);
                }
                Object obj3 = in50Var.a;
                int i5 = in50Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    wm50 wm50Var = new wm50(((Boolean) obj).booleanValue());
                    in50Var.b = 1;
                    return vr20Var.emit(wm50Var, in50Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof on50) {
                    on50Var = (on50) lnmVar;
                    int i6 = on50Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        on50Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        on50Var = new on50(this, lnmVar);
                    }
                } else {
                    on50Var = new on50(this, lnmVar);
                }
                Object obj4 = on50Var.a;
                int i7 = on50Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                on50Var.b = 1;
                return vr20Var.emit(boolValueOf, on50Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof do50) {
                    do50Var = (do50) lnmVar;
                    int i8 = do50Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        do50Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        do50Var = new do50(this, lnmVar);
                    }
                } else {
                    do50Var = new do50(this, lnmVar);
                }
                Object obj5 = do50Var.a;
                int i9 = do50Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                pp90 pp90Var = (pp90) obj;
                if (pp90Var != null) {
                    np90 np90Var = pp90Var.h;
                    ArrayList arrayList = pp90Var.c;
                    hp90 hp90VarH = pno1.h(arrayList);
                    hp90 hp90Var = np90Var.b;
                    String str = hp90VarH.b;
                    String str2 = hp90Var.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    phx phxVar = new phx(8, 0L, str2, hp90Var.c, hp90Var.b);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : arrayList) {
                        if (!u890.j(((hp90) obj6).a, hp90Var.a)) {
                            arrayList2.add(obj6);
                        }
                    }
                    ArrayList arrayListF = rwq0.F(arrayList2);
                    boolean z = np90Var.h;
                    boolean z2 = hp90Var.f;
                    boolean z3 = hp90Var.e;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((hp90) it.next()).f && (i = i + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    no50Var = new no50(true, str, arrayListF, phxVar, z, z2, z3, i, np90Var.i);
                } else {
                    no50Var = new no50(false, null, z6x.a, null, false, false, false, 0, false);
                }
                do50Var.b = 1;
                return vr20Var.emit(no50Var, do50Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof jo50) {
                    jo50Var = (jo50) lnmVar;
                    int i10 = jo50Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        jo50Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        jo50Var = new jo50(this, lnmVar);
                    }
                } else {
                    jo50Var = new jo50(this, lnmVar);
                }
                Object obj7 = jo50Var.a;
                int i11 = jo50Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                os60 os60Var = (os60) obj;
                if (os60Var != null && (ns60Var = os60Var.a) != null) {
                    v1p0Var = new v1p0(ns60Var);
                }
                jo50Var.b = 1;
                return vr20Var.emit(v1p0Var, jo50Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof mv50) {
                    mv50Var = (mv50) lnmVar;
                    int i12 = mv50Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        mv50Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        mv50Var = new mv50(this, lnmVar);
                    }
                } else {
                    mv50Var = new mv50(this, lnmVar);
                }
                Object obj8 = mv50Var.a;
                int i13 = mv50Var.b;
                if (i13 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf2 = Boolean.valueOf(((ly50) obj).c);
                    mv50Var.b = 1;
                    return vr20Var.emit(boolValueOf2, mv50Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof qy50) {
                    qy50Var = (qy50) lnmVar;
                    int i14 = qy50Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        qy50Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        qy50Var = new qy50(this, lnmVar);
                    }
                } else {
                    qy50Var = new qy50(this, lnmVar);
                }
                Object obj9 = qy50Var.a;
                int i15 = qy50Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                ly50 ly50Var = (ly50) obj;
                if (ly50Var == null) {
                    ly50Var = ly50.i;
                }
                qy50Var.b = 1;
                return vr20Var.emit(ly50Var, qy50Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof p060) {
                    p060Var = (p060) lnmVar;
                    int i16 = p060Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        p060Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        p060Var = new p060(this, lnmVar);
                    }
                } else {
                    p060Var = new p060(this, lnmVar);
                }
                Object obj10 = p060Var.a;
                int i17 = p060Var.b;
                if (i17 == 0) {
                    hm5.M(obj10);
                    o060 o060Var = new o060((gd80) obj);
                    p060Var.b = 1;
                    return vr20Var.emit(o060Var, p060Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof a160) {
                    a160Var = (a160) lnmVar;
                    int i18 = a160Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        a160Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        a160Var = new a160(this, lnmVar);
                    }
                } else {
                    a160Var = new a160(this, lnmVar);
                }
                Object obj11 = a160Var.a;
                int i19 = a160Var.b;
                if (i19 == 0) {
                    hm5.M(obj11);
                    v1p0Var = ((Boolean) obj).booleanValue() ? new v17() : null;
                    a160Var.b = 1;
                    return vr20Var.emit(v1p0Var, a160Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof x160) {
                    x160Var = (x160) lnmVar;
                    int i20 = x160Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        x160Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        x160Var = new x160(this, lnmVar);
                    }
                } else {
                    x160Var = new x160(this, lnmVar);
                }
                Object obj12 = x160Var.a;
                int i21 = x160Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    Integer num = new Integer(((l160) obj).b);
                    x160Var.b = 1;
                    return vr20Var.emit(num, x160Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof b260) {
                    b260Var = (b260) lnmVar;
                    int i22 = b260Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        b260Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        b260Var = new b260(this, lnmVar);
                    }
                } else {
                    b260Var = new b260(this, lnmVar);
                }
                Object obj13 = b260Var.a;
                int i23 = b260Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                v1p0Var = i1rVar2 != null ? (Boolean) i1rVar2.a : null;
                if (v1p0Var == null) {
                    return rih1Var;
                }
                b260Var.b = 1;
                return vr20Var.emit(v1p0Var, b260Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof c260) {
                    c260Var = (c260) lnmVar;
                    int i24 = c260Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c260Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        c260Var = new c260(this, lnmVar);
                    }
                } else {
                    c260Var = new c260(this, lnmVar);
                }
                Object obj14 = c260Var.a;
                int i25 = c260Var.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf3 = Boolean.valueOf(((cxc0) obj).a());
                    c260Var.b = 1;
                    return vr20Var.emit(boolValueOf3, c260Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof o260) {
                    o260Var = (o260) lnmVar;
                    int i26 = o260Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        o260Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        o260Var = new o260(this, lnmVar);
                    }
                } else {
                    o260Var = new o260(this, lnmVar);
                }
                Object obj15 = o260Var.a;
                int i27 = o260Var.b;
                if (i27 == 0) {
                    hm5.M(obj15);
                    Boolean boolValueOf4 = Boolean.valueOf(((t1v0) obj) == null);
                    o260Var.b = 1;
                    return vr20Var.emit(boolValueOf4, o260Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i27 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof z260) {
                    z260Var = (z260) lnmVar;
                    int i28 = z260Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        z260Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        z260Var = new z260(this, lnmVar);
                    }
                } else {
                    z260Var = new z260(this, lnmVar);
                }
                Object obj16 = z260Var.a;
                int i29 = z260Var.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                Boolean bool = ((ly50) obj).h;
                Boolean boolValueOf5 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                z260Var.b = 1;
                return vr20Var.emit(boolValueOf5, z260Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof s560) {
                    s560Var = (s560) lnmVar;
                    int i30 = s560Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        s560Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        s560Var = new s560(this, lnmVar);
                    }
                } else {
                    s560Var = new s560(this, lnmVar);
                }
                Object obj17 = s560Var.a;
                int i31 = s560Var.b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                qi accessory = ((AccessoryStateManager.Event) obj).getAccessory();
                if ((accessory != null ? accessory.e : 0) != 4) {
                    return rih1Var;
                }
                s560Var.b = 1;
                return vr20Var.emit(obj, s560Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof t560) {
                    t560Var = (t560) lnmVar;
                    int i32 = t560Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        t560Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        t560Var = new t560(this, lnmVar);
                    }
                } else {
                    t560Var = new t560(this, lnmVar);
                }
                Object obj18 = t560Var.a;
                int i33 = t560Var.b;
                if (i33 != 0) {
                    if (i33 == 1 || i33 == 2) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                AccessoryStateManager.Event event = (AccessoryStateManager.Event) obj;
                if (event instanceof AccessoryStateManager.Event.Connected) {
                    t560Var.b = 1;
                    if (vr20Var.emit(r560.a, t560Var) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (!(event instanceof AccessoryStateManager.Event.Disconnected)) {
                        return rih1Var;
                    }
                    t560Var.b = 2;
                    if (vr20Var.emit(r560.b, t560Var) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 16:
                if (lnmVar instanceof t860) {
                    t860Var = (t860) lnmVar;
                    int i34 = t860Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        t860Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        t860Var = new t860(this, lnmVar);
                    }
                } else {
                    t860Var = new t860(this, lnmVar);
                }
                Object obj19 = t860Var.a;
                int i35 = t860Var.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                if (((YourLibraryDecorateResponse) obj).p().o()) {
                    return rih1Var;
                }
                t860Var.b = 1;
                return vr20Var.emit(obj, t860Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof ag60) {
                    ag60Var = (ag60) lnmVar;
                    int i36 = ag60Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ag60Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        ag60Var = new ag60(this, lnmVar);
                    }
                } else {
                    ag60Var = new ag60(this, lnmVar);
                }
                Object obj20 = ag60Var.a;
                int i37 = ag60Var.b;
                if (i37 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf6 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    ag60Var.b = 1;
                    return vr20Var.emit(boolValueOf6, ag60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof bg60) {
                    bg60Var = (bg60) lnmVar;
                    int i38 = bg60Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        bg60Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        bg60Var = new bg60(this, lnmVar);
                    }
                } else {
                    bg60Var = new bg60(this, lnmVar);
                }
                Object obj21 = bg60Var.a;
                int i39 = bg60Var.b;
                if (i39 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf7 = Boolean.valueOf(u890.j((ibd0) obj, ebd0.a));
                    bg60Var.b = 1;
                    return vr20Var.emit(boolValueOf7, bg60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i39 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof dg60) {
                    dg60Var = (dg60) lnmVar;
                    int i40 = dg60Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        dg60Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        dg60Var = new dg60(this, lnmVar);
                    }
                } else {
                    dg60Var = new dg60(this, lnmVar);
                }
                Object obj22 = dg60Var.a;
                int i41 = dg60Var.b;
                if (i41 == 0) {
                    hm5.M(obj22);
                    Boolean boolValueOf8 = Boolean.valueOf(u890.j((k9d0) obj, i9d0Var));
                    dg60Var.b = 1;
                    return vr20Var.emit(boolValueOf8, dg60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i41 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof eg60) {
                    eg60Var = (eg60) lnmVar;
                    int i42 = eg60Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        eg60Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        eg60Var = new eg60(this, lnmVar);
                    }
                } else {
                    eg60Var = new eg60(this, lnmVar);
                }
                Object obj23 = eg60Var.a;
                int i43 = eg60Var.b;
                if (i43 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf9 = Boolean.valueOf(u890.j((String) obj, "ENABLED"));
                    eg60Var.b = 1;
                    return vr20Var.emit(boolValueOf9, eg60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i43 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof zo60) {
                    zo60Var = (zo60) lnmVar;
                    int i44 = zo60Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        zo60Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        zo60Var = new zo60(this, lnmVar);
                    }
                } else {
                    zo60Var = new zo60(this, lnmVar);
                }
                Object obj24 = zo60Var.a;
                int i45 = zo60Var.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                if (((Number) obj).intValue() <= 0) {
                    return rih1Var;
                }
                zo60Var.b = 1;
                return vr20Var.emit(obj, zo60Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof yr60) {
                    yr60Var = (yr60) lnmVar;
                    int i46 = yr60Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        yr60Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        yr60Var = new yr60(this, lnmVar);
                    }
                } else {
                    yr60Var = new yr60(this, lnmVar);
                }
                Object obj25 = yr60Var.a;
                int i47 = yr60Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                brl1 brl1Var = (nnr) ((spq0) obj).h();
                if (brl1Var != null && ((nnr) brl1Var).B.a.d == luq0.e) {
                    v1p0Var = brl1Var;
                }
                yr60Var.b = 1;
                return vr20Var.emit(v1p0Var, yr60Var) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof zr60) {
                    zr60Var = (zr60) lnmVar;
                    int i48 = zr60Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        zr60Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        zr60Var = new zr60(this, lnmVar);
                    }
                } else {
                    zr60Var = new zr60(this, lnmVar);
                }
                Object obj26 = zr60Var.a;
                int i49 = zr60Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                mmr0 mmr0Var = (mmr0) obj;
                l0l l0lVar = (l0l) mmr0Var.a;
                nnr nnrVar = (nnr) mmr0Var.b;
                qq80 qq80VarU = nnrVar != null ? xap1.u(nnrVar) : xap1.u(l0lVar);
                zr60Var.b = 1;
                return vr20Var.emit(qq80VarU, zr60Var) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof as60) {
                    as60Var = (as60) lnmVar;
                    int i50 = as60Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        as60Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        as60Var = new as60(this, lnmVar);
                    }
                } else {
                    as60Var = new as60(this, lnmVar);
                }
                Object obj27 = as60Var.a;
                int i51 = as60Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                Object objH = ((spq0) obj).h();
                if (objH == null) {
                    return rih1Var;
                }
                as60Var.b = 1;
                return vr20Var.emit(objH, as60Var) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof cs60) {
                    cs60Var = (cs60) lnmVar;
                    int i52 = cs60Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        cs60Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        cs60Var = new cs60(this, lnmVar);
                    }
                } else {
                    cs60Var = new cs60(this, lnmVar);
                }
                Object obj28 = cs60Var.a;
                int i53 = cs60Var.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (!((pp90) obj).h.b.e) {
                    return rih1Var;
                }
                cs60Var.b = 1;
                return vr20Var.emit(obj, cs60Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof es60) {
                    es60Var = (es60) lnmVar;
                    int i54 = es60Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        es60Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        es60Var = new es60(this, lnmVar);
                    }
                } else {
                    es60Var = new es60(this, lnmVar);
                }
                Object obj29 = es60Var.a;
                int i55 = es60Var.b;
                if (i55 != 0) {
                    if (i55 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                mmr0 mmr0Var2 = (mmr0) obj;
                l0l l0lVar2 = (l0l) mmr0Var2.a;
                if (((nnr) mmr0Var2.b) == null && l0lVar2.p() == 1 && fs60.a.contains(l0lVar2.getType()) && !l0lVar2.l()) {
                    return rih1Var;
                }
                es60Var.b = 1;
                return vr20Var.emit(obj, es60Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof su60) {
                    su60Var = (su60) lnmVar;
                    int i56 = su60Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        su60Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        su60Var = new su60(this, lnmVar);
                    }
                } else {
                    su60Var = new su60(this, lnmVar);
                }
                Object obj30 = su60Var.a;
                int i57 = su60Var.b;
                if (i57 == 0) {
                    hm5.M(obj30);
                    hu60 hu60Var = new hu60((e5a0) obj);
                    su60Var.b = 1;
                    return vr20Var.emit(hu60Var, su60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i57 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof tu60) {
                    tu60Var = (tu60) lnmVar;
                    int i58 = tu60Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        tu60Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        tu60Var = new tu60(this, lnmVar);
                    }
                } else {
                    tu60Var = new tu60(this, lnmVar);
                }
                Object obj31 = tu60Var.a;
                int i59 = tu60Var.b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                nea0 nea0Var = (nea0) obj;
                iu60 iu60Var = new iu60(nea0Var.c, nea0Var.b);
                tu60Var.b = 1;
                return vr20Var.emit(iu60Var, tu60Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof vv60) {
                    vv60Var = (vv60) lnmVar;
                    int i60 = vv60Var.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        vv60Var.b = i60 - Integer.MIN_VALUE;
                    } else {
                        vv60Var = new vv60(this, lnmVar);
                    }
                } else {
                    vv60Var = new vv60(this, lnmVar);
                }
                Object obj32 = vv60Var.a;
                int i61 = vv60Var.b;
                if (i61 != 0) {
                    if (i61 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj32);
                os60 os60Var2 = (os60) obj;
                if (os60Var2 == null || (ms60Var = os60Var2.b) == null) {
                    ms60Var = is60.a;
                }
                vv60Var.b = 1;
                return vr20Var.emit(ms60Var, vv60Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
