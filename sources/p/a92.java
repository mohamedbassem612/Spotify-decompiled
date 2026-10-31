package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a92 extends e {
    private static final a92 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER;
    private int keySize_;
    private e92 params_;

    static {
        a92 a92Var = new a92();
        DEFAULT_INSTANCE = a92Var;
        e.l(a92.class, a92Var);
    }

    public static a92 o(ohc ohcVar, tz00 tz00Var) {
        return (a92) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
    }

    public final Object f(int i) {
        pzr0 af40Var;
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new a92();
            case 4:
                return new z82(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (a92.class) {
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

    public final int m() {
        return this.keySize_;
    }

    public final e92 n() {
        e92 e92Var = this.params_;
        return e92Var == null ? e92.m() : e92Var;
    }
}
