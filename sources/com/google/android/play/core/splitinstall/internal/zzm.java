package com.google.android.play.core.splitinstall.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzm {
    public static final /* synthetic */ int zza = 0;
    private static final ClassLoader zzb = zzm.class.getClassLoader();

    private zzm() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(f4i1.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
