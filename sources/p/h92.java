package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h92 extends e {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final h92 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER;
    private m92 aesCtrKeyFormat_;
    private wl60 hmacKeyFormat_;

    static {
        h92 h92Var = new h92();
        DEFAULT_INSTANCE = h92Var;
        e.l(h92.class, h92Var);
    }

    public static h92 o(ohc ohcVar, tz00 tz00Var) {
        return (h92) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
    }

    public final Object f(int i) {
        pzr0 af40Var;
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new h92();
            case 4:
                return new z82(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (h92.class) {
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

    public final m92 m() {
        m92 m92Var = this.aesCtrKeyFormat_;
        return m92Var == null ? m92.m() : m92Var;
    }

    public final wl60 n() {
        wl60 wl60Var = this.hmacKeyFormat_;
        return wl60Var == null ? wl60.m() : wl60Var;
    }
}
