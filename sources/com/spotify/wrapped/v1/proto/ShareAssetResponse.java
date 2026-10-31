package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.k471;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShareAssetResponse extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
    public static final int ASSET_FIELD_NUMBER = 6;
    public static final int AUDIO_ATTACHMENT_FIELD_NUMBER = 5;
    private static final ShareAssetResponse DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int MESSAGING_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_URI_FIELD_NUMBER = 1;
    private ShareAsset asset_;
    private AudioAttachment audioAttachment_;
    private int bitField0_;
    private ConsumerShareMessaging messaging_;
    private String shareUri_ = "";
    private String imageUrl_ = "";
    private String accessibilityText_ = "";

    public static final class AudioAttachment extends com.google.protobuf.h implements v2j0 {
        private static final AudioAttachment DEFAULT_INSTANCE;
        public static final int DESTINATION_CONFIGS_FIELD_NUMBER = 3;
        public static final int DISABLE_SELECTION_FIELD_NUMBER = 2;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private boolean disableSelection_;
        private String entityUri_ = "";
        private h290 destinationConfigs_ = com.google.protobuf.h.emptyProtobufList();

        public static final class DestinationAudioConfig extends com.google.protobuf.h implements v2j0 {
            private static final DestinationAudioConfig DEFAULT_INSTANCE;
            public static final int DESTINATION_FIELD_NUMBER = 1;
            public static final int DISABLE_SELECTION_FIELD_NUMBER = 3;
            public static final int ENABLED_FIELD_NUMBER = 4;
            public static final int ENTITY_URI_FIELD_NUMBER = 2;
            private static volatile qzr0 PARSER;
            private int bitField0_;
            private int destination_;
            private boolean disableSelection_;
            private boolean enabled_;
            private String entityUri_ = "";

            static {
                DestinationAudioConfig destinationAudioConfig = new DestinationAudioConfig();
                DEFAULT_INSTANCE = destinationAudioConfig;
                com.google.protobuf.h.registerDefaultInstance(DestinationAudioConfig.class, destinationAudioConfig);
            }

            private DestinationAudioConfig() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ဇ\u0001\u0004\u0007", new Object[]{"bitField0_", "destination_", "entityUri_", "disableSelection_", "enabled_"});
                }
                if (iOrdinal == 3) {
                    return new DestinationAudioConfig();
                }
                if (iOrdinal == 4) {
                    return new m2(DEFAULT_INSTANCE);
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
                synchronized (DestinationAudioConfig.class) {
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

            public final boolean getEnabled() {
                return this.enabled_;
            }

            public final String getEntityUri() {
                return this.entityUri_;
            }

            public final k471 n() {
                k471 k471VarA = k471.a(this.destination_);
                return k471VarA == null ? k471.V0 : k471VarA;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final boolean o() {
                return this.disableSelection_;
            }

            public final boolean p() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean q() {
                return (this.bitField0_ & 1) != 0;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            AudioAttachment audioAttachment = new AudioAttachment();
            DEFAULT_INSTANCE = audioAttachment;
            com.google.protobuf.h.registerDefaultInstance(AudioAttachment.class, audioAttachment);
        }

        private AudioAttachment() {
        }

        public static AudioAttachment n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002\u0007\u0003\u001b", new Object[]{"bitField0_", "entityUri_", "disableSelection_", "destinationConfigs_", DestinationAudioConfig.class});
            }
            if (iOrdinal == 3) {
                return new AudioAttachment();
            }
            if (iOrdinal == 4) {
                return new l2(DEFAULT_INSTANCE);
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
            synchronized (AudioAttachment.class) {
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

        public final String getEntityUri() {
            return this.entityUri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.destinationConfigs_;
        }

        public final boolean p() {
            return this.disableSelection_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ShareAssetResponse shareAssetResponse = new ShareAssetResponse();
        DEFAULT_INSTANCE = shareAssetResponse;
        com.google.protobuf.h.registerDefaultInstance(ShareAssetResponse.class, shareAssetResponse);
    }

    private ShareAssetResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "shareUri_", "imageUrl_", "messaging_", "accessibilityText_", "audioAttachment_", "asset_"});
        }
        if (iOrdinal == 3) {
            return new ShareAssetResponse();
        }
        if (iOrdinal == 4) {
            return new n2(DEFAULT_INSTANCE);
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
        synchronized (ShareAssetResponse.class) {
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
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShareAsset o() {
        ShareAsset shareAsset = this.asset_;
        return shareAsset == null ? ShareAsset.o() : shareAsset;
    }

    public final AudioAttachment p() {
        AudioAttachment audioAttachment = this.audioAttachment_;
        return audioAttachment == null ? AudioAttachment.n() : audioAttachment;
    }

    public final ConsumerShareMessaging q() {
        ConsumerShareMessaging consumerShareMessaging = this.messaging_;
        return consumerShareMessaging == null ? ConsumerShareMessaging.n() : consumerShareMessaging;
    }

    public final String r() {
        return this.shareUri_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
