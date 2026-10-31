package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class IsCuratedResponse extends h implements v2j0 {
    private static final IsCuratedResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int statusCode_;
    private h290 item_ = h.emptyProtobufList();
    private String error_ = "";

    static {
        IsCuratedResponse isCuratedResponse = new IsCuratedResponse();
        DEFAULT_INSTANCE = isCuratedResponse;
        h.registerDefaultInstance(IsCuratedResponse.class, isCuratedResponse);
    }

    private IsCuratedResponse() {
    }

    public static IsCuratedResponse o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static IsCuratedResponse r(byte[] bArr) {
        return (IsCuratedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001c\u0003\u0000\u0001\u0000\u0001\u001bb\u000bcȈ", new Object[]{"item_", IsCuratedItem.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new IsCuratedResponse();
        }
        if (iOrdinal == 4) {
            return new h780((byte) 17);
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
        synchronized (IsCuratedResponse.class) {
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

    public final int p() {
        return this.item_.size();
    }

    public final h290 q() {
        return this.item_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
