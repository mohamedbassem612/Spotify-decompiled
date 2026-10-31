package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bii0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l0x0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bii0(l0x0 l0x0Var, byte b) {
        super(4);
        this.a = b;
        this.b = l0x0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        l0x0 l0x0Var = this.b;
        switch (b) {
            case 0:
                hob1 hob1Var = (hob1) obj3;
                c700 c700Var = (c700) obj4;
                boolean z = hob1Var.g;
                boolean z2 = hob1Var.f;
                w7h1 w7h1VarT = upo1.t((dsj1) obj, hob1Var, c700Var, (String) null, 4);
                n1x n1xVar = ((mey0) obj2).g;
                if (n1xVar != null) {
                    if (c700Var.equals(kwz.a) || (c700Var instanceof gzz)) {
                        l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                    } else {
                        boolean z3 = c700Var instanceof w500;
                        c00 c00Var = a00.a;
                        c00 c00Var2 = b00.a;
                        if (z3) {
                            if (z2) {
                                l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                            } else {
                                if (z) {
                                    c00Var = c00Var2;
                                }
                                l0x0Var.o(new d00(gho1.r(n1xVar), wgo1.w(n1xVar), c00Var));
                            }
                        } else if (c700Var instanceof pwz) {
                            l0x0Var.o(new z00(wgo1.x(n1xVar), gho1.r(n1xVar), ((pwz) c700Var).a));
                        } else if (c700Var instanceof f300) {
                            if (z2) {
                                c00Var = zz.a;
                            } else if (z) {
                                c00Var = c00Var2;
                            }
                            l0x0Var.o(new d00(gho1.r(n1xVar), wgo1.w(n1xVar), c00Var));
                        } else if (c700Var instanceof m300) {
                            l0x0Var.o(new g00(gho1.r(n1xVar), new f00(((m300) c700Var).a ? wgo1.w(n1xVar) : z6x.a)));
                        } else if (c700Var instanceof d000) {
                            if (((d000) c700Var).a) {
                                l0x0Var.o(new uz(gho1.r(n1xVar), wgo1.w(n1xVar)));
                            }
                        } else if (c700Var instanceof txz) {
                            l0x0Var.o(new cz(gho1.r(n1xVar), wgo1.w(n1xVar), hob1Var.i ? az.a : zy.a));
                        } else if ((c700Var instanceof lxz) || c700Var.equals(nwz.a)) {
                            l0x0Var.o(new wy(gho1.r(n1xVar)));
                        } else if (c700Var instanceof mxz) {
                            l0x0Var.o(new xy(gho1.r(n1xVar)));
                        }
                    }
                }
                return w7h1VarT;
            case 1:
                oii0 oii0Var = (oii0) obj2;
                kii0 kii0Var = (kii0) obj4;
                if (kii0Var instanceof iii0) {
                    n1x n1xVar2 = oii0Var.f;
                    if (n1xVar2 != null) {
                        l0x0Var.o(new z00(wgo1.x(n1xVar2), gho1.r(n1xVar2), ((iii0) kii0Var).a));
                    }
                } else if (!(kii0Var instanceof jii0)) {
                    eg.o();
                }
                return null;
            case 2:
                bcl0 bcl0Var = (bcl0) obj;
                o6j1 o6j1Var = (o6j1) obj3;
                j6j1 j6j1Var = (j6j1) obj4;
                n1x n1xVar3 = ((n6j1) obj2).g;
                if (j6j1Var instanceof f6j1) {
                    if (n1xVar3 != null) {
                        l0x0Var.o(new qy(gho1.r(n1xVar3), wgo1.w(n1xVar3)));
                    }
                    return bcl0Var.a(o6j1Var.n);
                }
                if (j6j1Var instanceof g6j1) {
                    return bcl0Var.g();
                }
                if (j6j1Var instanceof i6j1) {
                    if (n1xVar3 == null) {
                        return null;
                    }
                    l0x0Var.o(new z00(wgo1.x(n1xVar3), gho1.r(n1xVar3), ((i6j1) j6j1Var).a));
                    return null;
                }
                if (!(j6j1Var instanceof h6j1)) {
                    eg.o();
                    return null;
                }
                if (n1xVar3 == null) {
                    return null;
                }
                l0x0Var.o(new wy(gho1.r(n1xVar3)));
                return null;
            default:
                a4m0 a4m0Var = (a4m0) obj;
                c7m1 c7m1Var = (c7m1) obj3;
                v6m1 v6m1Var = (x6m1) obj4;
                n1x n1xVar4 = ((a7m1) obj2).c;
                if (v6m1Var instanceof w6m1) {
                    l0x0Var.o(new qy(gho1.r(n1xVar4), wgo1.w(n1xVar4)));
                    return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", c7m1Var.k)), a4m0Var.b, a4m0Var.a, System.currentTimeMillis());
                }
                if (!(v6m1Var instanceof v6m1)) {
                    eg.o();
                    return null;
                }
                l0x0Var.o(new z00(wgo1.x(n1xVar4), gho1.r(n1xVar4), v6m1Var.a));
                return null;
        }
    }
}
