package com.google.android.gms.internal.meet_coactivities;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzvj extends zzvl {
    public zzvj(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(((zzvl) this).zza.getLong(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(((zzvl) this).zza.getInt(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzvm.zzb) {
            zzvm.zzi(obj, j, z);
        } else {
            zzvm.zzj(obj, j, z);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzvm.zzb) {
            zzvm.zzk(obj, j, b);
        } else {
            zzvm.zzl(obj, j, b);
        }
    }

    public final void zze(Object obj, long j, double d) {
        ((zzvl) this).zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        ((zzvl) this).zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzg(Object obj, long j) {
        return zzvm.zzb ? zzvm.zzt(obj, j) : zzvm.zzu(obj, j);
    }
}
