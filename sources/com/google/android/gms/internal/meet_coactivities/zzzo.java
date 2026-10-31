package com.google.android.gms.internal.meet_coactivities;

import p.dm5;
import p.one;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzzo extends zzzr {
    private final zzzp zza;

    public /* synthetic */ zzzo(String str, boolean z, zzzp zzzpVar, zzzn zzznVar) {
        super(str, false, zzzpVar, null);
        dm5.p(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        dm5.s(zzzpVar, "marshaller");
        this.zza = zzzpVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzr
    public final Object zza(byte[] bArr) {
        return this.zza.zza(new String(bArr, one.a));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzr
    public final byte[] zzb(Object obj) {
        String strZzb = this.zza.zzb(obj);
        dm5.s(strZzb, "null marshaller.toAsciiString()");
        return strZzb.getBytes(one.a);
    }
}
