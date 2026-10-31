package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uat;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ContentCategory extends h implements v2j0 {
    private static final ContentCategory DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 3;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int density_;
    private Heading heading_;
    private h290 items_ = h.emptyProtobufList();

    static {
        ContentCategory contentCategory = new ContentCategory();
        DEFAULT_INSTANCE = contentCategory;
        h.registerDefaultInstance(ContentCategory.class, contentCategory);
    }

    private ContentCategory() {
    }

    public static ContentCategory n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\f", new Object[]{"bitField0_", "heading_", "items_", Item.class, "density_"});
        }
        if (iOrdinal == 3) {
            return new ContentCategory();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (ContentCategory.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final uat o() {
        uat uatVar;
        int i = this.density_;
        if (i == 0) {
            uatVar = uat.UNDEFINED;
        } else if (i != 1) {
            uatVar = i != 2 ? null : uat.COMPACT;
        } else {
            uatVar = uat.NORMAL;
        }
        return uatVar == null ? uat.UNRECOGNIZED : uatVar;
    }

    public final Heading p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.n() : heading;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
