package com.google.android.gms.internal.meet_coactivities;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import p.cfa0;
import p.dm5;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzxm {
    static final cfa0 zza = new cfa0(String.valueOf(','));
    private static final zzxm zzb = new zzxm(zzwu.zza, false, new zzxm(new zzwt(), true, new zzxm()));
    private final Map zzc;
    private final byte[] zzd;

    private zzxm(zzxk zzxkVar, boolean z, zzxm zzxmVar) {
        String strZza = zzxkVar.zza();
        dm5.n(!strZza.contains(","), "Comma is currently not allowed in message encoding");
        int size = zzxmVar.zzc.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zzxmVar.zzc.containsKey(zzxkVar.zza()) ? size : size + 1);
        for (zzxl zzxlVar : zzxmVar.zzc.values()) {
            String strZza2 = zzxlVar.zza.zza();
            if (!strZza2.equals(strZza)) {
                linkedHashMap.put(strZza2, new zzxl(zzxlVar.zza, zzxlVar.zzb));
            }
        }
        linkedHashMap.put(strZza, new zzxl(zzxkVar, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.zzc = mapUnmodifiableMap;
        cfa0 cfa0Var = zza;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((zzxl) entry.getValue()).zzb) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.zzd = cfa0Var.c(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public static zzxm zza() {
        return zzb;
    }

    public final byte[] zzb() {
        return this.zzd;
    }

    private zzxm() {
        this.zzc = new LinkedHashMap(0);
        this.zzd = new byte[0];
    }
}
