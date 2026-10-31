package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fw91 {
    public final iu30 a;
    public Object b;
    public sdn0 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final nen0 e = dm5.C();
    public final nen0 f = new nen0();
    public final oen0 g = new oen0();
    public final bfn0 h = new bfn0(0, new mdt[16]);
    public final ew91 i = new ew91(this);
    public final nen0 l = dm5.C();
    public final HashMap m = new HashMap();

    public fw91(iu30 iu30Var) {
        this.a = iu30Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fw91.a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, sdn0 sdn0Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = sdn0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = sdn0Var.c[iC];
        }
        sdn0Var.b[iC] = obj;
        sdn0Var.c[iC] = i;
        if ((obj instanceof mdt) && i2 != i) {
            ldt ldtVarT = ((mdt) obj).t();
            this.m.put(obj, ldtVarT.f);
            sdn0 sdn0Var2 = ldtVarT.e;
            nen0 nen0Var = this.l;
            dm5.a0(nen0Var, obj);
            Object[] objArr = sdn0Var2.b;
            long[] jArr = sdn0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                ypb1 ypb1Var = (ypb1) objArr[(i3 << 3) + i5];
                                if (ypb1Var instanceof zpb1) {
                                    ((zpb1) ypb1Var).r(2);
                                }
                                dm5.g(nen0Var, ypb1Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof zpb1) {
                ((zpb1) obj).r(2);
            }
            dm5.g(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        nen0 nen0Var = this.e;
        dm5.Z(nen0Var, obj2, obj);
        if (!(obj2 instanceof mdt) || nen0Var.c(obj2)) {
            return;
        }
        dm5.a0(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
    public final void d(g6f0 g6f0Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        nen0 nen0Var = this.f;
        long[] jArr3 = nen0Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = nen0Var.b[i6];
                        j2 = j4;
                        sdn0 sdn0Var = (sdn0) nen0Var.c[i6];
                        Boolean bool = (Boolean) g6f0Var.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = sdn0Var.b;
                            int[] iArr = sdn0Var.c;
                            long[] jArr4 = sdn0Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else if (i8 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                        }
                        if (bool.booleanValue()) {
                            nen0Var.l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
