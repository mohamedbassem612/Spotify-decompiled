package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SetFilterOrder$SetFilterOrderResponse extends h implements v2j0 {
    private static final SetFilterOrder$SetFilterOrderResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private String error_ = "";
    private int statusCode_;

    static {
        SetFilterOrder$SetFilterOrderResponse setFilterOrder$SetFilterOrderResponse = new SetFilterOrder$SetFilterOrderResponse();
        DEFAULT_INSTANCE = setFilterOrder$SetFilterOrderResponse;
        h.registerDefaultInstance(SetFilterOrder$SetFilterOrderResponse.class, setFilterOrder$SetFilterOrderResponse);
    }

    private SetFilterOrder$SetFilterOrderResponse() {
    }

    public static SetFilterOrder$SetFilterOrderResponse n(byte[] bArr) {
        return (SetFilterOrder$SetFilterOrderResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000bc\u0002\u0000\u0000\u0000b\u000bcȈ", new Object[]{"statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new SetFilterOrder$SetFilterOrderResponse();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (SetFilterOrder$SetFilterOrderResponse.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
