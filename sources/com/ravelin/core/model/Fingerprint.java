package com.ravelin.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.chc1;
import p.dar;
import p.gpb;
import p.grn1;
import p.h661;
import p.m0v0;
import p.m5n1;
import p.n9v;
import p.nma0;
import p.o661;
import p.p661;
import p.pf40;
import p.u890;
import p.uax;
import p.x1k;
import p.z0o1;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b`\b\u0087\b\u0018\u0000 \u0094\u00012\u00020\u0001:\u0004\u0095\u0001\u0096\u0001BÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBÃ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 ¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020 ¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020 HÖ\u0001¢\u0006\u0004\b6\u00103J\u001a\u00109\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u0010A\u001a\u0004\b=\u0010>\"\u0004\b+\u0010?R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bG\u0010A\u001a\u0004\bD\u0010E\"\u0004\b+\u0010FR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bM\u0010A\u001a\u0004\bJ\u0010K\"\u0004\b+\u0010LR*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bS\u0010A\u001a\u0004\bP\u0010Q\"\u0004\b+\u0010RR*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bY\u0010A\u001a\u0004\bV\u0010W\"\u0004\b+\u0010XR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b_\u0010A\u001a\u0004\b\\\u0010]\"\u0004\b+\u0010^R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\be\u0010A\u001a\u0004\bb\u0010c\"\u0004\b+\u0010dR*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bk\u0010A\u001a\u0004\bh\u00105\"\u0004\bi\u0010jR*\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bl\u0010g\u0012\u0004\bo\u0010A\u001a\u0004\bm\u00105\"\u0004\bn\u0010jR*\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bp\u0010g\u0012\u0004\br\u0010A\u001a\u0004\bq\u00105\"\u0004\b+\u0010jR*\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bs\u0010g\u0012\u0004\bv\u0010A\u001a\u0004\bt\u00105\"\u0004\bu\u0010jR*\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bw\u0010g\u0012\u0004\bz\u0010A\u001a\u0004\bx\u00105\"\u0004\by\u0010jR*\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u0010g\u0012\u0004\b}\u0010A\u001a\u0004\b{\u00105\"\u0004\b|\u0010jR,\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b~\u0010g\u0012\u0005\b\u0081\u0001\u0010A\u001a\u0004\b\u007f\u00105\"\u0005\b\u0080\u0001\u0010jR0\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0087\u0001\u0010A\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b+\u0010\u0086\u0001R0\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008d\u0001\u0010A\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b+\u0010\u008c\u0001R0\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0093\u0001\u0010A\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0005\b+\u0010\u0092\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/ravelin/core/model/Fingerprint;", "Landroid/os/Parcelable;", "", "blocked", "Lcom/ravelin/core/model/CarrierInfo;", "carrierInfo", "Lcom/ravelin/core/model/NetworkInfo;", "networkInfo", "Lcom/ravelin/core/model/Connectivity;", "connectivity", "Lcom/ravelin/core/model/ScreenInfo;", "screenInfo", "Lcom/ravelin/core/model/DeviceInfo;", "deviceInfo", "Lcom/ravelin/core/model/TimezoneInfo;", "timezoneInfo", "", "deviceLanguage", "deviceCountry", "appPackageName", "deviceIdProvider", "deviceManufacturer", "deviceModel", "deviceOS", "Lcom/ravelin/core/model/Location;", "location", "Lcom/ravelin/core/model/DeviceProperties;", "deviceProperties", "Lcom/ravelin/core/model/Permissions;", "permissions", "<init>", "(ZLcom/ravelin/core/model/CarrierInfo;Lcom/ravelin/core/model/NetworkInfo;Lcom/ravelin/core/model/Connectivity;Lcom/ravelin/core/model/ScreenInfo;Lcom/ravelin/core/model/DeviceInfo;Lcom/ravelin/core/model/TimezoneInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Location;Lcom/ravelin/core/model/DeviceProperties;Lcom/ravelin/core/model/Permissions;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IZLcom/ravelin/core/model/CarrierInfo;Lcom/ravelin/core/model/NetworkInfo;Lcom/ravelin/core/model/Connectivity;Lcom/ravelin/core/model/ScreenInfo;Lcom/ravelin/core/model/DeviceInfo;Lcom/ravelin/core/model/TimezoneInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravelin/core/model/Location;Lcom/ravelin/core/model/DeviceProperties;Lcom/ravelin/core/model/Permissions;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "lpt2", "(Lcom/ravelin/core/model/Fingerprint;Lp/z1k;Lp/h661;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getBlocked", "()Z", "(Z)V", "getBlocked$annotations", "()V", "b", "Lcom/ravelin/core/model/CarrierInfo;", "getCarrierInfo", "()Lcom/ravelin/core/model/CarrierInfo;", "(Lcom/ravelin/core/model/CarrierInfo;)V", "getCarrierInfo$annotations", "c", "Lcom/ravelin/core/model/NetworkInfo;", "getNetworkInfo", "()Lcom/ravelin/core/model/NetworkInfo;", "(Lcom/ravelin/core/model/NetworkInfo;)V", "getNetworkInfo$annotations", "d", "Lcom/ravelin/core/model/Connectivity;", "getConnectivity", "()Lcom/ravelin/core/model/Connectivity;", "(Lcom/ravelin/core/model/Connectivity;)V", "getConnectivity$annotations", "e", "Lcom/ravelin/core/model/ScreenInfo;", "getScreenInfo", "()Lcom/ravelin/core/model/ScreenInfo;", "(Lcom/ravelin/core/model/ScreenInfo;)V", "getScreenInfo$annotations", "f", "Lcom/ravelin/core/model/DeviceInfo;", "getDeviceInfo", "()Lcom/ravelin/core/model/DeviceInfo;", "(Lcom/ravelin/core/model/DeviceInfo;)V", "getDeviceInfo$annotations", "g", "Lcom/ravelin/core/model/TimezoneInfo;", "getTimezoneInfo", "()Lcom/ravelin/core/model/TimezoneInfo;", "(Lcom/ravelin/core/model/TimezoneInfo;)V", "getTimezoneInfo$annotations", "h", "Ljava/lang/String;", "getDeviceLanguage", "Com8", "(Ljava/lang/String;)V", "getDeviceLanguage$annotations", "i", "getDeviceCountry", "Lpt5", "getDeviceCountry$annotations", "t", "getAppPackageName", "getAppPackageName$annotations", "X", "getDeviceIdProvider", "COM7", "getDeviceIdProvider$annotations", "Y", "getDeviceManufacturer", "cON", "getDeviceManufacturer$annotations", "getDeviceModel", "LPT3", "getDeviceModel$annotations", "N0", "getDeviceOS", "COM5", "getDeviceOS$annotations", "O0", "Lcom/ravelin/core/model/Location;", "getLocation", "()Lcom/ravelin/core/model/Location;", "(Lcom/ravelin/core/model/Location;)V", "getLocation$annotations", "P0", "Lcom/ravelin/core/model/DeviceProperties;", "getDeviceProperties", "()Lcom/ravelin/core/model/DeviceProperties;", "(Lcom/ravelin/core/model/DeviceProperties;)V", "getDeviceProperties$annotations", "Q0", "Lcom/ravelin/core/model/Permissions;", "getPermissions", "()Lcom/ravelin/core/model/Permissions;", "(Lcom/ravelin/core/model/Permissions;)V", "getPermissions$annotations", "Companion", "cOm9", "CoM4", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
@o661
public final /* data */ class Fingerprint implements Parcelable {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public String deviceOS;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public Location location;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public DeviceProperties deviceProperties;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public Permissions permissions;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String deviceIdProvider;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String deviceManufacturer;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String deviceModel;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean blocked;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public CarrierInfo carrierInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NetworkInfo networkInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Connectivity connectivity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ScreenInfo screenInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TimezoneInfo timezoneInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public String deviceLanguage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String deviceCountry;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public String appPackageName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Fingerprint> CREATOR = new CoM6();

    /* JADX INFO: renamed from: com.ravelin.core.model.Fingerprint$CoM4, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final nma0 serializer() {
            return cOm9.lpt2;
        }
    }

    public /* synthetic */ Fingerprint(boolean z, CarrierInfo carrierInfo, NetworkInfo networkInfo, Connectivity connectivity, ScreenInfo screenInfo, DeviceInfo deviceInfo, TimezoneInfo timezoneInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Location location, DeviceProperties deviceProperties, Permissions permissions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : carrierInfo, (i & 4) != 0 ? null : networkInfo, (i & 8) != 0 ? null : connectivity, (i & 16) != 0 ? null : screenInfo, (i & 32) != 0 ? null : deviceInfo, (i & 64) != 0 ? null : timezoneInfo, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : location, (i & 32768) != 0 ? null : deviceProperties, (i & 65536) != 0 ? null : permissions);
    }

    public static final /* synthetic */ void lpt2(Fingerprint self, z1k output, h661 serialDesc) {
        if (output.d0() || self.blocked) {
            output.E(serialDesc, 0, self.blocked);
        }
        if (output.d0() || self.carrierInfo != null) {
            output.s(serialDesc, 1, CarrierInfo.cOm9.lpt2, self.carrierInfo);
        }
        if (output.d0() || self.networkInfo != null) {
            output.s(serialDesc, 2, NetworkInfo.cOm9.lpt2, self.networkInfo);
        }
        if (output.d0() || self.connectivity != null) {
            output.s(serialDesc, 3, Connectivity.cOm9.lpt2, self.connectivity);
        }
        if (output.d0() || self.screenInfo != null) {
            output.s(serialDesc, 4, ScreenInfo.cOm9.lpt2, self.screenInfo);
        }
        if (output.d0() || self.deviceInfo != null) {
            output.s(serialDesc, 5, DeviceInfo.cOm9.lpt2, self.deviceInfo);
        }
        if (output.d0() || self.timezoneInfo != null) {
            output.s(serialDesc, 6, TimezoneInfo.cOm9.lpt2, self.timezoneInfo);
        }
        if (output.d0() || self.deviceLanguage != null) {
            output.s(serialDesc, 7, chc1.a, self.deviceLanguage);
        }
        if (output.d0() || self.deviceCountry != null) {
            output.s(serialDesc, 8, chc1.a, self.deviceCountry);
        }
        if (output.d0() || self.appPackageName != null) {
            output.s(serialDesc, 9, chc1.a, self.appPackageName);
        }
        if (output.d0() || self.deviceIdProvider != null) {
            output.s(serialDesc, 10, chc1.a, self.deviceIdProvider);
        }
        if (output.d0() || self.deviceManufacturer != null) {
            output.s(serialDesc, 11, chc1.a, self.deviceManufacturer);
        }
        if (output.d0() || self.deviceModel != null) {
            output.s(serialDesc, 12, chc1.a, self.deviceModel);
        }
        if (output.d0() || self.deviceOS != null) {
            output.s(serialDesc, 13, chc1.a, self.deviceOS);
        }
        if (output.d0() || self.location != null) {
            output.s(serialDesc, 14, Location.cOm9.lpt2, self.location);
        }
        if (output.d0() || self.deviceProperties != null) {
            output.s(serialDesc, 15, DeviceProperties.cOm9.lpt2, self.deviceProperties);
        }
        if (!output.d0() && self.permissions == null) {
            return;
        }
        output.s(serialDesc, 16, Permissions.cOm9.lpt2, self.permissions);
    }

    public final void COM5(String str) {
        this.deviceOS = str;
    }

    public final void COM7(String str) {
        this.deviceIdProvider = str;
    }

    public final void Com8(String str) {
        this.deviceLanguage = str;
    }

    public final void LPT3(String str) {
        this.deviceModel = str;
    }

    public final void Lpt5(String str) {
        this.deviceCountry = str;
    }

    public final void cON(String str) {
        this.deviceManufacturer = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fingerprint)) {
            return false;
        }
        Fingerprint fingerprint = (Fingerprint) other;
        return this.blocked == fingerprint.blocked && u890.j(this.carrierInfo, fingerprint.carrierInfo) && u890.j(this.networkInfo, fingerprint.networkInfo) && u890.j(this.connectivity, fingerprint.connectivity) && u890.j(this.screenInfo, fingerprint.screenInfo) && u890.j(this.deviceInfo, fingerprint.deviceInfo) && u890.j(this.timezoneInfo, fingerprint.timezoneInfo) && u890.j(this.deviceLanguage, fingerprint.deviceLanguage) && u890.j(this.deviceCountry, fingerprint.deviceCountry) && u890.j(this.appPackageName, fingerprint.appPackageName) && u890.j(this.deviceIdProvider, fingerprint.deviceIdProvider) && u890.j(this.deviceManufacturer, fingerprint.deviceManufacturer) && u890.j(this.deviceModel, fingerprint.deviceModel) && u890.j(this.deviceOS, fingerprint.deviceOS) && u890.j(this.location, fingerprint.location) && u890.j(this.deviceProperties, fingerprint.deviceProperties) && u890.j(this.permissions, fingerprint.permissions);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.blocked) * 31;
        CarrierInfo carrierInfo = this.carrierInfo;
        int iHashCode2 = (iHashCode + (carrierInfo == null ? 0 : carrierInfo.hashCode())) * 31;
        NetworkInfo networkInfo = this.networkInfo;
        int iHashCode3 = (iHashCode2 + (networkInfo == null ? 0 : networkInfo.hashCode())) * 31;
        Connectivity connectivity = this.connectivity;
        int iHashCode4 = (iHashCode3 + (connectivity == null ? 0 : connectivity.hashCode())) * 31;
        ScreenInfo screenInfo = this.screenInfo;
        int iHashCode5 = (iHashCode4 + (screenInfo == null ? 0 : screenInfo.hashCode())) * 31;
        DeviceInfo deviceInfo = this.deviceInfo;
        int iHashCode6 = (iHashCode5 + (deviceInfo == null ? 0 : deviceInfo.hashCode())) * 31;
        TimezoneInfo timezoneInfo = this.timezoneInfo;
        int iHashCode7 = (iHashCode6 + (timezoneInfo == null ? 0 : timezoneInfo.hashCode())) * 31;
        String str = this.deviceLanguage;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceCountry;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appPackageName;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceIdProvider;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceManufacturer;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceOS;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Location location = this.location;
        int iHashCode15 = (iHashCode14 + (location == null ? 0 : location.hashCode())) * 31;
        DeviceProperties deviceProperties = this.deviceProperties;
        int iHashCode16 = (iHashCode15 + (deviceProperties == null ? 0 : deviceProperties.hashCode())) * 31;
        Permissions permissions = this.permissions;
        return iHashCode16 + (permissions != null ? permissions.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.blocked;
        CarrierInfo carrierInfo = this.carrierInfo;
        NetworkInfo networkInfo = this.networkInfo;
        Connectivity connectivity = this.connectivity;
        ScreenInfo screenInfo = this.screenInfo;
        DeviceInfo deviceInfo = this.deviceInfo;
        TimezoneInfo timezoneInfo = this.timezoneInfo;
        String str = this.deviceLanguage;
        String str2 = this.deviceCountry;
        String str3 = this.appPackageName;
        String str4 = this.deviceIdProvider;
        String str5 = this.deviceManufacturer;
        String str6 = this.deviceModel;
        String str7 = this.deviceOS;
        Location location = this.location;
        DeviceProperties deviceProperties = this.deviceProperties;
        Permissions permissions = this.permissions;
        StringBuilder sb = new StringBuilder("Fingerprint(blocked=");
        sb.append(z);
        sb.append(", carrierInfo=");
        sb.append(carrierInfo);
        sb.append(", networkInfo=");
        sb.append(networkInfo);
        sb.append(", connectivity=");
        sb.append(connectivity);
        sb.append(", screenInfo=");
        sb.append(screenInfo);
        sb.append(", deviceInfo=");
        sb.append(deviceInfo);
        sb.append(", timezoneInfo=");
        sb.append(timezoneInfo);
        sb.append(", deviceLanguage=");
        sb.append(str);
        sb.append(", deviceCountry=");
        bb00.j(sb, str2, ", appPackageName=", str3, ", deviceIdProvider=");
        bb00.j(sb, str4, ", deviceManufacturer=", str5, ", deviceModel=");
        bb00.j(sb, str6, ", deviceOS=", str7, ", location=");
        sb.append(location);
        sb.append(", deviceProperties=");
        sb.append(deviceProperties);
        sb.append(", permissions=");
        sb.append(permissions);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.blocked ? 1 : 0);
        CarrierInfo carrierInfo = this.carrierInfo;
        if (carrierInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            carrierInfo.writeToParcel(dest, flags);
        }
        NetworkInfo networkInfo = this.networkInfo;
        if (networkInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            networkInfo.writeToParcel(dest, flags);
        }
        Connectivity connectivity = this.connectivity;
        if (connectivity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            connectivity.writeToParcel(dest, flags);
        }
        ScreenInfo screenInfo = this.screenInfo;
        if (screenInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            screenInfo.writeToParcel(dest, flags);
        }
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deviceInfo.writeToParcel(dest, flags);
        }
        TimezoneInfo timezoneInfo = this.timezoneInfo;
        if (timezoneInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            timezoneInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.deviceLanguage);
        dest.writeString(this.deviceCountry);
        dest.writeString(this.appPackageName);
        dest.writeString(this.deviceIdProvider);
        dest.writeString(this.deviceManufacturer);
        dest.writeString(this.deviceModel);
        dest.writeString(this.deviceOS);
        Location location = this.location;
        if (location == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            location.writeToParcel(dest, flags);
        }
        DeviceProperties deviceProperties = this.deviceProperties;
        if (deviceProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deviceProperties.writeToParcel(dest, flags);
        }
        Permissions permissions = this.permissions;
        if (permissions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            permissions.writeToParcel(dest, flags);
        }
    }

    public Fingerprint(boolean z, CarrierInfo carrierInfo, NetworkInfo networkInfo, Connectivity connectivity, ScreenInfo screenInfo, DeviceInfo deviceInfo, TimezoneInfo timezoneInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Location location, DeviceProperties deviceProperties, Permissions permissions) {
        this.blocked = z;
        this.carrierInfo = carrierInfo;
        this.networkInfo = networkInfo;
        this.connectivity = connectivity;
        this.screenInfo = screenInfo;
        this.deviceInfo = deviceInfo;
        this.timezoneInfo = timezoneInfo;
        this.deviceLanguage = str;
        this.deviceCountry = str2;
        this.appPackageName = str3;
        this.deviceIdProvider = str4;
        this.deviceManufacturer = str5;
        this.deviceModel = str6;
        this.deviceOS = str7;
        this.location = location;
        this.deviceProperties = deviceProperties;
        this.permissions = permissions;
    }

    public /* synthetic */ Fingerprint(int i, boolean z, CarrierInfo carrierInfo, NetworkInfo networkInfo, Connectivity connectivity, ScreenInfo screenInfo, DeviceInfo deviceInfo, TimezoneInfo timezoneInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Location location, DeviceProperties deviceProperties, Permissions permissions, p661 p661Var) {
        this.blocked = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.carrierInfo = null;
        } else {
            this.carrierInfo = carrierInfo;
        }
        if ((i & 4) == 0) {
            this.networkInfo = null;
        } else {
            this.networkInfo = networkInfo;
        }
        if ((i & 8) == 0) {
            this.connectivity = null;
        } else {
            this.connectivity = connectivity;
        }
        if ((i & 16) == 0) {
            this.screenInfo = null;
        } else {
            this.screenInfo = screenInfo;
        }
        if ((i & 32) == 0) {
            this.deviceInfo = null;
        } else {
            this.deviceInfo = deviceInfo;
        }
        if ((i & 64) == 0) {
            this.timezoneInfo = null;
        } else {
            this.timezoneInfo = timezoneInfo;
        }
        if ((i & 128) == 0) {
            this.deviceLanguage = null;
        } else {
            this.deviceLanguage = str;
        }
        if ((i & 256) == 0) {
            this.deviceCountry = null;
        } else {
            this.deviceCountry = str2;
        }
        if ((i & 512) == 0) {
            this.appPackageName = null;
        } else {
            this.appPackageName = str3;
        }
        if ((i & 1024) == 0) {
            this.deviceIdProvider = null;
        } else {
            this.deviceIdProvider = str4;
        }
        if ((i & 2048) == 0) {
            this.deviceManufacturer = null;
        } else {
            this.deviceManufacturer = str5;
        }
        if ((i & 4096) == 0) {
            this.deviceModel = null;
        } else {
            this.deviceModel = str6;
        }
        if ((i & 8192) == 0) {
            this.deviceOS = null;
        } else {
            this.deviceOS = str7;
        }
        if ((i & 16384) == 0) {
            this.location = null;
        } else {
            this.location = location;
        }
        if ((32768 & i) == 0) {
            this.deviceProperties = null;
        } else {
            this.deviceProperties = deviceProperties;
        }
        if ((i & 65536) == 0) {
            this.permissions = null;
        } else {
            this.permissions = permissions;
        }
    }

    public static final class CoM6 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Fingerprint createFromParcel(Parcel parcel) {
            return new Fingerprint(parcel.readInt() != 0, parcel.readInt() == 0 ? null : CarrierInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NetworkInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Connectivity.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ScreenInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeviceInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TimezoneInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Location.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeviceProperties.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Permissions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Fingerprint[] newArray(int i) {
            return new Fingerprint[i];
        }
    }

    public final void lpt2(boolean z) {
        this.blocked = z;
    }

    public final void lpt2(CarrierInfo carrierInfo) {
        this.carrierInfo = carrierInfo;
    }

    public final void lpt2(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public final void lpt2(Connectivity connectivity) {
        this.connectivity = connectivity;
    }

    public final void lpt2(ScreenInfo screenInfo) {
        this.screenInfo = screenInfo;
    }

    public final void lpt2(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public final void lpt2(TimezoneInfo timezoneInfo) {
        this.timezoneInfo = timezoneInfo;
    }

    public final void lpt2(String str) {
        this.appPackageName = str;
    }

    public final void lpt2(Location location) {
        this.location = location;
    }

    public final void lpt2(DeviceProperties deviceProperties) {
        this.deviceProperties = deviceProperties;
    }

    public final void lpt2(Permissions permissions) {
        this.permissions = permissions;
    }

    public /* synthetic */ class cOm9 implements pf40 {
        public static final m0v0 a;
        public static final cOm9 lpt2;

        static {
            cOm9 com9 = new cOm9();
            lpt2 = com9;
            m0v0 m0v0Var = new m0v0("com.ravelin.core.model.Fingerprint", com9, 17);
            m0v0Var.j("blockedByTheRateLimiter", true);
            m0v0Var.j("carrierInfo", true);
            m0v0Var.j("networkInfo", true);
            m0v0Var.j("connectivityInfo", true);
            m0v0Var.j("screenInfo", true);
            m0v0Var.j("deviceInfo", true);
            m0v0Var.j("timezoneInfo", true);
            m0v0Var.j("deviceLanguage", true);
            m0v0Var.j("deviceCountry", true);
            m0v0Var.j("appPackageName", true);
            m0v0Var.j("deviceIdProvider", true);
            m0v0Var.j("deviceManufacturer", true);
            m0v0Var.j("deviceModel", true);
            m0v0Var.j("deviceOS", true);
            m0v0Var.j("location", true);
            m0v0Var.j("deviceProperties", true);
            m0v0Var.j("permissions", true);
            a = m0v0Var;
        }

        public final nma0[] childSerializers() {
            nma0 nma0VarZ = m5n1.z(CarrierInfo.cOm9.lpt2);
            nma0 nma0VarZ2 = m5n1.z(NetworkInfo.cOm9.lpt2);
            nma0 nma0VarZ3 = m5n1.z(Connectivity.cOm9.lpt2);
            nma0 nma0VarZ4 = m5n1.z(ScreenInfo.cOm9.lpt2);
            nma0 nma0VarZ5 = m5n1.z(DeviceInfo.cOm9.lpt2);
            nma0 nma0VarZ6 = m5n1.z(TimezoneInfo.cOm9.lpt2);
            chc1 chc1Var = chc1.a;
            return new nma0[]{gpb.a, nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(Location.cOm9.lpt2), m5n1.z(DeviceProperties.cOm9.lpt2), m5n1.z(Permissions.cOm9.lpt2)};
        }

        public final h661 getDescriptor() {
            return a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final Fingerprint deserialize(dar darVar) {
            int i;
            ScreenInfo screenInfo;
            m0v0 m0v0Var = a;
            x1k x1kVarB = darVar.b(m0v0Var);
            x1kVarB.getClass();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i2 = 0;
            String str5 = null;
            Location location = null;
            DeviceProperties deviceProperties = null;
            Permissions permissions = null;
            ScreenInfo screenInfo2 = null;
            DeviceInfo deviceInfo = null;
            TimezoneInfo timezoneInfo = null;
            String str6 = null;
            String str7 = null;
            boolean z = true;
            boolean zM = false;
            CarrierInfo carrierInfo = null;
            NetworkInfo networkInfo = null;
            Connectivity connectivity = null;
            while (z) {
                int iP = x1kVarB.p(m0v0Var);
                switch (iP) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        z = false;
                        screenInfo2 = screenInfo2;
                        break;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        screenInfo = screenInfo2;
                        zM = x1kVarB.M(m0v0Var, 0);
                        i2 |= 1;
                        screenInfo2 = screenInfo;
                        deviceInfo = deviceInfo;
                        str = str;
                        break;
                    case 1:
                        screenInfo = screenInfo2;
                        carrierInfo = (CarrierInfo) x1kVarB.B(m0v0Var, 1, CarrierInfo.cOm9.lpt2, carrierInfo);
                        i2 |= 2;
                        networkInfo = networkInfo;
                        screenInfo2 = screenInfo;
                        deviceInfo = deviceInfo;
                        str = str;
                        break;
                    case 2:
                        screenInfo = screenInfo2;
                        networkInfo = (NetworkInfo) x1kVarB.B(m0v0Var, 2, NetworkInfo.cOm9.lpt2, networkInfo);
                        i2 |= 4;
                        screenInfo2 = screenInfo;
                        deviceInfo = deviceInfo;
                        str = str;
                        break;
                    case 3:
                        screenInfo = screenInfo2;
                        connectivity = (Connectivity) x1kVarB.B(m0v0Var, 3, Connectivity.cOm9.lpt2, connectivity);
                        i2 |= 8;
                        screenInfo2 = screenInfo;
                        deviceInfo = deviceInfo;
                        str = str;
                        break;
                    case 4:
                        str = str;
                        deviceInfo = deviceInfo;
                        screenInfo2 = (ScreenInfo) x1kVarB.B(m0v0Var, 4, ScreenInfo.cOm9.lpt2, screenInfo2);
                        i2 |= 16;
                        deviceInfo = deviceInfo;
                        str = str;
                        break;
                    case 5:
                        str = str;
                        deviceInfo = (DeviceInfo) x1kVarB.B(m0v0Var, 5, DeviceInfo.cOm9.lpt2, deviceInfo);
                        i2 |= 32;
                        screenInfo2 = screenInfo2;
                        str = str;
                        break;
                    case 6:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        timezoneInfo = (TimezoneInfo) x1kVarB.B(m0v0Var, 6, TimezoneInfo.cOm9.lpt2, timezoneInfo);
                        i2 |= 64;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 7:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str7 = (String) x1kVarB.B(m0v0Var, 7, chc1.a, str7);
                        i2 |= 128;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 8:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str3 = (String) x1kVarB.B(m0v0Var, 8, chc1.a, str3);
                        i2 |= 256;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 9:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str2 = (String) x1kVarB.B(m0v0Var, 9, chc1.a, str2);
                        i2 |= 512;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 10:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str = (String) x1kVarB.B(m0v0Var, 10, chc1.a, str);
                        i2 |= 1024;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str4 = (String) x1kVarB.B(m0v0Var, 11, chc1.a, str4);
                        i2 |= 2048;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case grn1.d /* 12 */:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str5 = (String) x1kVarB.B(m0v0Var, 12, chc1.a, str5);
                        i2 |= 4096;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 13:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        str6 = (String) x1kVarB.B(m0v0Var, 13, chc1.a, str6);
                        i2 |= 8192;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 14:
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        location = (Location) x1kVarB.B(m0v0Var, 14, Location.cOm9.lpt2, location);
                        i2 |= 16384;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 15:
                        deviceProperties = (DeviceProperties) x1kVarB.B(m0v0Var, 15, DeviceProperties.cOm9.lpt2, deviceProperties);
                        i = 32768;
                        i2 |= i;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    case 16:
                        permissions = (Permissions) x1kVarB.B(m0v0Var, 16, Permissions.cOm9.lpt2, permissions);
                        i = 65536;
                        i2 |= i;
                        screenInfo2 = screenInfo2;
                        deviceInfo = deviceInfo;
                        break;
                    default:
                        n9v.a(iP);
                        return null;
                }
            }
            ScreenInfo screenInfo3 = screenInfo2;
            DeviceInfo deviceInfo2 = deviceInfo;
            CarrierInfo carrierInfo2 = carrierInfo;
            NetworkInfo networkInfo2 = networkInfo;
            x1kVarB.a(m0v0Var);
            return new Fingerprint(i2, zM, carrierInfo2, networkInfo2, connectivity, screenInfo3, deviceInfo2, timezoneInfo, str7, str3, str2, str, str4, str5, str6, location, deviceProperties, permissions, (p661) null);
        }

        public /* bridge */ /* synthetic */ nma0[] typeParametersSerializers() {
            return z0o1.a;
        }

        /* JADX INFO: renamed from: lpt2, reason: merged with bridge method [inline-methods] */
        public final void serialize(uax uaxVar, Fingerprint fingerprint) {
            m0v0 m0v0Var = a;
            z1k z1kVarB = uaxVar.b(m0v0Var);
            Fingerprint.lpt2(fingerprint, z1kVarB, m0v0Var);
            z1kVarB.a(m0v0Var);
        }
    }
}
