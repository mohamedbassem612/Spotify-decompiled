package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import java.util.Optional;
import java.util.function.Supplier;
import p.n8d0;
import p.t380;
import p.txg;
import p.v311;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zzcf {
    private static Optional zza = Optional.empty();

    public static synchronized zzcf zze(Context context, Supplier supplier, zzby zzbyVar) {
        try {
            if (!zza.isPresent()) {
                zza = Optional.of(new zzda(context, (zzce) supplier.get(), zzbyVar));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzcf) zza.get();
    }

    public abstract zzg zzd();

    public abstract n8d0 zzf(zzp zzpVar, t380 t380Var);

    public abstract void zzg(zzpy zzpyVar);

    public abstract void zzh(v311 v311Var);

    public abstract void zzi();

    public abstract void zzj(txg txgVar);

    public abstract void zzk(zzrr zzrrVar);

    public abstract n8d0 zzl(int i);

    public abstract void zzm(Context context, int i, zzj zzjVar);
}
