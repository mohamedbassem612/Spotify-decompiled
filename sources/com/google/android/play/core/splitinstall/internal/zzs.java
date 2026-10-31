package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p.sqb1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zzs {
    protected final zzu zza;
    private final IntentFilter zzc;
    private final Context zzd;
    protected final Set zzb = new HashSet();
    private zzr zze = null;
    private volatile boolean zzf = false;

    public zzs(zzu zzuVar, IntentFilter intentFilter, Context context) {
        this.zza = zzuVar;
        this.zzc = intentFilter;
        this.zzd = zzbr.zza(context);
    }

    private final void zzf() {
        zzr zzrVar;
        if ((this.zzf || !this.zzb.isEmpty()) && this.zze == null) {
            zzr zzrVar2 = new zzr(this, null);
            this.zze = zzrVar2;
            int i = Build.VERSION.SDK_INT;
            Context context = this.zzd;
            if (i >= 33) {
                context.registerReceiver(zzrVar2, this.zzc, 2);
            } else {
                context.registerReceiver(zzrVar2, this.zzc);
            }
        }
        if (this.zzf || !this.zzb.isEmpty() || (zzrVar = this.zze) == null) {
            return;
        }
        this.zzd.unregisterReceiver(zzrVar);
        this.zze = null;
    }

    public abstract void zza(Context context, Intent intent);

    public final synchronized void zzb(sqb1 sqb1Var) {
        this.zza.zzd("registerListener", new Object[0]);
        zzbv.zza(sqb1Var, "Registered Play Core listener should not be null.");
        this.zzb.add(sqb1Var);
        zzf();
    }

    public final synchronized void zzc(boolean z) {
        this.zzf = true;
        zzf();
    }

    public final synchronized void zzd(sqb1 sqb1Var) {
        this.zza.zzd("unregisterListener", new Object[0]);
        zzbv.zza(sqb1Var, "Unregistered Play Core listener should not be null.");
        this.zzb.remove(sqb1Var);
        zzf();
    }

    public final synchronized void zze(Object obj) {
        Iterator it = new HashSet(this.zzb).iterator();
        while (it.hasNext()) {
            ((sqb1) it.next()).onStateUpdate(obj);
        }
    }
}
