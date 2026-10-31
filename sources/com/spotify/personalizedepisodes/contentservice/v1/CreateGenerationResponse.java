package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.twt0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class CreateGenerationResponse extends h implements v2j0 {
    private static final CreateGenerationResponse DEFAULT_INSTANCE;
    public static final int DEFAULT_NEW_SHOW_ARTWORK_FIELD_NUMBER = 8;
    public static final int GENERATION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 2;
    public static final int PROMPT_FIELD_NUMBER = 10;
    public static final int RECOMMENDED_PLAYBACK_CONTROL_FIELD_NUMBER = 9;
    public static final int RECOMMENDED_SCHEDULE_FIELD_NUMBER = 5;
    public static final int RECOMMENDED_TOOLS_FIELD_NUMBER = 7;
    public static final int SCHEDULE_LOCKED_FIELD_NUMBER = 6;
    public static final int SHOWS_FIELD_NUMBER = 3;
    public static final int VOICE_FIELD_NUMBER = 4;
    private int bitField0_;
    private Preview preview_;
    private int recommendedPlaybackControl_;
    private Schedule recommendedSchedule_;
    private boolean scheduleLocked_;
    private Voice voice_;
    private String generationId_ = "";
    private h290 shows_ = h.emptyProtobufList();
    private h290 recommendedTools_ = h.emptyProtobufList();
    private String defaultNewShowArtwork_ = "";
    private String prompt_ = "";

    static {
        CreateGenerationResponse createGenerationResponse = new CreateGenerationResponse();
        DEFAULT_INSTANCE = createGenerationResponse;
        h.registerDefaultInstance(CreateGenerationResponse.class, createGenerationResponse);
    }

    private CreateGenerationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u0007\u0007\u001b\bȈ\t\f\nȈ", new Object[]{"bitField0_", "generationId_", "preview_", "shows_", ShowItem.class, "voice_", "recommendedSchedule_", "scheduleLocked_", "recommendedTools_", RecommendedTool.class, "defaultNewShowArtwork_", "recommendedPlaybackControl_", "prompt_"});
        }
        if (iOrdinal == 3) {
            return new CreateGenerationResponse();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (CreateGenerationResponse.class) {
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

    public final String getPrompt() {
        return this.prompt_;
    }

    public final String n() {
        return this.defaultNewShowArtwork_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.generationId_;
    }

    public final Preview p() {
        Preview preview = this.preview_;
        return preview == null ? Preview.o() : preview;
    }

    public final twt0 q() {
        twt0 twt0VarA = twt0.a(this.recommendedPlaybackControl_);
        return twt0VarA == null ? twt0.UNRECOGNIZED : twt0VarA;
    }

    public final Schedule r() {
        Schedule schedule = this.recommendedSchedule_;
        return schedule == null ? Schedule.p() : schedule;
    }

    public final h290 s() {
        return this.recommendedTools_;
    }

    public final boolean t() {
        return this.scheduleLocked_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.shows_;
    }

    public final Voice v() {
        Voice voice = this.voice_;
        return voice == null ? Voice.n() : voice;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
