package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ldt extends cqb1 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public sdn0 e;
    public Object f;
    public int g;

    public ldt(long j) {
        super(j);
        this.e = kfp0.a;
        this.f = h;
    }

    @Override // p.cqb1
    public final void a(cqb1 cqb1Var) {
        ldt ldtVar = (ldt) cqb1Var;
        this.e = ldtVar.e;
        this.f = ldtVar.f;
        this.g = ldtVar.g;
    }

    @Override // p.cqb1
    public final cqb1 c(long j) {
        return new ldt(j);
    }

    public final boolean d(mdt mdtVar, jv91 jv91Var) {
        boolean z;
        boolean z2;
        Object obj = pv91.c;
        synchronized (obj) {
            z = true;
            z2 = (this.c == jv91Var.g() && this.d == jv91Var.h()) ? false : true;
        }
        if (this.f == h || (z2 && this.g != e(mdtVar, jv91Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = jv91Var.g();
            this.d = jv91Var.h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
      0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[LOOP:5: B:62:0x014a->B:63:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [p.ldt] */
    /* JADX WARN: Type inference failed for: r13v5, types: [p.cqb1] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, p.cqb1] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final int e(mdt mdtVar, jv91 jv91Var) {
        sdn0 sdn0Var;
        int iN;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j;
        long j2;
        int i4;
        ?? r26;
        ?? G;
        synchronized (pv91.c) {
            sdn0Var = this.e;
        }
        int i5 = 7;
        if (sdn0Var.e == 0) {
            return 7;
        }
        bfn0 bfn0VarK = xto.k();
        Object[] objArr4 = bfn0VarK.a;
        int i6 = bfn0VarK.c;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((ndt) objArr4[i7]).start();
        }
        try {
            Object[] objArr5 = sdn0Var.b;
            int[] iArr = sdn0Var.c;
            long[] jArr3 = sdn0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iN = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i3 = i5;
                        ?? r3 = z;
                        while (r3 < i10) {
                            if ((j3 & 255) < 128) {
                                ?? r18 = (i8 << 3) + r3;
                                j2 = j4;
                                ypb1 ypb1Var = (ypb1) objArr5[r18];
                                int i11 = i9;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr3 = objArr5;
                                    j = j3;
                                } else {
                                    if (ypb1Var instanceof mdt) {
                                        mdt mdtVar2 = (mdt) ypb1Var;
                                        G = mdtVar2.s((ldt) pv91.g(mdtVar2.d, jv91Var), jv91Var, z, mdtVar2.b);
                                        sdn0 sdn0Var2 = G.e;
                                        Object[] objArr6 = sdn0Var2.b;
                                        long[] jArr4 = sdn0Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j5 = jArr4[i12];
                                                j = j3;
                                                int iN2 = iN;
                                                if ((((~j5) << i3) & j5 & j2) == j2) {
                                                    iN = iN2;
                                                    if (i12 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                } else {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j5 & 255) < 128) {
                                                            iN2 = (iN2 * 31) + hyo1.n((ypb1) objArr6[(i12 << 3) + i14]);
                                                        }
                                                        j5 >>= i11;
                                                    }
                                                    if (i13 != i11) {
                                                        iN = iN2;
                                                        break;
                                                    }
                                                    iN = iN2;
                                                    if (i12 != length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        j = j3;
                                        G = pv91.g(ypb1Var.k(), jv91Var);
                                    }
                                    iN = (((iN * 31) + hyo1.n((Object) G)) * 31) + Long.hashCode(G.a);
                                    r25 = r26;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr3 = objArr5;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr5 = objArr3;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = i5;
                        objArr2 = objArr5;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z = false;
                    } else {
                        i5 = iN;
                    }
                }
                objArr = bfn0VarK.a;
                i = bfn0VarK.c;
                for (i2 = 0; i2 < i; i2++) {
                    ((ndt) objArr[i2]).a();
                }
                return iN;
            }
            iN = i5;
            objArr = bfn0VarK.a;
            i = bfn0VarK.c;
            while (i2 < i) {
                ((ndt) objArr[i2]).a();
            }
            return iN;
        } catch (Throwable th) {
            Object[] objArr7 = bfn0VarK.a;
            int i15 = bfn0VarK.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((ndt) objArr7[i16]).a();
            }
            throw th;
        }
    }
}
