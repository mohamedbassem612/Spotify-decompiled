package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.twt0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Preset extends h implements v2j0 {
    public static final int ARTWORK_SUBCATEGORY_FIELD_NUMBER = 14;
    public static final int ARTWORK_URL_FIELD_NUMBER = 5;
    public static final int AUDIO_PREVIEW_URL_FIELD_NUMBER = 13;
    private static final Preset DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ESTIMATED_LENGTH_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 10;
    public static final int PROMPT_FIELD_NUMBER = 12;
    public static final int SCHEDULE_FIELD_NUMBER = 7;
    public static final int STEPS_FIELD_NUMBER = 9;
    public static final int SYNOPSIS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VOICE_FIELD_NUMBER = 8;
    private int bitField0_;
    private int playbackControl_;
    private Schedule schedule_;
    private Voice voice_;
    private String id_ = "";
    private String title_ = "";
    private String synopsis_ = "";
    private String description_ = "";
    private String artworkUrl_ = "";
    private String estimatedLength_ = "";
    private h290 steps_ = h.emptyProtobufList();
    private String prompt_ = "";
    private String audioPreviewUrl_ = "";
    private String artworkSubcategory_ = "";

    static {
        Preset preset = new Preset();
        DEFAULT_INSTANCE = preset;
        h.registerDefaultInstance(Preset.class, preset);
    }

    private Preset() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Preset q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\t\u001b\n\f\fȈ\rȈ\u000eȈ", new Object[]{"bitField0_", "id_", "title_", "synopsis_", "description_", "artworkUrl_", "estimatedLength_", "schedule_", "voice_", "steps_", PresetStep.class, "playbackControl_", "prompt_", "audioPreviewUrl_", "artworkSubcategory_"});
        }
        if (iOrdinal == 3) {
            return new Preset();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Preset.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getId() {
        return this.id_;
    }

    public final String getPrompt() {
        return this.prompt_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.artworkSubcategory_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artworkUrl_;
    }

    public final String p() {
        return this.audioPreviewUrl_;
    }

    public final String r() {
        return this.estimatedLength_;
    }

    public final twt0 s() {
        twt0 twt0VarA = twt0.a(this.playbackControl_);
        return twt0VarA == null ? twt0.e : twt0VarA;
    }

    public final Schedule t() {
        Schedule schedule = this.schedule_;
        return schedule == null ? Schedule.p() : schedule;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.steps_;
    }

    public final String v() {
        return this.synopsis_;
    }

    public final Voice w() {
        Voice voice = this.voice_;
        return voice == null ? Voice.n() : voice;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 2) != 0;
    }
}
