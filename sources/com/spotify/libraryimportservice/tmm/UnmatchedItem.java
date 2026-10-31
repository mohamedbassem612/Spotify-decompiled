package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.ri90;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class UnmatchedItem extends h implements v2j0 {
    public static final int ALTERNATIVES_FIELD_NUMBER = 6;
    public static final int ALTERNATIVE_TYPE_FIELD_NUMBER = 5;
    private static final UnmatchedItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int alternativeType_;
    private String id_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String imageUrl_ = "";
    private h290 alternatives_ = h.emptyProtobufList();

    static {
        UnmatchedItem unmatchedItem = new UnmatchedItem();
        DEFAULT_INSTANCE = unmatchedItem;
        h.registerDefaultInstance(UnmatchedItem.class, unmatchedItem);
    }

    private UnmatchedItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006\u001b", new Object[]{"id_", "title_", "subtitle_", "imageUrl_", "alternativeType_", "alternatives_", ItemAlternative.class});
        }
        if (iOrdinal == 3) {
            return new UnmatchedItem();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (UnmatchedItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final ri90 n() {
        ri90 ri90Var;
        int i = this.alternativeType_;
        if (i == 0) {
            ri90Var = ri90.ITEM_ALTERNATIVE_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            ri90Var = ri90.ITEM_ALTERNATIVE_TYPE_UNAVAILABLE;
        } else if (i != 2) {
            ri90Var = i != 3 ? null : ri90.ITEM_ALTERNATIVE_TYPE_RECOMMENDATION;
        } else {
            ri90Var = ri90.ITEM_ALTERNATIVE_TYPE_VARIATION;
        }
        return ri90Var == null ? ri90.UNRECOGNIZED : ri90Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.alternatives_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
