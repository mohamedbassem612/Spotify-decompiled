package com.google.android.gms.internal.meet_coactivities;

import com.google.android.gms.internal.meet_coactivities.zzqz;
import com.google.android.gms.internal.meet_coactivities.zzra;
import java.io.IOException;
import p.bhn0;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zzra<MessageType extends zzra<MessageType, BuilderType>, BuilderType extends zzqz<MessageType, BuilderType>> implements zzuf {
    protected int zza = 0;

    public int zzv(zzur zzurVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuf
    public final zzrr zzw() {
        try {
            int iZzz = zzz();
            zzrr zzrrVar = zzrr.zzb;
            byte[] bArr = new byte[iZzz];
            zzrz zzrzVar = new zzrz(bArr, 0, iZzz);
            zzS(zzrzVar);
            return zzrn.zza(zzrzVar, bArr);
        } catch (IOException e) {
            bhn0.o(f4i1.f("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzuf
    public final byte[] zzx() {
        try {
            int iZzz = zzz();
            byte[] bArr = new byte[iZzz];
            zzrz zzrzVar = new zzrz(bArr, 0, iZzz);
            zzS(zzrzVar);
            zzrzVar.zzC();
            return bArr;
        } catch (IOException e) {
            bhn0.o(f4i1.f("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
