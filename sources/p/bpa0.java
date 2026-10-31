package p;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bpa0 extends e {
    private static final bpa0 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile pzr0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ohc value_ = ohc.b;

    static {
        bpa0 bpa0Var = new bpa0();
        DEFAULT_INSTANCE = bpa0Var;
        e.l(bpa0.class, bpa0Var);
    }

    public static bpa0 m() {
        return DEFAULT_INSTANCE;
    }

    public static zoa0 q() {
        return (zoa0) DEFAULT_INSTANCE.e();
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
                return new wvz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new bpa0();
            case 4:
                return new zoa0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                pzr0 pzr0Var = PARSER;
                if (pzr0Var != null) {
                    return pzr0Var;
                }
                synchronized (bpa0.class) {
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

    public final apa0 n() {
        apa0 apa0Var;
        int i = this.keyMaterialType_;
        if (i == 0) {
            apa0Var = apa0.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            apa0Var = apa0.SYMMETRIC;
        } else if (i == 2) {
            apa0Var = apa0.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            apa0Var = i != 4 ? null : apa0.REMOTE;
        } else {
            apa0Var = apa0.ASYMMETRIC_PUBLIC;
        }
        return apa0Var == null ? apa0.UNRECOGNIZED : apa0Var;
    }

    public final String o() {
        return this.typeUrl_;
    }

    public final ohc p() {
        return this.value_;
    }

    public final void r(apa0 apa0Var) {
        if (apa0Var != apa0.UNRECOGNIZED) {
            this.keyMaterialType_ = apa0Var.a;
        } else {
            apa0Var.getClass();
            hhg1.n("Can't get the number of an unknown enum value.");
        }
    }

    public final void s(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void t(ghc ghcVar) {
        this.value_ = ghcVar;
    }
}
