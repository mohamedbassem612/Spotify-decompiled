package com.google.android.gms.internal.meet_coactivities;

import j$.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import p.cwl1;
import p.dm5;
import p.eq91;
import p.i0c1;
import p.nrz0;
import p.rvg;
import p.sks0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzhb extends zzhu implements zzif {
    private final nrz0 zze;
    private final zzkf zzf;

    public zzhb(zzhw zzhwVar) {
        super(zzhwVar);
        this.zzf = zzkf.zzc();
        sks0 sks0Var = new sks0();
        eq91 eq91Var = new eq91(sks0Var);
        eq91Var.f = 0L;
        synchronized (eq91Var.a()) {
            i0c1 i0c1Var = (i0c1) sks0Var.b;
            long jNanoTime = (i0c1Var.a ? System.nanoTime() - i0c1Var.b : 0L) / 1000;
            long j = eq91Var.f;
            if (jNanoTime > j) {
                eq91Var.c = Math.min(eq91Var.d, eq91Var.c + ((jNanoTime - j) / eq91Var.e));
                eq91Var.f = jNanoTime;
            }
            eq91Var.e = 1111111.111111111d;
            double d = eq91Var.d;
            eq91Var.d = 0.9d;
            if (d == Double.POSITIVE_INFINITY) {
                eq91Var.c = 0.9d;
            } else {
                double d2 = 0.0d;
                if (d != 0.0d) {
                    d2 = (eq91Var.c * 0.9d) / d;
                }
                eq91Var.c = d2;
            }
        }
        this.zze = eq91Var;
    }

    private final void zzg(String str, final String str2, final Duration duration, final Optional optional) {
        dm5.s(str, "Expected 'mediaTitle' to be provided.");
        dm5.s(str2, "Expected 'mediaId' to be provided.");
        dm5.s(duration, "Expected 'mediaPlayoutPosition' to be provided.");
        ((zzjq) this.zzc).zzj(str);
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgt
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                this.zza.zzb(str2, duration, optional, zzqjVar);
                return zzqjVar;
            }
        }, zzqm.SWITCH_MEDIA);
    }

    private final void zzh(final UnaryOperator unaryOperator, final zzqm zzqmVar) {
        dm5.A(Double.compare(((zzqk) ((zzqj) unaryOperator.apply((zzqj) ((zzqk) ((zzjq) this.zzc).zzg().zzb()).zzB())).zzk()).zza(), 2.0d) <= 0, "Playout rate cannot be set higher than %s.", Double.valueOf(2.0d));
        zze(new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzgy
            @Override // java.util.function.Supplier
            public final Object get() {
                zzjq zzjqVar = (zzjq) this.zza.zzc;
                final UnaryOperator unaryOperator2 = unaryOperator;
                return zzjqVar.zzb(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgu
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return (zzqk) ((zzqj) unaryOperator2.apply((zzqj) ((zzqk) obj).zzB())).zzk();
                    }
                }, zzqmVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifyBuffering(final Duration duration) {
        dm5.s(duration, "Expected 'mediaPlayoutPosition' to be provided.");
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgs
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                zzqjVar.zze(zzvu.zza(duration));
                zzqjVar.zzg(3);
                return zzqjVar;
            }
        }, zzqm.ALTER_PLAYBACK_STATE);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifyEnded(final Duration duration) {
        dm5.s(duration, "Expected 'mediaPlayoutPosition' to be provided.");
        zzf();
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgw
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                zzqjVar.zze(zzvu.zza(duration));
                zzqjVar.zzg(6);
                return zzqjVar;
            }
        }, zzqm.ALTER_PLAYBACK_STATE);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifyPauseState(final boolean z, final Duration duration) {
        dm5.s(duration, "Expected 'mediaPlayoutPosition' to be provided.");
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                zzqjVar.zzg(true != z ? 4 : 5);
                zzqjVar.zze(zzvu.zza(duration));
                return zzqjVar;
            }
        }, zzqm.ALTER_PLAYBACK_STATE);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifyPlayoutRate(final double d, Duration duration) {
        final zzsh zzshVarZza = zzvu.zza(duration);
        dm5.z(d > 0.0d, "Expected 'rate' to be a value greater than zero.");
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                zzqjVar.zzf(d);
                zzqjVar.zze(zzshVarZza);
                return zzqjVar;
            }
        }, zzqm.ALTER_SPEED);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifyQueueUpdate(final rvg rvgVar) {
        dm5.s(rvgVar, "Expected 'queue' to be provided.");
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgx
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                this.zza.zza(rvgVar, zzqjVar);
                return zzqjVar;
            }
        }, zzqm.ALTER_QUEUE);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifyReady(final Duration duration) {
        dm5.s(duration, "Expected 'mediaPlayoutPosition' to be provided.");
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgz
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                zzqjVar.zze(zzvu.zza(duration));
                zzqjVar.zzg(4);
                return zzqjVar;
            }
        }, zzqm.ALTER_PLAYBACK_STATE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [long] */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifySeekToTimestamp(final Duration duration) throws Throwable {
        boolean z;
        boolean z2;
        dm5.s(duration, "Expected 'mediaPlayoutPosition' to be provided.");
        nrz0 nrz0Var = this.zze;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        ?? Max = Math.max(0L, 0L);
        Object objA = nrz0Var.a();
        synchronized (objA) {
            try {
                try {
                    i0c1 i0c1Var = (i0c1) nrz0Var.a.b;
                    long jNanoTime = (i0c1Var.a ? System.nanoTime() - i0c1Var.b : 0L) / 1000;
                    if (((eq91) nrz0Var).f - Max <= jNanoTime) {
                        eq91 eq91Var = (eq91) nrz0Var;
                        long j = eq91Var.f;
                        if (jNanoTime > j) {
                            eq91Var.c = Math.min(eq91Var.d, eq91Var.c + ((jNanoTime - j) / eq91Var.e));
                            eq91Var.f = jNanoTime;
                            j = jNanoTime;
                        }
                        double dMin = Math.min(1.0d, eq91Var.c);
                        eq91Var.f = cwl1.f0(eq91Var.f, (long) ((1.0d - dMin) * eq91Var.e));
                        eq91Var.c -= dMin;
                        long jMax = Math.max(j - jNanoTime, 0L);
                        if (jMax > 0) {
                            try {
                                long nanos = timeUnit.toNanos(jMax);
                                long jNanoTime2 = System.nanoTime() + nanos;
                                z2 = false;
                                while (true) {
                                    try {
                                        try {
                                            TimeUnit.NANOSECONDS.sleep(nanos);
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            z2 = true;
                                            if (z2) {
                                                Thread.currentThread().interrupt();
                                            }
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        nanos = jNanoTime2 - System.nanoTime();
                                        z2 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                        throw th;
                                    }
                                }
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z2 = false;
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Max = objA;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        dm5.A(z, "Number of seeks per second cannot exceed %s.", Double.valueOf(0.9d));
        zzh(new UnaryOperator() { // from class: com.google.android.gms.internal.meet_coactivities.zzgp
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzqj zzqjVar = (zzqj) obj;
                zzqjVar.zze(zzvu.zza(duration));
                return zzqjVar;
            }
        }, zzqm.ALTER_POSITION);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif, p.pvg
    public final void notifySwitchedToMedia(String str, String str2, Duration duration, rvg rvgVar) {
        dm5.s(rvgVar, "Expected 'queue' to be provided.");
        zzg(str, str2, duration, Optional.of(rvgVar));
    }

    public final /* synthetic */ zzqj zza(rvg rvgVar, zzqj zzqjVar) {
        zzqjVar.zzc(this.zzf.zzd(rvgVar));
        zzqjVar.zze(((zzjq) this.zzc).zzd());
        return zzqjVar;
    }

    public final /* synthetic */ zzqj zzb(String str, Duration duration, Optional optional, final zzqj zzqjVar) {
        zzqjVar.zzd(str);
        zzqjVar.zze(zzvu.zza(duration));
        zzqjVar.zzg(4);
        final zzkf zzkfVar = this.zzf;
        Objects.requireNonNull(zzkfVar);
        optional.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzha
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return zzkfVar.zzd((rvg) obj);
            }
        }).ifPresent(new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzgq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzqjVar.zzc((zzqi) obj);
            }
        });
        return zzqjVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzif
    public final void notifySwitchedToMedia(String str, String str2, Duration duration) {
        zzg(str, str2, duration, Optional.empty());
    }
}
