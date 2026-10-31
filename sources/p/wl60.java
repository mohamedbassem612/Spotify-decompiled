package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wl60 extends e {
    private static final wl60 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private am60 params_;
    private int version_;

    static {
        wl60 wl60Var = new wl60();
        DEFAULT_INSTANCE = wl60Var;
        e.l(wl60.class, wl60Var);
    }

    public static wl60 m() {
        return DEFAULT_INSTANCE;
    }

    public static wl60 p(ohc ohcVar, tz00 tz00Var) {
        return (wl60) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
    }

    public final Object f(int i) {
        pzr0 af40Var;
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new wl60();
            case 4:
                return new z82(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (wl60.class) {
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

    public final int n() {
        return this.keySize_;
    }

    public final am60 o() {
        am60 am60Var = this.params_;
        return am60Var == null ? am60.m() : am60Var;
    }
}
