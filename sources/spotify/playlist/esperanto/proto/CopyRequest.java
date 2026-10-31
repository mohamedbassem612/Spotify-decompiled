package spotify.playlist.esperanto.proto;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import com.spotify.playlist.proto.CreationInfo;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CopyRequest extends h implements v2j0 {
    public static final int ALL_FIELD_NUMBER = 3;
    public static final int CREATION_INFO_FIELD_NUMBER = 5;
    private static final CopyRequest DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int ITEM_IDS_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private CreationInfo creationInfo_;
    private Object items_;
    private PlaylistQuery query_;
    private int itemsCase_ = 0;
    private String uri_ = "";
    private String name_ = "";
    private String description_ = "";

    public static final class ItemIdSet extends h implements v2j0 {
        private static final ItemIdSet DEFAULT_INSTANCE;
        public static final int ITEM_IDS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private h290 itemIds_ = h.emptyProtobufList();

        static {
            ItemIdSet itemIdSet = new ItemIdSet();
            DEFAULT_INSTANCE = itemIdSet;
            h.registerDefaultInstance(ItemIdSet.class, itemIdSet);
        }

        private ItemIdSet() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"itemIds_"});
            }
            if (iOrdinal == 3) {
                return new ItemIdSet();
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
            synchronized (ItemIdSet.class) {
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

    static {
        CopyRequest copyRequest = new CopyRequest();
        DEFAULT_INSTANCE = copyRequest;
        h.registerDefaultInstance(CopyRequest.class, copyRequest);
    }

    private CopyRequest() {
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ", new Object[]{"items_", "itemsCase_", "bitField0_", "uri_", "query_", Empty.class, ItemIdSet.class, "creationInfo_", "name_", "description_"});
        }
        if (iOrdinal == 3) {
            return new CopyRequest();
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
        synchronized (CopyRequest.class) {
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

    public final void o(Empty empty) {
        empty.getClass();
        this.items_ = empty;
        this.itemsCase_ = 3;
    }

    public final void p(CreationInfo creationInfo) {
        creationInfo.getClass();
        this.creationInfo_ = creationInfo;
        this.bitField0_ |= 2;
    }

    public final void q(String str) {
        this.name_ = str;
    }

    public final void r(PlaylistQuery playlistQuery) {
        this.query_ = playlistQuery;
        this.bitField0_ |= 1;
    }

    public final void s(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
