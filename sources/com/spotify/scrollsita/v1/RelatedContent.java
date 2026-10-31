package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RelatedContent extends h implements v2j0 {
    private static final RelatedContent DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SEED_URI_FIELD_NUMBER = 2;
    public static final int URIS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Heading heading_;
    private h290 uris_ = h.emptyProtobufList();
    private String seedUri_ = "";

    static {
        RelatedContent relatedContent = new RelatedContent();
        DEFAULT_INSTANCE = relatedContent;
        h.registerDefaultInstance(RelatedContent.class, relatedContent);
    }

    private RelatedContent() {
    }

    public static RelatedContent n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "uris_", "seedUri_", "heading_"});
        }
        if (iOrdinal == 3) {
            return new RelatedContent();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (RelatedContent.class) {
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

    public final List getUrisList() {
        return this.uris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading o() {
        Heading heading = this.heading_;
        return heading == null ? Heading.n() : heading;
    }

    public final String p() {
        return this.seedUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
