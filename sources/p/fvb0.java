package p;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fvb0 implements ct41 {
    public static final df41 x = kyo1.t(new pv40((byte) 22), new n75(29));
    public boolean a;
    public yub0 b;
    public final uu0 c;
    public final hrr0 d = new hrr0(zub0.a, f331.X0);
    public final mgc e = new mgc((byte) 17);
    public final hrr0 f;
    public final hrr0 g;
    public hmb0 h;
    public final spb0 i;
    public final qc9 j;
    public final laz k;
    public final boolean l;
    public final tsb0 m;
    public final jns n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f49p;
    public final fdn0 q;
    public final jdn0 r;
    public final qsb0 s;
    public final bsb0 t;
    public final ven0 u;
    public final ven0 v;
    public final x390 w;

    public fvb0(int[] iArr, int[] iArr2) {
        this.c = new uu0(iArr, iArr2, new c4z(2, this, fvb0.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, (byte) 17));
        Boolean bool = Boolean.FALSE;
        this.f = v8r.q(bool);
        this.g = v8r.q(bool);
        this.i = new spb0(this, (byte) 2);
        this.j = new qc9();
        this.k = new laz();
        this.l = true;
        this.m = new tsb0((iu30) null);
        this.n = new jns(new gv20((Object) this, (byte) 20));
        this.f49p = -1;
        fdn0 fdn0Var = pr80.a;
        this.q = new fdn0();
        this.r = new jdn0();
        this.s = new qsb0();
        this.t = new bsb0();
        this.u = s8p1.j();
        this.v = s8p1.j();
        this.w = new x390();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.n.a(r7, r8, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.hfn0 r7, p.vu30 r8, p.lnm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.evb0
            if (r0 == 0) goto L13
            r0 = r9
            p.evb0 r0 = (p.evb0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.evb0 r0 = new p.evb0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.a8d1 r7 = r0.b
            r8 = r7
            p.vu30 r8 = (p.vu30) r8
            p.hfn0 r7 = r0.a
            p.hm5.M(r9)
            goto L5b
        L3c:
            p.hm5.M(r9)
            p.hrr0 r9 = r6.d
            java.lang.Object r9 = r9.getValue()
            p.yub0 r1 = p.zub0.a
            if (r9 != r1) goto L5b
            r0.a = r7
            r9 = r8
            p.a8d1 r9 = (p.a8d1) r9
            r0.b = r9
            r0.e = r4
            p.qc9 r9 = r6.j
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.a = r2
            r0.b = r2
            r0.e = r3
            p.jns r6 = r6.n
            java.lang.Object r6 = r6.a(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fvb0.a(p.hfn0, p.vu30, p.lnm):java.lang.Object");
    }

    public final boolean b() {
        return this.n.b();
    }

    public final boolean c() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final float e(float f) {
        return this.n.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x014b A[LOOP:1: B:62:0x010f->B:72:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x014f A[EDGE_INSN: B:95:0x014f->B:73:0x014f BREAK  A[LOOP:1: B:62:0x010f->B:72:0x014b], SYNTHETIC] */
    public final void f(yub0 yub0Var, boolean z, boolean z2) {
        Object obj;
        iu30 iu30VarE;
        uu0 uu0Var = this.c;
        x390 x390Var = this.w;
        if (!z && this.a) {
            this.b = yub0Var;
            jv91 jv91VarO = ekb.o();
            iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                if (x390Var.j() && Arrays.equals(yub0Var.a, (int[]) uu0Var.c) && Arrays.equals(yub0Var.b, (int[]) uu0Var.e)) {
                    x390Var.z();
                }
                return;
            } finally {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
            }
        }
        if (z) {
            this.a = true;
        }
        float f = this.o;
        float f2 = yub0Var.c;
        List list = yub0Var.m;
        int[] iArr = yub0Var.a;
        int[] iArr2 = yub0Var.b;
        this.o = f - f2;
        this.d.setValue(yub0Var);
        if (z2) {
            uu0Var.e = iArr2;
            ((err0) uu0Var.f).t(uu0.i((int[]) uu0Var.c, iArr2));
        } else {
            uu0Var.getClass();
            int iH = uu0.h(iArr);
            List list2 = list;
            int size = list2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i);
                if (((avb0) obj).a == iH) {
                    break;
                } else {
                    i++;
                }
            }
            avb0 avb0Var = (avb0) obj;
            uu0Var.g = avb0Var != null ? avb0Var.b : null;
            ((ksb0) uu0Var.h).c(iH);
            if (uu0Var.a || yub0Var.l > 0) {
                uu0Var.a = true;
                jv91 jv91VarO2 = ekb.o();
                iu30VarE = jv91VarO2 != null ? jv91VarO2.e() : null;
                jv91 jv91VarU2 = ekb.u(jv91VarO2);
                try {
                    uu0Var.c = iArr;
                    ((err0) uu0Var.d).t(uu0.h(iArr));
                    uu0Var.e = iArr2;
                    ((err0) uu0Var.f).t(uu0.i(iArr, iArr2));
                    ekb.C(jv91VarO2, jv91VarU2, iu30VarE);
                } catch (Throwable th) {
                    ekb.C(jv91VarO2, jv91VarU2, iu30VarE);
                    throw th;
                }
            }
            if (this.f49p != -1 && !list2.isEmpty()) {
                int i2 = ((avb0) o7h.q0(list)).a;
                int i3 = ((avb0) o7h.A0(list)).a;
                int i4 = this.f49p;
                if (i2 > i4 || i4 > i3) {
                    this.f49p = -1;
                    fdn0 fdn0Var = this.q;
                    Object[] objArr = ((or80) fdn0Var).c;
                    long[] jArr = ((or80) fdn0Var).a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((ssb0) objArr[(i5 << 3) + i7]).cancel();
                                    }
                                    j >>= 8;
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
                    }
                    fdn0Var.c();
                }
            }
        }
        this.g.setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        this.f.setValue(Boolean.valueOf(yub0Var.f));
        if (z) {
            x390Var.B(yub0Var.e, yub0Var.k, yub0Var.t);
        }
    }

    public final yub0 g() {
        return (yub0) this.d.getValue();
    }

    public final void h(float f, yub0 yub0Var) {
        fdn0 fdn0Var;
        int iN;
        int i;
        long jH;
        if (!this.l || yub0Var.m.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        List list = yub0Var.m;
        int i2 = z ? ((avb0) o7h.A0(list)).a : ((avb0) o7h.q0(list)).a;
        if (i2 == this.f49p) {
            return;
        }
        this.f49p = i2;
        int[] iArr = xr80.a;
        gdn0 gdn0Var = new gdn0();
        dvb0 dvb0Var = yub0Var.i;
        int[] iArr2 = dvb0Var.b;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            fdn0Var = this.q;
            if (i3 >= length) {
                break;
            }
            mgc mgcVar = this.e;
            if (z) {
                iN = i2 + 1;
                int length2 = mgcVar.b + ((int[]) mgcVar.c).length;
                while (true) {
                    if (iN >= length2) {
                        iN = mgcVar.b + ((int[]) mgcVar.c).length;
                        break;
                    } else if (mgcVar.f(iN, i3)) {
                        break;
                    } else {
                        iN++;
                    }
                }
            } else {
                iN = mgcVar.n(i2, i3);
            }
            int i4 = iN;
            if (i4 < 0 || i4 >= yub0Var.l || gdn0Var.c(i4)) {
                break;
            }
            gdn0Var.b[gdn0Var.d(i4)] = i4;
            if (!fdn0Var.a(i4)) {
                boolean zF = yub0Var.j.f(i4);
                int i5 = zF ? 0 : i3;
                int i6 = zF ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = dvb0Var.a;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (yub0Var.u == qqq0.a) {
                    if (i < 0) {
                        sf80.a("width must be >= 0");
                    }
                    jH = jjl.h(i, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    if (i < 0) {
                        sf80.a("height must be >= 0");
                    }
                    jH = jjl.h(0, Alert.DURATION_SHOW_INDEFINITELY, i, i);
                }
                tsb0 tsb0Var = this.m;
                rl1 rl1Var = tsb0Var.c;
                fdn0Var.i(i4, rl1Var != null ? rl1Var.F(i4, jH, tsb0Var.b, true, null) : vev.a);
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = ((or80) fdn0Var).a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = ((or80) fdn0Var).b[i12];
                        ssb0 ssb0Var = (ssb0) ((or80) fdn0Var).c[i12];
                        boolean zC = gdn0Var.c(i13);
                        if (!zC) {
                            ssb0Var.cancel();
                        }
                        if (!zC) {
                            fdn0Var.h(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }
}
