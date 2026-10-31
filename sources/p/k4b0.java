package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k4b0 extends e {
    private static final k4b0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private l4b0 params_;
    private int version_;

    static {
        k4b0 k4b0Var = new k4b0();
        DEFAULT_INSTANCE = k4b0Var;
        e.l(k4b0.class, k4b0Var);
    }

    public static j4b0 p() {
        return DEFAULT_INSTANCE.e();
    }

    public static k4b0 q(ohc ohcVar, tz00 tz00Var) {
        return (k4b0) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e
    public final Object f(int i) {
        af40 af40Var;
        switch (l1d.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new k4b0();
            case 4:
                return new j4b0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (k4b0.class) {
                    try {
                        af40Var = PARSER;
                        if (af40Var == null) {
                            af40Var = new af40();
                            PARSER = af40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return af40Var;
            default:
                k220.c();
                return null;
        }
    }

    public final l4b0 n() {
        l4b0 l4b0Var = this.params_;
        return l4b0Var == null ? l4b0.m() : l4b0Var;
    }

    public final int o() {
        return this.version_;
    }

    public final void r(l4b0 l4b0Var) {
        l4b0Var.getClass();
        this.params_ = l4b0Var;
    }

    public final void s() {
        this.version_ = 0;
    }
}
