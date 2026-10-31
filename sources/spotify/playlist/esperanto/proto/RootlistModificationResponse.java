package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.playlist.proto.ModificationResponse;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class RootlistModificationResponse extends h implements v2j0 {
    private static final RootlistModificationResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ModificationResponse response_;
    private ResponseStatus status_;

    static {
        RootlistModificationResponse rootlistModificationResponse = new RootlistModificationResponse();
        DEFAULT_INSTANCE = rootlistModificationResponse;
        h.registerDefaultInstance(RootlistModificationResponse.class, rootlistModificationResponse);
    }

    private RootlistModificationResponse() {
    }

    public static RootlistModificationResponse p(byte[] bArr) {
        return (RootlistModificationResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "response_"});
        }
        if (iOrdinal == 3) {
            return new RootlistModificationResponse();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (RootlistModificationResponse.class) {
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

    public final ModificationResponse n() {
        ModificationResponse modificationResponse = this.response_;
        return modificationResponse == null ? ModificationResponse.n() : modificationResponse;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ResponseStatus o() {
        ResponseStatus responseStatus = this.status_;
        return responseStatus == null ? ResponseStatus.o() : responseStatus;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
