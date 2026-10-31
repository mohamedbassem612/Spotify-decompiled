package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.k4l;
import p.p4l;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConnectMessages$StateResponse extends h implements v2j0 {
    private static final ConnectMessages$StateResponse DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 5;
    public static final int IS_ACTIVE_FIELD_NUMBER = 6;
    public static final int IS_ACTIVE_ON_SAME_DEVICE_FIELD_NUMBER = 7;
    public static final int IS_CONNECTED_FIELD_NUMBER = 2;
    public static final int IS_RUNNING_FIELD_NUMBER = 1;
    public static final int IS_SYNCED_WITH_BACKEND_FIELD_NUMBER = 8;
    public static final int LOCAL_NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHOULD_USE_LOCAL_PLAYBACK_FIELD_NUMBER = 4;
    private boolean isActiveOnSameDevice_;
    private boolean isActive_;
    private boolean isConnected_;
    private boolean isRunning_;
    private boolean isSyncedWithBackend_;
    private boolean shouldUseLocalPlayback_;
    private String localName_ = "";
    private h290 devices_ = h.emptyProtobufList();

    public static final class Device extends h implements v2j0 {
        public static final int ALIAS_ID_FIELD_NUMBER = 35;
        public static final int BRAND_DISPLAY_NAME_FIELD_NUMBER = 30;
        public static final int CAPABILITIES_FIELD_NUMBER = 33;
        public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
        public static final int CREATION_TIME_MS_FIELD_NUMBER = 18;
        public static final int DEDUPLICATION_ID_FIELD_NUMBER = 3;
        private static final Device DEFAULT_INSTANCE;
        public static final int DISCOVERY_METHOD_FIELD_NUMBER = 40;
        public static final int GROUP_DATA_FIELD_NUMBER = 43;
        public static final int HIFI_FIELD_NUMBER = 20;
        public static final int INCARNATIONS_FIELD_NUMBER = 34;
        public static final int IS_ACTIVE_FIELD_NUMBER = 9;
        public static final int IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER = 46;
        public static final int IS_BEING_ACTIVATED_FIELD_NUMBER = 10;
        public static final int IS_DISABLED_FIELD_NUMBER = 8;
        public static final int IS_GROUP_FIELD_NUMBER = 15;
        public static final int IS_LOCAL_FIELD_NUMBER = 14;
        public static final int IS_NEWLY_DISCOVERED_FIELD_NUMBER = 28;
        public static final int IS_OFFLINE_FIELD_NUMBER = 16;
        public static final int IS_PUBLIC_FIELD_NUMBER = 44;
        public static final int IS_SELF_FIELD_NUMBER = 1;
        public static final int IS_SOCIAL_CONNECT_FIELD_NUMBER = 17;
        public static final int IS_VOICE_ENABLED_FIELD_NUMBER = 27;
        public static final int IS_WEBAPP_FIELD_NUMBER = 12;
        public static final int IS_ZEROCONF_FIELD_NUMBER = 11;
        public static final int LIBRARY_VERSION_FIELD_NUMBER = 37;
        public static final int LICENSE_FIELD_NUMBER = 21;
        public static final int LOCAL_IDENTIFIER_FIELD_NUMBER = 2;
        public static final int LOCAL_IP_FIELD_NUMBER = 39;
        public static final int LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 51;
        public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER = 31;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int OUTPUT_PERIPHERAL_FIELD_NUMBER = 38;
        private static volatile qzr0 PARSER = null;
        public static final int STATE_FIELD_NUMBER = 7;
        public static final int SUPPORTED_MEDIA_TYPES_FIELD_NUMBER = 29;
        public static final int SUPPORTS_ALARM_FIELD_NUMBER = 26;
        public static final int SUPPORTS_CROSSFADE_FIELD_NUMBER = 49;
        public static final int SUPPORTS_DJ_FIELD_NUMBER = 36;
        public static final int SUPPORTS_GAPLESS_FIELD_NUMBER = 48;
        public static final int SUPPORTS_LOGOUT_FIELD_NUMBER = 24;
        public static final int SUPPORTS_ON_DEMAND_FIELD_NUMBER = 22;
        public static final int SUPPORTS_PLAYLIST_MIXING_FIELD_NUMBER = 42;
        public static final int SUPPORTS_REMOTE_AUDIO_QUALITY_CONTROL_FIELD_NUMBER = 45;
        public static final int SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER = 50;
        public static final int SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER = 52;
        public static final int SUPPORTS_REMOTE_SLEEP_TIMER_FIELD_NUMBER = 41;
        public static final int SUPPORTS_RENAME_FIELD_NUMBER = 25;
        public static final int SUPPORTS_VOLUME_FIELD_NUMBER = 23;
        public static final int SUPPORTS_ZEPHYR_FIELD_NUMBER = 47;
        public static final int TYPE_FIELD_NUMBER = 6;
        public static final int VOLUME_FIELD_NUMBER = 19;
        public static final int VOLUME_STEPS_FIELD_NUMBER = 32;
        private int aliasId_;
        private int bitField0_;
        private long creationTimeMs_;
        private int discoveryMethod_;
        private ConnectMessages$GroupData groupData_;
        private Hifi hifi_;
        private boolean isActive_;
        private boolean isAuthenticatedWithCurrentUser_;
        private boolean isBeingActivated_;
        private boolean isDisabled_;
        private boolean isGroup_;
        private boolean isLocal_;
        private boolean isNewlyDiscovered_;
        private boolean isOffline_;
        private boolean isPublic_;
        private boolean isSelf_;
        private boolean isSocialConnect_;
        private boolean isVoiceEnabled_;
        private boolean isWebapp_;
        private boolean isZeroconf_;
        private ConnectMessages$OutputPeripheral outputPeripheral_;
        private boolean supportsAlarm_;
        private boolean supportsCrossfade_;
        private boolean supportsDj_;
        private boolean supportsGapless_;
        private boolean supportsLogout_;
        private boolean supportsOnDemand_;
        private boolean supportsPlaylistMixing_;
        private boolean supportsRemoteAudioQualityControl_;
        private boolean supportsRemoteEqualizer_;
        private boolean supportsRemoteNormalization_;
        private boolean supportsRemoteSleepTimer_;
        private boolean supportsRename_;
        private boolean supportsVolume_;
        private boolean supportsZephyr_;
        private int volumeSteps_;
        private int volume_;
        private String localIdentifier_ = "";
        private String deduplicationId_ = "";
        private String connectStateIdentifier_ = "";
        private String name_ = "";
        private String type_ = "";
        private String state_ = "";
        private String license_ = "";
        private h290 supportedMediaTypes_ = h.emptyProtobufList();
        private String brandDisplayName_ = "";
        private String modelDisplayName_ = "";
        private String capabilities_ = "";
        private h290 incarnations_ = h.emptyProtobufList();
        private String libraryVersion_ = "";
        private String localIp_ = "";
        private String logicalPlaybackIdentifier_ = "";

        public static final class Hifi extends h implements v2j0 {
            private static final Hifi DEFAULT_INSTANCE;
            public static final int DEVICE_SUPPORTED_FIELD_NUMBER = 3;
            public static final int FULLY_SUPPORTED_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int USER_ELIGIBLE_FIELD_NUMBER = 2;
            private boolean deviceSupported_;
            private boolean fullySupported_;
            private boolean userEligible_;

            static {
                Hifi hifi = new Hifi();
                DEFAULT_INSTANCE = hifi;
                h.registerDefaultInstance(Hifi.class, hifi);
            }

            private Hifi() {
            }

            public static Hifi o() {
                return DEFAULT_INSTANCE;
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.h
            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                qzr0 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"fullySupported_", "userEligible_", "deviceSupported_"});
                }
                if (iOrdinal == 3) {
                    return new Hifi();
                }
                if (iOrdinal == 4) {
                    return new c();
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
                synchronized (Hifi.class) {
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

            @Override // com.google.protobuf.h, p.v2j0
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.h, p.s2j0
            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final boolean p() {
                return this.deviceSupported_;
            }

            public final boolean q() {
                return this.fullySupported_;
            }

            public final boolean r() {
                return this.userEligible_;
            }

            @Override // com.google.protobuf.h, p.s2j0
            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Incarnation extends h implements v2j0 {
            public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 5;
            private static final Incarnation DEFAULT_INSTANCE;
            public static final int IDENTIFIER_FIELD_NUMBER = 2;
            public static final int LOGIN_TYPE_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int PREFERRED_FIELD_NUMBER = 3;
            public static final int PREFERRED_REASON_FIELD_NUMBER = 4;
            private int loginType_;
            private int preferredReason_;
            private boolean preferred_;
            private String identifier_ = "";
            private String connectStateIdentifier_ = "";

            static {
                Incarnation incarnation = new Incarnation();
                DEFAULT_INSTANCE = incarnation;
                h.registerDefaultInstance(Incarnation.class, incarnation);
            }

            private Incarnation() {
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.h
            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                qzr0 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0007\u0004\f\u0005Ȉ", new Object[]{"loginType_", "identifier_", "preferred_", "preferredReason_", "connectStateIdentifier_"});
                }
                if (iOrdinal == 3) {
                    return new Incarnation();
                }
                if (iOrdinal == 4) {
                    return new d();
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
                synchronized (Incarnation.class) {
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

            @Override // com.google.protobuf.h, p.v2j0
            public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.h, p.s2j0
            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final String o() {
                return this.connectStateIdentifier_;
            }

            public final String p() {
                return this.identifier_;
            }

            public final k4l q() {
                k4l k4lVarA = k4l.a(this.loginType_);
                return k4lVarA == null ? k4l.d : k4lVarA;
            }

            public final boolean r() {
                return this.preferred_;
            }

            public final p4l s() {
                p4l p4lVarA = p4l.a(this.preferredReason_);
                return p4lVarA == null ? p4l.g : p4lVarA;
            }

            @Override // com.google.protobuf.h, p.s2j0
            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            h.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final boolean A() {
            return this.isGroup_;
        }

        public final boolean B() {
            return this.isNewlyDiscovered_;
        }

        public final boolean C() {
            return this.isSelf_;
        }

        public final boolean D() {
            return this.isSocialConnect_;
        }

        public final boolean E() {
            return this.isVoiceEnabled_;
        }

        public final boolean F() {
            return this.isWebapp_;
        }

        public final boolean G() {
            return this.isZeroconf_;
        }

        public final String H() {
            return this.libraryVersion_;
        }

        public final String I() {
            return this.localIdentifier_;
        }

        public final String J() {
            return this.localIp_;
        }

        public final String K() {
            return this.logicalPlaybackIdentifier_;
        }

        public final String L() {
            return this.modelDisplayName_;
        }

        public final ConnectMessages$OutputPeripheral M() {
            ConnectMessages$OutputPeripheral connectMessages$OutputPeripheral = this.outputPeripheral_;
            return connectMessages$OutputPeripheral == null ? ConnectMessages$OutputPeripheral.r() : connectMessages$OutputPeripheral;
        }

        public final String N() {
            return this.state_;
        }

        public final h290 O() {
            return this.supportedMediaTypes_;
        }

        public final boolean P() {
            return this.supportsDj_;
        }

        public final boolean Q() {
            return this.supportsLogout_;
        }

        public final boolean R() {
            return this.supportsPlaylistMixing_;
        }

        public final boolean S() {
            return this.supportsRemoteAudioQualityControl_;
        }

        public final boolean T() {
            return this.supportsRemoteEqualizer_;
        }

        public final boolean U() {
            return this.supportsRemoteNormalization_;
        }

        public final boolean V() {
            return this.supportsRemoteSleepTimer_;
        }

        public final boolean W() {
            return this.supportsRename_;
        }

        public final boolean X() {
            return this.supportsVolume_;
        }

        public final boolean Y() {
            return this.supportsZephyr_;
        }

        public final String Z() {
            return this.type_;
        }

        public final int a0() {
            return this.volume_;
        }

        public final int b0() {
            return this.volumeSteps_;
        }

        public final boolean c0() {
            return (this.bitField0_ & 64) != 0;
        }

        public final boolean d0() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.h
        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            qzr0 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u00003\u0000\u0001\u000143\u0000\u0002\u0000\u0001\u0007\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0003\u0013\u000b\u0014ဉ\u0000\u0015Ȉ\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001dȚ\u001eȈ\u001fȈ ဋ\u0001!ለ\u0002\"\u001b#ဋ\u0003$ဇ\u0004%Ȉ&ဉ\u0005'Ȉ(\u000b)\u0007*\u0007+ဉ\u0006,\u0007-\u0007.ဇ\u0007/\u00070\u00071\u00072\u00073ለ\b4\u0007", new Object[]{"bitField0_", "isSelf_", "localIdentifier_", "deduplicationId_", "connectStateIdentifier_", "name_", "type_", "state_", "isDisabled_", "isActive_", "isBeingActivated_", "isZeroconf_", "isWebapp_", "isLocal_", "isGroup_", "isOffline_", "isSocialConnect_", "creationTimeMs_", "volume_", "hifi_", "license_", "supportsOnDemand_", "supportsVolume_", "supportsLogout_", "supportsRename_", "supportsAlarm_", "isVoiceEnabled_", "isNewlyDiscovered_", "supportedMediaTypes_", "brandDisplayName_", "modelDisplayName_", "volumeSteps_", "capabilities_", "incarnations_", Incarnation.class, "aliasId_", "supportsDj_", "libraryVersion_", "outputPeripheral_", "localIp_", "discoveryMethod_", "supportsRemoteSleepTimer_", "supportsPlaylistMixing_", "groupData_", "isPublic_", "supportsRemoteAudioQualityControl_", "isAuthenticatedWithCurrentUser_", "supportsZephyr_", "supportsGapless_", "supportsCrossfade_", "supportsRemoteEqualizer_", "logicalPlaybackIdentifier_", "supportsRemoteNormalization_"});
            }
            if (iOrdinal == 3) {
                return new Device();
            }
            if (iOrdinal == 4) {
                return new b();
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
            synchronized (Device.class) {
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

        public final boolean e0() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean f0() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.h, p.v2j0
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public final boolean getIsLocal() {
            return this.isLocal_;
        }

        public final String getName() {
            return this.name_;
        }

        public final boolean hasCapabilities() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.h, p.s2j0
        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.brandDisplayName_;
        }

        public final String p() {
            return this.capabilities_;
        }

        public final String q() {
            return this.connectStateIdentifier_;
        }

        public final long r() {
            return this.creationTimeMs_;
        }

        public final int s() {
            return this.discoveryMethod_;
        }

        public final ConnectMessages$GroupData t() {
            ConnectMessages$GroupData connectMessages$GroupData = this.groupData_;
            return connectMessages$GroupData == null ? ConnectMessages$GroupData.p() : connectMessages$GroupData;
        }

        @Override // com.google.protobuf.h, p.s2j0
        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final Hifi u() {
            Hifi hifi = this.hifi_;
            return hifi == null ? Hifi.o() : hifi;
        }

        public final h290 v() {
            return this.incarnations_;
        }

        public final boolean w() {
            return this.isActive_;
        }

        public final boolean x() {
            return this.isAuthenticatedWithCurrentUser_;
        }

        public final boolean y() {
            return this.isBeingActivated_;
        }

        public final boolean z() {
            return this.isDisabled_;
        }
    }

    static {
        ConnectMessages$StateResponse connectMessages$StateResponse = new ConnectMessages$StateResponse();
        DEFAULT_INSTANCE = connectMessages$StateResponse;
        h.registerDefaultInstance(ConnectMessages$StateResponse.class, connectMessages$StateResponse);
    }

    private ConnectMessages$StateResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ConnectMessages$StateResponse t(byte[] bArr) {
        return (ConnectMessages$StateResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004\u0007\u0005\u001b\u0006\u0007\u0007\u0007\b\u0007", new Object[]{"isRunning_", "isConnected_", "localName_", "shouldUseLocalPlayback_", "devices_", Device.class, "isActive_", "isActiveOnSameDevice_", "isSyncedWithBackend_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$StateResponse();
        }
        if (iOrdinal == 4) {
            return new a();
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
        synchronized (ConnectMessages$StateResponse.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.devices_;
    }

    public final boolean p() {
        return this.isActive_;
    }

    public final boolean q() {
        return this.isActiveOnSameDevice_;
    }

    public final boolean r() {
        return this.isSyncedWithBackend_;
    }

    public final boolean s() {
        return this.shouldUseLocalPlayback_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
