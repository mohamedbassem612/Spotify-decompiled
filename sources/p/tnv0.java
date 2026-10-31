package p;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tnv0 extends e {
    private static final tnv0 DEFAULT_INSTANCE;
    private static volatile rzr0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private rng0 preferences_ = rng0.b;

    static {
        tnv0 tnv0Var = new tnv0();
        DEFAULT_INSTANCE = tnv0Var;
        e.h(tnv0.class, tnv0Var);
    }

    public static rnv0 k() {
        return (rnv0) ((ye40) DEFAULT_INSTANCE.d(5));
    }

    public static tnv0 l(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        tnv0 tnv0Var = DEFAULT_INSTANCE;
        jme jmeVarQ0 = jme.q0(fileInputStream);
        wz00 wz00VarA = wz00.a();
        e eVar = (e) tnv0Var.d(4);
        try {
            piy0 piy0Var = piy0.c;
            piy0Var.getClass();
            tm41 tm41VarA = piy0Var.a(eVar.getClass());
            tm41VarA.i(eVar, d.M(jmeVarQ0), wz00VarA);
            tm41VarA.a(eVar);
            if (eVar.g()) {
                return (tnv0) eVar;
            }
            throw new UninitializedMessageException().a();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e
    public final Object d(int i) {
        cf40 cf40Var;
        switch (l1d.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yvz0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", snv0.a});
            case 3:
                return new tnv0();
            case 4:
                return new rnv0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                rzr0 rzr0Var = PARSER;
                if (rzr0Var != null) {
                    return rzr0Var;
                }
                synchronized (tnv0.class) {
                    try {
                        cf40Var = PARSER;
                        if (cf40Var == null) {
                            cf40Var = new cf40();
                            PARSER = cf40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cf40Var;
            default:
                k220.c();
                return null;
        }
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final rng0 j() {
        rng0 rng0Var = this.preferences_;
        if (rng0Var.a) {
            return rng0Var;
        }
        rng0 rng0VarB = rng0Var.b();
        this.preferences_ = rng0VarB;
        return rng0VarB;
    }
}
