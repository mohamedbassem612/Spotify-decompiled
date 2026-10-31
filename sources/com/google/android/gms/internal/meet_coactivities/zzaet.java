package com.google.android.gms.internal.meet_coactivities;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.cwl1;
import p.dm5;
import p.l5u;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaet extends zzwj {
    private static final Logger zza = Logger.getLogger(zzaet.class.getName());
    private static final double zzb;
    private final zzaac zzc;
    private final Executor zzd;
    private final boolean zze;
    private final zzaek zzf;
    private final zzxf zzg;
    private zzaen zzh;
    private final boolean zzi;
    private zzwe zzj;
    private zzaeu zzk;
    private boolean zzl;
    private boolean zzm;
    private final ScheduledExecutorService zzn;
    private zzxm zzo = zzxm.zza();
    private final zzaji zzp;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        zzb = 1.0E9d;
    }

    public zzaet(zzaac zzaacVar, Executor executor, zzwe zzweVar, zzaji zzajiVar, ScheduledExecutorService scheduledExecutorService, zzaek zzaekVar, zzyf zzyfVar) {
        int i = zzwx.zza;
        this.zzc = zzaacVar;
        zzaacVar.zzf();
        System.identityHashCode(this);
        int i2 = zzaqa.zza;
        if (executor == l5u.a) {
            this.zzd = new zzaob();
            this.zze = true;
        } else {
            this.zzd = new zzaoi(executor);
            this.zze = false;
        }
        this.zzf = zzaekVar;
        this.zzg = zzxf.zzb();
        this.zzi = zzaacVar.zzb() == zzaaa.UNARY || zzaacVar.zzb() == zzaaa.SERVER_STREAMING;
        this.zzj = zzweVar;
        this.zzp = zzajiVar;
        this.zzn = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzxj zzq() {
        zzxj zzxjVarZzi = this.zzj.zzi();
        if (zzxjVarZzi == null) {
            return null;
        }
        return zzxjVarZzi;
    }

    private final void zzr(Object obj) {
        dm5.z(this.zzk != null, "Not started");
        dm5.z(!this.zzl, "call was cancelled");
        dm5.z(!this.zzm, "call was half-closed");
        try {
            zzaeu zzaeuVar = this.zzk;
            if (zzaeuVar instanceof zzans) {
                ((zzans) zzaeuVar).zzaa(obj);
            } else {
                zzaeuVar.zzm(this.zzc.zzc(obj));
            }
            if (this.zzi) {
                return;
            }
            this.zzk.zzc();
        } catch (Error e) {
            this.zzk.zzb(zzabe.zzb.zze("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.zzk.zzb(zzabe.zzb.zzd(e2).zze("Failed to stream message"));
        }
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zzc, "method");
        return rl1VarR0.toString();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zza(String str, Throwable th) {
        int i = zzaqa.zza;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        try {
            if (this.zzk != null) {
                zzabe zzabeVar = zzabe.zzb;
                zzabe zzabeVarZze = str != null ? zzabeVar.zze(str) : zzabeVar.zze("Call cancelled without message");
                if (th != null) {
                    zzabeVarZze = zzabeVarZze.zzd(th);
                }
                this.zzk.zzb(zzabeVarZze);
            }
            if (this.zzh != null) {
            }
        } finally {
            zzaen zzaenVar = this.zzh;
            if (zzaenVar != null) {
                zzaenVar.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzb() {
        int i = zzaqa.zza;
        dm5.z(this.zzk != null, "Not started");
        dm5.z(!this.zzl, "call was cancelled");
        dm5.z(!this.zzm, "call already half-closed");
        this.zzm = true;
        this.zzk.zzd();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzc(int i) {
        int i2 = zzaqa.zza;
        dm5.z(this.zzk != null, "Not started");
        this.zzk.zzf(i);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zzd(Object obj) {
        int i = zzaqa.zza;
        zzr(obj);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzwj
    public final void zze(zzwi zzwiVar, zzzw zzzwVar) {
        zzaeu zzajgVar;
        int i = zzaqa.zza;
        dm5.z(this.zzk == null, "Already started");
        dm5.z(!this.zzl, "call was cancelled");
        dm5.s(zzwiVar, "observer");
        dm5.s(zzzwVar, "headers");
        zzwe zzweVar = this.zzj;
        zzwc zzwcVar = zzaky.zza;
        zzaky zzakyVar = (zzaky) zzweVar.zzl(zzwcVar);
        if (zzakyVar != null) {
            Long l = zzakyVar.zzb;
            if (l != null) {
                zzxj zzxjVarZzc = zzxj.zzc(l.longValue(), TimeUnit.NANOSECONDS);
                zzxj zzxjVarZzi = this.zzj.zzi();
                if (zzxjVarZzi == null || zzxjVarZzc.compareTo(zzxjVarZzi) < 0) {
                    this.zzj = this.zzj.zza(zzxjVarZzc);
                }
            }
            Boolean bool = zzakyVar.zzc;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                zzwe zzweVar2 = this.zzj;
                this.zzj = zBooleanValue ? zzweVar2.zzg() : zzweVar2.zzh();
            }
            if (zzakyVar.zzd != null) {
                Integer numZzj = this.zzj.zzj();
                zzwe zzweVar3 = this.zzj;
                Integer num = zzakyVar.zzd;
                if (numZzj != null) {
                    this.zzj = zzweVar3.zzc(Math.min(numZzj.intValue(), num.intValue()));
                } else {
                    this.zzj = zzweVar3.zzc(num.intValue());
                }
            }
            if (zzakyVar.zze != null) {
                Integer numZzk = this.zzj.zzk();
                zzwe zzweVar4 = this.zzj;
                Integer num2 = zzakyVar.zze;
                if (numZzk != null) {
                    this.zzj = zzweVar4.zzd(Math.min(numZzk.intValue(), num2.intValue()));
                } else {
                    this.zzj = zzweVar4.zzd(num2.intValue());
                }
            }
        }
        zzwv zzwvVar = zzwu.zza;
        zzxm zzxmVar = this.zzo;
        zzzwVar.zzd(zzahx.zzf);
        zzzwVar.zzd(zzahx.zzb);
        zzzr zzzrVar = zzahx.zzc;
        zzzwVar.zzd(zzzrVar);
        byte[] bArrZza = zzyh.zza(zzxmVar);
        if (bArrZza.length != 0) {
            zzzwVar.zzf(zzzrVar, bArrZza);
        }
        zzzwVar.zzd(zzahx.zzd);
        zzzwVar.zzd(zzahx.zze);
        zzxj zzxjVarZzq = zzq();
        boolean z = zzxjVarZzq != null && zzxjVarZzq.equals(null);
        zzaen zzaenVar = new zzaen(this, zzxjVarZzq, z);
        this.zzh = zzaenVar;
        if (zzxjVarZzq == null || zzaenVar.zzd > 0) {
            zzaji zzajiVar = this.zzp;
            zzaac zzaacVar = this.zzc;
            zzwe zzweVar5 = this.zzj;
            zzxf zzxfVar = this.zzg;
            if (zzajiVar.zzb.zzad) {
                zzaky zzakyVar2 = (zzaky) zzweVar5.zzl(zzwcVar);
                zzajgVar = new zzajg(zzajiVar, zzaacVar, zzzwVar, zzweVar5, zzakyVar2 == null ? null : zzakyVar2.zzf, zzakyVar2 != null ? zzakyVar2.zzg : null, zzxfVar);
            } else {
                zzwr[] zzwrVarArrZzh = zzahx.zzh(zzweVar5, zzzwVar, 0, false);
                zzxf zzxfVarZza = zzxfVar.zza();
                try {
                    zzaeu zzaeuVarZzd = zzajiVar.zzb.zzL.zzd(zzaacVar, zzzwVar, zzweVar5, zzwrVarArrZzh);
                    zzxfVar.zze(zzxfVarZza);
                    zzajgVar = zzaeuVarZzd;
                } catch (Throwable th) {
                    zzxfVar.zze(zzxfVarZza);
                    throw th;
                }
            }
            this.zzk = zzajgVar;
        } else {
            zzwr[] zzwrVarArrZzh2 = zzahx.zzh(this.zzj, zzzwVar, 0, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l2 = (Long) this.zzj.zzl(zzwr.zza);
            double d = this.zzh.zzd;
            double d2 = zzb;
            zzajgVar = new zzahh(zzabe.zzd.zze(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), zzaev.PROCESSED, zzwrVarArrZzh2);
            this.zzk = zzajgVar;
        }
        if (this.zze) {
            zzajgVar.zze();
        }
        if (this.zzj.zzj() != null) {
            this.zzk.zzj(this.zzj.zzj().intValue());
        }
        if (this.zzj.zzk() != null) {
            this.zzk.zzk(this.zzj.zzk().intValue());
        }
        if (zzxjVarZzq != null) {
            this.zzk.zzh(zzxjVarZzq);
        }
        this.zzk.zzg(zzwvVar);
        this.zzk.zzi(this.zzo);
        this.zzf.zzb();
        this.zzk.zzl(new zzaes(this, zzwiVar));
        this.zzh.zzc();
    }

    public final zzaet zzm(zzxm zzxmVar) {
        this.zzo = zzxmVar;
        return this;
    }
}
