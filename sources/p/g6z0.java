package p;

import androidx.compose.ui.geometry.Size;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g6z0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ g6z0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0228  */
    /* JADX WARN: Code duplicated, block: B:133:0x0267  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:182:0x0320  */
    /* JADX WARN: Code duplicated, block: B:199:0x035f  */
    /* JADX WARN: Code duplicated, block: B:218:0x039c  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:252:0x043a  */
    /* JADX WARN: Code duplicated, block: B:267:0x0472  */
    /* JADX WARN: Code duplicated, block: B:284:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:310:0x050a  */
    /* JADX WARN: Code duplicated, block: B:353:0x059f  */
    /* JADX WARN: Code duplicated, block: B:376:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:391:0x0629  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:406:0x0663  */
    /* JADX WARN: Code duplicated, block: B:421:0x069f  */
    /* JADX WARN: Code duplicated, block: B:441:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:456:0x072a  */
    /* JADX WARN: Code duplicated, block: B:471:0x0769  */
    /* JADX WARN: Code duplicated, block: B:489:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:506:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:523:0x0825  */
    /* JADX WARN: Code duplicated, block: B:541:0x0867  */
    /* JADX WARN: Code duplicated, block: B:556:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        f6z0 f6z0Var;
        b9z0 b9z0Var;
        u9z0 u9z0Var;
        jaz0 jaz0Var;
        kaz0 kaz0Var;
        scz0 scz0Var;
        voz0 voz0Var;
        qsz0 qsz0Var;
        wwz0 wwz0Var;
        xwz0 xwz0Var;
        axz0 axz0Var;
        bxz0 bxz0Var;
        cxz0 cxz0Var;
        ayz0 ayz0Var;
        byz0 byz0Var;
        pyz0 pyz0Var;
        qyz0 qyz0Var;
        y201 y201Var;
        k701 k701Var;
        l701 l701Var;
        d801 d801Var;
        e801 e801Var;
        f801 f801Var;
        g801 g801Var;
        i801 i801Var;
        j801 j801Var;
        z6x z6xVar;
        k801 k801Var;
        nf01 nf01Var;
        w4u w4uVar;
        ql01 ql01Var;
        rl01 rl01Var;
        byte b = this.a;
        brl1 brl1Var = brl1.b;
        j1r j1rVar = j1r.a;
        boolean z = false;
        i = 0;
        int i = 0;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        k291 num = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof f6z0) {
                    f6z0Var = (f6z0) lnmVar;
                    int i2 = f6z0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        f6z0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        f6z0Var = new f6z0(this, lnmVar);
                    }
                } else {
                    f6z0Var = new f6z0(this, lnmVar);
                }
                Object obj2 = f6z0Var.a;
                int i3 = f6z0Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    y8z0 y8z0Var = new y8z0(((Boolean) obj).booleanValue());
                    f6z0Var.b = 1;
                    return vr20Var.emit(y8z0Var, f6z0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof b9z0) {
                    b9z0Var = (b9z0) lnmVar;
                    int i4 = b9z0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        b9z0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        b9z0Var = new b9z0(this, lnmVar);
                    }
                } else {
                    b9z0Var = new b9z0(this, lnmVar);
                }
                Object obj3 = b9z0Var.a;
                int i5 = b9z0Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    Boolean boolValueOf = Boolean.valueOf(((vo50) obj).a);
                    b9z0Var.b = 1;
                    return vr20Var.emit(boolValueOf, b9z0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof u9z0) {
                    u9z0Var = (u9z0) lnmVar;
                    int i6 = u9z0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        u9z0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        u9z0Var = new u9z0(this, lnmVar);
                    }
                } else {
                    u9z0Var = new u9z0(this, lnmVar);
                }
                Object obj4 = u9z0Var.a;
                int i7 = u9z0Var.b;
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
                Boolean boolValueOf2 = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1Var));
                u9z0Var.b = 1;
                return vr20Var.emit(boolValueOf2, u9z0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof jaz0) {
                    jaz0Var = (jaz0) lnmVar;
                    int i8 = jaz0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        jaz0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        jaz0Var = new jaz0(this, lnmVar);
                    }
                } else {
                    jaz0Var = new jaz0(this, lnmVar);
                }
                Object obj5 = jaz0Var.a;
                int i9 = jaz0Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                jaz0Var.b = 1;
                return vr20Var.emit(obj, jaz0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof kaz0) {
                    kaz0Var = (kaz0) lnmVar;
                    int i10 = kaz0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        kaz0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        kaz0Var = new kaz0(this, lnmVar);
                    }
                } else {
                    kaz0Var = new kaz0(this, lnmVar);
                }
                Object obj6 = kaz0Var.a;
                int i11 = kaz0Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                kaz0Var.b = 1;
                return vr20Var.emit(obj, kaz0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof scz0) {
                    scz0Var = (scz0) lnmVar;
                    int i12 = scz0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        scz0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        scz0Var = new scz0(this, lnmVar);
                    }
                } else {
                    scz0Var = new scz0(this, lnmVar);
                }
                Object obj7 = scz0Var.a;
                int i13 = scz0Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                htl1 htl1Var2 = (htl1) obj;
                Boolean boolValueOf3 = Boolean.valueOf(u890.j(htl1Var2 != null ? htl1Var2.b : null, brl1Var));
                scz0Var.b = 1;
                return vr20Var.emit(boolValueOf3, scz0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof voz0) {
                    voz0Var = (voz0) lnmVar;
                    int i14 = voz0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        voz0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        voz0Var = new voz0(this, lnmVar);
                    }
                } else {
                    voz0Var = new voz0(this, lnmVar);
                }
                Object obj8 = voz0Var.a;
                int i15 = voz0Var.b;
                if (i15 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf4 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    voz0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, voz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof qsz0) {
                    qsz0Var = (qsz0) lnmVar;
                    int i16 = qsz0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qsz0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        qsz0Var = new qsz0(this, lnmVar);
                    }
                } else {
                    qsz0Var = new qsz0(this, lnmVar);
                }
                Object obj9 = qsz0Var.a;
                int i17 = qsz0Var.b;
                if (i17 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf5 = Boolean.valueOf(u890.j((String) obj, "1"));
                    qsz0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, qsz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof wwz0) {
                    wwz0Var = (wwz0) lnmVar;
                    int i18 = wwz0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        wwz0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        wwz0Var = new wwz0(this, lnmVar);
                    }
                } else {
                    wwz0Var = new wwz0(this, lnmVar);
                }
                Object obj10 = wwz0Var.a;
                int i19 = wwz0Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                swz0 swz0Var = (uwz0) obj;
                if ((swz0Var instanceof swz0) && swz0Var.a.equals(dho0.a)) {
                    z = true;
                }
                Boolean boolValueOf6 = Boolean.valueOf(z);
                wwz0Var.b = 1;
                return vr20Var.emit(boolValueOf6, wwz0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof xwz0) {
                    xwz0Var = (xwz0) lnmVar;
                    int i20 = xwz0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        xwz0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        xwz0Var = new xwz0(this, lnmVar);
                    }
                } else {
                    xwz0Var = new xwz0(this, lnmVar);
                }
                Object obj11 = xwz0Var.a;
                int i21 = xwz0Var.b;
                if (i21 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf7 = Boolean.valueOf(((uwz0) obj) instanceof swz0);
                    xwz0Var.b = 1;
                    return vr20Var.emit(boolValueOf7, xwz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof axz0) {
                    axz0Var = (axz0) lnmVar;
                    int i22 = axz0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        axz0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        axz0Var = new axz0(this, lnmVar);
                    }
                } else {
                    axz0Var = new axz0(this, lnmVar);
                }
                Object obj12 = axz0Var.a;
                int i23 = axz0Var.b;
                if (i23 == 0) {
                    hm5.M(obj12);
                    gbl gblVarA = dxz0.a((uwz0) obj);
                    axz0Var.b = 1;
                    return vr20Var.emit(gblVarA, axz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i23 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof bxz0) {
                    bxz0Var = (bxz0) lnmVar;
                    int i24 = bxz0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        bxz0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        bxz0Var = new bxz0(this, lnmVar);
                    }
                } else {
                    bxz0Var = new bxz0(this, lnmVar);
                }
                Object obj13 = bxz0Var.a;
                int i25 = bxz0Var.b;
                if (i25 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf8 = Boolean.valueOf(((uwz0) obj) instanceof twz0);
                    bxz0Var.b = 1;
                    return vr20Var.emit(boolValueOf8, bxz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof cxz0) {
                    cxz0Var = (cxz0) lnmVar;
                    int i26 = cxz0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        cxz0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        cxz0Var = new cxz0(this, lnmVar);
                    }
                } else {
                    cxz0Var = new cxz0(this, lnmVar);
                }
                Object obj14 = cxz0Var.a;
                int i27 = cxz0Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                swz0 swz0Var2 = (uwz0) obj;
                if (swz0Var2 instanceof swz0) {
                    eho0 eho0Var = swz0Var2.a;
                    if ((eho0Var instanceof eho0) && eho0Var.b) {
                        z2 = true;
                    }
                }
                Boolean boolValueOf9 = Boolean.valueOf(z2);
                cxz0Var.b = 1;
                return vr20Var.emit(boolValueOf9, cxz0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof ayz0) {
                    ayz0Var = (ayz0) lnmVar;
                    int i28 = ayz0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        ayz0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        ayz0Var = new ayz0(this, lnmVar);
                    }
                } else {
                    ayz0Var = new ayz0(this, lnmVar);
                }
                Object obj15 = ayz0Var.a;
                int i29 = ayz0Var.b;
                if (i29 == 0) {
                    hm5.M(obj15);
                    i1r i1rVar = (k1r) obj;
                    if (i1rVar instanceof h1r) {
                        num = new Integer(-1);
                    } else if (i1rVar instanceof i1r) {
                        List list = ((owc0) i1rVar.a).b;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                wls0 wls0Var = ((fji0) it.next()).f;
                                if (wls0Var == wls0.f || wls0Var == wls0.a) {
                                    i++;
                                    if (i < 0) {
                                        p7h.S();
                                        throw null;
                                    }
                                }
                            }
                        }
                        num = new Integer(i);
                    } else if (!u890.j(i1rVar, j1rVar)) {
                        eg.o();
                    }
                    if (num == null) {
                        return rih1Var;
                    }
                    ayz0Var.b = 1;
                    return vr20Var.emit(num, ayz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof byz0) {
                    byz0Var = (byz0) lnmVar;
                    int i30 = byz0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        byz0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        byz0Var = new byz0(this, lnmVar);
                    }
                } else {
                    byz0Var = new byz0(this, lnmVar);
                }
                Object obj16 = byz0Var.a;
                int i31 = byz0Var.b;
                if (i31 == 0) {
                    hm5.M(obj16);
                    i1r i1rVar2 = (k1r) obj;
                    if (i1rVar2 instanceof h1r) {
                        num = Boolean.FALSE;
                    } else if (i1rVar2 instanceof i1r) {
                        num = Boolean.valueOf(((qxc0) i1rVar2.a).t.b);
                    } else if (!u890.j(i1rVar2, j1rVar)) {
                        eg.o();
                    }
                    if (num == null) {
                        return rih1Var;
                    }
                    byz0Var.b = 1;
                    return vr20Var.emit(num, byz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof pyz0) {
                    pyz0Var = (pyz0) lnmVar;
                    int i32 = pyz0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        pyz0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        pyz0Var = new pyz0(this, lnmVar);
                    }
                } else {
                    pyz0Var = new pyz0(this, lnmVar);
                }
                Object obj17 = pyz0Var.a;
                int i33 = pyz0Var.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                pyz0Var.b = 1;
                return vr20Var.emit(obj, pyz0Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof qyz0) {
                    qyz0Var = (qyz0) lnmVar;
                    int i34 = qyz0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        qyz0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        qyz0Var = new qyz0(this, lnmVar);
                    }
                } else {
                    qyz0Var = new qyz0(this, lnmVar);
                }
                Object obj18 = qyz0Var.a;
                int i35 = qyz0Var.b;
                if (i35 == 0) {
                    hm5.M(obj18);
                    String str = ((th61) obj).a;
                    qyz0Var.b = 1;
                    return vr20Var.emit(str, qyz0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i35 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof y201) {
                    y201Var = (y201) lnmVar;
                    int i36 = y201Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        y201Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        y201Var = new y201(this, lnmVar);
                    }
                } else {
                    y201Var = new y201(this, lnmVar);
                }
                Object obj19 = y201Var.a;
                int i37 = y201Var.b;
                if (i37 != 0) {
                    if (i37 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                List listD1 = o7h.d1((List) obj, 5);
                ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                Iterator it2 = listD1.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new s201((String) it2.next()));
                }
                y201Var.b = 1;
                return vr20Var.emit(arrayList, y201Var) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof k701) {
                    k701Var = (k701) lnmVar;
                    int i38 = k701Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        k701Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        k701Var = new k701(this, lnmVar);
                    }
                } else {
                    k701Var = new k701(this, lnmVar);
                }
                Object obj20 = k701Var.a;
                int i39 = k701Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                edl1 edl1Var = new edl1();
                k701Var.b = 1;
                return vr20Var.emit(edl1Var, k701Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof l701) {
                    l701Var = (l701) lnmVar;
                    int i40 = l701Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        l701Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        l701Var = new l701(this, lnmVar);
                    }
                } else {
                    l701Var = new l701(this, lnmVar);
                }
                Object obj21 = l701Var.a;
                int i41 = l701Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                l2u0 l2u0Var = (l2u0) obj;
                if (l2u0Var == null || !l2u0Var.a) {
                    return rih1Var;
                }
                l701Var.b = 1;
                return vr20Var.emit(obj, l701Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof d801) {
                    d801Var = (d801) lnmVar;
                    int i42 = d801Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        d801Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        d801Var = new d801(this, lnmVar);
                    }
                } else {
                    d801Var = new d801(this, lnmVar);
                }
                Object obj22 = d801Var.a;
                int i43 = d801Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (((List) obj).isEmpty()) {
                    return rih1Var;
                }
                d801Var.b = 1;
                return vr20Var.emit(obj, d801Var) == d9nVar ? d9nVar : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof e801) {
                    e801Var = (e801) lnmVar;
                    int i44 = e801Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        e801Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        e801Var = new e801(this, lnmVar);
                    }
                } else {
                    e801Var = new e801(this, lnmVar);
                }
                Object obj23 = e801Var.a;
                int i45 = e801Var.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                e801Var.b = 1;
                return vr20Var.emit(obj, e801Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof f801) {
                    f801Var = (f801) lnmVar;
                    int i46 = f801Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        f801Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        f801Var = new f801(this, lnmVar);
                    }
                } else {
                    f801Var = new f801(this, lnmVar);
                }
                Object obj24 = f801Var.a;
                int i47 = f801Var.b;
                if (i47 != 0) {
                    if (i47 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                if (!(((aw31) obj) instanceof uv31)) {
                    return rih1Var;
                }
                f801Var.b = 1;
                return vr20Var.emit(obj, f801Var) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof g801) {
                    g801Var = (g801) lnmVar;
                    int i48 = g801Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        g801Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        g801Var = new g801(this, lnmVar);
                    }
                } else {
                    g801Var = new g801(this, lnmVar);
                }
                Object obj25 = g801Var.a;
                int i49 = g801Var.b;
                if (i49 != 0) {
                    if (i49 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                Boolean boolValueOf10 = Boolean.valueOf(b3o1.w(contextTrack));
                g801Var.b = 1;
                return vr20Var.emit(boolValueOf10, g801Var) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof i801) {
                    i801Var = (i801) lnmVar;
                    int i50 = i801Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        i801Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        i801Var = new i801(this, lnmVar);
                    }
                } else {
                    i801Var = new i801(this, lnmVar);
                }
                Object obj26 = i801Var.a;
                int i51 = i801Var.b;
                if (i51 == 0) {
                    hm5.M(obj26);
                    xbg1 xbg1Var = new xbg1(((Number) obj).intValue());
                    i801Var.b = 1;
                    return vr20Var.emit(xbg1Var, i801Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i51 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof j801) {
                    j801Var = (j801) lnmVar;
                    int i52 = j801Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        j801Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        j801Var = new j801(this, lnmVar);
                    }
                } else {
                    j801Var = new j801(this, lnmVar);
                }
                Object obj27 = j801Var.a;
                int i53 = j801Var.b;
                if (i53 != 0) {
                    if (i53 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj28 : (List) obj) {
                    if (obj28 instanceof uv31) {
                        arrayList2.add(obj28);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    z6x arrayList3 = new ArrayList();
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        arrayList3.add(new Integer(((uv31) next2).a - ((uv31) next).a));
                        next = next2;
                    }
                    z6xVar = arrayList3;
                } else {
                    z6xVar = z6x.a;
                }
                Integer num2 = (Integer) o7h.D0((Iterable) z6xVar);
                Integer num3 = new Integer(num2 != null ? num2.intValue() : Integer.MAX_VALUE);
                j801Var.b = 1;
                return vr20Var.emit(num3, j801Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof k801) {
                    k801Var = (k801) lnmVar;
                    int i54 = k801Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        k801Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        k801Var = new k801(this, lnmVar);
                    }
                } else {
                    k801Var = new k801(this, lnmVar);
                }
                Object obj29 = k801Var.a;
                int i55 = k801Var.b;
                if (i55 == 0) {
                    hm5.M(obj29);
                    ((Boolean) obj).getClass();
                    k801Var.b = 1;
                    return vr20Var.emit(ubg1.a, k801Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof nf01) {
                    nf01Var = (nf01) lnmVar;
                    int i56 = nf01Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        nf01Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        nf01Var = new nf01(this, lnmVar);
                    }
                } else {
                    nf01Var = new nf01(this, lnmVar);
                }
                Object obj30 = nf01Var.a;
                int i57 = nf01Var.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                long j = ((Size) obj).a;
                int i58 = xpi1.b;
                if (j == 9205357640488583168L) {
                    num = k291.c;
                } else {
                    int i59 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i59) >= 0.5d) {
                        int i60 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i60) >= 0.5d) {
                            float fIntBitsToFloat = Float.intBitsToFloat(i59);
                            float fAbs = Math.abs(fIntBitsToFloat);
                            w4u w4uVar2 = y4u.a;
                            if (fAbs <= Float.MAX_VALUE) {
                                int iU = jch0.U(fIntBitsToFloat);
                                w4u.a(iU);
                                w4uVar = new w4u(iU);
                            } else {
                                w4uVar = w4uVar2;
                            }
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i60);
                            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                                int iU2 = jch0.U(fIntBitsToFloat2);
                                w4u.a(iU2);
                                w4uVar2 = new w4u(iU2);
                            }
                            num = new k291(w4uVar, w4uVar2);
                        }
                    }
                }
                if (num == null) {
                    return rih1Var;
                }
                nf01Var.b = 1;
                return vr20Var.emit(num, nf01Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof ql01) {
                    ql01Var = (ql01) lnmVar;
                    int i61 = ql01Var.b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        ql01Var.b = i61 - Integer.MIN_VALUE;
                    } else {
                        ql01Var = new ql01(this, lnmVar);
                    }
                } else {
                    ql01Var = new ql01(this, lnmVar);
                }
                Object obj31 = ql01Var.a;
                int i62 = ql01Var.b;
                if (i62 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf11 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    ql01Var.b = 1;
                    return vr20Var.emit(boolValueOf11, ql01Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i62 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof rl01) {
                    rl01Var = (rl01) lnmVar;
                    int i63 = rl01Var.b;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        rl01Var.b = i63 - Integer.MIN_VALUE;
                    } else {
                        rl01Var = new rl01(this, lnmVar);
                    }
                } else {
                    rl01Var = new rl01(this, lnmVar);
                }
                Object obj32 = rl01Var.a;
                int i64 = rl01Var.b;
                if (i64 == 0) {
                    hm5.M(obj32);
                    Boolean boolValueOf12 = Boolean.valueOf(u890.j((String) obj, "ENABLED"));
                    rl01Var.b = 1;
                    return vr20Var.emit(boolValueOf12, rl01Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i64 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ g6z0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
