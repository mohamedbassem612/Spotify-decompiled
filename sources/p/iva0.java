package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iva0 extends e {
    private static final iva0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private g290 keyInfo_ = riy0.d;
    private int primaryKeyId_;

    static {
        iva0 iva0Var = new iva0();
        DEFAULT_INSTANCE = iva0Var;
        e.l(iva0.class, iva0Var);
    }

    public static fva0 o() {
        return (fva0) DEFAULT_INSTANCE.e();
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", hva0.class});
            case 3:
                return new iva0();
            case 4:
                return new fva0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (iva0.class) {
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

    public final void m(hva0 hva0Var) {
        g290 g290VarH = this.keyInfo_;
        if (!((h9) g290VarH).a) {
            int size = g290VarH.size();
            g290VarH = g290VarH.h(size == 0 ? 10 : size * 2);
            this.keyInfo_ = g290VarH;
        }
        g290VarH.add(hva0Var);
    }

    public final hva0 n() {
        return (hva0) this.keyInfo_.get(0);
    }

    public final void p(int i) {
        this.primaryKeyId_ = i;
    }
}
