package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.h661;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001f¨\u00065"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/TargetDevice;", "", "", "brand", "model", "deviceType", "deviceId", "", "voiceEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/TargetDevice;Lp/z1k;Lp/h661;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/voiceassistants/playermodels/TargetDevice;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBrand", "getModel", "getDeviceType", "getDeviceType$annotations", "()V", "getDeviceId", "getDeviceId$annotations", "Z", "getVoiceEnabled", "getVoiceEnabled$annotations", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
@o661
public final /* data */ class TargetDevice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String brand;
    private final String deviceId;
    private final String deviceType;
    private final String model;
    private final boolean voiceEnabled;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/TargetDevice$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/voiceassistants/playermodels/TargetDevice;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return TargetDevice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TargetDevice(int i, String str, String str2, String str3, String str4, boolean z, p661 p661Var) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, TargetDevice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.brand = str;
        this.model = str2;
        this.deviceType = str3;
        this.deviceId = str4;
        this.voiceEnabled = z;
    }

    public static /* synthetic */ TargetDevice copy$default(TargetDevice targetDevice, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = targetDevice.brand;
        }
        if ((i & 2) != 0) {
            str2 = targetDevice.model;
        }
        if ((i & 4) != 0) {
            str3 = targetDevice.deviceType;
        }
        if ((i & 8) != 0) {
            str4 = targetDevice.deviceId;
        }
        if ((i & 16) != 0) {
            z = targetDevice.voiceEnabled;
        }
        boolean z2 = z;
        String str5 = str3;
        return targetDevice.copy(str, str2, str5, str4, z2);
    }

    public static /* synthetic */ void getDeviceId$annotations() {
    }

    public static /* synthetic */ void getDeviceType$annotations() {
    }

    public static /* synthetic */ void getVoiceEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(TargetDevice self, z1k output, h661 serialDesc) {
        output.G(serialDesc, 0, self.brand);
        output.G(serialDesc, 1, self.model);
        output.G(serialDesc, 2, self.deviceType);
        output.G(serialDesc, 3, self.deviceId);
        output.E(serialDesc, 4, self.voiceEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getVoiceEnabled() {
        return this.voiceEnabled;
    }

    public final TargetDevice copy(String brand, String model, String deviceType, String deviceId, boolean voiceEnabled) {
        return new TargetDevice(brand, model, deviceType, deviceId, voiceEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetDevice)) {
            return false;
        }
        TargetDevice targetDevice = (TargetDevice) other;
        return u890.j(this.brand, targetDevice.brand) && u890.j(this.model, targetDevice.model) && u890.j(this.deviceType, targetDevice.deviceType) && u890.j(this.deviceId, targetDevice.deviceId) && this.voiceEnabled == targetDevice.voiceEnabled;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getModel() {
        return this.model;
    }

    public final boolean getVoiceEnabled() {
        return this.voiceEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.voiceEnabled) + cy30.d(cy30.d(cy30.d(this.brand.hashCode() * 31, 31, this.model), 31, this.deviceType), 31, this.deviceId);
    }

    public String toString() {
        return super.toString();
    }

    public TargetDevice(String str, String str2, String str3, String str4, boolean z) {
        this.brand = str;
        this.model = str2;
        this.deviceType = str3;
        this.deviceId = str4;
        this.voiceEnabled = z;
    }
}
