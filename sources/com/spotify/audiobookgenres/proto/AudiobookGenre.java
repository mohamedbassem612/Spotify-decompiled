package com.spotify.audiobookgenres.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudiobookGenre extends h implements v2j0 {
    public static final int CONTEXTUAL_NAME_FIELD_NUMBER = 2;
    private static final AudiobookGenre DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 3;
    public static final int DESTINATION_URI_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int PARENT_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHORT_NAME_FIELD_NUMBER = 6;
    private int depth_;
    private String id_ = "";
    private String contextualName_ = "";
    private String parentId_ = "";
    private String destinationUri_ = "";
    private String shortName_ = "";

    static {
        AudiobookGenre audiobookGenre = new AudiobookGenre();
        DEFAULT_INSTANCE = audiobookGenre;
        h.registerDefaultInstance(AudiobookGenre.class, audiobookGenre);
    }

    private AudiobookGenre() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"id_", "contextualName_", "depth_", "parentId_", "destinationUri_", "shortName_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookGenre();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (AudiobookGenre.class) {
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

    public final String n() {
        return this.contextualName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.depth_;
    }

    public final String p() {
        return this.destinationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
