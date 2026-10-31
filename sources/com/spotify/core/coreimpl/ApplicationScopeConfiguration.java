package com.spotify.core.coreimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.gvg;
import p.u890;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006 "}, d2 = {"Lcom/spotify/core/coreimpl/ApplicationScopeConfiguration;", "", "cachePath", "", "settingsPath", "enablePerformanceTracing", "", "performanceTracingLogsPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCachePath", "()Ljava/lang/String;", "setCachePath", "(Ljava/lang/String;)V", "getSettingsPath", "setSettingsPath", "getEnablePerformanceTracing", "()Z", "setEnablePerformanceTracing", "(Z)V", "getPerformanceTracingLogsPath", "setPerformanceTracingLogsPath", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "src_main_java_com_spotify_core_coreimpl-coreimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final /* data */ class ApplicationScopeConfiguration {
    private String cachePath;
    private boolean enablePerformanceTracing;
    private String performanceTracingLogsPath;
    private String settingsPath;

    public /* synthetic */ ApplicationScopeConfiguration(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ ApplicationScopeConfiguration copy$default(ApplicationScopeConfiguration applicationScopeConfiguration, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationScopeConfiguration.cachePath;
        }
        if ((i & 2) != 0) {
            str2 = applicationScopeConfiguration.settingsPath;
        }
        if ((i & 4) != 0) {
            z = applicationScopeConfiguration.enablePerformanceTracing;
        }
        if ((i & 8) != 0) {
            str3 = applicationScopeConfiguration.performanceTracingLogsPath;
        }
        return applicationScopeConfiguration.copy(str, str2, z, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCachePath() {
        return this.cachePath;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSettingsPath() {
        return this.settingsPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnablePerformanceTracing() {
        return this.enablePerformanceTracing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPerformanceTracingLogsPath() {
        return this.performanceTracingLogsPath;
    }

    public final ApplicationScopeConfiguration copy(String cachePath, String settingsPath, boolean enablePerformanceTracing, String performanceTracingLogsPath) {
        return new ApplicationScopeConfiguration(cachePath, settingsPath, enablePerformanceTracing, performanceTracingLogsPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationScopeConfiguration)) {
            return false;
        }
        ApplicationScopeConfiguration applicationScopeConfiguration = (ApplicationScopeConfiguration) other;
        return u890.j(this.cachePath, applicationScopeConfiguration.cachePath) && u890.j(this.settingsPath, applicationScopeConfiguration.settingsPath) && this.enablePerformanceTracing == applicationScopeConfiguration.enablePerformanceTracing && u890.j(this.performanceTracingLogsPath, applicationScopeConfiguration.performanceTracingLogsPath);
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public final boolean getEnablePerformanceTracing() {
        return this.enablePerformanceTracing;
    }

    public final String getPerformanceTracingLogsPath() {
        return this.performanceTracingLogsPath;
    }

    public final String getSettingsPath() {
        return this.settingsPath;
    }

    public int hashCode() {
        String str = this.cachePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settingsPath;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.enablePerformanceTracing);
        String str3 = this.performanceTracingLogsPath;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCachePath(String str) {
        this.cachePath = str;
    }

    public final void setEnablePerformanceTracing(boolean z) {
        this.enablePerformanceTracing = z;
    }

    public final void setPerformanceTracingLogsPath(String str) {
        this.performanceTracingLogsPath = str;
    }

    public final void setSettingsPath(String str) {
        this.settingsPath = str;
    }

    public String toString() {
        String str = this.cachePath;
        String str2 = this.settingsPath;
        boolean z = this.enablePerformanceTracing;
        String str3 = this.performanceTracingLogsPath;
        StringBuilder sbN = gvg.n("ApplicationScopeConfiguration(cachePath=", str, ", settingsPath=", str2, ", enablePerformanceTracing=");
        sbN.append(z);
        sbN.append(", performanceTracingLogsPath=");
        sbN.append(str3);
        sbN.append(")");
        return sbN.toString();
    }

    public ApplicationScopeConfiguration(String str, String str2, boolean z, String str3) {
        this.cachePath = str;
        this.settingsPath = str2;
        this.enablePerformanceTracing = z;
        this.performanceTracingLogsPath = str3;
    }

    public ApplicationScopeConfiguration() {
        this(null, null, false, null, 15, null);
    }
}
