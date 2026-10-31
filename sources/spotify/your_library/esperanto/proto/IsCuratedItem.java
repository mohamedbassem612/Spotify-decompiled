package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gf90;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class IsCuratedItem extends h implements v2j0 {
    private static final IsCuratedItem DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 4;
    public static final int IS_CURATED_FIELD_NUMBER = 2;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean isBanned_;
    private boolean isCurated_;
    private boolean isInCollection_;
    private String uri_ = "";

    static {
        IsCuratedItem isCuratedItem = new IsCuratedItem();
        DEFAULT_INSTANCE = isCuratedItem;
        h.registerDefaultInstance(IsCuratedItem.class, isCuratedItem);
    }

    private IsCuratedItem() {
    }

    public static IsCuratedItem o() {
        return DEFAULT_INSTANCE;
    }

    public static gf90 p() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"uri_", "isCurated_", "isInCollection_", "isBanned_"});
        }
        if (iOrdinal == 3) {
            return new IsCuratedItem();
        }
        if (iOrdinal == 4) {
            return new gf90();
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
        synchronized (IsCuratedItem.class) {
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

    public final boolean getIsBanned() {
        return this.isBanned_;
    }

    public final boolean getIsCurated() {
        return this.isCurated_;
    }

    public final boolean getIsInCollection() {
        return this.isInCollection_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(boolean z) {
        this.isCurated_ = z;
    }

    public final void setIsInCollection(boolean z) {
        this.isInCollection_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
