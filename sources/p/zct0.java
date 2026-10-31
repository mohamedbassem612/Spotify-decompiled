package p;

import android.graphics.Insets;
import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zct0 implements wct0, vf81 {
    public static final zct0 b = new zct0(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ zct0(byte b2) {
        this.a = b2;
    }

    @Override // p.vf81
    public float a(float f, float f2) {
        switch (this.a) {
            case 1:
                return -f2;
            case 2:
                return f;
            case 3:
                return -f;
            default:
                return f2;
        }
    }

    @Override // p.vf81
    public Insets b(Insets insets, int i) {
        switch (this.a) {
            case 1:
                return Insets.of(jah.b(insets), jah.l(insets), jah.n(insets), i);
            case 2:
                return Insets.of(i, jah.l(insets), jah.n(insets), jah.o(insets));
            case 3:
                return Insets.of(jah.b(insets), jah.l(insets), i, jah.o(insets));
            default:
                return Insets.of(jah.b(insets), i, jah.n(insets), jah.o(insets));
        }
    }

    @Override // p.wct0
    public boolean c() {
        return true;
    }

    @Override // p.vf81
    public int d(Insets insets) {
        switch (this.a) {
            case 1:
                return jah.o(insets);
            case 2:
                return jah.b(insets);
            case 3:
                return jah.n(insets);
            default:
                return jah.l(insets);
        }
    }

    @Override // p.vf81
    public long e(float f, long j) {
        switch (this.a) {
            case 1:
                return j2h1.g(0.0f, qui1.e(j) + f);
            case 2:
                return j2h1.g(qui1.d(j) - f, 0.0f);
            case 3:
                return j2h1.g(qui1.d(j) + f, 0.0f);
            default:
                return j2h1.g(0.0f, qui1.e(j) - f);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // p.vf81
    public long f(long j) {
        long j2;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        char c;
        long jFloatToRawIntBits2;
        int iFloatToRawIntBits2;
        long j3;
        long j4;
        switch (this.a) {
            case 1:
                j2 = 4294967295L;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long j5 = iFloatToRawIntBits;
                j3 = jFloatToRawIntBits << 32;
                j4 = j2 & j5;
                break;
            case 2:
                c = ' ';
                jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)));
                iFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                j3 = jFloatToRawIntBits2 << c;
                j4 = ((long) iFloatToRawIntBits2) & 4294967295L;
                break;
            case 3:
                c = ' ';
                jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)));
                iFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                j3 = jFloatToRawIntBits2 << c;
                j4 = ((long) iFloatToRawIntBits2) & 4294967295L;
                break;
            default:
                j2 = 4294967295L;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                long j6 = iFloatToRawIntBits;
                j3 = jFloatToRawIntBits << 32;
                j4 = j2 & j6;
                break;
        }
        return j3 | j4;
    }

    @Override // p.wct0
    public vct0 g(View view, boolean z, long j, float f, float f2, boolean z2, wat watVar, float f3) {
        if (z) {
            return new yct0(new Magnifier(view));
        }
        long jK1 = watVar.k1(j);
        float fX0 = watVar.X0(f);
        float fX1 = watVar.X0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jK1 != 9205357640488583168L) {
            builder.setSize(jch0.U(Float.intBitsToFloat((int) (jK1 >> 32))), jch0.U(Float.intBitsToFloat((int) (jK1 & 4294967295L))));
        }
        if (!Float.isNaN(fX0)) {
            builder.setCornerRadius(fX0);
        }
        if (!Float.isNaN(fX1)) {
            builder.setElevation(fX1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new yct0(builder.build());
    }
}
