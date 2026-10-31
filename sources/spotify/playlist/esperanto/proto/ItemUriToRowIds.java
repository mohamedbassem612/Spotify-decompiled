package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ItemUriToRowIds extends h implements v2j0 {
    private static final ItemUriToRowIds DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POSITIONS_FIELD_NUMBER = 3;
    public static final int ROW_IDS_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int positionsMemoizedSerializedSize = -1;
    private String uri_ = "";
    private h290 rowIds_ = h.emptyProtobufList();
    private b290 positions_ = h.emptyIntList();

    static {
        ItemUriToRowIds itemUriToRowIds = new ItemUriToRowIds();
        DEFAULT_INSTANCE = itemUriToRowIds;
        h.registerDefaultInstance(ItemUriToRowIds.class, itemUriToRowIds);
    }

    private ItemUriToRowIds() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003+", new Object[]{"uri_", "rowIds_", "positions_"});
        }
        if (iOrdinal == 3) {
            return new ItemUriToRowIds();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (ItemUriToRowIds.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final b290 n() {
        return this.positions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.rowIds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
