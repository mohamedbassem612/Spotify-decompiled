package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xk81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Signal extends h implements v2j0 {
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 3;
    private static final Signal DEFAULT_INSTANCE;
    public static final int FORCE_FIELD_NUMBER = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int INSTANCE_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNAL_DATA_FIELD_NUMBER = 2;
    private phc clientPayload_;
    private boolean force_;
    private String identifier_ = "";
    private String instanceId_;
    private phc signalData_;

    static {
        Signal signal = new Signal();
        DEFAULT_INSTANCE = signal;
        h.registerDefaultInstance(Signal.class, signal);
    }

    private Signal() {
        hhc hhcVar = phc.b;
        this.signalData_ = hhcVar;
        this.clientPayload_ = hhcVar;
        this.instanceId_ = "";
    }

    public static xk81 n() {
        return (xk81) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004\u0007\u0005Ȉ", new Object[]{"identifier_", "signalData_", "clientPayload_", "force_", "instanceId_"});
        }
        if (iOrdinal == 3) {
            return new Signal();
        }
        if (iOrdinal == 4) {
            return new xk81(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (Signal.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(phc phcVar) {
        phcVar.getClass();
        this.clientPayload_ = phcVar;
    }

    public final void p(boolean z) {
        this.force_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.identifier_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.instanceId_ = str;
    }

    public final void s(phc phcVar) {
        phcVar.getClass();
        this.signalData_ = phcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
