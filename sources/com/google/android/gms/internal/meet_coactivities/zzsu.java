package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzsu extends zzrc {
    private final zzsz zza;

    public zzsu(zzsz zzszVar) {
        this.zza = zzszVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.meet_coactivities.zztj */
    @Override // com.google.android.gms.internal.meet_coactivities.zzum
    public final /* synthetic */ Object zzb(zzrx zzrxVar, zzsk zzskVar) throws zztj {
        int i = zzsz.zzd;
        zzsz zzszVarZzD = this.zza.zzD();
        try {
            zzur zzurVarZzb = zzun.zza().zzb(zzszVarZzD.getClass());
            zzurVarZzb.zzh(zzszVarZzD, zzry.zzq(zzrxVar), zzskVar);
            zzurVarZzb.zzf(zzszVarZzD);
            return zzszVarZzD;
        } catch (IOException e) {
            if (e.getCause() instanceof zztj) {
                throw e.getCause();
            }
            throw new zztj(e);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zztj) {
                throw e2.getCause();
            }
            throw e2;
        } catch (zzve e3) {
            throw e3.zza();
        } catch (zztj e4) {
            if (e4.zzk()) {
                throw new zztj(e4);
            }
            throw e4;
        }
    }
}
