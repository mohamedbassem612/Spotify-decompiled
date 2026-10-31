package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mdt extends zpb1 implements tob1 {
    public final Function0 b;
    public final wv91 c;
    public ldt d = new ldt(pv91.h().g());

    public mdt(Function0 function0, wv91 wv91Var) {
        this.b = function0;
        this.c = wv91Var;
    }

    @Override // p.tob1
    public final Object getValue() {
        iu30 iu30VarE = ekb.n().e();
        if (iu30VarE != null) {
            iu30VarE.invoke(this);
        }
        jv91 jv91VarN = ekb.n();
        return s((ldt) pv91.g(this.d, jv91VarN), jv91VarN, true, this.b).f;
    }

    @Override // p.ypb1
    public final cqb1 k() {
        return this.d;
    }

    @Override // p.ypb1
    public final void l(cqb1 cqb1Var) {
        this.d = (ldt) cqb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    /* JADX WARN: Type inference failed for: r6v2, types: [p.kdt] */
    public final ldt s(ldt ldtVar, jv91 jv91Var, boolean z, Function0 function0) {
        wv91 wv91Var;
        int i;
        ldt ldtVar2 = ldtVar;
        if (ldtVar2.d(this, jv91Var)) {
            if (z) {
                bfn0 bfn0VarK = xto.k();
                Object[] objArr = bfn0VarK.a;
                int i2 = bfn0VarK.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((ndt) objArr[i3]).start();
                }
                try {
                    sdn0 sdn0Var = ldtVar2.e;
                    yt91 yt91Var = yv91.a;
                    vr80 vr80Var = (vr80) yt91Var.e();
                    if (vr80Var == null) {
                        vr80Var = new vr80();
                        yt91Var.j(vr80Var);
                    }
                    int i4 = vr80Var.a;
                    Object[] objArr2 = sdn0Var.b;
                    int[] iArr = sdn0Var.c;
                    long[] jArr = sdn0Var.a;
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
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        ypb1 ypb1Var = (ypb1) objArr2[i9];
                                        i = i6;
                                        vr80Var.a = i4 + iArr[i9];
                                        iu30 iu30VarE = jv91Var.e();
                                        if (iu30VarE != null) {
                                            iu30VarE.invoke(ypb1Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    vr80Var.a = i4;
                } finally {
                    Object[] objArr3 = bfn0VarK.a;
                    int i10 = bfn0VarK.c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((ndt) objArr3[i11]).a();
                    }
                }
            }
            return ldtVar2;
        }
        final sdn0 sdn0Var2 = new sdn0();
        yt91 yt91Var2 = yv91.a;
        final vr80 vr80Var2 = (vr80) yt91Var2.e();
        if (vr80Var2 == null) {
            vr80Var2 = new vr80();
            yt91Var2.j(vr80Var2);
        }
        final int i12 = vr80Var2.a;
        bfn0 bfn0VarK2 = xto.k();
        Object[] objArr4 = bfn0VarK2.a;
        int i13 = bfn0VarK2.c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((ndt) objArr4[i14]).start();
        }
        try {
            vr80Var2.a = i12 + 1;
            Object objX = ekb.x((kdt) new iu30() { // from class: p.kdt
                public final Object invoke(Object obj) {
                    if (obj == this.a) {
                        eg.m("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof ypb1) {
                        int i15 = vr80Var2.a - i12;
                        sdn0 sdn0Var3 = sdn0Var2;
                        int iD = sdn0Var3.d(obj);
                        sdn0Var3.g(Math.min(i15, iD >= 0 ? sdn0Var3.c[iD] : Integer.MAX_VALUE), obj);
                    }
                    return rih1.a;
                }
            }, function0);
            vr80Var2.a = i12;
            Object[] objArr5 = bfn0VarK2.a;
            int i15 = bfn0VarK2.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((ndt) objArr5[i16]).a();
            }
            Object obj = pv91.c;
            synchronized (obj) {
                try {
                    jv91 jv91VarN = ekb.n();
                    Object obj2 = ldtVar2.f;
                    if (obj2 == ldt.h || (wv91Var = this.c) == null || !wv91Var.x(objX, obj2)) {
                        ldt ldtVar3 = this.d;
                        synchronized (obj) {
                            cqb1 cqb1VarK = pv91.k(ldtVar3, this);
                            cqb1VarK.a(ldtVar3);
                            cqb1VarK.a = jv91VarN.g();
                            ldtVar2 = (ldt) cqb1VarK;
                            ldtVar2.e = sdn0Var2;
                            ldtVar2.g = ldtVar2.e(this, jv91VarN);
                            ldtVar2.f = objX;
                        }
                        return ldtVar2;
                    }
                    ldtVar2.e = sdn0Var2;
                    ldtVar2.g = ldtVar2.e(this, jv91VarN);
                } catch (Throwable th) {
                    throw th;
                }
            }
            vr80 vr80Var3 = (vr80) yv91.a.e();
            if (vr80Var3 == null || vr80Var3.a != 0) {
                return ldtVar2;
            }
            ekb.v();
            synchronized (obj) {
                jv91 jv91VarN2 = ekb.n();
                ldtVar2.c = jv91VarN2.g();
                ldtVar2.d = jv91VarN2.h();
                return ldtVar2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = bfn0VarK2.a;
            int i17 = bfn0VarK2.c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((ndt) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    public final ldt t() {
        jv91 jv91VarN = ekb.n();
        return s((ldt) pv91.g(this.d, jv91VarN), jv91VarN, false, this.b);
    }

    public final String toString() {
        ldt ldtVar = (ldt) pv91.f(this.d);
        return "DerivedState(value=" + (ldtVar.d(this, ekb.n()) ? String.valueOf(ldtVar.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
