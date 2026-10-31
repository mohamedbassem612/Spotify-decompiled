package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.bh40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GenerationProgress extends h implements v2j0 {
    private static final GenerationProgress DEFAULT_INSTANCE;
    public static final int GENERATION_ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String generationId_ = "";
    private Timestamp lastUpdated_;
    private int status_;

    static {
        GenerationProgress generationProgress = new GenerationProgress();
        DEFAULT_INSTANCE = generationProgress;
        h.registerDefaultInstance(GenerationProgress.class, generationProgress);
    }

    private GenerationProgress() {
    }

    public static GenerationProgress n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "generationId_", "status_", "lastUpdated_"});
        }
        if (iOrdinal == 3) {
            return new GenerationProgress();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (GenerationProgress.class) {
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

    public final String o() {
        return this.generationId_;
    }

    public final Timestamp p() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final bh40 q() {
        bh40 bh40Var;
        int i = this.status_;
        if (i == 0) {
            bh40Var = bh40.GENERATION_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            bh40Var = bh40.GENERATION_STATUS_GENERATING;
        } else if (i == 2) {
            bh40Var = bh40.GENERATION_STATUS_GENERATED;
        } else if (i == 3) {
            bh40Var = bh40.GENERATION_STATUS_READY;
        } else if (i != 4) {
            bh40Var = i != 5 ? null : bh40.GENERATION_STATUS_NO_CREDITS;
        } else {
            bh40Var = bh40.GENERATION_STATUS_FAILED;
        }
        return bh40Var == null ? bh40.UNRECOGNIZED : bh40Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
