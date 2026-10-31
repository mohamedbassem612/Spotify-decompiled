package p;

import android.os.Build;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8b1 implements hxq0 {
    public final drr0 a = new drr0(0.0f);
    public float b;
    public int c;
    public final i8b1 d;

    public k8b1() {
        this.d = Build.VERSION.SDK_INT >= 33 ? new g8b1(this) : new f8b1(this);
    }

    public final x4t a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public final long b(long j, int i, iu30 iu30Var) {
        float fIntBitsToFloat;
        float fS;
        float f = this.b;
        float f2 = 0.0f;
        if (f <= 0.0f) {
            return ((Offset) iu30Var.invoke(new Offset(j))).a;
        }
        if (i == 1) {
            this.c++;
        }
        float f3 = i == 2 ? 4.0f : 1.0f;
        drr0 drr0Var = this.a;
        if (drr0Var.s() == 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else {
            int i2 = (int) (j & 4294967295L);
            if (drr0Var.s() * Float.intBitsToFloat(i2) < 0.0f) {
                float f4 = (-drr0Var.s()) * f;
                float fIntBitsToFloat2 = Float.intBitsToFloat(i2) * f3;
                boolean z = Math.abs(fIntBitsToFloat2) >= Math.abs(f4);
                fIntBitsToFloat = z ? f4 / f3 : Float.intBitsToFloat(i2);
                if (z) {
                    fS = 0.0f;
                } else {
                    fS = (fIntBitsToFloat2 / f) + drr0Var.s();
                }
                e(fS);
            } else {
                fIntBitsToFloat = 0.0f;
            }
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32);
        long j2 = ((Offset) iu30Var.invoke(new Offset(jFloatToRawIntBits))).a;
        int i3 = (int) (j2 & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) - Float.intBitsToFloat(i3);
        if (i == 1 && Math.abs(fIntBitsToFloat3) > 0.5f) {
            e(yoi1.o((fIntBitsToFloat3 / f) + drr0Var.s(), -1.0f, 1.0f));
            f2 = fIntBitsToFloat3;
        }
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) + fIntBitsToFloat + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)))) << 32);
    }

    public final boolean c() {
        return !(this.a.s() == 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (p.wwo1.r(r15, 0.0f, r9, r9, r0, r11) == r14) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (r1 == r16.c) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        e(0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (r1 == r16.c) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r17, p.vu30 r19, p.lnm r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k8b1.d(long, p.vu30, p.lnm):java.lang.Object");
    }

    public final void e(float f) {
        this.a.t(f);
    }
}
