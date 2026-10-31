package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z4y0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ i5y0 c;

    public /* synthetic */ z4y0(vr20 vr20Var, i5y0 i5y0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = i5y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        y4y0 y4y0Var;
        zl10 yl10Var;
        c5y0 c5y0Var;
        e5y0 e5y0Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        q1y0 q1y0Var = q1y0.a;
        i5y0 i5y0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof y4y0) {
                    y4y0Var = (y4y0) lnmVar;
                    int i = y4y0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y4y0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        y4y0Var = new y4y0(this, lnmVar);
                    }
                } else {
                    y4y0Var = new y4y0(this, lnmVar);
                }
                Object obj2 = y4y0Var.a;
                int i2 = y4y0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                td tdVar = (vl10) ((Map) obj).get(q1y0Var);
                if (tdVar instanceof ul10) {
                    yl10Var = new zl10();
                } else {
                    td tdVar2 = tdVar instanceof tl10 ? (tl10) tdVar : null;
                    td tdVar3 = rd.a;
                    td tdVar4 = tdVar2 != null ? ((tl10) tdVar2).b : tdVar3;
                    if (i5y0Var.b.a() || !(tdVar4 instanceof kd)) {
                        tdVar3 = tdVar4;
                    }
                    yl10Var = new yl10("generate", tdVar3, new f1i1(e1i1.d));
                }
                y4y0Var.b = 1;
                return vr20Var.emit(yl10Var, y4y0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof c5y0) {
                    c5y0Var = (c5y0) lnmVar;
                    int i3 = c5y0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c5y0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        c5y0Var = new c5y0(this, lnmVar);
                    }
                } else {
                    c5y0Var = new c5y0(this, lnmVar);
                }
                Object obj3 = c5y0Var.a;
                int i4 = c5y0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Map map = (Map) obj;
                if (i5y0Var.b.a()) {
                    Object obj4 = map.get(q1y0Var);
                    tl10 tl10Var = obj4 instanceof tl10 ? (tl10) obj4 : null;
                    if ((tl10Var != null ? tl10Var.b : null) instanceof kd) {
                        z = true;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                c5y0Var.b = 1;
                return vr20Var.emit(boolValueOf, c5y0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof e5y0) {
                    e5y0Var = (e5y0) lnmVar;
                    int i5 = e5y0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        e5y0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        e5y0Var = new e5y0(this, lnmVar);
                    }
                } else {
                    e5y0Var = new e5y0(this, lnmVar);
                }
                Object obj5 = e5y0Var.a;
                int i6 = e5y0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                Map map2 = (Map) obj;
                if (i5y0Var.b.a()) {
                    Object obj6 = map2.get(q1y0Var);
                    tl10 tl10Var2 = obj6 instanceof tl10 ? (tl10) obj6 : null;
                    if ((tl10Var2 != null ? tl10Var2.b : null) instanceof kd) {
                        z = true;
                    }
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                e5y0Var.b = 1;
                return vr20Var.emit(boolValueOf2, e5y0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
