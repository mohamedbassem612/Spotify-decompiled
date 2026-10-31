package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dva0 extends e {
    private static final dva0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile pzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private bpa0 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        dva0 dva0Var = new dva0();
        DEFAULT_INSTANCE = dva0Var;
        e.l(dva0.class, dva0Var);
    }

    public static cva0 r() {
        return (cva0) DEFAULT_INSTANCE.e();
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new dva0();
            case 4:
                return new cva0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (dva0.class) {
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

    public final bpa0 m() {
        bpa0 bpa0Var = this.keyData_;
        return bpa0Var == null ? bpa0.m() : bpa0Var;
    }

    public final int n() {
        return this.keyId_;
    }

    public final fuq0 o() {
        fuq0 fuq0VarA = fuq0.a(this.outputPrefixType_);
        return fuq0VarA == null ? fuq0.UNRECOGNIZED : fuq0VarA;
    }

    public final rpa0 p() {
        rpa0 rpa0Var;
        int i = this.status_;
        if (i == 0) {
            rpa0Var = rpa0.UNKNOWN_STATUS;
        } else if (i == 1) {
            rpa0Var = rpa0.ENABLED;
        } else if (i != 2) {
            rpa0Var = i != 3 ? null : rpa0.DESTROYED;
        } else {
            rpa0Var = rpa0.DISABLED;
        }
        return rpa0Var == null ? rpa0.UNRECOGNIZED : rpa0Var;
    }

    public final boolean q() {
        return this.keyData_ != null;
    }

    public final void s(bpa0 bpa0Var) {
        this.keyData_ = bpa0Var;
    }

    public final void t(int i) {
        this.keyId_ = i;
    }

    public final void u(fuq0 fuq0Var) {
        this.outputPrefixType_ = fuq0Var.b();
    }

    public final void v() {
        this.status_ = rpa0.ENABLED.a();
    }
}
