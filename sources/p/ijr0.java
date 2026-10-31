package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ijr0 {
    public final l1p0 a;
    public final fdn0 b;
    public final gdn0 c;
    public final ddn0 d;
    public final fdn0 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final tsb0 n;
    public final rzo0 o;

    public ijr0(l1p0 l1p0Var, tsb0 tsb0Var, lsb0 lsb0Var) {
        this.a = l1p0Var;
        fdn0 fdn0Var = pr80.a;
        this.b = new fdn0();
        this.c = new gdn0();
        int i = ir80.a;
        this.d = new ddn0();
        this.e = new fdn0();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = tsb0Var;
        this.o = new rzo0(lsb0Var);
    }

    public final int a(rzo0 rzo0Var, int i, boolean z) {
        int i2;
        kov0 kov0VarF;
        List list;
        List list2;
        fdn0 fdn0Var = this.e;
        if (fdn0Var.a(i)) {
            Object objB = fdn0Var.b(i);
            objB.getClass();
            return ((gtc) objB).b;
        }
        fdn0 fdn0Var2 = this.b;
        int i3 = 0;
        if (fdn0Var2.a(i)) {
            if (!z || (list2 = (List) fdn0Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i3 < size) {
                ((ssb0) list2.get(i3)).a();
                i3++;
            }
            return -1;
        }
        ssc sscVar = new ssc(this, rzo0Var, (byte) 0);
        long j = rzo0Var.u().u;
        tsb0 tsb0Var = (tsb0) rzo0Var.d;
        if (tsb0Var == null) {
            u890.C("state");
            throw null;
        }
        gub0 gub0Var = new gub0(sscVar, rzo0Var, (byte) 10);
        rl1 rl1Var = tsb0Var.c;
        if (rl1Var != null) {
            i2 = i;
            kov0VarF = rl1Var.F(i2, j, tsb0Var.b, true, gub0Var);
        } else {
            i2 = i;
            kov0VarF = vev.a;
        }
        fdn0Var2.i(i2, Collections.singletonList(kov0VarF));
        if (!z || (list = (List) fdn0Var2.b(i2)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i3 < size2) {
            ((ssb0) list.get(i3)).a();
            i3++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(rzo0 rzo0Var, int i, int i2) {
        int i3;
        int i4;
        fdn0 fdn0Var = this.e;
        gtc gtcVar = (gtc) fdn0Var.b(i);
        avw0 avw0Var = gtc.c;
        if (gtcVar != null) {
            gtcVar.b = i2;
            gtcVar.a = avw0Var;
        } else {
            gtcVar = new gtc();
            gtcVar.a = avw0Var;
            gtcVar.b = i2;
        }
        fdn0Var.i(i, gtcVar);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            } else {
                i4 = -1;
            }
        } else if (Math.signum(this.f) <= 0.0f || this.j <= 0) {
            i4 = -1;
        } else {
            i3 = this.h - 1;
            i4 = i3;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            ssc sscVar = new ssc(this, rzo0Var, (byte) 1);
            long j = rzo0Var.u().u;
            tsb0 tsb0Var = (tsb0) rzo0Var.d;
            if (tsb0Var == null) {
                u890.C("state");
                throw null;
            }
            gub0 gub0Var = new gub0(sscVar, rzo0Var, (byte) 10);
            rl1 rl1Var = tsb0Var.c;
            this.b.i(i4, Collections.singletonList(rl1Var != null ? rl1Var.F(i4, j, tsb0Var.b, true, gub0Var) : vev.a));
        }
        h();
    }

    public final void d(rzo0 rzo0Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iU = jch0.U(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iU > i8) {
                    iU = i8;
                }
                this.j = iU;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(rzo0Var, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iU2 = jch0.U(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iU2 > i9) {
                iU2 = i9;
            }
            this.k = iU2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int iA2 = a(rzo0Var, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void e(rzo0 rzo0Var, float f) {
        ijr0 ijr0Var;
        float f2;
        int i;
        int i2;
        h();
        if (rzo0Var.r()) {
            d1o1.j(rzo0Var.u());
            rzo0Var.u();
            this.m = rzo0Var.z();
            int iQ = rzo0Var.q();
            int iS = rzo0Var.s();
            int iZ = rzo0Var.z();
            int iW = rzo0Var.w();
            int iV = rzo0Var.v();
            fdn0 fdn0Var = this.e;
            if (f <= 0.0f) {
                this.j = 0 - iW;
                this.h = iQ;
                while (this.j > 0 && (i2 = this.h) > 0 && fdn0Var.a(i2 - 1)) {
                    Object objB = fdn0Var.b(this.h - 1);
                    objB.getClass();
                    int i3 = ((gtc) objB).b;
                    this.h--;
                    this.j -= i3;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - iV;
                this.i = iS;
                while (this.k > 0 && (i = this.i) < iZ - 1 && fdn0Var.a(i + 1)) {
                    Object objB2 = fdn0Var.b(this.i + 1);
                    objB2.getClass();
                    int i4 = ((gtc) objB2).b;
                    this.i++;
                    this.k -= i4;
                }
                f(this.i + 1, iZ - 1);
            }
        }
        if (rzo0Var.r()) {
            d1o1.j(rzo0Var.u());
            ijr0Var = this;
            f2 = f;
            ijr0Var.d(rzo0Var, rzo0Var.q(), rzo0Var.s(), rzo0Var.u().t != null ? ((jkr0) this.a.b).o : 0, rzo0Var.v(), rzo0Var.w(), f2, f <= 0.0f);
        } else {
            ijr0Var = this;
            f2 = f;
        }
        ijr0Var.f = f2;
        ijr0Var.h();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        gdn0 gdn0Var = this.c;
        gdn0Var.b();
        fdn0 fdn0Var = this.b;
        int[] iArr2 = fdn0Var.b;
        long[] jArr2 = fdn0Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            gdn0Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        ddn0 ddn0Var = this.d;
        int[] iArr3 = ddn0Var.b;
        long[] jArr3 = ddn0Var.a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                gdn0Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        fdn0 fdn0Var2 = this.e;
        int[] iArr4 = fdn0Var2.b;
        long[] jArr4 = fdn0Var2.a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            gdn0Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        int[] iArr5 = gdn0Var.b;
        long[] jArr5 = gdn0Var.a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) fdn0Var.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((ssb0) list.get(i19)).cancel();
                            }
                        }
                        int iC = ddn0Var.c(i18);
                        if (iC >= 0) {
                            ddn0Var.e--;
                            long[] jArr6 = ddn0Var.a;
                            int i20 = ddn0Var.d;
                            int i21 = iC >> 3;
                            int i22 = (iC & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iC - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        fdn0Var2.g(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        fdn0 fdn0Var = this.b;
        long[] jArr = fdn0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = fdn0Var.b[i4];
                        List list = (List) fdn0Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((ssb0) list.get(i6)).cancel();
                        }
                        fdn0Var.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h() {
        d55.k(this.j, "prefetchWindowStartExtraSpace");
        d55.k(this.k, "prefetchWindowEndExtraSpace");
        d55.k(this.h, "prefetchWindowStartIndex");
        d55.k(this.i, "prefetchWindowEndIndex");
    }
}
