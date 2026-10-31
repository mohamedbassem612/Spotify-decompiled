package p;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import j$.time.Duration;
import j$.util.DateRetargetClass;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tk4 extends ICronetEngineBuilder {
    public static boolean b;
    public static boolean c;
    public final HttpEngine.Builder a;

    public tk4(HttpEngine.Builder builder) {
        this.a = builder;
    }

    public static int a(int i) {
        String str;
        int iC = l1d.C(i);
        if (iC == 0) {
            return 0;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 2;
        }
        if (i == 1) {
            str = "UNSET";
        } else if (i != 2) {
            str = i != 3 ? "null" : "FALSE";
        } else {
            str = "TRUE";
        }
        eg.f("Invalid OptionalBoolean value: ".concat(str));
        return 0;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        w74.d(this.a, str, set, z, DateRetargetClass.toInstant(date));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.a.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        return new vk4(this.a.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.a.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.a.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.a.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!c) {
            c = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.a.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.a.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.a.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        gr00 gr00Var = new gr00(str);
        HttpEngine.Builder builder = this.a;
        ConnectionMigrationOptions.Builder builder2 = new ConnectionMigrationOptions.Builder();
        builder2.setDefaultNetworkMigration(a(jup0.b((Boolean) gr00Var.b("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class))));
        builder2.setPathDegradationMigration(a(jup0.b((Boolean) gr00Var.b("QUIC", "allow_port_migration", null, Boolean.class))));
        int iB = jup0.b((Boolean) gr00Var.b("QUIC", "migrate_sessions_early_v2", null, Boolean.class));
        builder2.setAllowNonDefaultNetworkUsage(a(iB));
        if (iB == 2) {
            builder2.setPathDegradationMigration(a(2));
        }
        builder.setConnectionMigrationOptions(builder2.build());
        HttpEngine.Builder builder3 = this.a;
        DnsOptions.StaleDnsOptions.Builder builder4 = new DnsOptions.StaleDnsOptions.Builder();
        int iIntValue = ((Integer) gr00Var.b("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
        if (iIntValue != -1) {
            w74.c(builder4, Duration.ofMillis(iIntValue));
        }
        int iIntValue2 = ((Integer) gr00Var.b("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
        if (iIntValue2 != -1) {
            w74.h(builder4, Duration.ofMillis(iIntValue2));
        }
        builder4.setAllowCrossNetworkUsage(a(jup0.b((Boolean) gr00Var.b("StaleDNS", "allow_other_network", null, Boolean.class)))).setUseStaleOnNameNotResolved(a(jup0.b((Boolean) gr00Var.b("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class))));
        DnsOptions.Builder builder5 = new DnsOptions.Builder();
        builder5.setUseHttpStackDnsResolver(a(jup0.b((Boolean) gr00Var.b("AsyncDNS", "enable", null, Boolean.class)))).setStaleDns(a(jup0.b((Boolean) gr00Var.b("StaleDNS", "enable", null, Boolean.class)))).setStaleDnsOptions(builder4.build()).setPreestablishConnectionsToStaleDnsResults(a(jup0.b((Boolean) gr00Var.b("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(a(jup0.b((Boolean) gr00Var.b("StaleDNS", "persist_to_disk", null, Boolean.class))));
        int iIntValue3 = ((Integer) gr00Var.b("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
        if (iIntValue3 != -1) {
            w74.b(builder5, Duration.ofMillis(iIntValue3));
        }
        builder3.setDnsOptions(builder5.build());
        HttpEngine.Builder builder6 = this.a;
        QuicOptions.Builder builder7 = new QuicOptions.Builder();
        if (((String) gr00Var.b("QUIC", "host_whitelist", null, String.class)) != null) {
            for (String str2 : ((String) gr00Var.b("QUIC", "host_whitelist", null, String.class)).split(",")) {
                builder7.addAllowedQuicHost(str2);
            }
        }
        int iIntValue4 = ((Integer) gr00Var.b("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
        if (iIntValue4 != -1) {
            builder7.setInMemoryServerConfigsCacheSize(iIntValue4);
        }
        String str3 = (String) gr00Var.b("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder7.setHandshakeUserAgent(str3);
        }
        int iIntValue5 = ((Integer) gr00Var.b("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
        if (iIntValue5 != -1) {
            w74.e(builder7, Duration.ofSeconds(iIntValue5));
        }
        builder6.setQuicOptions(builder7.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!b) {
            b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.a.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.a.setUserAgent(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
