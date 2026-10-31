package com.spotify.culturalmoments.stories.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class FullscreenVideoStory extends h implements v2j0 {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final FullscreenVideoStory DEFAULT_INSTANCE;
    public static final int MANIFEST_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_ERROR_CONFIGURATION_FIELD_NUMBER = 3;
    private BaseStory base_;
    private int bitField0_;
    private String manifestId_ = "";
    private VideoErrorConfiguration videoErrorConfiguration_;

    static {
        FullscreenVideoStory fullscreenVideoStory = new FullscreenVideoStory();
        DEFAULT_INSTANCE = fullscreenVideoStory;
        h.registerDefaultInstance(FullscreenVideoStory.class, fullscreenVideoStory);
    }

    private FullscreenVideoStory() {
    }

    public static FullscreenVideoStory o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"bitField0_", "base_", "manifestId_", "videoErrorConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new FullscreenVideoStory();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (FullscreenVideoStory.class) {
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

    public final String getManifestId() {
        return this.manifestId_;
    }

    public final BaseStory n() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.p() : baseStory;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final VideoErrorConfiguration p() {
        VideoErrorConfiguration videoErrorConfiguration = this.videoErrorConfiguration_;
        return videoErrorConfiguration == null ? VideoErrorConfiguration.p() : videoErrorConfiguration;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
