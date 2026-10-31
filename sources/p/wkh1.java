package p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wkh1 extends alh1 {
    public wkh1(Unsafe unsafe) {
        super(unsafe);
    }

    public final void a(long j, long j2, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean b(long j, Object obj) {
        if (dlh1.h) {
            return dlh1.f(j, obj) != 0;
        }
        return dlh1.g(j, obj) != 0;
    }

    public final byte c(long j) {
        throw new UnsupportedOperationException();
    }

    public final byte d(long j, Object obj) {
        return dlh1.h ? dlh1.f(j, obj) : dlh1.g(j, obj);
    }

    public final double e(long j, Object obj) {
        return Double.longBitsToDouble(((alh1) this).a.getLong(obj, j));
    }

    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(((alh1) this).a.getInt(obj, j));
    }

    public final void g(Object obj, long j, boolean z) {
        if (dlh1.h) {
            dlh1.m(j, obj, z ? (byte) 1 : (byte) 0);
        } else {
            dlh1.n(j, obj, z ? (byte) 1 : (byte) 0);
        }
    }

    public final void h(long j, Object obj, byte b) {
        if (dlh1.h) {
            dlh1.m(j, obj, b);
        } else {
            dlh1.n(j, obj, b);
        }
    }

    public final void i(Object obj, long j, double d) {
        ((alh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void j(Object obj, long j, float f) {
        ((alh1) this).a.putInt(obj, j, Float.floatToIntBits(f));
    }

    public final boolean l() {
        return false;
    }
}
