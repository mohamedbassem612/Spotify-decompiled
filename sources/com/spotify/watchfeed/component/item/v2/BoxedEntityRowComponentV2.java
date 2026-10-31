package com.spotify.watchfeed.component.item.v2;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BoxedEntityRowComponentV2 extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int BUTTON_FIELD_NUMBER = 8;
    private static final BoxedEntityRowComponentV2 DEFAULT_INSTANCE;
    public static final int ENTITY_ICON_FIELD_NUMBER = 9;
    public static final int EXPLICIT_FIELD_NUMBER = 4;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int IS_19_PLUS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 11;
    public static final int SHOULD_RESUME_ON_FULL_PLAYBACK_FIELD_NUMBER = 10;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TAP_ACTION_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any button_;
    private boolean explicit_;
    private Image image_;
    private boolean is19Plus_;
    private boolean shouldResumeOnFullPlayback_;
    private TapAction tapAction_;
    private String title_ = "";
    private String subtitle_ = "";
    private String accessibilityText_ = "";
    private String entityIcon_ = "";
    private String reason_ = "";

    public static final class TapAction extends h implements v2j0 {
        private static final TapAction DEFAULT_INSTANCE;
        public static final int NAVIGATION_COMMAND_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int PLAY_COMMAND_FIELD_NUMBER = 2;
        private int commandCase_ = 0;
        private Object command_;

        public static final class NavigationCommand extends h implements v2j0 {
            private static final NavigationCommand DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int URI_FIELD_NUMBER = 1;
            private String uri_ = "";

            static {
                NavigationCommand navigationCommand = new NavigationCommand();
                DEFAULT_INSTANCE = navigationCommand;
                h.registerDefaultInstance(NavigationCommand.class, navigationCommand);
            }

            private NavigationCommand() {
            }

            public static NavigationCommand n() {
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
                }
                if (iOrdinal == 3) {
                    return new NavigationCommand();
                }
                if (iOrdinal == 4) {
                    return new f(DEFAULT_INSTANCE);
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
                synchronized (NavigationCommand.class) {
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

            public final String getUri() {
                return this.uri_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class PlayCommand extends h implements v2j0 {
            private static final PlayCommand DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int PLAY_CONTEXT_URI_FIELD_NUMBER = 2;
            public static final int SHOULD_PREFER_VIDEO_FORMAT_FIELD_NUMBER = 3;
            public static final int URI_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean shouldPreferVideoFormat_;
            private String uri_ = "";
            private String playContextUri_ = "";

            static {
                PlayCommand playCommand = new PlayCommand();
                DEFAULT_INSTANCE = playCommand;
                h.registerDefaultInstance(PlayCommand.class, playCommand);
            }

            private PlayCommand() {
            }

            public static PlayCommand n() {
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u0007", new Object[]{"bitField0_", "uri_", "playContextUri_", "shouldPreferVideoFormat_"});
                }
                if (iOrdinal == 3) {
                    return new PlayCommand();
                }
                if (iOrdinal == 4) {
                    return new g(DEFAULT_INSTANCE);
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
                synchronized (PlayCommand.class) {
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

            public final String getUri() {
                return this.uri_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.playContextUri_;
            }

            public final boolean p() {
                return this.shouldPreferVideoFormat_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            TapAction tapAction = new TapAction();
            DEFAULT_INSTANCE = tapAction;
            h.registerDefaultInstance(TapAction.class, tapAction);
        }

        private TapAction() {
        }

        public static TapAction o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"command_", "commandCase_", NavigationCommand.class, PlayCommand.class});
            }
            if (iOrdinal == 3) {
                return new TapAction();
            }
            if (iOrdinal == 4) {
                return new e(DEFAULT_INSTANCE);
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
            synchronized (TapAction.class) {
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

        public final int n() {
            int i = this.commandCase_;
            if (i == 0) {
                return 3;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final NavigationCommand p() {
            return this.commandCase_ == 1 ? (NavigationCommand) this.command_ : NavigationCommand.n();
        }

        public final PlayCommand q() {
            return this.commandCase_ == 2 ? (PlayCommand) this.command_ : PlayCommand.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        BoxedEntityRowComponentV2 boxedEntityRowComponentV2 = new BoxedEntityRowComponentV2();
        DEFAULT_INSTANCE = boxedEntityRowComponentV2;
        h.registerDefaultInstance(BoxedEntityRowComponentV2.class, boxedEntityRowComponentV2);
    }

    private BoxedEntityRowComponentV2() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BoxedEntityRowComponentV2 x(phc phcVar) {
        return (BoxedEntityRowComponentV2) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007\u0005\u0007\u0006ဉ\u0001\u0007Ȉ\bဉ\u0002\tȈ\n\u0007\u000bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "image_", "explicit_", "is19Plus_", "tapAction_", "accessibilityText_", "button_", "entityIcon_", "shouldResumeOnFullPlayback_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new BoxedEntityRowComponentV2();
        }
        if (iOrdinal == 4) {
            return new d(DEFAULT_INSTANCE);
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
        synchronized (BoxedEntityRowComponentV2.class) {
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

    public final Any o() {
        Any any = this.button_;
        return any == null ? Any.o() : any;
    }

    public final String p() {
        return this.entityIcon_;
    }

    public final boolean q() {
        return this.explicit_;
    }

    public final Image r() {
        Image image = this.image_;
        return image == null ? Image.n() : image;
    }

    public final boolean s() {
        return this.is19Plus_;
    }

    public final String t() {
        return this.reason_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.shouldResumeOnFullPlayback_;
    }

    public final TapAction v() {
        TapAction tapAction = this.tapAction_;
        return tapAction == null ? TapAction.o() : tapAction;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
