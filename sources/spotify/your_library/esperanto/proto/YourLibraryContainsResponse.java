package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class YourLibraryContainsResponse extends h implements v2j0 {
    private static final YourLibraryContainsResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int bitField0_;
    private h290 entity_ = h.emptyProtobufList();
    private String error_ = "";
    private YourLibraryContainsResponseHeader header_;
    private int statusCode_;

    static {
        YourLibraryContainsResponse yourLibraryContainsResponse = new YourLibraryContainsResponse();
        DEFAULT_INSTANCE = yourLibraryContainsResponse;
        h.registerDefaultInstance(YourLibraryContainsResponse.class, yourLibraryContainsResponse);
    }

    private YourLibraryContainsResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static YourLibraryContainsResponse q(byte[] bArr) {
        return (YourLibraryContainsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001c\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001bb\u000bcȈ", new Object[]{"bitField0_", "header_", "entity_", YourLibraryContainsResponseEntity.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryContainsResponse();
        }
        if (iOrdinal == 4) {
            return new dnm1((byte) 2);
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
        synchronized (YourLibraryContainsResponse.class) {
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

    public final h290 o() {
        return this.entity_;
    }

    public final String p() {
        return this.error_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
