package io.reactivex.rxjava3.schedulers;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p.td6;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Timed<T> {
    public final Object a;
    public final long b;
    public final TimeUnit c;

    public Timed(Object obj, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(obj, "value is null");
        this.a = obj;
        this.b = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (Objects.equals(this.a, timed.a) && this.b == timed.b && Objects.equals(this.c, timed.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.b);
        sb.append(", unit=");
        sb.append(this.c);
        sb.append(", value=");
        return td6.l(sb, this.a, "]");
    }
}
