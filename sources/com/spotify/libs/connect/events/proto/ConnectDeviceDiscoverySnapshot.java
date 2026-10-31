package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ConnectDeviceDiscoverySnapshot extends h implements v2j0 {
    public static final int ACTIVE_AUDIO_OUTPUT_BRAND_FIELD_NUMBER = 37;
    public static final int ACTIVE_AUDIO_OUTPUT_DEVICE_TYPE_FIELD_NUMBER = 36;
    public static final int ACTIVE_AUDIO_OUTPUT_MODEL_FIELD_NUMBER = 38;
    public static final int ACTIVE_AUDIO_OUTPUT_NAME_FIELD_NUMBER = 34;
    public static final int ACTIVE_AUDIO_OUTPUT_TYPE_FIELD_NUMBER = 35;
    public static final int BLE_DEVICE_DISCOVERY_SNAPSHOT_ID_FIELD_NUMBER = 40;
    public static final int BLUETOOTH_CATEGORY_FIELD_NUMBER = 28;
    public static final int BLUETOOTH_ID_FIELD_NUMBER = 26;
    public static final int BLUETOOTH_TYPE_FIELD_NUMBER = 27;
    public static final int BRAND_FIELD_NUMBER = 8;
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 3;
    private static final ConnectDeviceDiscoverySnapshot DEFAULT_INSTANCE;
    public static final int DEVICE_STATE_FIELD_NUMBER = 10;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int DISCOVERY_TYPE_FIELD_NUMBER = 23;
    public static final int ENTITY_TYPE_FIELD_NUMBER = 2;
    public static final int GROUP_DEVICES_FIELD_NUMBER = 42;
    public static final int INCARNATIONS_FIELD_NUMBER = 25;
    public static final int IS_ACTIVE_FIELD_NUMBER = 12;
    public static final int IS_AVAILABLE_ON_LOCAL_NETWORK_FIELD_NUMBER = 17;
    public static final int IS_CONNECTING_FIELD_NUMBER = 13;
    public static final int IS_DISABLED_FIELD_NUMBER = 15;
    public static final int IS_GROUP_FIELD_NUMBER = 14;
    public static final int IS_SELF_FIELD_NUMBER = 11;
    public static final int IS_ZEROCONF_FIELD_NUMBER = 16;
    public static final int JAM_SESSION_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int LOCAL_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int LOCAL_TIME_FIELD_NUMBER = 30;
    public static final int MODEL_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PREFERRED_PROTOCOL_FIELD_NUMBER = 32;
    public static final int PREFERRED_PROTOCOL_REASON_FIELD_NUMBER = 33;
    public static final int REASON_FIELD_NUMBER = 29;
    public static final int RSSI_FIELD_NUMBER = 39;
    public static final int SNAPSHOT_ID_FIELD_NUMBER = 1;
    public static final int SUPPORTS_DJ_FIELD_NUMBER = 21;
    public static final int SUPPORTS_HIFI_FIELD_NUMBER = 22;
    public static final int SUPPORTS_LOGOUT_FIELD_NUMBER = 20;
    public static final int SUPPORTS_REMOTE_SLEEP_TIMER_FIELD_NUMBER = 24;
    public static final int SUPPORTS_RENAME_FIELD_NUMBER = 41;
    public static final int SUPPORTS_VOLUME_FIELD_NUMBER = 19;
    public static final int TIMEZONE_FIELD_NUMBER = 31;
    public static final int VOLUME_STEPS_FIELD_NUMBER = 18;
    private int bitField0_;
    private int bitField1_;
    private int discoveryType_;
    private boolean isActive_;
    private boolean isAvailableOnLocalNetwork_;
    private boolean isConnecting_;
    private boolean isDisabled_;
    private boolean isGroup_;
    private boolean isSelf_;
    private boolean isZeroconf_;
    private int rssi_;
    private boolean supportsDj_;
    private boolean supportsHifi_;
    private boolean supportsLogout_;
    private boolean supportsRemoteSleepTimer_;
    private boolean supportsRename_;
    private boolean supportsVolume_;
    private int volumeSteps_;
    private String snapshotId_ = "";
    private String entityType_ = "";
    private String connectStateIdentifier_ = "";
    private String localIdentifier_ = "";
    private String jamSessionIdentifier_ = "";
    private String name_ = "";
    private String model_ = "";
    private String brand_ = "";
    private String deviceType_ = "";
    private String deviceState_ = "";
    private h290 incarnations_ = h.emptyProtobufList();
    private String bluetoothId_ = "";
    private String bluetoothType_ = "";
    private String bluetoothCategory_ = "";
    private String reason_ = "";
    private String localTime_ = "";
    private String timezone_ = "";
    private String preferredProtocol_ = "";
    private String preferredProtocolReason_ = "";
    private String activeAudioOutputName_ = "";
    private String activeAudioOutputType_ = "";
    private String activeAudioOutputDeviceType_ = "";
    private String activeAudioOutputBrand_ = "";
    private String activeAudioOutputModel_ = "";
    private String bleDeviceDiscoverySnapshotId_ = "";
    private h290 groupDevices_ = h.emptyProtobufList();

    public static final class GroupDevices extends h implements v2j0 {
        public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 4;
        private static final GroupDevices DEFAULT_INSTANCE;
        public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
        public static final int GROUPING_STATUS_FIELD_NUMBER = 2;
        public static final int MODEL_DISPLAY_NAME_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private String deviceType_ = "";
        private String groupingStatus_ = "";
        private String name_ = "";
        private String connectStateIdentifier_ = "";
        private String modelDisplayName_ = "";

        static {
            GroupDevices groupDevices = new GroupDevices();
            DEFAULT_INSTANCE = groupDevices;
            h.registerDefaultInstance(GroupDevices.class, groupDevices);
        }

        private GroupDevices() {
        }

        public static b o() {
            return DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "deviceType_", "groupingStatus_", "name_", "connectStateIdentifier_", "modelDisplayName_"});
            }
            if (iOrdinal == 3) {
                return new GroupDevices();
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
            synchronized (GroupDevices.class) {
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

        public final void p(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.connectStateIdentifier_ = str;
        }

        public final void q(String str) {
            this.bitField0_ |= 1;
            this.deviceType_ = str;
        }

        public final void r(String str) {
            this.bitField0_ |= 2;
            this.groupingStatus_ = str;
        }

        public final void s(String str) {
            this.bitField0_ |= 16;
            this.modelDisplayName_ = str;
        }

        public final void t(String str) {
            this.bitField0_ |= 4;
            this.name_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ConnectDeviceDiscoverySnapshot connectDeviceDiscoverySnapshot = new ConnectDeviceDiscoverySnapshot();
        DEFAULT_INSTANCE = connectDeviceDiscoverySnapshot;
        h.registerDefaultInstance(ConnectDeviceDiscoverySnapshot.class, connectDeviceDiscoverySnapshot);
    }

    private ConnectDeviceDiscoverySnapshot() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static a r() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 33554432;
        this.bluetoothType_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.brand_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.connectStateIdentifier_ = str;
    }

    public final void D(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.deviceState_ = str;
    }

    public final void E(String str) {
        this.bitField0_ |= 256;
        this.deviceType_ = str;
    }

    public final void F(int i) {
        this.bitField0_ |= 4194304;
        this.discoveryType_ = i;
    }

    public final void G(String str) {
        this.bitField0_ |= 2;
        this.entityType_ = str;
    }

    public final void H(boolean z) {
        this.bitField0_ |= 2048;
        this.isActive_ = z;
    }

    public final void I(boolean z) {
        this.bitField0_ |= 65536;
        this.isAvailableOnLocalNetwork_ = z;
    }

    public final void J(boolean z) {
        this.bitField0_ |= 4096;
        this.isConnecting_ = z;
    }

    public final void K(boolean z) {
        this.bitField0_ |= 16384;
        this.isDisabled_ = z;
    }

    public final void L(boolean z) {
        this.bitField0_ |= 8192;
        this.isGroup_ = z;
    }

    public final void M(boolean z) {
        this.bitField0_ |= 1024;
        this.isSelf_ = z;
    }

    public final void N(boolean z) {
        this.bitField0_ |= 32768;
        this.isZeroconf_ = z;
    }

    public final void O(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.jamSessionIdentifier_ = str;
    }

    public final void P(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.localIdentifier_ = str;
    }

    public final void Q(String str) {
        str.getClass();
        this.bitField0_ |= 268435456;
        this.localTime_ = str;
    }

    public final void R(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.model_ = str;
    }

    public final void S(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.name_ = str;
    }

    public final void T(String str) {
        this.bitField0_ |= 1073741824;
        this.preferredProtocol_ = str;
    }

    public final void U(String str) {
        str.getClass();
        this.bitField0_ |= Integer.MIN_VALUE;
        this.preferredProtocolReason_ = str;
    }

    public final void V(String str) {
        str.getClass();
        this.bitField0_ |= 134217728;
        this.reason_ = str;
    }

    public final void W(int i) {
        this.bitField1_ |= 32;
        this.rssi_ = i;
    }

    public final void X(String str) {
        this.bitField0_ |= 1;
        this.snapshotId_ = str;
    }

    public final void Y(boolean z) {
        this.bitField0_ |= 1048576;
        this.supportsDj_ = z;
    }

    public final void Z(boolean z) {
        this.bitField0_ |= 2097152;
        this.supportsHifi_ = z;
    }

    public final void a0(boolean z) {
        this.bitField0_ |= 524288;
        this.supportsLogout_ = z;
    }

    public final void b0(boolean z) {
        this.bitField0_ |= 8388608;
        this.supportsRemoteSleepTimer_ = z;
    }

    public final void c0(boolean z) {
        this.bitField1_ |= 128;
        this.supportsRename_ = z;
    }

    public final void d0(boolean z) {
        this.bitField0_ |= 262144;
        this.supportsVolume_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001*\u0000\u0002\u0001**\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012င\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u0017င\u0016\u0018ဇ\u0017\u0019\u001a\u001aဈ\u0018\u001bဈ\u0019\u001cဈ\u001a\u001dဈ\u001b\u001eဈ\u001c\u001fဈ\u001d ဈ\u001e!ဈ\u001f\"ဈ #ဈ!$ဈ\"%ဈ#&ဈ$'င%(ဈ&)ဇ'*\u001b", new Object[]{"bitField0_", "bitField1_", "snapshotId_", "entityType_", "connectStateIdentifier_", "localIdentifier_", "jamSessionIdentifier_", "name_", "model_", "brand_", "deviceType_", "deviceState_", "isSelf_", "isActive_", "isConnecting_", "isGroup_", "isDisabled_", "isZeroconf_", "isAvailableOnLocalNetwork_", "volumeSteps_", "supportsVolume_", "supportsLogout_", "supportsDj_", "supportsHifi_", "discoveryType_", "supportsRemoteSleepTimer_", "incarnations_", "bluetoothId_", "bluetoothType_", "bluetoothCategory_", "reason_", "localTime_", "timezone_", "preferredProtocol_", "preferredProtocolReason_", "activeAudioOutputName_", "activeAudioOutputType_", "activeAudioOutputDeviceType_", "activeAudioOutputBrand_", "activeAudioOutputModel_", "rssi_", "bleDeviceDiscoverySnapshotId_", "supportsRename_", "groupDevices_", GroupDevices.class});
        }
        if (iOrdinal == 3) {
            return new ConnectDeviceDiscoverySnapshot();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (ConnectDeviceDiscoverySnapshot.class) {
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

    public final void e0(String str) {
        this.bitField0_ |= 536870912;
        this.timezone_ = str;
    }

    public final void f0(int i) {
        this.bitField0_ |= 131072;
        this.volumeSteps_ = i;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.groupDevices_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.groupDevices_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.incarnations_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.incarnations_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final String p() {
        return this.connectStateIdentifier_;
    }

    public final String q() {
        return this.localIdentifier_;
    }

    public final void s(String str) {
        this.bitField1_ |= 8;
        this.activeAudioOutputBrand_ = str;
    }

    public final void t(String str) {
        this.bitField1_ |= 4;
        this.activeAudioOutputDeviceType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField1_ |= 16;
        this.activeAudioOutputModel_ = str;
    }

    public final void v(String str) {
        this.bitField1_ |= 1;
        this.activeAudioOutputName_ = str;
    }

    public final void w(String str) {
        this.bitField1_ |= 2;
        this.activeAudioOutputType_ = str;
    }

    public final void x(String str) {
        this.bitField1_ |= 64;
        this.bleDeviceDiscoverySnapshotId_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 67108864;
        this.bluetoothCategory_ = str;
    }

    public final void z(String str) {
        this.bitField0_ |= 16777216;
        this.bluetoothId_ = str;
    }
}
