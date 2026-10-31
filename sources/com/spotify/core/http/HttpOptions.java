package com.spotify.core.http;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/spotify/core/http/HttpOptions;", "", "timeout", "", "connectTimeout", "isFollowRedirects", "", "priority", "", "cachePolicy", "skipCacheStorage", "<init>", "(JJZIIZ)V", "getTimeout", "()J", "getConnectTimeout", "()Z", "getPriority", "()I", "getCachePolicy", "getSkipCacheStorage", "Companion", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class HttpOptions {
    public static final int CACHE_POLICY_CACHE_ONLY = 4;
    public static final int CACHE_POLICY_DEFAULT = 0;
    public static final int CACHE_POLICY_FORCE_CACHE = 3;
    public static final int CACHE_POLICY_FORCE_NETWORK = 1;
    public static final int CACHE_POLICY_REVALIDATE = 2;
    public static final int PRIORITY_BACKGROUND = 0;
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_NORMAL = 2;
    private final int cachePolicy;
    private final long connectTimeout;
    private final boolean isFollowRedirects;
    private final int priority;
    private final boolean skipCacheStorage;
    private final long timeout;

    public /* synthetic */ HttpOptions(long j, long j2, boolean z, int i, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, z, (i3 & 8) != 0 ? 2 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z2);
    }

    public final int getCachePolicy() {
        return this.cachePolicy;
    }

    public final long getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final boolean getSkipCacheStorage() {
        return this.skipCacheStorage;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: isFollowRedirects, reason: from getter */
    public final boolean getIsFollowRedirects() {
        return this.isFollowRedirects;
    }

    public HttpOptions(long j, long j2, boolean z, int i, int i2, boolean z2) {
        this.timeout = j;
        this.connectTimeout = j2;
        this.isFollowRedirects = z;
        this.priority = i;
        this.cachePolicy = i2;
        this.skipCacheStorage = z2;
    }
}
