package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nr20 extends ljk1 {
    public cjl[] e1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 2;
    public int W0 = 2;
    public int X0 = 0;
    public int Y0 = -1;
    public int Z0 = 0;
    public final ArrayList a1 = new ArrayList();
    public cjl[] b1 = null;
    public cjl[] c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX WARN: Code duplicated, block: B:400:0x06de  */
    /* JADX WARN: Code duplicated, block: B:401:0x06e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:403:0x06ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:405:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:408:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:409:0x0700  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.ljk1
    public final void Z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        cjl[] cjlVarArr;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        lr20 lr20Var;
        char c;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        int iCeil;
        Object obj;
        cjl cjlVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.v0;
        bjl bjlVar = bjl.c;
        bjl bjlVar2 = bjl.b;
        if (i19 > 0) {
            cjl cjlVar2 = this.V;
            vda vdaVar = cjlVar2 != null ? ((djl) cjlVar2).y0 : null;
            if (vdaVar == null) {
                this.D0 = 0;
                this.E0 = 0;
                this.C0 = false;
                return;
            }
            for (int i20 = 0; i20 < this.v0; i20++) {
                cjl cjlVar3 = this.u0[i20];
                if (cjlVar3 != null && !(cjlVar3 instanceof tq50)) {
                    bjl bjlVarL = cjlVar3.l(0);
                    bjl bjlVarL2 = cjlVar3.l(1);
                    if (bjlVarL != bjlVar || cjlVar3.s == 1 || bjlVarL2 != bjlVar || cjlVar3.t == 1) {
                        if (bjlVarL == bjlVar) {
                            bjlVarL = bjlVar2;
                        }
                        if (bjlVarL2 == bjlVar) {
                            bjlVarL2 = bjlVar2;
                        }
                        uda udaVar = this.F0;
                        udaVar.a = bjlVarL;
                        udaVar.b = bjlVarL2;
                        udaVar.c = cjlVar3.s();
                        udaVar.d = cjlVar3.m();
                        vdaVar.b(cjlVar3, udaVar);
                        cjlVar3.T(udaVar.e);
                        cjlVar3.O(udaVar.f);
                        cjlVar3.K(udaVar.g);
                    }
                }
            }
        }
        int i21 = this.A0;
        int i22 = this.B0;
        int i23 = this.w0;
        int i24 = this.x0;
        int[] iArr2 = new int[2];
        int i25 = (i2 - i21) - i22;
        int i26 = this.Z0;
        if (i26 == 1) {
            i25 = (i4 - i23) - i24;
        }
        int i27 = i25;
        int i28 = this.H0;
        if (i26 == 0) {
            if (i28 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        } else {
            if (i28 == -1) {
                this.H0 = 0;
            }
            if (this.I0 == -1) {
                this.I0 = 0;
            }
        }
        cjl[] cjlVarArr2 = this.u0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i5 = this.v0;
            i6 = i21;
            if (i29 >= i5) {
                break;
            }
            if (this.u0[i29].i0 == 8) {
                i30++;
            }
            i29++;
            i21 = i6;
        }
        if (i30 > 0) {
            cjl[] cjlVarArr3 = new cjl[i5 - i30];
            int i32 = 0;
            int i33 = 0;
            while (i32 < this.v0) {
                cjl cjlVar4 = this.u0[i32];
                cjl[] cjlVarArr4 = cjlVarArr3;
                if (cjlVar4.i0 != 8) {
                    cjlVarArr4[i33] = cjlVar4;
                    i33++;
                }
                i32++;
                cjlVarArr3 = cjlVarArr4;
            }
            i5 = i33;
            cjlVarArr = cjlVarArr3;
        } else {
            cjlVarArr = cjlVarArr2;
        }
        this.e1 = cjlVarArr;
        this.f1 = i5;
        int i34 = this.X0;
        ArrayList arrayList = this.a1;
        if (i34 != 0) {
            lhl lhlVar = this.K;
            lhl lhlVar2 = this.J;
            lhl lhlVar3 = this.L;
            lhl lhlVar4 = this.M;
            if (i34 == 1) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i6;
                int i35 = this.Z0;
                if (i5 != 0) {
                    arrayList.clear();
                    lr20 lr20Var2 = new lr20(this, i35, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(lr20Var2);
                    if (i35 == 0) {
                        i12 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (i37 < i5) {
                            cjl cjlVar5 = cjlVarArr[i37];
                            int iC0 = c0(cjlVar5, i27);
                            if (cjlVar5.U[0] == bjlVar) {
                                i12++;
                            }
                            int i38 = i12;
                            boolean z2 = (i36 == i27 || (this.T0 + i36) + iC0 > i27) && lr20.a(lr20Var2) != null;
                            if (!z2 && i37 > 0 && (i14 = this.Y0) > 0 && i37 % i14 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                lr20Var2 = new lr20(this, i35, this.J, this.K, this.L, this.M, i27);
                                lr20Var2.h(i37);
                                arrayList.add(lr20Var2);
                            } else {
                                if (i37 > 0) {
                                    i36 = this.T0 + iC0 + i36;
                                }
                                lr20Var2.b(cjlVar5);
                                i37++;
                                i12 = i38;
                            }
                            i36 = iC0;
                            lr20Var2.b(cjlVar5);
                            i37++;
                            i12 = i38;
                        }
                    } else {
                        i12 = 0;
                        int i39 = 0;
                        int i40 = 0;
                        while (i40 < i5) {
                            cjl cjlVar6 = cjlVarArr[i40];
                            int iB0 = b0(cjlVar6, i27);
                            if (cjlVar6.U[1] == bjlVar) {
                                i12++;
                            }
                            int i41 = i12;
                            boolean z3 = (i39 == i27 || (this.U0 + i39) + iB0 > i27) && lr20.a(lr20Var2) != null;
                            if (!z3 && i40 > 0 && (i13 = this.Y0) > 0 && i40 % i13 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                lr20Var2 = new lr20(this, i35, this.J, this.K, this.L, this.M, i27);
                                lr20Var2.h(i40);
                                arrayList.add(lr20Var2);
                            } else {
                                if (i40 > 0) {
                                    i39 = this.U0 + iB0 + i39;
                                }
                                lr20Var2.b(cjlVar6);
                                i40++;
                                i12 = i41;
                            }
                            i39 = iB0;
                            lr20Var2.b(cjlVar6);
                            i40++;
                            i12 = i41;
                        }
                    }
                    int size = arrayList.size();
                    int i42 = this.A0;
                    int i43 = this.w0;
                    int i44 = this.B0;
                    int i45 = this.x0;
                    bjl[] bjlVarArr = this.U;
                    boolean z4 = bjlVarArr[0] == bjlVar2 || bjlVarArr[1] == bjlVar2;
                    if (i12 > 0 && z4) {
                        for (int i46 = 0; i46 < size; i46++) {
                            lr20 lr20Var3 = (lr20) arrayList.get(i46);
                            if (i35 == 0) {
                                lr20Var3.g(i27 - lr20Var3.f());
                            } else {
                                lr20Var3.g(i27 - lr20Var3.e());
                            }
                        }
                    }
                    int i47 = i42;
                    int i48 = i43;
                    int i49 = i44;
                    int i50 = i45;
                    lhl lhlVar5 = lhlVar;
                    lhl lhlVar6 = lhlVar2;
                    int iMax = 0;
                    int i51 = 0;
                    lhl lhlVar7 = lhlVar3;
                    lhl lhlVar8 = lhlVar4;
                    for (int i52 = 0; i52 < size; i52++) {
                        lr20 lr20Var4 = (lr20) arrayList.get(i52);
                        if (i35 == 0) {
                            if (i52 < size - 1) {
                                lhlVar8 = lr20.a((lr20) arrayList.get(i52 + 1)).K;
                                i50 = 0;
                            } else {
                                i50 = this.x0;
                                lhlVar8 = lhlVar4;
                            }
                            lhl lhlVar9 = lr20.a(lr20Var4).M;
                            lr20Var4.i(i35, lhlVar6, lhlVar5, lhlVar7, lhlVar8, i47, i48, i49, i50, i27);
                            iMax = Math.max(iMax, lr20Var4.f());
                            int iE = lr20Var4.e() + i51;
                            if (i52 > 0) {
                                iE += this.U0;
                            }
                            lhlVar5 = lhlVar9;
                            i51 = iE;
                            i48 = 0;
                        } else {
                            if (i52 < size - 1) {
                                lhlVar7 = lr20.a((lr20) arrayList.get(i52 + 1)).J;
                                i49 = 0;
                            } else {
                                i49 = this.B0;
                                lhlVar7 = lhlVar3;
                            }
                            lhl lhlVar10 = lr20.a(lr20Var4).L;
                            lr20Var4.i(i35, lhlVar6, lhlVar5, lhlVar7, lhlVar8, i47, i48, i49, i50, i27);
                            int iF = lr20Var4.f() + iMax;
                            int iMax2 = Math.max(i51, lr20Var4.e());
                            if (i52 > 0) {
                                iF += this.T0;
                            }
                            i51 = iMax2;
                            lhlVar6 = lhlVar10;
                            iMax = iF;
                            i47 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i51;
                }
            } else if (i34 == 2) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i6;
                int i53 = this.Z0;
                int iCeil2 = this.Y0;
                if (i53 == 0) {
                    if (iCeil2 <= 0) {
                        int i54 = 0;
                        iCeil = 0;
                        for (int i55 = 0; i55 < i5; i55++) {
                            if (i55 > 0) {
                                i54 += this.T0;
                            }
                            cjl cjlVar7 = cjlVarArr[i55];
                            if (cjlVar7 != null) {
                                int iC1 = c0(cjlVar7, i27) + i54;
                                if (iC1 > i27) {
                                    break;
                                }
                                iCeil++;
                                i54 = iC1;
                            }
                        }
                    } else {
                        iCeil = iCeil2;
                    }
                    iCeil2 = 0;
                } else {
                    if (iCeil2 <= 0) {
                        int i56 = 0;
                        int i57 = 0;
                        for (int i58 = 0; i58 < i5; i58++) {
                            if (i58 > 0) {
                                i56 += this.U0;
                            }
                            cjl cjlVar8 = cjlVarArr[i58];
                            if (cjlVar8 != null) {
                                int iB1 = b0(cjlVar8, i27) + i56;
                                if (iB1 > i27) {
                                    break;
                                }
                                i57++;
                                i56 = iB1;
                            }
                        }
                        iCeil2 = i57;
                    }
                    iCeil = 0;
                }
                if (this.d1 == null) {
                    this.d1 = new int[2];
                }
                boolean z5 = (iCeil2 == 0 && i53 == 1) || (iCeil == 0 && i53 == 0);
                while (!z5) {
                    if (i53 == 0) {
                        iCeil2 = (int) Math.ceil(i5 / iCeil);
                    } else {
                        iCeil = (int) Math.ceil(i5 / iCeil2);
                    }
                    cjl[] cjlVarArr5 = this.c1;
                    if (cjlVarArr5 == null || cjlVarArr5.length < iCeil) {
                        obj = null;
                        this.c1 = new cjl[iCeil];
                    } else {
                        obj = null;
                        Arrays.fill(cjlVarArr5, (Object) null);
                    }
                    cjl[] cjlVarArr6 = this.b1;
                    if (cjlVarArr6 == null || cjlVarArr6.length < iCeil2) {
                        this.b1 = new cjl[iCeil2];
                    } else {
                        Arrays.fill(cjlVarArr6, obj);
                    }
                    for (int i59 = 0; i59 < iCeil; i59++) {
                        for (int i60 = 0; i60 < iCeil2; i60++) {
                            int i61 = (i60 * iCeil) + i59;
                            if (i53 == 1) {
                                i61 = (i59 * iCeil2) + i60;
                            }
                            if (i61 < cjlVarArr.length && (cjlVar = cjlVarArr[i61]) != null) {
                                int iC2 = c0(cjlVar, i27);
                                cjl cjlVar9 = this.c1[i59];
                                if (cjlVar9 == null || cjlVar9.s() < iC2) {
                                    this.c1[i59] = cjlVar;
                                }
                                int iB2 = b0(cjlVar, i27);
                                cjl cjlVar10 = this.b1[i60];
                                if (cjlVar10 == null || cjlVar10.m() < iB2) {
                                    this.b1[i60] = cjlVar;
                                }
                            }
                        }
                    }
                    int iC3 = 0;
                    for (int i62 = 0; i62 < iCeil; i62++) {
                        cjl cjlVar11 = this.c1[i62];
                        if (cjlVar11 != null) {
                            if (i62 > 0) {
                                iC3 += this.T0;
                            }
                            iC3 = c0(cjlVar11, i27) + iC3;
                        }
                    }
                    int iB3 = 0;
                    for (int i63 = 0; i63 < iCeil2; i63++) {
                        cjl cjlVar12 = this.b1[i63];
                        if (cjlVar12 != null) {
                            if (i63 > 0) {
                                iB3 += this.U0;
                            }
                            iB3 = b0(cjlVar12, i27) + iB3;
                        }
                    }
                    iArr[0] = iC3;
                    iArr[1] = iB3;
                    if (i53 == 0) {
                        if (iC3 <= i27 || iCeil <= 1) {
                            z5 = true;
                        } else {
                            iCeil--;
                        }
                    } else if (iB3 <= i27 || iCeil2 <= 1) {
                        z5 = true;
                    } else {
                        iCeil2--;
                    }
                }
                int[] iArr3 = this.d1;
                iArr3[0] = iCeil;
                iArr3[1] = iCeil2;
                c = 1;
            } else if (i34 != 3) {
                i7 = i22;
                i8 = i23;
                i9 = i24;
                iArr = iArr2;
                i10 = i6;
            } else {
                int i64 = this.Z0;
                if (i5 == 0) {
                    i7 = i22;
                    i8 = i23;
                    i9 = i24;
                    iArr = iArr2;
                    i10 = i6;
                } else {
                    arrayList.clear();
                    iArr = iArr2;
                    i9 = i24;
                    i10 = i6;
                    i7 = i22;
                    i8 = i23;
                    lr20 lr20Var5 = new lr20(this, i64, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(lr20Var5);
                    if (i64 == 0) {
                        int i65 = 0;
                        int i66 = 0;
                        i15 = 0;
                        int i67 = 0;
                        while (i65 < i5) {
                            i66++;
                            cjl cjlVar13 = cjlVarArr[i65];
                            int iC4 = c0(cjlVar13, i27);
                            lr20 lr20Var6 = lr20Var5;
                            if (cjlVar13.U[0] == bjlVar) {
                                i15++;
                            }
                            int i68 = i15;
                            boolean z6 = (i67 == i27 || (this.T0 + i67) + iC4 > i27) && lr20.a(lr20Var6) != null;
                            if (!z6 && i65 > 0 && (i18 = this.Y0) > 0 && i66 > i18) {
                                z6 = true;
                            }
                            if (z6) {
                                i17 = i65;
                                lr20Var5 = new lr20(this, i64, this.J, this.K, this.L, this.M, i27);
                                lr20Var5.h(i17);
                                arrayList.add(lr20Var5);
                                i67 = iC4;
                                i66 = 1;
                            } else {
                                i17 = i65;
                                i67 = i17 > 0 ? this.T0 + iC4 + i67 : iC4;
                                lr20Var5 = lr20Var6;
                            }
                            lr20Var5.b(cjlVar13);
                            i65 = i17 + 1;
                            i15 = i68;
                        }
                    } else {
                        int i69 = 0;
                        int i70 = 0;
                        int i71 = 0;
                        int i72 = 0;
                        while (i72 < i5) {
                            i69++;
                            cjl cjlVar14 = cjlVarArr[i72];
                            int iB4 = b0(cjlVar14, i27);
                            if (cjlVar14.U[1] == bjlVar) {
                                i70++;
                            }
                            int i73 = i70;
                            boolean z7 = (i71 == i27 || (this.U0 + i71) + iB4 > i27) && lr20.a(lr20Var5) != null;
                            if (!z7 && i72 > 0 && (i16 = this.Y0) > 0 && i69 > i16) {
                                z7 = true;
                            }
                            if (z7) {
                                lr20Var5 = new lr20(this, i64, this.J, this.K, this.L, this.M, i27);
                                lr20Var5.h(i72);
                                arrayList.add(lr20Var5);
                                i71 = iB4;
                                i69 = 1;
                            } else {
                                i71 = i72 > 0 ? this.U0 + iB4 + i71 : iB4;
                            }
                            lr20Var5.b(cjlVar14);
                            i72++;
                            i70 = i73;
                        }
                        i15 = i70;
                    }
                    int size2 = arrayList.size();
                    int i74 = this.A0;
                    int i75 = this.w0;
                    int i76 = this.B0;
                    int i77 = this.x0;
                    bjl[] bjlVarArr2 = this.U;
                    boolean z8 = bjlVarArr2[0] == bjlVar2 || bjlVarArr2[1] == bjlVar2;
                    if (i15 > 0 && z8) {
                        for (int i78 = 0; i78 < size2; i78++) {
                            lr20 lr20Var7 = (lr20) arrayList.get(i78);
                            if (i64 == 0) {
                                lr20Var7.g(i27 - lr20Var7.f());
                            } else {
                                lr20Var7.g(i27 - lr20Var7.e());
                            }
                        }
                    }
                    int i79 = i74;
                    int i80 = i75;
                    int i81 = i76;
                    int i82 = i77;
                    lhl lhlVar11 = lhlVar;
                    lhl lhlVar12 = lhlVar2;
                    int iMax3 = 0;
                    int i83 = 0;
                    lhl lhlVar13 = lhlVar3;
                    lhl lhlVar14 = lhlVar4;
                    for (int i84 = 0; i84 < size2; i84++) {
                        lr20 lr20Var8 = (lr20) arrayList.get(i84);
                        if (i64 == 0) {
                            if (i84 < size2 - 1) {
                                lhlVar14 = lr20.a((lr20) arrayList.get(i84 + 1)).K;
                                i82 = 0;
                            } else {
                                i82 = this.x0;
                                lhlVar14 = lhlVar4;
                            }
                            lhl lhlVar15 = lr20.a(lr20Var8).M;
                            lr20Var8.i(i64, lhlVar12, lhlVar11, lhlVar13, lhlVar14, i79, i80, i81, i82, i27);
                            iMax3 = Math.max(iMax3, lr20Var8.f());
                            int iE2 = lr20Var8.e() + i83;
                            if (i84 > 0) {
                                iE2 += this.U0;
                            }
                            lhlVar11 = lhlVar15;
                            i83 = iE2;
                            i80 = 0;
                        } else {
                            if (i84 < size2 - 1) {
                                lhlVar13 = lr20.a((lr20) arrayList.get(i84 + 1)).J;
                                i81 = 0;
                            } else {
                                i81 = this.B0;
                                lhlVar13 = lhlVar3;
                            }
                            lhl lhlVar16 = lr20.a(lr20Var8).L;
                            lr20Var8.i(i64, lhlVar12, lhlVar11, lhlVar13, lhlVar14, i79, i80, i81, i82, i27);
                            int iF2 = lr20Var8.f() + iMax3;
                            int iMax4 = Math.max(i83, lr20Var8.e());
                            if (i84 > 0) {
                                iF2 += this.T0;
                            }
                            i83 = iMax4;
                            lhlVar12 = lhlVar16;
                            iMax3 = iF2;
                            i79 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i83;
                }
            }
            c = 1;
        } else {
            i7 = i22;
            i8 = i23;
            i9 = i24;
            iArr = iArr2;
            i10 = i6;
            int i85 = this.Z0;
            if (i5 == 0) {
                c = 1;
            } else {
                if (arrayList.size() == 0) {
                    lr20Var = new lr20(this, i85, this.J, this.K, this.L, this.M, i27);
                    arrayList.add(lr20Var);
                } else {
                    lr20 lr20Var9 = (lr20) arrayList.get(0);
                    lr20Var9.c();
                    lr20Var9.i(i85, this.J, this.K, this.L, this.M, this.A0, this.w0, this.B0, this.x0, i27);
                    lr20Var = lr20Var9;
                }
                for (int i86 = 0; i86 < i5; i86++) {
                    lr20Var.b(cjlVarArr[i86]);
                }
                i31 = 0;
                iArr[0] = lr20Var.f();
                c = 1;
                iArr[1] = lr20Var.e();
            }
        }
        int iMin = iArr[i31] + i10 + i7;
        int iMin2 = iArr[c] + i8 + i9;
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
            } else {
                i11 = i3;
                if (i != 0) {
                    iMin = i31;
                }
            }
            if (i11 == 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i11 != 0) {
                iMin2 = i31;
            }
            this.D0 = iMin;
            this.E0 = iMin2;
            T(iMin);
            O(iMin2);
            if (this.v0 > 0) {
                z = c;
            } else {
                z = i31;
            }
            this.C0 = z;
        }
        iMin = i2;
        i11 = i3;
        if (i11 == 1073741824) {
            iMin2 = i4;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i11 != 0) {
            iMin2 = i31;
        }
        this.D0 = iMin;
        this.E0 = iMin2;
        T(iMin);
        O(iMin2);
        if (this.v0 > 0) {
            z = c;
        } else {
            z = i31;
        }
        this.C0 = z;
    }

    public final int b0(cjl cjlVar, int i) {
        cjl cjlVar2;
        if (cjlVar == null) {
            return 0;
        }
        if (cjlVar.U[1] == bjl.c) {
            int i2 = cjlVar.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (cjlVar.A * i);
                if (i3 != cjlVar.m()) {
                    cjlVar.g = true;
                    a0(cjlVar, cjlVar.U[0], cjlVar.s(), bjl.a, i3);
                }
                return i3;
            }
            cjlVar2 = cjlVar;
            if (i2 == 1) {
                return cjlVar2.m();
            }
            if (i2 == 3) {
                return (int) ((cjlVar2.s() * cjlVar2.Y) + 0.5f);
            }
        } else {
            cjlVar2 = cjlVar;
        }
        return cjlVar2.m();
    }

    @Override // p.cjl
    public final void c(yic0 yic0Var, boolean z) {
        cjl cjlVar;
        float f;
        int i;
        super.c(yic0Var, z);
        cjl cjlVar2 = this.V;
        boolean z2 = cjlVar2 != null && ((djl) cjlVar2).z0;
        int i2 = this.X0;
        ArrayList arrayList = this.a1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((lr20) arrayList.get(i3)).d(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((lr20) arrayList.get(i4)).d(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.d1 != null && this.c1 != null && this.b1 != null) {
                for (int i5 = 0; i5 < this.f1; i5++) {
                    this.e1[i5].F();
                }
                int[] iArr = this.d1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.N0;
                cjl cjlVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.N0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    cjl cjlVar4 = this.c1[i];
                    if (cjlVar4 != null) {
                        lhl lhlVar = cjlVar4.J;
                        if (cjlVar4.i0 != 8) {
                            if (i8 == 0) {
                                cjlVar4.g(lhlVar, this.J, this.A0);
                                cjlVar4.l0 = this.H0;
                                cjlVar4.f0 = f;
                            }
                            if (i8 == i6 - 1) {
                                cjlVar4.g(cjlVar4.L, this.L, this.B0);
                            }
                            if (i8 > 0 && cjlVar3 != null) {
                                lhl lhlVar2 = cjlVar3.L;
                                cjlVar4.g(lhlVar, lhlVar2, this.T0);
                                cjlVar3.g(lhlVar2, lhlVar, 0);
                            }
                            cjlVar3 = cjlVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    cjl cjlVar5 = this.b1[i9];
                    if (cjlVar5 != null) {
                        lhl lhlVar3 = cjlVar5.K;
                        if (cjlVar5.i0 != 8) {
                            if (i9 == 0) {
                                cjlVar5.g(lhlVar3, this.K, this.w0);
                                cjlVar5.m0 = this.I0;
                                cjlVar5.g0 = this.O0;
                            }
                            if (i9 == i7 - 1) {
                                cjlVar5.g(cjlVar5.M, this.M, this.x0);
                            }
                            if (i9 > 0 && cjlVar3 != null) {
                                lhl lhlVar4 = cjlVar3.M;
                                cjlVar5.g(lhlVar3, lhlVar4, this.U0);
                                cjlVar3.g(lhlVar4, lhlVar3, 0);
                            }
                            cjlVar3 = cjlVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.Z0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        cjl[] cjlVarArr = this.e1;
                        if (i12 < cjlVarArr.length && (cjlVar = cjlVarArr[i12]) != null && cjlVar.i0 != 8) {
                            cjl cjlVar6 = this.c1[i10];
                            cjl cjlVar7 = this.b1[i11];
                            if (cjlVar != cjlVar6) {
                                cjlVar.g(cjlVar.J, cjlVar6.J, 0);
                                cjlVar.g(cjlVar.L, cjlVar6.L, 0);
                            }
                            if (cjlVar != cjlVar7) {
                                cjlVar.g(cjlVar.K, cjlVar7.K, 0);
                                cjlVar.g(cjlVar.M, cjlVar7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((lr20) arrayList.get(0)).d(0, z2, true);
        }
        this.C0 = false;
    }

    public final int c0(cjl cjlVar, int i) {
        cjl cjlVar2;
        if (cjlVar == null) {
            return 0;
        }
        if (cjlVar.U[0] == bjl.c) {
            int i2 = cjlVar.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (cjlVar.x * i);
                if (i3 != cjlVar.s()) {
                    cjlVar.g = true;
                    a0(cjlVar, bjl.a, i3, cjlVar.U[1], cjlVar.m());
                }
                return i3;
            }
            cjlVar2 = cjlVar;
            if (i2 == 1) {
                return cjlVar2.s();
            }
            if (i2 == 3) {
                return (int) ((cjlVar2.m() * cjlVar2.Y) + 0.5f);
            }
        } else {
            cjlVar2 = cjlVar;
        }
        return cjlVar2.s();
    }

    @Override // p.l660, p.cjl
    public final void h(cjl cjlVar, HashMap map) {
        super.h(cjlVar, map);
        nr20 nr20Var = (nr20) cjlVar;
        this.H0 = nr20Var.H0;
        this.I0 = nr20Var.I0;
        this.J0 = nr20Var.J0;
        this.K0 = nr20Var.K0;
        this.L0 = nr20Var.L0;
        this.M0 = nr20Var.M0;
        this.N0 = nr20Var.N0;
        this.O0 = nr20Var.O0;
        this.P0 = nr20Var.P0;
        this.Q0 = nr20Var.Q0;
        this.R0 = nr20Var.R0;
        this.S0 = nr20Var.S0;
        this.T0 = nr20Var.T0;
        this.U0 = nr20Var.U0;
        this.V0 = nr20Var.V0;
        this.W0 = nr20Var.W0;
        this.X0 = nr20Var.X0;
        this.Y0 = nr20Var.Y0;
        this.Z0 = nr20Var.Z0;
    }
}
