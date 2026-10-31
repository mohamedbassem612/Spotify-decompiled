package p;

import com.google.crypto.tink.shaded.protobuf.e;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eva0 extends e {
    private static final eva0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private g290 key_ = riy0.d;
    private int primaryKeyId_;

    static {
        eva0 eva0Var = new eva0();
        DEFAULT_INSTANCE = eva0Var;
        e.l(eva0.class, eva0Var);
    }

    public static bva0 r() {
        return (bva0) DEFAULT_INSTANCE.e();
    }

    public static eva0 s(byte[] bArr, tz00 tz00Var) {
        return (eva0) e.k(DEFAULT_INSTANCE, bArr, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", dva0.class});
            case 3:
                return new eva0();
            case 4:
                return new bva0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (eva0.class) {
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

    public final void m(dva0 dva0Var) {
        g290 g290VarH = this.key_;
        if (!((h9) g290VarH).a) {
            int size = g290VarH.size();
            g290VarH = g290VarH.h(size == 0 ? 10 : size * 2);
            this.key_ = g290VarH;
        }
        g290VarH.add(dva0Var);
    }

    public final dva0 n(int i) {
        return (dva0) this.key_.get(i);
    }

    public final int o() {
        return this.key_.size();
    }

    public final List p() {
        return this.key_;
    }

    public final int q() {
        return this.primaryKeyId_;
    }

    public final void t(int i) {
        this.primaryKeyId_ = i;
    }
}
