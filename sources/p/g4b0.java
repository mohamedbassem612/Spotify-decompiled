package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g4b0 extends e {
    private static final g4b0 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile pzr0 PARSER;
    private String keyUri_ = "";

    static {
        g4b0 g4b0Var = new g4b0();
        DEFAULT_INSTANCE = g4b0Var;
        e.l(g4b0.class, g4b0Var);
    }

    public static g4b0 m() {
        return DEFAULT_INSTANCE;
    }

    public static g4b0 o(ohc ohcVar, tz00 tz00Var) {
        return (g4b0) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
    }

    public final Object f(int i) {
        pzr0 af40Var;
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new g4b0();
            case 4:
                return new z82(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (g4b0.class) {
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

    public final String n() {
        return this.keyUri_;
    }
}
