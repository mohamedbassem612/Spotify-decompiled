package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l92 extends e {
    private static final l92 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ohc keyValue_ = ohc.b;
    private n92 params_;
    private int version_;

    static {
        l92 l92Var = new l92();
        DEFAULT_INSTANCE = l92Var;
        e.l(l92.class, l92Var);
    }

    public static l92 m() {
        return DEFAULT_INSTANCE;
    }

    public static k92 q() {
        return (k92) DEFAULT_INSTANCE.e();
    }

    public final Object f(int i) {
        pzr0 af40Var;
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new l92();
            case 4:
                return new k92(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (l92.class) {
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

    public final n92 o() {
        n92 n92Var = this.params_;
        return n92Var == null ? n92.m() : n92Var;
    }

    public final int p() {
        return this.version_;
    }

    public final void r(ghc ghcVar) {
        this.keyValue_ = ghcVar;
    }

    public final void s(n92 n92Var) {
        n92Var.getClass();
        this.params_ = n92Var;
    }

    public final void t() {
        this.version_ = 0;
    }
}
