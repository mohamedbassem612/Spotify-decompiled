package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bsb0 {
    public final nen0 a;
    public mgc b;
    public int c;
    public final oen0 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public iku j;

    public bsb0() {
        long[] jArr = hj41.a;
        this.a = new nen0();
        oen0 oen0Var = ij41.a;
        this.d = new oen0();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public static void c(jsb0 jsb0Var, int i, zrb0 zrb0Var, boolean z) {
        int i2 = 0;
        long jI = jsb0Var.i(0);
        long jA = z ? qr80.a(jI, 0, i, 1) : qr80.a(jI, i, 0, 2);
        xrb0[] xrb0VarArr = zrb0Var.a;
        int length = xrb0VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            xrb0 xrb0Var = xrb0VarArr[i2];
            int i4 = i3 + 1;
            if (xrb0Var != null) {
                xrb0Var.l = qr80.d(jA, qr80.c(jsb0Var.i(i3), jI));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, jsb0 jsb0Var, boolean z) {
        int iJ = jsb0Var.j();
        int iB = jsb0Var.b() + iJ;
        int iMax = 0;
        while (iJ < iB) {
            int iZ = men1.z(jsb0Var, z) + iArr[iJ];
            iArr[iJ] = iZ;
            iMax = Math.max(iMax, iZ);
            iJ++;
        }
        return iMax;
    }

    public final xrb0 a(int i, Object obj) {
        zrb0 zrb0Var = (zrb0) this.a.g(obj);
        if (zrb0Var != null) {
            return zrb0Var.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            xrb0 xrb0Var = (xrb0) arrayList.get(i);
            be50 be50Var = xrb0Var.o;
            if (be50Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (xrb0Var.l >> 32)) + ((int) (be50Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (xrb0Var.l & 4294967295L)) + ((int) (be50Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:199:0x047d  */
    /* JADX WARN: Code duplicated, block: B:246:0x00c6 A[EDGE_INSN: B:246:0x00c6->B:46:0x00c6 BREAK  A[LOOP:2: B:32:0x0086->B:44:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[LOOP:2: B:32:0x0086->B:44:0x00bf, LOOP_END] */
    public final void d(int i, int i2, int i3, ArrayList arrayList, mgc mgcVar, k9 k9Var, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, c9n c9nVar, yd50 yd50Var) {
        nen0 nen0Var;
        long j;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        oen0 oen0Var;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        mgc mgcVar2;
        int[] iArr2;
        int i7;
        mgc mgcVar3;
        Object[] objArr;
        int i8;
        int i9;
        ArrayList arrayList8;
        oen0 oen0Var2;
        ArrayList arrayList9;
        int i10;
        ArrayList arrayList10;
        mgc mgcVar4;
        Object[] objArr2;
        int i11;
        int i12;
        int[] iArr3;
        int i13;
        ArrayList arrayList11;
        ArrayList arrayList12;
        int i14;
        xrb0 xrb0Var;
        byte b;
        nen0 nen0Var2;
        int i15;
        int i16;
        long j2;
        xrb0[] xrb0VarArr;
        int i17;
        int i18;
        ArrayList arrayList13 = arrayList;
        int i19 = i4;
        mgc mgcVar5 = this.b;
        this.b = mgcVar;
        int size = arrayList13.size();
        int i20 = 0;
        loop0: while (true) {
            nen0Var = this.a;
            if (i20 >= size) {
                if (!nen0Var.i()) {
                    break;
                }
                e();
                return;
            }
            jsb0 jsb0Var = (jsb0) arrayList13.get(i20);
            int iV = men1.v(jsb0Var);
            for (int i21 = 0; i21 < iV; i21++) {
                if (vvm1.u(men1.t(jsb0Var, i21)) != null) {
                    break loop0;
                }
            }
            i20++;
        }
        int i22 = this.c;
        jsb0 jsb0Var2 = (jsb0) o7h.s0(arrayList13);
        this.c = jsb0Var2 != null ? jsb0Var2.getIndex() : 0;
        long j3 = z ? ((long) i) & 4294967295L : ((long) i) << 32;
        boolean z4 = z2 || !z3;
        Object[] objArr3 = nen0Var.b;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        oen0 oen0Var3 = this.d;
        int i23 = i22;
        if (length >= 0) {
            int i24 = 0;
            while (true) {
                long j4 = jArr[i24];
                j = j3;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8 - ((~(i24 - length)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j4 & 255) < 128) {
                            oen0Var3.a(objArr3[(i24 << 3) + i26]);
                        }
                        j4 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                    if (i24 != length) {
                        break;
                    }
                    i24++;
                    j3 = j;
                } else if (i24 != length) {
                    break;
                    break;
                } else {
                    i24++;
                    j3 = j;
                }
            }
        } else {
            j = j3;
        }
        int size2 = arrayList13.size();
        int i27 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i27 >= size2) {
                break;
            }
            jsb0 jsb0Var3 = (jsb0) arrayList13.get(i27);
            oen0Var3.l(jsb0Var3.getKey());
            int iV2 = men1.v(jsb0Var3);
            int i28 = i27;
            int i29 = 0;
            while (true) {
                if (i29 >= iV2) {
                    nen0Var2 = nen0Var;
                    i15 = size2;
                    i16 = i23;
                    j2 = j;
                    f(jsb0Var3.getKey());
                    break;
                }
                if (vvm1.u(men1.t(jsb0Var3, i29)) != null) {
                    zrb0 zrb0Var = (zrb0) nen0Var.g(jsb0Var3.getKey());
                    int iX = mgcVar5 != null ? mgcVar5.x(jsb0Var3.getKey()) : -1;
                    boolean z5 = iX == -1 && mgcVar5 != null;
                    if (zrb0Var != null) {
                        nen0Var2 = nen0Var;
                        i15 = size2;
                        i16 = i23;
                        j2 = j;
                        if (!z4) {
                            break;
                        }
                        ArrayList arrayList14 = arrayList2;
                        zrb0.b(zrb0Var, jsb0Var3, c9nVar, yd50Var, i5, i6, z);
                        xrb0[] xrb0VarArr2 = zrb0Var.a;
                        int length2 = xrb0VarArr2.length;
                        int i30 = 0;
                        while (i30 < length2) {
                            xrb0 xrb0Var2 = xrb0VarArr2[i30];
                            if (xrb0Var2 != null) {
                                i17 = length2;
                                i18 = i30;
                                xrb0VarArr = xrb0VarArr2;
                                if (!qr80.b(xrb0Var2.l, 9223372034707292159L)) {
                                    xrb0Var2.l = qr80.d(xrb0Var2.l, j2);
                                }
                            } else {
                                xrb0VarArr = xrb0VarArr2;
                                i17 = length2;
                                i18 = i30;
                            }
                            i30 = i18 + 1;
                            length2 = i17;
                            xrb0VarArr2 = xrb0VarArr;
                        }
                        if (z5) {
                            for (xrb0 xrb0Var3 : zrb0Var.a) {
                                if (xrb0Var3 != null) {
                                    if (xrb0Var3.c()) {
                                        arrayList14.remove(xrb0Var3);
                                        iku ikuVar = this.j;
                                        if (ikuVar != null) {
                                            ha71.x(ikuVar);
                                        }
                                    }
                                    xrb0Var3.a();
                                }
                            }
                        }
                        g(jsb0Var3, false);
                        break;
                    }
                    zrb0 zrb0Var2 = new zrb0(this);
                    nen0Var2 = nen0Var;
                    int i31 = iX;
                    i15 = size2;
                    i16 = i23;
                    j2 = j;
                    zrb0.b(zrb0Var2, jsb0Var3, c9nVar, yd50Var, i5, i6, z);
                    nen0Var2.m(jsb0Var3.getKey(), zrb0Var2);
                    if (jsb0Var3.getIndex() != i31 && i31 != -1) {
                        if (i31 < i16) {
                            arrayList4.add(jsb0Var3);
                            break;
                        } else {
                            arrayList3.add(jsb0Var3);
                            break;
                        }
                    }
                    long jI = jsb0Var3.i(0);
                    c(jsb0Var3, (int) (z ? jI & 4294967295L : jI >> 32), zrb0Var2, z);
                    if (!z5) {
                        break;
                    }
                    for (xrb0 xrb0Var4 : zrb0Var2.a) {
                        if (xrb0Var4 != null) {
                            xrb0Var4.a();
                        }
                    }
                    break;
                }
                i29++;
                arrayList2 = arrayList2;
                size2 = size2;
                nen0Var = nen0Var;
            }
            i27 = i28 + 1;
            arrayList13 = arrayList;
            j = j2;
            nen0Var = nen0Var2;
            i23 = i16;
            size2 = i15;
        }
        nen0 nen0Var3 = nen0Var;
        ArrayList arrayList15 = arrayList4;
        ArrayList arrayList16 = arrayList2;
        ArrayList arrayList17 = arrayList3;
        int[] iArr4 = new int[i19];
        if (z4 && mgcVar5 != null) {
            if (arrayList15.isEmpty()) {
                b = 0;
            } else {
                if (arrayList15.size() > 1) {
                    r7h.f0(arrayList15, new asb0(mgcVar5, (byte) 2));
                }
                int size3 = arrayList15.size();
                for (int i32 = 0; i32 < size3; i32++) {
                    jsb0 jsb0Var4 = (jsb0) arrayList15.get(i32);
                    int iH = i5 - h(iArr4, jsb0Var4, z);
                    Object objG = nen0Var3.g(jsb0Var4.getKey());
                    objG.getClass();
                    c(jsb0Var4, iH, (zrb0) objG, z);
                    g(jsb0Var4, false);
                }
                b = 0;
                f46.f0(0, 0, 6, iArr4);
            }
            if (!arrayList17.isEmpty()) {
                if (arrayList17.size() > 1) {
                    r7h.f0(arrayList17, new asb0(mgcVar5, b));
                }
                int size4 = arrayList17.size();
                for (int i33 = 0; i33 < size4; i33++) {
                    jsb0 jsb0Var5 = (jsb0) arrayList17.get(i33);
                    int iH2 = (h(iArr4, jsb0Var5, z) + i6) - men1.z(jsb0Var5, z);
                    Object objG2 = nen0Var3.g(jsb0Var5.getKey());
                    objG2.getClass();
                    c(jsb0Var5, iH2, (zrb0) objG2, z);
                    g(jsb0Var5, false);
                }
                f46.f0(0, 0, 6, iArr4);
            }
        }
        Object[] objArr4 = oen0Var3.b;
        long[] jArr2 = oen0Var3.a;
        int length3 = jArr2.length - 2;
        ArrayList arrayList18 = this.h;
        ArrayList arrayList19 = this.g;
        if (length3 >= 0) {
            int i34 = length3;
            int i35 = 0;
            while (true) {
                long j5 = jArr2[i35];
                long[] jArr3 = jArr2;
                arrayList6 = arrayList17;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i36 = 8 - ((~(i35 - i34)) >>> 31);
                    long j6 = j5;
                    int i37 = 0;
                    while (i37 < i36) {
                        if ((j6 & 255) < 128) {
                            Object obj = objArr4[(i35 << 3) + i37];
                            zrb0 zrb0Var3 = (zrb0) nen0Var3.g(obj);
                            if (zrb0Var3 == null) {
                                oen0Var2 = oen0Var3;
                                arrayList9 = arrayList15;
                                i10 = i37;
                                arrayList10 = arrayList18;
                                mgcVar4 = mgcVar5;
                                objArr2 = objArr4;
                                i11 = i34;
                                i12 = i35;
                                iArr3 = iArr4;
                                i13 = i36;
                                arrayList11 = arrayList16;
                            } else {
                                oen0Var2 = oen0Var3;
                                arrayList9 = arrayList15;
                                int iX2 = mgcVar.x(obj);
                                int i38 = i36;
                                int iMin = Math.min(i19, zrb0Var3.e);
                                zrb0Var3.e = iMin;
                                i10 = i37;
                                zrb0Var3.d = Math.min(i19 - iMin, zrb0Var3.d);
                                if (iX2 == -1) {
                                    xrb0[] xrb0VarArr3 = zrb0Var3.a;
                                    int length4 = xrb0VarArr3.length;
                                    int i39 = 0;
                                    boolean z6 = false;
                                    int i40 = 0;
                                    while (i39 < length4) {
                                        xrb0[] xrb0VarArr4 = xrb0VarArr3;
                                        xrb0 xrb0Var5 = xrb0VarArr4[i39];
                                        int i41 = i40 + 1;
                                        if (xrb0Var5 != null) {
                                            if (xrb0Var5.c()) {
                                                i14 = i39;
                                                length4 = length4;
                                                arrayList18 = arrayList18;
                                            } else {
                                                i14 = i39;
                                                if (((Boolean) xrb0Var5.k.getValue()).booleanValue()) {
                                                    xrb0Var5.d();
                                                    zrb0Var3.a[i40] = null;
                                                    arrayList16.remove(xrb0Var5);
                                                    iku ikuVar2 = this.j;
                                                    if (ikuVar2 != null) {
                                                        ha71.x(ikuVar2);
                                                    }
                                                } else {
                                                    be50 be50Var = xrb0Var5.o;
                                                    if (be50Var != null) {
                                                        ni20 ni20Var = xrb0Var5.f;
                                                        if (xrb0Var5.c() || ni20Var == null) {
                                                            xrb0Var = null;
                                                        } else {
                                                            xrb0Var5.j.setValue(Boolean.TRUE);
                                                            xrb0Var = null;
                                                            c921.y(xrb0Var5.a, (o8n) null, 0, new n0a0(xrb0Var5, ni20Var, be50Var, (lnm) null, (byte) 3), 3);
                                                        }
                                                    } else {
                                                        xrb0Var = null;
                                                    }
                                                    if (xrb0Var5.c()) {
                                                        arrayList16.add(xrb0Var5);
                                                        iku ikuVar3 = this.j;
                                                        if (ikuVar3 != null) {
                                                            ha71.x(ikuVar3);
                                                        }
                                                    } else {
                                                        xrb0Var5.d();
                                                        zrb0Var3.a[i40] = xrb0Var;
                                                    }
                                                }
                                                i39 = i14 + 1;
                                                arrayList18 = arrayList18;
                                                xrb0VarArr3 = xrb0VarArr4;
                                                i40 = i41;
                                                length4 = length4;
                                            }
                                            z6 = true;
                                            i39 = i14 + 1;
                                            arrayList18 = arrayList18;
                                            xrb0VarArr3 = xrb0VarArr4;
                                            i40 = i41;
                                            length4 = length4;
                                        } else {
                                            i14 = i39;
                                        }
                                        length4 = length4;
                                        arrayList18 = arrayList18;
                                        i39 = i14 + 1;
                                        arrayList18 = arrayList18;
                                        xrb0VarArr3 = xrb0VarArr4;
                                        i40 = i41;
                                        length4 = length4;
                                    }
                                    arrayList12 = arrayList18;
                                    if (!z6) {
                                        f(obj);
                                    }
                                } else {
                                    arrayList12 = arrayList18;
                                    hjl hjlVar = zrb0Var3.b;
                                    hjlVar.getClass();
                                    jsb0 jsb0VarM0 = k9Var.M0(hjlVar.a, iX2, zrb0Var3.d, zrb0Var3.e);
                                    jsb0VarM0.e();
                                    xrb0[] xrb0VarArr5 = zrb0Var3.a;
                                    int length5 = xrb0VarArr5.length;
                                    int i42 = 0;
                                    while (true) {
                                        if (i42 < length5) {
                                            xrb0 xrb0Var6 = xrb0VarArr5[i42];
                                            if (xrb0Var6 != null && ((Boolean) xrb0Var6.h.getValue()).booleanValue()) {
                                            }
                                            i42++;
                                            xrb0VarArr5 = xrb0VarArr5;
                                        } else if (mgcVar5 != null && iX2 == mgcVar5.x(obj)) {
                                            f(obj);
                                        }
                                        objArr2 = objArr4;
                                        arrayList10 = arrayList12;
                                        i12 = i35;
                                        arrayList11 = arrayList16;
                                        mgcVar4 = mgcVar5;
                                        i11 = i34;
                                        iArr3 = iArr4;
                                        i13 = i38;
                                        zrb0Var3.a(jsb0VarM0, c9nVar, yd50Var, i5, i6, zrb0Var3.c);
                                        if (iX2 < this.c) {
                                            arrayList19.add(jsb0VarM0);
                                        } else {
                                            arrayList10.add(jsb0VarM0);
                                        }
                                    }
                                }
                                objArr2 = objArr4;
                                arrayList10 = arrayList12;
                                i12 = i35;
                                arrayList11 = arrayList16;
                                mgcVar4 = mgcVar5;
                                i11 = i34;
                                iArr3 = iArr4;
                                i13 = i38;
                            }
                        } else {
                            oen0Var2 = oen0Var3;
                            arrayList9 = arrayList15;
                            i10 = i37;
                            arrayList10 = arrayList18;
                            mgcVar4 = mgcVar5;
                            objArr2 = objArr4;
                            i11 = i34;
                            i12 = i35;
                            iArr3 = iArr4;
                            i13 = i36;
                            arrayList11 = arrayList16;
                        }
                        j6 >>= 8;
                        i37 = i10 + 1;
                        i36 = i13;
                        arrayList18 = arrayList10;
                        iArr4 = iArr3;
                        arrayList16 = arrayList11;
                        oen0Var3 = oen0Var2;
                        arrayList15 = arrayList9;
                        i19 = i4;
                        i34 = i11;
                        i35 = i12;
                        mgcVar5 = mgcVar4;
                        objArr4 = objArr2;
                    }
                    oen0Var = oen0Var3;
                    arrayList5 = arrayList15;
                    arrayList7 = arrayList18;
                    mgcVar3 = mgcVar5;
                    objArr = objArr4;
                    i8 = i34;
                    i9 = i35;
                    mgcVar2 = mgcVar;
                    iArr = iArr4;
                    arrayList8 = arrayList16;
                    if (i36 != 8) {
                        break;
                    }
                } else {
                    oen0Var = oen0Var3;
                    arrayList5 = arrayList15;
                    arrayList7 = arrayList18;
                    mgcVar3 = mgcVar5;
                    objArr = objArr4;
                    i8 = i34;
                    i9 = i35;
                    mgcVar2 = mgcVar;
                    iArr = iArr4;
                    arrayList8 = arrayList16;
                }
                if (i9 == i8) {
                    break;
                }
                int i43 = i9 + 1;
                arrayList18 = arrayList7;
                objArr4 = objArr;
                arrayList16 = arrayList8;
                jArr2 = jArr3;
                oen0Var3 = oen0Var;
                arrayList17 = arrayList6;
                arrayList15 = arrayList5;
                i19 = i4;
                i35 = i43;
                iArr4 = iArr;
                i34 = i8;
                mgcVar5 = mgcVar3;
            }
        } else {
            oen0Var = oen0Var3;
            iArr = iArr4;
            arrayList5 = arrayList15;
            arrayList6 = arrayList17;
            arrayList7 = arrayList18;
            mgcVar2 = mgcVar;
        }
        if (arrayList19.isEmpty()) {
            iArr2 = iArr;
        } else {
            if (arrayList19.size() > 1) {
                r7h.f0(arrayList19, new asb0(mgcVar2, (byte) 3));
            }
            int size5 = arrayList19.size();
            int i44 = 0;
            while (i44 < size5) {
                jsb0 jsb0Var6 = (jsb0) arrayList19.get(i44);
                Object objG3 = nen0Var3.g(jsb0Var6.getKey());
                objG3.getClass();
                zrb0 zrb0Var4 = (zrb0) objG3;
                int[] iArr5 = iArr;
                int iH3 = h(iArr5, jsb0Var6, z);
                if (z2) {
                    long jI2 = ((jsb0) o7h.q0(arrayList)).i(0);
                    i7 = (int) (z ? jI2 & 4294967295L : jI2 >> 32);
                } else {
                    i7 = zrb0Var4.f;
                }
                jsb0Var6.a(i7 - iH3, zrb0Var4.c, i2, i3);
                if (z4) {
                    g(jsb0Var6, true);
                }
                i44++;
                iArr = iArr5;
            }
            iArr2 = iArr;
            f46.f0(0, 0, 6, iArr2);
        }
        if (!arrayList7.isEmpty()) {
            if (arrayList7.size() > 1) {
                r7h.f0(arrayList7, new asb0(mgcVar2, (byte) 1));
            }
            int size6 = arrayList7.size();
            for (int i45 = 0; i45 < size6; i45++) {
                jsb0 jsb0Var7 = (jsb0) arrayList7.get(i45);
                Object objG4 = nen0Var3.g(jsb0Var7.getKey());
                objG4.getClass();
                zrb0 zrb0Var5 = (zrb0) objG4;
                jsb0Var7.a((zrb0Var5.g - men1.z(jsb0Var7, z)) + h(iArr2, jsb0Var7, z), zrb0Var5.c, i2, i3);
                if (z4) {
                    g(jsb0Var7, true);
                }
            }
        }
        o7h.Q0(arrayList19);
        arrayList.addAll(0, arrayList19);
        arrayList.addAll(arrayList7);
        arrayList5.clear();
        arrayList6.clear();
        arrayList19.clear();
        arrayList7.clear();
        oen0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void e() {
        nen0 nen0Var = this.a;
        if (nen0Var.j()) {
            Object[] objArr = nen0Var.c;
            long[] jArr = nen0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (xrb0 xrb0Var : ((zrb0) objArr[(i << 3) + i3]).a) {
                                    if (xrb0Var != null) {
                                        xrb0Var.d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            nen0Var.a();
        }
    }

    public final void f(Object obj) {
        zrb0 zrb0Var = (zrb0) this.a.k(obj);
        if (zrb0Var != null) {
            for (xrb0 xrb0Var : zrb0Var.a) {
                if (xrb0Var != null) {
                    xrb0Var.d();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    public final void g(jsb0 jsb0Var, boolean z) {
        Object objG = this.a.g(jsb0Var.getKey());
        objG.getClass();
        xrb0[] xrb0VarArr = ((zrb0) objG).a;
        int length = xrb0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            xrb0 xrb0Var = xrb0VarArr[i];
            int i3 = i2 + 1;
            if (xrb0Var != null) {
                long jI = jsb0Var.i(i2);
                long j = xrb0Var.l;
                if (!qr80.b(j, 9223372034707292159L) && !qr80.b(j, jI)) {
                    long jC = qr80.c(jI, j);
                    ni20 ni20Var = xrb0Var.e;
                    if (ni20Var != null) {
                        long jC2 = qr80.c(((qr80) xrb0Var.r.getValue()).a, jC);
                        xrb0Var.e(jC2);
                        xrb0Var.h.setValue(Boolean.TRUE);
                        xrb0Var.g = z;
                        c921.y(xrb0Var.a, (o8n) null, 0, new d6(xrb0Var, ni20Var, jC2, (lnm) null, (byte) 6), 3);
                    }
                }
                xrb0Var.l = jI;
            } else {
                xrb0VarArr = xrb0VarArr;
            }
            i++;
            xrb0VarArr = xrb0VarArr;
            i2 = i3;
        }
    }
}
