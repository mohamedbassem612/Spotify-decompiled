package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.EntityImage;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RankedListSection extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 1;
    private static final RankedListSection DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private EntityImage artwork_;
    private int bitField0_;
    private String title_ = "";
    private h290 items_ = h.emptyProtobufList();

    static {
        RankedListSection rankedListSection = new RankedListSection();
        DEFAULT_INSTANCE = rankedListSection;
        h.registerDefaultInstance(RankedListSection.class, rankedListSection);
    }

    private RankedListSection() {
    }

    public static RankedListSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b", new Object[]{"bitField0_", "artwork_", "title_", "items_", RankedListItem.class});
        }
        if (iOrdinal == 3) {
            return new RankedListSection();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (RankedListSection.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final EntityImage n() {
        EntityImage entityImage = this.artwork_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
