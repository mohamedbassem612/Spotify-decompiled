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
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecorateResponse extends h implements v2j0 {
    private static final YourLibraryDecorateResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int bitField0_;
    private h290 entity_ = h.emptyProtobufList();
    private String error_ = "";
    private YourLibraryDecorateResponseHeader header_;
    private int statusCode_;

    static {
        YourLibraryDecorateResponse yourLibraryDecorateResponse = new YourLibraryDecorateResponse();
        DEFAULT_INSTANCE = yourLibraryDecorateResponse;
        h.registerDefaultInstance(YourLibraryDecorateResponse.class, yourLibraryDecorateResponse);
    }

    private YourLibraryDecorateResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static YourLibraryDecorateResponse q(byte[] bArr) {
        return (YourLibraryDecorateResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final int a() {
        return this.entity_.size();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001c\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001bb\u000bcȈ", new Object[]{"bitField0_", "header_", "entity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecorateResponse();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (YourLibraryDecorateResponse.class) {
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

    public final YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity n() {
        return (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) this.entity_.get(0);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.entity_;
    }

    public final YourLibraryDecorateResponseHeader p() {
        YourLibraryDecorateResponseHeader yourLibraryDecorateResponseHeader = this.header_;
        return yourLibraryDecorateResponseHeader == null ? YourLibraryDecorateResponseHeader.n() : yourLibraryDecorateResponseHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
