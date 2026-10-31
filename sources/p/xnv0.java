package p;

import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xnv0 extends e {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final xnv0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile rzr0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        xnv0 xnv0Var = new xnv0();
        DEFAULT_INSTANCE = xnv0Var;
        e.h(xnv0.class, xnv0Var);
    }

    public static xnv0 j() {
        return DEFAULT_INSTANCE;
    }

    public static wnv0 r() {
        return (wnv0) ((ye40) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.e
    public final Object d(int i) {
        cf40 cf40Var;
        switch (l1d.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yvz0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", vnv0.class});
            case 3:
                return new xnv0();
            case 4:
                return new wnv0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                rzr0 rzr0Var = PARSER;
                if (rzr0Var != null) {
                    return rzr0Var;
                }
                synchronized (xnv0.class) {
                    try {
                        cf40Var = PARSER;
                        if (cf40Var == null) {
                            cf40Var = new cf40();
                            PARSER = cf40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cf40Var;
            default:
                k220.c();
                return null;
        }
    }

    public final boolean i() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double k() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float l() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int m() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long n() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String o() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final vnv0 p() {
        return this.valueCase_ == 6 ? (vnv0) this.value_ : vnv0.k();
    }

    public final int q() {
        return lzu0.a(this.valueCase_);
    }

    public final void s(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void t(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void u(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final void v(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void w(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void x(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void y(unv0 unv0Var) {
        this.value_ = unv0Var.a();
        this.valueCase_ = 6;
    }
}
