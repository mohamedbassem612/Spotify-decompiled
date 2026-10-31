package com.google.android.gms.internal.meet_coactivities;

import com.google.common.base.VerifyException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p.anm1;
import p.f4i1;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaol {
    private zzaol() {
    }

    public static Set zza(Map map) {
        Set setZzc = zzc(map, "nonFatalStatusCodes");
        if (setZzc == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(zzaaz.class));
        }
        anm1.Q(!setZzc.contains(zzaaz.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setZzc;
    }

    public static Set zzb(Map map) {
        Set setZzc = zzc(map, "retryableStatusCodes");
        anm1.Q(setZzc != null, "%s is required in retry policy", "retryableStatusCodes");
        anm1.Q(true ^ setZzc.contains(zzaaz.OK), "%s must not contain OK", "retryableStatusCodes");
        return setZzc;
    }

    private static Set zzc(Map map, String str) {
        zzaaz zzaazVarZza;
        List listZzg = zzaiw.zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(zzaaz.class);
        for (Object obj : listZzg) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                anm1.Q(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                zzaazVarZza = zzabe.zzb(iIntValue).zza();
                anm1.Q(zzaazVarZza.zza() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException(gvg.h("Can not convert status code ", String.valueOf(obj), " to Status.Code, because its type is ", String.valueOf(obj.getClass())));
                }
                try {
                    zzaazVarZza = (zzaaz) Enum.valueOf(zzaaz.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException(f4i1.f("Status code ", String.valueOf(obj), " is not valid"), e);
                }
            }
            enumSetNoneOf.add(zzaazVarZza);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
