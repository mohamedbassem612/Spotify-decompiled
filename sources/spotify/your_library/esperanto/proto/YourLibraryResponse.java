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
public final class YourLibraryResponse extends h implements v2j0 {
    private static final YourLibraryResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PINNED_ENTITY_FIELD_NUMBER = 3;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int bitField0_;
    private YourLibraryResponseHeader header_;
    private int statusCode_;
    private h290 entity_ = h.emptyProtobufList();
    private h290 pinnedEntity_ = h.emptyProtobufList();
    private String error_ = "";

    static {
        YourLibraryResponse yourLibraryResponse = new YourLibraryResponse();
        DEFAULT_INSTANCE = yourLibraryResponse;
        h.registerDefaultInstance(YourLibraryResponse.class, yourLibraryResponse);
    }

    private YourLibraryResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static YourLibraryResponse s(byte[] bArr) {
        return (YourLibraryResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001c\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001bb\u0004cȈ", new Object[]{"bitField0_", "header_", "entity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, "pinnedEntity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryResponse();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (YourLibraryResponse.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    public final h290 n() {
        return this.entity_;
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

    public final YourLibraryResponseHeader q() {
        YourLibraryResponseHeader yourLibraryResponseHeader = this.header_;
        return yourLibraryResponseHeader == null ? YourLibraryResponseHeader.p() : yourLibraryResponseHeader;
    }

    public final h290 r() {
        return this.pinnedEntity_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
