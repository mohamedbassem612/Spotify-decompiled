package com.google.android.gms.internal.meet_coactivities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.dm5;
import p.jhc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaoa extends zzaam {
    private final boolean zza;
    private final zzaee zzb;

    public zzaoa(boolean z, int i, int i2, zzaee zzaeeVar) {
        this.zza = z;
        dm5.s(zzaeeVar, "autoLoadBalancerFactory");
        this.zzb = zzaeeVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaam
    public final zzaah zza(Map map) {
        Object objZzd;
        zzanr zzanrVar;
        zzalb zzalbVar;
        Map mapZzj;
        try {
            zzaah zzaahVarZzc = this.zzb.zzc(map);
            zzaky zzakyVar = null;
            if (zzaahVarZzc == null) {
                objZzd = null;
            } else {
                if (zzaahVarZzc.zzc() != null) {
                    return zzaah.zzb(zzaahVarZzc.zzc());
                }
                objZzd = zzaahVarZzc.zzd();
            }
            boolean z = this.zza;
            if (!z || map == null || (mapZzj = zzaiw.zzj(map, "retryThrottling")) == null) {
                zzanrVar = null;
            } else {
                float fFloatValue = zzaiw.zzb(mapZzj, "maxTokens").floatValue();
                float fFloatValue2 = zzaiw.zzb(mapZzj, "tokenRatio").floatValue();
                dm5.z(fFloatValue > 0.0f, "maxToken should be greater than zero");
                dm5.z(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                zzanrVar = new zzanr(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapZzj2 = map == null ? null : zzaiw.zzj(map, "healthCheckConfig");
            List<Map> listZzh = zzaiw.zzh(map, "methodConfig");
            if (listZzh == null) {
                zzalbVar = new zzalb(null, map2, map3, zzanrVar, objZzd, mapZzj2);
            } else {
                for (Map map4 : listZzh) {
                    zzaky zzakyVar2 = new zzaky(map4, z, 5, 5);
                    List<Map> listZzh2 = zzaiw.zzh(map4, "name");
                    if (listZzh2 != null && !listZzh2.isEmpty()) {
                        for (Map map5 : listZzh2) {
                            String strZze = zzaiw.zze(map5, "service");
                            String strZze2 = zzaiw.zze(map5, "method");
                            if (jhc1.F(strZze)) {
                                dm5.o(jhc1.F(strZze2), "missing service name for method %s", strZze2);
                                dm5.o(zzakyVar == null, "Duplicate default method config in service config %s", map);
                                zzakyVar = zzakyVar2;
                            } else if (jhc1.F(strZze2)) {
                                dm5.o(!map3.containsKey(strZze), "Duplicate service %s", strZze);
                                map3.put(strZze, zzakyVar2);
                            } else {
                                String strZze3 = zzaac.zze(strZze, strZze2);
                                dm5.o(!map2.containsKey(strZze3), "Duplicate method name %s", strZze3);
                                map2.put(strZze3, zzakyVar2);
                            }
                        }
                    }
                }
                zzalbVar = new zzalb(zzakyVar, map2, map3, zzanrVar, objZzd, mapZzj2);
            }
            return zzaah.zza(zzalbVar);
        } catch (RuntimeException e) {
            return zzaah.zzb(zzabe.zzc.zze("failed to parse service config").zzd(e));
        }
    }
}
