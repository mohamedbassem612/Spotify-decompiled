package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vkh1 extends alh1 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkh1(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    public final boolean b(long j, Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (clh1.h) {
                    if (clh1.f(j, obj) == 0) {
                        return false;
                    }
                } else if (clh1.g(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                return ((alh1) this).a.getBoolean(obj, j);
        }
    }

    public final byte d(long j, Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return clh1.h ? clh1.f(j, obj) : clh1.g(j, obj);
            default:
                return ((alh1) this).a.getByte(obj, j);
        }
    }

    public final double e(long j, Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Double.longBitsToDouble(((alh1) this).a.getLong(obj, j));
            default:
                return ((alh1) this).a.getDouble(obj, j);
        }
    }

    public final float f(long j, Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Float.intBitsToFloat(((alh1) this).a.getInt(obj, j));
            default:
                return ((alh1) this).a.getFloat(obj, j);
        }
    }

    public final void g(Object obj, long j, boolean z) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!clh1.h) {
                    clh1.m(j, obj, z ? (byte) 1 : (byte) 0);
                } else {
                    clh1.l(j, obj, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                ((alh1) this).a.putBoolean(obj, j, z);
                break;
        }
    }

    public final void h(long j, Object obj, byte b) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!clh1.h) {
                    clh1.m(j, obj, b);
                } else {
                    clh1.l(j, obj, b);
                }
                break;
            default:
                ((alh1) this).a.putByte(obj, j, b);
                break;
        }
    }

    public final void i(Object obj, long j, double d) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((alh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((alh1) this).a.putDouble(obj, j, d);
                break;
        }
    }

    public final void j(Object obj, long j, float f) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((alh1) this).a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                ((alh1) this).a.putFloat(obj, j, f);
                break;
        }
    }
}
