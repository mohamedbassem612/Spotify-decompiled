package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g92 extends e {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final g92 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private l92 aesCtrKey_;
    private vl60 hmacKey_;
    private int version_;

    static {
        g92 g92Var = new g92();
        DEFAULT_INSTANCE = g92Var;
        e.l(g92.class, g92Var);
    }

    public static f92 q() {
        return DEFAULT_INSTANCE.e();
    }

    public static g92 r(ohc ohcVar, tz00 tz00Var) {
        return (g92) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new g92();
            case 4:
                return new f92();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (g92.class) {
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

    public final l92 n() {
        l92 l92Var = this.aesCtrKey_;
        return l92Var == null ? l92.m() : l92Var;
    }

    public final vl60 o() {
        vl60 vl60Var = this.hmacKey_;
        return vl60Var == null ? vl60.n() : vl60Var;
    }

    public final int p() {
        return this.version_;
    }

    public final void s(l92 l92Var) {
        l92Var.getClass();
        this.aesCtrKey_ = l92Var;
    }

    public final void t(vl60 vl60Var) {
        vl60Var.getClass();
        this.hmacKey_ = vl60Var;
    }

    public final void u() {
        this.version_ = 0;
    }
}
