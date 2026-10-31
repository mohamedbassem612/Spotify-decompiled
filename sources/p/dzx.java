package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dzx extends e {
    private static final dzx DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile pzr0 PARSER;
    private ohc encryptedKeyset_ = ohc.b;
    private iva0 keysetInfo_;

    static {
        dzx dzxVar = new dzx();
        DEFAULT_INSTANCE = dzxVar;
        e.l(dzx.class, dzxVar);
    }

    public static czx n() {
        return (czx) DEFAULT_INSTANCE.e();
    }

    public static dzx o(byte[] bArr, tz00 tz00Var) {
        return (dzx) e.k(DEFAULT_INSTANCE, bArr, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new dzx();
            case 4:
                return new czx(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (dzx.class) {
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
        return this.encryptedKeyset_;
    }

    public final void p(ghc ghcVar) {
        this.encryptedKeyset_ = ghcVar;
    }

    public final void q(iva0 iva0Var) {
        this.keysetInfo_ = iva0Var;
    }
}
