package spotify.mdata.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.hz00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Mdata$LocalBatchedExtensionResponse extends h implements v2j0 {
    private static final Mdata$LocalBatchedExtensionResponse DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 extension_ = h.emptyProtobufList();

    public static final class Extension extends h implements v2j0 {
        private static final Extension DEFAULT_INSTANCE;
        public static final int ENTITY_EXTENSION_FIELD_NUMBER = 2;
        public static final int EXTENSION_KIND_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private h290 entityExtension_ = h.emptyProtobufList();
        private int extensionKind_;

        static {
            Extension extension = new Extension();
            DEFAULT_INSTANCE = extension;
            h.registerDefaultInstance(Extension.class, extension);
        }

        private Extension() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"extensionKind_", "entityExtension_", EntityExtension.class});
            }
            if (iOrdinal == 3) {
                return new Extension();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (Extension.class) {
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

        public final hz00 getExtensionKind() {
            hz00 hz00VarB = hz00.b(this.extensionKind_);
            return hz00VarB == null ? hz00.V5 : hz00VarB;
        }

        public final h290 n() {
            return this.entityExtension_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Mdata$LocalBatchedExtensionResponse mdata$LocalBatchedExtensionResponse = new Mdata$LocalBatchedExtensionResponse();
        DEFAULT_INSTANCE = mdata$LocalBatchedExtensionResponse;
        h.registerDefaultInstance(Mdata$LocalBatchedExtensionResponse.class, mdata$LocalBatchedExtensionResponse);
    }

    private Mdata$LocalBatchedExtensionResponse() {
    }

    public static Mdata$LocalBatchedExtensionResponse n(byte[] bArr) {
        return (Mdata$LocalBatchedExtensionResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"extension_", Extension.class});
        }
        if (iOrdinal == 3) {
            return new Mdata$LocalBatchedExtensionResponse();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (Mdata$LocalBatchedExtensionResponse.class) {
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

    public final List getExtensionList() {
        return this.extension_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
