package com.spotify.culturalmoments.stories.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BaseStory extends h implements v2j0 {
    public static final int ACCESSIBILITY_TITLE_FIELD_NUMBER = 3;
    public static final int AUDIO_TRACK_URL_FIELD_NUMBER = 4;
    private static final BaseStory DEFAULT_INSTANCE;
    public static final int DURATION_MILLIS_FIELD_NUMBER = 2;
    public static final int LOGGING_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    private long durationMillis_;
    private int position_;
    private String accessibilityTitle_ = "";
    private String audioTrackUrl_ = "";
    private String loggingId_ = "";

    static {
        BaseStory baseStory = new BaseStory();
        DEFAULT_INSTANCE = baseStory;
        h.registerDefaultInstance(BaseStory.class, baseStory);
    }

    private BaseStory() {
    }

    public static BaseStory p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"position_", "durationMillis_", "accessibilityTitle_", "audioTrackUrl_", "loggingId_"});
        }
        if (iOrdinal == 3) {
            return new BaseStory();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (BaseStory.class) {
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
        return this.accessibilityTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.audioTrackUrl_;
    }

    public final long q() {
        return this.durationMillis_;
    }

    public final String r() {
        return this.loggingId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
