package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xpl1 implements xct {
    public int a;
    public cjl b;
    public dz31 c;
    public bjl d;
    public final d5u e = new d5u(this);
    public int f = 0;
    public boolean g = false;
    public final zct h = new zct(this);
    public final zct i = new zct(this);
    public int j = 1;

    public xpl1(cjl cjlVar) {
        this.b = cjlVar;
    }

    public static void b(zct zctVar, zct zctVar2, int i) {
        zctVar.l.add(zctVar2);
        zctVar.f = i;
        zctVar2.k.add(zctVar);
    }

    public static zct h(lhl lhlVar) {
        lhl lhlVar2 = lhlVar.f;
        if (lhlVar2 == null) {
            return null;
        }
        cjl cjlVar = lhlVar2.d;
        int iC = l1d.C(lhlVar2.e);
        if (iC == 1) {
            return cjlVar.d.h;
        }
        if (iC == 2) {
            return cjlVar.e.h;
        }
        if (iC == 3) {
            return cjlVar.d.i;
        }
        if (iC == 4) {
            return cjlVar.e.i;
        }
        if (iC != 5) {
            return null;
        }
        return cjlVar.e.k;
    }

    public static zct i(lhl lhlVar, int i) {
        lhl lhlVar2 = lhlVar.f;
        if (lhlVar2 == null) {
            return null;
        }
        cjl cjlVar = lhlVar2.d;
        xpl1 xpl1Var = i == 0 ? cjlVar.d : cjlVar.e;
        int iC = l1d.C(lhlVar2.e);
        if (iC == 1 || iC == 2) {
            return xpl1Var.h;
        }
        if (iC == 3 || iC == 4) {
            return xpl1Var.i;
        }
        return null;
    }

    public final void c(zct zctVar, zct zctVar2, int i, d5u d5uVar) {
        zctVar.l.add(zctVar2);
        zctVar.l.add(this.e);
        zctVar.h = i;
        zctVar.i = d5uVar;
        zctVar2.k.add(zctVar);
        d5uVar.k.add(zctVar);
    }

    public void d() {
        cjl cjlVar;
        cjl cjlVar2;
        bjl bjlVar;
        cjl cjlVar3;
        cjl cjlVar4;
        bjl bjlVar2;
        cjl cjlVar5 = this.b;
        boolean z = cjlVar5.a;
        d5u d5uVar = this.e;
        if (z) {
            d5uVar.d(cjlVar5.s());
        }
        boolean z2 = d5uVar.j;
        ArrayList arrayList = d5uVar.k;
        ArrayList arrayList2 = d5uVar.l;
        bjl bjlVar3 = bjl.d;
        bjl bjlVar4 = bjl.c;
        bjl bjlVar5 = bjl.a;
        zct zctVar = this.i;
        zct zctVar2 = this.h;
        if (!z2) {
            cjl cjlVar6 = this.b;
            bjl bjlVar6 = cjlVar6.U[0];
            this.d = bjlVar6;
            if (bjlVar6 != bjlVar4) {
                if (bjlVar6 == bjlVar3 && (cjlVar4 = cjlVar6.V) != null && ((bjlVar2 = cjlVar4.U[0]) == bjlVar5 || bjlVar2 == bjlVar3)) {
                    int iS = (cjlVar4.s() - this.b.J.e()) - this.b.L.e();
                    b(zctVar2, cjlVar4.d.h, this.b.J.e());
                    b(zctVar, cjlVar4.d.i, -this.b.L.e());
                    d5uVar.d(iS);
                    return;
                }
                if (bjlVar6 == bjlVar5) {
                    d5uVar.d(cjlVar6.s());
                }
            }
        } else if (this.d == bjlVar3 && (cjlVar2 = (cjlVar = this.b).V) != null && ((bjlVar = cjlVar2.U[0]) == bjlVar5 || bjlVar == bjlVar3)) {
            b(zctVar2, cjlVar2.d.h, cjlVar.J.e());
            b(zctVar, cjlVar2.d.i, -this.b.L.e());
            return;
        }
        if (d5uVar.j) {
            cjl cjlVar7 = this.b;
            if (cjlVar7.a) {
                lhl[] lhlVarArr = cjlVar7.R;
                lhl lhlVar = lhlVarArr[0];
                lhl lhlVar2 = lhlVar.f;
                if (lhlVar2 != null && lhlVarArr[1].f != null) {
                    boolean z3 = cjlVar7.z();
                    cjl cjlVar8 = this.b;
                    if (z3) {
                        zctVar2.f = cjlVar8.R[0].e();
                        zctVar.f = -this.b.R[1].e();
                        return;
                    }
                    zct zctVarH = h(cjlVar8.R[0]);
                    if (zctVarH != null) {
                        b(zctVar2, zctVarH, this.b.R[0].e());
                    }
                    zct zctVarH2 = h(this.b.R[1]);
                    if (zctVarH2 != null) {
                        b(zctVar, zctVarH2, -this.b.R[1].e());
                    }
                    zctVar2.b = true;
                    zctVar.b = true;
                    return;
                }
                if (lhlVar2 != null) {
                    zct zctVarH3 = h(lhlVar);
                    if (zctVarH3 != null) {
                        b(zctVar2, zctVarH3, this.b.R[0].e());
                        b(zctVar, zctVar2, d5uVar.g);
                        return;
                    }
                    return;
                }
                lhl lhlVar3 = lhlVarArr[1];
                if (lhlVar3.f != null) {
                    zct zctVarH4 = h(lhlVar3);
                    if (zctVarH4 != null) {
                        b(zctVar, zctVarH4, -this.b.R[1].e());
                        b(zctVar2, zctVar, -d5uVar.g);
                        return;
                    }
                    return;
                }
                if ((cjlVar7 instanceof l660) || cjlVar7.V == null || cjlVar7.k(7).f != null) {
                    return;
                }
                cjl cjlVar9 = this.b;
                b(zctVar2, cjlVar9.V.d.h, cjlVar9.t());
                b(zctVar, zctVar2, d5uVar.g);
                return;
            }
        }
        if (this.d == bjlVar4) {
            cjl cjlVar10 = this.b;
            int i = cjlVar10.s;
            if (i == 2) {
                cjl cjlVar11 = cjlVar10.V;
                if (cjlVar11 != null) {
                    d5u d5uVar2 = cjlVar11.e.e;
                    arrayList2.add(d5uVar2);
                    d5uVar2.k.add(d5uVar);
                    d5uVar.b = true;
                    arrayList.add(zctVar2);
                    arrayList.add(zctVar);
                }
            } else if (i == 3) {
                if (cjlVar10.t == 3) {
                    zctVar2.a = this;
                    zctVar.a = this;
                    s6j1 s6j1Var = cjlVar10.e;
                    s6j1Var.h.a = this;
                    s6j1Var.i.a = this;
                    d5uVar.a = this;
                    if (cjlVar10.A()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(d5uVar);
                        s6j1 s6j1Var2 = this.b.e;
                        s6j1Var2.e.a = this;
                        arrayList2.add(s6j1Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(d5uVar);
                        this.b.e.i.k.add(d5uVar);
                    } else {
                        boolean z4 = this.b.z();
                        cjl cjlVar12 = this.b;
                        if (z4) {
                            cjlVar12.e.e.l.add(d5uVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            cjlVar12.e.e.l.add(d5uVar);
                        }
                    }
                } else {
                    d5u d5uVar3 = cjlVar10.e.e;
                    arrayList2.add(d5uVar3);
                    d5uVar3.k.add(d5uVar);
                    this.b.e.h.k.add(d5uVar);
                    this.b.e.i.k.add(d5uVar);
                    d5uVar.b = true;
                    arrayList.add(zctVar2);
                    arrayList.add(zctVar);
                    zctVar2.l.add(d5uVar);
                    zctVar.l.add(d5uVar);
                }
            }
        }
        cjl cjlVar13 = this.b;
        lhl[] lhlVarArr2 = cjlVar13.R;
        lhl lhlVar4 = lhlVarArr2[0];
        lhl lhlVar5 = lhlVar4.f;
        if (lhlVar5 != null && lhlVarArr2[1].f != null) {
            boolean z5 = cjlVar13.z();
            cjl cjlVar14 = this.b;
            if (z5) {
                zctVar2.f = cjlVar14.R[0].e();
                zctVar.f = -this.b.R[1].e();
                return;
            }
            zct zctVarH5 = h(cjlVar14.R[0]);
            zct zctVarH6 = h(this.b.R[1]);
            if (zctVarH5 != null) {
                zctVarH5.b(this);
            }
            if (zctVarH6 != null) {
                zctVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (lhlVar5 != null) {
            zct zctVarH7 = h(lhlVar4);
            if (zctVarH7 != null) {
                b(zctVar2, zctVarH7, this.b.R[0].e());
                c(zctVar, zctVar2, 1, d5uVar);
                return;
            }
            return;
        }
        lhl lhlVar6 = lhlVarArr2[1];
        if (lhlVar6.f != null) {
            zct zctVarH8 = h(lhlVar6);
            if (zctVarH8 != null) {
                b(zctVar, zctVarH8, -this.b.R[1].e());
                c(zctVar2, zctVar, -1, d5uVar);
                return;
            }
            return;
        }
        if ((cjlVar13 instanceof l660) || (cjlVar3 = cjlVar13.V) == null) {
            return;
        }
        b(zctVar2, cjlVar3.d.h, cjlVar13.t());
        c(zctVar, zctVar2, 1, d5uVar);
    }

    public void e() {
        cjl cjlVar = this.b;
        int i = ((tq50) cjlVar).y0;
        zct zctVar = this.h;
        if (i == 1) {
            cjlVar.a0 = zctVar.g;
        } else {
            cjlVar.b0 = zctVar.g;
        }
    }

    public void f() {
        this.h.c();
    }

    public final int g(int i, int i2) {
        cjl cjlVar = this.b;
        if (i2 == 0) {
            int i3 = cjlVar.w;
            int iMax = Math.max(cjlVar.v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = cjlVar.z;
            int iMax2 = Math.max(cjlVar.y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        d5u d5uVar = this.e;
        if (d5uVar.j) {
            return d5uVar.g;
        }
        return 0L;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(lhl lhlVar, lhl lhlVar2, int i) {
        d5u d5uVar;
        float f;
        int i2;
        int i3;
        zct zctVarH = h(lhlVar);
        zct zctVarH2 = h(lhlVar2);
        if (zctVarH.j && zctVarH2.j) {
            int iE = lhlVar.e() + zctVarH.g;
            int iE2 = zctVarH2.g - lhlVar2.e();
            int i4 = iE2 - iE;
            d5u d5uVar2 = this.e;
            if (!d5uVar2.j) {
                bjl bjlVar = this.d;
                bjl bjlVar2 = bjl.c;
                if (bjlVar == bjlVar2) {
                    int i5 = this.a;
                    if (i5 == 0) {
                        d5uVar2.d(g(i4, i));
                    } else if (i5 == 1) {
                        d5uVar2.d(Math.min(g(d5uVar2.m, i), i4));
                    } else if (i5 == 2) {
                        cjl cjlVar = this.b;
                        cjl cjlVar2 = cjlVar.V;
                        if (cjlVar2 != null) {
                            d5u d5uVar3 = (i == 0 ? cjlVar2.d : cjlVar2.e).e;
                            if (d5uVar3.j) {
                                d5uVar2.d(g((int) ((d5uVar3.g * (i == 0 ? cjlVar.x : cjlVar.A)) + 0.5f), i));
                            }
                        }
                    } else if (i5 == 3) {
                        cjl cjlVar3 = this.b;
                        xpl1 xpl1Var = cjlVar3.d;
                        if (xpl1Var.d == bjlVar2 && xpl1Var.a == 3) {
                            s6j1 s6j1Var = cjlVar3.e;
                            if (s6j1Var.d != bjlVar2 || s6j1Var.a != 3) {
                                if (i == 0) {
                                    xpl1Var = cjlVar3.e;
                                }
                                d5uVar = xpl1Var.e;
                                if (d5uVar.j) {
                                    f = cjlVar3.Y;
                                    i2 = d5uVar.g;
                                    if (i == 1) {
                                        i3 = (int) ((i2 / f) + 0.5f);
                                    } else {
                                        i3 = (int) ((f * i2) + 0.5f);
                                    }
                                    d5uVar2.d(i3);
                                }
                            }
                        } else {
                            if (i == 0) {
                                xpl1Var = cjlVar3.e;
                            }
                            d5uVar = xpl1Var.e;
                            if (d5uVar.j) {
                                f = cjlVar3.Y;
                                i2 = d5uVar.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                d5uVar2.d(i3);
                            }
                        }
                    }
                }
            }
            if (d5uVar2.j) {
                int i6 = d5uVar2.g;
                zct zctVar = this.i;
                zct zctVar2 = this.h;
                if (i6 == i4) {
                    zctVar2.d(iE);
                    zctVar.d(iE2);
                    return;
                }
                cjl cjlVar4 = this.b;
                float f2 = i == 0 ? cjlVar4.f0 : cjlVar4.g0;
                if (zctVarH == zctVarH2) {
                    iE = zctVarH.g;
                    iE2 = zctVarH2.g;
                    f2 = 0.5f;
                }
                zctVar2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                zctVar.d(zctVar2.g + d5uVar2.g);
            }
        }
    }
}
