package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import p.cwl1;
import p.dm5;
import p.rl1;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaky {
    static final zzwc zza = zzwc.zza("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long zzb;
    final Boolean zzc;
    final Integer zzd;
    final Integer zze;
    final zzant zzf;
    final zzahy zzg;

    public zzaky(Map map, boolean z, int i, int i2) {
        long j;
        zzant zzantVar;
        zzahy zzahyVar;
        this.zzb = zzaiw.zzd(map, "timeout");
        this.zzc = zzaiw.zza(map, "waitForReady");
        Integer numZzc = zzaiw.zzc(map, "maxResponseMessageBytes");
        this.zzd = numZzc;
        if (numZzc != null) {
            dm5.o(numZzc.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numZzc);
        }
        Integer numZzc2 = zzaiw.zzc(map, "maxRequestMessageBytes");
        this.zze = numZzc2;
        if (numZzc2 != null) {
            dm5.o(numZzc2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numZzc2);
        }
        Map mapZzj = z ? zzaiw.zzj(map, "retryPolicy") : null;
        if (mapZzj == null) {
            j = 0;
            zzantVar = null;
        } else {
            Integer numZzc3 = zzaiw.zzc(mapZzj, "maxAttempts");
            dm5.s(numZzc3, "maxAttempts cannot be empty");
            int iIntValue = numZzc3.intValue();
            dm5.l("maxAttempts must be greater than 1: %s", iIntValue, iIntValue >= 2);
            int iMin = Math.min(iIntValue, 5);
            Long lZzd = zzaiw.zzd(mapZzj, "initialBackoff");
            dm5.s(lZzd, "initialBackoff cannot be empty");
            long jLongValue = lZzd.longValue();
            dm5.j(jLongValue, "initialBackoffNanos must be greater than 0: %s", jLongValue > 0);
            Long lZzd2 = zzaiw.zzd(mapZzj, "maxBackoff");
            dm5.s(lZzd2, "maxBackoff cannot be empty");
            long jLongValue2 = lZzd2.longValue();
            dm5.j(jLongValue2, "maxBackoff must be greater than 0: %s", jLongValue2 > 0);
            Double dZzb = zzaiw.zzb(mapZzj, "backoffMultiplier");
            dm5.s(dZzb, "backoffMultiplier cannot be empty");
            double dDoubleValue = dZzb.doubleValue();
            j = 0;
            dm5.o(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dZzb);
            Long lZzd3 = zzaiw.zzd(mapZzj, "perAttemptRecvTimeout");
            dm5.o(lZzd3 == null || lZzd3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lZzd3);
            Set setZzb = zzaol.zzb(mapZzj);
            dm5.n((lZzd3 == null && setZzb.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            zzantVar = new zzant(iMin, jLongValue, jLongValue2, dDoubleValue, lZzd3, setZzb);
        }
        this.zzf = zzantVar;
        Map mapZzj2 = z ? zzaiw.zzj(map, "hedgingPolicy") : null;
        if (mapZzj2 == null) {
            zzahyVar = null;
        } else {
            Integer numZzc4 = zzaiw.zzc(mapZzj2, "maxAttempts");
            dm5.s(numZzc4, "maxAttempts cannot be empty");
            int iIntValue2 = numZzc4.intValue();
            dm5.l("maxAttempts must be greater than 1: %s", iIntValue2, iIntValue2 >= 2);
            int iMin2 = Math.min(iIntValue2, 5);
            Long lZzd4 = zzaiw.zzd(mapZzj2, "hedgingDelay");
            dm5.s(lZzd4, "hedgingDelay cannot be empty");
            long jLongValue3 = lZzd4.longValue();
            dm5.j(jLongValue3, "hedgingDelay must not be negative: %s", jLongValue3 >= j);
            zzahyVar = new zzahy(iMin2, jLongValue3, zzaol.zza(mapZzj2));
        }
        this.zzg = zzahyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaky)) {
            return false;
        }
        zzaky zzakyVar = (zzaky) obj;
        return zno1.k(this.zzb, zzakyVar.zzb) && zno1.k(this.zzc, zzakyVar.zzc) && zno1.k(this.zzd, zzakyVar.zzd) && zno1.k(this.zze, zzakyVar.zze) && zno1.k(this.zzf, zzakyVar.zzf) && zno1.k(this.zzg, zzakyVar.zzg);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg});
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zzb, "timeoutNanos");
        rl1VarR0.m(this.zzc, "waitForReady");
        rl1VarR0.m(this.zzd, "maxInboundMessageSize");
        rl1VarR0.m(this.zze, "maxOutboundMessageSize");
        rl1VarR0.m(this.zzf, "retryPolicy");
        rl1VarR0.m(this.zzg, "hedgingPolicy");
        return rl1VarR0.toString();
    }
}
