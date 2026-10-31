package com.spotify.connectivity;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001a\u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001a\u00101\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001a\u00104\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001e\u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/spotify/connectivity/MobileDeviceInfo;", "", "<init>", "()V", "osVersion", "", "getOsVersion", "()Ljava/lang/String;", "setOsVersion", "(Ljava/lang/String;)V", "apiLevel", "", "getApiLevel", "()I", "setApiLevel", "(I)V", "name", "getName", "setName", "model", "getModel", "setModel", "brand", "getBrand", "setBrand", "manufacturer", "getManufacturer", "setManufacturer", "deviceType", "getDeviceType", "setDeviceType", "volumeSteps", "getVolumeSteps", "setVolumeSteps", "screenWidth", "getScreenWidth", "setScreenWidth", "screenHeight", "getScreenHeight", "setScreenHeight", "smallestScreenWidthDp", "getSmallestScreenWidthDp", "setSmallestScreenWidthDp", "screenDensityCurrent", "getScreenDensityCurrent", "setScreenDensityCurrent", "screenDensityStable", "getScreenDensityStable", "setScreenDensityStable", "cachePath", "getCachePath", "setCachePath", "installerName", "getInstallerName", "setInstallerName", "desktopFormFactor", "", "getDesktopFormFactor", "()Ljava/lang/Boolean;", "setDesktopFormFactor", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class MobileDeviceInfo {
    private int apiLevel;
    private Boolean desktopFormFactor;
    private int deviceType;
    private int screenDensityCurrent;
    private int screenDensityStable;
    private int screenHeight;
    private int screenWidth;
    private int smallestScreenWidthDp;
    private String osVersion = "";
    private String name = "";
    private String model = "";
    private String brand = "";
    private String manufacturer = "";
    private int volumeSteps = 32;
    private String cachePath = "";
    private String installerName = "";

    public final int getApiLevel() {
        return this.apiLevel;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final Boolean getDesktopFormFactor() {
        return this.desktopFormFactor;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final String getInstallerName() {
        return this.installerName;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final int getScreenDensityCurrent() {
        return this.screenDensityCurrent;
    }

    public final int getScreenDensityStable() {
        return this.screenDensityStable;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final int getSmallestScreenWidthDp() {
        return this.smallestScreenWidthDp;
    }

    public final int getVolumeSteps() {
        return this.volumeSteps;
    }

    public final void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setDesktopFormFactor(Boolean bool) {
        this.desktopFormFactor = bool;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setInstallerName(String str) {
        this.installerName = str;
    }

    public final void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setScreenDensityCurrent(int i) {
        this.screenDensityCurrent = i;
    }

    public final void setScreenDensityStable(int i) {
        this.screenDensityStable = i;
    }

    public final void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    public final void setSmallestScreenWidthDp(int i) {
        this.smallestScreenWidthDp = i;
    }

    public final void setVolumeSteps(int i) {
        this.volumeSteps = i;
    }
}
