package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ur60 extends xpl1 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // p.xct
    public final void a(xct xctVar) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (l1d.C(this.j) == 3) {
            cjl cjlVar = this.b;
            l(cjlVar.J, cjlVar.L, 0);
            return;
        }
        d5u d5uVar = this.e;
        boolean z = d5uVar.j;
        bjl bjlVar = bjl.c;
        zct zctVar = this.h;
        zct zctVar2 = this.i;
        if (z || this.d != bjlVar) {
            f = 0.5f;
        } else {
            cjl cjlVar2 = this.b;
            int i3 = cjlVar2.s;
            if (i3 == 2) {
                f = 0.5f;
                cjl cjlVar3 = cjlVar2.V;
                if (cjlVar3 != null) {
                    d5u d5uVar2 = cjlVar3.d.e;
                    if (d5uVar2.j) {
                        d5uVar.d((int) ((d5uVar2.g * cjlVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = cjlVar2.t;
                if (i4 == 0 || i4 == 3) {
                    s6j1 s6j1Var = cjlVar2.e;
                    zct zctVar3 = s6j1Var.h;
                    zct zctVar4 = s6j1Var.i;
                    boolean z2 = cjlVar2.J.f != null;
                    boolean z3 = cjlVar2.K.f != null;
                    boolean z4 = cjlVar2.L.f != null;
                    boolean z5 = cjlVar2.M.f != null;
                    f = 0.5f;
                    int i5 = cjlVar2.Z;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = cjlVar2.Y;
                        boolean z6 = zctVar3.j;
                        ArrayList arrayList = zctVar3.l;
                        int[] iArr = k;
                        if (z6 && zctVar4.j) {
                            if (zctVar.c && zctVar2.c) {
                                m(iArr, ((zct) zctVar.l.get(0)).g + zctVar.f, ((zct) zctVar2.l.get(0)).g - zctVar2.f, zctVar3.g + zctVar3.f, zctVar4.g - zctVar4.f, f5, i5);
                                d5uVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (zctVar.j && zctVar2.j) {
                            if (!zctVar3.c || !zctVar4.c) {
                                return;
                            }
                            m(iArr, zctVar.g + zctVar.f, zctVar2.g - zctVar2.f, ((zct) arrayList.get(0)).g + zctVar3.f, ((zct) zctVar4.l.get(0)).g - zctVar4.f, f5, i5);
                            d5uVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!zctVar.c || !zctVar2.c || !zctVar3.c || !zctVar4.c) {
                            return;
                        }
                        m(iArr, ((zct) zctVar.l.get(0)).g + zctVar.f, ((zct) zctVar2.l.get(0)).g - zctVar2.f, ((zct) arrayList.get(0)).g + zctVar3.f, ((zct) zctVar4.l.get(0)).g - zctVar4.f, f5, i5);
                        d5uVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!zctVar.c || !zctVar2.c) {
                            return;
                        }
                        float f6 = cjlVar2.Y;
                        int i6 = ((zct) zctVar.l.get(0)).g + zctVar.f;
                        int i7 = ((zct) zctVar2.l.get(0)).g - zctVar2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            d5uVar.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            d5uVar.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!zctVar3.c || !zctVar4.c) {
                            return;
                        }
                        float f7 = cjlVar2.Y;
                        int i10 = ((zct) zctVar3.l.get(0)).g + zctVar3.f;
                        int i11 = ((zct) zctVar4.l.get(0)).g - zctVar4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            d5uVar.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            d5uVar.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            d5uVar.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = cjlVar2.Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = cjlVar2.e.e.g / cjlVar2.Y;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = cjlVar2.e.e.g;
                            f3 = cjlVar2.Y;
                        }
                        d5uVar.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = cjlVar2.e.e.g;
                        f3 = cjlVar2.Y;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    d5uVar.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = zctVar.c;
        ArrayList arrayList2 = zctVar.l;
        if (z7) {
            boolean z8 = zctVar2.c;
            ArrayList arrayList3 = zctVar2.l;
            if (z8) {
                if (zctVar.j && zctVar2.j && d5uVar.j) {
                    return;
                }
                if (!d5uVar.j && this.d == bjlVar) {
                    cjl cjlVar4 = this.b;
                    if (cjlVar4.s == 0 && !cjlVar4.z()) {
                        zct zctVar5 = (zct) arrayList2.get(0);
                        zct zctVar6 = (zct) arrayList3.get(0);
                        int i14 = zctVar5.g + zctVar.f;
                        int i15 = zctVar6.g + zctVar2.f;
                        zctVar.d(i14);
                        zctVar2.d(i15);
                        d5uVar.d(i15 - i14);
                        return;
                    }
                }
                if (!d5uVar.j && this.d == bjlVar && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((zct) arrayList3.get(0)).g + zctVar2.f) - (((zct) arrayList2.get(0)).g + zctVar.f), d5uVar.m);
                    cjl cjlVar5 = this.b;
                    int i16 = cjlVar5.w;
                    int iMax = Math.max(cjlVar5.v, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    d5uVar.d(iMax);
                }
                if (d5uVar.j) {
                    zct zctVar7 = (zct) arrayList2.get(0);
                    zct zctVar8 = (zct) arrayList3.get(0);
                    int i17 = zctVar7.g;
                    int i18 = zctVar.f + i17;
                    int i19 = zctVar8.g;
                    int i20 = zctVar2.f + i19;
                    float f8 = this.b.f0;
                    if (zctVar7 == zctVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    zctVar.d((int) ((((i19 - i17) - d5uVar.g) * f8) + i17 + f));
                    zctVar2.d(zctVar.g + d5uVar.g);
                }
            }
        }
    }

    @Override // p.xpl1
    public final void e() {
        zct zctVar = this.h;
        if (zctVar.j) {
            this.b.a0 = zctVar.g;
        }
    }

    @Override // p.xpl1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // p.xpl1
    public final boolean k() {
        return this.d != bjl.c || this.b.s == 0;
    }

    public final void n() {
        this.g = false;
        zct zctVar = this.h;
        zctVar.c();
        zctVar.j = false;
        zct zctVar2 = this.i;
        zctVar2.c();
        zctVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}
