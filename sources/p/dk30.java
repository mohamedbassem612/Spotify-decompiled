package p;

import android.view.Choreographer;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dk30 implements Choreographer.FrameCallback {
    public final n36 N0;
    public long O0;
    public long P0;
    public long Q0;
    public final n36 R0;
    public int S0;
    public long T0;
    public final Object U0;
    public final float[] V0;
    public final float[] W0;
    public final float[] X;
    public final float[] X0;
    public int Y;
    public final float[] Y0;
    public int Z;
    public int Z0;
    public final Choreographer a = Choreographer.getInstance();
    public int a1;
    public final float b;
    public float b1;
    public final double c;
    public float c1;
    public volatile boolean d;
    public float d1;
    public long e;
    public float e1;
    public long f;
    public boolean f1;
    public long g;
    public boolean g1;
    public long h;
    public long h1;
    public long i;
    public long i1;
    public long j1;
    public long k1;
    public long l1;
    public long m1;
    public volatile int n1;
    public volatile String o1;
    public final n36 p1;
    public float t;

    public dk30(float f) {
        f = f < 1.0f ? 1.0f : f;
        this.b = f;
        this.c = 1.0E9d / ((double) f);
        this.X = new float[120];
        this.N0 = new n36();
        this.R0 = new n36();
        this.S0 = -1;
        this.T0 = -1L;
        this.U0 = new Object();
        this.V0 = new float[120];
        this.W0 = new float[120];
        this.X0 = new float[120];
        this.Y0 = new float[120];
        this.n1 = -1;
        this.p1 = new n36(17);
    }

    public final void a(String str, uqt uqtVar) {
        String string;
        ck30 ck30VarB = b();
        List<ak30> list = ck30VarB.J;
        if (uqtVar != null) {
            String str2 = uqtVar.a;
            String str3 = uqtVar.b;
            String str4 = uqtVar.c;
            String str5 = uqtVar.d;
            String str6 = String.format(Locale.ROOT, "%.1fGB", Arrays.copyOf(new Object[]{Float.valueOf(uqtVar.e / 1024.0f)}, 1));
            StringBuilder sbN = gvg.n("os=", str2, " soc=", str3, " abi=");
            bb00.j(sbN, str4, " gpu=", str5, " ram=");
            sbN.append(str6);
            string = sbN.toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        Logger.g("FrameProfiler[%s] %s elapsedMs=%d frames=%d avgFps=%.1f dropped=%d jank=%d worstMs=%.2f p50=%.2f p95=%.2f p99=%.2f heapMaxMB=%d heapPeakMB=%d mtMs=%.2f rtMs=%.2f cpuDrawMs=%.2f gpuMs=%.2f gpuAvail=%s gcCount=%d gcTimeMs=%d allocMb=%d thermal=%d longFrames=%d", new Object[]{str, string, Long.valueOf(ck30VarB.a), Long.valueOf(ck30VarB.c), Float.valueOf(ck30VarB.h), Long.valueOf(ck30VarB.d), Long.valueOf(ck30VarB.e), Float.valueOf(ck30VarB.g), Float.valueOf(ck30VarB.j), Float.valueOf(ck30VarB.k), Float.valueOf(ck30VarB.l), Integer.valueOf(ck30VarB.f5p), Integer.valueOf(ck30VarB.q), Float.valueOf(ck30VarB.w), Float.valueOf(ck30VarB.x), Float.valueOf(ck30VarB.y), Float.valueOf(ck30VarB.z), Boolean.valueOf(ck30VarB.E), Long.valueOf(ck30VarB.F), Long.valueOf(ck30VarB.G), Long.valueOf(ck30VarB.H / 1048576), Integer.valueOf(ck30VarB.I), Integer.valueOf(list.size())});
        for (ak30 ak30Var : list) {
            Long lValueOf = Long.valueOf(ak30Var.a);
            Float fValueOf = Float.valueOf(ak30Var.b);
            String str7 = ak30Var.c;
            if (str7 == null) {
                str7 = "-";
            }
            Logger.g("FrameProfiler[%s] longFrame elapsedMs=%d durationMs=%.2f tag=%s", new Object[]{str, lValueOf, fValueOf, str7});
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public final ck30 b() {
        float f;
        bk30 bk30Var;
        bk30 bk30Var2;
        mmr0 mmr0Var;
        float f2;
        long j;
        float f3;
        int i;
        int i2;
        float f4;
        int i3;
        long jNanoTime = this.f > 0 ? (System.nanoTime() - this.f) / 1000000 : 0L;
        float f5 = jNanoTime > 0 ? (this.g * 1000.0f) / jNanoTime : 0.0f;
        int i4 = this.Z;
        float[] fArr = new float[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr[i5] = this.X[i5];
        }
        if (i4 > 1) {
            Arrays.sort(fArr);
        }
        if (this.Z > 0) {
            float f6 = 0.0f;
            for (int i6 = 0; i6 < i4; i6++) {
                f6 += fArr[i6];
            }
            if (f6 > 0.0f) {
                f = (this.Z * 1000.0f) / f6;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        synchronized (this.U0) {
            try {
                int i7 = this.a1;
                if (i7 == 0) {
                    bk30Var = new bk30(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.f1);
                } else {
                    float f7 = 0.0f;
                    float f8 = 0.0f;
                    float f9 = 0.0f;
                    float f10 = 0.0f;
                    for (int i8 = 0; i8 < i7; i8++) {
                        f7 += this.V0[i8];
                        f8 += this.W0[i8];
                        f9 += this.X0[i8];
                        f10 += this.Y0[i8];
                    }
                    float f11 = this.a1;
                    bk30Var = new bk30(f7 / f11, f8 / f11, f9 / f11, f10 / f11, this.b1, this.c1, this.d1, this.e1, this.f1);
                }
                bk30Var2 = bk30Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.X;
        Float fValueOf = Float.valueOf(0.0f);
        int i9 = this.Z;
        if (i9 < 2) {
            mmr0Var = new mmr0(fValueOf, fValueOf);
        } else {
            float f12 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                f12 += fArr2[i10];
            }
            int i11 = this.Z;
            float f13 = f12 / i11;
            float f14 = 0.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                float f15 = fArr2[i12] - f13;
                f14 += f15 * f15;
            }
            mmr0Var = new mmr0(Float.valueOf(f13), Float.valueOf((float) Math.sqrt(f14 / this.Z)));
        }
        float fFloatValue = ((Number) mmr0Var.a).floatValue();
        float fFloatValue2 = ((Number) mmr0Var.b).floatValue();
        n36 n36Var = this.R0;
        ArrayList arrayList = new ArrayList(q7h.U(n36Var, 10));
        Iterator it = n36Var.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((zj30) it.next()).b));
        }
        float f16 = this.b;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        int i13 = this.N0.c;
        float f17 = this.t;
        float fP = pdp1.p(0.5f, fArr);
        float fP2 = pdp1.p(0.95f, fArr);
        float fP3 = pdp1.p(0.99f, fArr);
        int i14 = (int) (this.O0 / 1048576);
        int i15 = (int) (this.P0 / 1048576);
        int i16 = (int) (this.Q0 / 1048576);
        int i17 = this.S0;
        long j5 = this.T0;
        if (i17 < 0 || j5 < 0) {
            f2 = fP3;
            j = j5;
            f3 = fP;
            i = 0;
        } else {
            f2 = fP3;
            i = Integer.MAX_VALUE;
            for (zj30 zj30Var : this.R0) {
                long j6 = j5;
                float f18 = fP;
                if (zj30Var.a >= this.T0 && (i3 = zj30Var.b) < i) {
                    i = i3;
                }
                fP = f18;
                j5 = j6;
            }
            j = j5;
            f3 = fP;
            if (i == Integer.MAX_VALUE) {
                i = this.S0;
            }
        }
        n36 n36Var2 = this.R0;
        if (n36Var2.c >= 2) {
            long j7 = ((zj30) n36Var2.last()).a;
            i2 = i;
            ArrayList<zj30> arrayList2 = new ArrayList();
            Iterator it2 = n36Var2.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                Object next = it3.next();
                long j8 = j7;
                if (j8 - ((zj30) next).a <= 30000) {
                    arrayList2.add(next);
                }
                it2 = it3;
                j7 = j8;
            }
            if (arrayList2.size() >= 2) {
                double size = arrayList2.size();
                double d = 0.0d;
                double d2 = 0.0d;
                for (zj30 zj30Var2 : arrayList2) {
                    ArrayList arrayList3 = arrayList2;
                    d += zj30Var2.a;
                    d2 += (double) zj30Var2.b;
                    arrayList2 = arrayList3;
                    size = size;
                }
                double d3 = size;
                double d4 = d / d3;
                double d5 = d2 / d3;
                double d6 = 0.0d;
                double d7 = 0.0d;
                for (zj30 zj30Var3 : arrayList2) {
                    double d8 = d6;
                    double d9 = zj30Var3.a - d4;
                    d7 = ((((double) zj30Var3.b) - d5) * d9) + d7;
                    d6 = (d9 * d9) + d8;
                }
                double d10 = d6;
                if (d10 != 0.0d) {
                    f4 = (float) (1000.0d * (d7 / d10));
                }
            }
            return new ck30(jNanoTime, f16, j2, j3, j4, i13, f17, f5, f, f3, fP2, f2, fFloatValue, fFloatValue2, i14, i15, i16, i17, j, i2, f4, arrayList, bk30Var2.a, bk30Var2.b, bk30Var2.c, bk30Var2.d, bk30Var2.e, bk30Var2.f, bk30Var2.g, bk30Var2.h, bk30Var2.i, this.k1, this.l1, this.m1, this.n1, o7h.l1(this.p1));
        }
        i2 = i;
        f4 = 0.0f;
        return new ck30(jNanoTime, f16, j2, j3, j4, i13, f17, f5, f, f3, fP2, f2, fFloatValue, fFloatValue2, i14, i15, i16, i17, j, i2, f4, arrayList, bk30Var2.a, bk30Var2.b, bk30Var2.c, bk30Var2.d, bk30Var2.e, bk30Var2.f, bk30Var2.g, bk30Var2.h, bk30Var2.i, this.k1, this.l1, this.m1, this.n1, o7h.l1(this.p1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.d) {
            long j2 = this.e;
            if (j2 > 0) {
                double d = j - j2;
                float f = (float) (d / 1000000.0d);
                this.g++;
                if (f > this.t) {
                    this.t = f;
                }
                long j3 = (long) ((d / this.c) - 1.0d);
                long j4 = j3 >= 0 ? j3 : 0L;
                this.h += j4;
                if (j4 >= 1) {
                    this.i++;
                    long j5 = (j - this.f) / 1000000;
                    this.p1.addLast(new ak30(j5, this.o1, f));
                    n36 n36Var = this.p1;
                    if (n36Var.c > 16) {
                        n36Var.removeFirst();
                    }
                    this.N0.addLast(Long.valueOf(j5));
                    while (!this.N0.isEmpty() && j5 - ((Number) this.N0.first()).longValue() > 10000) {
                        this.N0.removeFirst();
                    }
                }
                float[] fArr = this.X;
                int i = this.Y;
                fArr[i] = f;
                this.Y = (i + 1) % 120;
                int i2 = this.Z;
                if (i2 < 120) {
                    this.Z = i2 + 1;
                }
            } else {
                this.f = j;
            }
            this.e = j;
            this.a.postFrameCallback(this);
        }
    }
}
