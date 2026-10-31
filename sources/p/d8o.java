package p;

import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d8o extends RequestFinishedInfo.Metrics {
    public final long a = -1;
    public final long b = -1;
    public final long c = -1;
    public final long d = -1;
    public final long e = -1;
    public final long f = -1;
    public final long g = -1;
    public final long h = -1;
    public final long i = -1;
    public final long j = -1;
    public final long k = -1;
    public final long l = -1;
    public final long m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f8p = -1L;
    public final Long q = -1L;
    public final Long n = null;
    public final Long o = null;

    public static Date a(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return a(this.e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return a(this.d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return a(this.c);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return a(this.b);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return a(this.k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return a(this.j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.q;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return a(this.m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return a(this.a);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return a(this.l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return a(this.i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return a(this.h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.f8p;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return false;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return a(this.g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return a(this.f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        return this.o;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        return this.n;
    }
}
