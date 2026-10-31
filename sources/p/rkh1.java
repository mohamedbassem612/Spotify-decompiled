package p;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rkh1 extends zkh1 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkh1(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // p.zkh1
    public final boolean a(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (blh1.g) {
                    return blh1.f(j, obj);
                }
                return ((byte) ((blh1.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                if (blh1.g) {
                    return blh1.f(j, obj);
                }
                return ((byte) ((blh1.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return this.a.getBoolean(obj, j);
        }
    }

    @Override // p.zkh1
    public final double b(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            default:
                return this.a.getDouble(obj, j);
        }
    }

    @Override // p.zkh1
    public final float c(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return this.a.getFloat(obj, j);
        }
    }

    @Override // p.zkh1
    public final void d(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!blh1.g) {
                    blh1.m(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    blh1.l(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            case 1:
                if (!blh1.g) {
                    blh1.m(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    blh1.l(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                this.a.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // p.zkh1
    public final void e(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (!blh1.g) {
                    blh1.m(j, obj, b);
                } else {
                    blh1.l(j, obj, b);
                }
                break;
            case 1:
                if (!blh1.g) {
                    blh1.m(j, obj, b);
                } else {
                    blh1.l(j, obj, b);
                }
                break;
            default:
                this.a.putByte(obj, j, b);
                break;
        }
    }

    @Override // p.zkh1
    public final void f(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putDouble(obj, j, d);
                break;
        }
    }

    @Override // p.zkh1
    public final void g(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putFloat(obj, j, f);
                break;
        }
    }

    @Override // p.zkh1
    public boolean h() {
        switch (this.b) {
            case 2:
                if (!super.h()) {
                    return false;
                }
                try {
                    Class<?> cls = this.a.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    blh1.j(th);
                    return false;
                }
            default:
                return super.h();
        }
    }

    @Override // p.zkh1
    public final boolean i() {
        switch (this.b) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.a;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (blh1.d() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        blh1.j(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    blh1.j(th2);
                    return false;
                }
        }
    }
}
