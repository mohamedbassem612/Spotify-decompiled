package org.chromium.net;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p.a8o;
import p.bhn0;
import p.e8o;
import p.eo41;
import p.gvg;
import p.hhg1;
import p.jah;
import p.k1e;
import p.k220;
import p.k7o;
import p.x7o;
import p.xto1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    @Deprecated
    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(String str, boolean z, int i) {
    }

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = "CronetEngine.Builder";
        protected final ICronetEngineBuilder mBuilderDelegate;
        private final List<k7o> mExperimentalOptionsPatches;
        protected JSONObject mParsedExperimentalOptions;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mExperimentalOptionsPatches = new ArrayList();
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        public static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                hhg1.n("The input values cannot be null");
                return 0;
            }
            String[] strArrSplit = str.split("\\.");
            String[] strArrSplit2 = str2.split("\\.");
            for (int i = 0; i < strArrSplit.length && i < strArrSplit2.length; i++) {
                try {
                    int i2 = Integer.parseInt(strArrSplit[i]);
                    int i3 = Integer.parseInt(strArrSplit2[i]);
                    if (i2 != i3) {
                        return Integer.signum(i2 - i3);
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(gvg.h("Unable to convert version segments into integers: ", strArrSplit[i], " & ", strArrSplit2[i]), e);
                }
            }
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            eo41.a("CronetEngine#createBuilderDelegate");
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                e8o e8oVar = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviderInfos(context))).get(0);
                xto1 xto1VarW = a8o.w(context, e8oVar.b);
                x7o x7oVar = new x7o();
                try {
                    x7oVar.e = Boolean.FALSE;
                    x7oVar.b = 1;
                    x7oVar.d = e8oVar.b;
                    x7oVar.h = Process.myUid();
                    x7oVar.f = new k1e(ApiVersion.getCronetVersion());
                    if (Log.isLoggable(TAG, 3)) {
                        String.format("Using '%s' provider for creating CronetEngine.Builder.", e8oVar.a);
                    }
                    ICronetEngineBuilder iCronetEngineBuilder = e8oVar.a.createBuilder().mBuilderDelegate;
                    String implCronetVersion = getImplCronetVersion(iCronetEngineBuilder);
                    if (implCronetVersion != null) {
                        x7oVar.g = new k1e(implCronetVersion);
                    }
                    x7oVar.a = iCronetEngineBuilder.getLogCronetInitializationRef();
                    x7oVar.e = Boolean.TRUE;
                    x7oVar.c = (int) (SystemClock.uptimeMillis() - jUptimeMillis);
                    xto1VarW.A(x7oVar);
                    Trace.endSection();
                    return iCronetEngineBuilder;
                } catch (Throwable th) {
                    x7oVar.c = (int) (SystemClock.uptimeMillis() - jUptimeMillis);
                    xto1VarW.A(x7oVar);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public static List<e8o> getEnabledCronetProviders(Context context, List<e8o> list) {
            if (list.isEmpty()) {
                jah.g("Unable to find any Cronet provider. Have you included all necessary jars?");
                return null;
            }
            Iterator<e8o> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().a.isEnabled()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                jah.g("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
                return null;
            }
            Collections.sort(list, new a());
            return list;
        }

        private static int getImplApiLevel(ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getApiLevel");
                if (implVersionMethod == null) {
                    return -1;
                }
                return ((Integer) implVersionMethod.invoke(null, null)).intValue();
            } catch (ReflectiveOperationException e) {
                bhn0.o("Failed to retrieve Cronet impl API level", e);
                return 0;
            }
        }

        private static String getImplCronetVersion(ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getCronetVersion");
                if (implVersionMethod == null) {
                    return null;
                }
                return (String) implVersionMethod.invoke(null, null);
            } catch (ReflectiveOperationException e) {
                bhn0.o("Failed to retrieve Cronet impl version", e);
                return null;
            }
        }

        private static Method getImplVersionMethod(ICronetEngineBuilder iCronetEngineBuilder, String str) {
            try {
                return iCronetEngineBuilder.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(str, null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        }

        private int getMaximumApiLevel() {
            return ApiVersion.getMaximumAvailableApiLevel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$setConnectionMigrationOptions$2(ConnectionMigrationOptions connectionMigrationOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectA = b.a("QUIC", jSONObject);
            if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                jSONObjectA.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
            }
            if (connectionMigrationOptions.getAllowServerMigration() != null) {
                jSONObjectA.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
            }
            if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                jSONObjectA.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
            }
            if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                jSONObjectA.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
            }
            if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                jSONObjectA.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
            }
            if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                jSONObjectA.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
            }
            if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                jSONObjectA.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                jSONObjectA.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                jSONObjectA.put("allow_port_migration", zBooleanValue);
                if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                    boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        hhg1.n("Unable to turn on non-default network usage without path degradation migration!");
                    } else if (!zBooleanValue || !zBooleanValue2) {
                        jSONObjectA.put("migrate_sessions_early_v2", false);
                    } else {
                        jSONObjectA.put("migrate_sessions_early_v2", true);
                        jSONObjectA.put("migrate_sessions_on_network_change_v2", true);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$setDnsOptions$1(DnsOptions dnsOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectA = b.a("AsyncDNS", jSONObject);
            if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                jSONObjectA.put("enable", dnsOptions.getUseBuiltInDnsResolver());
            }
            JSONObject jSONObjectA2 = b.a("StaleDNS", jSONObject);
            if (dnsOptions.getEnableStaleDns() != null) {
                jSONObjectA2.put("enable", dnsOptions.getEnableStaleDns());
            }
            if (dnsOptions.getPersistHostCache() != null) {
                jSONObjectA2.put("persist_to_disk", dnsOptions.getPersistHostCache());
            }
            if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                jSONObjectA2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
            }
            if (dnsOptions.getStaleDnsOptions() != null) {
                DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                    jSONObjectA2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                }
                if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                    jSONObjectA2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                }
                if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                    jSONObjectA2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                }
                if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                    jSONObjectA2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                }
            }
            JSONObject jSONObjectA3 = b.a("QUIC", jSONObject);
            if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                jSONObjectA3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$setQuicOptions$0(QuicOptions quicOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectA = b.a("QUIC", jSONObject);
            if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                Set<String> quicHostAllowlist = quicOptions.getQuicHostAllowlist();
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = quicHostAllowlist.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectA.put("host_whitelist", sb.toString());
            }
            if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                Set<String> enabledQuicVersions = quicOptions.getEnabledQuicVersions();
                StringBuilder sb2 = new StringBuilder();
                Iterator<T> it2 = enabledQuicVersions.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectA.put("quic_version", sb2.toString());
            }
            if (!quicOptions.getConnectionOptions().isEmpty()) {
                Set<String> connectionOptions = quicOptions.getConnectionOptions();
                StringBuilder sb3 = new StringBuilder();
                Iterator<T> it3 = connectionOptions.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            sb3.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectA.put("connection_options", sb3.toString());
            }
            if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                Set<String> clientConnectionOptions = quicOptions.getClientConnectionOptions();
                StringBuilder sb4 = new StringBuilder();
                Iterator<T> it4 = clientConnectionOptions.iterator();
                if (it4.hasNext()) {
                    while (true) {
                        sb4.append((CharSequence) it4.next());
                        if (!it4.hasNext()) {
                            break;
                        } else {
                            sb4.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectA.put("client_connection_options", sb4.toString());
            }
            if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                Set<String> extraQuicheFlags = quicOptions.getExtraQuicheFlags();
                StringBuilder sb5 = new StringBuilder();
                Iterator<T> it5 = extraQuicheFlags.iterator();
                if (it5.hasNext()) {
                    while (true) {
                        sb5.append((CharSequence) it5.next());
                        if (!it5.hasNext()) {
                            break;
                        } else {
                            sb5.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectA.put("set_quic_flags", sb5.toString());
            }
            if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                jSONObjectA.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
            }
            if (quicOptions.getHandshakeUserAgent() != null) {
                jSONObjectA.put("user_agent_id", quicOptions.getHandshakeUserAgent());
            }
            if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                jSONObjectA.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
            }
            if (quicOptions.getEnableTlsZeroRtt() != null) {
                jSONObjectA.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
            }
            if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                jSONObjectA.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
            }
            if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                jSONObjectA.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
            }
            if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                jSONObjectA.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
            }
            if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                jSONObjectA.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
            }
            if (quicOptions.getCloseSessionsOnIpChange() != null) {
                jSONObjectA.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
            }
            if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                jSONObjectA.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
            }
            if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                jSONObjectA.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
            }
            if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                jSONObjectA.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
            }
            if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                jSONObjectA.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
            }
        }

        private void maybeSetExperimentalOptions() {
            JSONObject jSONObject = this.mParsedExperimentalOptions;
            List<k7o> list = this.mExperimentalOptionsPatches;
            if (jSONObject == null && list.isEmpty()) {
                jSONObject = null;
            } else {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                for (k7o k7oVar : list) {
                    try {
                        switch (k7oVar.a) {
                            case 0:
                                lambda$setQuicOptions$0((QuicOptions) k7oVar.b, jSONObject);
                                break;
                            case 1:
                                lambda$setConnectionMigrationOptions$2((ConnectionMigrationOptions) k7oVar.b, jSONObject);
                                break;
                            default:
                                lambda$setDnsOptions$1((DnsOptions) k7oVar.b, jSONObject);
                                break;
                        }
                    } catch (JSONException e) {
                        k220.p("Unable to apply JSON patch!", e);
                        return;
                    }
                }
            }
            if (jSONObject != null) {
                this.mBuilderDelegate.setExperimentalOptions(jSONObject.toString());
            }
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        public Builder addQuicHint(String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public CronetEngine build() {
            return buildExperimental();
        }

        public ExperimentalCronetEngine buildExperimental() {
            if (getImplApiLevel(this.mBuilderDelegate) != -1) {
                getMaximumApiLevel();
            }
            maybeSetExperimentalOptions();
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
            return this;
        }

        public Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new k7o(connectionMigrationOptions, (byte) 1));
            return this;
        }

        public Builder setDnsOptions(DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new k7o(dnsOptions, (byte) 2));
            return this;
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setProxyOptions(ProxyOptions proxyOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(4)) {
                this.mBuilderDelegate.setProxyOptions(proxyOptions);
                return this;
            }
            hhg1.h("This Cronet implementation does not support ProxyOptions");
            return null;
        }

        public Builder setQuicOptions(QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new k7o(quicOptions, (byte) 0));
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        @Deprecated
        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        public Builder setDnsOptions(DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        public Builder setQuicOptions(QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }
    }
}
