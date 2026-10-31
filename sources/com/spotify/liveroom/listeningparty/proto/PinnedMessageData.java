package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.Timestamp;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PinnedMessageData extends com.google.protobuf.h implements v2j0 {
    private static final PinnedMessageData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PINNED_MESSAGES_FIELD_NUMBER = 1;
    private h290 pinnedMessages_ = com.google.protobuf.h.emptyProtobufList();

    public static final class PinnedMessage extends com.google.protobuf.h implements v2j0 {
        private static final PinnedMessage DEFAULT_INSTANCE;
        public static final int GIFMESSAGE_FIELD_NUMBER = 4;
        public static final int MESSAGEUUID_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int SENDER_FIELD_NUMBER = 2;
        public static final int SENDER_USER_FIELD_NUMBER = 6;
        public static final int SENTAT_FIELD_NUMBER = 5;
        public static final int TEXTMESSAGE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Object payload_;
        private User senderUser_;
        private UserIdentifier sender_;
        private Timestamp sentAt_;
        private int payloadCase_ = 0;
        private String messageUuid_ = "";

        public static final class GifMessage extends com.google.protobuf.h implements v2j0 {
            private static final GifMessage DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int URL_FIELD_NUMBER = 1;
            private String url_ = "";

            static {
                GifMessage gifMessage = new GifMessage();
                DEFAULT_INSTANCE = gifMessage;
                com.google.protobuf.h.registerDefaultInstance(GifMessage.class, gifMessage);
            }

            private GifMessage() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
                }
                if (iOrdinal == 3) {
                    return new GifMessage();
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
                synchronized (GifMessage.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class TextMessage extends com.google.protobuf.h implements v2j0 {
            public static final int BODY_FIELD_NUMBER = 1;
            private static final TextMessage DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;
            private String body_ = "";

            static {
                TextMessage textMessage = new TextMessage();
                DEFAULT_INSTANCE = textMessage;
                com.google.protobuf.h.registerDefaultInstance(TextMessage.class, textMessage);
            }

            private TextMessage() {
            }

            public static TextMessage o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"body_"});
                }
                if (iOrdinal == 3) {
                    return new TextMessage();
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
                synchronized (TextMessage.class) {
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
                return this.body_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            PinnedMessage pinnedMessage = new PinnedMessage();
            DEFAULT_INSTANCE = pinnedMessage;
            com.google.protobuf.h.registerDefaultInstance(PinnedMessage.class, pinnedMessage);
        }

        private PinnedMessage() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"payload_", "payloadCase_", "bitField0_", "messageUuid_", "sender_", TextMessage.class, GifMessage.class, "sentAt_", "senderUser_"});
            }
            if (iOrdinal == 3) {
                return new PinnedMessage();
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
            synchronized (PinnedMessage.class) {
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
            return this.messageUuid_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final User o() {
            User user = this.senderUser_;
            return user == null ? User.o() : user;
        }

        public final Timestamp p() {
            Timestamp timestamp = this.sentAt_;
            return timestamp == null ? Timestamp.o() : timestamp;
        }

        public final TextMessage q() {
            return this.payloadCase_ == 3 ? (TextMessage) this.payload_ : TextMessage.o();
        }

        public final boolean r() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean s() {
            return this.payloadCase_ == 3;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PinnedMessageData pinnedMessageData = new PinnedMessageData();
        DEFAULT_INSTANCE = pinnedMessageData;
        com.google.protobuf.h.registerDefaultInstance(PinnedMessageData.class, pinnedMessageData);
    }

    private PinnedMessageData() {
    }

    public static PinnedMessageData n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"pinnedMessages_", PinnedMessage.class});
        }
        if (iOrdinal == 3) {
            return new PinnedMessageData();
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
        synchronized (PinnedMessageData.class) {
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

    public final h290 o() {
        return this.pinnedMessages_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
