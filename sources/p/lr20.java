package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lr20 {
    public int a;
    public lhl d;
    public lhl e;
    public lhl f;
    public lhl g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ nr20 r;
    public cjl b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f89p = 0;

    public lr20(nr20 nr20Var, int i, lhl lhlVar, lhl lhlVar2, lhl lhlVar3, lhl lhlVar4, int i2) {
        this.r = nr20Var;
        this.a = i;
        this.d = lhlVar;
        this.e = lhlVar2;
        this.f = lhlVar3;
        this.g = lhlVar4;
        this.h = ((ljk1) nr20Var).A0;
        this.i = ((ljk1) nr20Var).w0;
        this.j = ((ljk1) nr20Var).B0;
        this.k = ((ljk1) nr20Var).x0;
        this.q = i2;
    }

    public final void b(cjl cjlVar) {
        int i = this.a;
        int i2 = this.q;
        bjl bjlVar = bjl.c;
        nr20 nr20Var = this.r;
        if (i == 0) {
            int iC0 = nr20Var.c0(cjlVar, i2);
            if (cjlVar.U[0] == bjlVar) {
                this.f89p++;
                iC0 = 0;
            }
            this.l = iC0 + (cjlVar.i0 != 8 ? nr20Var.T0 : 0) + this.l;
            int iB0 = nr20Var.b0(cjlVar, this.q);
            if (this.b == null || this.c < iB0) {
                this.b = cjlVar;
                this.c = iB0;
                this.m = iB0;
            }
        } else {
            int iC1 = nr20Var.c0(cjlVar, i2);
            int iB1 = nr20Var.b0(cjlVar, this.q);
            if (cjlVar.U[1] == bjlVar) {
                this.f89p++;
                iB1 = 0;
            }
            this.m = iB1 + (cjlVar.i0 != 8 ? nr20Var.U0 : 0) + this.m;
            if (this.b == null || this.c < iC1) {
                this.b = cjlVar;
                this.c = iC1;
                this.l = iC1;
            }
        }
        this.o++;
    }

    public final void c() {
        this.c = 0;
        this.b = null;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.f89p = 0;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
      0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d(int i, boolean z, boolean z2) {
        nr20 nr20Var;
        int i2;
        int i3;
        cjl cjlVar;
        boolean z3;
        char c;
        int i4;
        float f;
        int i5;
        int i6 = this.o;
        int i7 = 0;
        while (true) {
            nr20Var = this.r;
            if (i7 >= i6 || (i5 = this.n + i7) >= nr20Var.f1) {
                break;
            }
            cjl cjlVar2 = nr20Var.e1[i5];
            if (cjlVar2 != null) {
                cjlVar2.F();
            }
            i7++;
        }
        if (i6 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= nr20Var.f1) {
                break;
            }
            cjl cjlVar3 = nr20Var.e1[i11];
            if (cjlVar3 != null && cjlVar3.i0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.a;
        cjl cjlVar4 = this.b;
        if (i12 == 0) {
            cjlVar4.m0 = nr20Var.I0;
            lhl lhlVar = cjlVar4.M;
            lhl lhlVar2 = cjlVar4.K;
            int i13 = this.i;
            if (i > 0) {
                i13 += nr20Var.U0;
            }
            lhlVar2.a(this.e, i13);
            if (z2) {
                lhlVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(lhlVar2, 0);
            }
            if (nr20Var.W0 != 3 || cjlVar4.F) {
                cjlVar = cjlVar4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.n + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < nr20Var.f1) {
                        cjlVar = nr20Var.e1[i15];
                        if (cjlVar.F) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                cjlVar = cjlVar4;
                break;
            }
            int i16 = 0;
            cjl cjlVar5 = null;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.n + i17;
                if (i18 >= nr20Var.f1) {
                    return;
                }
                cjl cjlVar6 = nr20Var.e1[i18];
                if (cjlVar6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    lhl lhlVar3 = cjlVar6.K;
                    lhl lhlVar4 = cjlVar6.M;
                    lhl lhlVar5 = cjlVar6.J;
                    z3 = z4;
                    if (i16 == 0) {
                        cjlVar6.g(lhlVar5, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i19 = nr20Var.H0;
                        float f2 = nr20Var.N0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.n == 0 && (i4 = nr20Var.J0) != -1) {
                            f = nr20Var.P0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = nr20Var.L0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = nr20Var.R0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        cjlVar6.l0 = i4;
                        cjlVar6.f0 = f;
                    }
                    if (i16 == i6 - 1) {
                        cjlVar6.g(cjlVar6.L, this.f, this.j);
                    }
                    if (cjlVar5 != null) {
                        lhl lhlVar6 = cjlVar5.L;
                        lhlVar5.a(lhlVar6, nr20Var.T0);
                        if (i16 == i8) {
                            int i20 = this.h;
                            if (lhlVar5.h()) {
                                lhlVar5.h = i20;
                            }
                        }
                        lhlVar6.a(lhlVar5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.j;
                            if (lhlVar6.h()) {
                                lhlVar6.h = i21;
                            }
                        }
                    }
                    if (cjlVar6 != cjlVar4) {
                        int i22 = nr20Var.W0;
                        c = 3;
                        if (i22 == 3 && cjlVar.F && cjlVar6 != cjlVar && cjlVar6.F) {
                            cjlVar6.N.a(cjlVar.N, 0);
                        } else if (i22 == 0) {
                            lhlVar3.a(lhlVar2, 0);
                        } else if (i22 == 1) {
                            lhlVar4.a(lhlVar, 0);
                        } else if (z3) {
                            lhlVar3.a(this.e, this.i);
                            lhlVar4.a(this.g, this.k);
                        } else {
                            lhlVar3.a(lhlVar2, 0);
                            lhlVar4.a(lhlVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    cjlVar5 = cjlVar6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        cjlVar4.l0 = nr20Var.H0;
        lhl lhlVar7 = cjlVar4.J;
        lhl lhlVar8 = cjlVar4.L;
        int i25 = this.h;
        if (i > 0) {
            i25 += nr20Var.T0;
        }
        if (z) {
            lhlVar8.a(this.f, i25);
            if (z2) {
                lhlVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.J.a(lhlVar8, 0);
            }
        } else {
            lhlVar7.a(this.d, i25);
            if (z2) {
                lhlVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.L.a(lhlVar7, 0);
            }
        }
        int i26 = 0;
        cjl cjlVar7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.n + i26) >= nr20Var.f1) {
                return;
            }
            cjl cjlVar8 = nr20Var.e1[i2];
            if (cjlVar8 == null) {
                i23 = i27;
            } else {
                lhl lhlVar9 = cjlVar8.J;
                lhl lhlVar10 = cjlVar8.K;
                lhl lhlVar11 = cjlVar8.L;
                if (i26 == 0) {
                    cjlVar8.g(lhlVar10, this.e, this.i);
                    int i28 = nr20Var.I0;
                    float f3 = nr20Var.O0;
                    if (this.n == 0) {
                        int i29 = nr20Var.K0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = nr20Var.Q0;
                        }
                        i28 = i29;
                        cjlVar8.m0 = i28;
                        cjlVar8.g0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = nr20Var.M0) != i3) {
                        f3 = nr20Var.S0;
                        i28 = i29;
                    }
                    cjlVar8.m0 = i28;
                    cjlVar8.g0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    cjlVar8.g(cjlVar8.M, this.g, this.k);
                }
                if (cjlVar7 != null) {
                    lhl lhlVar12 = cjlVar7.M;
                    lhlVar10.a(lhlVar12, nr20Var.U0);
                    if (i26 == i8) {
                        int i30 = this.i;
                        if (lhlVar10.h()) {
                            lhlVar10.h = i30;
                        }
                    }
                    lhlVar12.a(lhlVar10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.k;
                        if (lhlVar12.h()) {
                            lhlVar12.h = i31;
                        }
                    }
                }
                if (cjlVar8 != cjlVar4) {
                    int i32 = nr20Var.V0;
                    if (z) {
                        if (i32 == 0) {
                            lhlVar11.a(lhlVar8, 0);
                        } else if (i32 == 1) {
                            lhlVar9.a(lhlVar7, 0);
                        } else if (i32 == 2) {
                            lhlVar9.a(lhlVar7, 0);
                            lhlVar11.a(lhlVar8, 0);
                        }
                    } else if (i32 == 0) {
                        lhlVar9.a(lhlVar7, 0);
                    } else if (i32 == 1) {
                        lhlVar11.a(lhlVar8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            lhlVar9.a(this.d, this.h);
                            lhlVar11.a(this.f, this.j);
                        } else {
                            lhlVar9.a(lhlVar7, 0);
                            lhlVar11.a(lhlVar8, 0);
                        }
                    }
                }
                cjlVar7 = cjlVar8;
            }
            i26++;
        }
    }

    public final int e() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.U0 : i2;
    }

    public final int f() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.T0 : i2;
    }

    public final void g(int i) {
        nr20 nr20Var;
        int i2;
        int i3 = this.f89p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            nr20Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= nr20Var.f1) {
                break;
            }
            cjl cjlVar = nr20Var.e1[i2];
            int i7 = this.a;
            bjl bjlVar = bjl.a;
            bjl bjlVar2 = bjl.c;
            if (i7 == 0) {
                if (cjlVar != null) {
                    bjl[] bjlVarArr = cjlVar.U;
                    if (bjlVarArr[0] == bjlVar2 && cjlVar.s == 0) {
                        nr20Var.a0(cjlVar, bjlVar, i5, bjlVarArr[1], cjlVar.m());
                    }
                }
            } else if (cjlVar != null) {
                bjl[] bjlVarArr2 = cjlVar.U;
                if (bjlVarArr2[1] == bjlVar2 && cjlVar.t == 0) {
                    int i8 = i5;
                    nr20Var.a0(cjlVar, bjlVarArr2[0], cjlVar.s(), bjlVar, i8);
                    i5 = i8;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i9 = this.o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.n + i10;
            if (i11 >= nr20Var.f1) {
                return;
            }
            cjl cjlVar2 = nr20Var.e1[i11];
            if (this.a == 0) {
                int iS = cjlVar2.s();
                int i12 = nr20Var.T0;
                if (cjlVar2.i0 == 8) {
                    i12 = 0;
                }
                this.l = iS + i12 + this.l;
                int iB0 = nr20Var.b0(cjlVar2, this.q);
                if (this.b == null || this.c < iB0) {
                    this.b = cjlVar2;
                    this.c = iB0;
                    this.m = iB0;
                }
            } else {
                int iC0 = nr20Var.c0(cjlVar2, this.q);
                int iB1 = nr20Var.b0(cjlVar2, this.q);
                int i13 = nr20Var.U0;
                if (cjlVar2.i0 == 8) {
                    i13 = 0;
                }
                this.m = iB1 + i13 + this.m;
                if (this.b == null || this.c < iC0) {
                    this.b = cjlVar2;
                    this.c = iC0;
                    this.l = iC0;
                }
            }
        }
    }

    public final void h(int i) {
        this.n = i;
    }

    public final void i(int i, lhl lhlVar, lhl lhlVar2, lhl lhlVar3, lhl lhlVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = lhlVar;
        this.e = lhlVar2;
        this.f = lhlVar3;
        this.g = lhlVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
