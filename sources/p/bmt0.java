package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bmt0 implements ylt0 {
    public final wdm a;
    public final e7p0 b;
    public final lag c;
    public final poj0 d;
    public final yzc0 e;

    public bmt0(wdm wdmVar, e7p0 e7p0Var, lag lagVar, poj0 poj0Var, yzc0 yzc0Var) {
        this.a = wdmVar;
        this.b = e7p0Var;
        this.c = lagVar;
        this.d = poj0Var;
        this.e = yzc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p.ylt0
    public final Object a(slt0 slt0Var, ast0 ast0Var, r840 r840Var, y4m y4mVar, tv80 tv80Var, ijk0 ijk0Var, boolean z, onm onmVar) {
        zlt0 zlt0Var;
        zlt0 zlt0Var2;
        tv80 tv80Var2;
        boolean z2;
        ijk0 ijk0Var2;
        tv80 tv80Var3;
        boolean z3;
        ast0 ast0Var2;
        x840 x840Var;
        Object objC;
        tv80 tv80Var4;
        x840 x840Var2;
        boolean z4;
        slt0 slt0Var2 = slt0Var;
        ast0 ast0Var3 = ast0Var;
        boolean z5 = z;
        if (onmVar instanceof zlt0) {
            zlt0Var = (zlt0) onmVar;
            int i = zlt0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlt0Var.i = i - Integer.MIN_VALUE;
            } else {
                zlt0Var = new zlt0(this, onmVar);
            }
        } else {
            zlt0Var = new zlt0(this, onmVar);
        }
        Object objO = zlt0Var.g;
        int i2 = zlt0Var.i;
        e7p0 e7p0Var = this.b;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            if (!(y4mVar instanceof w4m)) {
                if (r840Var instanceof n840) {
                    zlt0Var2 = zlt0Var;
                    if (r840Var instanceof o840) {
                        zlt0Var2.a = slt0Var2;
                        zlt0Var2.b = ast0Var3;
                        zlt0Var2.c = tv80Var;
                        ijk0Var2 = ijk0Var;
                        zlt0Var2.d = ijk0Var2;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 3;
                        objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                        if (objO != obj) {
                            tv80Var3 = tv80Var;
                            x840Var = (x840) objO;
                            if (x840Var instanceof w840) {
                                zlt0Var2.a = null;
                                zlt0Var2.b = null;
                                zlt0Var2.c = tv80Var3;
                                zlt0Var2.d = null;
                                zlt0Var2.e = (w840) x840Var;
                                zlt0Var2.f = z5;
                                zlt0Var2.i = 4;
                                tv80 tv80Var5 = tv80Var3;
                                objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var5, zlt0Var2);
                                tv80Var4 = tv80Var5;
                                if (objC != obj) {
                                    x840Var2 = x840Var;
                                    z4 = z5;
                                    if (!((w840) x840Var2).a) {
                                    }
                                    e7p0.d(e7p0Var, tv80Var4.a);
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        zlt0Var2.a = null;
                        zlt0Var2.b = null;
                        zlt0Var2.c = tv80Var;
                        zlt0Var2.d = null;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 5;
                        if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                            tv80Var2 = tv80Var;
                            z2 = z5;
                            if (z2) {
                                e7p0.d(e7p0Var, tv80Var2.a);
                            }
                        }
                    }
                    return obj;
                }
                z3 = slt0Var2 instanceof qlt0;
                ast0Var2 = ast0.c;
                if (z3) {
                    if (ast0Var3 == ast0Var2) {
                        zlt0Var2 = zlt0Var;
                        if (r840Var instanceof o840) {
                            zlt0Var2.a = slt0Var2;
                            zlt0Var2.b = ast0Var3;
                            zlt0Var2.c = tv80Var;
                            ijk0Var2 = ijk0Var;
                            zlt0Var2.d = ijk0Var2;
                            zlt0Var2.f = z5;
                            zlt0Var2.i = 3;
                            objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                            if (objO != obj) {
                                tv80Var3 = tv80Var;
                                x840Var = (x840) objO;
                                if (x840Var instanceof w840) {
                                    zlt0Var2.a = null;
                                    zlt0Var2.b = null;
                                    zlt0Var2.c = tv80Var3;
                                    zlt0Var2.d = null;
                                    zlt0Var2.e = (w840) x840Var;
                                    zlt0Var2.f = z5;
                                    zlt0Var2.i = 4;
                                    tv80 tv80Var6 = tv80Var3;
                                    objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var6, zlt0Var2);
                                    tv80Var4 = tv80Var6;
                                    if (objC != obj) {
                                        x840Var2 = x840Var;
                                        z4 = z5;
                                        if (!((w840) x840Var2).a) {
                                        }
                                        e7p0.d(e7p0Var, tv80Var4.a);
                                        return rih1Var;
                                    }
                                }
                            }
                        } else {
                            zlt0Var2.a = null;
                            zlt0Var2.b = null;
                            zlt0Var2.c = tv80Var;
                            zlt0Var2.d = null;
                            zlt0Var2.f = z5;
                            zlt0Var2.i = 5;
                            if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                                tv80Var2 = tv80Var;
                                z2 = z5;
                                if (z2) {
                                    e7p0.d(e7p0Var, tv80Var2.a);
                                }
                            }
                        }
                    } else {
                        zlt0Var.a = null;
                        zlt0Var.b = null;
                        zlt0Var.c = null;
                        zlt0Var.d = null;
                        zlt0Var.f = z5;
                        zlt0Var.i = 2;
                        if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var) == obj) {
                        }
                    }
                    return obj;
                }
                if (slt0Var2 instanceof plt0) {
                    if (ast0Var3 == ast0Var2) {
                        zlt0Var2 = zlt0Var;
                        if (r840Var instanceof o840) {
                            zlt0Var2.a = slt0Var2;
                            zlt0Var2.b = ast0Var3;
                            zlt0Var2.c = tv80Var;
                            ijk0Var2 = ijk0Var;
                            zlt0Var2.d = ijk0Var2;
                            zlt0Var2.f = z5;
                            zlt0Var2.i = 3;
                            objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                            if (objO != obj) {
                                tv80Var3 = tv80Var;
                                x840Var = (x840) objO;
                                if (x840Var instanceof w840) {
                                    zlt0Var2.a = null;
                                    zlt0Var2.b = null;
                                    zlt0Var2.c = tv80Var3;
                                    zlt0Var2.d = null;
                                    zlt0Var2.e = (w840) x840Var;
                                    zlt0Var2.f = z5;
                                    zlt0Var2.i = 4;
                                    tv80 tv80Var7 = tv80Var3;
                                    objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var7, zlt0Var2);
                                    tv80Var4 = tv80Var7;
                                    if (objC != obj) {
                                        x840Var2 = x840Var;
                                        z4 = z5;
                                        if (!((w840) x840Var2).a) {
                                        }
                                        e7p0.d(e7p0Var, tv80Var4.a);
                                        return rih1Var;
                                    }
                                }
                            }
                        } else {
                            zlt0Var2.a = null;
                            zlt0Var2.b = null;
                            zlt0Var2.c = tv80Var;
                            zlt0Var2.d = null;
                            zlt0Var2.f = z5;
                            zlt0Var2.i = 5;
                            if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                                tv80Var2 = tv80Var;
                                z2 = z5;
                                if (z2) {
                                    e7p0.d(e7p0Var, tv80Var2.a);
                                }
                            }
                        }
                    } else {
                        zlt0Var.a = null;
                        zlt0Var.b = null;
                        zlt0Var.c = null;
                        zlt0Var.d = null;
                        zlt0Var.f = z5;
                        zlt0Var.i = 2;
                        if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var) == obj) {
                        }
                    }
                    return obj;
                }
                if (slt0Var2 instanceof rlt0) {
                    eg.o();
                    return null;
                }
                if (ast0Var3 != ast0.a) {
                    zlt0Var2 = zlt0Var;
                    if (r840Var instanceof o840) {
                        zlt0Var2.a = slt0Var2;
                        zlt0Var2.b = ast0Var3;
                        zlt0Var2.c = tv80Var;
                        ijk0Var2 = ijk0Var;
                        zlt0Var2.d = ijk0Var2;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 3;
                        objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                        if (objO != obj) {
                            tv80Var3 = tv80Var;
                            x840Var = (x840) objO;
                            if (x840Var instanceof w840) {
                                zlt0Var2.a = null;
                                zlt0Var2.b = null;
                                zlt0Var2.c = tv80Var3;
                                zlt0Var2.d = null;
                                zlt0Var2.e = (w840) x840Var;
                                zlt0Var2.f = z5;
                                zlt0Var2.i = 4;
                                tv80 tv80Var8 = tv80Var3;
                                objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var8, zlt0Var2);
                                tv80Var4 = tv80Var8;
                                if (objC != obj) {
                                    x840Var2 = x840Var;
                                    z4 = z5;
                                    if (!((w840) x840Var2).a) {
                                    }
                                    e7p0.d(e7p0Var, tv80Var4.a);
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        zlt0Var2.a = null;
                        zlt0Var2.b = null;
                        zlt0Var2.c = tv80Var;
                        zlt0Var2.d = null;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 5;
                        if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                            tv80Var2 = tv80Var;
                            z2 = z5;
                            if (z2) {
                                e7p0.d(e7p0Var, tv80Var2.a);
                            }
                        }
                    }
                } else {
                    zlt0Var.a = null;
                    zlt0Var.b = null;
                    zlt0Var.c = null;
                    zlt0Var.d = null;
                    zlt0Var.f = z5;
                    zlt0Var.i = 2;
                    if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var) == obj) {
                    }
                }
                return obj;
            }
            w4m w4mVar = (w4m) y4mVar;
            if (!w4mVar.b) {
                String strW = g0p1.w(slt0Var2);
                u4m u4mVar = w4mVar.a;
                zlt0Var.a = null;
                zlt0Var.b = null;
                zlt0Var.c = null;
                zlt0Var.d = null;
                zlt0Var.f = z5;
                zlt0Var.i = 1;
                if (this.c.t(strW, u4mVar, tv80Var, zlt0Var) == obj) {
                    return obj;
                }
            }
            if (r840Var instanceof n840) {
                zlt0Var2 = zlt0Var;
                if (r840Var instanceof o840) {
                    zlt0Var2.a = slt0Var2;
                    zlt0Var2.b = ast0Var3;
                    zlt0Var2.c = tv80Var;
                    ijk0Var2 = ijk0Var;
                    zlt0Var2.d = ijk0Var2;
                    zlt0Var2.f = z5;
                    zlt0Var2.i = 3;
                    objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                    if (objO != obj) {
                        tv80Var3 = tv80Var;
                        x840Var = (x840) objO;
                        if (x840Var instanceof w840) {
                            zlt0Var2.a = null;
                            zlt0Var2.b = null;
                            zlt0Var2.c = tv80Var3;
                            zlt0Var2.d = null;
                            zlt0Var2.e = (w840) x840Var;
                            zlt0Var2.f = z5;
                            zlt0Var2.i = 4;
                            tv80 tv80Var9 = tv80Var3;
                            objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var9, zlt0Var2);
                            tv80Var4 = tv80Var9;
                            if (objC != obj) {
                                x840Var2 = x840Var;
                                z4 = z5;
                                if (!((w840) x840Var2).a) {
                                }
                                e7p0.d(e7p0Var, tv80Var4.a);
                                return rih1Var;
                            }
                        }
                    }
                } else {
                    zlt0Var2.a = null;
                    zlt0Var2.b = null;
                    zlt0Var2.c = tv80Var;
                    zlt0Var2.d = null;
                    zlt0Var2.f = z5;
                    zlt0Var2.i = 5;
                    if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                        tv80Var2 = tv80Var;
                        z2 = z5;
                        if (z2) {
                            e7p0.d(e7p0Var, tv80Var2.a);
                        }
                    }
                }
                return obj;
            }
            z3 = slt0Var2 instanceof qlt0;
            ast0Var2 = ast0.c;
            if (z3) {
                if (ast0Var3 == ast0Var2) {
                    zlt0Var2 = zlt0Var;
                    if (r840Var instanceof o840) {
                        zlt0Var2.a = slt0Var2;
                        zlt0Var2.b = ast0Var3;
                        zlt0Var2.c = tv80Var;
                        ijk0Var2 = ijk0Var;
                        zlt0Var2.d = ijk0Var2;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 3;
                        objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                        if (objO != obj) {
                            tv80Var3 = tv80Var;
                            x840Var = (x840) objO;
                            if (x840Var instanceof w840) {
                                zlt0Var2.a = null;
                                zlt0Var2.b = null;
                                zlt0Var2.c = tv80Var3;
                                zlt0Var2.d = null;
                                zlt0Var2.e = (w840) x840Var;
                                zlt0Var2.f = z5;
                                zlt0Var2.i = 4;
                                tv80 tv80Var10 = tv80Var3;
                                objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var10, zlt0Var2);
                                tv80Var4 = tv80Var10;
                                if (objC != obj) {
                                    x840Var2 = x840Var;
                                    z4 = z5;
                                    if (!((w840) x840Var2).a) {
                                    }
                                    e7p0.d(e7p0Var, tv80Var4.a);
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        zlt0Var2.a = null;
                        zlt0Var2.b = null;
                        zlt0Var2.c = tv80Var;
                        zlt0Var2.d = null;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 5;
                        if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                            tv80Var2 = tv80Var;
                            z2 = z5;
                            if (z2) {
                                e7p0.d(e7p0Var, tv80Var2.a);
                            }
                        }
                    }
                } else {
                    zlt0Var.a = null;
                    zlt0Var.b = null;
                    zlt0Var.c = null;
                    zlt0Var.d = null;
                    zlt0Var.f = z5;
                    zlt0Var.i = 2;
                    if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var) == obj) {
                    }
                }
                return obj;
            }
            if (slt0Var2 instanceof plt0) {
                if (ast0Var3 == ast0Var2) {
                    zlt0Var2 = zlt0Var;
                    if (r840Var instanceof o840) {
                        zlt0Var2.a = slt0Var2;
                        zlt0Var2.b = ast0Var3;
                        zlt0Var2.c = tv80Var;
                        ijk0Var2 = ijk0Var;
                        zlt0Var2.d = ijk0Var2;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 3;
                        objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                        if (objO != obj) {
                            tv80Var3 = tv80Var;
                            x840Var = (x840) objO;
                            if (x840Var instanceof w840) {
                                zlt0Var2.a = null;
                                zlt0Var2.b = null;
                                zlt0Var2.c = tv80Var3;
                                zlt0Var2.d = null;
                                zlt0Var2.e = (w840) x840Var;
                                zlt0Var2.f = z5;
                                zlt0Var2.i = 4;
                                tv80 tv80Var11 = tv80Var3;
                                objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var11, zlt0Var2);
                                tv80Var4 = tv80Var11;
                                if (objC != obj) {
                                    x840Var2 = x840Var;
                                    z4 = z5;
                                    if (!((w840) x840Var2).a) {
                                    }
                                    e7p0.d(e7p0Var, tv80Var4.a);
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        zlt0Var2.a = null;
                        zlt0Var2.b = null;
                        zlt0Var2.c = tv80Var;
                        zlt0Var2.d = null;
                        zlt0Var2.f = z5;
                        zlt0Var2.i = 5;
                        if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                            tv80Var2 = tv80Var;
                            z2 = z5;
                            if (z2) {
                                e7p0.d(e7p0Var, tv80Var2.a);
                            }
                        }
                    }
                } else {
                    zlt0Var.a = null;
                    zlt0Var.b = null;
                    zlt0Var.c = null;
                    zlt0Var.d = null;
                    zlt0Var.f = z5;
                    zlt0Var.i = 2;
                    if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var) == obj) {
                    }
                }
                return obj;
            }
            if (slt0Var2 instanceof rlt0) {
                eg.o();
                return null;
            }
            if (ast0Var3 != ast0.a) {
                zlt0Var2 = zlt0Var;
                if (r840Var instanceof o840) {
                    zlt0Var2.a = slt0Var2;
                    zlt0Var2.b = ast0Var3;
                    zlt0Var2.c = tv80Var;
                    ijk0Var2 = ijk0Var;
                    zlt0Var2.d = ijk0Var2;
                    zlt0Var2.f = z5;
                    zlt0Var2.i = 3;
                    objO = this.a.O(g0p1.w(slt0Var2), (o840) r840Var, tv80Var, zlt0Var2);
                    if (objO != obj) {
                        tv80Var3 = tv80Var;
                        x840Var = (x840) objO;
                        if (x840Var instanceof w840) {
                            zlt0Var2.a = null;
                            zlt0Var2.b = null;
                            zlt0Var2.c = tv80Var3;
                            zlt0Var2.d = null;
                            zlt0Var2.e = (w840) x840Var;
                            zlt0Var2.f = z5;
                            zlt0Var2.i = 4;
                            tv80 tv80Var12 = tv80Var3;
                            objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var12, zlt0Var2);
                            tv80Var4 = tv80Var12;
                            if (objC != obj) {
                                x840Var2 = x840Var;
                                z4 = z5;
                                if (!((w840) x840Var2).a) {
                                }
                                e7p0.d(e7p0Var, tv80Var4.a);
                                return rih1Var;
                            }
                        }
                    }
                } else {
                    zlt0Var2.a = null;
                    zlt0Var2.b = null;
                    zlt0Var2.c = tv80Var;
                    zlt0Var2.d = null;
                    zlt0Var2.f = z5;
                    zlt0Var2.i = 5;
                    if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var2) != obj) {
                        tv80Var2 = tv80Var;
                        z2 = z5;
                        if (z2) {
                            e7p0.d(e7p0Var, tv80Var2.a);
                        }
                    }
                }
            } else {
                zlt0Var.a = null;
                zlt0Var.b = null;
                zlt0Var.c = null;
                zlt0Var.d = null;
                zlt0Var.f = z5;
                zlt0Var.i = 2;
                if (c(slt0Var2, ast0Var3, ijk0Var, tv80Var, zlt0Var) == obj) {
                }
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objO);
            return rih1Var;
        }
        if (i2 == 2) {
            hm5.M(objO);
            return rih1Var;
        }
        if (i2 == 3) {
            boolean z6 = zlt0Var.f;
            ijk0 ijk0Var3 = zlt0Var.d;
            tv80Var3 = zlt0Var.c;
            ast0 ast0Var4 = zlt0Var.b;
            slt0 slt0Var3 = zlt0Var.a;
            hm5.M(objO);
            z5 = z6;
            slt0Var2 = slt0Var3;
            zlt0Var2 = zlt0Var;
            ijk0Var2 = ijk0Var3;
            ast0Var3 = ast0Var4;
            x840Var = (x840) objO;
            if (x840Var instanceof w840) {
                zlt0Var2.a = null;
                zlt0Var2.b = null;
                zlt0Var2.c = tv80Var3;
                zlt0Var2.d = null;
                zlt0Var2.e = (w840) x840Var;
                zlt0Var2.f = z5;
                zlt0Var2.i = 4;
                tv80 tv80Var13 = tv80Var3;
                objC = c(slt0Var2, ast0Var3, ijk0Var2, tv80Var13, zlt0Var2);
                tv80Var4 = tv80Var13;
                if (objC != obj) {
                    x840Var2 = x840Var;
                    z4 = z5;
                }
                return obj;
            }
        } else if (i2 == 4) {
            z4 = zlt0Var.f;
            x840Var2 = zlt0Var.e;
            tv80Var4 = zlt0Var.c;
            hm5.M(objO);
        } else {
            if (i2 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = zlt0Var.f;
            tv80Var2 = zlt0Var.c;
            hm5.M(objO);
            if (z2) {
                e7p0.d(e7p0Var, tv80Var2.a);
            }
        }
        if (!((w840) x840Var2).a || z4) {
            e7p0.d(e7p0Var, tv80Var4.a);
            return rih1Var;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0167  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x012a  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:91:0x014d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0152  */
    /* JADX WARN: Code duplicated, block: B:94:0x0156  */
    /* JADX WARN: Code duplicated, block: B:95:0x015b  */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public final Object c(slt0 slt0Var, ast0 ast0Var, ijk0 ijk0Var, tv80 tv80Var, onm onmVar) {
        amt0 amt0Var;
        ast0 ast0Var2;
        tv80 tv80Var2;
        slt0 slt0Var2;
        ijk0 ijk0Var2;
        ?? BooleanValue;
        uzc0 uzc0Var;
        int iOrdinal;
        Object objB;
        ijk0 ijk0Var3;
        ast0 ast0Var3;
        slt0 slt0Var3;
        tv80 tv80Var3;
        ?? r1;
        String str;
        int iOrdinal2;
        int iOrdinal3;
        String str2;
        boolean z;
        int i;
        if (onmVar instanceof amt0) {
            amt0Var = (amt0) onmVar;
            int i2 = amt0Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amt0Var.h = i2 - Integer.MIN_VALUE;
            } else {
                amt0Var = new amt0(this, onmVar);
            }
        } else {
            amt0Var = new amt0(this, onmVar);
        }
        Object objK = amt0Var.f;
        int i3 = amt0Var.h;
        yzc0 yzc0Var = this.e;
        ast0 ast0Var4 = ast0.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                tv80Var2 = amt0Var.d;
                ijk0Var2 = amt0Var.c;
                ast0Var2 = amt0Var.b;
                slt0Var2 = amt0Var.a;
                hm5.M(objK);
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(objK);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = amt0Var.e;
                tv80Var3 = amt0Var.d;
                ijk0Var3 = amt0Var.c;
                ast0Var3 = amt0Var.b;
                slt0Var3 = amt0Var.a;
                hm5.M(objK);
            }
            if (ast0Var3 == ast0Var4) {
                if (slt0Var3 instanceof qlt0) {
                    str2 = ((qlt0) slt0Var3).a;
                } else if (slt0Var3 instanceof plt0) {
                    str2 = ((plt0) slt0Var3).a;
                } else {
                    if (!(slt0Var3 instanceof rlt0)) {
                        r1 = i;
                        eg.o();
                        return null;
                    }
                    str2 = ((rlt0) slt0Var3).a;
                }
                if (r1 != 0) {
                    r1 = i;
                    r1 = i;
                    r1 = i;
                    z = true;
                } else {
                    r1 = i;
                    r1 = i;
                    r1 = i;
                    z = false;
                }
                amt0Var.a = null;
                amt0Var.b = null;
                amt0Var.c = null;
                amt0Var.d = null;
                amt0Var.e = r1;
                amt0Var.h = 3;
                if (this.d.I(str2, z, ijk0Var3, tv80Var3, amt0Var) == d9nVar) {
                    return d9nVar;
                }
            }
            r1 = i;
            return rih1Var;
        }
        hm5.M(objK);
        if (ast0Var == ast0Var4) {
            mr20 mr20VarA = yzc0Var.a();
            amt0Var.a = slt0Var;
            amt0Var.b = ast0Var;
            amt0Var.c = ijk0Var;
            amt0Var.d = tv80Var;
            amt0Var.h = 1;
            objK = b5p1.k(mr20VarA, amt0Var);
            if (objK != d9nVar) {
                ast0Var2 = ast0Var;
                tv80Var2 = tv80Var;
                slt0Var2 = slt0Var;
                ijk0Var2 = ijk0Var;
            }
        } else {
            ast0Var2 = ast0Var;
            tv80Var2 = tv80Var;
            slt0Var2 = slt0Var;
            ijk0Var2 = ijk0Var;
            amt0Var.a = slt0Var2;
            amt0Var.b = ast0Var2;
            amt0Var.c = ijk0Var2;
            amt0Var.d = tv80Var2;
            amt0Var.e = BooleanValue;
            amt0Var.h = 2;
            if (slt0Var2 instanceof qlt0) {
                str = ((qlt0) slt0Var2).a;
                iOrdinal2 = ast0Var2.ordinal();
                if (iOrdinal2 != 0) {
                    objB = yzc0Var.i(tv80Var2, amt0Var);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                } else if (iOrdinal2 != 1) {
                    objB = yzc0Var.k(tv80Var2, amt0Var);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                } else {
                    if (iOrdinal2 == 2) {
                        eg.o();
                        return null;
                    }
                    Set set = s4b1.f;
                    iOrdinal3 = uic.x(str).c.ordinal();
                    if (iOrdinal3 != 166 || iOrdinal3 == 652 || iOrdinal3 == 844 || iOrdinal3 == 926 ? (objB = yzc0Var.h(new vzc0(str), tv80Var2, (yjp1) null, amt0Var)) != d9nVar : (objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var)) != d9nVar) {
                        objB = rih1Var;
                    }
                }
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            } else if (slt0Var2 instanceof plt0) {
                objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            } else {
                if (slt0Var2 instanceof rlt0) {
                    eg.o();
                    return null;
                }
                uzc0Var = new uzc0(((rlt0) slt0Var2).c);
                iOrdinal = ast0Var2.ordinal();
                if (iOrdinal != 0) {
                    objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                } else if (iOrdinal != 1) {
                    objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                } else {
                    if (iOrdinal == 2) {
                        eg.o();
                        return null;
                    }
                    objB = yzc0Var.h(uzc0Var, tv80Var2, (yjp1) null, amt0Var);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                }
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            }
            if (objB != d9nVar) {
                ijk0Var3 = ijk0Var2;
                ast0Var3 = ast0Var2;
                slt0Var3 = slt0Var2;
                tv80Var3 = tv80Var2;
                r1 = BooleanValue;
                if (ast0Var3 == ast0Var4) {
                    if (slt0Var3 instanceof qlt0) {
                        str2 = ((qlt0) slt0Var3).a;
                    } else if (slt0Var3 instanceof plt0) {
                        str2 = ((plt0) slt0Var3).a;
                    } else {
                        if (!(slt0Var3 instanceof rlt0)) {
                            r1 = i;
                            eg.o();
                            return null;
                        }
                        str2 = ((rlt0) slt0Var3).a;
                    }
                    if (r1 != 0) {
                        r1 = i;
                        r1 = i;
                        r1 = i;
                        z = true;
                    } else {
                        r1 = i;
                        r1 = i;
                        r1 = i;
                        z = false;
                    }
                    amt0Var.a = null;
                    amt0Var.b = null;
                    amt0Var.c = null;
                    amt0Var.d = null;
                    amt0Var.e = r1;
                    amt0Var.h = 3;
                    if (this.d.I(str2, z, ijk0Var3, tv80Var3, amt0Var) == d9nVar) {
                    }
                }
                r1 = i;
                return rih1Var;
            }
        }
        return d9nVar;
        Boolean bool = (Boolean) objK;
        BooleanValue = bool != null ? bool.booleanValue() : 0;
        amt0Var.a = slt0Var2;
        amt0Var.b = ast0Var2;
        amt0Var.c = ijk0Var2;
        amt0Var.d = tv80Var2;
        amt0Var.e = BooleanValue;
        amt0Var.h = 2;
        if (slt0Var2 instanceof qlt0) {
            str = ((qlt0) slt0Var2).a;
            iOrdinal2 = ast0Var2.ordinal();
            if (iOrdinal2 != 0) {
                objB = yzc0Var.i(tv80Var2, amt0Var);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            } else if (iOrdinal2 != 1) {
                objB = yzc0Var.k(tv80Var2, amt0Var);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            } else {
                if (iOrdinal2 == 2) {
                    eg.o();
                    return null;
                }
                Set set2 = s4b1.f;
                iOrdinal3 = uic.x(str).c.ordinal();
                if (iOrdinal3 != 166) {
                    objB = rih1Var;
                } else {
                    objB = rih1Var;
                }
            }
            if (objB != d9nVar) {
                objB = rih1Var;
            }
        } else if (slt0Var2 instanceof plt0) {
            objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var);
            if (objB != d9nVar) {
                objB = rih1Var;
            }
        } else {
            if (slt0Var2 instanceof rlt0) {
                eg.o();
                return null;
            }
            uzc0Var = new uzc0(((rlt0) slt0Var2).c);
            iOrdinal = ast0Var2.ordinal();
            if (iOrdinal != 0) {
                objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            } else if (iOrdinal != 1) {
                objB = yzc0Var.b(tv80Var2, (yjp1) null, amt0Var);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            } else {
                if (iOrdinal == 2) {
                    eg.o();
                    return null;
                }
                objB = yzc0Var.h(uzc0Var, tv80Var2, (yjp1) null, amt0Var);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
            }
            if (objB != d9nVar) {
                objB = rih1Var;
            }
        }
        if (objB != d9nVar) {
            ijk0Var3 = ijk0Var2;
            ast0Var3 = ast0Var2;
            slt0Var3 = slt0Var2;
            tv80Var3 = tv80Var2;
            r1 = BooleanValue;
            if (ast0Var3 == ast0Var4) {
                if (slt0Var3 instanceof qlt0) {
                    str2 = ((qlt0) slt0Var3).a;
                } else if (slt0Var3 instanceof plt0) {
                    str2 = ((plt0) slt0Var3).a;
                } else {
                    if (!(slt0Var3 instanceof rlt0)) {
                        r1 = i;
                        eg.o();
                        return null;
                    }
                    str2 = ((rlt0) slt0Var3).a;
                }
                if (r1 != 0) {
                    r1 = i;
                    r1 = i;
                    r1 = i;
                    z = true;
                } else {
                    r1 = i;
                    r1 = i;
                    r1 = i;
                    z = false;
                }
                amt0Var.a = null;
                amt0Var.b = null;
                amt0Var.c = null;
                amt0Var.d = null;
                amt0Var.e = r1;
                amt0Var.h = 3;
                if (this.d.I(str2, z, ijk0Var3, tv80Var3, amt0Var) == d9nVar) {
                }
            }
            r1 = i;
            return rih1Var;
        }
        return d9nVar;
    }
}
