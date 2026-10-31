package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q92 extends e {
    private static final q92 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ohc keyValue_ = ohc.b;
    private s92 params_;
    private int version_;

    static {
        q92 q92Var = new q92();
        DEFAULT_INSTANCE = q92Var;
        e.l(q92.class, q92Var);
    }

    public static p92 q() {
        return DEFAULT_INSTANCE.e();
    }

    public static q92 r(ohc ohcVar, tz00 tz00Var) {
        return (q92) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new q92();
            case 4:
                return new p92();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (q92.class) {
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

    public final s92 o() {
        s92 s92Var = this.params_;
        return s92Var == null ? s92.m() : s92Var;
    }

    public final int p() {
        return this.version_;
    }

    public final void s(ghc ghcVar) {
        this.keyValue_ = ghcVar;
    }

    public final void t(s92 s92Var) {
        s92Var.getClass();
        this.params_ = s92Var;
    }

    public final void u() {
        this.version_ = 0;
    }
}
