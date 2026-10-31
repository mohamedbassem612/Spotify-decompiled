package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.dm5;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaee {
    private final zzzi zza;
    private final String zzb;

    public zzaee(zzzi zzziVar, String str) {
        dm5.s(zzziVar, "registry");
        this.zza = zzziVar;
        this.zzb = "pick_first";
    }

    public static /* bridge */ /* synthetic */ zzzg zza(zzaee zzaeeVar, String str, String str2) throws zzaed {
        zzzg zzzgVarZza = zzaeeVar.zza.zza(str);
        if (zzzgVarZza != null) {
            return zzzgVarZza;
        }
        throw new zzaed(f4i1.f("Trying to load '", str, "' because using default policy, but it's unavailable"), null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public final zzaah zzc(Map map) {
        List<zzaoj> listUnmodifiableList;
        String strZze;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(zzaiw.zzh(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strZze = zzaiw.zze(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(Collections.singletonMap(strZze.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
                List<Map> listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 == null) {
                    listUnmodifiableList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            throw new RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + String.valueOf(map2));
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new zzaoj(str, zzaiw.zzj(map2, str)));
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                }
            } catch (RuntimeException e) {
                return zzaah.zzb(zzabe.zzc.zze("can't parse load balancer configuration").zzd(e));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        zzzi zzziVar = this.zza;
        ArrayList arrayList3 = new ArrayList();
        for (zzaoj zzaojVar : listUnmodifiableList) {
            String strZza = zzaojVar.zza();
            zzzg zzzgVarZza = zzziVar.zza(strZza);
            if (zzzgVarZza != null) {
                if (!arrayList3.isEmpty()) {
                    Logger.getLogger(zzaol.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                zzaah zzaahVarZzc = zzzgVarZza.zzc(zzaojVar.zzb());
                return zzaahVarZzc.zzc() == null ? zzaah.zza(new zzaok(zzzgVarZza, zzaahVarZzc.zzd())) : zzaahVarZzc;
            }
            arrayList3.add(strZza);
        }
        return zzaah.zzb(zzabe.zzc.zze("None of " + arrayList3.toString() + " specified by Service Config are available."));
    }
}
