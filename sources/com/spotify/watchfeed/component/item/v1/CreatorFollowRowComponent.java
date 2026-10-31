package com.spotify.watchfeed.component.item.v1;

import com.spotify.watchfeed.component.model.v1.proto.Visual;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CreatorFollowRowComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int CREATOR_URI_FIELD_NUMBER = 1;
    private static final CreatorFollowRowComponent DEFAULT_INSTANCE;
    public static final int FOLLOW_ACTION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int VISUAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private FollowAction followAction_;
    private Visual visual_;
    private String creatorUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String accessibilityText_ = "";

    public static final class FollowAction extends com.google.protobuf.h implements v2j0 {
        private static final FollowAction DEFAULT_INSTANCE;
        public static final int FOLLOWING_ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
        public static final int FOLLOWING_TEXT_FIELD_NUMBER = 2;
        public static final int FOLLOW_ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
        public static final int FOLLOW_TEXT_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String followText_ = "";
        private String followingText_ = "";
        private String followAccessibilityText_ = "";
        private String followingAccessibilityText_ = "";

        static {
            FollowAction followAction = new FollowAction();
            DEFAULT_INSTANCE = followAction;
            com.google.protobuf.h.registerDefaultInstance(FollowAction.class, followAction);
        }

        private FollowAction() {
        }

        public static FollowAction n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"followText_", "followingText_", "followAccessibilityText_", "followingAccessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new FollowAction();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (FollowAction.class) {
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
            return this.followAccessibilityText_;
        }

        public final String p() {
            return this.followText_;
        }

        public final String q() {
            return this.followingAccessibilityText_;
        }

        public final String r() {
            return this.followingText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CreatorFollowRowComponent creatorFollowRowComponent = new CreatorFollowRowComponent();
        DEFAULT_INSTANCE = creatorFollowRowComponent;
        com.google.protobuf.h.registerDefaultInstance(CreatorFollowRowComponent.class, creatorFollowRowComponent);
    }

    private CreatorFollowRowComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CreatorFollowRowComponent r(phc phcVar) {
        return (CreatorFollowRowComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ", new Object[]{"bitField0_", "creatorUri_", "visual_", "title_", "subtitle_", "followAction_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new CreatorFollowRowComponent();
        }
        if (iOrdinal == 4) {
            return new h(DEFAULT_INSTANCE);
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
        synchronized (CreatorFollowRowComponent.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.creatorUri_;
    }

    public final FollowAction p() {
        FollowAction followAction = this.followAction_;
        return followAction == null ? FollowAction.n() : followAction;
    }

    public final Visual q() {
        Visual visual = this.visual_;
        return visual == null ? Visual.o() : visual;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
