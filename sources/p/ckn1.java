package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ckn1 extends zkh1 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ckn1(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    public final boolean l(long j, Object obj) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return dkn1.e ? dkn1.i(j, obj) : dkn1.j(j, obj);
            default:
                return dkn1.e ? dkn1.i(j, obj) : dkn1.j(j, obj);
        }
    }

    public final void n(Object obj, long j, boolean z) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!dkn1.e) {
                    dkn1.l(obj, j, z);
                } else {
                    dkn1.k(obj, j, z);
                }
                break;
            default:
                if (!dkn1.e) {
                    dkn1.l(obj, j, z);
                } else {
                    dkn1.k(obj, j, z);
                }
                break;
        }
    }

    public final float p(long j, Object obj) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    public final void t(Object obj, long j, float f) {
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

    public final double u(long j, Object obj) {
        byte b = this.b;
        Unsafe unsafe = ((zkh1) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    public final void y(Object obj, long j, double d) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((zkh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((zkh1) this).a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
