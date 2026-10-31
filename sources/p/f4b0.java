package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f4b0 extends e {
    private static final f4b0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private g4b0 params_;
    private int version_;

    static {
        f4b0 f4b0Var = new f4b0();
        DEFAULT_INSTANCE = f4b0Var;
        e.l(f4b0.class, f4b0Var);
    }

    public static e4b0 p() {
        return DEFAULT_INSTANCE.e();
    }

    public static f4b0 q(ohc ohcVar, tz00 tz00Var) {
        return (f4b0) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
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
                return new f4b0();
            case 4:
                return new e4b0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (f4b0.class) {
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

    public final g4b0 n() {
        g4b0 g4b0Var = this.params_;
        return g4b0Var == null ? g4b0.m() : g4b0Var;
    }

    public final int o() {
        return this.version_;
    }

    public final void r(g4b0 g4b0Var) {
        g4b0Var.getClass();
        this.params_ = g4b0Var;
    }

    public final void s() {
        this.version_ = 0;
    }
}
