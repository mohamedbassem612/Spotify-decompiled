package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class spw implements ixx {
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ spw(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public static spw d(long j) {
        long j2 = j + 59000;
        long j3 = j2 / 86400000;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long hours = (j2 / 3600000) - timeUnit.toHours(j3);
        return new spw(j3, hours, ((j2 / 60000) - timeUnit.toMinutes(j3)) - TimeUnit.HOURS.toMinutes(hours));
    }

    public static spw e(long j) {
        return d(j * 1000);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }
}
