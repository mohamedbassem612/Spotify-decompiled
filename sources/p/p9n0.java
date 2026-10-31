package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p9n0 implements q8u0 {
    public final /* synthetic */ byte a = 1;
    public final mr20 b;
    public final /* synthetic */ yzc0 c;
    public final mr20 d;
    public final mr20 e;
    public final /* synthetic */ s160 f;

    public p9n0(yzc0 yzc0Var, q9n0 q9n0Var) {
        this.c = yzc0Var;
        this.f = q9n0Var;
        this.d = new r6k0(yzc0Var.j(), (byte) 10);
        this.e = new r6k0(yzc0Var.j(), (byte) 11);
        this.b = yzc0Var.a();
    }

    public final mr20 a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0237  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x020a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0212  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x021a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public final Object b(tv80 tv80Var, lnm lnmVar) {
        o9n0 o9n0Var;
        bdb1 bdb1Var;
        boolean zBooleanValue;
        Object objC;
        tv80 tv80Var2;
        boolean z;
        boolean zBooleanValue2;
        i1r i1rVarN;
        i1r i1rVar;
        cmj1 cmj1Var;
        int iOrdinal;
        boolean z2;
        Object objB;
        tv80 tv80Var3;
        boolean zBooleanValue3;
        boolean z3;
        boolean z4;
        Object obj;
        edb1 edb1Var;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        int i2;
        Object objC2;
        boolean z8;
        edb1 edb1Var2;
        Object obj2;
        c9c0 c9c0Var;
        z9k0 z9k0Var;
        boolean z9;
        boolean z10;
        tv80 tv80Var4 = tv80Var;
        byte b = this.a;
        Object obj3 = d9n.a;
        s160 s160Var = this.f;
        yzc0 yzc0Var = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof o9n0) {
                    o9n0Var = (o9n0) lnmVar;
                    int i3 = o9n0Var.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        o9n0Var.d = i3 - Integer.MIN_VALUE;
                    } else {
                        o9n0Var = new o9n0(this, (onm) lnmVar);
                    }
                } else {
                    o9n0Var = new o9n0(this, (onm) lnmVar);
                }
                Object objB2 = o9n0Var.b;
                int i4 = o9n0Var.d;
                if (i4 == 0) {
                    hm5.M(objB2);
                    yjp1 yjp1Var = rjy0.a;
                    o9n0Var.a = tv80Var4;
                    o9n0Var.d = 1;
                    objB2 = yzc0Var.b(tv80Var4, yjp1Var, o9n0Var);
                    if (objB2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tv80Var4 = o9n0Var.a;
                    hm5.M(objB2);
                }
                Boolean bool = (Boolean) objB2;
                if (!bool.booleanValue()) {
                    return bool;
                }
                e7p0.d(((q9n0) s160Var).c, tv80Var4.a);
                return bool;
            default:
                edb1 edb1Var3 = (edb1) s160Var;
                if (lnmVar instanceof bdb1) {
                    bdb1Var = (bdb1) lnmVar;
                    int i5 = bdb1Var.t;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bdb1Var.t = i5 - Integer.MIN_VALUE;
                    } else {
                        bdb1Var = new bdb1(this, (onm) lnmVar);
                    }
                } else {
                    bdb1Var = new bdb1(this, (onm) lnmVar);
                }
                Object objE = bdb1Var.h;
                int i6 = bdb1Var.t;
                Object obj4 = rih1.a;
                switch (i6) {
                    case 0:
                        hm5.M(objE);
                        bdb1Var.a = tv80Var4;
                        bdb1Var.t = 1;
                        objE = edb1Var3.e(this, bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        zBooleanValue = ((Boolean) objE).booleanValue();
                        bdb1Var.a = tv80Var4;
                        bdb1Var.d = zBooleanValue;
                        bdb1Var.t = 2;
                        objC = c(bdb1Var);
                        if (objC == obj3) {
                            return obj3;
                        }
                        tv80Var2 = tv80Var4;
                        z = zBooleanValue;
                        objE = objC;
                        zBooleanValue2 = ((Boolean) objE).booleanValue();
                        if (zBooleanValue2) {
                            bdb1Var.a = tv80Var2;
                            bdb1Var.d = z;
                            bdb1Var.e = zBooleanValue2;
                            bdb1Var.t = 3;
                            i1rVarN = x2p1.n(edb1Var3.b, edb1Var3.O0, obj4);
                            if (i1rVarN instanceof i1r) {
                                i1rVar = i1rVarN;
                            } else {
                                i1rVar = null;
                            }
                            if (i1rVar != null || (cmj1Var = (cmj1) i1rVar.a) == null) {
                                cmj1Var = cmj1.a;
                            }
                            iOrdinal = cmj1Var.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    objE = edb1Var3.a(bdb1Var);
                                } else {
                                    if (iOrdinal != 2) {
                                        eg.o();
                                        return null;
                                    }
                                    z2 = true;
                                }
                                if (objE == obj3) {
                                    return obj3;
                                }
                                if (((Boolean) objE).booleanValue()) {
                                    bdb1Var.a = null;
                                    bdb1Var.d = z;
                                    bdb1Var.e = zBooleanValue2;
                                    bdb1Var.t = 4;
                                    objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                                    if (objB == obj3) {
                                        return obj3;
                                    }
                                    return objB;
                                }
                            } else {
                                z2 = false;
                            }
                            objE = Boolean.valueOf(z2);
                            if (objE == obj3) {
                                return obj3;
                            }
                            if (((Boolean) objE).booleanValue()) {
                                bdb1Var.a = null;
                                bdb1Var.d = z;
                                bdb1Var.e = zBooleanValue2;
                                bdb1Var.t = 4;
                                objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                                if (objB == obj3) {
                                    return obj3;
                                }
                                return objB;
                            }
                        }
                        yjp1 yjp1Var2 = tjy0.a;
                        bdb1Var.a = tv80Var2;
                        bdb1Var.d = z;
                        bdb1Var.e = zBooleanValue2;
                        bdb1Var.t = 5;
                        objE = yzc0Var.b(tv80Var2, yjp1Var2, bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        tv80Var3 = tv80Var2;
                        zBooleanValue3 = ((Boolean) objE).booleanValue();
                        if (!zBooleanValue3 && z && zBooleanValue2) {
                            kqi0 kqi0Var = edb1Var3.e;
                            bdb1Var.a = tv80Var3;
                            bdb1Var.b = objE;
                            bdb1Var.c = edb1Var3;
                            bdb1Var.d = z;
                            bdb1Var.e = zBooleanValue2;
                            bdb1Var.f = zBooleanValue3;
                            bdb1Var.g = 0;
                            bdb1Var.t = 6;
                            Object objS = smo1.s(new oxj0(kqi0Var, null, (byte) 1), bdb1Var);
                            if (objS == obj3) {
                                return obj3;
                            }
                            obj = objE;
                            objE = objS;
                            z6 = z;
                            z7 = zBooleanValue3;
                            z3 = zBooleanValue2;
                            i2 = 0;
                            if (((Boolean) objE).booleanValue()) {
                                bdb1Var.a = null;
                                bdb1Var.b = obj;
                                bdb1Var.c = edb1Var3;
                                bdb1Var.d = z6;
                                bdb1Var.e = z3;
                                bdb1Var.f = z7;
                                bdb1Var.g = i2;
                                bdb1Var.t = 7;
                                objC2 = edb1Var3.X.c(edb1Var3.d, z8k0.a, tv80Var3, bdb1Var);
                                if (objC2 == obj3) {
                                    obj4 = objC2;
                                }
                                if (obj4 == obj3) {
                                    return obj3;
                                }
                                boolean z11 = z6;
                                edb1Var = edb1Var3;
                                z5 = z11;
                                boolean z12 = z7;
                                i = i2;
                                z4 = z12;
                            } else {
                                boolean z13 = z7;
                                i = i2;
                                z4 = z13;
                                boolean z14 = z6;
                                edb1Var = edb1Var3;
                                z5 = z14;
                            }
                        } else {
                            z3 = zBooleanValue2;
                            z4 = zBooleanValue3;
                            obj = objE;
                            edb1Var = edb1Var3;
                            z5 = z;
                            i = 0;
                        }
                        kqi0 kqi0Var2 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var2, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue() && z4 && z8) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC = edb1Var2.g.c();
                            z10 = l0lVarC != null ? !l0lVarC.l() : false;
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool2 = (Boolean) obj2;
                        bool2.getClass();
                        return bool2;
                    case 1:
                        tv80Var4 = bdb1Var.a;
                        hm5.M(objE);
                        zBooleanValue = ((Boolean) objE).booleanValue();
                        bdb1Var.a = tv80Var4;
                        bdb1Var.d = zBooleanValue;
                        bdb1Var.t = 2;
                        objC = c(bdb1Var);
                        if (objC == obj3) {
                            return obj3;
                        }
                        tv80Var2 = tv80Var4;
                        z = zBooleanValue;
                        objE = objC;
                        zBooleanValue2 = ((Boolean) objE).booleanValue();
                        if (zBooleanValue2) {
                            bdb1Var.a = tv80Var2;
                            bdb1Var.d = z;
                            bdb1Var.e = zBooleanValue2;
                            bdb1Var.t = 3;
                            i1rVarN = x2p1.n(edb1Var3.b, edb1Var3.O0, obj4);
                            if (i1rVarN instanceof i1r) {
                                i1rVar = i1rVarN;
                            } else {
                                i1rVar = null;
                            }
                            if (i1rVar != null) {
                                cmj1Var = cmj1.a;
                            } else {
                                cmj1Var = cmj1.a;
                            }
                            iOrdinal = cmj1Var.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    objE = edb1Var3.a(bdb1Var);
                                } else {
                                    if (iOrdinal != 2) {
                                        eg.o();
                                        return null;
                                    }
                                    z2 = true;
                                }
                                if (objE == obj3) {
                                    return obj3;
                                }
                                if (((Boolean) objE).booleanValue()) {
                                    bdb1Var.a = null;
                                    bdb1Var.d = z;
                                    bdb1Var.e = zBooleanValue2;
                                    bdb1Var.t = 4;
                                    objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                                    if (objB == obj3) {
                                        return obj3;
                                    }
                                    return objB;
                                }
                            } else {
                                z2 = false;
                            }
                            objE = Boolean.valueOf(z2);
                            if (objE == obj3) {
                                return obj3;
                            }
                            if (((Boolean) objE).booleanValue()) {
                                bdb1Var.a = null;
                                bdb1Var.d = z;
                                bdb1Var.e = zBooleanValue2;
                                bdb1Var.t = 4;
                                objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                                if (objB == obj3) {
                                    return obj3;
                                }
                                return objB;
                            }
                        }
                        yjp1 yjp1Var3 = tjy0.a;
                        bdb1Var.a = tv80Var2;
                        bdb1Var.d = z;
                        bdb1Var.e = zBooleanValue2;
                        bdb1Var.t = 5;
                        objE = yzc0Var.b(tv80Var2, yjp1Var3, bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        tv80Var3 = tv80Var2;
                        zBooleanValue3 = ((Boolean) objE).booleanValue();
                        if (!zBooleanValue3) {
                        }
                        z3 = zBooleanValue2;
                        z4 = zBooleanValue3;
                        obj = objE;
                        edb1Var = edb1Var3;
                        z5 = z;
                        i = 0;
                        kqi0 kqi0Var3 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var3, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC2 = edb1Var2.g.c();
                            if (l0lVarC2 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool3 = (Boolean) obj2;
                        bool3.getClass();
                        return bool3;
                    case 2:
                        boolean z15 = bdb1Var.d;
                        tv80 tv80Var5 = bdb1Var.a;
                        hm5.M(objE);
                        tv80Var2 = tv80Var5;
                        z = z15;
                        zBooleanValue2 = ((Boolean) objE).booleanValue();
                        if (zBooleanValue2) {
                            bdb1Var.a = tv80Var2;
                            bdb1Var.d = z;
                            bdb1Var.e = zBooleanValue2;
                            bdb1Var.t = 3;
                            i1rVarN = x2p1.n(edb1Var3.b, edb1Var3.O0, obj4);
                            if (i1rVarN instanceof i1r) {
                                i1rVar = i1rVarN;
                            } else {
                                i1rVar = null;
                            }
                            if (i1rVar != null) {
                                cmj1Var = cmj1.a;
                            } else {
                                cmj1Var = cmj1.a;
                            }
                            iOrdinal = cmj1Var.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    objE = edb1Var3.a(bdb1Var);
                                } else {
                                    if (iOrdinal != 2) {
                                        eg.o();
                                        return null;
                                    }
                                    z2 = true;
                                }
                                if (objE == obj3) {
                                    return obj3;
                                }
                                if (((Boolean) objE).booleanValue()) {
                                    bdb1Var.a = null;
                                    bdb1Var.d = z;
                                    bdb1Var.e = zBooleanValue2;
                                    bdb1Var.t = 4;
                                    objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                                    if (objB == obj3) {
                                        return obj3;
                                    }
                                    return objB;
                                }
                            } else {
                                z2 = false;
                            }
                            objE = Boolean.valueOf(z2);
                            if (objE == obj3) {
                                return obj3;
                            }
                            if (((Boolean) objE).booleanValue()) {
                                bdb1Var.a = null;
                                bdb1Var.d = z;
                                bdb1Var.e = zBooleanValue2;
                                bdb1Var.t = 4;
                                objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                                if (objB == obj3) {
                                    return obj3;
                                }
                                return objB;
                            }
                        }
                        yjp1 yjp1Var4 = tjy0.a;
                        bdb1Var.a = tv80Var2;
                        bdb1Var.d = z;
                        bdb1Var.e = zBooleanValue2;
                        bdb1Var.t = 5;
                        objE = yzc0Var.b(tv80Var2, yjp1Var4, bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        tv80Var3 = tv80Var2;
                        zBooleanValue3 = ((Boolean) objE).booleanValue();
                        if (!zBooleanValue3) {
                        }
                        z3 = zBooleanValue2;
                        z4 = zBooleanValue3;
                        obj = objE;
                        edb1Var = edb1Var3;
                        z5 = z;
                        i = 0;
                        kqi0 kqi0Var4 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var4, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC3 = edb1Var2.g.c();
                            if (l0lVarC3 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool4 = (Boolean) obj2;
                        bool4.getClass();
                        return bool4;
                    case 3:
                        zBooleanValue2 = bdb1Var.e;
                        z = bdb1Var.d;
                        tv80Var2 = bdb1Var.a;
                        hm5.M(objE);
                        if (((Boolean) objE).booleanValue()) {
                            bdb1Var.a = null;
                            bdb1Var.d = z;
                            bdb1Var.e = zBooleanValue2;
                            bdb1Var.t = 4;
                            objB = edb1Var3.b(yzc0Var, tv80Var2, bdb1Var);
                            if (objB == obj3) {
                                return obj3;
                            }
                            return objB;
                        }
                        yjp1 yjp1Var5 = tjy0.a;
                        bdb1Var.a = tv80Var2;
                        bdb1Var.d = z;
                        bdb1Var.e = zBooleanValue2;
                        bdb1Var.t = 5;
                        objE = yzc0Var.b(tv80Var2, yjp1Var5, bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        tv80Var3 = tv80Var2;
                        zBooleanValue3 = ((Boolean) objE).booleanValue();
                        if (!zBooleanValue3) {
                        }
                        z3 = zBooleanValue2;
                        z4 = zBooleanValue3;
                        obj = objE;
                        edb1Var = edb1Var3;
                        z5 = z;
                        i = 0;
                        kqi0 kqi0Var5 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var5, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC4 = edb1Var2.g.c();
                            if (l0lVarC4 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool5 = (Boolean) obj2;
                        bool5.getClass();
                        return bool5;
                    case 4:
                        hm5.M(objE);
                        return objE;
                    case 5:
                        zBooleanValue2 = bdb1Var.e;
                        z = bdb1Var.d;
                        tv80Var2 = bdb1Var.a;
                        hm5.M(objE);
                        tv80Var3 = tv80Var2;
                        zBooleanValue3 = ((Boolean) objE).booleanValue();
                        if (!zBooleanValue3) {
                        }
                        z3 = zBooleanValue2;
                        z4 = zBooleanValue3;
                        obj = objE;
                        edb1Var = edb1Var3;
                        z5 = z;
                        i = 0;
                        kqi0 kqi0Var6 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var6, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC5 = edb1Var2.g.c();
                            if (l0lVarC5 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool6 = (Boolean) obj2;
                        bool6.getClass();
                        return bool6;
                    case 6:
                        i2 = bdb1Var.g;
                        z7 = bdb1Var.f;
                        z3 = bdb1Var.e;
                        boolean z16 = bdb1Var.d;
                        edb1 edb1Var4 = bdb1Var.c;
                        obj = bdb1Var.b;
                        tv80Var3 = bdb1Var.a;
                        hm5.M(objE);
                        z6 = z16;
                        edb1Var3 = edb1Var4;
                        if (((Boolean) objE).booleanValue()) {
                            bdb1Var.a = null;
                            bdb1Var.b = obj;
                            bdb1Var.c = edb1Var3;
                            bdb1Var.d = z6;
                            bdb1Var.e = z3;
                            bdb1Var.f = z7;
                            bdb1Var.g = i2;
                            bdb1Var.t = 7;
                            objC2 = edb1Var3.X.c(edb1Var3.d, z8k0.a, tv80Var3, bdb1Var);
                            if (objC2 == obj3) {
                                obj4 = objC2;
                            }
                            if (obj4 == obj3) {
                                return obj3;
                            }
                            boolean z17 = z6;
                            edb1Var = edb1Var3;
                            z5 = z17;
                            boolean z18 = z7;
                            i = i2;
                            z4 = z18;
                        } else {
                            boolean z19 = z7;
                            i = i2;
                            z4 = z19;
                            boolean z110 = z6;
                            edb1Var = edb1Var3;
                            z5 = z110;
                        }
                        kqi0 kqi0Var7 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var7, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC6 = edb1Var2.g.c();
                            if (l0lVarC6 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool7 = (Boolean) obj2;
                        bool7.getClass();
                        return bool7;
                    case 7:
                        i2 = bdb1Var.g;
                        z7 = bdb1Var.f;
                        z3 = bdb1Var.e;
                        z5 = bdb1Var.d;
                        edb1Var = bdb1Var.c;
                        obj = bdb1Var.b;
                        hm5.M(objE);
                        boolean z111 = z7;
                        i = i2;
                        z4 = z111;
                        kqi0 kqi0Var8 = edb1Var.e;
                        bdb1Var.a = null;
                        bdb1Var.b = obj;
                        bdb1Var.c = edb1Var;
                        bdb1Var.d = z5;
                        bdb1Var.e = z3;
                        bdb1Var.f = z4;
                        bdb1Var.g = i;
                        bdb1Var.t = 8;
                        objE = smo1.s(new oxj0(kqi0Var8, null, (byte) 0), bdb1Var);
                        if (objE == obj3) {
                            return obj3;
                        }
                        z8 = z3;
                        edb1Var2 = edb1Var;
                        obj2 = obj;
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC7 = edb1Var2.g.c();
                            if (l0lVarC7 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool8 = (Boolean) obj2;
                        bool8.getClass();
                        return bool8;
                    case 8:
                        z4 = bdb1Var.f;
                        z8 = bdb1Var.e;
                        edb1Var2 = bdb1Var.c;
                        obj2 = bdb1Var.b;
                        hm5.M(objE);
                        if (((Boolean) objE).booleanValue()) {
                            c9c0Var = edb1Var2.a;
                            z9k0Var = edb1Var2.Q0;
                            if (c9c0Var.b.current().getValue() != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            l0l l0lVarC8 = edb1Var2.g.c();
                            if (l0lVarC8 != null) {
                            }
                            if (z9) {
                                z9k0.a(z9k0Var, x9k0.a);
                            } else if (z10) {
                                z9k0.a(z9k0Var, v9k0.a);
                            }
                        }
                        Boolean bool9 = (Boolean) obj2;
                        bool9.getClass();
                        return bool9;
                    default:
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6 == r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.ycb1
            if (r0 == 0) goto L13
            r0 = r6
            p.ycb1 r0 = (p.ycb1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ycb1 r0 = new p.ycb1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p.hm5.M(r6)
            goto L62
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L31:
            p.hm5.M(r6)
            goto L49
        L35:
            p.hm5.M(r6)
            p.mr20 r6 = r5.d
            p.jha1 r6 = (p.jha1) r6
            p.wt20 r6 = p.z4p1.F(r6, r3)
            r0.c = r3
            java.lang.Object r6 = p.b5p1.i(r6, r0)
            if (r6 != r4) goto L49
            goto L61
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L6b
            p.mr20 r5 = r5.e
            p.jha1 r5 = (p.jha1) r5
            p.wt20 r5 = p.z4p1.F(r5, r3)
            r0.c = r2
            java.lang.Object r6 = p.b5p1.i(r5, r0)
            if (r6 != r4) goto L62
        L61:
            return r4
        L62:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L6b
            goto L6c
        L6b:
            r3 = 0
        L6c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p9n0.c(p.onm):java.lang.Object");
    }

    public final mr20 i() {
        byte b = this.a;
        jha1 jha1Var = this.e;
        switch (b) {
            case 0:
                return (r6k0) jha1Var;
            default:
                return jha1Var;
        }
    }

    public final mr20 isActive() {
        byte b = this.a;
        jha1 jha1Var = this.d;
        switch (b) {
            case 0:
                return (r6k0) jha1Var;
            default:
                return jha1Var;
        }
    }

    public p9n0(yzc0 yzc0Var, edb1 edb1Var) {
        this.c = yzc0Var;
        this.f = edb1Var;
        this.d = new jha1(yzc0Var.j(), (byte) 7);
        this.e = new jha1(yzc0Var.j(), (byte) 8);
        this.b = yzc0Var.a();
    }
}
