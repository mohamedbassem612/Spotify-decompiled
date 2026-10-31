package spotify.mdata.proto;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Mdata$LocalBatchedExtensionResponse$EntityExtension extends h implements v2j0 {
    private static final Mdata$LocalBatchedExtensionResponse$EntityExtension DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String entityUri_ = "";
    private Any extensionData_;
    private Mdata$LocalBatchedExtensionResponse$ExtensionHeader header_;

    static {
        Mdata$LocalBatchedExtensionResponse$EntityExtension mdata$LocalBatchedExtensionResponse$EntityExtension = new Mdata$LocalBatchedExtensionResponse$EntityExtension();
        DEFAULT_INSTANCE = mdata$LocalBatchedExtensionResponse$EntityExtension;
        h.registerDefaultInstance(Mdata$LocalBatchedExtensionResponse$EntityExtension.class, mdata$LocalBatchedExtensionResponse$EntityExtension);
    }

    private Mdata$LocalBatchedExtensionResponse$EntityExtension() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "entityUri_", "header_", "extensionData_"});
        }
        if (iOrdinal == 3) {
            return new Mdata$LocalBatchedExtensionResponse$EntityExtension();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (Mdata$LocalBatchedExtensionResponse$EntityExtension.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final Any n() {
        Any any = this.extensionData_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Mdata$LocalBatchedExtensionResponse$ExtensionHeader o() {
        Mdata$LocalBatchedExtensionResponse$ExtensionHeader mdata$LocalBatchedExtensionResponse$ExtensionHeader = this.header_;
        return mdata$LocalBatchedExtensionResponse$ExtensionHeader == null ? Mdata$LocalBatchedExtensionResponse$ExtensionHeader.n() : mdata$LocalBatchedExtensionResponse$ExtensionHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
