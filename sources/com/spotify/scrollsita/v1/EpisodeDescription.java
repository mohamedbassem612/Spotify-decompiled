package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h3z;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EpisodeDescription extends h implements v2j0 {
    private static final EpisodeDescription DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int HEADING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String entityUri_ = "";
    private Heading heading_;

    static {
        EpisodeDescription episodeDescription = new EpisodeDescription();
        DEFAULT_INSTANCE = episodeDescription;
        h.registerDefaultInstance(EpisodeDescription.class, episodeDescription);
    }

    private EpisodeDescription() {
    }

    public static EpisodeDescription n() {
        return DEFAULT_INSTANCE;
    }

    public static h3z p() {
        return (h3z) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "entityUri_", "heading_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeDescription();
        }
        if (iOrdinal == 4) {
            return new h3z(DEFAULT_INSTANCE);
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
        synchronized (EpisodeDescription.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Heading o() {
        Heading heading = this.heading_;
        return heading == null ? Heading.n() : heading;
    }

    public final void q(String str) {
        str.getClass();
        this.entityUri_ = str;
    }

    public final void r(Heading heading) {
        heading.getClass();
        this.heading_ = heading;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
