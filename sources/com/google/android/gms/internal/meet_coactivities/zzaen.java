package com.google.android.gms.internal.meet_coactivities;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p.l5u;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaen implements Runnable, zzxc {
    final /* synthetic */ zzaet zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private volatile ScheduledFuture zze;
    private volatile boolean zzf;

    public zzaen(zzaet zzaetVar, zzxj zzxjVar, boolean z) {
        long jZzb;
        this.zza = zzaetVar;
        this.zzb = z;
        if (zzxjVar == null) {
            this.zzc = false;
            jZzb = 0;
        } else {
            this.zzc = true;
            jZzb = zzxjVar.zzb(TimeUnit.NANOSECONDS);
        }
        this.zzd = jZzb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzk.zzb(zzb());
    }

    public final zzabe zzb() {
        long jAbs = Math.abs(this.zzd) / 1000000000;
        long jAbs2 = Math.abs(this.zzd) % 1000000000;
        StringBuilder sb = new StringBuilder(true != this.zzb ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (this.zzd < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        Long l = (Long) this.zza.zzj.zzl(zzwr.zza);
        sb.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(l == null ? 0.0d : l.longValue() / zzaet.zzb)));
        if (this.zza.zzk != null) {
            zzaia zzaiaVar = new zzaia();
            this.zza.zzk.zza(zzaiaVar);
            sb.append(" ");
            sb.append(zzaiaVar);
        }
        return zzabe.zzd.zze(sb.toString());
    }

    public final void zzc() {
        if (this.zzf) {
            return;
        }
        if (this.zzc && !this.zzb) {
            zzaet zzaetVar = this.zza;
            if (zzaetVar.zzn != null) {
                this.zze = zzaetVar.zzn.schedule(new zzaix(this), this.zzd, TimeUnit.NANOSECONDS);
            }
        }
        this.zza.zzg.zzd(this, l5u.a);
        if (this.zzf) {
            zzd();
        }
    }

    public final void zzd() {
        this.zzf = true;
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
