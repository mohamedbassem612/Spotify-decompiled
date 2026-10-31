package spotify.collection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s190;
import p.s2j0;
import p.v2j0;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CollectionContainsResponse extends h implements v2j0 {
    public static final int BAN_FOUND_FIELD_NUMBER = 3;
    private static final CollectionContainsResponse DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private StatusOuterClass$Status status_;
    private int foundMemoizedSerializedSize = -1;
    private int banFoundMemoizedSerializedSize = -1;
    private s190 found_ = h.emptyBooleanList();
    private s190 banFound_ = h.emptyBooleanList();

    static {
        CollectionContainsResponse collectionContainsResponse = new CollectionContainsResponse();
        DEFAULT_INSTANCE = collectionContainsResponse;
        h.registerDefaultInstance(CollectionContainsResponse.class, collectionContainsResponse);
    }

    private CollectionContainsResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CollectionContainsResponse r(byte[] bArr) {
        return (CollectionContainsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002*\u0003*", new Object[]{"bitField0_", "status_", "found_", "banFound_"});
        }
        if (iOrdinal == 3) {
            return new CollectionContainsResponse();
        }
        if (iOrdinal == 4) {
            return new blg((byte) 5);
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
        synchronized (CollectionContainsResponse.class) {
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

    public final int o() {
        return this.banFound_.size();
    }

    public final s190 p() {
        return this.banFound_;
    }

    public final s190 q() {
        return this.found_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
