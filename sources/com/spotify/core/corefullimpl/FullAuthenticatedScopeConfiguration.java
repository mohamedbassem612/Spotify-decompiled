package com.spotify.core.corefullimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bb00;
import p.cy30;
import p.gvg;
import p.kaa0;
import p.u890;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\bb\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u000eHÆ\u0003J\u0018\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010AJ\t\u0010h\u001a\u00020\u0015HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u000eHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0015HÆ\u0003J\t\u0010m\u001a\u00020\u0015HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0015HÆ\u0003J\t\u0010p\u001a\u00020\u0015HÆ\u0003J¤\u0002\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010rJ\u0014\u0010s\u001a\u00020\u00152\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010u\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010v\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001a\u0010\u0011\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R&\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010#R\u001a\u0010\u0017\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00107\"\u0004\bL\u00109R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010!\"\u0004\bN\u0010#R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010F\"\u0004\bR\u0010HR\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010!\"\u0004\bT\u0010#R\u001a\u0010\u001c\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010F\"\u0004\bV\u0010HR\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010F\"\u0004\bX\u0010H¨\u0006w"}, d2 = {"Lcom/spotify/core/corefullimpl/FullAuthenticatedScopeConfiguration;", "", "clientId", "", "nativeBundleId", "deviceName", "description", "descriptionShort", "model", "brand", "cachePath", "volatileCachePath", "settingsPath", "versionNumber", "", "versionName", "deviceId", "deviceType", "supportedContentTypes", "", "videoRendererAvailable", "", "deduplicationId", "volumeSteps", "deviceModelName", "canPlay", "enableRemoteSleepTimer", "locale", "disableDeviceIdObfuscation", "connectDiscoveryEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;ZZLjava/lang/String;ZZ)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getNativeBundleId", "setNativeBundleId", "getDeviceName", "setDeviceName", "getDescription", "setDescription", "getDescriptionShort", "setDescriptionShort", "getModel", "setModel", "getBrand", "setBrand", "getCachePath", "setCachePath", "getVolatileCachePath", "setVolatileCachePath", "getSettingsPath", "setSettingsPath", "getVersionNumber", "()I", "setVersionNumber", "(I)V", "getVersionName", "setVersionName", "getDeviceId", "setDeviceId", "getDeviceType", "setDeviceType", "getSupportedContentTypes", "()[Ljava/lang/String;", "setSupportedContentTypes", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getVideoRendererAvailable", "()Z", "setVideoRendererAvailable", "(Z)V", "getDeduplicationId", "setDeduplicationId", "getVolumeSteps", "setVolumeSteps", "getDeviceModelName", "setDeviceModelName", "getCanPlay", "setCanPlay", "getEnableRemoteSleepTimer", "setEnableRemoteSleepTimer", "getLocale", "setLocale", "getDisableDeviceIdObfuscation", "setDisableDeviceIdObfuscation", "getConnectDiscoveryEnabled", "setConnectDiscoveryEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;ZZLjava/lang/String;ZZ)Lcom/spotify/core/corefullimpl/FullAuthenticatedScopeConfiguration;", "equals", "other", "hashCode", "toString", "src_main_java_com_spotify_core_corefullimpl-corefullimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final /* data */ class FullAuthenticatedScopeConfiguration {
    private String brand;
    private String cachePath;
    private boolean canPlay;
    private String clientId;
    private boolean connectDiscoveryEnabled;
    private String deduplicationId;
    private String description;
    private String descriptionShort;
    private String deviceId;
    private String deviceModelName;
    private String deviceName;
    private int deviceType;
    private boolean disableDeviceIdObfuscation;
    private boolean enableRemoteSleepTimer;
    private String locale;
    private String model;
    private String nativeBundleId;
    private String settingsPath;
    private String[] supportedContentTypes;
    private String versionName;
    private int versionNumber;
    private boolean videoRendererAvailable;
    private String volatileCachePath;
    private int volumeSteps;

    public /* synthetic */ FullAuthenticatedScopeConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, String str11, String str12, int i2, String[] strArr, boolean z, String str13, int i3, String str14, boolean z2, boolean z3, String str15, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6, (i4 & 64) != 0 ? null : str7, (i4 & 128) != 0 ? null : str8, (i4 & 256) != 0 ? null : str9, (i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : str10, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? null : str11, (i4 & 4096) != 0 ? null : str12, (i4 & 8192) != 0 ? 0 : i2, (i4 & 16384) != 0 ? null : strArr, (i4 & 32768) != 0 ? true : z, (i4 & 65536) != 0 ? null : str13, (i4 & 131072) != 0 ? 32 : i3, (i4 & 262144) != 0 ? null : str14, (i4 & 524288) != 0 ? true : z2, (i4 & 1048576) != 0 ? false : z3, (i4 & 2097152) != 0 ? "en" : str15, (i4 & 4194304) != 0 ? false : z4, (i4 & 8388608) != 0 ? true : z5);
    }

    public static /* synthetic */ FullAuthenticatedScopeConfiguration copy$default(FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, String str11, String str12, int i2, String[] strArr, boolean z, String str13, int i3, String str14, boolean z2, boolean z3, String str15, boolean z4, boolean z5, int i4, Object obj) {
        boolean z6;
        boolean z7;
        String str16 = (i4 & 1) != 0 ? fullAuthenticatedScopeConfiguration.clientId : str;
        String str17 = (i4 & 2) != 0 ? fullAuthenticatedScopeConfiguration.nativeBundleId : str2;
        String str18 = (i4 & 4) != 0 ? fullAuthenticatedScopeConfiguration.deviceName : str3;
        String str19 = (i4 & 8) != 0 ? fullAuthenticatedScopeConfiguration.description : str4;
        String str20 = (i4 & 16) != 0 ? fullAuthenticatedScopeConfiguration.descriptionShort : str5;
        String str21 = (i4 & 32) != 0 ? fullAuthenticatedScopeConfiguration.model : str6;
        String str22 = (i4 & 64) != 0 ? fullAuthenticatedScopeConfiguration.brand : str7;
        String str23 = (i4 & 128) != 0 ? fullAuthenticatedScopeConfiguration.cachePath : str8;
        String str24 = (i4 & 256) != 0 ? fullAuthenticatedScopeConfiguration.volatileCachePath : str9;
        String str25 = (i4 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? fullAuthenticatedScopeConfiguration.settingsPath : str10;
        int i5 = (i4 & 1024) != 0 ? fullAuthenticatedScopeConfiguration.versionNumber : i;
        String str26 = (i4 & 2048) != 0 ? fullAuthenticatedScopeConfiguration.versionName : str11;
        String str27 = (i4 & 4096) != 0 ? fullAuthenticatedScopeConfiguration.deviceId : str12;
        int i6 = (i4 & 8192) != 0 ? fullAuthenticatedScopeConfiguration.deviceType : i2;
        String str28 = str16;
        String[] strArr2 = (i4 & 16384) != 0 ? fullAuthenticatedScopeConfiguration.supportedContentTypes : strArr;
        boolean z8 = (i4 & 32768) != 0 ? fullAuthenticatedScopeConfiguration.videoRendererAvailable : z;
        String str29 = (i4 & 65536) != 0 ? fullAuthenticatedScopeConfiguration.deduplicationId : str13;
        int i7 = (i4 & 131072) != 0 ? fullAuthenticatedScopeConfiguration.volumeSteps : i3;
        String str30 = (i4 & 262144) != 0 ? fullAuthenticatedScopeConfiguration.deviceModelName : str14;
        boolean z9 = (i4 & 524288) != 0 ? fullAuthenticatedScopeConfiguration.canPlay : z2;
        boolean z10 = (i4 & 1048576) != 0 ? fullAuthenticatedScopeConfiguration.enableRemoteSleepTimer : z3;
        String str31 = (i4 & 2097152) != 0 ? fullAuthenticatedScopeConfiguration.locale : str15;
        boolean z11 = (i4 & 4194304) != 0 ? fullAuthenticatedScopeConfiguration.disableDeviceIdObfuscation : z4;
        if ((i4 & 8388608) != 0) {
            z7 = z11;
            z6 = fullAuthenticatedScopeConfiguration.connectDiscoveryEnabled;
        } else {
            z6 = z5;
            z7 = z11;
        }
        return fullAuthenticatedScopeConfiguration.copy(str28, str17, str18, str19, str20, str21, str22, str23, str24, str25, i5, str26, str27, i6, strArr2, z8, str29, i7, str30, z9, z10, str31, z7, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSettingsPath() {
        return this.settingsPath;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getVersionNumber() {
        return this.versionNumber;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String[] getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getVideoRendererAvailable() {
        return this.videoRendererAvailable;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDeduplicationId() {
        return this.deduplicationId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getVolumeSteps() {
        return this.volumeSteps;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDeviceModelName() {
        return this.deviceModelName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNativeBundleId() {
        return this.nativeBundleId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getCanPlay() {
        return this.canPlay;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getEnableRemoteSleepTimer() {
        return this.enableRemoteSleepTimer;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getDisableDeviceIdObfuscation() {
        return this.disableDeviceIdObfuscation;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getConnectDiscoveryEnabled() {
        return this.connectDiscoveryEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionShort() {
        return this.descriptionShort;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCachePath() {
        return this.cachePath;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVolatileCachePath() {
        return this.volatileCachePath;
    }

    public final FullAuthenticatedScopeConfiguration copy(String clientId, String nativeBundleId, String deviceName, String description, String descriptionShort, String model, String brand, String cachePath, String volatileCachePath, String settingsPath, int versionNumber, String versionName, String deviceId, int deviceType, String[] supportedContentTypes, boolean videoRendererAvailable, String deduplicationId, int volumeSteps, String deviceModelName, boolean canPlay, boolean enableRemoteSleepTimer, String locale, boolean disableDeviceIdObfuscation, boolean connectDiscoveryEnabled) {
        return new FullAuthenticatedScopeConfiguration(clientId, nativeBundleId, deviceName, description, descriptionShort, model, brand, cachePath, volatileCachePath, settingsPath, versionNumber, versionName, deviceId, deviceType, supportedContentTypes, videoRendererAvailable, deduplicationId, volumeSteps, deviceModelName, canPlay, enableRemoteSleepTimer, locale, disableDeviceIdObfuscation, connectDiscoveryEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullAuthenticatedScopeConfiguration)) {
            return false;
        }
        FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration = (FullAuthenticatedScopeConfiguration) other;
        return u890.j(this.clientId, fullAuthenticatedScopeConfiguration.clientId) && u890.j(this.nativeBundleId, fullAuthenticatedScopeConfiguration.nativeBundleId) && u890.j(this.deviceName, fullAuthenticatedScopeConfiguration.deviceName) && u890.j(this.description, fullAuthenticatedScopeConfiguration.description) && u890.j(this.descriptionShort, fullAuthenticatedScopeConfiguration.descriptionShort) && u890.j(this.model, fullAuthenticatedScopeConfiguration.model) && u890.j(this.brand, fullAuthenticatedScopeConfiguration.brand) && u890.j(this.cachePath, fullAuthenticatedScopeConfiguration.cachePath) && u890.j(this.volatileCachePath, fullAuthenticatedScopeConfiguration.volatileCachePath) && u890.j(this.settingsPath, fullAuthenticatedScopeConfiguration.settingsPath) && this.versionNumber == fullAuthenticatedScopeConfiguration.versionNumber && u890.j(this.versionName, fullAuthenticatedScopeConfiguration.versionName) && u890.j(this.deviceId, fullAuthenticatedScopeConfiguration.deviceId) && this.deviceType == fullAuthenticatedScopeConfiguration.deviceType && u890.j(this.supportedContentTypes, fullAuthenticatedScopeConfiguration.supportedContentTypes) && this.videoRendererAvailable == fullAuthenticatedScopeConfiguration.videoRendererAvailable && u890.j(this.deduplicationId, fullAuthenticatedScopeConfiguration.deduplicationId) && this.volumeSteps == fullAuthenticatedScopeConfiguration.volumeSteps && u890.j(this.deviceModelName, fullAuthenticatedScopeConfiguration.deviceModelName) && this.canPlay == fullAuthenticatedScopeConfiguration.canPlay && this.enableRemoteSleepTimer == fullAuthenticatedScopeConfiguration.enableRemoteSleepTimer && u890.j(this.locale, fullAuthenticatedScopeConfiguration.locale) && this.disableDeviceIdObfuscation == fullAuthenticatedScopeConfiguration.disableDeviceIdObfuscation && this.connectDiscoveryEnabled == fullAuthenticatedScopeConfiguration.connectDiscoveryEnabled;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final boolean getCanPlay() {
        return this.canPlay;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final boolean getConnectDiscoveryEnabled() {
        return this.connectDiscoveryEnabled;
    }

    public final String getDeduplicationId() {
        return this.deduplicationId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionShort() {
        return this.descriptionShort;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceModelName() {
        return this.deviceModelName;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final boolean getDisableDeviceIdObfuscation() {
        return this.disableDeviceIdObfuscation;
    }

    public final boolean getEnableRemoteSleepTimer() {
        return this.enableRemoteSleepTimer;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getNativeBundleId() {
        return this.nativeBundleId;
    }

    public final String getSettingsPath() {
        return this.settingsPath;
    }

    public final String[] getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final int getVersionNumber() {
        return this.versionNumber;
    }

    public final boolean getVideoRendererAvailable() {
        return this.videoRendererAvailable;
    }

    public final String getVolatileCachePath() {
        return this.volatileCachePath;
    }

    public final int getVolumeSteps() {
        return this.volumeSteps;
    }

    public int hashCode() {
        String str = this.clientId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nativeBundleId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.descriptionShort;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.model;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.brand;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cachePath;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.volatileCachePath;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.settingsPath;
        int iF = kaa0.f(this.versionNumber, (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        String str11 = this.versionName;
        int iHashCode10 = (iF + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.deviceId;
        int iF2 = kaa0.f(this.deviceType, (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31, 31);
        String[] strArr = this.supportedContentTypes;
        int iG = xcg1.g((iF2 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31, 31, this.videoRendererAvailable);
        String str13 = this.deduplicationId;
        int iF3 = kaa0.f(this.volumeSteps, (iG + (str13 == null ? 0 : str13.hashCode())) * 31, 31);
        String str14 = this.deviceModelName;
        return Boolean.hashCode(this.connectDiscoveryEnabled) + xcg1.g(cy30.d(xcg1.g(xcg1.g((iF3 + (str14 != null ? str14.hashCode() : 0)) * 31, 31, this.canPlay), 31, this.enableRemoteSleepTimer), 31, this.locale), 31, this.disableDeviceIdObfuscation);
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setConnectDiscoveryEnabled(boolean z) {
        this.connectDiscoveryEnabled = z;
    }

    public final void setDeduplicationId(String str) {
        this.deduplicationId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDescriptionShort(String str) {
        this.descriptionShort = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDeviceModelName(String str) {
        this.deviceModelName = str;
    }

    public final void setDeviceName(String str) {
        this.deviceName = str;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setDisableDeviceIdObfuscation(boolean z) {
        this.disableDeviceIdObfuscation = z;
    }

    public final void setEnableRemoteSleepTimer(boolean z) {
        this.enableRemoteSleepTimer = z;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setNativeBundleId(String str) {
        this.nativeBundleId = str;
    }

    public final void setSettingsPath(String str) {
        this.settingsPath = str;
    }

    public final void setSupportedContentTypes(String[] strArr) {
        this.supportedContentTypes = strArr;
    }

    public final void setVersionName(String str) {
        this.versionName = str;
    }

    public final void setVersionNumber(int i) {
        this.versionNumber = i;
    }

    public final void setVideoRendererAvailable(boolean z) {
        this.videoRendererAvailable = z;
    }

    public final void setVolatileCachePath(String str) {
        this.volatileCachePath = str;
    }

    public final void setVolumeSteps(int i) {
        this.volumeSteps = i;
    }

    public String toString() {
        String str = this.clientId;
        String str2 = this.nativeBundleId;
        String str3 = this.deviceName;
        String str4 = this.description;
        String str5 = this.descriptionShort;
        String str6 = this.model;
        String str7 = this.brand;
        String str8 = this.cachePath;
        String str9 = this.volatileCachePath;
        String str10 = this.settingsPath;
        int i = this.versionNumber;
        String str11 = this.versionName;
        String str12 = this.deviceId;
        int i2 = this.deviceType;
        String string = Arrays.toString(this.supportedContentTypes);
        boolean z = this.videoRendererAvailable;
        String str13 = this.deduplicationId;
        int i3 = this.volumeSteps;
        String str14 = this.deviceModelName;
        boolean z2 = this.canPlay;
        boolean z3 = this.enableRemoteSleepTimer;
        String str15 = this.locale;
        boolean z4 = this.disableDeviceIdObfuscation;
        boolean z5 = this.connectDiscoveryEnabled;
        StringBuilder sbN = gvg.n("FullAuthenticatedScopeConfiguration(clientId=", str, ", nativeBundleId=", str2, ", deviceName=");
        bb00.j(sbN, str3, ", description=", str4, ", descriptionShort=");
        bb00.j(sbN, str5, ", model=", str6, ", brand=");
        bb00.j(sbN, str7, ", cachePath=", str8, ", volatileCachePath=");
        bb00.j(sbN, str9, ", settingsPath=", str10, ", versionNumber=");
        sbN.append(i);
        sbN.append(", versionName=");
        sbN.append(str11);
        sbN.append(", deviceId=");
        sbN.append(str12);
        sbN.append(", deviceType=");
        sbN.append(i2);
        sbN.append(", supportedContentTypes=");
        sbN.append(string);
        sbN.append(", videoRendererAvailable=");
        sbN.append(z);
        sbN.append(", deduplicationId=");
        sbN.append(str13);
        sbN.append(", volumeSteps=");
        sbN.append(i3);
        sbN.append(", deviceModelName=");
        sbN.append(str14);
        sbN.append(", canPlay=");
        sbN.append(z2);
        sbN.append(", enableRemoteSleepTimer=");
        sbN.append(z3);
        sbN.append(", locale=");
        sbN.append(str15);
        sbN.append(", disableDeviceIdObfuscation=");
        sbN.append(z4);
        sbN.append(", connectDiscoveryEnabled=");
        sbN.append(z5);
        sbN.append(")");
        return sbN.toString();
    }

    public FullAuthenticatedScopeConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, String str11, String str12, int i2, String[] strArr, boolean z, String str13, int i3, String str14, boolean z2, boolean z3, String str15, boolean z4, boolean z5) {
        this.clientId = str;
        this.nativeBundleId = str2;
        this.deviceName = str3;
        this.description = str4;
        this.descriptionShort = str5;
        this.model = str6;
        this.brand = str7;
        this.cachePath = str8;
        this.volatileCachePath = str9;
        this.settingsPath = str10;
        this.versionNumber = i;
        this.versionName = str11;
        this.deviceId = str12;
        this.deviceType = i2;
        this.supportedContentTypes = strArr;
        this.videoRendererAvailable = z;
        this.deduplicationId = str13;
        this.volumeSteps = i3;
        this.deviceModelName = str14;
        this.canPlay = z2;
        this.enableRemoteSleepTimer = z3;
        this.locale = str15;
        this.disableDeviceIdObfuscation = z4;
        this.connectDiscoveryEnabled = z5;
    }

    public FullAuthenticatedScopeConfiguration() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, null, false, null, 0, null, false, false, null, false, false, 16777215, null);
    }
}
