package com.spotify.core.http;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.u890;
import spotify.connectivity.http.proto.ConnectionMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0096 ¢\u0006\u0004\b\u0013\u0010\u0003J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\fH\u0096 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0003R\u001a\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010\u0003¨\u00060"}, d2 = {"Lcom/spotify/core/http/NativeHttpConnection;", "Lcom/spotify/core/http/HttpConnection;", "<init>", "()V", "Lcom/spotify/core/http/HttpRequest;", "request", "Lcom/spotify/core/http/HttpOptions;", "options", "Lp/rih1;", "send", "(Lcom/spotify/core/http/HttpRequest;Lcom/spotify/core/http/HttpOptions;)V", "abort", "", "isRequestStarted", "()Z", "Lcom/spotify/core/http/HttpResponse;", "response", "onHeaders", "(Lcom/spotify/core/http/HttpResponse;)V", "onRedirect", "", "error", "onError", "(I)V", "", "buffer", "length", "onBytesAvailable", "([BI)V", "Lspotify/connectivity/http/proto/ConnectionMetrics;", "metrics", "onMetrics", "(Lspotify/connectivity/http/proto/ConnectionMetrics;)V", "expectMetrics", "onComplete", "(Z)V", "Lcom/spotify/core/http/HttpConnectionDelegate;", "delegate", "Lcom/spotify/core/http/HttpConnectionDelegate;", "", "nThis", "J", "getNThis$annotations", "", "nativeLock", "Ljava/lang/Object;", "getNativeLock$annotations", "Companion", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class NativeHttpConnection implements HttpConnection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static HttpConnectionFactory sFactory;
    private final HttpConnectionDelegate delegate;
    private long nThis;
    private final Object nativeLock;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/core/http/NativeHttpConnection$Companion;", "", "<init>", "()V", "Lcom/spotify/core/http/HttpConnectionFactory;", "connectionFactory", "Lp/rih1;", "initialize", "(Lcom/spotify/core/http/HttpConnectionFactory;)V", "sFactory", "Lcom/spotify/core/http/HttpConnectionFactory;", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void initialize(HttpConnectionFactory connectionFactory) {
            NativeHttpConnection.sFactory = connectionFactory;
        }

        private Companion() {
        }
    }

    public NativeHttpConnection() {
        HttpConnectionFactory httpConnectionFactory = sFactory;
        if (httpConnectionFactory == null) {
            u890.C("sFactory");
            throw null;
        }
        this.delegate = httpConnectionFactory.createDelegate();
        this.nativeLock = new Object();
    }

    private static /* synthetic */ void getNThis$annotations() {
    }

    private static /* synthetic */ void getNativeLock$annotations() {
    }

    public static final void initialize(HttpConnectionFactory httpConnectionFactory) {
        INSTANCE.initialize(httpConnectionFactory);
    }

    @Override // com.spotify.core.http.HttpConnection
    public void abort() {
        this.delegate.abort();
    }

    @Override // com.spotify.core.http.HttpConnection
    public boolean isRequestStarted() {
        return this.delegate.isRequestStarted();
    }

    @Override // com.spotify.core.http.HttpConnection
    public native void onBytesAvailable(byte[] buffer, int length);

    @Override // com.spotify.core.http.HttpConnection
    public native void onComplete(boolean expectMetrics);

    @Override // com.spotify.core.http.HttpConnection
    public native void onError(int error);

    @Override // com.spotify.core.http.HttpConnection
    public native void onHeaders(HttpResponse response);

    @Override // com.spotify.core.http.HttpConnection
    public native void onMetrics(ConnectionMetrics metrics);

    @Override // com.spotify.core.http.HttpConnection
    public native void onRedirect();

    @Override // com.spotify.core.http.HttpConnection
    public void send(HttpRequest request, HttpOptions options) {
        this.delegate.send(this, request, options);
    }
}
