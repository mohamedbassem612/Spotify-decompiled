package spotify.mdata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Mdata$LocalBatchedExtensionResponse$ExtensionHeader extends h implements v2j0 {
    public static final int CACHE_EXPIRY_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int CACHE_VALID_FIELD_NUMBER = 1;
    private static final Mdata$LocalBatchedExtensionResponse$ExtensionHeader DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 7;
    public static final int IS_EMPTY_FIELD_NUMBER = 4;
    public static final int OFFLINE_EXPIRY_TIMESTAMP_FIELD_NUMBER = 6;
    public static final int OFFLINE_VALID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 3;
    private long cacheExpiryTimestamp_;
    private boolean cacheValid_;
    private String etag_ = "";
    private boolean isEmpty_;
    private long offlineExpiryTimestamp_;
    private boolean offlineValid_;
    private int statusCode_;

    static {
        Mdata$LocalBatchedExtensionResponse$ExtensionHeader mdata$LocalBatchedExtensionResponse$ExtensionHeader = new Mdata$LocalBatchedExtensionResponse$ExtensionHeader();
        DEFAULT_INSTANCE = mdata$LocalBatchedExtensionResponse$ExtensionHeader;
        h.registerDefaultInstance(Mdata$LocalBatchedExtensionResponse$ExtensionHeader.class, mdata$LocalBatchedExtensionResponse$ExtensionHeader);
    }

    private Mdata$LocalBatchedExtensionResponse$ExtensionHeader() {
    }

    public static Mdata$LocalBatchedExtensionResponse$ExtensionHeader n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ", new Object[]{"cacheValid_", "offlineValid_", "statusCode_", "isEmpty_", "cacheExpiryTimestamp_", "offlineExpiryTimestamp_", "etag_"});
        }
        if (iOrdinal == 3) {
            return new Mdata$LocalBatchedExtensionResponse$ExtensionHeader();
        }
        if (iOrdinal == 4) {
            return new d(DEFAULT_INSTANCE);
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
        synchronized (Mdata$LocalBatchedExtensionResponse$ExtensionHeader.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
