package p;

import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u7a0 extends m7o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicLong f45p = new AtomicLong(0);

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        Objects.requireNonNull(str, "The hostname cannot be null.");
        Objects.requireNonNull(set, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(date, "The pin expiration date cannot be null.");
        if (m7o.n.matcher(str).matches()) {
            hhg1.n(f4i1.f("Hostname ", str, " is illegal. A hostname should not consist of digits and/or dots only."));
            return null;
        }
        if (str.length() > 255) {
            hhg1.n(f4i1.f("Hostname ", str, " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
            return null;
        }
        try {
            IDN.toASCII(str, 2);
            HashMap map = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    hhg1.n("Public key pin is invalid");
                    return null;
                }
                map.put(Base64.encodeToString(bArr, 0), bArr);
            }
            this.d.add(new khc((byte) 3));
            return this;
        } catch (IllegalArgumentException unused) {
            hhg1.n(f4i1.f("Hostname ", str, " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
            return null;
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        if (str.contains("/")) {
            hhg1.n("Illegal QUIC Hint Host: ".concat(str));
            return null;
        }
        this.c.add(new lhc((byte) 3));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.f == null) {
            this.f = getDefaultUserAgent();
        }
        return new t7a0(this);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.j = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.m = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.e = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        this.l = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptions(ProxyOptions proxyOptions) {
        if (proxyOptions != null) {
            if (m0p1.v() < 38) {
                eg.f(gvg.e(m0p1.v(), "This should have not been created: the Cronet API being used has an ApiLevel of ", ", but setProxyOptions was added in ApiLevel 38"));
                return null;
            }
            if (proxyOptions.getProxyList().isEmpty()) {
                eg.f("The list of proxies should never be empty, this is checked in the API layer");
                return null;
            }
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.g = str;
            return this;
        }
        hhg1.n("Storage path must be set to existing directory");
        return null;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
