package com.google.android.gms.internal.meet_coactivities;

import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzahh extends zzale {
    private boolean zzb;
    private final zzabe zzc;
    private final zzaev zzd;
    private final zzwr[] zze;

    public zzahh(zzabe zzabeVar, zzaev zzaevVar, zzwr[] zzwrVarArr) {
        dm5.n(!zzabeVar.zzj(), "error must not be OK");
        this.zzc = zzabeVar;
        this.zzd = zzaevVar;
        this.zze = zzwrVarArr;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzale, com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zza(zzaia zzaiaVar) {
        zzaiaVar.zzb("error", this.zzc);
        zzaiaVar.zzb("progress", this.zzd);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzale, com.google.android.gms.internal.meet_coactivities.zzaeu
    public final void zzl(zzaew zzaewVar) {
        dm5.z(!this.zzb, "already started");
        this.zzb = true;
        int i = 0;
        while (true) {
            zzwr[] zzwrVarArr = this.zze;
            if (i >= zzwrVarArr.length) {
                zzaewVar.zzd(this.zzc, this.zzd, new zzzw());
                return;
            } else {
                zzwr zzwrVar = zzwrVarArr[i];
                i++;
            }
        }
    }
}
