package com.spotify.episode.episodeassociationsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeassociationsResponse$Episode extends h implements v2j0 {
    private static final EpisodeassociationsResponse$Episode DEFAULT_INSTANCE;
    public static final int IS_19_PLUS_FIELD_NUMBER = 3;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_NAME_FIELD_NUMBER = 1;
    private boolean is19Plus_;
    private boolean isExplicit_;
    private String showName_ = "";

    static {
        EpisodeassociationsResponse$Episode episodeassociationsResponse$Episode = new EpisodeassociationsResponse$Episode();
        DEFAULT_INSTANCE = episodeassociationsResponse$Episode;
        h.registerDefaultInstance(EpisodeassociationsResponse$Episode.class, episodeassociationsResponse$Episode);
    }

    private EpisodeassociationsResponse$Episode() {
    }

    public static EpisodeassociationsResponse$Episode n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"showName_", "isExplicit_", "is19Plus_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeassociationsResponse$Episode();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (EpisodeassociationsResponse$Episode.class) {
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

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.is19Plus_;
    }

    public final String p() {
        return this.showName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
