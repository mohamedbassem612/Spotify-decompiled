package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zbn1 extends zkh1 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbn1(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    public final void A(Object obj, long j, double d) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((zkh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((zkh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    public final void k(long j, Object obj, byte b) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!dcn1.g) {
                    dcn1.d(obj, j, b);
                } else {
                    dcn1.c(obj, j, b);
                }
                break;
            default:
                if (!dcn1.g) {
                    dcn1.d(obj, j, b);
                } else {
                    dcn1.c(obj, j, b);
                }
                break;
        }
    }

    public final boolean o(long j, Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return dcn1.g ? dcn1.j(obj, j) : dcn1.k(j, obj);
            default:
                return dcn1.g ? dcn1.j(obj, j) : dcn1.k(j, obj);
        }
    }

    public final void q(Object obj, long j, boolean z) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!dcn1.g) {
                    dcn1.d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    dcn1.c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!dcn1.g) {
                    dcn1.d(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    dcn1.c(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    public final float r(long j, Object obj) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    public final void w(Object obj, long j, float f) {
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

    public final double x(long j, Object obj) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }
}
