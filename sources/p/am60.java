package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class am60 extends e {
    private static final am60 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile pzr0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        am60 am60Var = new am60();
        DEFAULT_INSTANCE = am60Var;
        e.l(am60.class, am60Var);
    }

    public static am60 m() {
        return DEFAULT_INSTANCE;
    }

    public final Object f(int i) {
        pzr0 af40Var;
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new am60();
            case 4:
                return new z82(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (am60.class) {
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

    public final bu50 n() {
        bu50 bu50Var;
        int i = this.hash_;
        if (i == 0) {
            bu50Var = bu50.UNKNOWN_HASH;
        } else if (i == 1) {
            bu50Var = bu50.SHA1;
        } else if (i == 2) {
            bu50Var = bu50.SHA384;
        } else if (i != 3) {
            bu50Var = i != 4 ? null : bu50.SHA512;
        } else {
            bu50Var = bu50.SHA256;
        }
        return bu50Var == null ? bu50.UNRECOGNIZED : bu50Var;
    }

    public final int o() {
        return this.tagSize_;
    }
}
