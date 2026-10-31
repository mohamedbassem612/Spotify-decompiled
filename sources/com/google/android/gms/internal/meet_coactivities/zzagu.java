package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class zzagu implements zzaeu {
    private volatile boolean zza;
    private zzaew zzb;
    private zzaeu zzc;
    private zzabe zzd;
    private zzagt zzf;
    private long zzg;
    private long zzh;
    private List zze = new ArrayList();
    private List zzi = new ArrayList();

    private final void zzo(Runnable runnable) {
        dm5.z(this.zzb != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.zza) {
                    runnable.run();
                } else {
                    this.zze.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzp() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.zze = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.zza = r0     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.meet_coactivities.zzagt r0 = r3.zzf     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.zzb()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L1d
            r3.zze = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.meet_coactivities.zzagu.zzp():void");
    }

    private final void zzu(zzaew zzaewVar) {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzi = null;
        this.zzc.zzl(zzaewVar);
    }

    private final void zzv(zzaeu zzaeuVar) {
        zzaeu zzaeuVar2 = this.zzc;
        dm5.A(zzaeuVar2 == null, "realStream already set to %s", zzaeuVar2);
        this.zzc = zzaeuVar;
        this.zzh = System.nanoTime();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public void zza(zzaia zzaiaVar) {
        synchronized (this) {
            try {
                if (this.zzb == null) {
                    return;
                }
                if (this.zzc != null) {
                    zzaiaVar.zzb("buffered_nanos", Long.valueOf(this.zzh - this.zzg));
                    this.zzc.zza(zzaiaVar);
                } else {
                    zzaiaVar.zzb("buffered_nanos", Long.valueOf(System.nanoTime() - this.zzg));
                    zzaiaVar.zza("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public void zzb(zzabe zzabeVar) {
        boolean z = false;
        dm5.z(this.zzb != null, "May only be called after start");
        dm5.s(zzabeVar, "reason");
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    zzv(zzale.zza);
                    this.zzd = zzabeVar;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzo(new zzagn(this, zzabeVar));
            return;
        }
        zzp();
        zzq(zzabeVar);
        this.zzb.zzd(zzabeVar, zzaev.PROCESSED, new zzzw());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzc() {
        dm5.z(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzc();
        } else {
            zzo(new zzagm(this));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzd() {
        dm5.z(this.zzb != null, "May only be called after start");
        zzo(new zzago(this));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zze() {
        dm5.z(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzage(this));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzf(int i) {
        dm5.z(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzf(i);
        } else {
            zzo(new zzagd(this, i));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzg(zzww zzwwVar) {
        dm5.z(this.zzb == null, "May only be called before start");
        dm5.s(zzwwVar, "compressor");
        this.zzi.add(new zzagf(this, zzwwVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzh(zzxj zzxjVar) {
        dm5.z(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzagj(this, zzxjVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzi(zzxm zzxmVar) {
        dm5.z(this.zzb == null, "May only be called before start");
        dm5.s(zzxmVar, "decompressorRegistry");
        this.zzi.add(new zzagg(this, zzxmVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzj(int i) {
        dm5.z(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzagh(this, i));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzk(int i) {
        dm5.z(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzagi(this, i));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzl(zzaew zzaewVar) {
        zzabe zzabeVar;
        boolean z;
        dm5.s(zzaewVar, "listener");
        dm5.z(this.zzb == null, "already started");
        synchronized (this) {
            try {
                zzabeVar = this.zzd;
                z = this.zza;
                if (!z) {
                    zzagt zzagtVar = new zzagt(zzaewVar);
                    this.zzf = zzagtVar;
                    zzaewVar = zzagtVar;
                }
                this.zzb = zzaewVar;
                this.zzg = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzabeVar != null) {
            zzaewVar.zzd(zzabeVar, zzaev.PROCESSED, new zzzw());
        } else if (z) {
            zzu(zzaewVar);
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final void zzm(InputStream inputStream) {
        dm5.z(this.zzb != null, "May only be called after start");
        dm5.s(inputStream, "message");
        if (this.zza) {
            this.zzc.zzm(inputStream);
        } else {
            zzo(new zzagl(this, inputStream));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaot
    public final boolean zzn() {
        if (this.zza) {
            return this.zzc.zzn();
        }
        return false;
    }

    public void zzq(zzabe zzabeVar) {
    }

    public final Runnable zzs(zzaeu zzaeuVar) {
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    return null;
                }
                dm5.s(zzaeuVar, "stream");
                zzv(zzaeuVar);
                zzaew zzaewVar = this.zzb;
                if (zzaewVar == null) {
                    this.zze = null;
                    this.zza = true;
                }
                if (zzaewVar == null) {
                    return null;
                }
                zzu(zzaewVar);
                return new zzagk(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
