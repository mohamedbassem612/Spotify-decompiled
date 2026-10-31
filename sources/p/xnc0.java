package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xnc0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ xnc0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x021c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0258  */
    /* JADX WARN: Code duplicated, block: B:180:0x029f  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:224:0x032d  */
    /* JADX WARN: Code duplicated, block: B:241:0x036b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:263:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:280:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:295:0x0424  */
    /* JADX WARN: Code duplicated, block: B:310:0x0463  */
    /* JADX WARN: Code duplicated, block: B:325:0x049b  */
    /* JADX WARN: Code duplicated, block: B:340:0x04da  */
    /* JADX WARN: Code duplicated, block: B:362:0x052d  */
    /* JADX WARN: Code duplicated, block: B:385:0x057a  */
    /* JADX WARN: Code duplicated, block: B:413:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:437:0x0631  */
    /* JADX WARN: Code duplicated, block: B:452:0x0669  */
    /* JADX WARN: Code duplicated, block: B:467:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:490:0x0700  */
    /* JADX WARN: Code duplicated, block: B:505:0x0738  */
    /* JADX WARN: Code duplicated, block: B:520:0x0777  */
    /* JADX WARN: Code duplicated, block: B:535:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object emit(Object obj, lnm lnmVar) {
        wnc0 wnc0Var;
        znc0 znc0Var;
        aoc0 aoc0Var;
        noc0 noc0Var;
        msc0 msc0Var;
        Object objInvoke;
        rwc0 rwc0Var;
        swc0 swc0Var;
        vwc0 vwc0Var;
        vxc0 vxc0Var;
        Boolean boolValueOf;
        lzc0 lzc0Var;
        a0d0 a0d0Var;
        e1d0 e1d0Var;
        y4d0 y4d0Var;
        a6d0 a6d0Var;
        b6d0 b6d0Var;
        n6d0 n6d0Var;
        c7d0 c7d0Var;
        g7d0 g7d0Var;
        k7d0 k7d0Var;
        s7d0 s7d0Var;
        g8d0 g8d0Var;
        o9d0 o9d0Var;
        bad0 bad0Var;
        cad0 cad0Var;
        ead0 ead0Var;
        mcd0 mcd0Var;
        wcd0 wcd0Var;
        add0 add0Var;
        odd0 odd0Var;
        aed0 aed0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        e331 rpq0Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof wnc0) {
                    wnc0Var = (wnc0) lnmVar;
                    int i = wnc0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wnc0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        wnc0Var = new wnc0(this, lnmVar);
                    }
                } else {
                    wnc0Var = new wnc0(this, lnmVar);
                }
                Object obj2 = wnc0Var.a;
                int i2 = wnc0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    ynh1 ynh1Var = new ynh1((hj50) obj);
                    wnc0Var.b = 1;
                    return vr20Var.emit(ynh1Var, wnc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof znc0) {
                    znc0Var = (znc0) lnmVar;
                    int i3 = znc0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        znc0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        znc0Var = new znc0(this, lnmVar);
                    }
                } else {
                    znc0Var = new znc0(this, lnmVar);
                }
                Object obj3 = znc0Var.a;
                int i4 = znc0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                hj50 hj50Var = (hj50) obj;
                tz81 tz81Var = new tz81(hj50Var.a, hj50Var.b);
                znc0Var.b = 1;
                return vr20Var.emit(tz81Var, znc0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof aoc0) {
                    aoc0Var = (aoc0) lnmVar;
                    int i5 = aoc0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aoc0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        aoc0Var = new aoc0(this, lnmVar);
                    }
                } else {
                    aoc0Var = new aoc0(this, lnmVar);
                }
                Object obj4 = aoc0Var.a;
                int i6 = aoc0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                hj50 hj50Var2 = (hj50) obj;
                tz81 tz81Var2 = new tz81(hj50Var2.a, hj50Var2.b);
                aoc0Var.b = 1;
                return vr20Var.emit(tz81Var2, aoc0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof noc0) {
                    noc0Var = (noc0) lnmVar;
                    int i7 = noc0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        noc0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        noc0Var = new noc0(this, lnmVar);
                    }
                } else {
                    noc0Var = new noc0(this, lnmVar);
                }
                Object obj5 = noc0Var.a;
                int i8 = noc0Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    List list = ((wsc0) obj).l;
                    noc0Var.b = 1;
                    return vr20Var.emit(list, noc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof msc0) {
                    msc0Var = (msc0) lnmVar;
                    int i9 = msc0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        msc0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        msc0Var = new msc0(this, lnmVar);
                    }
                } else {
                    msc0Var = new msc0(this, lnmVar);
                }
                Object obj6 = msc0Var.a;
                int i10 = msc0Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    ly21 ly21Var = (py21) obj;
                    pdb0 pdb0Var = new pdb0(ly21Var, (byte) 21);
                    ly21Var.getClass();
                    if (ly21Var instanceof ly21) {
                        objInvoke = new ly21(ly21Var.a);
                    } else if (ly21Var instanceof oy21) {
                        objInvoke = pdb0Var.invoke(((oy21) ly21Var).a);
                    } else {
                        eg.o();
                    }
                    msc0Var.b = 1;
                    return vr20Var.emit(objInvoke, msc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof rwc0) {
                    rwc0Var = (rwc0) lnmVar;
                    int i11 = rwc0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        rwc0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        rwc0Var = new rwc0(this, lnmVar);
                    }
                } else {
                    rwc0Var = new rwc0(this, lnmVar);
                }
                Object obj7 = rwc0Var.a;
                int i12 = rwc0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    String str = ((th61) obj).a;
                    rwc0Var.b = 1;
                    return vr20Var.emit(str, rwc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof swc0) {
                    swc0Var = (swc0) lnmVar;
                    int i13 = swc0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        swc0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        swc0Var = new swc0(this, lnmVar);
                    }
                } else {
                    swc0Var = new swc0(this, lnmVar);
                }
                Object obj8 = swc0Var.a;
                int i14 = swc0Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    Object obj9 = ((rpq0) obj).a;
                    swc0Var.b = 1;
                    return vr20Var.emit(obj9, swc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof vwc0) {
                    vwc0Var = (vwc0) lnmVar;
                    int i15 = vwc0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        vwc0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        vwc0Var = new vwc0(this, lnmVar);
                    }
                } else {
                    vwc0Var = new vwc0(this, lnmVar);
                }
                Object obj10 = vwc0Var.a;
                int i16 = vwc0Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof i1r) {
                    rpq0Var = new rpq0(i1rVar.a);
                } else if ((i1rVar instanceof h1r) && (((h1r) i1rVar).a instanceof wyq)) {
                    rpq0Var = new rpq0(null);
                }
                if (rpq0Var == null) {
                    return rih1Var;
                }
                vwc0Var.b = 1;
                return vr20Var.emit(rpq0Var, vwc0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof vxc0) {
                    vxc0Var = (vxc0) lnmVar;
                    int i17 = vxc0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        vxc0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        vxc0Var = new vxc0(this, lnmVar);
                    }
                } else {
                    vxc0Var = new vxc0(this, lnmVar);
                }
                Object obj11 = vxc0Var.a;
                int i18 = vxc0Var.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    oy21 oy21Var = (py21) obj;
                    oy21Var.getClass();
                    if (oy21Var instanceof ly21) {
                        boolValueOf = Boolean.TRUE;
                    } else if (oy21Var instanceof oy21) {
                        boolValueOf = Boolean.valueOf(((wsc0) oy21Var.a).h != null);
                    } else {
                        eg.o();
                    }
                    if (!boolValueOf.booleanValue()) {
                        return rih1Var;
                    }
                    vxc0Var.b = 1;
                    return vr20Var.emit(obj, vxc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof lzc0) {
                    lzc0Var = (lzc0) lnmVar;
                    int i19 = lzc0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        lzc0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        lzc0Var = new lzc0(this, lnmVar);
                    }
                } else {
                    lzc0Var = new lzc0(this, lnmVar);
                }
                Object obj12 = lzc0Var.a;
                int i20 = lzc0Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    oy21 oy21Var2 = (py21) obj;
                    if (oy21Var2 instanceof oy21) {
                        rpq0Var = (wsc0) oy21Var2.a;
                    } else if (!(oy21Var2 instanceof ly21)) {
                        eg.o();
                    }
                    if (rpq0Var == null) {
                        return rih1Var;
                    }
                    lzc0Var.b = 1;
                    return vr20Var.emit(rpq0Var, lzc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof a0d0) {
                    a0d0Var = (a0d0) lnmVar;
                    int i21 = a0d0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        a0d0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        a0d0Var = new a0d0(this, lnmVar);
                    }
                } else {
                    a0d0Var = new a0d0(this, lnmVar);
                }
                Object obj13 = a0d0Var.a;
                int i22 = a0d0Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                sp91 sp91Var = (sp91) obj;
                mp91 mp91Var = new mp91(Boolean.valueOf(sp91Var.a != rp91.a), Boolean.valueOf(sp91Var.a == rp91.c));
                a0d0Var.b = 1;
                return vr20Var.emit(mp91Var, a0d0Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof e1d0) {
                    e1d0Var = (e1d0) lnmVar;
                    int i23 = e1d0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        e1d0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        e1d0Var = new e1d0(this, lnmVar);
                    }
                } else {
                    e1d0Var = new e1d0(this, lnmVar);
                }
                Object obj14 = e1d0Var.a;
                int i24 = e1d0Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    e1d0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, e1d0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof y4d0) {
                    y4d0Var = (y4d0) lnmVar;
                    int i25 = y4d0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        y4d0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        y4d0Var = new y4d0(this, lnmVar);
                    }
                } else {
                    y4d0Var = new y4d0(this, lnmVar);
                }
                Object obj15 = y4d0Var.a;
                int i26 = y4d0Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    y4d0Var.b = 1;
                    return vr20Var.emit(t4d0.a, y4d0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof a6d0) {
                    a6d0Var = (a6d0) lnmVar;
                    int i27 = a6d0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        a6d0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        a6d0Var = new a6d0(this, lnmVar);
                    }
                } else {
                    a6d0Var = new a6d0(this, lnmVar);
                }
                Object obj16 = a6d0Var.a;
                int i28 = a6d0Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                pp90 pp90Var = (pp90) obj;
                mmr0 mmr0Var = new mmr0(pp90Var, wyo1.o(pp90Var));
                a6d0Var.b = 1;
                return vr20Var.emit(mmr0Var, a6d0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof b6d0) {
                    b6d0Var = (b6d0) lnmVar;
                    int i29 = b6d0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        b6d0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        b6d0Var = new b6d0(this, lnmVar);
                    }
                } else {
                    b6d0Var = new b6d0(this, lnmVar);
                }
                Object obj17 = b6d0Var.a;
                int i30 = b6d0Var.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    z5d0 z5d0Var = (z5d0) ((mmr0) obj).b;
                    b6d0Var.b = 1;
                    return vr20Var.emit(z5d0Var, b6d0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof n6d0) {
                    n6d0Var = (n6d0) lnmVar;
                    int i31 = n6d0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        n6d0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        n6d0Var = new n6d0(this, lnmVar);
                    }
                } else {
                    n6d0Var = new n6d0(this, lnmVar);
                }
                Object obj18 = n6d0Var.a;
                int i32 = n6d0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                if (!(obj instanceof cr90)) {
                    return rih1Var;
                }
                n6d0Var.b = 1;
                return vr20Var.emit(obj, n6d0Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof c7d0) {
                    c7d0Var = (c7d0) lnmVar;
                    int i33 = c7d0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        c7d0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        c7d0Var = new c7d0(this, lnmVar);
                    }
                } else {
                    c7d0Var = new c7d0(this, lnmVar);
                }
                Object obj19 = c7d0Var.a;
                int i34 = c7d0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                i1r i1rVar2 = (k1r) obj;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                rpq0Var = i1rVar3 != null ? (Set) i1rVar3.a : null;
                if (rpq0Var == null) {
                    return rih1Var;
                }
                c7d0Var.b = 1;
                return vr20Var.emit(rpq0Var, c7d0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof g7d0) {
                    g7d0Var = (g7d0) lnmVar;
                    int i35 = g7d0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        g7d0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        g7d0Var = new g7d0(this, lnmVar);
                    }
                } else {
                    g7d0Var = new g7d0(this, lnmVar);
                }
                Object obj20 = g7d0Var.a;
                int i36 = g7d0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                k1r k1rVar = (k1r) obj;
                k1rVar.getClass();
                if (k1rVar instanceof j1r) {
                    return rih1Var;
                }
                g7d0Var.b = 1;
                return vr20Var.emit(obj, g7d0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof k7d0) {
                    k7d0Var = (k7d0) lnmVar;
                    int i37 = k7d0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        k7d0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        k7d0Var = new k7d0(this, lnmVar);
                    }
                } else {
                    k7d0Var = new k7d0(this, lnmVar);
                }
                Object obj21 = k7d0Var.a;
                int i38 = k7d0Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                i1r i1rVar4 = (k1r) obj;
                i1r i1rVar5 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                rpq0Var = i1rVar5 != null ? (Set) i1rVar5.a : null;
                if (rpq0Var == null) {
                    return rih1Var;
                }
                k7d0Var.b = 1;
                return vr20Var.emit(rpq0Var, k7d0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof s7d0) {
                    s7d0Var = (s7d0) lnmVar;
                    int i39 = s7d0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        s7d0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        s7d0Var = new s7d0(this, lnmVar);
                    }
                } else {
                    s7d0Var = new s7d0(this, lnmVar);
                }
                Object obj22 = s7d0Var.a;
                int i40 = s7d0Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                i1r i1rVar6 = (k1r) obj;
                i1r i1rVar7 = i1rVar6 instanceof i1r ? i1rVar6 : null;
                rpq0Var = i1rVar7 != null ? (Boolean) i1rVar7.a : null;
                if (rpq0Var == null) {
                    return rih1Var;
                }
                s7d0Var.b = 1;
                return vr20Var.emit(rpq0Var, s7d0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof g8d0) {
                    g8d0Var = (g8d0) lnmVar;
                    int i41 = g8d0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        g8d0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        g8d0Var = new g8d0(this, lnmVar);
                    }
                } else {
                    g8d0Var = new g8d0(this, lnmVar);
                }
                Object obj23 = g8d0Var.a;
                int i42 = g8d0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i1r i1rVar8 = (k1r) obj;
                i1r i1rVar9 = i1rVar8 instanceof i1r ? i1rVar8 : null;
                rpq0Var = i1rVar9 != null ? (g3d0) i1rVar9.a : null;
                if (rpq0Var == null) {
                    return rih1Var;
                }
                g8d0Var.b = 1;
                return vr20Var.emit(rpq0Var, g8d0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof o9d0) {
                    o9d0Var = (o9d0) lnmVar;
                    int i43 = o9d0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        o9d0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        o9d0Var = new o9d0(this, lnmVar);
                    }
                } else {
                    o9d0Var = new o9d0(this, lnmVar);
                }
                Object obj24 = o9d0Var.a;
                int i44 = o9d0Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf3 = Boolean.valueOf(((ibd0) obj) instanceof ebd0);
                    o9d0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, o9d0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof bad0) {
                    bad0Var = (bad0) lnmVar;
                    int i45 = bad0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        bad0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        bad0Var = new bad0(this, lnmVar);
                    }
                } else {
                    bad0Var = new bad0(this, lnmVar);
                }
                Object obj25 = bad0Var.a;
                int i46 = bad0Var.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    Boolean boolValueOf4 = Boolean.valueOf(u890.j((k9d0) obj, i9d0.a));
                    bad0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, bad0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof cad0) {
                    cad0Var = (cad0) lnmVar;
                    int i47 = cad0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        cad0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        cad0Var = new cad0(this, lnmVar);
                    }
                } else {
                    cad0Var = new cad0(this, lnmVar);
                }
                Object obj26 = cad0Var.a;
                int i48 = cad0Var.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf5 = Boolean.valueOf(u890.j((String) obj, "ENABLED"));
                    cad0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, cad0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof ead0) {
                    ead0Var = (ead0) lnmVar;
                    int i49 = ead0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ead0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        ead0Var = new ead0(this, lnmVar);
                    }
                } else {
                    ead0Var = new ead0(this, lnmVar);
                }
                Object obj27 = ead0Var.a;
                int i50 = ead0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                ibd0 ibd0Var = (ibd0) obj;
                Boolean boolValueOf6 = Boolean.valueOf((ibd0Var instanceof ebd0) || (ibd0Var instanceof hbd0));
                ead0Var.b = 1;
                return vr20Var.emit(boolValueOf6, ead0Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof mcd0) {
                    mcd0Var = (mcd0) lnmVar;
                    int i51 = mcd0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        mcd0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        mcd0Var = new mcd0(this, lnmVar);
                    }
                } else {
                    mcd0Var = new mcd0(this, lnmVar);
                }
                Object obj28 = mcd0Var.a;
                int i52 = mcd0Var.b;
                if (i52 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf7 = Boolean.valueOf(((k9d0) obj) instanceof i9d0);
                    mcd0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, mcd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof wcd0) {
                    wcd0Var = (wcd0) lnmVar;
                    int i53 = wcd0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        wcd0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        wcd0Var = new wcd0(this, lnmVar);
                    }
                } else {
                    wcd0Var = new wcd0(this, lnmVar);
                }
                Object obj29 = wcd0Var.a;
                int i54 = wcd0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                if (((String) obj).length() <= 0) {
                    return rih1Var;
                }
                wcd0Var.b = 1;
                return vr20Var.emit(obj, wcd0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof add0) {
                    add0Var = (add0) lnmVar;
                    int i55 = add0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        add0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        add0Var = new add0(this, lnmVar);
                    }
                } else {
                    add0Var = new add0(this, lnmVar);
                }
                Object obj30 = add0Var.a;
                int i56 = add0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                ucd0 ucd0Var = (ucd0) o7h.s0((List) obj);
                rpq0Var = ucd0Var != null ? new e331(ucd0Var) : null;
                if (rpq0Var == null) {
                    return rih1Var;
                }
                add0Var.b = 1;
                return vr20Var.emit(rpq0Var, add0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof odd0) {
                    odd0Var = (odd0) lnmVar;
                    int i57 = odd0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        odd0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        odd0Var = new odd0(this, lnmVar);
                    }
                } else {
                    odd0Var = new odd0(this, lnmVar);
                }
                Object obj31 = odd0Var.a;
                int i58 = odd0Var.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf8 = Boolean.valueOf(((sn7) obj) != null);
                    odd0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, odd0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof aed0) {
                    aed0Var = (aed0) lnmVar;
                    int i59 = aed0Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        aed0Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        aed0Var = new aed0(this, lnmVar);
                    }
                } else {
                    aed0Var = new aed0(this, lnmVar);
                }
                Object obj32 = aed0Var.a;
                int i60 = aed0Var.b;
                if (i60 == 0) {
                    hm5.M(obj32);
                    y1f y1fVar = new y1f((Map) obj);
                    aed0Var.b = 1;
                    return vr20Var.emit(y1fVar, aed0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
