package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c2t0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PinRequest extends h implements v2j0 {
    public static final int AFTER_URI_FIELD_NUMBER = 2;
    public static final int BEFORE_URI_FIELD_NUMBER = 3;
    private static final PinRequest DEFAULT_INSTANCE;
    public static final int FIRST_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private Object position_;
    private int positionCase_ = 0;
    private String uri_ = "";

    static {
        PinRequest pinRequest = new PinRequest();
        DEFAULT_INSTANCE = pinRequest;
        h.registerDefaultInstance(PinRequest.class, pinRequest);
    }

    private PinRequest() {
    }

    public static c2t0 n() {
        return (c2t0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004:\u0000", new Object[]{"position_", "positionCase_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new PinRequest();
        }
        if (iOrdinal == 4) {
            return new c2t0(DEFAULT_INSTANCE);
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
        synchronized (PinRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
