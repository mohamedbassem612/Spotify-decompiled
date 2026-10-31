package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y82 extends e {
    private static final y82 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ohc keyValue_ = ohc.b;
    private e92 params_;
    private int version_;

    static {
        y82 y82Var = new y82();
        DEFAULT_INSTANCE = y82Var;
        e.l(y82.class, y82Var);
    }

    public static x82 q() {
        return DEFAULT_INSTANCE.e();
    }

    public static y82 r(ohc ohcVar, tz00 tz00Var) {
        return (y82) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new y82();
            case 4:
                return new x82();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (y82.class) {
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

    public final ohc n() {
        return this.keyValue_;
    }

    public final e92 o() {
        e92 e92Var = this.params_;
        return e92Var == null ? e92.m() : e92Var;
    }

    public final int p() {
        return this.version_;
    }

    public final void s(ghc ghcVar) {
        this.keyValue_ = ghcVar;
    }

    public final void t(e92 e92Var) {
        e92Var.getClass();
        this.params_ = e92Var;
    }

    public final void u() {
        this.version_ = 0;
    }
}
