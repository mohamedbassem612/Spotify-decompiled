package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p.cwl1;
import p.dm5;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class zzaft extends zzwj {
    private static final zzwj zza;
    private final ScheduledFuture zzb;
    private final Executor zzc;
    private final zzxf zzd;
    private volatile boolean zze;
    private zzwi zzf;
    private zzwj zzg;
    private zzabe zzh;
    private List zzi = new ArrayList();
    private zzafs zzj;

    static {
        Logger.getLogger(zzaft.class.getName());
        zza = new zzafm();
    }

    public zzaft(Executor executor, ScheduledExecutorService scheduledExecutorService, zzxj zzxjVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        dm5.s(executor, "callExecutor");
        this.zzc = executor;
        dm5.s(scheduledExecutorService, "scheduler");
        this.zzd = zzxf.zzb();
        if (zzxjVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jZzb = zzxjVar.zzb(timeUnit);
            long jAbs = Math.abs(jZzb) / 1000000000;
            long jAbs2 = Math.abs(jZzb) % 1000000000;
            StringBuilder sb = new StringBuilder();
            if (jZzb < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new zzaff(this, sb), jZzb, timeUnit);
        }
        this.zzb = scheduledFutureSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzabe zzabeVar, boolean z) {
        zzwi zzwiVar;
        boolean z2;
        synchronized (this) {
            try {
                if (this.zzg == null) {
                    zzo(zza);
                    zzwiVar = this.zzf;
                    this.zzh = zzabeVar;
                    z2 = false;
                } else {
                    if (z) {
                        return;
                    }
                    zzwiVar = null;
                    z2 = true;
                }
                if (z2) {
                    zzm(new zzafi(this, zzabeVar));
                } else {
                    if (zzwiVar != null) {
                        this.zzc.execute(new zzafn(this, zzwiVar, zzabeVar));
                    }
                    zzn();
                }
                zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzm(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zze) {
                    runnable.run();
                } else {
                    this.zzi.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzn() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zzi     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.zzi = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.zze = r0     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.meet_coactivities.zzafs r0 = r3.zzj     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.zzc
            com.google.android.gms.internal.meet_coactivities.zzafg r2 = new com.google.android.gms.internal.meet_coactivities.zzafg
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.zzi     // Catch: java.lang.Throwable -> L24
            r3.zzi = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.meet_coactivities.zzaft.zzn():void");
    }

    private final void zzo(zzwj zzwjVar) {
        zzwj zzwjVar2 = this.zzg;
        dm5.A(zzwjVar2 == null, "realCall already set to %s", zzwjVar2);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzg = zzwjVar;
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zzg, "realCall");
        return rl1VarR0.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zza(String str, Throwable th) {
        zzabe zzabeVar = zzabe.zzb;
        zzabe zzabeVarZze = str != null ? zzabeVar.zze(str) : zzabeVar.zze("Call cancelled without message");
        if (th != null) {
            zzabeVarZze = zzabeVarZze.zzd(th);
        }
        zzl(zzabeVarZze, false);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzb() {
        zzm(new zzafl(this));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzc(int i) {
        if (this.zze) {
            this.zzg.zzc(i);
        } else {
            zzm(new zzafk(this, i));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzd(Object obj) {
        if (this.zze) {
            this.zzg.zzd(obj);
        } else {
            zzm(new zzafj(this, obj));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zze(zzwi zzwiVar, zzzw zzzwVar) {
        zzabe zzabeVar;
        boolean z;
        dm5.z(this.zzf == null, "already started");
        synchronized (this) {
            try {
                dm5.s(zzwiVar, "listener");
                this.zzf = zzwiVar;
                zzabeVar = this.zzh;
                z = this.zze;
                if (!z) {
                    zzafs zzafsVar = new zzafs(zzwiVar);
                    this.zzj = zzafsVar;
                    zzwiVar = zzafsVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzabeVar != null) {
            this.zzc.execute(new zzafn(this, zzwiVar, zzabeVar));
        } else if (z) {
            this.zzg.zze(zzwiVar, zzzwVar);
        } else {
            zzm(new zzafh(this, zzwiVar, zzzwVar));
        }
    }

    public final Runnable zzh(zzwj zzwjVar) {
        synchronized (this) {
            try {
                if (this.zzg != null) {
                    return null;
                }
                dm5.s(zzwjVar, "call");
                zzo(zzwjVar);
                return new zzafe(this, this.zzd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzk() {
    }
}
