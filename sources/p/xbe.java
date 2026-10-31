package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xbe extends xpl1 {
    public final ArrayList k;
    public int l;

    public xbe(cjl cjlVar, int i) {
        cjl cjlVar2;
        super(cjlVar);
        ArrayList<xpl1> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        cjl cjlVar3 = this.b;
        cjl cjlVarO = cjlVar3.o(i);
        while (true) {
            cjlVar2 = cjlVar3;
            cjlVar3 = cjlVarO;
            if (cjlVar3 == null) {
                break;
            } else {
                cjlVarO = cjlVar3.o(this.f);
            }
        }
        this.b = cjlVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? cjlVar2.d : i2 == 1 ? cjlVar2.e : null);
        cjl cjlVarN = cjlVar2.n(this.f);
        while (cjlVarN != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? cjlVarN.d : i3 == 1 ? cjlVarN.e : null);
            cjlVarN = cjlVarN.n(this.f);
        }
        for (xpl1 xpl1Var : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                xpl1Var.b.b = this;
            } else if (i4 == 1) {
                xpl1Var.b.c = this;
            }
        }
        if (this.f == 0 && ((djl) this.b.V).z0 && arrayList.size() > 1) {
            this.b = ((xpl1) l1d.i(1, arrayList)).b;
        }
        int i5 = this.f;
        cjl cjlVar4 = this.b;
        this.l = i5 == 0 ? cjlVar4.l0 : cjlVar4.m0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6 A[ADDED_TO_REGION] */
    @Override // p.xct
    public final void a(xct xctVar) {
        int i;
        int i2;
        bjl bjlVar;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        zct zctVar = this.h;
        if (zctVar.j) {
            zct zctVar2 = this.i;
            if (zctVar2.j) {
                cjl cjlVar = this.b.V;
                boolean z2 = cjlVar instanceof djl ? ((djl) cjlVar).z0 : false;
                int i13 = zctVar2.g - zctVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((xpl1) arrayList.get(i14)).b.i0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((xpl1) arrayList.get(i16)).b.i0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    bjlVar = bjl.c;
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        xpl1 xpl1Var = (xpl1) arrayList.get(i18);
                        boolean z3 = z2;
                        cjl cjlVar2 = xpl1Var.b;
                        int i21 = i17;
                        if (cjlVar2.i0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += xpl1Var.h.f;
                            }
                            d5u d5uVar = xpl1Var.e;
                            int i22 = d5uVar.g;
                            boolean z4 = xpl1Var.d != bjlVar;
                            if (z4) {
                                int i23 = this.f;
                                if (i23 == 0 && !cjlVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !cjlVar2.e.e.j) {
                                    return;
                                } else {
                                    i11 = i5;
                                }
                            } else {
                                i11 = i5;
                                if (xpl1Var.a == 1 && i21 == 0) {
                                    i12 = d5uVar.m;
                                    i19++;
                                } else {
                                    if (d5uVar.j) {
                                        i12 = i22;
                                    }
                                    if (z4) {
                                        i5 = i11 + i12;
                                    } else {
                                        i19++;
                                        f3 = cjlVar2.n0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i5 = i11;
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -xpl1Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = cjlVar2.n0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i11;
                                } else {
                                    i5 = i11 + i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i22;
                            if (z4) {
                                i19++;
                                f3 = cjlVar2.n0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i5 = i11;
                            } else {
                                i5 = i11 + i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i21;
                        i2 = 8;
                    }
                    z = z2;
                    int i24 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i24 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i25 = zctVar.g;
                if (z) {
                    i25 = zctVar2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i25 = z ? i25 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        xpl1 xpl1Var2 = (xpl1) arrayList.get(i27);
                        int i29 = i25;
                        cjl cjlVar3 = xpl1Var2.b;
                        int i30 = i3;
                        d5u d5uVar2 = xpl1Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (cjlVar3.i0 != 8 && xpl1Var2.d == bjlVar && !d5uVar2.j) {
                            int i32 = f > 0.0f ? (int) (((cjlVar3.n0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = cjlVar3.w;
                                i10 = cjlVar3.v;
                            } else {
                                i9 = cjlVar3.z;
                                i10 = cjlVar3.y;
                            }
                            int iMax = Math.max(i10, xpl1Var2.a == 1 ? Math.min(i32, d5uVar2.m) : i32);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i32) {
                                i28++;
                                i32 = iMax;
                            }
                            d5uVar2.d(i32);
                        }
                        i27++;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            xpl1 xpl1Var3 = (xpl1) arrayList.get(i34);
                            if (xpl1Var3.b.i0 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i5 += xpl1Var3.h.f;
                                }
                                i5 += xpl1Var3.e.g;
                                if (i34 < i15 && i34 < i) {
                                    i5 += -xpl1Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        xpl1 xpl1Var4 = (xpl1) arrayList.get(z ? size - (i38 + 1) : i38);
                        cjl cjlVar4 = xpl1Var4.b;
                        zct zctVar3 = xpl1Var4.i;
                        zct zctVar4 = xpl1Var4.h;
                        if (cjlVar4.i0 == 8) {
                            zctVar4.d(i37);
                            zctVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - zctVar4.f : i37 + zctVar4.f;
                            }
                            if (z) {
                                zctVar3.d(i37);
                            } else {
                                zctVar4.d(i37);
                            }
                            d5u d5uVar3 = xpl1Var4.e;
                            int i39 = d5uVar3.g;
                            if (xpl1Var4.d == bjlVar && xpl1Var4.a == 1) {
                                i39 = d5uVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                zctVar4.d(i37);
                            } else {
                                zctVar3.d(i37);
                            }
                            xpl1Var4.g = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-zctVar3.f) : i37 + (-zctVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        xpl1 xpl1Var5 = (xpl1) arrayList.get(z ? size - (i42 + 1) : i42);
                        cjl cjlVar5 = xpl1Var5.b;
                        zct zctVar5 = xpl1Var5.i;
                        zct zctVar6 = xpl1Var5.h;
                        if (cjlVar5.i0 == 8) {
                            zctVar6.d(i41);
                            zctVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - zctVar6.f : i43 + zctVar6.f;
                            }
                            if (z) {
                                zctVar5.d(i43);
                            } else {
                                zctVar6.d(i43);
                            }
                            d5u d5uVar4 = xpl1Var5.e;
                            int iMin = d5uVar4.g;
                            if (xpl1Var5.d == bjlVar && xpl1Var5.a == 1) {
                                iMin = Math.min(iMin, d5uVar4.m);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                zctVar6.d(i41);
                            } else {
                                zctVar5.d(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-zctVar5.f) : i41 + (-zctVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i44 = this.f;
                    cjl cjlVar6 = this.b;
                    float f8 = i44 == 0 ? cjlVar6.f0 : cjlVar6.g0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i45 = (int) (((i13 - i5) * f8) + f2);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        xpl1 xpl1Var6 = (xpl1) arrayList.get(z ? size - (i47 + 1) : i47);
                        cjl cjlVar7 = xpl1Var6.b;
                        zct zctVar7 = xpl1Var6.i;
                        zct zctVar8 = xpl1Var6.h;
                        if (cjlVar7.i0 == 8) {
                            zctVar8.d(i46);
                            zctVar7.d(i46);
                        } else {
                            if (i47 > 0 && i47 >= i14) {
                                i46 = z ? i46 - zctVar8.f : i46 + zctVar8.f;
                            }
                            if (z) {
                                zctVar7.d(i46);
                            } else {
                                zctVar8.d(i46);
                            }
                            d5u d5uVar5 = xpl1Var6.e;
                            int i48 = d5uVar5.g;
                            if (xpl1Var6.d == bjlVar && xpl1Var6.a == 1) {
                                i48 = d5uVar5.m;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                zctVar8.d(i46);
                            } else {
                                zctVar7.d(i46);
                            }
                            if (i47 < i15 && i47 < i) {
                                i46 = z ? i46 - (-zctVar7.f) : i46 + (-zctVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p.xpl1
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xpl1) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        cjl cjlVar = ((xpl1) arrayList.get(0)).b;
        cjl cjlVar2 = ((xpl1) arrayList.get(size - 1)).b;
        int i = this.f;
        zct zctVar = this.i;
        zct zctVar2 = this.h;
        if (i == 0) {
            lhl lhlVar = cjlVar.J;
            lhl lhlVar2 = cjlVar2.L;
            zct zctVarI = xpl1.i(lhlVar, 0);
            int iE = lhlVar.e();
            cjl cjlVarM = m();
            if (cjlVarM != null) {
                iE = cjlVarM.J.e();
            }
            if (zctVarI != null) {
                xpl1.b(zctVar2, zctVarI, iE);
            }
            zct zctVarI2 = xpl1.i(lhlVar2, 0);
            int iE2 = lhlVar2.e();
            cjl cjlVarN = n();
            if (cjlVarN != null) {
                iE2 = cjlVarN.L.e();
            }
            if (zctVarI2 != null) {
                xpl1.b(zctVar, zctVarI2, -iE2);
            }
        } else {
            lhl lhlVar3 = cjlVar.K;
            lhl lhlVar4 = cjlVar2.M;
            zct zctVarI3 = xpl1.i(lhlVar3, 1);
            int iE3 = lhlVar3.e();
            cjl cjlVarM2 = m();
            if (cjlVarM2 != null) {
                iE3 = cjlVarM2.K.e();
            }
            if (zctVarI3 != null) {
                xpl1.b(zctVar2, zctVarI3, iE3);
            }
            zct zctVarI4 = xpl1.i(lhlVar4, 1);
            int iE4 = lhlVar4.e();
            cjl cjlVarN2 = n();
            if (cjlVarN2 != null) {
                iE4 = cjlVarN2.M.e();
            }
            if (zctVarI4 != null) {
                xpl1.b(zctVar, zctVarI4, -iE4);
            }
        }
        zctVar2.a = this;
        zctVar.a = this;
    }

    @Override // p.xpl1
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((xpl1) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // p.xpl1
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((xpl1) it.next()).f();
        }
    }

    @Override // p.xpl1
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            xpl1 xpl1Var = (xpl1) arrayList.get(i);
            j = ((long) xpl1Var.i.f) + xpl1Var.j() + j + ((long) xpl1Var.h.f);
        }
        return j;
    }

    @Override // p.xpl1
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((xpl1) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final cjl m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            cjl cjlVar = ((xpl1) arrayList.get(i)).b;
            if (cjlVar.i0 != 8) {
                return cjlVar;
            }
            i++;
        }
    }

    public final cjl n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cjl cjlVar = ((xpl1) arrayList.get(size)).b;
            if (cjlVar.i0 != 8) {
                return cjlVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (xpl1 xpl1Var : this.k) {
            sb.append("<");
            sb.append(xpl1Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
