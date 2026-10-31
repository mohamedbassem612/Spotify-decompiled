package com.spotify.wrapped.v1.proto;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.model.v1.HeaderOverrides;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WrappedLayout extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 7;
    public static final int BOTTOM_COMPONENT_FIELD_NUMBER = 8;
    private static final WrappedLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int STORY_CARD_FIELD_NUMBER = 6;
    private AudioPreview audioPreview_;
    private int bitField0_;
    private Any bottomComponent_;
    private HeaderOverrides headerOverrides_;
    private String id_ = "";
    private String navigateUri_ = "";
    private StoryCard storyCard_;

    static {
        WrappedLayout wrappedLayout = new WrappedLayout();
        DEFAULT_INSTANCE = wrappedLayout;
        com.google.protobuf.h.registerDefaultInstance(WrappedLayout.class, wrappedLayout);
    }

    private WrappedLayout() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WrappedLayout u(phc phcVar) {
        return (WrappedLayout) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "id_", "navigateUri_", "headerOverrides_", "storyCard_", "audioPreview_", "bottomComponent_"});
        }
        if (iOrdinal == 3) {
            return new WrappedLayout();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (WrappedLayout.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final AudioPreview n() {
        AudioPreview audioPreview = this.audioPreview_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Any o() {
        Any any = this.bottomComponent_;
        return any == null ? Any.o() : any;
    }

    public final HeaderOverrides p() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.p() : headerOverrides;
    }

    public final String q() {
        return this.navigateUri_;
    }

    public final StoryCard r() {
        StoryCard storyCard = this.storyCard_;
        return storyCard == null ? StoryCard.t() : storyCard;
    }

    public final boolean s() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
