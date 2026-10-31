package com.google.android.gms.internal.meet_coactivities;

import java.util.concurrent.TimeUnit;
import p.dm5;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzahw implements zzzp {
    @Override // com.google.android.gms.internal.meet_coactivities.zzzp
    public final /* bridge */ /* synthetic */ Object zza(String str) {
        dm5.n(str.length() > 0, "empty timeout");
        dm5.n(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzp
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        Long l = (Long) obj;
        if (l.longValue() < 0) {
            hhg1.n("Timeout too small");
            return null;
        }
        if (l.longValue() < 100000000) {
            return String.valueOf(l).concat("n");
        }
        if (l.longValue() < 100000000000L) {
            return (l.longValue() / 1000) + "u";
        }
        if (l.longValue() < 100000000000000L) {
            return (l.longValue() / 1000000) + "m";
        }
        if (l.longValue() < 100000000000000000L) {
            return (l.longValue() / 1000000000) + "S";
        }
        if (l.longValue() < 6000000000000000000L) {
            return (l.longValue() / 60000000000L) + "M";
        }
        return (l.longValue() / 3600000000000L) + "H";
    }
}
