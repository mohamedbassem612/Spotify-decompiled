package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class glu implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public glu(q811 q811Var, String str, String str2, px20 px20Var, q811 q811Var2, iu30 iu30Var, int i, ven0 ven0Var, ven0 ven0Var2) {
        this.a = (byte) 2;
        this.b = q811Var;
        this.c = str;
        this.f = str2;
        this.g = px20Var;
        this.h = q811Var2;
        this.i = iu30Var;
        this.d = ven0Var;
        this.e = ven0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (p.hap1.i(0, r12) == r2) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.lnm r20) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.glu.b(p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    public final Object emit(Object obj, lnm lnmVar) {
        e6w e6wVar;
        t2o t2oVar;
        String strX0;
        otu otuVarS;
        otu otuVarS2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.b;
        Object obj7 = this.f;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (b) {
            case 0:
                return b(lnmVar);
            case 1:
                String str = (String) obj9;
                if (lnmVar instanceof e6w) {
                    e6wVar = (e6w) lnmVar;
                    int i = e6wVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        e6wVar.b = i - Integer.MIN_VALUE;
                    } else {
                        e6wVar = new e6w(this, lnmVar);
                    }
                } else {
                    e6wVar = new e6w(this, lnmVar);
                }
                Object obj10 = e6wVar.a;
                int i2 = e6wVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                vr20 vr20Var = (vr20) obj6;
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof i1r) {
                    t2oVar = (t2o) i1rVar.a;
                } else {
                    t2oVar = new t2o(!nhc1.Y(str, "spotify:user:", false) ? null : ihc1.X0(str, ":"), null);
                }
                String str2 = (String) obj8;
                String str3 = (String) obj5;
                x5w x5wVar = (x5w) obj7;
                String str4 = x5wVar.b;
                String str5 = x5wVar.a;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                String str8 = t2oVar.a;
                if (str8 == null) {
                    strX0 = nhc1.Y(str, "spotify:user:", false) ? ihc1.X0(str, ":") : null;
                } else {
                    strX0 = str8;
                }
                d6w d6wVar = new d6w(str2, str3, str4, str5, str6, str7, strX0, t2oVar.b, (Integer) obj2);
                e6wVar.b = 1;
                Object objEmit = vr20Var.emit(d6wVar, e6wVar);
                d9n d9nVar = d9n.a;
                return objEmit == d9nVar ? d9nVar : rih1Var;
            default:
                ven0 ven0Var = (ven0) obj8;
                String str9 = (String) obj7;
                String str10 = (String) obj9;
                q811 q811Var = (q811) obj6;
                op80 op80Var = (op80) q811Var.a;
                if (op80Var != null && (otuVarS2 = z8p1.s(op80Var)) != null) {
                    otuVarS2.i(str10, str9);
                }
                tka0 tka0Var = otw.a;
                if (!((guj) ven0Var.getValue()).b.b) {
                    Object value = ((ven0) obj5).getValue();
                    guj gujVar = (guj) ven0Var.getValue();
                    int i3 = ((px20) obj4).f;
                    Object obj11 = ((q811) obj3).a;
                    if (obj11 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    otw.f(value, gujVar, i3, (ztw) obj11, (op80) q811Var.a, (String) obj9, (iu30) obj2);
                }
                op80 op80Var2 = (op80) q811Var.a;
                if (op80Var2 == null || (otuVarS = z8p1.s(op80Var2)) == null) {
                    return rih1Var;
                }
                otuVarS.j(str10, str9);
                return rih1Var;
        }
    }

    public /* synthetic */ glu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }
}
