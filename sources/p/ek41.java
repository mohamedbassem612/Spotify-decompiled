package p;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ek41 implements moj1, i4d {
    public byte[] Z;
    public int i;
    public SurfaceTexture t;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final olx0 c = new olx0();
    public final rl1 d = new rl1((byte) 16);
    public final w4c0 e = new w4c0();
    public final w4c0 f = new w4c0();
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int X = 0;
    public int Y = -1;

    @Override // p.moj1
    public final void a(long j, long j2, ie30 ie30Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListA;
        this.e.a(j2, Long.valueOf(j));
        byte[] bArr = ie30Var.F;
        int i2 = ie30Var.G;
        byte[] bArr2 = this.Z;
        int i3 = this.Y;
        this.Z = bArr;
        if (i2 == -1) {
            i2 = this.X;
        }
        this.Y = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.Z)) {
            return;
        }
        byte[] bArr3 = this.Z;
        llx0 llx0Var = null;
        if (bArr3 != null) {
            int i4 = this.Y;
            int i5 = mlx0.b;
            izr0 izr0Var = new izr0(bArr3);
            try {
                izr0Var.S(4);
                int iQ = izr0Var.q();
                izr0Var.R(0);
                if (iQ == 1886547818) {
                    izr0Var.S(8);
                    int i6 = izr0Var.b;
                    int i7 = izr0Var.c;
                    while (true) {
                        if (i6 < i7) {
                            int iQ2 = izr0Var.q() + i6;
                            if (iQ2 > i6 && iQ2 <= i7) {
                                int iQ3 = izr0Var.q();
                                if (iQ3 != 2037673328 && iQ3 != 1836279920) {
                                    izr0Var.R(iQ2);
                                    i6 = iQ2;
                                }
                                izr0Var.Q(iQ2);
                                arrayListA = mlx0.a(izr0Var);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = mlx0.a(izr0Var);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    klx0 klx0Var = (klx0) arrayListA.get(0);
                    llx0Var = new llx0(klx0Var, klx0Var, i4);
                } else if (size == 2) {
                    llx0Var = new llx0((klx0) arrayListA.get(0), (klx0) arrayListA.get(1), i4);
                }
            }
        }
        if (llx0Var == null || !olx0.b(llx0Var)) {
            int i8 = this.Y;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 36; i11 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i11 * f) - f3;
                i = i11 + 1;
                float f5 = (i * f) - f3;
                int i12 = 0;
                while (i12 < 73) {
                    int i13 = i;
                    int i14 = 0;
                    int i15 = 2;
                    while (i14 < i15) {
                        float f6 = radians;
                        float f7 = i12 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i14 == 0 ? f4 : f5;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i16 = i9 + 3;
                        float f9 = f;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f7 / f8;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i11 + i14) * f9) / f6;
                        if ((i12 == 0 && i14 == 0) || (i12 == 72 && i14 == 1)) {
                            System.arraycopy(fArr, i9, fArr, i16, 3);
                            i9 += 6;
                            i15 = 2;
                            System.arraycopy(fArr2, i10, fArr2, i17, 2);
                            i10 += 4;
                        } else {
                            i15 = 2;
                            i9 = i16;
                            i10 = i17;
                        }
                        i14++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i12++;
                    i = i13;
                }
            }
            klx0 klx0Var2 = new klx0(new w4c0(0, 1, fArr, fArr2));
            llx0Var = new llx0(klx0Var2, klx0Var2, i8);
        }
        this.f.a(j2, llx0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            fn31.t();
            this.c.a();
            fn31.t();
            int iL = fn31.L();
            fn31.r(36197, iL, 9729);
            this.i = iL;
        } catch (GlUtil.GlException e) {
            oon1.w("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: p.dk41
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.t;
    }

    @Override // p.i4d
    public final void c(long j, float[] fArr) {
        ((w4c0) this.d.e).a(j, fArr);
    }

    @Override // p.i4d
    public final void d() {
        this.e.e();
        rl1 rl1Var = this.d;
        ((w4c0) rl1Var.e).e();
        rl1Var.b = false;
        this.b.set(true);
    }
}
