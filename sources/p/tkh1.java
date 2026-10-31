package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tkh1 extends alh1 {
    @Override // p.alh1
    public final boolean b(long j, Object obj) {
        if (dlh1.h) {
            return dlh1.f(j, obj) != 0;
        }
        return dlh1.g(j, obj) != 0;
    }

    @Override // p.alh1
    public final byte d(long j, Object obj) {
        return dlh1.h ? dlh1.f(j, obj) : dlh1.g(j, obj);
    }

    @Override // p.alh1
    public final double e(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // p.alh1
    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // p.alh1
    public final void g(Object obj, long j, boolean z) {
        if (dlh1.h) {
            dlh1.m(j, obj, z ? (byte) 1 : (byte) 0);
        } else {
            dlh1.n(j, obj, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p.alh1
    public final void h(long j, Object obj, byte b) {
        if (dlh1.h) {
            dlh1.m(j, obj, b);
        } else {
            dlh1.n(j, obj, b);
        }
    }

    @Override // p.alh1
    public final void i(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // p.alh1
    public final void j(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }
}
