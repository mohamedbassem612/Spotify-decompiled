package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class be50 {
    public static final ukb0 C;
    public boolean A;
    public RectF B;
    public final fe50 a;
    public Outline f;
    public float j;
    public z1a1 k;
    public u8s0 l;
    public tw4 m;
    public boolean n;
    public vid o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lw4 f12p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public wat b = yoi1.d;
    public flb0 c = flb0.a;
    public iu30 d = a9o.U0;
    public final xul1 e = new xul1(this, (byte) 1);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final fdc r = new fdc();

    static {
        f331 f331Var;
        if (sjb.m(new sjb((byte) 12))) {
            f331Var = f331.U0;
        } else {
            f331Var = Build.VERSION.SDK_INT >= 28 ? ykb0.a : rh20.i;
        }
        C = f331Var;
    }

    public be50(fe50 fe50Var) {
        this.a = fe50Var;
        fe50Var.v(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            fe50 fe50Var = this.a;
            if (z || fe50Var.P() > 0.0f) {
                u8s0 u8s0Var = this.l;
                if (u8s0Var != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = u8s0Var instanceof tw4;
                    if (!z2) {
                        hhg1.h("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ((tw4) u8s0Var).a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            w081.C(outline, u8s0Var);
                        } else {
                            if (!z2) {
                                hhg1.h("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = u8s0Var;
                    if (outline != null) {
                        outline.setAlpha(fe50Var.b());
                        outline2 = outline;
                    }
                    fe50Var.F(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        fe50Var.v(false);
                        fe50Var.i();
                    } else {
                        fe50Var.v(this.A);
                    }
                } else {
                    fe50Var.v(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jR = o0c.R(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? jR : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(fe50Var.b());
                    fe50Var.F(outline5, o0c.L(j3));
                }
            } else {
                fe50Var.v(false);
                fe50Var.F(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            fdc fdcVar = this.r;
            be50 be50VarV = fdc.v(fdcVar);
            if (be50VarV != null) {
                be50VarV.q--;
                be50VarV.b();
                fdc.A(fdcVar);
            }
            oen0 oen0VarU = fdc.u(fdcVar);
            if (oen0VarU != null) {
                Object[] objArr = oen0VarU.b;
                long[] jArr = oen0VarU.a;
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
                                    be50 be50Var = (be50) objArr[(i << 3) + i3];
                                    be50Var.q--;
                                    be50Var.b();
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
                oen0VarU.b();
            }
            this.a.i();
        }
    }

    public final void c(fid fidVar, be50 be50Var) {
        fe50 fe50Var;
        fe50 fe50Var2;
        int i;
        float f;
        if (this.s) {
            return;
        }
        long j = this.h;
        Canvas canvas = v84.a;
        Canvas canvas2 = ((u84) fidVar).a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        fe50 fe50Var3 = this.a;
        if (zIsHardwareAccelerated) {
            fe50Var = fe50Var3;
        } else {
            long j2 = this.t;
            float f2 = (int) (j2 >> 32);
            float f3 = f2 - this.v;
            float f4 = (int) (j2 & 4294967295L);
            float f5 = f4 - this.w;
            long j3 = this.u;
            fe50Var = fe50Var3;
            float f6 = f2 + ((int) (j3 >> 32)) + this.x;
            float f7 = f4 + ((int) (j3 & 4294967295L)) + this.y;
            float fB = fe50Var.b();
            ColorFilter colorFilterL = fe50Var.l();
            int iB = fe50Var.B();
            if (fB < 1.0f || !jm5.j(iB, 3) || colorFilterL != null || kbb.w(fe50Var.k(), 1)) {
                lw4 lw4VarL = this.f12p;
                if (lw4VarL == null) {
                    lw4VarL = fdg1.l();
                    this.f12p = lw4VarL;
                }
                lw4VarL.a(fB);
                lw4VarL.b(iB);
                lw4VarL.d(colorFilterL);
                f = f3;
                canvas2.saveLayer(f, f5, f6, f7, fdg1.N(lw4VarL));
            } else {
                canvas2.save();
                f = f3;
            }
            canvas2.translate(f, f5);
            Matrix matrixX = fe50Var.x();
            matrixX.preTranslate(this.v, this.w);
            canvas2.concat(matrixX);
            this.h = Offset.f(this.h, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.v)) << 32));
        }
        a();
        if (fe50Var.o()) {
            fe50Var2 = fe50Var;
        } else {
            try {
                fe50Var2 = fe50Var;
                try {
                    fe50Var2.n(this.b, this.c, this, this.e);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                fe50Var2 = fe50Var;
            }
        }
        boolean z = false;
        boolean z2 = fe50Var2.P() > 0.0f;
        if (z2) {
            fidVar.m();
        }
        if (!zIsHardwareAccelerated && this.A) {
            z = true;
        }
        if (z) {
            fidVar.q();
            z1a1 z1a1VarE = e();
            if (z1a1VarE instanceof itq0) {
                fid.a(fidVar, ((itq0) z1a1VarE).c);
                i = 1;
            } else if (z1a1VarE instanceof jtq0) {
                tw4 tw4VarA = this.m;
                if (tw4VarA != null) {
                    tw4VarA.o();
                } else {
                    tw4VarA = ww4.a();
                    this.m = tw4VarA;
                }
                i = 1;
                tw4VarA.e(((jtq0) z1a1VarE).c, 1);
                fidVar.t(tw4VarA, 1);
            } else {
                i = 1;
                if (!(z1a1VarE instanceof htq0)) {
                    eg.o();
                    return;
                }
                fidVar.t(((htq0) z1a1VarE).c, 1);
            }
        } else {
            i = 1;
        }
        if (be50Var != null && be50Var.r.b0(this)) {
            this.q += i;
        }
        if (((u84) fidVar).a.isHardwareAccelerated()) {
            fe50Var2.y(fidVar);
        } else {
            vid vidVar = this.o;
            if (vidVar == null) {
                vidVar = new vid();
                this.o = vidVar;
            }
            cab cabVar = vidVar.b;
            wat watVar = this.b;
            flb0 flb0Var = this.c;
            long jR = o0c.R(this.u);
            wat watVarR = cabVar.r();
            flb0 flb0VarT = cabVar.t();
            fid fidVarP = cabVar.p();
            long jU = cabVar.u();
            be50 be50VarS = cabVar.s();
            cabVar.A(watVar);
            cabVar.C(flb0Var);
            cabVar.z(fidVar);
            cabVar.D(jR);
            cabVar.B(this);
            fidVar.q();
            try {
                d(vidVar);
                fidVar.i();
                cabVar.A(watVarR);
                cabVar.C(flb0VarT);
                cabVar.z(fidVarP);
                cabVar.D(jU);
                cabVar.B(be50VarS);
            } catch (Throwable th) {
                fidVar.i();
                cabVar.A(watVarR);
                cabVar.C(flb0VarT);
                cabVar.z(fidVarP);
                cabVar.D(jU);
                cabVar.B(be50VarS);
                throw th;
            }
        }
        if (z) {
            fidVar.i();
        }
        if (z2) {
            fidVar.r();
        }
        if (!zIsHardwareAccelerated) {
            canvas2.restore();
        }
        this.h = j;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a A[LOOP:0: B:20:0x005d->B:30:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[EDGE_INSN: B:34:0x009d->B:31:0x009d BREAK  A[LOOP:0: B:20:0x005d->B:30:0x009a], SYNTHETIC] */
    public final void d(DrawScope drawScope) {
        fdc fdcVar = this.r;
        fdc.C(fdcVar, fdc.v(fdcVar));
        oen0 oen0VarU = fdc.u(fdcVar);
        if (oen0VarU != null && oen0VarU.h()) {
            oen0 oen0VarX = fdc.x(fdcVar);
            if (oen0VarX == null) {
                oen0 oen0Var = ij41.a;
                oen0VarX = new oen0();
                fdc.B(fdcVar, oen0VarX);
            }
            oen0VarX.k(oen0VarU);
            oen0VarU.b();
        }
        fdc.D(fdcVar, true);
        this.d.invoke(drawScope);
        fdc.D(fdcVar, false);
        be50 be50VarY = fdc.y(fdcVar);
        if (be50VarY != null) {
            be50VarY.q--;
            be50VarY.b();
        }
        oen0 oen0VarX2 = fdc.x(fdcVar);
        if (oen0VarX2 == null || !oen0VarX2.h()) {
            return;
        }
        Object[] objArr = oen0VarX2.b;
        long[] jArr = oen0VarX2.a;
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
                            be50 be50Var = (be50) objArr[(i << 3) + i3];
                            be50Var.q--;
                            be50Var.b();
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
        oen0VarX2.b();
    }

    public final z1a1 e() {
        z1a1 itq0Var;
        z1a1 z1a1Var = this.k;
        u8s0 u8s0Var = this.l;
        if (z1a1Var != null) {
            return z1a1Var;
        }
        if (u8s0Var != null) {
            htq0 htq0Var = new htq0(u8s0Var);
            this.k = htq0Var;
            return htq0Var;
        }
        long jR = o0c.R(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jR = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jR >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jR & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            itq0Var = new jtq0(ila0.g(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            itq0Var = new itq0(new n511(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = itq0Var;
        return itq0Var;
    }

    public final void f(wat watVar, flb0 flb0Var, long j, iu30 iu30Var) {
        boolean zB = yr80.b(this.u, j);
        fe50 fe50Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            fe50Var.j((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = watVar;
        this.c = flb0Var;
        this.d = iu30Var;
        fe50Var.n(watVar, flb0Var, this, this.e);
    }

    public final void g(float f) {
        fe50 fe50Var = this.a;
        if (fe50Var.b() == f) {
            return;
        }
        fe50Var.J(f);
    }

    public final void h(float f, long j, long j2) {
        float f2 = this.v;
        long jG = Offset.g(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (Offset.c(this.h, jG) && Size.c(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jG;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        ae50 ae50Var;
        if (onmVar instanceof ae50) {
            ae50Var = (ae50) onmVar;
            int i = ae50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ae50Var.c = i - Integer.MIN_VALUE;
            } else {
                ae50Var = new ae50(this, onmVar);
            }
        } else {
            ae50Var = new ae50(this, onmVar);
        }
        Object objE = ae50Var.a;
        int i2 = ae50Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            ae50Var.c = 1;
            objE = C.e(this, ae50Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return no80.n((Bitmap) objE);
    }
}
