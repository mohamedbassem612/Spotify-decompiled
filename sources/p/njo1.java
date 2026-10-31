package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class njo1 extends zkh1 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njo1(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    public final boolean B(Object obj, long j) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return zjo1.g ? zjo1.k(obj, j) : zjo1.l(obj, j);
            default:
                return zjo1.g ? zjo1.k(obj, j) : zjo1.l(obj, j);
        }
    }

    public final double j(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    public final float m(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    public final void q(Object obj, long j, boolean z) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!zjo1.g) {
                    zjo1.d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    zjo1.c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!zjo1.g) {
                    zjo1.d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    zjo1.c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    public final void s(Object obj, long j, byte b) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!zjo1.g) {
                    zjo1.d(obj, j, b);
                } else {
                    zjo1.c(obj, j, b);
                }
                break;
            default:
                if (!zjo1.g) {
                    zjo1.d(obj, j, b);
                } else {
                    zjo1.c(obj, j, b);
                }
                break;
        }
    }

    public final void v(Object obj, long j, double d) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((zkh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((zkh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    public final void z(Object obj, long j, float f) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }
}
