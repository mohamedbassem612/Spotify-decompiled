package com.google.android.gms.internal.meet_coactivities;

import android.os.Parcel;
import java.io.Closeable;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzadi implements Closeable {
    private Parcel zza;

    public zzadi(Parcel parcel) {
        this.zza = parcel;
    }

    public static zzadi zzc() {
        return new zzadi(Parcel.obtain());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.zza;
        if (parcel != null) {
            parcel.recycle();
            this.zza = null;
        }
    }

    public final Parcel zza() {
        dm5.z(this.zza != null, "get() after close()/release()");
        return this.zza;
    }

    public final Parcel zzb() {
        Parcel parcelZza = zza();
        this.zza = null;
        return parcelZza;
    }
}
