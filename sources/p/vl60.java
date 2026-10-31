package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vl60 extends e {
    private static final vl60 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile pzr0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ohc keyValue_ = ohc.b;
    private am60 params_;
    private int version_;

    static {
        vl60 vl60Var = new vl60();
        DEFAULT_INSTANCE = vl60Var;
        e.l(vl60.class, vl60Var);
    }

    public static vl60 n() {
        return DEFAULT_INSTANCE;
    }

    public static ul60 r() {
        return DEFAULT_INSTANCE.e();
    }

    public static vl60 s(ohc ohcVar, tz00 tz00Var) {
        return (vl60) e.j(DEFAULT_INSTANCE, ohcVar, tz00Var);
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new vl60();
            case 4:
                return new ul60();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (vl60.class) {
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

    public final ohc o() {
        return this.keyValue_;
    }

    public final am60 p() {
        am60 am60Var = this.params_;
        return am60Var == null ? am60.m() : am60Var;
    }

    public final int q() {
        return this.version_;
    }

    public final void t(ghc ghcVar) {
        this.keyValue_ = ghcVar;
    }

    public final void u(am60 am60Var) {
        am60Var.getClass();
        this.params_ = am60Var;
    }

    public final void v() {
        this.version_ = 0;
    }
}
