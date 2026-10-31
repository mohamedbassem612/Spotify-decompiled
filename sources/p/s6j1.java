package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s6j1 extends xpl1 {
    public zct k;
    public mda l;

    @Override // p.xct
    public final void a(xct xctVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (l1d.C(this.j) == 3) {
            cjl cjlVar = this.b;
            l(cjlVar.K, cjlVar.M, 1);
            return;
        }
        d5u d5uVar = this.e;
        boolean z = d5uVar.c;
        bjl bjlVar = bjl.c;
        if (z && !d5uVar.j && this.d == bjlVar) {
            cjl cjlVar2 = this.b;
            int i2 = cjlVar2.t;
            if (i2 == 2) {
                cjl cjlVar3 = cjlVar2.V;
                if (cjlVar3 != null) {
                    d5u d5uVar2 = cjlVar3.e.e;
                    if (d5uVar2.j) {
                        d5uVar.d((int) ((d5uVar2.g * cjlVar2.A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                d5u d5uVar3 = cjlVar2.d.e;
                if (d5uVar3.j) {
                    int i3 = cjlVar2.Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = d5uVar3.g * cjlVar2.Y;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = d5uVar3.g;
                            f2 = cjlVar2.Y;
                        }
                        d5uVar.d(i);
                    } else {
                        f = d5uVar3.g;
                        f2 = cjlVar2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    d5uVar.d(i);
                }
            }
        }
        zct zctVar = this.h;
        boolean z2 = zctVar.c;
        ArrayList arrayList = zctVar.l;
        if (z2) {
            zct zctVar2 = this.i;
            boolean z3 = zctVar2.c;
            ArrayList arrayList2 = zctVar2.l;
            if (z3) {
                if (zctVar.j && zctVar2.j && d5uVar.j) {
                    return;
                }
                if (!d5uVar.j && this.d == bjlVar) {
                    cjl cjlVar4 = this.b;
                    if (cjlVar4.s == 0 && !cjlVar4.A()) {
                        zct zctVar3 = (zct) arrayList.get(0);
                        zct zctVar4 = (zct) arrayList2.get(0);
                        int i4 = zctVar3.g + zctVar.f;
                        int i5 = zctVar4.g + zctVar2.f;
                        zctVar.d(i4);
                        zctVar2.d(i5);
                        d5uVar.d(i5 - i4);
                        return;
                    }
                }
                if (!d5uVar.j && this.d == bjlVar && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    zct zctVar5 = (zct) arrayList.get(0);
                    int i6 = (((zct) arrayList2.get(0)).g + zctVar2.f) - (zctVar5.g + zctVar.f);
                    int i7 = d5uVar.m;
                    if (i6 < i7) {
                        d5uVar.d(i6);
                    } else {
                        d5uVar.d(i7);
                    }
                }
                if (d5uVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    zct zctVar6 = (zct) arrayList.get(0);
                    zct zctVar7 = (zct) arrayList2.get(0);
                    int i8 = zctVar6.g;
                    int i9 = zctVar.f + i8;
                    int i10 = zctVar7.g;
                    int i11 = zctVar2.f + i10;
                    float f4 = this.b.g0;
                    if (zctVar6 == zctVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    zctVar.d((int) ((((i10 - i8) - d5uVar.g) * f4) + i8 + 0.5f));
                    zctVar2.d(zctVar.g + d5uVar.g);
                }
            }
        }
    }

    @Override // p.xpl1
    public final void d() {
        cjl cjlVar;
        cjl cjlVar2;
        cjl cjlVar3;
        cjl cjlVar4;
        zct zctVar = this.k;
        cjl cjlVar5 = this.b;
        boolean z = cjlVar5.a;
        d5u d5uVar = this.e;
        if (z) {
            d5uVar.d(cjlVar5.m());
        }
        boolean z2 = d5uVar.j;
        ArrayList arrayList = d5uVar.k;
        ArrayList arrayList2 = d5uVar.l;
        bjl bjlVar = bjl.d;
        bjl bjlVar2 = bjl.a;
        bjl bjlVar3 = bjl.c;
        zct zctVar2 = this.i;
        zct zctVar3 = this.h;
        if (!z2) {
            cjl cjlVar6 = this.b;
            this.d = cjlVar6.U[1];
            if (cjlVar6.F) {
                this.l = new mda(this);
            }
            bjl bjlVar4 = this.d;
            if (bjlVar4 != bjlVar3) {
                if (bjlVar4 == bjlVar && (cjlVar4 = this.b.V) != null && cjlVar4.U[1] == bjlVar2) {
                    int iM = (cjlVar4.m() - this.b.K.e()) - this.b.M.e();
                    xpl1.b(zctVar3, cjlVar4.e.h, this.b.K.e());
                    xpl1.b(zctVar2, cjlVar4.e.i, -this.b.M.e());
                    d5uVar.d(iM);
                    return;
                }
                if (bjlVar4 == bjlVar2) {
                    d5uVar.d(this.b.m());
                }
            }
        } else if (this.d == bjlVar && (cjlVar2 = (cjlVar = this.b).V) != null && cjlVar2.U[1] == bjlVar2) {
            xpl1.b(zctVar3, cjlVar2.e.h, cjlVar.K.e());
            xpl1.b(zctVar2, cjlVar2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = d5uVar.j;
        if (z3) {
            cjl cjlVar7 = this.b;
            if (cjlVar7.a) {
                lhl[] lhlVarArr = cjlVar7.R;
                lhl lhlVar = lhlVarArr[2];
                lhl lhlVar2 = lhlVar.f;
                if (lhlVar2 != null && lhlVarArr[3].f != null) {
                    boolean zA = cjlVar7.A();
                    cjl cjlVar8 = this.b;
                    if (zA) {
                        zctVar3.f = cjlVar8.R[2].e();
                        zctVar2.f = -this.b.R[3].e();
                    } else {
                        zct zctVarH = xpl1.h(cjlVar8.R[2]);
                        if (zctVarH != null) {
                            xpl1.b(zctVar3, zctVarH, this.b.R[2].e());
                        }
                        zct zctVarH2 = xpl1.h(this.b.R[3]);
                        if (zctVarH2 != null) {
                            xpl1.b(zctVar2, zctVarH2, -this.b.R[3].e());
                        }
                        zctVar3.b = true;
                        zctVar2.b = true;
                    }
                    cjl cjlVar9 = this.b;
                    if (cjlVar9.F) {
                        xpl1.b(zctVar, zctVar3, cjlVar9.c0);
                        return;
                    }
                    return;
                }
                if (lhlVar2 != null) {
                    zct zctVarH3 = xpl1.h(lhlVar);
                    if (zctVarH3 != null) {
                        xpl1.b(zctVar3, zctVarH3, this.b.R[2].e());
                        xpl1.b(zctVar2, zctVar3, d5uVar.g);
                        cjl cjlVar10 = this.b;
                        if (cjlVar10.F) {
                            xpl1.b(zctVar, zctVar3, cjlVar10.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                lhl lhlVar3 = lhlVarArr[3];
                if (lhlVar3.f != null) {
                    zct zctVarH4 = xpl1.h(lhlVar3);
                    if (zctVarH4 != null) {
                        xpl1.b(zctVar2, zctVarH4, -this.b.R[3].e());
                        xpl1.b(zctVar3, zctVar2, -d5uVar.g);
                    }
                    cjl cjlVar11 = this.b;
                    if (cjlVar11.F) {
                        xpl1.b(zctVar, zctVar3, cjlVar11.c0);
                        return;
                    }
                    return;
                }
                lhl lhlVar4 = lhlVarArr[4];
                if (lhlVar4.f != null) {
                    zct zctVarH5 = xpl1.h(lhlVar4);
                    if (zctVarH5 != null) {
                        xpl1.b(zctVar, zctVarH5, 0);
                        xpl1.b(zctVar3, zctVar, -this.b.c0);
                        xpl1.b(zctVar2, zctVar3, d5uVar.g);
                        return;
                    }
                    return;
                }
                if ((cjlVar7 instanceof l660) || cjlVar7.V == null || cjlVar7.k(7).f != null) {
                    return;
                }
                cjl cjlVar12 = this.b;
                xpl1.b(zctVar3, cjlVar12.V.e.h, cjlVar12.u());
                xpl1.b(zctVar2, zctVar3, d5uVar.g);
                cjl cjlVar13 = this.b;
                if (cjlVar13.F) {
                    xpl1.b(zctVar, zctVar3, cjlVar13.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != bjlVar3) {
            d5uVar.b(this);
        } else {
            cjl cjlVar14 = this.b;
            int i = cjlVar14.t;
            if (i == 2) {
                cjl cjlVar15 = cjlVar14.V;
                if (cjlVar15 != null) {
                    d5u d5uVar2 = cjlVar15.e.e;
                    arrayList2.add(d5uVar2);
                    d5uVar2.k.add(d5uVar);
                    d5uVar.b = true;
                    arrayList.add(zctVar3);
                    arrayList.add(zctVar2);
                }
            } else if (i == 3 && !cjlVar14.A()) {
                cjl cjlVar16 = this.b;
                if (cjlVar16.s != 3) {
                    d5u d5uVar3 = cjlVar16.d.e;
                    arrayList2.add(d5uVar3);
                    d5uVar3.k.add(d5uVar);
                    d5uVar.b = true;
                    arrayList.add(zctVar3);
                    arrayList.add(zctVar2);
                }
            }
        }
        cjl cjlVar17 = this.b;
        lhl[] lhlVarArr2 = cjlVar17.R;
        lhl lhlVar5 = lhlVarArr2[2];
        lhl lhlVar6 = lhlVar5.f;
        if (lhlVar6 != null && lhlVarArr2[3].f != null) {
            boolean zA2 = cjlVar17.A();
            cjl cjlVar18 = this.b;
            if (zA2) {
                zctVar3.f = cjlVar18.R[2].e();
                zctVar2.f = -this.b.R[3].e();
            } else {
                zct zctVarH6 = xpl1.h(cjlVar18.R[2]);
                zct zctVarH7 = xpl1.h(this.b.R[3]);
                if (zctVarH6 != null) {
                    zctVarH6.b(this);
                }
                if (zctVarH7 != null) {
                    zctVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.F) {
                c(zctVar, zctVar3, 1, this.l);
            }
        } else if (lhlVar6 != null) {
            zct zctVarH8 = xpl1.h(lhlVar5);
            if (zctVarH8 != null) {
                xpl1.b(zctVar3, zctVarH8, this.b.R[2].e());
                c(zctVar2, zctVar3, 1, d5uVar);
                if (this.b.F) {
                    c(zctVar, zctVar3, 1, this.l);
                }
                if (this.d == bjlVar3) {
                    cjl cjlVar19 = this.b;
                    if (cjlVar19.Y > 0.0f) {
                        ur60 ur60Var = cjlVar19.d;
                        if (ur60Var.d == bjlVar3) {
                            ur60Var.e.k.add(d5uVar);
                            arrayList2.add(this.b.d.e);
                            d5uVar.a = this;
                        }
                    }
                }
            }
        } else {
            lhl lhlVar7 = lhlVarArr2[3];
            if (lhlVar7.f != null) {
                zct zctVarH9 = xpl1.h(lhlVar7);
                if (zctVarH9 != null) {
                    xpl1.b(zctVar2, zctVarH9, -this.b.R[3].e());
                    c(zctVar3, zctVar2, -1, d5uVar);
                    if (this.b.F) {
                        c(zctVar, zctVar3, 1, this.l);
                    }
                }
            } else {
                lhl lhlVar8 = lhlVarArr2[4];
                if (lhlVar8.f != null) {
                    zct zctVarH10 = xpl1.h(lhlVar8);
                    if (zctVarH10 != null) {
                        xpl1.b(zctVar, zctVarH10, 0);
                        c(zctVar3, zctVar, -1, this.l);
                        c(zctVar2, zctVar3, 1, d5uVar);
                    }
                } else if (!(cjlVar17 instanceof l660) && (cjlVar3 = cjlVar17.V) != null) {
                    xpl1.b(zctVar3, cjlVar3.e.h, cjlVar17.u());
                    c(zctVar2, zctVar3, 1, d5uVar);
                    if (this.b.F) {
                        c(zctVar, zctVar3, 1, this.l);
                    }
                    if (this.d == bjlVar3) {
                        cjl cjlVar20 = this.b;
                        if (cjlVar20.Y > 0.0f) {
                            ur60 ur60Var2 = cjlVar20.d;
                            if (ur60Var2.d == bjlVar3) {
                                ur60Var2.e.k.add(d5uVar);
                                arrayList2.add(this.b.d.e);
                                d5uVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            d5uVar.c = true;
        }
    }

    @Override // p.xpl1
    public final void e() {
        zct zctVar = this.h;
        if (zctVar.j) {
            this.b.b0 = zctVar.g;
        }
    }

    @Override // p.xpl1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // p.xpl1
    public final boolean k() {
        return this.d != bjl.c || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        zct zctVar = this.h;
        zctVar.c();
        zctVar.j = false;
        zct zctVar2 = this.i;
        zctVar2.c();
        zctVar2.j = false;
        zct zctVar3 = this.k;
        zctVar3.c();
        zctVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}
