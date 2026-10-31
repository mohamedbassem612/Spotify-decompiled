package com.google.android.gms.internal.meet_coactivities;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzql extends zzst implements zzug {
    public /* synthetic */ zzql(zzpw zzpwVar) {
        super(zzqq.zzb);
    }

    public final zzql zza(Map map) {
        zzo();
        zzqq.zzf((zzqq) ((zzst) this).zza).putAll(map);
        return this;
    }

    public final zzql zzb(zzqm zzqmVar) {
        zzo();
        ((zzqq) ((zzst) this).zza).zzh = zzqmVar.zza();
        return this;
    }

    public final zzql zzc(zzqj zzqjVar) {
        zzo();
        zzqq.zzh((zzqq) ((zzst) this).zza, (zzqk) zzqjVar.zzk());
        return this;
    }

    public final zzql zzd(zzqk zzqkVar) {
        zzo();
        zzqq.zzh((zzqq) ((zzst) this).zza, zzqkVar);
        return this;
    }

    private zzql() {
        throw null;
    }
}
