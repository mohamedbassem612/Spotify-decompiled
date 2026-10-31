package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tpa0 extends e {
    private static final tpa0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile pzr0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ohc value_ = ohc.b;

    static {
        tpa0 tpa0Var = new tpa0();
        DEFAULT_INSTANCE = tpa0Var;
        e.l(tpa0.class, tpa0Var);
    }

    public static tpa0 m() {
        return DEFAULT_INSTANCE;
    }

    public static spa0 q() {
        return (spa0) DEFAULT_INSTANCE.e();
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new tpa0();
            case 4:
                return new spa0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (tpa0.class) {
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

    public final fuq0 n() {
        fuq0 fuq0VarA = fuq0.a(this.outputPrefixType_);
        return fuq0VarA == null ? fuq0.UNRECOGNIZED : fuq0VarA;
    }

    public final String o() {
        return this.typeUrl_;
    }

    public final ohc p() {
        return this.value_;
    }

    public final void r(fuq0 fuq0Var) {
        this.outputPrefixType_ = fuq0Var.b();
    }

    public final void s(String str) {
        this.typeUrl_ = str;
    }

    public final void t(ghc ghcVar) {
        this.value_ = ghcVar;
    }
}
