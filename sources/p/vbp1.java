package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vbp1 {
    public String a;
    public Duration b;
    public double c;
    public int d;
    public rvg e;
    public boolean f;

    public final ifp1 a() {
        String str;
        Duration duration;
        int i;
        rvg rvgVar;
        if (this.f && (str = this.a) != null && (duration = this.b) != null && (i = this.d) != 0 && (rvgVar = this.e) != null) {
            return new ifp1(str, duration, this.c, i, rvgVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaId");
        }
        if (this.b == null) {
            sb.append(" mediaPlayoutPosition");
        }
        if (!this.f) {
            sb.append(" mediaPlayoutRate");
        }
        if (this.d == 0) {
            sb.append(" playbackState");
        }
        if (this.e == null) {
            sb.append(" coWatchingQueue");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final void b(rvg rvgVar) {
        if (rvgVar != null) {
            this.e = rvgVar;
        } else {
            bhn0.i("Null coWatchingQueue");
        }
    }

    public final void c(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bhn0.i("Null mediaId");
        }
    }

    public final void d(Duration duration) {
        if (duration != null) {
            this.b = duration;
        } else {
            bhn0.i("Null mediaPlayoutPosition");
        }
    }

    public final void e(double d) {
        this.c = d;
        this.f = true;
    }

    public final void f(int i) {
        if (i != 0) {
            this.d = i;
        } else {
            bhn0.i("Null playbackState");
        }
    }
}
