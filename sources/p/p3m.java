package p;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p3m implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public p3m(vp10 vp10Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5) {
        this.a = (byte) 1;
        this.f = vp10Var;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.e = ven0Var4;
        this.g = ven0Var5;
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public final Object emit(Object obj, lnm lnmVar) {
        String quantityString;
        twc0 twc0Var;
        hti0 hti0Var;
        vr20 vr20Var;
        int i;
        int i2;
        vr20 vr20Var2;
        huz wa3Var;
        mr20 mr20Var;
        x010 x010Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                z3m z3mVar = (z3m) obj;
                s3m s3mVar = (s3m) obj5;
                if (z3mVar instanceof u3m) {
                    u3m u3mVar = (u3m) z3mVar;
                    ((ks3) s3mVar.b).a(new ip41(u3mVar.a, u3mVar.b));
                    return rih1Var;
                }
                if (z3mVar instanceof y3m) {
                    ((ks3) s3mVar.b).d(((y3m) z3mVar).a);
                    return rih1Var;
                }
                if (z3mVar instanceof w3m) {
                    ((ven0) obj3).setValue(new Integer(((w3m) z3mVar).a));
                    return rih1Var;
                }
                if (!(z3mVar instanceof t3m)) {
                    if (z3mVar instanceof v3m) {
                        s3mVar.h.a(of61.b);
                        ((ven0) obj6).setValue(((v3m) z3mVar).a);
                        return rih1Var;
                    }
                    if (!(z3mVar instanceof x3m)) {
                        eg.o();
                        return null;
                    }
                    x3m x3mVar = (x3m) z3mVar;
                    ((ven0) obj7).setValue(new l591(x3mVar.a, x3mVar.b));
                    return rih1Var;
                }
                ven0 ven0Var = (ven0) obj2;
                Resources resources = (Resources) obj4;
                resources.getClass();
                t3m t3mVar = (t3m) z3mVar;
                int i3 = t3mVar.a;
                int i4 = t3mVar.b;
                if (i4 > 0) {
                    quantityString = resources.getQuantityString(2131820571, i3, Integer.valueOf(i3), Integer.valueOf(i4));
                    quantityString.getClass();
                } else {
                    quantityString = resources.getQuantityString(2131820570, i3, Integer.valueOf(i3));
                    quantityString.getClass();
                }
                ven0Var.setValue(quantityString);
                return rih1Var;
            case 1:
                s8l1 s8l1Var = (u8l1) obj;
                ven0 ven0Var2 = (ven0) obj4;
                ven0 ven0Var3 = (ven0) obj7;
                ven0 ven0Var4 = (ven0) obj6;
                ven0 ven0Var5 = (ven0) obj2;
                vp10 vp10Var = (vp10) obj5;
                ven0 ven0Var6 = (ven0) obj3;
                if (!(s8l1Var instanceof s8l1)) {
                    if (!(s8l1Var instanceof t8l1)) {
                        eg.o();
                        return null;
                    }
                    ven0Var6.setValue(vp10Var.a);
                    Boolean bool = Boolean.FALSE;
                    ven0Var5.setValue(bool);
                    ven0Var4.setValue(bool);
                    ven0Var3.setValue((Object) null);
                    ven0Var2.setValue((Object) null);
                    return rih1Var;
                }
                z0i z0iVarC = vp10Var.a;
                r160 r160Var = s8l1Var.a;
                z0i z0iVar = r160Var.a;
                if (z0iVar != null) {
                    if (z0iVar instanceof ibm1) {
                        z0i z0iVar2 = (ibm1) z0iVar;
                        ibm1 ibm1Var = z0iVarC instanceof ibm1 ? (ibm1) z0iVarC : null;
                        if (ibm1Var == null) {
                            z0iVarC = z0iVar2;
                        } else {
                            xz7 xz7Var = ((ibm1) z0iVar2).e;
                            if (xz7Var == null) {
                                xz7Var = ibm1Var.e;
                            }
                            xz7 xz7Var2 = xz7Var;
                            f08 f08Var = ((ibm1) z0iVar2).f;
                            if (f08Var == null) {
                                f08Var = ibm1Var.f;
                            }
                            f08 f08Var2 = f08Var;
                            g08 g08Var = ((ibm1) z0iVar2).g;
                            if (g08Var == null) {
                                g08Var = ibm1Var.g;
                            }
                            z0iVarC = ibm1.c(z0iVar2, (String) null, xz7Var2, f08Var2, g08Var, 15);
                        }
                    } else {
                        z0iVarC = z0iVar;
                    }
                }
                ven0Var6.setValue(z0iVarC);
                ven0Var5.setValue(Boolean.valueOf(r160Var.c));
                ven0Var4.setValue(Boolean.valueOf(r160Var.e));
                Integer num = r160Var.b;
                ven0Var3.setValue(num != null ? new u7h(z4p1.e(num.intValue())) : null);
                ven0Var2.setValue(r160Var.d);
                return rih1Var;
            default:
                rzq rzqVar = (rzq) obj7;
                ywc0 ywc0Var = (ywc0) obj6;
                if (lnmVar instanceof twc0) {
                    twc0Var = (twc0) lnmVar;
                    int i5 = twc0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        twc0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        twc0Var = new twc0(this, lnmVar);
                    }
                } else {
                    twc0Var = new twc0(this, lnmVar);
                }
                Object objB = twc0Var.a;
                int i6 = twc0Var.b;
                int i7 = 3;
                huz huzVar = d9n.a;
                if (i6 == 0) {
                    hm5.M(objB);
                    vr20 vr20Var3 = (vr20) obj5;
                    eoc0 eoc0Var = (eoc0) obj4;
                    hti0Var = new hti0((String) obj3, eoc0Var.b, (String) obj2, (qxc0) obj, eoc0Var.c, eoc0Var.d);
                    twc0Var.c = vr20Var3;
                    twc0Var.f = hti0Var;
                    twc0Var.d = 0;
                    twc0Var.h = 0;
                    twc0Var.b = 1;
                    objB = ywc0Var.b(hti0Var, rzqVar, twc0Var);
                    if (objB != huzVar) {
                        vr20Var = vr20Var3;
                        i = 0;
                        i2 = 0;
                    }
                    return huzVar;
                }
                if (i6 == 1) {
                    int i8 = twc0Var.h;
                    int i9 = twc0Var.d;
                    hti0Var = twc0Var.f;
                    vr20Var = twc0Var.c;
                    hm5.M(objB);
                    i2 = i8;
                    i = i9;
                } else {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            hm5.M(objB);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = twc0Var.d;
                    mr20Var = twc0Var.g;
                    vr20 vr20Var4 = twc0Var.c;
                    hm5.M(objB);
                    vr20Var = vr20Var4;
                    i7 = 3;
                    vr20Var2 = null;
                }
                x010Var = new x010(mr20Var, (mr20) objB, new vv70(i7, (lnm) vr20Var2, (byte) 10), (byte) 1);
                twc0Var.c = vr20Var2;
                twc0Var.f = vr20Var2;
                twc0Var.g = vr20Var2;
                twc0Var.d = i;
                twc0Var.b = i7;
                if (vr20Var.emit(x010Var, twc0Var) != huzVar) {
                    return rih1Var;
                }
                return huzVar;
                mr20 mr20Var2 = (mr20) objB;
                twc0Var.c = vr20Var;
                twc0Var.f = null;
                twc0Var.g = mr20Var2;
                twc0Var.d = i;
                twc0Var.h = i2;
                twc0Var.b = 2;
                List list = ywc0Var.d;
                if (list.isEmpty()) {
                    wa3Var = new huz(z6x.a, (byte) 10);
                    vr20Var2 = null;
                } else if (ywc0Var.e.c()) {
                    vr20Var2 = null;
                    wa3Var = new m441(new og5(ywc0Var, hti0Var, rzqVar, vr20Var2, (byte) 22));
                } else {
                    hti0 hti0Var2 = hti0Var;
                    vr20Var2 = null;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((shm) it.next()).a(hti0Var2, rzqVar));
                    }
                    wa3Var = new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 21);
                }
                if (wa3Var != huzVar) {
                    huz huzVar2 = wa3Var;
                    mr20Var = mr20Var2;
                    objB = huzVar2;
                    x010Var = new x010(mr20Var, (mr20) objB, new vv70(i7, (lnm) vr20Var2, (byte) 10), (byte) 1);
                    twc0Var.c = vr20Var2;
                    twc0Var.f = vr20Var2;
                    twc0Var.g = vr20Var2;
                    twc0Var.d = i;
                    twc0Var.b = i7;
                    if (vr20Var.emit(x010Var, twc0Var) != huzVar) {
                        return rih1Var;
                    }
                }
                return huzVar;
        }
    }

    public /* synthetic */ p3m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj5;
        this.e = obj6;
    }
}
