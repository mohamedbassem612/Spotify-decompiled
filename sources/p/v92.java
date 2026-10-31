package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v92 extends e {
    private static final v92 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ohc keyValue_ = ohc.b;
    private int version_;

    static {
        v92 v92Var = new v92();
        DEFAULT_INSTANCE = v92Var;
        e.l(v92.class, v92Var);
    }

    public static u92 o() {
        return (u92) DEFAULT_INSTANCE.e();
    }

    public static v92 p(ohc ohcVar, tz00 tz00Var) {
        return (v92) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new v92();
            case 4:
                return new u92(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (v92.class) {
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

    public final ohc m() {
        return this.keyValue_;
    }

    public final int n() {
        return this.version_;
    }

    public final void q(ghc ghcVar) {
        this.keyValue_ = ghcVar;
    }

    public final void r() {
        this.version_ = 0;
    }
}
