package p;

import android.os.Bundle;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xko0 extends wko0 {
    public final Instant a;
    public final Long b;
    public final Duration c;
    public final boolean d;
    public final int e;

    public xko0(Instant instant, Long l, Duration duration, boolean z, int i) {
        boolean z2 = false;
        o0c.m(((instant != null ? 1 : 0) + (l != null ? 1 : 0)) + (duration != null ? 1 : 0) == 1, "Exactly one of zeroTime, zeroElapsedRealtime, or pausedDuration must be present; received %s,%s,%s", new Object[]{instant, l, duration});
        if (i >= 1 && i <= 2) {
            z2 = true;
        }
        o0c.m(z2, "Invalid format: %s", new Object[]{Integer.valueOf(i)});
        this.a = instant;
        this.b = l;
        this.c = duration;
        this.d = z;
        this.e = i;
    }

    @Override // p.wko0
    public final void a(Bundle bundle) {
        Instant instant = this.a;
        if (instant != null) {
            bundle.putLong("zeroTime", instant.toEpochMilli());
        } else {
            Long l = this.b;
            if (l != null) {
                bundle.putLong("zeroElapsedRealtime", l.longValue());
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    bundle.putLong("pausedDuration", duration.toMillis());
                }
            }
        }
        bundle.putBoolean("countDown", this.d);
        bundle.putInt("format", this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xko0)) {
            return false;
        }
        xko0 xko0Var = (xko0) obj;
        if (this == xko0Var) {
            return true;
        }
        return Objects.equals(this.a, xko0Var.a) && Objects.equals(this.b, xko0Var.b) && Objects.equals(this.c, xko0Var.c) && this.d == xko0Var.d && this.e == xko0Var.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeDifference{");
        Instant instant = this.a;
        if (instant != null) {
            sb.append("mZeroTime=");
            sb.append(instant);
        } else {
            Long l = this.b;
            if (l != null) {
                sb.append("mZeroElapsedRealtime=");
                sb.append(l);
            } else {
                Duration duration = this.c;
                if (duration != null) {
                    sb.append("mPausedDuration=");
                    sb.append(duration);
                }
            }
        }
        sb.append(", mCountDown=");
        sb.append(this.d);
        sb.append(", mFormat=");
        return gvg.j(sb, this.e, "}");
    }
}
