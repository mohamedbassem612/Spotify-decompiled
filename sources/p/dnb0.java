package p;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.c;
import androidx.glance.appwidget.protobuf.d;
import androidx.glance.appwidget.protobuf.e;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dnb0 extends e {
    private static final dnb0 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile ozr0 PARSER;
    private f290 layout_ = qiy0.d;
    private int nextIndex_;

    static {
        dnb0 dnb0Var = new dnb0();
        DEFAULT_INSTANCE = dnb0Var;
        e.i(dnb0.class, dnb0Var);
    }

    public static dnb0 m() {
        return DEFAULT_INSTANCE;
    }

    public static dnb0 p(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        dnb0 dnb0Var = DEFAULT_INSTANCE;
        c cVar = new c(fileInputStream);
        sz00 sz00VarA = sz00.a();
        e eVarH = dnb0Var.h();
        try {
            qm41 qm41VarC = liy0.a().c(eVarH);
            qm41VarC.h(eVarH, d.a(cVar), sz00VarA);
            qm41VarC.a(eVarH);
            if (e.e(eVarH, true)) {
                return (dnb0) eVarH;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e
    public final Object b(int i) {
        ze40 ze40Var;
        switch (l1d.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new vvz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", fnb0.class, "nextIndex_"});
            case 3:
                return new dnb0();
            case 4:
                return new cnb0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ozr0 ozr0Var = PARSER;
                if (ozr0Var != null) {
                    return ozr0Var;
                }
                synchronized (dnb0.class) {
                    try {
                        ze40Var = PARSER;
                        if (ze40Var == null) {
                            ze40Var = new ze40();
                            PARSER = ze40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ze40Var;
            default:
                k220.c();
                return null;
        }
    }

    public final void k(fnb0 fnb0Var) {
        f290 f290VarD = this.layout_;
        if (!((g9) f290VarD).a) {
            int size = f290VarD.size();
            f290VarD = ((qiy0) f290VarD).d(size == 0 ? 10 : size * 2);
            this.layout_ = f290VarD;
        }
        f290VarD.add(fnb0Var);
    }

    public final void l() {
        this.layout_ = qiy0.d;
    }

    public final f290 n() {
        return this.layout_;
    }

    public final int o() {
        return this.nextIndex_;
    }

    public final void q(int i) {
        this.nextIndex_ = i;
    }
}
