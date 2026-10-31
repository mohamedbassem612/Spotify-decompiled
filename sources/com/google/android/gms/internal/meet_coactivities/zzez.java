package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import p.s02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
final class zzez implements zzce {
    final /* synthetic */ zzfa zza;

    public /* synthetic */ zzez(zzfa zzfaVar, zzey zzeyVar) {
        this.zza = zzfaVar;
    }

    private final void zzg(s02 s02Var) {
        ((zzil) this.zza.zzs.get()).zzd().d(s02Var);
        this.zza.zzq.forEach(new zzet());
        this.zza.zzq.clear();
        if (this.zza.zzg.isPresent()) {
            this.zza.zzah();
        }
        if (this.zza.zzf.isPresent()) {
            this.zza.zzag();
        }
        this.zza.zzai();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzce
    public final void zza(zzr zzrVar) {
        this.zza.zzp.execute(new zzev(this, zzrVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzce
    public final void zzb(zzl zzlVar) {
        this.zza.zzp.execute(new zzes(this, zzlVar));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzce
    public final void zzc(zzn zznVar) {
        if (zznVar.zzd().isEmpty()) {
            ((zzkv) zzfa.zzd.zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "handleParticipantMetadataSetUpdate", 1105, "AddonClientImpl.java")).zzo("Participant metadata set is empty. Not updating delegate.");
        } else {
            this.zza.zzp.execute(new zzer(this, zznVar));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzce
    public final void zzd(List list, List list2) {
        zzfa zzfaVar = this.zza;
        Stream stream = list.stream();
        zzkl zzklVar = zzfaVar.zzl;
        Objects.requireNonNull(zzklVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            zzam zzamVarZzb = zzacVar.zzb();
            arrayList.add(zzkl.zzc(zzamVarZzb));
            ((zzkv) zzfa.zzd.zzc().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "handlePrivilegeUpdate", 1227, "AddonClientImpl.java")).zzs("Privilege %s is now revoked due to these reasons: %s.", zzamVarZzb, zzacVar.zzc());
        }
        ((zzil) this.zza.zzs.get()).zzd().getClass();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzce
    public final void zze(zzpy zzpyVar) {
        this.zza.zzp.execute(new zzeu(this, zzpyVar));
    }

    public final /* synthetic */ void zzf(zzl zzlVar) {
        ((zzkv) zzfa.zzd.zzb().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "lambda$handleMeetingStateUpdate$3", 1156, "AddonClientImpl.java")).zzp("Received updated Meeting State : %s", zzlVar.zzd());
        if (!this.zza.zzak()) {
            ((zzkv) zzfa.zzd.zze().zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "lambda$handleMeetingStateUpdate$3", 1162, "AddonClientImpl.java")).zzo("Received a meeting state update while disconnected");
            return;
        }
        try {
            this.zza.zzA = zzjw.zzb(zzlVar);
        } catch (AssertionError e) {
            ((zzkv) ((zzkv) zzfa.zzd.zzd().zzg(e)).zzh("com/google/android/meet/addons/internal/AddonClientImpl$LiveSharingIpcHandler", "lambda$handleMeetingStateUpdate$3", 1170, "AddonClientImpl.java")).zzo("Invalid meeting info proto.");
        }
        int iOrdinal = zzlVar.zzd().ordinal();
        if (iOrdinal == 4) {
            zzg(s02.a);
            return;
        }
        if (iOrdinal == 7) {
            zzg(s02.b);
        } else if (iOrdinal == 8) {
            zzg(s02.c);
        } else {
            if (iOrdinal != 9) {
                return;
            }
            zzg(s02.d);
        }
    }
}
