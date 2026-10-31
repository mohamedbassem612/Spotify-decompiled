package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class eyb implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ eyb(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    public final Object invoke(Object obj) {
        c9e1 c9e1Var;
        elb0 elb0Var;
        elb0 elb0Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        boolean z = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                vy71 vy71Var = (vy71) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                c9n c9nVar = (c9n) obj2;
                e261 e261Var = (e261) obj;
                if (vy71Var.e.I().a.size() > 1 && z) {
                    xy71 xy71VarD = vy71Var.d();
                    s24 s24Var = vy71Var.e;
                    xy71 xy71Var = xy71.c;
                    if (xy71VarD == xy71Var) {
                        if (((Boolean) ((iu30) s24Var.e).invoke(xy71.b)).booleanValue()) {
                            cyb cybVar = new cyb(c9nVar, vy71Var, (byte) 1);
                            mma0[] mma0VarArr = b261.a;
                            e261Var.b(m161.t, new we(str, cybVar));
                        }
                    } else if (((Boolean) ((iu30) s24Var.e).invoke(xy71Var)).booleanValue()) {
                        cyb cybVar2 = new cyb(c9nVar, vy71Var, (byte) 2);
                        mma0[] mma0VarArr2 = b261.a;
                        e261Var.b(m161.u, new we(str2, cybVar2));
                    }
                    if (!vy71Var.c) {
                        cyb cybVar3 = new cyb(c9nVar, vy71Var, (byte) 3);
                        mma0[] mma0VarArr3 = b261.a;
                        e261Var.b(m161.v, new we(str3, cybVar3));
                    }
                }
                break;
            default:
                r1c0 r1c0Var = (r1c0) obj6;
                hrr0 hrr0Var = r1c0Var.o;
                uvb0 uvb0Var = (crl1) obj5;
                x6e1 x6e1Var = (x6e1) obj4;
                c8e1 c8e1Var = (c8e1) obj3;
                hyp0 hyp0Var = (hyp0) obj2;
                elb0 elb0Var3 = (elb0) obj;
                r1c0Var.h = elb0Var3;
                z9e1 z9e1VarD = r1c0Var.d();
                if (z9e1VarD != null) {
                    z9e1VarD.b = elb0Var3;
                }
                if (z) {
                    if (r1c0Var.a() == zr50.b) {
                        if (((Boolean) r1c0Var.l.getValue()).booleanValue() && uvb0Var.b()) {
                            x6e1Var.s();
                        } else {
                            x6e1Var.m();
                        }
                        r1c0Var.m.setValue(Boolean.valueOf(a4p1.m(x6e1Var, true)));
                        r1c0Var.n.setValue(Boolean.valueOf(a4p1.m(x6e1Var, false)));
                        hrr0Var.setValue(Boolean.valueOf(nbe1.d(c8e1Var.b)));
                    } else if (r1c0Var.a() == zr50.c) {
                        hrr0Var.setValue(Boolean.valueOf(a4p1.m(x6e1Var, true)));
                    }
                    eko1.B(r1c0Var, c8e1Var, hyp0Var);
                    z9e1 z9e1VarD2 = r1c0Var.d();
                    if (z9e1VarD2 != null && (c9e1Var = r1c0Var.e) != null && r1c0Var.b() && (elb0Var = z9e1VarD2.b) != null && elb0Var.a() && (elb0Var2 = z9e1VarD2.c) != null) {
                        y9e1 y9e1Var = z9e1VarD2.a;
                        gqb0 gqb0Var = new gqb0(elb0Var, (byte) 19);
                        n511 n511VarU = ljo1.u(elb0Var);
                        n511 n511VarM = elb0Var.M(elb0Var2, false);
                        if (u890.j((c9e1) c9e1Var.a.b.get(), c9e1Var)) {
                            c9e1Var.b.d(c8e1Var, hyp0Var, y9e1Var, gqb0Var, n511VarU, n511VarM);
                        }
                    }
                }
                break;
        }
        return rih1Var;
    }
}
